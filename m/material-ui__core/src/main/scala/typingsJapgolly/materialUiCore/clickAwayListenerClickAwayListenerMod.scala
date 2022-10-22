package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Document
import typingsJapgolly.materialUiCore.materialUiCoreBooleans.`false`
import typingsJapgolly.materialUiCore.materialUiCoreStrings.onClick
import typingsJapgolly.materialUiCore.materialUiCoreStrings.onMouseDown
import typingsJapgolly.materialUiCore.materialUiCoreStrings.onMouseUp
import typingsJapgolly.materialUiCore.materialUiCoreStrings.onTouchEnd
import typingsJapgolly.materialUiCore.materialUiCoreStrings.onTouchStart
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clickAwayListenerClickAwayListenerMod {
  
  @JSImport("@material-ui/core/ClickAwayListener/ClickAwayListener", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: ClickAwayListenerProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait ClickAwayListenerProps extends StObject {
    
    /**
      * The wrapped element.
      */
    var children: Node
    
    /**
      * If `true`, the React tree is ignored and only the DOM tree is considered.
      * This prop changes how portaled elements are handled.
      */
    var disableReactTree: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The mouse event to listen to. You can disable the listener by providing `false`.
      */
    var mouseEvent: js.UndefOr[onClick | onMouseDown | onMouseUp | `false`] = js.undefined
    
    /**
      * Callback fired when a "click away" event is detected.
      */
    def onClickAway(event: ReactMouseEventFrom[Document & org.scalajs.dom.Element]): Unit
    
    /**
      * The touch event to listen to. You can disable the listener by providing `false`.
      */
    var touchEvent: js.UndefOr[onTouchStart | onTouchEnd | `false`] = js.undefined
  }
  object ClickAwayListenerProps {
    
    inline def apply(onClickAway: ReactMouseEventFrom[Document & org.scalajs.dom.Element] => Callback): ClickAwayListenerProps = {
      val __obj = js.Dynamic.literal(onClickAway = js.Any.fromFunction1((t0: ReactMouseEventFrom[Document & org.scalajs.dom.Element]) => onClickAway(t0).runNow()), children = null)
      __obj.asInstanceOf[ClickAwayListenerProps]
    }
    
    extension [Self <: ClickAwayListenerProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDisableReactTree(value: Boolean): Self = StObject.set(x, "disableReactTree", value.asInstanceOf[js.Any])
      
      inline def setDisableReactTreeUndefined: Self = StObject.set(x, "disableReactTree", js.undefined)
      
      inline def setMouseEvent(value: onClick | onMouseDown | onMouseUp | `false`): Self = StObject.set(x, "mouseEvent", value.asInstanceOf[js.Any])
      
      inline def setMouseEventUndefined: Self = StObject.set(x, "mouseEvent", js.undefined)
      
      inline def setOnClickAway(value: ReactMouseEventFrom[Document & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onClickAway", js.Any.fromFunction1((t0: ReactMouseEventFrom[Document & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setTouchEvent(value: onTouchStart | onTouchEnd | `false`): Self = StObject.set(x, "touchEvent", value.asInstanceOf[js.Any])
      
      inline def setTouchEventUndefined: Self = StObject.set(x, "touchEvent", js.undefined)
    }
  }
}
