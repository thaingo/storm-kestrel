(defproject storm/storm-kestrel "0.5.1-SNAPSHOT"
  :java-source-path "src/jvm"
  :javac-options {:debug "true" :fork "true"}
  :dependencies []
  :dev-dependencies [[storm "0.5.0"]]
  :jvm-opts ["-Djava.library.path=/usr/local/lib:/opt/local/lib:/usr/lib"]
)
