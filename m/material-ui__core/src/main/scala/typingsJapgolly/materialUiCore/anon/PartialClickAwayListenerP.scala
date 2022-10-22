package typingsJapgolly.materialUiCore.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Document
import org.scalajs.dom.Element
import typingsJapgolly.materialUiCore.materialUiCoreBooleans.`false`
import typingsJapgolly.materialUiCore.materialUiCoreStrings.onClick
import typingsJapgolly.materialUiCore.materialUiCoreStrings.onMouseDown
import typingsJapgolly.materialUiCore.materialUiCoreStrings.onMouseUp
import typingsJapgolly.materialUiCore.materialUiCoreStrings.onTouchEnd
import typingsJapgolly.materialUiCore.materialUiCoreStrings.onTouchStart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/ClickAwayListener.ClickAwayListenerProps> */
trait PartialClickAwayListenerP extends StObject {
  
  var children: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.undefined
  
  var disableReactTree: js.UndefOr[Boolean] = js.undefined
  
  var mouseEvent: js.UndefOr[onClick | onMouseDown | onMouseUp | `false`] = js.undefined
  
  var onClickAway: js.UndefOr[js.Function1[/* event */ ReactMouseEventFrom[Document & Element], Unit]] = js.undefined
  
  var touchEvent: js.UndefOr[onTouchStart | onTouchEnd | `false`] = js.undefined
}
object PartialClickAwayListenerP {
  
  inline def apply(): PartialClickAwayListenerP = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClickAwayListenerP]
  }
  
  extension [Self <: PartialClickAwayListenerP](x: Self) {
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setDisableReactTree(value: Boolean): Self = StObject.set(x, "disableReactTree", value.asInstanceOf[js.Any])
    
    inline def setDisableReactTreeUndefined: Self = StObject.set(x, "disableReactTree", js.undefined)
    
    inline def setMouseEvent(value: onClick | onMouseDown | onMouseUp | `false`): Self = StObject.set(x, "mouseEvent", value.asInstanceOf[js.Any])
    
    inline def setMouseEventUndefined: Self = StObject.set(x, "mouseEvent", js.undefined)
    
    inline def setOnClickAway(value: /* event */ ReactMouseEventFrom[Document & Element] => Callback): Self = StObject.set(x, "onClickAway", js.Any.fromFunction1((t0: /* event */ ReactMouseEventFrom[Document & Element]) => value(t0).runNow()))
    
    inline def setOnClickAwayUndefined: Self = StObject.set(x, "onClickAway", js.undefined)
    
    inline def setTouchEvent(value: onTouchStart | onTouchEnd | `false`): Self = StObject.set(x, "touchEvent", value.asInstanceOf[js.Any])
    
    inline def setTouchEventUndefined: Self = StObject.set(x, "touchEvent", js.undefined)
  }
}
