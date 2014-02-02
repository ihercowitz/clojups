(ns ups-info.core)

;"Semantic Program Enhancement Logic"
(defmacro spel [name start end]
  `(def ~(symbol name)
     (fn [arg#]
       (-> (.substring arg# ~start ~end)
           (Integer/parseInt 16)))))
