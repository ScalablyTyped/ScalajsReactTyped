package typingsJapgolly.xstate.libTypesMod

import typingsJapgolly.xstate.anon.Id
import typingsJapgolly.xstate.libTypesMod.ActionTypes.Stop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopActionObject extends StObject {
  
  var activity: Id
  
  var `type`: Stop
}
object StopActionObject {
  
  inline def apply(activity: Id, `type`: Stop): StopActionObject = {
    val __obj = js.Dynamic.literal(activity = activity.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopActionObject]
  }
  
  extension [Self <: StopActionObject](x: Self) {
    
    inline def setActivity(value: Id): Self = StObject.set(x, "activity", value.asInstanceOf[js.Any])
    
    inline def setType(value: Stop): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
