package typingsJapgolly.ionic.definitionsMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAilment extends StObject {
  
  def detected(): js.Promise[Boolean]
  
  def getMessage(): js.Promise[String]
  
  def getTreatmentSteps(): js.Promise[js.Array[PatientTreatmentStep]]
  
  val id: String
  
  var `implicit`: Boolean
  
  var projects: js.UndefOr[js.Array[ProjectType]] = js.undefined
}
object IAilment {
  
  inline def apply(
    detected: CallbackTo[js.Promise[Boolean]],
    getMessage: CallbackTo[js.Promise[String]],
    getTreatmentSteps: CallbackTo[js.Promise[js.Array[PatientTreatmentStep]]],
    id: String,
    `implicit`: Boolean
  ): IAilment = {
    val __obj = js.Dynamic.literal(detected = detected.toJsFn, getMessage = getMessage.toJsFn, getTreatmentSteps = getTreatmentSteps.toJsFn, id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("implicit")(`implicit`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAilment]
  }
  
  extension [Self <: IAilment](x: Self) {
    
    inline def setDetected(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "detected", value.toJsFn)
    
    inline def setGetMessage(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getMessage", value.toJsFn)
    
    inline def setGetTreatmentSteps(value: CallbackTo[js.Promise[js.Array[PatientTreatmentStep]]]): Self = StObject.set(x, "getTreatmentSteps", value.toJsFn)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setImplicit(value: Boolean): Self = StObject.set(x, "implicit", value.asInstanceOf[js.Any])
    
    inline def setProjects(value: js.Array[ProjectType]): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
    
    inline def setProjectsUndefined: Self = StObject.set(x, "projects", js.undefined)
    
    inline def setProjectsVarargs(value: ProjectType*): Self = StObject.set(x, "projects", js.Array(value*))
  }
}
