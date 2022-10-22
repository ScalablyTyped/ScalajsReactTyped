package typingsJapgolly.reactNavigationStack

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNative.mod.Animated.AnimatedInterpolation
import typingsJapgolly.reactNative.mod.Animated.Value
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewProps
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeSafeAreaContext.libTypescriptSafeAreaDottypesMod.EdgeInsets
import typingsJapgolly.reactNavigationStack.anon.Close
import typingsJapgolly.reactNavigationStack.anon.Gesture
import typingsJapgolly.reactNavigationStack.anon.GestureEnabled
import typingsJapgolly.reactNavigationStack.anon.Horizontal
import typingsJapgolly.reactNavigationStack.anon.StyleWithAnimatedValue
import typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod.GestureDirection
import typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod.Layout
import typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod.StackCardInterpolatedStyle
import typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod.StackCardInterpolationProps
import typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod.StackCardStyleInterpolator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcVendorViewsStackCardMod {
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/Stack/Card", JSImport.Default)
  @js.native
  open class default () extends Card
  /* static members */
  object default {
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/Stack/Card", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/Stack/Card", "default.defaultProps")
    @js.native
    def defaultProps: GestureEnabled = js.native
    inline def defaultProps_=(x: GestureEnabled): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Card
    extends Component[Props, js.Object, Any] {
    
    /* private */ var animate: Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MCard(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MCard(prevProps: Props): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MCard(): Unit = js.native
    
    /* private */ var contentRef: Any = js.native
    
    /* private */ var gestureActivationCriteria: Any = js.native
    
    /* private */ var getAnimateToValue: Any = js.native
    
    /* private */ var getCardAnimationContext: Any = js.native
    
    /* private */ var getInterpolatedStyle: Any = js.native
    
    /* private */ var handleEndInteraction: Any = js.native
    
    /* private */ var handleGestureStateChange: Any = js.native
    
    /* private */ var handleStartInteraction: Any = js.native
    
    /* private */ var interactionHandle: Any = js.native
    
    /* private */ var inverted: Any = js.native
    
    /* private */ var isClosing: Any = js.native
    
    /* private */ var isCurrentlyMounted: Any = js.native
    
    /* private */ var isSwiping: Any = js.native
    
    /* private */ var lastToValue: Any = js.native
    
    /* private */ var layout: Any = js.native
    
    /* private */ var pendingGestureCallback: Any = js.native
    
    /* private */ var setPointerEventsEnabled: Any = js.native
  }
  
  trait Props
    extends StObject
       with ViewProps {
    
    @JSName("children")
    var children_Props: Node
    
    var closing: Boolean
    
    var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var contentStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var current: AnimatedInterpolation[Double | String]
    
    var gesture: Value
    
    var gestureDirection: GestureDirection
    
    var gestureEnabled: Boolean
    
    var gestureResponseDistance: js.UndefOr[Horizontal] = js.undefined
    
    var gestureVelocityImpact: Double
    
    var index: Double
    
    var insets: EdgeInsets
    
    var layout: Layout
    
    var next: js.UndefOr[AnimatedInterpolation[Double | String]] = js.undefined
    
    def onClose(): Unit
    
    var onGestureBegin: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onGestureCanceled: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onGestureEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    def onOpen(): Unit
    
    var onTransition: js.UndefOr[js.Function1[/* props */ Gesture, Unit]] = js.undefined
    
    def overlay(props: StyleWithAnimatedValue): Node
    
    var overlayEnabled: Boolean
    
    var pageOverflowEnabled: Boolean
    
    var shadowEnabled: Boolean
    
    var styleInterpolator: StackCardStyleInterpolator
    
    var transitionSpec: Close
  }
  object Props {
    
    inline def apply(
      closing: Boolean,
      current: AnimatedInterpolation[Double | String],
      gesture: Value,
      gestureDirection: GestureDirection,
      gestureEnabled: Boolean,
      gestureVelocityImpact: Double,
      index: Double,
      insets: EdgeInsets,
      layout: Layout,
      onClose: Callback,
      onOpen: Callback,
      overlay: StyleWithAnimatedValue => Node,
      overlayEnabled: Boolean,
      pageOverflowEnabled: Boolean,
      shadowEnabled: Boolean,
      styleInterpolator: /* props */ StackCardInterpolationProps => StackCardInterpolatedStyle,
      transitionSpec: Close
    ): Props = {
      val __obj = js.Dynamic.literal(closing = closing.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], gesture = gesture.asInstanceOf[js.Any], gestureDirection = gestureDirection.asInstanceOf[js.Any], gestureEnabled = gestureEnabled.asInstanceOf[js.Any], gestureVelocityImpact = gestureVelocityImpact.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], insets = insets.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], onClose = onClose.toJsFn, onOpen = onOpen.toJsFn, overlay = js.Any.fromFunction1(overlay), overlayEnabled = overlayEnabled.asInstanceOf[js.Any], pageOverflowEnabled = pageOverflowEnabled.asInstanceOf[js.Any], shadowEnabled = shadowEnabled.asInstanceOf[js.Any], styleInterpolator = js.Any.fromFunction1(styleInterpolator), transitionSpec = transitionSpec.asInstanceOf[js.Any], children = null)
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClosing(value: Boolean): Self = StObject.set(x, "closing", value.asInstanceOf[js.Any])
      
      inline def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      inline def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
      
      inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      inline def setContentStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
      
      inline def setContentStyleNull: Self = StObject.set(x, "contentStyle", null)
      
      inline def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
      
      inline def setCurrent(value: AnimatedInterpolation[Double | String]): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setGesture(value: Value): Self = StObject.set(x, "gesture", value.asInstanceOf[js.Any])
      
      inline def setGestureDirection(value: GestureDirection): Self = StObject.set(x, "gestureDirection", value.asInstanceOf[js.Any])
      
      inline def setGestureEnabled(value: Boolean): Self = StObject.set(x, "gestureEnabled", value.asInstanceOf[js.Any])
      
      inline def setGestureResponseDistance(value: Horizontal): Self = StObject.set(x, "gestureResponseDistance", value.asInstanceOf[js.Any])
      
      inline def setGestureResponseDistanceUndefined: Self = StObject.set(x, "gestureResponseDistance", js.undefined)
      
      inline def setGestureVelocityImpact(value: Double): Self = StObject.set(x, "gestureVelocityImpact", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setInsets(value: EdgeInsets): Self = StObject.set(x, "insets", value.asInstanceOf[js.Any])
      
      inline def setLayout(value: Layout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setNext(value: AnimatedInterpolation[Double | String]): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      inline def setOnClose(value: Callback): Self = StObject.set(x, "onClose", value.toJsFn)
      
      inline def setOnGestureBegin(value: Callback): Self = StObject.set(x, "onGestureBegin", value.toJsFn)
      
      inline def setOnGestureBeginUndefined: Self = StObject.set(x, "onGestureBegin", js.undefined)
      
      inline def setOnGestureCanceled(value: Callback): Self = StObject.set(x, "onGestureCanceled", value.toJsFn)
      
      inline def setOnGestureCanceledUndefined: Self = StObject.set(x, "onGestureCanceled", js.undefined)
      
      inline def setOnGestureEnd(value: Callback): Self = StObject.set(x, "onGestureEnd", value.toJsFn)
      
      inline def setOnGestureEndUndefined: Self = StObject.set(x, "onGestureEnd", js.undefined)
      
      inline def setOnOpen(value: Callback): Self = StObject.set(x, "onOpen", value.toJsFn)
      
      inline def setOnTransition(value: /* props */ Gesture => Callback): Self = StObject.set(x, "onTransition", js.Any.fromFunction1((t0: /* props */ Gesture) => value(t0).runNow()))
      
      inline def setOnTransitionUndefined: Self = StObject.set(x, "onTransition", js.undefined)
      
      inline def setOverlay(value: StyleWithAnimatedValue => Node): Self = StObject.set(x, "overlay", js.Any.fromFunction1(value))
      
      inline def setOverlayEnabled(value: Boolean): Self = StObject.set(x, "overlayEnabled", value.asInstanceOf[js.Any])
      
      inline def setPageOverflowEnabled(value: Boolean): Self = StObject.set(x, "pageOverflowEnabled", value.asInstanceOf[js.Any])
      
      inline def setShadowEnabled(value: Boolean): Self = StObject.set(x, "shadowEnabled", value.asInstanceOf[js.Any])
      
      inline def setStyleInterpolator(value: /* props */ StackCardInterpolationProps => StackCardInterpolatedStyle): Self = StObject.set(x, "styleInterpolator", js.Any.fromFunction1(value))
      
      inline def setTransitionSpec(value: Close): Self = StObject.set(x, "transitionSpec", value.asInstanceOf[js.Any])
    }
  }
}
