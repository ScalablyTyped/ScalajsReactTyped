package typingsJapgolly.mapsjs.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.mapsjs.mod.point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownAction extends StObject {
  
  var downAction: js.UndefOr[js.Function1[/* downPoint */ point, Any]] = js.undefined
  
  var dragEnabled: Boolean
  
  var moveAction: js.UndefOr[js.Function1[/* movePoint */ point, Unit]] = js.undefined
  
  var upAction: js.UndefOr[js.Function1[/* upPoint */ point, Unit]] = js.undefined
  
  var useElementInsteadOfNewGestureOverlay: Boolean
  
  var wheelAction: js.UndefOr[js.Function1[/* delta */ Double, Unit]] = js.undefined
}
object DownAction {
  
  inline def apply(dragEnabled: Boolean, useElementInsteadOfNewGestureOverlay: Boolean): DownAction = {
    val __obj = js.Dynamic.literal(dragEnabled = dragEnabled.asInstanceOf[js.Any], useElementInsteadOfNewGestureOverlay = useElementInsteadOfNewGestureOverlay.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownAction]
  }
  
  extension [Self <: DownAction](x: Self) {
    
    inline def setDownAction(value: /* downPoint */ point => Any): Self = StObject.set(x, "downAction", js.Any.fromFunction1(value))
    
    inline def setDownActionUndefined: Self = StObject.set(x, "downAction", js.undefined)
    
    inline def setDragEnabled(value: Boolean): Self = StObject.set(x, "dragEnabled", value.asInstanceOf[js.Any])
    
    inline def setMoveAction(value: /* movePoint */ point => Callback): Self = StObject.set(x, "moveAction", js.Any.fromFunction1((t0: /* movePoint */ point) => value(t0).runNow()))
    
    inline def setMoveActionUndefined: Self = StObject.set(x, "moveAction", js.undefined)
    
    inline def setUpAction(value: /* upPoint */ point => Callback): Self = StObject.set(x, "upAction", js.Any.fromFunction1((t0: /* upPoint */ point) => value(t0).runNow()))
    
    inline def setUpActionUndefined: Self = StObject.set(x, "upAction", js.undefined)
    
    inline def setUseElementInsteadOfNewGestureOverlay(value: Boolean): Self = StObject.set(x, "useElementInsteadOfNewGestureOverlay", value.asInstanceOf[js.Any])
    
    inline def setWheelAction(value: /* delta */ Double => Callback): Self = StObject.set(x, "wheelAction", js.Any.fromFunction1((t0: /* delta */ Double) => value(t0).runNow()))
    
    inline def setWheelActionUndefined: Self = StObject.set(x, "wheelAction", js.undefined)
  }
}
