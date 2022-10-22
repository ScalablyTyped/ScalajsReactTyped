package typingsJapgolly.yaml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLogMod {
  
  @JSImport("yaml/dist/log", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def debug(logLevel: LogLevelId, messages: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(scala.List(logLevel.asInstanceOf[js.Any]).`++`(messages.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  inline def warn(logLevel: LogLevelId, warning: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warn")(logLevel.asInstanceOf[js.Any], warning.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def warn(logLevel: LogLevelId, warning: js.Error): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warn")(logLevel.asInstanceOf[js.Any], warning.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.yaml.yamlStrings.silent
    - typingsJapgolly.yaml.yamlStrings.error
    - typingsJapgolly.yaml.yamlStrings.warn
    - typingsJapgolly.yaml.yamlStrings.debug
  */
  trait LogLevelId extends StObject
  object LogLevelId {
    
    inline def debug: typingsJapgolly.yaml.yamlStrings.debug = "debug".asInstanceOf[typingsJapgolly.yaml.yamlStrings.debug]
    
    inline def error: typingsJapgolly.yaml.yamlStrings.error = "error".asInstanceOf[typingsJapgolly.yaml.yamlStrings.error]
    
    inline def silent: typingsJapgolly.yaml.yamlStrings.silent = "silent".asInstanceOf[typingsJapgolly.yaml.yamlStrings.silent]
    
    inline def warn: typingsJapgolly.yaml.yamlStrings.warn = "warn".asInstanceOf[typingsJapgolly.yaml.yamlStrings.warn]
  }
}
