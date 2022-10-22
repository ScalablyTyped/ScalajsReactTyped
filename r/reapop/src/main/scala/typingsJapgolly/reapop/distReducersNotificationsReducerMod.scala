package typingsJapgolly.reapop

import typingsJapgolly.reapop.distReducersNotificationsActionsMod.NotificationActions
import typingsJapgolly.reapop.distReducersNotificationsTypesMod.Notification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distReducersNotificationsReducerMod {
  
  @JSImport("reapop/dist/reducers/notifications/reducer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Function2[
    /* state */ js.UndefOr[js.Array[Notification]], 
    /* action */ NotificationActions | InitReduxAction, 
    js.Array[Notification]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Function2[
    /* state */ js.UndefOr[js.Array[Notification]], 
    /* action */ NotificationActions | InitReduxAction, 
    js.Array[Notification]
  ]]
  
  trait InitReduxAction extends StObject {
    
    var `type`: String
  }
  object InitReduxAction {
    
    inline def apply(`type`: String): InitReduxAction = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[InitReduxAction]
    }
    
    extension [Self <: InitReduxAction](x: Self) {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
