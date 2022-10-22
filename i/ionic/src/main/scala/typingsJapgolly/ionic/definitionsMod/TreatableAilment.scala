package typingsJapgolly.ionic.definitionsMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreatableAilment
  extends StObject
     with IAilment {
  
  val treatable: Boolean
}
object TreatableAilment {
  
  inline def apply(
    detected: CallbackTo[js.Promise[Boolean]],
    getMessage: CallbackTo[js.Promise[String]],
    getTreatmentSteps: CallbackTo[js.Promise[js.Array[PatientTreatmentStep]]],
    id: String,
    `implicit`: Boolean,
    treatable: Boolean
  ): TreatableAilment = {
    val __obj = js.Dynamic.literal(detected = detected.toJsFn, getMessage = getMessage.toJsFn, getTreatmentSteps = getTreatmentSteps.toJsFn, id = id.asInstanceOf[js.Any], treatable = treatable.asInstanceOf[js.Any])
    __obj.updateDynamic("implicit")(`implicit`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreatableAilment]
  }
  
  extension [Self <: TreatableAilment](x: Self) {
    
    inline def setTreatable(value: Boolean): Self = StObject.set(x, "treatable", value.asInstanceOf[js.Any])
  }
}
