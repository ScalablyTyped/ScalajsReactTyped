package typingsJapgolly.reactNativeModalbox

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeModalbox.reactNativeModalboxStrings.bottom
import typingsJapgolly.reactNativeModalbox.reactNativeModalboxStrings.center
import typingsJapgolly.reactNativeModalbox.reactNativeModalboxStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-modalbox", JSImport.Default)
  @js.native
  open class default () extends Modal
  
  @js.native
  trait Modal
    extends Component[ModalProps, js.Object, Any] {
    
    /**
      * Close the modal
      *
      *
      */
    def close(): Unit = js.native
    
    /**
      * Open the modal
      *
      *
      */
    def open(): Unit = js.native
  }
  
  trait ModalProps extends StObject {
    
    /**
      * Duration of the animation
      *
      * Default is 400ms
      *
      */
    var animationDuration: js.UndefOr[Double] = js.undefined
    
    /**
      * (Android only) Close modal when receiving back button event
      *
      * Default is false
      *
      */
    var backButtonClose: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If a backdrop is displayed behind the modal
      *
      * Default is true
      *
      */
    var backdrop: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Background color of the backdrop
      *
      * Default is black
      *
      */
    var backdropColor: js.UndefOr[String] = js.undefined
    
    /**
      * Add an element in the backdrop (a close button for example)
      *
      * Default is null
      *
      */
    var backdropContent: js.UndefOr[Node] = js.undefined
    
    /**
      * Opacity of the backdrop
      *
      * Default is 0.5
      *
      */
    var backdropOpacity: js.UndefOr[Double] = js.undefined
    
    /**
      * If the modal can be closed by pressing on the backdrop
      *
      * Default is true
      *
      */
    var backdropPressToClose: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    /**
      *
      * Default is false
      */
    var coverScreen: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The direction modal enters from
      *
      * Default is bottom
      *
      */
    var entry: js.UndefOr[top | bottom | String] = js.undefined
    
    /**
      * Checks if the modal is disabled
      *
      * Default is false
      *
      */
    var isDisabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Checks if the modal is open
      *
      * Default is false
      *
      */
    var isOpen: js.UndefOr[Boolean] = js.undefined
    
    /**
      * This property prevent the modal to cover the ios status bar when the modal is scrolling up because the keyboard is opening
      *
      * Default is ios:22, android:0
      */
    var keyboardTopOffset: js.UndefOr[Double] = js.undefined
    
    /**
      * Event fired when the modal is closed and the animation is complete
      *
      */
    var onClosed: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * When the state of the swipe to close feature has changed
      * (useful to change the content of the modal, display a message for example)
      *
      *
      */
    var onClosingState: js.UndefOr[js.Function1[/* state */ Boolean, Unit]] = js.undefined
    
    /**
      * Event fired when the modal is opened and the animation is complete
      *
      */
    var onOpened: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * The final position of the modal.
      * Accepts top, center or bottom
      *
      * Default is center
      *
      */
    var position: js.UndefOr[top | center | bottom | String] = js.undefined
    
    /**
      * If the modal should appear open without animation upon first mount
      *
      * Default is false
      *
      */
    var startOpen: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Custom styling for the content area
      */
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    /**
      * The height in pixels of the swipeable area
      *
      * Default is the Window Height
      *
      */
    var swipeArea: js.UndefOr[Double] = js.undefined
    
    /**
      * The threshold to reach in pixels to close the modal
      *
      * Default is 50
      *
      */
    var swipeThreshold: js.UndefOr[Double] = js.undefined
    
    /**
      * If the modal can be closed by swiping
      *
      * Default is true
      *
      */
    var swipeToClose: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enables the hardware acceleration to animate the modal. Please note that enabling this can cause some flashes in a weird way when animating
      *
      * Default is true
      *
      */
    var useNativeDriver: js.UndefOr[Boolean] = js.undefined
  }
  object ModalProps {
    
    inline def apply(): ModalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalProps]
    }
    
    extension [Self <: ModalProps](x: Self) {
      
      inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      inline def setBackButtonClose(value: Boolean): Self = StObject.set(x, "backButtonClose", value.asInstanceOf[js.Any])
      
      inline def setBackButtonCloseUndefined: Self = StObject.set(x, "backButtonClose", js.undefined)
      
      inline def setBackdrop(value: Boolean): Self = StObject.set(x, "backdrop", value.asInstanceOf[js.Any])
      
      inline def setBackdropColor(value: String): Self = StObject.set(x, "backdropColor", value.asInstanceOf[js.Any])
      
      inline def setBackdropColorUndefined: Self = StObject.set(x, "backdropColor", js.undefined)
      
      inline def setBackdropContent(value: VdomNode): Self = StObject.set(x, "backdropContent", value.rawNode.asInstanceOf[js.Any])
      
      inline def setBackdropContentNull: Self = StObject.set(x, "backdropContent", null)
      
      inline def setBackdropContentUndefined: Self = StObject.set(x, "backdropContent", js.undefined)
      
      inline def setBackdropContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "backdropContent", js.Array(value*))
      
      inline def setBackdropContentVdomElement(value: VdomElement): Self = StObject.set(x, "backdropContent", value.rawElement.asInstanceOf[js.Any])
      
      inline def setBackdropOpacity(value: Double): Self = StObject.set(x, "backdropOpacity", value.asInstanceOf[js.Any])
      
      inline def setBackdropOpacityUndefined: Self = StObject.set(x, "backdropOpacity", js.undefined)
      
      inline def setBackdropPressToClose(value: Boolean): Self = StObject.set(x, "backdropPressToClose", value.asInstanceOf[js.Any])
      
      inline def setBackdropPressToCloseUndefined: Self = StObject.set(x, "backdropPressToClose", js.undefined)
      
      inline def setBackdropUndefined: Self = StObject.set(x, "backdrop", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setCoverScreen(value: Boolean): Self = StObject.set(x, "coverScreen", value.asInstanceOf[js.Any])
      
      inline def setCoverScreenUndefined: Self = StObject.set(x, "coverScreen", js.undefined)
      
      inline def setEntry(value: top | bottom | String): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
      
      inline def setEntryUndefined: Self = StObject.set(x, "entry", js.undefined)
      
      inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      inline def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      inline def setKeyboardTopOffset(value: Double): Self = StObject.set(x, "keyboardTopOffset", value.asInstanceOf[js.Any])
      
      inline def setKeyboardTopOffsetUndefined: Self = StObject.set(x, "keyboardTopOffset", js.undefined)
      
      inline def setOnClosed(value: Callback): Self = StObject.set(x, "onClosed", value.toJsFn)
      
      inline def setOnClosedUndefined: Self = StObject.set(x, "onClosed", js.undefined)
      
      inline def setOnClosingState(value: /* state */ Boolean => Callback): Self = StObject.set(x, "onClosingState", js.Any.fromFunction1((t0: /* state */ Boolean) => value(t0).runNow()))
      
      inline def setOnClosingStateUndefined: Self = StObject.set(x, "onClosingState", js.undefined)
      
      inline def setOnOpened(value: Callback): Self = StObject.set(x, "onOpened", value.toJsFn)
      
      inline def setOnOpenedUndefined: Self = StObject.set(x, "onOpened", js.undefined)
      
      inline def setPosition(value: top | center | bottom | String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setStartOpen(value: Boolean): Self = StObject.set(x, "startOpen", value.asInstanceOf[js.Any])
      
      inline def setStartOpenUndefined: Self = StObject.set(x, "startOpen", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSwipeArea(value: Double): Self = StObject.set(x, "swipeArea", value.asInstanceOf[js.Any])
      
      inline def setSwipeAreaUndefined: Self = StObject.set(x, "swipeArea", js.undefined)
      
      inline def setSwipeThreshold(value: Double): Self = StObject.set(x, "swipeThreshold", value.asInstanceOf[js.Any])
      
      inline def setSwipeThresholdUndefined: Self = StObject.set(x, "swipeThreshold", js.undefined)
      
      inline def setSwipeToClose(value: Boolean): Self = StObject.set(x, "swipeToClose", value.asInstanceOf[js.Any])
      
      inline def setSwipeToCloseUndefined: Self = StObject.set(x, "swipeToClose", js.undefined)
      
      inline def setUseNativeDriver(value: Boolean): Self = StObject.set(x, "useNativeDriver", value.asInstanceOf[js.Any])
      
      inline def setUseNativeDriverUndefined: Self = StObject.set(x, "useNativeDriver", js.undefined)
    }
  }
}
