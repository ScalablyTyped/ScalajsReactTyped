package typingsJapgolly.reactNativeModalPopover

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.reactNativeModalPopover.anon.Children
import typingsJapgolly.reactNativeModalPopover.libPopoverGeometryMod.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPopoverControllerMod {
  
  @JSImport("react-native-modal-popover/lib/PopoverController", "PopoverController")
  @js.native
  open class PopoverController protected () extends PureComponent[Props, State, Any] {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: Any) = this()
    
    /* private */ var closePopover: Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MPopoverController(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MPopoverController(): Unit = js.native
    
    /* private */ var onOrientationChange: Any = js.native
    
    /* private */ var onTouchableMeasured: Any = js.native
    
    /* private */ var openPopover: Any = js.native
    
    /* private */ var setTouchableRef: Any = js.native
    
    /* private */ var touchable: Any = js.native
  }
  /* static members */
  object PopoverController {
    
    @JSImport("react-native-modal-popover/lib/PopoverController", "PopoverController")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-modal-popover/lib/PopoverController", "PopoverController.propTypes")
    @js.native
    def propTypes: Children = js.native
    inline def propTypes_=(x: Children): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  trait PopoverControllerRenderProps extends StObject {
    
    def closePopover(): Unit
    
    def openPopover(): Unit
    
    var popoverAnchorRect: Rect
    
    var popoverVisible: Boolean
    
    def setPopoverAnchor(ref: Any): Unit
  }
  object PopoverControllerRenderProps {
    
    inline def apply(
      closePopover: Callback,
      openPopover: Callback,
      popoverAnchorRect: Rect,
      popoverVisible: Boolean,
      setPopoverAnchor: Any => Callback
    ): PopoverControllerRenderProps = {
      val __obj = js.Dynamic.literal(closePopover = closePopover.toJsFn, openPopover = openPopover.toJsFn, popoverAnchorRect = popoverAnchorRect.asInstanceOf[js.Any], popoverVisible = popoverVisible.asInstanceOf[js.Any], setPopoverAnchor = js.Any.fromFunction1((t0: Any) => setPopoverAnchor(t0).runNow()))
      __obj.asInstanceOf[PopoverControllerRenderProps]
    }
    
    extension [Self <: PopoverControllerRenderProps](x: Self) {
      
      inline def setClosePopover(value: Callback): Self = StObject.set(x, "closePopover", value.toJsFn)
      
      inline def setOpenPopover(value: Callback): Self = StObject.set(x, "openPopover", value.toJsFn)
      
      inline def setPopoverAnchorRect(value: Rect): Self = StObject.set(x, "popoverAnchorRect", value.asInstanceOf[js.Any])
      
      inline def setPopoverVisible(value: Boolean): Self = StObject.set(x, "popoverVisible", value.asInstanceOf[js.Any])
      
      inline def setSetPopoverAnchor(value: Any => Callback): Self = StObject.set(x, "setPopoverAnchor", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    }
  }
  
  trait Props extends StObject {
    
    var calculateStatusBar: js.UndefOr[Boolean] = js.undefined
    
    def children(props: PopoverControllerRenderProps): Element
  }
  object Props {
    
    inline def apply(children: PopoverControllerRenderProps => Element): Props = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setCalculateStatusBar(value: Boolean): Self = StObject.set(x, "calculateStatusBar", value.asInstanceOf[js.Any])
      
      inline def setCalculateStatusBarUndefined: Self = StObject.set(x, "calculateStatusBar", js.undefined)
      
      inline def setChildren(value: PopoverControllerRenderProps => Element): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    }
  }
  
  trait State extends StObject {
    
    var popoverAnchor: Rect
    
    var showPopover: Boolean
  }
  object State {
    
    inline def apply(popoverAnchor: Rect, showPopover: Boolean): State = {
      val __obj = js.Dynamic.literal(popoverAnchor = popoverAnchor.asInstanceOf[js.Any], showPopover = showPopover.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setPopoverAnchor(value: Rect): Self = StObject.set(x, "popoverAnchor", value.asInstanceOf[js.Any])
      
      inline def setShowPopover(value: Boolean): Self = StObject.set(x, "showPopover", value.asInstanceOf[js.Any])
    }
  }
}
