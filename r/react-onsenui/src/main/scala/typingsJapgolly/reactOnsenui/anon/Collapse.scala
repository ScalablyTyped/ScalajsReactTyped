package typingsJapgolly.reactOnsenui.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Event
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.collapse
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.default
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.landscape
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.left
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.overlay
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.portrait
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.right
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.split
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Collapse extends StObject {
  
  var animation: js.UndefOr[overlay | default] = js.undefined
  
  var animationOptions: js.UndefOr[typingsJapgolly.reactOnsenui.mod.AnimationOptions] = js.undefined
  
  var children: js.UndefOr[Node] = js.undefined
  
  var collapse: js.UndefOr[portrait | landscape | Boolean] = js.undefined
  
  var isOpen: js.UndefOr[Boolean] = js.undefined
  
  var mode: js.UndefOr[collapse | split] = js.undefined
  
  var onClose: js.UndefOr[js.Function1[/* e */ js.UndefOr[Event], Unit]] = js.undefined
  
  var onModeChange: js.UndefOr[js.Function1[/* e */ js.UndefOr[Event], Unit]] = js.undefined
  
  var onOpen: js.UndefOr[js.Function1[/* e */ js.UndefOr[Event], Unit]] = js.undefined
  
  var onPreClose: js.UndefOr[js.Function1[/* e */ js.UndefOr[Event], Unit]] = js.undefined
  
  var onPreOpen: js.UndefOr[js.Function1[/* e */ js.UndefOr[Event], Unit]] = js.undefined
  
  var openThreshold: js.UndefOr[Double] = js.undefined
  
  var side: js.UndefOr[left | right] = js.undefined
  
  var swipeTargetWidth: js.UndefOr[Double] = js.undefined
  
  var swipeable: js.UndefOr[Boolean] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object Collapse {
  
  inline def apply(): Collapse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Collapse]
  }
  
  extension [Self <: Collapse](x: Self) {
    
    inline def setAnimation(value: overlay | default): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationOptions(value: typingsJapgolly.reactOnsenui.mod.AnimationOptions): Self = StObject.set(x, "animationOptions", value.asInstanceOf[js.Any])
    
    inline def setAnimationOptionsUndefined: Self = StObject.set(x, "animationOptions", js.undefined)
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setCollapse(value: portrait | landscape | Boolean): Self = StObject.set(x, "collapse", value.asInstanceOf[js.Any])
    
    inline def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
    
    inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
    
    inline def setMode(value: collapse | split): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setOnClose(value: /* e */ js.UndefOr[Event] => Callback): Self = StObject.set(x, "onClose", js.Any.fromFunction1((t0: /* e */ js.UndefOr[Event]) => value(t0).runNow()))
    
    inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    inline def setOnModeChange(value: /* e */ js.UndefOr[Event] => Callback): Self = StObject.set(x, "onModeChange", js.Any.fromFunction1((t0: /* e */ js.UndefOr[Event]) => value(t0).runNow()))
    
    inline def setOnModeChangeUndefined: Self = StObject.set(x, "onModeChange", js.undefined)
    
    inline def setOnOpen(value: /* e */ js.UndefOr[Event] => Callback): Self = StObject.set(x, "onOpen", js.Any.fromFunction1((t0: /* e */ js.UndefOr[Event]) => value(t0).runNow()))
    
    inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
    
    inline def setOnPreClose(value: /* e */ js.UndefOr[Event] => Callback): Self = StObject.set(x, "onPreClose", js.Any.fromFunction1((t0: /* e */ js.UndefOr[Event]) => value(t0).runNow()))
    
    inline def setOnPreCloseUndefined: Self = StObject.set(x, "onPreClose", js.undefined)
    
    inline def setOnPreOpen(value: /* e */ js.UndefOr[Event] => Callback): Self = StObject.set(x, "onPreOpen", js.Any.fromFunction1((t0: /* e */ js.UndefOr[Event]) => value(t0).runNow()))
    
    inline def setOnPreOpenUndefined: Self = StObject.set(x, "onPreOpen", js.undefined)
    
    inline def setOpenThreshold(value: Double): Self = StObject.set(x, "openThreshold", value.asInstanceOf[js.Any])
    
    inline def setOpenThresholdUndefined: Self = StObject.set(x, "openThreshold", js.undefined)
    
    inline def setSide(value: left | right): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
    
    inline def setSideUndefined: Self = StObject.set(x, "side", js.undefined)
    
    inline def setSwipeTargetWidth(value: Double): Self = StObject.set(x, "swipeTargetWidth", value.asInstanceOf[js.Any])
    
    inline def setSwipeTargetWidthUndefined: Self = StObject.set(x, "swipeTargetWidth", js.undefined)
    
    inline def setSwipeable(value: Boolean): Self = StObject.set(x, "swipeable", value.asInstanceOf[js.Any])
    
    inline def setSwipeableUndefined: Self = StObject.set(x, "swipeable", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
