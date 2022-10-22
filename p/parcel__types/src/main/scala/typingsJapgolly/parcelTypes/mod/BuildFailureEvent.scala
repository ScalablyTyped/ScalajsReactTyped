package typingsJapgolly.parcelTypes.mod

import typingsJapgolly.parcelDiagnostic.mod.Diagnostic
import typingsJapgolly.parcelTypes.parcelTypesStrings.buildFailure
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildFailureEvent
  extends StObject
     with BuildEvent
     with ReporterEvent {
  
  val diagnostics: js.Array[Diagnostic]
  
  val `type`: buildFailure
}
object BuildFailureEvent {
  
  inline def apply(diagnostics: js.Array[Diagnostic]): BuildFailureEvent = {
    val __obj = js.Dynamic.literal(diagnostics = diagnostics.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("buildFailure")
    __obj.asInstanceOf[BuildFailureEvent]
  }
  
  extension [Self <: BuildFailureEvent](x: Self) {
    
    inline def setDiagnostics(value: js.Array[Diagnostic]): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticsVarargs(value: Diagnostic*): Self = StObject.set(x, "diagnostics", js.Array(value*))
    
    inline def setType(value: buildFailure): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
