package typingsJapgolly.angularLocalize

import typingsJapgolly.angularLocalize.anon.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolsSrcDiagnosticsMod {
  
  @JSImport("@angular/localize/tools/src/diagnostics", "Diagnostics")
  @js.native
  open class Diagnostics () extends StObject {
    
    def add(`type`: DiagnosticHandlingStrategy, message: String): Unit = js.native
    
    def error(message: String): Unit = js.native
    
    def formatDiagnostics(message: String): String = js.native
    
    def hasErrors: Boolean = js.native
    
    def merge(other: Diagnostics): Unit = js.native
    
    val messages: js.Array[Message] = js.native
    
    def warn(message: String): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.angularLocalize.angularLocalizeStrings.error
    - typingsJapgolly.angularLocalize.angularLocalizeStrings.warning
    - typingsJapgolly.angularLocalize.angularLocalizeStrings.ignore
  */
  trait DiagnosticHandlingStrategy extends StObject
  object DiagnosticHandlingStrategy {
    
    inline def error: typingsJapgolly.angularLocalize.angularLocalizeStrings.error = "error".asInstanceOf[typingsJapgolly.angularLocalize.angularLocalizeStrings.error]
    
    inline def ignore: typingsJapgolly.angularLocalize.angularLocalizeStrings.ignore = "ignore".asInstanceOf[typingsJapgolly.angularLocalize.angularLocalizeStrings.ignore]
    
    inline def warning: typingsJapgolly.angularLocalize.angularLocalizeStrings.warning = "warning".asInstanceOf[typingsJapgolly.angularLocalize.angularLocalizeStrings.warning]
  }
}
