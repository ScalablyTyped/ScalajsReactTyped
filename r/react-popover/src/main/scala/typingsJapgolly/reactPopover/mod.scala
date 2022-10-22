package typingsJapgolly.reactPopover

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Element
import org.scalajs.dom.Event
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-popover", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[PopoverProps, js.Object, Any]
  
  type Popover = japgolly.scalajs.react.facade.React.Component[PopoverProps & js.Object, js.Object]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactPopover.reactPopoverStrings.above
    - typingsJapgolly.reactPopover.reactPopoverStrings.right
    - typingsJapgolly.reactPopover.reactPopoverStrings.below
    - typingsJapgolly.reactPopover.reactPopoverStrings.left
    - typingsJapgolly.reactPopover.reactPopoverStrings.row
    - typingsJapgolly.reactPopover.reactPopoverStrings.column
    - typingsJapgolly.reactPopover.reactPopoverStrings.start
    - typingsJapgolly.reactPopover.reactPopoverStrings.end
  */
  trait PopoverPlace extends StObject
  object PopoverPlace {
    
    inline def above: typingsJapgolly.reactPopover.reactPopoverStrings.above = "above".asInstanceOf[typingsJapgolly.reactPopover.reactPopoverStrings.above]
    
    inline def below: typingsJapgolly.reactPopover.reactPopoverStrings.below = "below".asInstanceOf[typingsJapgolly.reactPopover.reactPopoverStrings.below]
    
    inline def column: typingsJapgolly.reactPopover.reactPopoverStrings.column = "column".asInstanceOf[typingsJapgolly.reactPopover.reactPopoverStrings.column]
    
    inline def end: typingsJapgolly.reactPopover.reactPopoverStrings.end = "end".asInstanceOf[typingsJapgolly.reactPopover.reactPopoverStrings.end]
    
    inline def left: typingsJapgolly.reactPopover.reactPopoverStrings.left = "left".asInstanceOf[typingsJapgolly.reactPopover.reactPopoverStrings.left]
    
    inline def right: typingsJapgolly.reactPopover.reactPopoverStrings.right = "right".asInstanceOf[typingsJapgolly.reactPopover.reactPopoverStrings.right]
    
    inline def row: typingsJapgolly.reactPopover.reactPopoverStrings.row = "row".asInstanceOf[typingsJapgolly.reactPopover.reactPopoverStrings.row]
    
    inline def start: typingsJapgolly.reactPopover.reactPopoverStrings.start = "start".asInstanceOf[typingsJapgolly.reactPopover.reactPopoverStrings.start]
  }
  
  trait PopoverProps extends StObject {
    
    var appendTarget: js.UndefOr[Element] = js.undefined
    
    var body: Node
    
    var className: js.UndefOr[String] = js.undefined
    
    var enterExitTransitionDurationMs: js.UndefOr[Double] = js.undefined
    
    var isOpen: js.UndefOr[Boolean] = js.undefined
    
    var onOuterAction: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
    
    var place: js.UndefOr[PopoverPlace] = js.undefined
    
    var preferPlace: js.UndefOr[PopoverPlace] = js.undefined
    
    var refreshIntervalMs: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var target: js.UndefOr[japgolly.scalajs.react.facade.React.Element] = js.undefined
    
    var tipSize: js.UndefOr[Double] = js.undefined
  }
  object PopoverProps {
    
    inline def apply(): PopoverProps = {
      val __obj = js.Dynamic.literal(body = null)
      __obj.asInstanceOf[PopoverProps]
    }
    
    extension [Self <: PopoverProps](x: Self) {
      
      inline def setAppendTarget(value: Element): Self = StObject.set(x, "appendTarget", value.asInstanceOf[js.Any])
      
      inline def setAppendTargetUndefined: Self = StObject.set(x, "appendTarget", js.undefined)
      
      inline def setBody(value: VdomNode): Self = StObject.set(x, "body", value.rawNode.asInstanceOf[js.Any])
      
      inline def setBodyNull: Self = StObject.set(x, "body", null)
      
      inline def setBodyVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "body", js.Array(value*))
      
      inline def setBodyVdomElement(value: VdomElement): Self = StObject.set(x, "body", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setEnterExitTransitionDurationMs(value: Double): Self = StObject.set(x, "enterExitTransitionDurationMs", value.asInstanceOf[js.Any])
      
      inline def setEnterExitTransitionDurationMsUndefined: Self = StObject.set(x, "enterExitTransitionDurationMs", js.undefined)
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      inline def setOnOuterAction(value: /* event */ Event => Callback): Self = StObject.set(x, "onOuterAction", js.Any.fromFunction1((t0: /* event */ Event) => value(t0).runNow()))
      
      inline def setOnOuterActionUndefined: Self = StObject.set(x, "onOuterAction", js.undefined)
      
      inline def setPlace(value: PopoverPlace): Self = StObject.set(x, "place", value.asInstanceOf[js.Any])
      
      inline def setPlaceUndefined: Self = StObject.set(x, "place", js.undefined)
      
      inline def setPreferPlace(value: PopoverPlace): Self = StObject.set(x, "preferPlace", value.asInstanceOf[js.Any])
      
      inline def setPreferPlaceUndefined: Self = StObject.set(x, "preferPlace", js.undefined)
      
      inline def setRefreshIntervalMs(value: Double): Self = StObject.set(x, "refreshIntervalMs", value.asInstanceOf[js.Any])
      
      inline def setRefreshIntervalMsUndefined: Self = StObject.set(x, "refreshIntervalMs", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTarget(value: VdomElement): Self = StObject.set(x, "target", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTipSize(value: Double): Self = StObject.set(x, "tipSize", value.asInstanceOf[js.Any])
      
      inline def setTipSizeUndefined: Self = StObject.set(x, "tipSize", js.undefined)
    }
  }
}
