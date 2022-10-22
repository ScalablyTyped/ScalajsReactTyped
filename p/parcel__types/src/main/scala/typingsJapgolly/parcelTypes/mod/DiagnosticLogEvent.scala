package typingsJapgolly.parcelTypes.mod

import typingsJapgolly.parcelDiagnostic.mod.Diagnostic
import typingsJapgolly.parcelTypes.parcelTypesStrings.error
import typingsJapgolly.parcelTypes.parcelTypesStrings.info
import typingsJapgolly.parcelTypes.parcelTypesStrings.log
import typingsJapgolly.parcelTypes.parcelTypesStrings.verbose
import typingsJapgolly.parcelTypes.parcelTypesStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagnosticLogEvent
  extends StObject
     with LogEvent {
  
  val diagnostics: js.Array[Diagnostic]
  
  val level: error | warn | info | verbose
  
  val `type`: log
}
object DiagnosticLogEvent {
  
  inline def apply(diagnostics: js.Array[Diagnostic], level: error | warn | info | verbose): DiagnosticLogEvent = {
    val __obj = js.Dynamic.literal(diagnostics = diagnostics.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("log")
    __obj.asInstanceOf[DiagnosticLogEvent]
  }
  
  extension [Self <: DiagnosticLogEvent](x: Self) {
    
    inline def setDiagnostics(value: js.Array[Diagnostic]): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticsVarargs(value: Diagnostic*): Self = StObject.set(x, "diagnostics", js.Array(value*))
    
    inline def setLevel(value: error | warn | info | verbose): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setType(value: log): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
