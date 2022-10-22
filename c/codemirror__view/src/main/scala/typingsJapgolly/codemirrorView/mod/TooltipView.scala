package typingsJapgolly.codemirrorView.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.codemirrorView.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
Describes the way a tooltip is displayed.
*/
trait TooltipView extends StObject {
  
  /**
    The DOM element to position over the editor.
    */
  var dom: HTMLElement
  
  /**
    By default, a tooltip's screen position will be based on the
    text position of its `pos` property. This method can be provided
    to make the tooltip view itself responsible for finding its
    screen position.
    */
  var getCoords: js.UndefOr[js.Function1[/* pos */ Double, Rect]] = js.undefined
  
  /**
    Called after the tooltip is added to the DOM for the first time.
    */
  var mount: js.UndefOr[js.Function1[/* view */ EditorView, Unit]] = js.undefined
  
  /**
    Adjust the position of the tooltip relative to its anchor
    position. A positive `x` value will move the tooltip
    horizontally along with the text direction (so right in
    left-to-right context, left in right-to-left). A positive `y`
    will move the tooltip up when it is above its anchor, and down
    otherwise.
    */
  var offset: js.UndefOr[X] = js.undefined
  
  /**
    By default, tooltips are moved when they overlap with other
    tooltips. Set this to `true` to disable that behavior for this
    tooltip.
    */
  var overlap: js.UndefOr[Boolean] = js.undefined
  
  /**
    Called when the tooltip has been (re)positioned.
    */
  var positioned: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    Update the DOM element for a change in the view's state.
    */
  var update: js.UndefOr[js.Function1[/* update */ ViewUpdate, Unit]] = js.undefined
}
object TooltipView {
  
  inline def apply(dom: HTMLElement): TooltipView = {
    val __obj = js.Dynamic.literal(dom = dom.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipView]
  }
  
  extension [Self <: TooltipView](x: Self) {
    
    inline def setDom(value: HTMLElement): Self = StObject.set(x, "dom", value.asInstanceOf[js.Any])
    
    inline def setGetCoords(value: /* pos */ Double => Rect): Self = StObject.set(x, "getCoords", js.Any.fromFunction1(value))
    
    inline def setGetCoordsUndefined: Self = StObject.set(x, "getCoords", js.undefined)
    
    inline def setMount(value: /* view */ EditorView => Callback): Self = StObject.set(x, "mount", js.Any.fromFunction1((t0: /* view */ EditorView) => value(t0).runNow()))
    
    inline def setMountUndefined: Self = StObject.set(x, "mount", js.undefined)
    
    inline def setOffset(value: X): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOverlap(value: Boolean): Self = StObject.set(x, "overlap", value.asInstanceOf[js.Any])
    
    inline def setOverlapUndefined: Self = StObject.set(x, "overlap", js.undefined)
    
    inline def setPositioned(value: Callback): Self = StObject.set(x, "positioned", value.toJsFn)
    
    inline def setPositionedUndefined: Self = StObject.set(x, "positioned", js.undefined)
    
    inline def setUpdate(value: /* update */ ViewUpdate => Callback): Self = StObject.set(x, "update", js.Any.fromFunction1((t0: /* update */ ViewUpdate) => value(t0).runNow()))
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
