package typingsJapgolly.ionic.definitionsMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DoctorTreatmentStep
  extends StObject
     with PatientTreatmentStep {
  
  def treat(): js.Promise[Unit]
}
object DoctorTreatmentStep {
  
  inline def apply(message: String, treat: CallbackTo[js.Promise[Unit]]): DoctorTreatmentStep = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], treat = treat.toJsFn)
    __obj.asInstanceOf[DoctorTreatmentStep]
  }
  
  extension [Self <: DoctorTreatmentStep](x: Self) {
    
    inline def setTreat(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "treat", value.toJsFn)
  }
}
