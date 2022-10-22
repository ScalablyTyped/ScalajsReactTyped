package typingsJapgolly.reactNativeDrawer

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNative.mod.ScaledSize
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.bottom
import typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.closed
import typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.displace
import typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.left
import typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.open
import typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.overlay
import typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.right
import typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.static
import typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-drawer", JSImport.Default)
  @js.native
  open class default () extends Drawer
  
  @js.native
  trait Drawer
    extends Component[DrawerProperties, js.Object, Any] {
    
    /** Close the drawer programmatically. */
    def close(): Unit = js.native
    
    /** Open the drawer programmatically. */
    def open(): Unit = js.native
  }
  
  trait DrawerProperties extends StObject {
    
    /**
      * Toggle drawer when double tap occurs within pan mask?
      */
    var acceptDoubleTap: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Allow for drawer pan (on touch drag). Set to false to effectively
      * disable the drawer while still allowing programmatic control
      */
    var acceptPan: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Allow Pan when drawer is 'open'
      */
    var acceptPanOnDrawer: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Toggle drawer when any tap occurs within pan mask?
      */
    var acceptTap: js.UndefOr[Boolean] = js.undefined
    
    // Gestures
    /**
      * If true, will capture all gestures inside of the pan mask. If 'open' will
      * only capture when drawer is open
      */
    var captureGestures: js.UndefOr[Boolean | open | closed] = js.undefined
    
    // Important
    var children: js.UndefOr[Node] = js.undefined
    
    /**
      * Same as openDrawerOffset, except defines left hand margin when drawer is closed
      */
    var closedDrawerOffset: js.UndefOr[js.Function0[Double] | Double] = js.undefined
    
    /**
      * Menu component
      */
    var content: js.UndefOr[Node] = js.undefined
    
    /**
      * If true the drawer can not be opened and will not respond to pans
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * (Android-only) Sets the elevation of the drawer using Android's underlying elevation API
      */
    var elevation: js.UndefOr[Double] = js.undefined
    
    /**
      * Initialize with drawer open
      */
    var initializeOpen: js.UndefOr[Double] = js.undefined
    
    /**
      * If true, attempts to handle only horizontal swipes, making it play well with a child ScrollView
      */
    var negotiatePan: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Will be called immediately after the drawer has entered the closed state
      */
    var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Ccallback fired at the start of a close animation
      */
    var onCloseStart: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Callback fired when a drag gesture starts.
      */
    var onDragStart: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    // Event Handlers
    /**
      * Will be called immediately after the drawer has entered the open state
      */
    var onOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Callback fired at the start of an open animation
      */
    var onOpenStart: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * If true will trigger drawer open, if false will trigger close.
      */
    var open: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Can either be a integer (pixel value) or decimal (ratio of screen width). Defines the right hand margin when
      * the drawer is open. Or, can be function which returns offset
      */
    var openDrawerOffset: js.UndefOr[(js.Function1[/* viewport */ ScaledSize, Double]) | Double] = js.undefined
    
    /**
      * Ratio of screen width that is valid for the start of a pan close action. If null -> defaults to max(.05, openDrawerOffset)
      */
    var panCloseMask: js.UndefOr[Double] = js.undefined
    
    /**
      * Ratio of screen width that is valid for the start of a pan open action. If null -> defaults to max(.05, closedDrawerOffset)
      */
    var panOpenMask: js.UndefOr[Double] = js.undefined
    
    // Additional Configurations
    /**
      * Ratio of screen width that must be travelled to trigger a drawer open/close
      */
    var panThreshold: js.UndefOr[Double] = js.undefined
    
    /**
      * which side the drawer should be on.
      */
    var side: js.UndefOr[left | right | top | bottom] = js.undefined
    
    /**
      * Styles for the drawer, main, drawerOverlay and mainOverlay container Views
      */
    var styles: js.UndefOr[DrawerStyles] = js.undefined
    
    /**
      * Same as acceptTap, except only for close
      */
    var tapToClose: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The duration of the open/close animation
      */
    var tweenDuration: js.UndefOr[Double] = js.undefined
    
    /**
      *  A easing type supported by tween-functions
      */
    var tweenEasing: js.UndefOr[TweenFunctions] = js.undefined
    
    // Animation / Tween
    /**
      * Takes in the pan ratio (decimal 0 to 1) that represents the tween percent. Returns an object of
      * native props to be set on the constituent views
      */
    var tweenHandler: js.UndefOr[js.Function1[/* ratio */ Double, NestedViewStyles]] = js.undefined
    
    /**
      * Type of drawer
      */
    var `type`: js.UndefOr[displace | overlay | static] = js.undefined
    
    /**
      * if true will run InteractionManager for open/close animations.
      */
    var useInteractionManager: js.UndefOr[Boolean] = js.undefined
  }
  object DrawerProperties {
    
    inline def apply(): DrawerProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawerProperties]
    }
    
    extension [Self <: DrawerProperties](x: Self) {
      
      inline def setAcceptDoubleTap(value: Boolean): Self = StObject.set(x, "acceptDoubleTap", value.asInstanceOf[js.Any])
      
      inline def setAcceptDoubleTapUndefined: Self = StObject.set(x, "acceptDoubleTap", js.undefined)
      
      inline def setAcceptPan(value: Boolean): Self = StObject.set(x, "acceptPan", value.asInstanceOf[js.Any])
      
      inline def setAcceptPanOnDrawer(value: Boolean): Self = StObject.set(x, "acceptPanOnDrawer", value.asInstanceOf[js.Any])
      
      inline def setAcceptPanOnDrawerUndefined: Self = StObject.set(x, "acceptPanOnDrawer", js.undefined)
      
      inline def setAcceptPanUndefined: Self = StObject.set(x, "acceptPan", js.undefined)
      
      inline def setAcceptTap(value: Boolean): Self = StObject.set(x, "acceptTap", value.asInstanceOf[js.Any])
      
      inline def setAcceptTapUndefined: Self = StObject.set(x, "acceptTap", js.undefined)
      
      inline def setCaptureGestures(value: Boolean | open | closed): Self = StObject.set(x, "captureGestures", value.asInstanceOf[js.Any])
      
      inline def setCaptureGesturesUndefined: Self = StObject.set(x, "captureGestures", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClosedDrawerOffset(value: js.Function0[Double] | Double): Self = StObject.set(x, "closedDrawerOffset", value.asInstanceOf[js.Any])
      
      inline def setClosedDrawerOffsetCallbackTo(value: CallbackTo[Double]): Self = StObject.set(x, "closedDrawerOffset", value.toJsFn)
      
      inline def setClosedDrawerOffsetUndefined: Self = StObject.set(x, "closedDrawerOffset", js.undefined)
      
      inline def setContent(value: VdomNode): Self = StObject.set(x, "content", value.rawNode.asInstanceOf[js.Any])
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setContentVdomElement(value: VdomElement): Self = StObject.set(x, "content", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setElevation(value: Double): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
      
      inline def setElevationUndefined: Self = StObject.set(x, "elevation", js.undefined)
      
      inline def setInitializeOpen(value: Double): Self = StObject.set(x, "initializeOpen", value.asInstanceOf[js.Any])
      
      inline def setInitializeOpenUndefined: Self = StObject.set(x, "initializeOpen", js.undefined)
      
      inline def setNegotiatePan(value: Boolean): Self = StObject.set(x, "negotiatePan", value.asInstanceOf[js.Any])
      
      inline def setNegotiatePanUndefined: Self = StObject.set(x, "negotiatePan", js.undefined)
      
      inline def setOnClose(value: Callback): Self = StObject.set(x, "onClose", value.toJsFn)
      
      inline def setOnCloseStart(value: Callback): Self = StObject.set(x, "onCloseStart", value.toJsFn)
      
      inline def setOnCloseStartUndefined: Self = StObject.set(x, "onCloseStart", js.undefined)
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnDragStart(value: Callback): Self = StObject.set(x, "onDragStart", value.toJsFn)
      
      inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      inline def setOnOpen(value: Callback): Self = StObject.set(x, "onOpen", value.toJsFn)
      
      inline def setOnOpenStart(value: Callback): Self = StObject.set(x, "onOpenStart", value.toJsFn)
      
      inline def setOnOpenStartUndefined: Self = StObject.set(x, "onOpenStart", js.undefined)
      
      inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenDrawerOffset(value: (js.Function1[/* viewport */ ScaledSize, Double]) | Double): Self = StObject.set(x, "openDrawerOffset", value.asInstanceOf[js.Any])
      
      inline def setOpenDrawerOffsetFunction1(value: /* viewport */ ScaledSize => Double): Self = StObject.set(x, "openDrawerOffset", js.Any.fromFunction1(value))
      
      inline def setOpenDrawerOffsetUndefined: Self = StObject.set(x, "openDrawerOffset", js.undefined)
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setPanCloseMask(value: Double): Self = StObject.set(x, "panCloseMask", value.asInstanceOf[js.Any])
      
      inline def setPanCloseMaskUndefined: Self = StObject.set(x, "panCloseMask", js.undefined)
      
      inline def setPanOpenMask(value: Double): Self = StObject.set(x, "panOpenMask", value.asInstanceOf[js.Any])
      
      inline def setPanOpenMaskUndefined: Self = StObject.set(x, "panOpenMask", js.undefined)
      
      inline def setPanThreshold(value: Double): Self = StObject.set(x, "panThreshold", value.asInstanceOf[js.Any])
      
      inline def setPanThresholdUndefined: Self = StObject.set(x, "panThreshold", js.undefined)
      
      inline def setSide(value: left | right | top | bottom): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
      
      inline def setSideUndefined: Self = StObject.set(x, "side", js.undefined)
      
      inline def setStyles(value: DrawerStyles): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTapToClose(value: Boolean): Self = StObject.set(x, "tapToClose", value.asInstanceOf[js.Any])
      
      inline def setTapToCloseUndefined: Self = StObject.set(x, "tapToClose", js.undefined)
      
      inline def setTweenDuration(value: Double): Self = StObject.set(x, "tweenDuration", value.asInstanceOf[js.Any])
      
      inline def setTweenDurationUndefined: Self = StObject.set(x, "tweenDuration", js.undefined)
      
      inline def setTweenEasing(value: TweenFunctions): Self = StObject.set(x, "tweenEasing", value.asInstanceOf[js.Any])
      
      inline def setTweenEasingUndefined: Self = StObject.set(x, "tweenEasing", js.undefined)
      
      inline def setTweenHandler(value: /* ratio */ Double => NestedViewStyles): Self = StObject.set(x, "tweenHandler", js.Any.fromFunction1(value))
      
      inline def setTweenHandlerUndefined: Self = StObject.set(x, "tweenHandler", js.undefined)
      
      inline def setType(value: displace | overlay | static): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUseInteractionManager(value: Boolean): Self = StObject.set(x, "useInteractionManager", value.asInstanceOf[js.Any])
      
      inline def setUseInteractionManagerUndefined: Self = StObject.set(x, "useInteractionManager", js.undefined)
    }
  }
  
  trait DrawerStyles
    extends StObject
       with NestedViewStyles {
    
    var drawer: js.UndefOr[ViewStyle] = js.undefined
  }
  object DrawerStyles {
    
    inline def apply(): DrawerStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawerStyles]
    }
    
    extension [Self <: DrawerStyles](x: Self) {
      
      inline def setDrawer(value: ViewStyle): Self = StObject.set(x, "drawer", value.asInstanceOf[js.Any])
      
      inline def setDrawerUndefined: Self = StObject.set(x, "drawer", js.undefined)
    }
  }
  
  trait NestedViewStyles extends StObject {
    
    var drawerOverlay: js.UndefOr[ViewStyle] = js.undefined
    
    var main: js.UndefOr[ViewStyle] = js.undefined
    
    var mainOverlay: js.UndefOr[ViewStyle] = js.undefined
  }
  object NestedViewStyles {
    
    inline def apply(): NestedViewStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NestedViewStyles]
    }
    
    extension [Self <: NestedViewStyles](x: Self) {
      
      inline def setDrawerOverlay(value: ViewStyle): Self = StObject.set(x, "drawerOverlay", value.asInstanceOf[js.Any])
      
      inline def setDrawerOverlayUndefined: Self = StObject.set(x, "drawerOverlay", js.undefined)
      
      inline def setMain(value: ViewStyle): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
      
      inline def setMainOverlay(value: ViewStyle): Self = StObject.set(x, "mainOverlay", value.asInstanceOf[js.Any])
      
      inline def setMainOverlayUndefined: Self = StObject.set(x, "mainOverlay", js.undefined)
      
      inline def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.linear
    - typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeInQuad
    - typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeOutQuad
    - typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeInOutQuad
    - typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeInCubic
    - typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeOutCubic
    - typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeInOutCubic
    - typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeInQuart
    - typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeOutQuart
    - typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeInOutQuart
    - typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeInQuint
    - typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeOutQuint
    - typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeInOutQuint
    - typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeInSine
    - typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeOutSine
    - typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeInOutSine
    - typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeInExpo
    - typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeOutExpo
    - typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeInOutExpo
    - typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeInCirc
    - typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeOutCirc
    - typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeInOutCirc
    - typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeInElastic
    - typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeOutElastic
    - typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeInOutElastic
    - typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeInBack
    - typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeOutBack
    - typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeInOutBack
    - typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeInBounce
    - typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeOutBounce
    - typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeInOutBounce
  */
  trait TweenFunctions extends StObject
  object TweenFunctions {
    
    inline def easeInBack: typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeInBack = "easeInBack".asInstanceOf[typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeInBack]
    
    inline def easeInBounce: typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeInBounce = "easeInBounce".asInstanceOf[typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeInBounce]
    
    inline def easeInCirc: typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeInCirc = "easeInCirc".asInstanceOf[typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeInCirc]
    
    inline def easeInCubic: typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeInCubic = "easeInCubic".asInstanceOf[typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeInCubic]
    
    inline def easeInElastic: typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeInElastic = "easeInElastic".asInstanceOf[typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeInElastic]
    
    inline def easeInExpo: typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeInExpo = "easeInExpo".asInstanceOf[typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeInExpo]
    
    inline def easeInOutBack: typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeInOutBack = "easeInOutBack".asInstanceOf[typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeInOutBack]
    
    inline def easeInOutBounce: typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeInOutBounce = "easeInOutBounce".asInstanceOf[typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeInOutBounce]
    
    inline def easeInOutCirc: typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeInOutCirc = "easeInOutCirc".asInstanceOf[typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeInOutCirc]
    
    inline def easeInOutCubic: typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeInOutCubic = "easeInOutCubic".asInstanceOf[typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeInOutCubic]
    
    inline def easeInOutElastic: typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeInOutElastic = "easeInOutElastic".asInstanceOf[typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeInOutElastic]
    
    inline def easeInOutExpo: typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeInOutExpo = "easeInOutExpo".asInstanceOf[typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeInOutExpo]
    
    inline def easeInOutQuad: typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeInOutQuad = "easeInOutQuad".asInstanceOf[typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeInOutQuad]
    
    inline def easeInOutQuart: typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeInOutQuart = "easeInOutQuart".asInstanceOf[typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeInOutQuart]
    
    inline def easeInOutQuint: typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeInOutQuint = "easeInOutQuint".asInstanceOf[typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeInOutQuint]
    
    inline def easeInOutSine: typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeInOutSine = "easeInOutSine".asInstanceOf[typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeInOutSine]
    
    inline def easeInQuad: typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeInQuad = "easeInQuad".asInstanceOf[typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeInQuad]
    
    inline def easeInQuart: typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeInQuart = "easeInQuart".asInstanceOf[typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeInQuart]
    
    inline def easeInQuint: typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeInQuint = "easeInQuint".asInstanceOf[typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeInQuint]
    
    inline def easeInSine: typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeInSine = "easeInSine".asInstanceOf[typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeInSine]
    
    inline def easeOutBack: typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeOutBack = "easeOutBack".asInstanceOf[typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeOutBack]
    
    inline def easeOutBounce: typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeOutBounce = "easeOutBounce".asInstanceOf[typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeOutBounce]
    
    inline def easeOutCirc: typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeOutCirc = "easeOutCirc".asInstanceOf[typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeOutCirc]
    
    inline def easeOutCubic: typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeOutCubic = "easeOutCubic".asInstanceOf[typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeOutCubic]
    
    inline def easeOutElastic: typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeOutElastic = "easeOutElastic".asInstanceOf[typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeOutElastic]
    
    inline def easeOutExpo: typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeOutExpo = "easeOutExpo".asInstanceOf[typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeOutExpo]
    
    inline def easeOutQuad: typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeOutQuad = "easeOutQuad".asInstanceOf[typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeOutQuad]
    
    inline def easeOutQuart: typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeOutQuart = "easeOutQuart".asInstanceOf[typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeOutQuart]
    
    inline def easeOutQuint: typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeOutQuint = "easeOutQuint".asInstanceOf[typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeOutQuint]
    
    inline def easeOutSine: typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeOutSine = "easeOutSine".asInstanceOf[typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.easeOutSine]
    
    inline def linear: typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.linear = "linear".asInstanceOf[typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.linear]
  }
}
