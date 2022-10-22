package typingsJapgolly.reactNativeModal

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNative.mod.Animated.ValueXY
import typingsJapgolly.reactNative.mod.EmitterSubscription
import typingsJapgolly.reactNative.mod.NativeSyntheticEvent
import typingsJapgolly.reactNative.mod.PanResponderGestureState
import typingsJapgolly.reactNative.mod.PanResponderInstance
import typingsJapgolly.reactNative.mod.ViewProps
import typingsJapgolly.reactNativeModal.anon.AnimationIn
import typingsJapgolly.reactNativeModal.anon.AnimationInTiming
import typingsJapgolly.reactNativeModal.anon.IsVisible
import typingsJapgolly.reactNativeModal.anon.ReadonlyModalProps
import typingsJapgolly.reactNativeModal.distTypesMod.Direction
import typingsJapgolly.reactNativeModal.distTypesMod.GestureResponderEvent
import typingsJapgolly.reactNativeModal.distTypesMod.OnOrientationChange
import typingsJapgolly.reactNativeModal.distTypesMod.OrNull
import typingsJapgolly.reactNativeModal.distTypesMod.PresentationStyle
import typingsJapgolly.reactNativeModal.reactNativeModalStrings.`landscape-left`
import typingsJapgolly.reactNativeModal.reactNativeModalStrings.`landscape-right`
import typingsJapgolly.reactNativeModal.reactNativeModalStrings.`portrait-upside-down`
import typingsJapgolly.reactNativeModal.reactNativeModalStrings.down
import typingsJapgolly.reactNativeModal.reactNativeModalStrings.landscape
import typingsJapgolly.reactNativeModal.reactNativeModalStrings.left
import typingsJapgolly.reactNativeModal.reactNativeModalStrings.portrait
import typingsJapgolly.reactNativeModal.reactNativeModalStrings.right
import typingsJapgolly.reactNativeModal.reactNativeModalStrings.up
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distModalMod {
  
  @JSImport("react-native-modal/dist/modal", JSImport.Default)
  @js.native
  open class default protected () extends ReactNativeModal {
    def this(props: ModalProps) = this()
  }
  /* static members */
  object default {
    
    @JSImport("react-native-modal/dist/modal", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-modal/dist/modal", "default.defaultProps")
    @js.native
    def defaultProps: AnimationInTiming = js.native
    inline def defaultProps_=(x: AnimationInTiming): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    inline def getDerivedStateFromProps(nextProps: ReadonlyModalProps, state: State): IsVisible | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[IsVisible | Null]
    
    @JSImport("react-native-modal/dist/modal", "default.propTypes")
    @js.native
    def propTypes: AnimationIn = js.native
    inline def propTypes_=(x: AnimationIn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-native-modal/dist/modal", "ReactNativeModal")
  @js.native
  open class ReactNativeModal protected () extends Component[ModalProps, State, Any] {
    def this(props: ModalProps) = this()
    
    var animationIn: String = js.native
    
    var animationOut: String = js.native
    
    var backdropRef: Any = js.native
    
    def buildPanResponder(): Unit = js.native
    
    def calcDistancePercentage(gestureState: PanResponderGestureState): Double = js.native
    
    def close(): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MReactNativeModal(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MReactNativeModal(prevProps: ModalProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MReactNativeModal(): Unit = js.native
    
    var contentRef: Any = js.native
    
    def createAnimationEventForSwipe(): js.Function1[/* repeated */ Any, Unit] = js.native
    
    var currentSwipingDirection: OrNull[Direction] = js.native
    
    var didUpdateDimensionsEmitter: OrNull[EmitterSubscription] = js.native
    
    def getAccDistancePerDirection(gestureState: PanResponderGestureState): Double = js.native
    
    def getDeviceHeight(): Double = js.native
    
    def getDeviceWidth(): Double = js.native
    
    def getSwipingDirection(gestureState: PanResponderGestureState): left | right | up | down = js.native
    
    def handleDimensionsUpdate(): Unit = js.native
    
    var inSwipeClosingState: Boolean = js.native
    
    var interactionHandle: OrNull[Double] = js.native
    
    def isDirectionIncluded(direction: Direction): Boolean = js.native
    
    def isSwipeDirectionAllowed(hasDyDx: PanResponderGestureState): Boolean = js.native
    
    var isTransitioning: Boolean = js.native
    
    def makeBackdrop(): Element | Null = js.native
    
    def onBackButtonPress(): Boolean = js.native
    
    def open(): Unit = js.native
    
    var panResponder: OrNull[PanResponderInstance] = js.native
    
    def shouldPropagateSwipe(evt: GestureResponderEvent, gestureState: PanResponderGestureState): Boolean = js.native
  }
  /* static members */
  object ReactNativeModal {
    
    @JSImport("react-native-modal/dist/modal", "ReactNativeModal")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-modal/dist/modal", "ReactNativeModal.defaultProps")
    @js.native
    def defaultProps: AnimationInTiming = js.native
    inline def defaultProps_=(x: AnimationInTiming): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    inline def getDerivedStateFromProps(nextProps: ReadonlyModalProps, state: State): IsVisible | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[IsVisible | Null]
    
    @JSImport("react-native-modal/dist/modal", "ReactNativeModal.propTypes")
    @js.native
    def propTypes: AnimationIn = js.native
    inline def propTypes_=(x: AnimationIn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  trait ModalProps
    extends StObject
       with ViewProps {
    
    var animationIn: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63, starting with typingsJapgolly.reactNativeModal.reactNativeModalStrings.bounce, typingsJapgolly.reactNativeModal.reactNativeModalStrings.flash, typingsJapgolly.reactNativeModal.reactNativeModalStrings.jello */ Any
    
    var animationInTiming: Double
    
    var animationOut: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63, starting with typingsJapgolly.reactNativeModal.reactNativeModalStrings.bounce, typingsJapgolly.reactNativeModal.reactNativeModalStrings.flash, typingsJapgolly.reactNativeModal.reactNativeModalStrings.jello */ Any
    
    var animationOutTiming: Double
    
    var avoidKeyboard: Boolean
    
    var backdropColor: String
    
    var backdropOpacity: Double
    
    var backdropTransitionInTiming: Double
    
    var backdropTransitionOutTiming: Double
    
    @JSName("children")
    var children_ModalProps: Node
    
    var coverScreen: Boolean
    
    var customBackdrop: Node
    
    var deviceHeight: Double | Null
    
    var deviceWidth: Double | Null
    
    var hardwareAccelerated: js.UndefOr[Boolean] = js.undefined
    
    var hasBackdrop: Boolean
    
    var hideModalContentWhileAnimating: Boolean
    
    var isVisible: Boolean
    
    def onBackButtonPress(): Unit
    
    def onBackdropPress(): Unit
    
    var onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    def onModalHide(): Unit
    
    def onModalShow(): Unit
    
    def onModalWillHide(): Unit
    
    def onModalWillShow(): Unit
    
    var onOrientationChange: js.UndefOr[OnOrientationChange] = js.undefined
    
    var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onSwipeCancel: js.UndefOr[js.Function1[/* gestureState */ PanResponderGestureState, Unit]] = js.undefined
    
    var onSwipeComplete: js.UndefOr[
        js.Function2[
          /* params */ OnSwipeCompleteParams, 
          /* gestureState */ PanResponderGestureState, 
          Unit
        ]
      ] = js.undefined
    
    var onSwipeMove: js.UndefOr[
        js.Function2[/* percentageShown */ Double, /* gestureState */ PanResponderGestureState, Unit]
      ] = js.undefined
    
    var onSwipeStart: js.UndefOr[js.Function1[/* gestureState */ PanResponderGestureState, Unit]] = js.undefined
    
    var panResponderThreshold: Double
    
    var presentationStyle: js.UndefOr[PresentationStyle] = js.undefined
    
    var propagateSwipe: Boolean | (js.Function2[
        /* event */ GestureResponderEvent, 
        /* gestureState */ PanResponderGestureState, 
        Boolean
      ])
    
    var scrollHorizontal: Boolean
    
    var scrollOffset: Double
    
    var scrollOffsetMax: Double
    
    var scrollTo: OrNull[js.Function1[/* e */ Any, Unit]]
    
    var statusBarTranslucent: Boolean
    
    var supportedOrientations: js.Array[
        landscape | portrait | `portrait-upside-down` | `landscape-left` | `landscape-right`
      ]
    
    var swipeDirection: js.UndefOr[Direction | js.Array[Direction]] = js.undefined
    
    var swipeThreshold: Double
    
    var useNativeDriver: Boolean
    
    var useNativeDriverForBackdrop: js.UndefOr[Boolean] = js.undefined
  }
  object ModalProps {
    
    inline def apply(
      animationIn: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63, starting with typingsJapgolly.reactNativeModal.reactNativeModalStrings.bounce, typingsJapgolly.reactNativeModal.reactNativeModalStrings.flash, typingsJapgolly.reactNativeModal.reactNativeModalStrings.jello */ Any,
      animationInTiming: Double,
      animationOut: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63, starting with typingsJapgolly.reactNativeModal.reactNativeModalStrings.bounce, typingsJapgolly.reactNativeModal.reactNativeModalStrings.flash, typingsJapgolly.reactNativeModal.reactNativeModalStrings.jello */ Any,
      animationOutTiming: Double,
      avoidKeyboard: Boolean,
      backdropColor: String,
      backdropOpacity: Double,
      backdropTransitionInTiming: Double,
      backdropTransitionOutTiming: Double,
      coverScreen: Boolean,
      hasBackdrop: Boolean,
      hideModalContentWhileAnimating: Boolean,
      isVisible: Boolean,
      onBackButtonPress: Callback,
      onBackdropPress: Callback,
      onModalHide: Callback,
      onModalShow: Callback,
      onModalWillHide: Callback,
      onModalWillShow: Callback,
      panResponderThreshold: Double,
      propagateSwipe: Boolean | (js.Function2[
          /* event */ GestureResponderEvent, 
          /* gestureState */ PanResponderGestureState, 
          Boolean
        ]),
      scrollHorizontal: Boolean,
      scrollOffset: Double,
      scrollOffsetMax: Double,
      statusBarTranslucent: Boolean,
      supportedOrientations: js.Array[
          landscape | portrait | `portrait-upside-down` | `landscape-left` | `landscape-right`
        ],
      swipeThreshold: Double,
      useNativeDriver: Boolean
    ): ModalProps = {
      val __obj = js.Dynamic.literal(animationIn = animationIn.asInstanceOf[js.Any], animationInTiming = animationInTiming.asInstanceOf[js.Any], animationOut = animationOut.asInstanceOf[js.Any], animationOutTiming = animationOutTiming.asInstanceOf[js.Any], avoidKeyboard = avoidKeyboard.asInstanceOf[js.Any], backdropColor = backdropColor.asInstanceOf[js.Any], backdropOpacity = backdropOpacity.asInstanceOf[js.Any], backdropTransitionInTiming = backdropTransitionInTiming.asInstanceOf[js.Any], backdropTransitionOutTiming = backdropTransitionOutTiming.asInstanceOf[js.Any], coverScreen = coverScreen.asInstanceOf[js.Any], hasBackdrop = hasBackdrop.asInstanceOf[js.Any], hideModalContentWhileAnimating = hideModalContentWhileAnimating.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], onBackButtonPress = onBackButtonPress.toJsFn, onBackdropPress = onBackdropPress.toJsFn, onModalHide = onModalHide.toJsFn, onModalShow = onModalShow.toJsFn, onModalWillHide = onModalWillHide.toJsFn, onModalWillShow = onModalWillShow.toJsFn, panResponderThreshold = panResponderThreshold.asInstanceOf[js.Any], propagateSwipe = propagateSwipe.asInstanceOf[js.Any], scrollHorizontal = scrollHorizontal.asInstanceOf[js.Any], scrollOffset = scrollOffset.asInstanceOf[js.Any], scrollOffsetMax = scrollOffsetMax.asInstanceOf[js.Any], statusBarTranslucent = statusBarTranslucent.asInstanceOf[js.Any], supportedOrientations = supportedOrientations.asInstanceOf[js.Any], swipeThreshold = swipeThreshold.asInstanceOf[js.Any], useNativeDriver = useNativeDriver.asInstanceOf[js.Any], children = null, customBackdrop = null, deviceHeight = null, deviceWidth = null, scrollTo = null)
      __obj.asInstanceOf[ModalProps]
    }
    
    extension [Self <: ModalProps](x: Self) {
      
      inline def setAnimationIn(
        value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63, starting with typingsJapgolly.reactNativeModal.reactNativeModalStrings.bounce, typingsJapgolly.reactNativeModal.reactNativeModalStrings.flash, typingsJapgolly.reactNativeModal.reactNativeModalStrings.jello */ Any
      ): Self = StObject.set(x, "animationIn", value.asInstanceOf[js.Any])
      
      inline def setAnimationInTiming(value: Double): Self = StObject.set(x, "animationInTiming", value.asInstanceOf[js.Any])
      
      inline def setAnimationOut(
        value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63, starting with typingsJapgolly.reactNativeModal.reactNativeModalStrings.bounce, typingsJapgolly.reactNativeModal.reactNativeModalStrings.flash, typingsJapgolly.reactNativeModal.reactNativeModalStrings.jello */ Any
      ): Self = StObject.set(x, "animationOut", value.asInstanceOf[js.Any])
      
      inline def setAnimationOutTiming(value: Double): Self = StObject.set(x, "animationOutTiming", value.asInstanceOf[js.Any])
      
      inline def setAvoidKeyboard(value: Boolean): Self = StObject.set(x, "avoidKeyboard", value.asInstanceOf[js.Any])
      
      inline def setBackdropColor(value: String): Self = StObject.set(x, "backdropColor", value.asInstanceOf[js.Any])
      
      inline def setBackdropOpacity(value: Double): Self = StObject.set(x, "backdropOpacity", value.asInstanceOf[js.Any])
      
      inline def setBackdropTransitionInTiming(value: Double): Self = StObject.set(x, "backdropTransitionInTiming", value.asInstanceOf[js.Any])
      
      inline def setBackdropTransitionOutTiming(value: Double): Self = StObject.set(x, "backdropTransitionOutTiming", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setCoverScreen(value: Boolean): Self = StObject.set(x, "coverScreen", value.asInstanceOf[js.Any])
      
      inline def setCustomBackdrop(value: VdomNode): Self = StObject.set(x, "customBackdrop", value.rawNode.asInstanceOf[js.Any])
      
      inline def setCustomBackdropNull: Self = StObject.set(x, "customBackdrop", null)
      
      inline def setCustomBackdropVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "customBackdrop", js.Array(value*))
      
      inline def setCustomBackdropVdomElement(value: VdomElement): Self = StObject.set(x, "customBackdrop", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDeviceHeight(value: Double): Self = StObject.set(x, "deviceHeight", value.asInstanceOf[js.Any])
      
      inline def setDeviceHeightNull: Self = StObject.set(x, "deviceHeight", null)
      
      inline def setDeviceWidth(value: Double): Self = StObject.set(x, "deviceWidth", value.asInstanceOf[js.Any])
      
      inline def setDeviceWidthNull: Self = StObject.set(x, "deviceWidth", null)
      
      inline def setHardwareAccelerated(value: Boolean): Self = StObject.set(x, "hardwareAccelerated", value.asInstanceOf[js.Any])
      
      inline def setHardwareAcceleratedUndefined: Self = StObject.set(x, "hardwareAccelerated", js.undefined)
      
      inline def setHasBackdrop(value: Boolean): Self = StObject.set(x, "hasBackdrop", value.asInstanceOf[js.Any])
      
      inline def setHideModalContentWhileAnimating(value: Boolean): Self = StObject.set(x, "hideModalContentWhileAnimating", value.asInstanceOf[js.Any])
      
      inline def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
      
      inline def setOnBackButtonPress(value: Callback): Self = StObject.set(x, "onBackButtonPress", value.toJsFn)
      
      inline def setOnBackdropPress(value: Callback): Self = StObject.set(x, "onBackdropPress", value.toJsFn)
      
      inline def setOnDismiss(value: Callback): Self = StObject.set(x, "onDismiss", value.toJsFn)
      
      inline def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      inline def setOnModalHide(value: Callback): Self = StObject.set(x, "onModalHide", value.toJsFn)
      
      inline def setOnModalShow(value: Callback): Self = StObject.set(x, "onModalShow", value.toJsFn)
      
      inline def setOnModalWillHide(value: Callback): Self = StObject.set(x, "onModalWillHide", value.toJsFn)
      
      inline def setOnModalWillShow(value: Callback): Self = StObject.set(x, "onModalWillShow", value.toJsFn)
      
      inline def setOnOrientationChange(value: /* orientation */ NativeSyntheticEvent[Any] => Callback): Self = StObject.set(x, "onOrientationChange", js.Any.fromFunction1((t0: /* orientation */ NativeSyntheticEvent[Any]) => value(t0).runNow()))
      
      inline def setOnOrientationChangeUndefined: Self = StObject.set(x, "onOrientationChange", js.undefined)
      
      inline def setOnShow(value: Callback): Self = StObject.set(x, "onShow", value.toJsFn)
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setOnSwipeCancel(value: /* gestureState */ PanResponderGestureState => Callback): Self = StObject.set(x, "onSwipeCancel", js.Any.fromFunction1((t0: /* gestureState */ PanResponderGestureState) => value(t0).runNow()))
      
      inline def setOnSwipeCancelUndefined: Self = StObject.set(x, "onSwipeCancel", js.undefined)
      
      inline def setOnSwipeComplete(
        value: (/* params */ OnSwipeCompleteParams, /* gestureState */ PanResponderGestureState) => Callback
      ): Self = StObject.set(x, "onSwipeComplete", js.Any.fromFunction2((t0: /* params */ OnSwipeCompleteParams, t1: /* gestureState */ PanResponderGestureState) => (value(t0, t1)).runNow()))
      
      inline def setOnSwipeCompleteUndefined: Self = StObject.set(x, "onSwipeComplete", js.undefined)
      
      inline def setOnSwipeMove(value: (/* percentageShown */ Double, /* gestureState */ PanResponderGestureState) => Callback): Self = StObject.set(x, "onSwipeMove", js.Any.fromFunction2((t0: /* percentageShown */ Double, t1: /* gestureState */ PanResponderGestureState) => (value(t0, t1)).runNow()))
      
      inline def setOnSwipeMoveUndefined: Self = StObject.set(x, "onSwipeMove", js.undefined)
      
      inline def setOnSwipeStart(value: /* gestureState */ PanResponderGestureState => Callback): Self = StObject.set(x, "onSwipeStart", js.Any.fromFunction1((t0: /* gestureState */ PanResponderGestureState) => value(t0).runNow()))
      
      inline def setOnSwipeStartUndefined: Self = StObject.set(x, "onSwipeStart", js.undefined)
      
      inline def setPanResponderThreshold(value: Double): Self = StObject.set(x, "panResponderThreshold", value.asInstanceOf[js.Any])
      
      inline def setPresentationStyle(value: PresentationStyle): Self = StObject.set(x, "presentationStyle", value.asInstanceOf[js.Any])
      
      inline def setPresentationStyleUndefined: Self = StObject.set(x, "presentationStyle", js.undefined)
      
      inline def setPropagateSwipe(
        value: Boolean | (js.Function2[
              /* event */ GestureResponderEvent, 
              /* gestureState */ PanResponderGestureState, 
              Boolean
            ])
      ): Self = StObject.set(x, "propagateSwipe", value.asInstanceOf[js.Any])
      
      inline def setPropagateSwipeFunction2(value: (/* event */ GestureResponderEvent, /* gestureState */ PanResponderGestureState) => Boolean): Self = StObject.set(x, "propagateSwipe", js.Any.fromFunction2(value))
      
      inline def setScrollHorizontal(value: Boolean): Self = StObject.set(x, "scrollHorizontal", value.asInstanceOf[js.Any])
      
      inline def setScrollOffset(value: Double): Self = StObject.set(x, "scrollOffset", value.asInstanceOf[js.Any])
      
      inline def setScrollOffsetMax(value: Double): Self = StObject.set(x, "scrollOffsetMax", value.asInstanceOf[js.Any])
      
      inline def setScrollTo(value: /* e */ Any => Callback): Self = StObject.set(x, "scrollTo", js.Any.fromFunction1((t0: /* e */ Any) => value(t0).runNow()))
      
      inline def setScrollToNull: Self = StObject.set(x, "scrollTo", null)
      
      inline def setStatusBarTranslucent(value: Boolean): Self = StObject.set(x, "statusBarTranslucent", value.asInstanceOf[js.Any])
      
      inline def setSupportedOrientations(
        value: js.Array[
              landscape | portrait | `portrait-upside-down` | `landscape-left` | `landscape-right`
            ]
      ): Self = StObject.set(x, "supportedOrientations", value.asInstanceOf[js.Any])
      
      inline def setSupportedOrientationsVarargs(value: (landscape | portrait | `portrait-upside-down` | `landscape-left` | `landscape-right`)*): Self = StObject.set(x, "supportedOrientations", js.Array(value*))
      
      inline def setSwipeDirection(value: Direction | js.Array[Direction]): Self = StObject.set(x, "swipeDirection", value.asInstanceOf[js.Any])
      
      inline def setSwipeDirectionUndefined: Self = StObject.set(x, "swipeDirection", js.undefined)
      
      inline def setSwipeDirectionVarargs(value: Direction*): Self = StObject.set(x, "swipeDirection", js.Array(value*))
      
      inline def setSwipeThreshold(value: Double): Self = StObject.set(x, "swipeThreshold", value.asInstanceOf[js.Any])
      
      inline def setUseNativeDriver(value: Boolean): Self = StObject.set(x, "useNativeDriver", value.asInstanceOf[js.Any])
      
      inline def setUseNativeDriverForBackdrop(value: Boolean): Self = StObject.set(x, "useNativeDriverForBackdrop", value.asInstanceOf[js.Any])
      
      inline def setUseNativeDriverForBackdropUndefined: Self = StObject.set(x, "useNativeDriverForBackdrop", js.undefined)
    }
  }
  
  trait OnSwipeCompleteParams extends StObject {
    
    var swipingDirection: Direction
  }
  object OnSwipeCompleteParams {
    
    inline def apply(swipingDirection: Direction): OnSwipeCompleteParams = {
      val __obj = js.Dynamic.literal(swipingDirection = swipingDirection.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnSwipeCompleteParams]
    }
    
    extension [Self <: OnSwipeCompleteParams](x: Self) {
      
      inline def setSwipingDirection(value: Direction): Self = StObject.set(x, "swipingDirection", value.asInstanceOf[js.Any])
    }
  }
  
  trait State extends StObject {
    
    var deviceHeight: Double
    
    var deviceWidth: Double
    
    var isSwipeable: Boolean
    
    var isVisible: Boolean
    
    var pan: OrNull[ValueXY]
    
    var showContent: Boolean
  }
  object State {
    
    inline def apply(
      deviceHeight: Double,
      deviceWidth: Double,
      isSwipeable: Boolean,
      isVisible: Boolean,
      showContent: Boolean
    ): State = {
      val __obj = js.Dynamic.literal(deviceHeight = deviceHeight.asInstanceOf[js.Any], deviceWidth = deviceWidth.asInstanceOf[js.Any], isSwipeable = isSwipeable.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], showContent = showContent.asInstanceOf[js.Any], pan = null)
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setDeviceHeight(value: Double): Self = StObject.set(x, "deviceHeight", value.asInstanceOf[js.Any])
      
      inline def setDeviceWidth(value: Double): Self = StObject.set(x, "deviceWidth", value.asInstanceOf[js.Any])
      
      inline def setIsSwipeable(value: Boolean): Self = StObject.set(x, "isSwipeable", value.asInstanceOf[js.Any])
      
      inline def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
      
      inline def setPan(value: OrNull[ValueXY]): Self = StObject.set(x, "pan", value.asInstanceOf[js.Any])
      
      inline def setPanNull: Self = StObject.set(x, "pan", null)
      
      inline def setShowContent(value: Boolean): Self = StObject.set(x, "showContent", value.asInstanceOf[js.Any])
    }
  }
}
