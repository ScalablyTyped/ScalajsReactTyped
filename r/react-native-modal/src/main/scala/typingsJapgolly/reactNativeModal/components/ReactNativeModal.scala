package typingsJapgolly.reactNativeModal.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactNative.mod.PanResponderGestureState
import typingsJapgolly.reactNativeModal.distModalMod.ModalProps
import typingsJapgolly.reactNativeModal.distTypesMod.GestureResponderEvent
import typingsJapgolly.reactNativeModal.mod.default
import typingsJapgolly.reactNativeModal.reactNativeModalStrings.`landscape-left`
import typingsJapgolly.reactNativeModal.reactNativeModalStrings.`landscape-right`
import typingsJapgolly.reactNativeModal.reactNativeModalStrings.`portrait-upside-down`
import typingsJapgolly.reactNativeModal.reactNativeModalStrings.landscape
import typingsJapgolly.reactNativeModal.reactNativeModalStrings.portrait
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeModal {
  
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
  ): SharedBuilder_ModalProps1950666618[default] = {
    val __props = js.Dynamic.literal(animationIn = animationIn.asInstanceOf[js.Any], animationInTiming = animationInTiming.asInstanceOf[js.Any], animationOut = animationOut.asInstanceOf[js.Any], animationOutTiming = animationOutTiming.asInstanceOf[js.Any], avoidKeyboard = avoidKeyboard.asInstanceOf[js.Any], backdropColor = backdropColor.asInstanceOf[js.Any], backdropOpacity = backdropOpacity.asInstanceOf[js.Any], backdropTransitionInTiming = backdropTransitionInTiming.asInstanceOf[js.Any], backdropTransitionOutTiming = backdropTransitionOutTiming.asInstanceOf[js.Any], coverScreen = coverScreen.asInstanceOf[js.Any], hasBackdrop = hasBackdrop.asInstanceOf[js.Any], hideModalContentWhileAnimating = hideModalContentWhileAnimating.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], onBackButtonPress = onBackButtonPress.toJsFn, onBackdropPress = onBackdropPress.toJsFn, onModalHide = onModalHide.toJsFn, onModalShow = onModalShow.toJsFn, onModalWillHide = onModalWillHide.toJsFn, onModalWillShow = onModalWillShow.toJsFn, panResponderThreshold = panResponderThreshold.asInstanceOf[js.Any], propagateSwipe = propagateSwipe.asInstanceOf[js.Any], scrollHorizontal = scrollHorizontal.asInstanceOf[js.Any], scrollOffset = scrollOffset.asInstanceOf[js.Any], scrollOffsetMax = scrollOffsetMax.asInstanceOf[js.Any], statusBarTranslucent = statusBarTranslucent.asInstanceOf[js.Any], supportedOrientations = supportedOrientations.asInstanceOf[js.Any], swipeThreshold = swipeThreshold.asInstanceOf[js.Any], useNativeDriver = useNativeDriver.asInstanceOf[js.Any])
    new SharedBuilder_ModalProps1950666618[default](js.Array(this.component, __props.asInstanceOf[ModalProps]))
  }
  
  @JSImport("react-native-modal", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ModalProps): SharedBuilder_ModalProps1950666618[default] = new SharedBuilder_ModalProps1950666618[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
