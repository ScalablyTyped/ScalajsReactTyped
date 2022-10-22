package typingsJapgolly.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PickSourceAction extends StObject {
  
  var pickSourceAction: scala.Double
  
  var pickTargetAction: scala.Double
  
  var undecided: scala.Double
}
object PickSourceAction {
  
  inline def apply(pickSourceAction: scala.Double, pickTargetAction: scala.Double, undecided: scala.Double): PickSourceAction = {
    val __obj = js.Dynamic.literal(pickSourceAction = pickSourceAction.asInstanceOf[js.Any], pickTargetAction = pickTargetAction.asInstanceOf[js.Any], undecided = undecided.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickSourceAction]
  }
  
  extension [Self <: PickSourceAction](x: Self) {
    
    inline def setPickSourceAction(value: scala.Double): Self = StObject.set(x, "pickSourceAction", value.asInstanceOf[js.Any])
    
    inline def setPickTargetAction(value: scala.Double): Self = StObject.set(x, "pickTargetAction", value.asInstanceOf[js.Any])
    
    inline def setUndecided(value: scala.Double): Self = StObject.set(x, "undecided", value.asInstanceOf[js.Any])
  }
}
