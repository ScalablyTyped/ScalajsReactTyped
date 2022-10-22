package typingsJapgolly.antDesignReactNative

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNative.mod.Animated.AnimatedInterpolation
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersGestureHandlerCommonMod.HandlerStateChangeEvent
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersGestureHandlerCommonMod.HitSlop
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSwipeActionMod {
  
  @JSImport("@ant-design/react-native/lib/swipe-action", JSImport.Default)
  @js.native
  open class default () extends SwipeAction
  
  @js.native
  trait SwipeAction
    extends Component[SwipeActionProps, js.Object, Any] {
    
    def close(): Unit = js.native
    
    def renderActions(
      progress: AnimatedInterpolation[Double | String],
      _dragAnimatedValue: AnimatedInterpolation[Double | String]
    ): Element | Null = js.native
    def renderActions(
      progress: AnimatedInterpolation[Double | String],
      _dragAnimatedValue: AnimatedInterpolation[Double | String],
      isLeft: Boolean
    ): Element | Null = js.native
    
    var swipeableRow: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Swipeable */ Any
      ] = js.native
    
    def updateRef(
      ref: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Swipeable */ Any
    ): Unit = js.native
  }
  
  trait SwipeActionProps
    extends StObject
       with SwipeableProps {
    
    var buttonWidth: js.UndefOr[Double] = js.undefined
    
    var left: js.UndefOr[js.Array[SwipeoutButtonProps]] = js.undefined
    
    var right: js.UndefOr[js.Array[SwipeoutButtonProps]] = js.undefined
  }
  object SwipeActionProps {
    
    inline def apply(): SwipeActionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwipeActionProps]
    }
    
    extension [Self <: SwipeActionProps](x: Self) {
      
      inline def setButtonWidth(value: Double): Self = StObject.set(x, "buttonWidth", value.asInstanceOf[js.Any])
      
      inline def setButtonWidthUndefined: Self = StObject.set(x, "buttonWidth", js.undefined)
      
      inline def setLeft(value: js.Array[SwipeoutButtonProps]): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setLeftVarargs(value: SwipeoutButtonProps*): Self = StObject.set(x, "left", js.Array(value*))
      
      inline def setRight(value: js.Array[SwipeoutButtonProps]): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setRightVarargs(value: SwipeoutButtonProps*): Self = StObject.set(x, "right", js.Array(value*))
    }
  }
  
  /* Inlined std.Exclude<keyof react-native-gesture-handler.react-native-gesture-handler.PanGestureHandlerProps, 'onGestureEvent' | 'onHandlerStateChange'> */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.activeOffsetY
    - typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.children
    - typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.minVelocityX
    - typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.minVelocity
    - typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.onEnded
    - typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.enabled
    - typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.simultaneousHandlers
    - typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.onFailed
    - typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.minDist
    - typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.minPointers
    - typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.waitFor
    - typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.hitSlop
    - typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.onCancelled
    - typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.avgTouches
    - typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.testID
    - typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.enableTrackpadTwoFingerGesture
    - typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.shouldCancelWhenOutside
    - typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.onActivated
    - typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.onBegan
    - typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.activateAfterLongPress
    - typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.failOffsetX
    - typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.cancelsTouchesInView
    - typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.maxPointers
    - typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.minVelocityY
    - typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.failOffsetY
    - typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.id
    - typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.activeOffsetX
  */
  trait SwipeableExcludes extends StObject
  object SwipeableExcludes {
    
    inline def activateAfterLongPress: typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.activateAfterLongPress = "activateAfterLongPress".asInstanceOf[typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.activateAfterLongPress]
    
    inline def activeOffsetX: typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.activeOffsetX = "activeOffsetX".asInstanceOf[typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.activeOffsetX]
    
    inline def activeOffsetY: typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.activeOffsetY = "activeOffsetY".asInstanceOf[typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.activeOffsetY]
    
    inline def avgTouches: typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.avgTouches = "avgTouches".asInstanceOf[typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.avgTouches]
    
    inline def cancelsTouchesInView: typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.cancelsTouchesInView = "cancelsTouchesInView".asInstanceOf[typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.cancelsTouchesInView]
    
    inline def children: typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.children = "children".asInstanceOf[typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.children]
    
    inline def enableTrackpadTwoFingerGesture: typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.enableTrackpadTwoFingerGesture = "enableTrackpadTwoFingerGesture".asInstanceOf[typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.enableTrackpadTwoFingerGesture]
    
    inline def enabled: typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.enabled = "enabled".asInstanceOf[typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.enabled]
    
    inline def failOffsetX: typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.failOffsetX = "failOffsetX".asInstanceOf[typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.failOffsetX]
    
    inline def failOffsetY: typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.failOffsetY = "failOffsetY".asInstanceOf[typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.failOffsetY]
    
    inline def hitSlop: typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.hitSlop = "hitSlop".asInstanceOf[typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.hitSlop]
    
    inline def id: typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.id = "id".asInstanceOf[typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.id]
    
    inline def maxPointers: typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.maxPointers = "maxPointers".asInstanceOf[typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.maxPointers]
    
    inline def minDist: typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.minDist = "minDist".asInstanceOf[typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.minDist]
    
    inline def minPointers: typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.minPointers = "minPointers".asInstanceOf[typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.minPointers]
    
    inline def minVelocity: typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.minVelocity = "minVelocity".asInstanceOf[typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.minVelocity]
    
    inline def minVelocityX: typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.minVelocityX = "minVelocityX".asInstanceOf[typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.minVelocityX]
    
    inline def minVelocityY: typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.minVelocityY = "minVelocityY".asInstanceOf[typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.minVelocityY]
    
    inline def onActivated: typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.onActivated = "onActivated".asInstanceOf[typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.onActivated]
    
    inline def onBegan: typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.onBegan = "onBegan".asInstanceOf[typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.onBegan]
    
    inline def onCancelled: typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.onCancelled = "onCancelled".asInstanceOf[typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.onCancelled]
    
    inline def onEnded: typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.onEnded = "onEnded".asInstanceOf[typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.onEnded]
    
    inline def onFailed: typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.onFailed = "onFailed".asInstanceOf[typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.onFailed]
    
    inline def shouldCancelWhenOutside: typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.shouldCancelWhenOutside = "shouldCancelWhenOutside".asInstanceOf[typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.shouldCancelWhenOutside]
    
    inline def simultaneousHandlers: typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.simultaneousHandlers = "simultaneousHandlers".asInstanceOf[typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.simultaneousHandlers]
    
    inline def testID: typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.testID = "testID".asInstanceOf[typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.testID]
    
    inline def waitFor: typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.waitFor = "waitFor".asInstanceOf[typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.waitFor]
  }
  
  /* Inlined parent std.Pick<react-native-gesture-handler.react-native-gesture-handler.PanGestureHandlerProps, @ant-design/react-native.@ant-design/react-native/lib/swipe-action.SwipeableExcludes> */
  trait SwipeableProps extends StObject {
    
    var activateAfterLongPress: js.UndefOr[Double] = js.undefined
    
    var activeOffsetX: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    var activeOffsetY: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    var animationOptions: js.UndefOr[Record[String, Any]] = js.undefined
    
    var avgTouches: js.UndefOr[Boolean] = js.undefined
    
    var cancelsTouchesInView: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var childrenContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var enableTrackpadTwoFingerGesture: js.UndefOr[Boolean] = js.undefined
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var failOffsetX: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    var failOffsetY: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    var friction: js.UndefOr[Double] = js.undefined
    
    var hitSlop: js.UndefOr[HitSlop] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var leftThreshold: js.UndefOr[Double] = js.undefined
    
    var maxPointers: js.UndefOr[Double] = js.undefined
    
    var minDist: js.UndefOr[Double] = js.undefined
    
    var minPointers: js.UndefOr[Double] = js.undefined
    
    var minVelocity: js.UndefOr[Double] = js.undefined
    
    var minVelocityX: js.UndefOr[Double] = js.undefined
    
    var minVelocityY: js.UndefOr[Double] = js.undefined
    
    var onActivated: js.UndefOr[js.Function1[/* event */ HandlerStateChangeEvent[Record[String, Any]], Unit]] = js.undefined
    
    var onBegan: js.UndefOr[js.Function1[/* event */ HandlerStateChangeEvent[Record[String, Any]], Unit]] = js.undefined
    
    var onCancelled: js.UndefOr[js.Function1[/* event */ HandlerStateChangeEvent[Record[String, Any]], Unit]] = js.undefined
    
    var onEnded: js.UndefOr[js.Function1[/* event */ HandlerStateChangeEvent[Record[String, Any]], Unit]] = js.undefined
    
    var onFailed: js.UndefOr[js.Function1[/* event */ HandlerStateChangeEvent[Record[String, Any]], Unit]] = js.undefined
    
    var onSwipeableClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onSwipeableLeftOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onSwipeableLeftWillOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onSwipeableOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onSwipeableRightOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onSwipeableRightWillOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onSwipeableWillClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onSwipeableWillOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var overshootFriction: js.UndefOr[Double] = js.undefined
    
    var overshootLeft: js.UndefOr[Boolean] = js.undefined
    
    var overshootRight: js.UndefOr[Boolean] = js.undefined
    
    /**
      *
      * This map describes the values to use as inputRange for extra interpolation:
      * AnimatedValue: [startValue, endValue]
      *
      * progressAnimatedValue: [0, 1]
      * dragAnimatedValue: [0, +]
      *
      * To support `rtl` flexbox layouts use `flexDirection` styling.
      * */
    var renderLeftActions: js.UndefOr[
        js.Function2[
          /* progressAnimatedValue */ AnimatedInterpolation[Double | String], 
          /* dragAnimatedValue */ AnimatedInterpolation[Double | String], 
          Node
        ]
      ] = js.undefined
    
    /**
      *
      * This map describes the values to use as inputRange for extra interpolation:
      * AnimatedValue: [startValue, endValue]
      *
      * progressAnimatedValue: [0, 1]
      * dragAnimatedValue: [0, -]
      *
      * To support `rtl` flexbox layouts use `flexDirection` styling.
      * */
    var renderRightActions: js.UndefOr[
        js.Function2[
          /* progressAnimatedValue */ AnimatedInterpolation[Double | String], 
          /* dragAnimatedValue */ AnimatedInterpolation[Double | String], 
          Node
        ]
      ] = js.undefined
    
    var rightThreshold: js.UndefOr[Double] = js.undefined
    
    var shouldCancelWhenOutside: js.UndefOr[Boolean] = js.undefined
    
    var simultaneousHandlers: js.UndefOr[Ref[Any] | js.Array[Ref[Any]]] = js.undefined
    
    var testID: js.UndefOr[String] = js.undefined
    
    var useNativeAnimations: js.UndefOr[Boolean] = js.undefined
    
    var waitFor: js.UndefOr[Ref[Any] | js.Array[Ref[Any]]] = js.undefined
  }
  object SwipeableProps {
    
    inline def apply(): SwipeableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwipeableProps]
    }
    
    extension [Self <: SwipeableProps](x: Self) {
      
      inline def setActivateAfterLongPress(value: Double): Self = StObject.set(x, "activateAfterLongPress", value.asInstanceOf[js.Any])
      
      inline def setActivateAfterLongPressUndefined: Self = StObject.set(x, "activateAfterLongPress", js.undefined)
      
      inline def setActiveOffsetX(value: Double | js.Array[Double]): Self = StObject.set(x, "activeOffsetX", value.asInstanceOf[js.Any])
      
      inline def setActiveOffsetXUndefined: Self = StObject.set(x, "activeOffsetX", js.undefined)
      
      inline def setActiveOffsetXVarargs(value: Double*): Self = StObject.set(x, "activeOffsetX", js.Array(value*))
      
      inline def setActiveOffsetY(value: Double | js.Array[Double]): Self = StObject.set(x, "activeOffsetY", value.asInstanceOf[js.Any])
      
      inline def setActiveOffsetYUndefined: Self = StObject.set(x, "activeOffsetY", js.undefined)
      
      inline def setActiveOffsetYVarargs(value: Double*): Self = StObject.set(x, "activeOffsetY", js.Array(value*))
      
      inline def setAnimationOptions(value: Record[String, Any]): Self = StObject.set(x, "animationOptions", value.asInstanceOf[js.Any])
      
      inline def setAnimationOptionsUndefined: Self = StObject.set(x, "animationOptions", js.undefined)
      
      inline def setAvgTouches(value: Boolean): Self = StObject.set(x, "avgTouches", value.asInstanceOf[js.Any])
      
      inline def setAvgTouchesUndefined: Self = StObject.set(x, "avgTouches", js.undefined)
      
      inline def setCancelsTouchesInView(value: Boolean): Self = StObject.set(x, "cancelsTouchesInView", value.asInstanceOf[js.Any])
      
      inline def setCancelsTouchesInViewUndefined: Self = StObject.set(x, "cancelsTouchesInView", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "childrenContainerStyle", value.asInstanceOf[js.Any])
      
      inline def setChildrenContainerStyleNull: Self = StObject.set(x, "childrenContainerStyle", null)
      
      inline def setChildrenContainerStyleUndefined: Self = StObject.set(x, "childrenContainerStyle", js.undefined)
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      inline def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
      
      inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      inline def setEnableTrackpadTwoFingerGesture(value: Boolean): Self = StObject.set(x, "enableTrackpadTwoFingerGesture", value.asInstanceOf[js.Any])
      
      inline def setEnableTrackpadTwoFingerGestureUndefined: Self = StObject.set(x, "enableTrackpadTwoFingerGesture", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setFailOffsetX(value: Double | js.Array[Double]): Self = StObject.set(x, "failOffsetX", value.asInstanceOf[js.Any])
      
      inline def setFailOffsetXUndefined: Self = StObject.set(x, "failOffsetX", js.undefined)
      
      inline def setFailOffsetXVarargs(value: Double*): Self = StObject.set(x, "failOffsetX", js.Array(value*))
      
      inline def setFailOffsetY(value: Double | js.Array[Double]): Self = StObject.set(x, "failOffsetY", value.asInstanceOf[js.Any])
      
      inline def setFailOffsetYUndefined: Self = StObject.set(x, "failOffsetY", js.undefined)
      
      inline def setFailOffsetYVarargs(value: Double*): Self = StObject.set(x, "failOffsetY", js.Array(value*))
      
      inline def setFriction(value: Double): Self = StObject.set(x, "friction", value.asInstanceOf[js.Any])
      
      inline def setFrictionUndefined: Self = StObject.set(x, "friction", js.undefined)
      
      inline def setHitSlop(value: HitSlop): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
      
      inline def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLeftThreshold(value: Double): Self = StObject.set(x, "leftThreshold", value.asInstanceOf[js.Any])
      
      inline def setLeftThresholdUndefined: Self = StObject.set(x, "leftThreshold", js.undefined)
      
      inline def setMaxPointers(value: Double): Self = StObject.set(x, "maxPointers", value.asInstanceOf[js.Any])
      
      inline def setMaxPointersUndefined: Self = StObject.set(x, "maxPointers", js.undefined)
      
      inline def setMinDist(value: Double): Self = StObject.set(x, "minDist", value.asInstanceOf[js.Any])
      
      inline def setMinDistUndefined: Self = StObject.set(x, "minDist", js.undefined)
      
      inline def setMinPointers(value: Double): Self = StObject.set(x, "minPointers", value.asInstanceOf[js.Any])
      
      inline def setMinPointersUndefined: Self = StObject.set(x, "minPointers", js.undefined)
      
      inline def setMinVelocity(value: Double): Self = StObject.set(x, "minVelocity", value.asInstanceOf[js.Any])
      
      inline def setMinVelocityUndefined: Self = StObject.set(x, "minVelocity", js.undefined)
      
      inline def setMinVelocityX(value: Double): Self = StObject.set(x, "minVelocityX", value.asInstanceOf[js.Any])
      
      inline def setMinVelocityXUndefined: Self = StObject.set(x, "minVelocityX", js.undefined)
      
      inline def setMinVelocityY(value: Double): Self = StObject.set(x, "minVelocityY", value.asInstanceOf[js.Any])
      
      inline def setMinVelocityYUndefined: Self = StObject.set(x, "minVelocityY", js.undefined)
      
      inline def setOnActivated(value: /* event */ HandlerStateChangeEvent[Record[String, Any]] => Callback): Self = StObject.set(x, "onActivated", js.Any.fromFunction1((t0: /* event */ HandlerStateChangeEvent[Record[String, Any]]) => value(t0).runNow()))
      
      inline def setOnActivatedUndefined: Self = StObject.set(x, "onActivated", js.undefined)
      
      inline def setOnBegan(value: /* event */ HandlerStateChangeEvent[Record[String, Any]] => Callback): Self = StObject.set(x, "onBegan", js.Any.fromFunction1((t0: /* event */ HandlerStateChangeEvent[Record[String, Any]]) => value(t0).runNow()))
      
      inline def setOnBeganUndefined: Self = StObject.set(x, "onBegan", js.undefined)
      
      inline def setOnCancelled(value: /* event */ HandlerStateChangeEvent[Record[String, Any]] => Callback): Self = StObject.set(x, "onCancelled", js.Any.fromFunction1((t0: /* event */ HandlerStateChangeEvent[Record[String, Any]]) => value(t0).runNow()))
      
      inline def setOnCancelledUndefined: Self = StObject.set(x, "onCancelled", js.undefined)
      
      inline def setOnEnded(value: /* event */ HandlerStateChangeEvent[Record[String, Any]] => Callback): Self = StObject.set(x, "onEnded", js.Any.fromFunction1((t0: /* event */ HandlerStateChangeEvent[Record[String, Any]]) => value(t0).runNow()))
      
      inline def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
      
      inline def setOnFailed(value: /* event */ HandlerStateChangeEvent[Record[String, Any]] => Callback): Self = StObject.set(x, "onFailed", js.Any.fromFunction1((t0: /* event */ HandlerStateChangeEvent[Record[String, Any]]) => value(t0).runNow()))
      
      inline def setOnFailedUndefined: Self = StObject.set(x, "onFailed", js.undefined)
      
      inline def setOnSwipeableClose(value: Callback): Self = StObject.set(x, "onSwipeableClose", value.toJsFn)
      
      inline def setOnSwipeableCloseUndefined: Self = StObject.set(x, "onSwipeableClose", js.undefined)
      
      inline def setOnSwipeableLeftOpen(value: Callback): Self = StObject.set(x, "onSwipeableLeftOpen", value.toJsFn)
      
      inline def setOnSwipeableLeftOpenUndefined: Self = StObject.set(x, "onSwipeableLeftOpen", js.undefined)
      
      inline def setOnSwipeableLeftWillOpen(value: Callback): Self = StObject.set(x, "onSwipeableLeftWillOpen", value.toJsFn)
      
      inline def setOnSwipeableLeftWillOpenUndefined: Self = StObject.set(x, "onSwipeableLeftWillOpen", js.undefined)
      
      inline def setOnSwipeableOpen(value: Callback): Self = StObject.set(x, "onSwipeableOpen", value.toJsFn)
      
      inline def setOnSwipeableOpenUndefined: Self = StObject.set(x, "onSwipeableOpen", js.undefined)
      
      inline def setOnSwipeableRightOpen(value: Callback): Self = StObject.set(x, "onSwipeableRightOpen", value.toJsFn)
      
      inline def setOnSwipeableRightOpenUndefined: Self = StObject.set(x, "onSwipeableRightOpen", js.undefined)
      
      inline def setOnSwipeableRightWillOpen(value: Callback): Self = StObject.set(x, "onSwipeableRightWillOpen", value.toJsFn)
      
      inline def setOnSwipeableRightWillOpenUndefined: Self = StObject.set(x, "onSwipeableRightWillOpen", js.undefined)
      
      inline def setOnSwipeableWillClose(value: Callback): Self = StObject.set(x, "onSwipeableWillClose", value.toJsFn)
      
      inline def setOnSwipeableWillCloseUndefined: Self = StObject.set(x, "onSwipeableWillClose", js.undefined)
      
      inline def setOnSwipeableWillOpen(value: Callback): Self = StObject.set(x, "onSwipeableWillOpen", value.toJsFn)
      
      inline def setOnSwipeableWillOpenUndefined: Self = StObject.set(x, "onSwipeableWillOpen", js.undefined)
      
      inline def setOvershootFriction(value: Double): Self = StObject.set(x, "overshootFriction", value.asInstanceOf[js.Any])
      
      inline def setOvershootFrictionUndefined: Self = StObject.set(x, "overshootFriction", js.undefined)
      
      inline def setOvershootLeft(value: Boolean): Self = StObject.set(x, "overshootLeft", value.asInstanceOf[js.Any])
      
      inline def setOvershootLeftUndefined: Self = StObject.set(x, "overshootLeft", js.undefined)
      
      inline def setOvershootRight(value: Boolean): Self = StObject.set(x, "overshootRight", value.asInstanceOf[js.Any])
      
      inline def setOvershootRightUndefined: Self = StObject.set(x, "overshootRight", js.undefined)
      
      inline def setRenderLeftActions(
        value: (/* progressAnimatedValue */ AnimatedInterpolation[Double | String], /* dragAnimatedValue */ AnimatedInterpolation[Double | String]) => Node
      ): Self = StObject.set(x, "renderLeftActions", js.Any.fromFunction2(value))
      
      inline def setRenderLeftActionsUndefined: Self = StObject.set(x, "renderLeftActions", js.undefined)
      
      inline def setRenderRightActions(
        value: (/* progressAnimatedValue */ AnimatedInterpolation[Double | String], /* dragAnimatedValue */ AnimatedInterpolation[Double | String]) => Node
      ): Self = StObject.set(x, "renderRightActions", js.Any.fromFunction2(value))
      
      inline def setRenderRightActionsUndefined: Self = StObject.set(x, "renderRightActions", js.undefined)
      
      inline def setRightThreshold(value: Double): Self = StObject.set(x, "rightThreshold", value.asInstanceOf[js.Any])
      
      inline def setRightThresholdUndefined: Self = StObject.set(x, "rightThreshold", js.undefined)
      
      inline def setShouldCancelWhenOutside(value: Boolean): Self = StObject.set(x, "shouldCancelWhenOutside", value.asInstanceOf[js.Any])
      
      inline def setShouldCancelWhenOutsideUndefined: Self = StObject.set(x, "shouldCancelWhenOutside", js.undefined)
      
      inline def setSimultaneousHandlers(value: Ref[Any] | js.Array[Ref[Any]]): Self = StObject.set(x, "simultaneousHandlers", value.asInstanceOf[js.Any])
      
      inline def setSimultaneousHandlersFunction1(value: Any | Null => Callback): Self = StObject.set(x, "simultaneousHandlers", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
      
      inline def setSimultaneousHandlersNull: Self = StObject.set(x, "simultaneousHandlers", null)
      
      inline def setSimultaneousHandlersUndefined: Self = StObject.set(x, "simultaneousHandlers", js.undefined)
      
      inline def setSimultaneousHandlersVarargs(value: Ref[Any]*): Self = StObject.set(x, "simultaneousHandlers", js.Array(value*))
      
      inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
      
      inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
      
      inline def setUseNativeAnimations(value: Boolean): Self = StObject.set(x, "useNativeAnimations", value.asInstanceOf[js.Any])
      
      inline def setUseNativeAnimationsUndefined: Self = StObject.set(x, "useNativeAnimations", js.undefined)
      
      inline def setWaitFor(value: Ref[Any] | js.Array[Ref[Any]]): Self = StObject.set(x, "waitFor", value.asInstanceOf[js.Any])
      
      inline def setWaitForFunction1(value: Any | Null => Callback): Self = StObject.set(x, "waitFor", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
      
      inline def setWaitForNull: Self = StObject.set(x, "waitFor", null)
      
      inline def setWaitForUndefined: Self = StObject.set(x, "waitFor", js.undefined)
      
      inline def setWaitForVarargs(value: Ref[Any]*): Self = StObject.set(x, "waitFor", js.Array(value*))
    }
  }
  
  trait SwipeoutButtonProps extends StObject {
    
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var style: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var text: js.UndefOr[Node] = js.undefined
  }
  object SwipeoutButtonProps {
    
    inline def apply(): SwipeoutButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwipeoutButtonProps]
    }
    
    extension [Self <: SwipeoutButtonProps](x: Self) {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setOnPress(value: Callback): Self = StObject.set(x, "onPress", value.toJsFn)
      
      inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      inline def setStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setText(value: VdomNode): Self = StObject.set(x, "text", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTextNull: Self = StObject.set(x, "text", null)
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTextVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "text", js.Array(value*))
      
      inline def setTextVdomElement(value: VdomElement): Self = StObject.set(x, "text", value.rawElement.asInstanceOf[js.Any])
    }
  }
}
