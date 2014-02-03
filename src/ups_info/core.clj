(ns ups-info.core)

;"Semantic Program Enhancement Logic"
(defn spel [name start end]
  (eval
   `(defn ~(symbol name) [arg#]
      (-> (.substring arg# ~start ~end)
          (Integer/parseInt 16)))))


(defn startup []
  (let [ups-info (load-file "config/upsmap.conf")]
    (doseq [{:keys [method start end]} ups-info]
       (spel method start end))))

