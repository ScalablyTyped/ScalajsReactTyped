package typingsJapgolly.hippyReact.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PullFooterProps
  extends StObject
     with LayoutableProps {
  
  /**
    * Trigger when pulling
    *
    * @param {Object} evt - Event data
    * @param {number} evt.contentOffset - Dragging distance
    */
  var onFooterPulling: js.UndefOr[js.Function1[/* evt */ PullingEvent, Unit]] = js.undefined
  
  /**
    * Trigger when release the finger after pulling distance larger than the content height
    */
  var onFooterReleased: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Keep content displaying after onFooterReleased trigged.
    */
  var sticky: js.UndefOr[Boolean] = js.undefined
}
object PullFooterProps {
  
  inline def apply(): PullFooterProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PullFooterProps]
  }
  
  extension [Self <: PullFooterProps](x: Self) {
    
    inline def setOnFooterPulling(value: /* evt */ PullingEvent => Callback): Self = StObject.set(x, "onFooterPulling", js.Any.fromFunction1((t0: /* evt */ PullingEvent) => value(t0).runNow()))
    
    inline def setOnFooterPullingUndefined: Self = StObject.set(x, "onFooterPulling", js.undefined)
    
    inline def setOnFooterReleased(value: Callback): Self = StObject.set(x, "onFooterReleased", value.toJsFn)
    
    inline def setOnFooterReleasedUndefined: Self = StObject.set(x, "onFooterReleased", js.undefined)
    
    inline def setSticky(value: Boolean): Self = StObject.set(x, "sticky", value.asInstanceOf[js.Any])
    
    inline def setStickyUndefined: Self = StObject.set(x, "sticky", js.undefined)
  }
}
