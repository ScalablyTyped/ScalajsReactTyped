package typingsJapgolly.fundamentalReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.TouchEvent
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.menu_
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPopoverPopoverMod {
  
  @JSImport("fundamental-react/lib/Popover/Popover", JSImport.Default)
  @js.native
  open class default ()
    extends Component[PopoverProps, js.Object, Any]
  
  type Popover = japgolly.scalajs.react.facade.React.Component[PopoverProps & js.Object, js.Object]
  
  trait PopoverProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var body: Node
    
    var control: Node
    
    var disableEdgeDetection: js.UndefOr[Boolean] = js.undefined
    
    var disableKeyPressHandler: js.UndefOr[Boolean] = js.undefined
    
    var disableStyles: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var noArrow: js.UndefOr[Boolean] = js.undefined
    
    var onClickOutside: js.UndefOr[js.Function1[/* event */ MouseEvent | TouchEvent | FocusEvent, Unit]] = js.undefined
    
    var onEscapeKey: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var placement: js.UndefOr[PopperPlacement] = js.undefined
    
    var popperClassName: js.UndefOr[String] = js.undefined
    
    var popperProps: js.UndefOr[Any] = js.undefined
    
    var `type`: js.UndefOr[PopoverTypes] = js.undefined
    
    var useArrowKeyNavigation: js.UndefOr[Boolean] = js.undefined
    
    var widthSizingType: js.UndefOr[PopperSizingTypes] = js.undefined
  }
  object PopoverProps {
    
    inline def apply(): PopoverProps = {
      val __obj = js.Dynamic.literal(body = null, control = null)
      __obj.asInstanceOf[PopoverProps]
    }
    
    extension [Self <: PopoverProps](x: Self) {
      
      inline def setBody(value: VdomNode): Self = StObject.set(x, "body", value.rawNode.asInstanceOf[js.Any])
      
      inline def setBodyNull: Self = StObject.set(x, "body", null)
      
      inline def setBodyVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "body", js.Array(value*))
      
      inline def setBodyVdomElement(value: VdomElement): Self = StObject.set(x, "body", value.rawElement.asInstanceOf[js.Any])
      
      inline def setControl(value: VdomNode): Self = StObject.set(x, "control", value.rawNode.asInstanceOf[js.Any])
      
      inline def setControlNull: Self = StObject.set(x, "control", null)
      
      inline def setControlVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "control", js.Array(value*))
      
      inline def setControlVdomElement(value: VdomElement): Self = StObject.set(x, "control", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDisableEdgeDetection(value: Boolean): Self = StObject.set(x, "disableEdgeDetection", value.asInstanceOf[js.Any])
      
      inline def setDisableEdgeDetectionUndefined: Self = StObject.set(x, "disableEdgeDetection", js.undefined)
      
      inline def setDisableKeyPressHandler(value: Boolean): Self = StObject.set(x, "disableKeyPressHandler", value.asInstanceOf[js.Any])
      
      inline def setDisableKeyPressHandlerUndefined: Self = StObject.set(x, "disableKeyPressHandler", js.undefined)
      
      inline def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      inline def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setNoArrow(value: Boolean): Self = StObject.set(x, "noArrow", value.asInstanceOf[js.Any])
      
      inline def setNoArrowUndefined: Self = StObject.set(x, "noArrow", js.undefined)
      
      inline def setOnClickOutside(value: /* event */ MouseEvent | TouchEvent | FocusEvent => Callback): Self = StObject.set(x, "onClickOutside", js.Any.fromFunction1((t0: /* event */ MouseEvent | TouchEvent | FocusEvent) => value(t0).runNow()))
      
      inline def setOnClickOutsideUndefined: Self = StObject.set(x, "onClickOutside", js.undefined)
      
      inline def setOnEscapeKey(value: Callback): Self = StObject.set(x, "onEscapeKey", value.toJsFn)
      
      inline def setOnEscapeKeyUndefined: Self = StObject.set(x, "onEscapeKey", js.undefined)
      
      inline def setPlacement(value: PopperPlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setPopperClassName(value: String): Self = StObject.set(x, "popperClassName", value.asInstanceOf[js.Any])
      
      inline def setPopperClassNameUndefined: Self = StObject.set(x, "popperClassName", js.undefined)
      
      inline def setPopperProps(value: Any): Self = StObject.set(x, "popperProps", value.asInstanceOf[js.Any])
      
      inline def setPopperPropsUndefined: Self = StObject.set(x, "popperProps", js.undefined)
      
      inline def setType(value: PopoverTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUseArrowKeyNavigation(value: Boolean): Self = StObject.set(x, "useArrowKeyNavigation", value.asInstanceOf[js.Any])
      
      inline def setUseArrowKeyNavigationUndefined: Self = StObject.set(x, "useArrowKeyNavigation", js.undefined)
      
      inline def setWidthSizingType(value: PopperSizingTypes): Self = StObject.set(x, "widthSizingType", value.asInstanceOf[js.Any])
      
      inline def setWidthSizingTypeUndefined: Self = StObject.set(x, "widthSizingType", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.fundamentalReact.fundamentalReactBooleans.`true`
    - typingsJapgolly.fundamentalReact.fundamentalReactStrings.dialog
    - typingsJapgolly.fundamentalReact.fundamentalReactStrings.grid
    - typingsJapgolly.fundamentalReact.fundamentalReactStrings.listbox
    - typingsJapgolly.fundamentalReact.fundamentalReactStrings.menu_
    - typingsJapgolly.fundamentalReact.fundamentalReactStrings.tree
  */
  trait PopoverTypes extends StObject
  object PopoverTypes {
    
    inline def dialog: typingsJapgolly.fundamentalReact.fundamentalReactStrings.dialog = "dialog".asInstanceOf[typingsJapgolly.fundamentalReact.fundamentalReactStrings.dialog]
    
    inline def grid: typingsJapgolly.fundamentalReact.fundamentalReactStrings.grid = "grid".asInstanceOf[typingsJapgolly.fundamentalReact.fundamentalReactStrings.grid]
    
    inline def listbox: typingsJapgolly.fundamentalReact.fundamentalReactStrings.listbox = "listbox".asInstanceOf[typingsJapgolly.fundamentalReact.fundamentalReactStrings.listbox]
    
    inline def menu: menu_ = "menu".asInstanceOf[menu_]
    
    inline def tree: typingsJapgolly.fundamentalReact.fundamentalReactStrings.tree = "tree".asInstanceOf[typingsJapgolly.fundamentalReact.fundamentalReactStrings.tree]
    
    inline def `true`: typingsJapgolly.fundamentalReact.fundamentalReactBooleans.`true` = true.asInstanceOf[typingsJapgolly.fundamentalReact.fundamentalReactBooleans.`true`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.fundamentalReact.fundamentalReactStrings.`bottom-start`
    - typingsJapgolly.fundamentalReact.fundamentalReactStrings.bottom
    - typingsJapgolly.fundamentalReact.fundamentalReactStrings.`bottom-end`
    - typingsJapgolly.fundamentalReact.fundamentalReactStrings.`left-start`
    - typingsJapgolly.fundamentalReact.fundamentalReactStrings.left
    - typingsJapgolly.fundamentalReact.fundamentalReactStrings.`left-end`
    - typingsJapgolly.fundamentalReact.fundamentalReactStrings.`right-start`
    - typingsJapgolly.fundamentalReact.fundamentalReactStrings.right
    - typingsJapgolly.fundamentalReact.fundamentalReactStrings.`right-end`
    - typingsJapgolly.fundamentalReact.fundamentalReactStrings.`top-start`
    - typingsJapgolly.fundamentalReact.fundamentalReactStrings.top
    - typingsJapgolly.fundamentalReact.fundamentalReactStrings.`top-end`
  */
  trait PopperPlacement extends StObject
  object PopperPlacement {
    
    inline def bottom: typingsJapgolly.fundamentalReact.fundamentalReactStrings.bottom = "bottom".asInstanceOf[typingsJapgolly.fundamentalReact.fundamentalReactStrings.bottom]
    
    inline def `bottom-end`: typingsJapgolly.fundamentalReact.fundamentalReactStrings.`bottom-end` = "bottom-end".asInstanceOf[typingsJapgolly.fundamentalReact.fundamentalReactStrings.`bottom-end`]
    
    inline def `bottom-start`: typingsJapgolly.fundamentalReact.fundamentalReactStrings.`bottom-start` = "bottom-start".asInstanceOf[typingsJapgolly.fundamentalReact.fundamentalReactStrings.`bottom-start`]
    
    inline def left: typingsJapgolly.fundamentalReact.fundamentalReactStrings.left = "left".asInstanceOf[typingsJapgolly.fundamentalReact.fundamentalReactStrings.left]
    
    inline def `left-end`: typingsJapgolly.fundamentalReact.fundamentalReactStrings.`left-end` = "left-end".asInstanceOf[typingsJapgolly.fundamentalReact.fundamentalReactStrings.`left-end`]
    
    inline def `left-start`: typingsJapgolly.fundamentalReact.fundamentalReactStrings.`left-start` = "left-start".asInstanceOf[typingsJapgolly.fundamentalReact.fundamentalReactStrings.`left-start`]
    
    inline def right: typingsJapgolly.fundamentalReact.fundamentalReactStrings.right = "right".asInstanceOf[typingsJapgolly.fundamentalReact.fundamentalReactStrings.right]
    
    inline def `right-end`: typingsJapgolly.fundamentalReact.fundamentalReactStrings.`right-end` = "right-end".asInstanceOf[typingsJapgolly.fundamentalReact.fundamentalReactStrings.`right-end`]
    
    inline def `right-start`: typingsJapgolly.fundamentalReact.fundamentalReactStrings.`right-start` = "right-start".asInstanceOf[typingsJapgolly.fundamentalReact.fundamentalReactStrings.`right-start`]
    
    inline def top: typingsJapgolly.fundamentalReact.fundamentalReactStrings.top = "top".asInstanceOf[typingsJapgolly.fundamentalReact.fundamentalReactStrings.top]
    
    inline def `top-end`: typingsJapgolly.fundamentalReact.fundamentalReactStrings.`top-end` = "top-end".asInstanceOf[typingsJapgolly.fundamentalReact.fundamentalReactStrings.`top-end`]
    
    inline def `top-start`: typingsJapgolly.fundamentalReact.fundamentalReactStrings.`top-start` = "top-start".asInstanceOf[typingsJapgolly.fundamentalReact.fundamentalReactStrings.`top-start`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.fundamentalReact.fundamentalReactStrings.none
    - typingsJapgolly.fundamentalReact.fundamentalReactStrings.matchTarget
    - typingsJapgolly.fundamentalReact.fundamentalReactStrings.minTarget
    - typingsJapgolly.fundamentalReact.fundamentalReactStrings.maxTarget
  */
  trait PopperSizingTypes extends StObject
  object PopperSizingTypes {
    
    inline def matchTarget: typingsJapgolly.fundamentalReact.fundamentalReactStrings.matchTarget = "matchTarget".asInstanceOf[typingsJapgolly.fundamentalReact.fundamentalReactStrings.matchTarget]
    
    inline def maxTarget: typingsJapgolly.fundamentalReact.fundamentalReactStrings.maxTarget = "maxTarget".asInstanceOf[typingsJapgolly.fundamentalReact.fundamentalReactStrings.maxTarget]
    
    inline def minTarget: typingsJapgolly.fundamentalReact.fundamentalReactStrings.minTarget = "minTarget".asInstanceOf[typingsJapgolly.fundamentalReact.fundamentalReactStrings.minTarget]
    
    inline def none: typingsJapgolly.fundamentalReact.fundamentalReactStrings.none = "none".asInstanceOf[typingsJapgolly.fundamentalReact.fundamentalReactStrings.none]
  }
}
