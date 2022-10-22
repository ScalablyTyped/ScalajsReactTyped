package typingsJapgolly.parcelTypes.mod

import typingsJapgolly.parcelDiagnostic.mod.Diagnostic
import typingsJapgolly.parcelTypes.parcelTypesStrings.error
import typingsJapgolly.parcelTypes.parcelTypesStrings.info
import typingsJapgolly.parcelTypes.parcelTypesStrings.verbose
import typingsJapgolly.parcelTypes.parcelTypesStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.parcelTypes.mod.ProgressLogEvent
  - typingsJapgolly.parcelTypes.mod.DiagnosticLogEvent
  - typingsJapgolly.parcelTypes.mod.TextLogEvent
*/
trait LogEvent
  extends StObject
     with ReporterEvent
object LogEvent {
  
  inline def DiagnosticLogEvent(diagnostics: js.Array[Diagnostic], level: error | warn | info | verbose): typingsJapgolly.parcelTypes.mod.DiagnosticLogEvent = {
    val __obj = js.Dynamic.literal(diagnostics = diagnostics.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("log")
    __obj.asInstanceOf[typingsJapgolly.parcelTypes.mod.DiagnosticLogEvent]
  }
  
  inline def ProgressLogEvent(message: String): typingsJapgolly.parcelTypes.mod.ProgressLogEvent = {
    val __obj = js.Dynamic.literal(level = "progress", message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("log")
    __obj.asInstanceOf[typingsJapgolly.parcelTypes.mod.ProgressLogEvent]
  }
  
  inline def TextLogEvent(message: String): typingsJapgolly.parcelTypes.mod.TextLogEvent = {
    val __obj = js.Dynamic.literal(level = "success", message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("log")
    __obj.asInstanceOf[typingsJapgolly.parcelTypes.mod.TextLogEvent]
  }
}
