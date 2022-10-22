package typingsJapgolly.hippyReact.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PullHeaderProps
  extends StObject
     with LayoutableProps {
  
  /**
    * Trigger when pulling
    *
    * @param {Object} evt - Event data
    * @param {number} evt.contentOffset - Dragging distance
    */
  var onHeaderPulling: js.UndefOr[js.Function1[/* evt */ PullingEvent, Unit]] = js.undefined
  
  /**
    * Trigger when release the finger after pulling distance larger than the content height
    */
  var onHeaderReleased: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object PullHeaderProps {
  
  inline def apply(): PullHeaderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PullHeaderProps]
  }
  
  extension [Self <: PullHeaderProps](x: Self) {
    
    inline def setOnHeaderPulling(value: /* evt */ PullingEvent => Callback): Self = StObject.set(x, "onHeaderPulling", js.Any.fromFunction1((t0: /* evt */ PullingEvent) => value(t0).runNow()))
    
    inline def setOnHeaderPullingUndefined: Self = StObject.set(x, "onHeaderPulling", js.undefined)
    
    inline def setOnHeaderReleased(value: Callback): Self = StObject.set(x, "onHeaderReleased", value.toJsFn)
    
    inline def setOnHeaderReleasedUndefined: Self = StObject.set(x, "onHeaderReleased", js.undefined)
  }
}
