;;;; isun-API.asd

(asdf:defsystem #:isun-api
  :description "Describe isun-API here"
  :author "iSun"
  :license "Specify license here"
  :depends-on (#:drakma
               #:wookie
               #:cl-dbi)
  :serial t
  :components ((:file "package")
               (:file "isun-api")))

