package typingsJapgolly.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetachInstancesAnswer extends StObject {
  
  /**
    * The activities related to detaching the instances from the Auto Scaling group.
    */
  var Activities: js.UndefOr[typingsJapgolly.awsSdk.clientsAutoscalingMod.Activities] = js.undefined
}
object DetachInstancesAnswer {
  
  inline def apply(): DetachInstancesAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetachInstancesAnswer]
  }
  
  extension [Self <: DetachInstancesAnswer](x: Self) {
    
    inline def setActivities(value: Activities): Self = StObject.set(x, "Activities", value.asInstanceOf[js.Any])
    
    inline def setActivitiesUndefined: Self = StObject.set(x, "Activities", js.undefined)
    
    inline def setActivitiesVarargs(value: Activity*): Self = StObject.set(x, "Activities", js.Array(value*))
  }
}
