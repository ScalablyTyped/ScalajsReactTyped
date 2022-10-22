package typingsJapgolly.reactNativePopupDialog

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNative.mod.GestureResponderEvent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativePopupDialog.anon.AnimationDuration
import typingsJapgolly.reactNativePopupDialog.anon.SlideFrom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-popup-dialog", JSImport.Default)
  @js.native
  open class default () extends Dialog
  
  @JSImport("react-native-popup-dialog", "DialogButton")
  @js.native
  open class DialogButton protected () extends Component[DialogButtonProps, Any, Any] {
    def this(props: DialogButtonProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: DialogButtonProps, context: Any) = this()
  }
  
  @JSImport("react-native-popup-dialog", "DialogContent")
  @js.native
  open class DialogContent protected () extends Component[DialogContentProps, Any, Any] {
    def this(props: DialogContentProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: DialogContentProps, context: Any) = this()
  }
  
  @JSImport("react-native-popup-dialog", "DialogFooter")
  @js.native
  open class DialogFooter protected () extends Component[DialogFooterProps, Any, Any] {
    def this(props: DialogFooterProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: DialogFooterProps, context: Any) = this()
  }
  
  @JSImport("react-native-popup-dialog", "DialogTitle")
  @js.native
  open class DialogTitle protected () extends Component[DialogTitleProps, Any, Any] {
    def this(props: DialogTitleProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: DialogTitleProps, context: Any) = this()
  }
  
  @JSImport("react-native-popup-dialog", "FadeAnimation")
  @js.native
  open class FadeAnimation () extends StObject {
    def this(params: AnimationDuration) = this()
    def this(toValue: Double) = this()
    
    def createAnimations(): js.Object = js.native
    
    def toValue(toValue: Double): Unit = js.native
  }
  
  @JSImport("react-native-popup-dialog", "Overlay")
  @js.native
  open class Overlay protected () extends Component[OverlayProps, Any, Any] {
    def this(props: OverlayProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: OverlayProps, context: Any) = this()
  }
  
  @JSImport("react-native-popup-dialog", "ScaleAnimation")
  @js.native
  open class ScaleAnimation () extends StObject {
    def this(toValue: Double) = this()
    
    def createAnimations(): js.Object = js.native
    
    def toValue(toValue: Double): Unit = js.native
  }
  
  @JSImport("react-native-popup-dialog", "SlideAnimation")
  @js.native
  open class SlideAnimation () extends StObject {
    def this(params: SlideFrom) = this()
    def this(toValue: Double) = this()
    
    def createAnimations(): js.Object = js.native
    
    def toValue(toValue: Double): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactNativePopupDialog.reactNativePopupDialogStrings.left
    - typingsJapgolly.reactNativePopupDialog.reactNativePopupDialogStrings.right
    - typingsJapgolly.reactNativePopupDialog.reactNativePopupDialogStrings.center
  */
  trait AlignTypes extends StObject
  object AlignTypes {
    
    inline def center: typingsJapgolly.reactNativePopupDialog.reactNativePopupDialogStrings.center = "center".asInstanceOf[typingsJapgolly.reactNativePopupDialog.reactNativePopupDialogStrings.center]
    
    inline def left: typingsJapgolly.reactNativePopupDialog.reactNativePopupDialogStrings.left = "left".asInstanceOf[typingsJapgolly.reactNativePopupDialog.reactNativePopupDialogStrings.left]
    
    inline def right: typingsJapgolly.reactNativePopupDialog.reactNativePopupDialogStrings.right = "right".asInstanceOf[typingsJapgolly.reactNativePopupDialog.reactNativePopupDialogStrings.right]
  }
  
  @js.native
  trait Dialog extends Component[DialogProps, Any, Any] {
    
    def dismiss(): Unit = js.native
    def dismiss(onDismissed: js.Function0[Unit]): Unit = js.native
    
    def show(): Unit = js.native
    def show(onShown: js.Function0[Unit]): Unit = js.native
  }
  
  trait DialogButtonProps extends StObject {
    
    var activeOpacity: js.UndefOr[Double] = js.undefined
    
    var align: js.UndefOr[AlignTypes] = js.undefined
    
    var bordered: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var onPress: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var text: String
    
    var textStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  }
  object DialogButtonProps {
    
    inline def apply(text: String): DialogButtonProps = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[DialogButtonProps]
    }
    
    extension [Self <: DialogButtonProps](x: Self) {
      
      inline def setActiveOpacity(value: Double): Self = StObject.set(x, "activeOpacity", value.asInstanceOf[js.Any])
      
      inline def setActiveOpacityUndefined: Self = StObject.set(x, "activeOpacity", js.undefined)
      
      inline def setAlign(value: AlignTypes): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setBordered(value: Boolean): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
      
      inline def setBorderedUndefined: Self = StObject.set(x, "bordered", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setOnPress(value: /* event */ GestureResponderEvent => Callback): Self = StObject.set(x, "onPress", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
      
      inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
      
      inline def setTextStyleNull: Self = StObject.set(x, "textStyle", null)
      
      inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    }
  }
  
  trait DialogContentProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object DialogContentProps {
    
    inline def apply(): DialogContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DialogContentProps]
    }
    
    extension [Self <: DialogContentProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait DialogFooterProps extends StObject {
    
    var bordered: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object DialogFooterProps {
    
    inline def apply(): DialogFooterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DialogFooterProps]
    }
    
    extension [Self <: DialogFooterProps](x: Self) {
      
      inline def setBordered(value: Boolean): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
      
      inline def setBorderedUndefined: Self = StObject.set(x, "bordered", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait DialogProps extends StObject {
    
    var animationDuration: js.UndefOr[Double] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var dialogAnimation: js.UndefOr[FadeAnimation | ScaleAnimation | SlideAnimation] = js.undefined
    
    var dialogStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var dialogTitle: js.UndefOr[Any] = js.undefined
    
    var footer: js.UndefOr[Any] = js.undefined
    
    var hasOverlay: js.UndefOr[Boolean] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onHardwareBackPress: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onTouchOutside: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var overlayBackgroundColor: js.UndefOr[String] = js.undefined
    
    var overlayOpacity: js.UndefOr[Double] = js.undefined
    
    var overlayPointerEvents: js.UndefOr[OverlayPointerEventTypes] = js.undefined
    
    var rounded: js.UndefOr[Boolean] = js.undefined
    
    var useNativeDriver: js.UndefOr[Boolean] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object DialogProps {
    
    inline def apply(): DialogProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DialogProps]
    }
    
    extension [Self <: DialogProps](x: Self) {
      
      inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      inline def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
      
      inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      inline def setDialogAnimation(value: FadeAnimation | ScaleAnimation | SlideAnimation): Self = StObject.set(x, "dialogAnimation", value.asInstanceOf[js.Any])
      
      inline def setDialogAnimationUndefined: Self = StObject.set(x, "dialogAnimation", js.undefined)
      
      inline def setDialogStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "dialogStyle", value.asInstanceOf[js.Any])
      
      inline def setDialogStyleNull: Self = StObject.set(x, "dialogStyle", null)
      
      inline def setDialogStyleUndefined: Self = StObject.set(x, "dialogStyle", js.undefined)
      
      inline def setDialogTitle(value: Any): Self = StObject.set(x, "dialogTitle", value.asInstanceOf[js.Any])
      
      inline def setDialogTitleUndefined: Self = StObject.set(x, "dialogTitle", js.undefined)
      
      inline def setFooter(value: Any): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setHasOverlay(value: Boolean): Self = StObject.set(x, "hasOverlay", value.asInstanceOf[js.Any])
      
      inline def setHasOverlayUndefined: Self = StObject.set(x, "hasOverlay", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setOnDismiss(value: Callback): Self = StObject.set(x, "onDismiss", value.toJsFn)
      
      inline def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      inline def setOnHardwareBackPress(value: CallbackTo[Boolean]): Self = StObject.set(x, "onHardwareBackPress", value.toJsFn)
      
      inline def setOnHardwareBackPressUndefined: Self = StObject.set(x, "onHardwareBackPress", js.undefined)
      
      inline def setOnShow(value: Callback): Self = StObject.set(x, "onShow", value.toJsFn)
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setOnTouchOutside(value: Callback): Self = StObject.set(x, "onTouchOutside", value.toJsFn)
      
      inline def setOnTouchOutsideUndefined: Self = StObject.set(x, "onTouchOutside", js.undefined)
      
      inline def setOverlayBackgroundColor(value: String): Self = StObject.set(x, "overlayBackgroundColor", value.asInstanceOf[js.Any])
      
      inline def setOverlayBackgroundColorUndefined: Self = StObject.set(x, "overlayBackgroundColor", js.undefined)
      
      inline def setOverlayOpacity(value: Double): Self = StObject.set(x, "overlayOpacity", value.asInstanceOf[js.Any])
      
      inline def setOverlayOpacityUndefined: Self = StObject.set(x, "overlayOpacity", js.undefined)
      
      inline def setOverlayPointerEvents(value: OverlayPointerEventTypes): Self = StObject.set(x, "overlayPointerEvents", value.asInstanceOf[js.Any])
      
      inline def setOverlayPointerEventsUndefined: Self = StObject.set(x, "overlayPointerEvents", js.undefined)
      
      inline def setRounded(value: Boolean): Self = StObject.set(x, "rounded", value.asInstanceOf[js.Any])
      
      inline def setRoundedUndefined: Self = StObject.set(x, "rounded", js.undefined)
      
      inline def setUseNativeDriver(value: Boolean): Self = StObject.set(x, "useNativeDriver", value.asInstanceOf[js.Any])
      
      inline def setUseNativeDriverUndefined: Self = StObject.set(x, "useNativeDriver", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait DialogTitleProps extends StObject {
    
    var align: js.UndefOr[AlignTypes] = js.undefined
    
    var hasTitleBar: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var textStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var title: String
  }
  object DialogTitleProps {
    
    inline def apply(title: String): DialogTitleProps = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[DialogTitleProps]
    }
    
    extension [Self <: DialogTitleProps](x: Self) {
      
      inline def setAlign(value: AlignTypes): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setHasTitleBar(value: Boolean): Self = StObject.set(x, "hasTitleBar", value.asInstanceOf[js.Any])
      
      inline def setHasTitleBarUndefined: Self = StObject.set(x, "hasTitleBar", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
      
      inline def setTextStyleNull: Self = StObject.set(x, "textStyle", null)
      
      inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactNativePopupDialog.reactNativePopupDialogStrings.auto
    - typingsJapgolly.reactNativePopupDialog.reactNativePopupDialogStrings.none
  */
  trait OverlayPointerEventTypes extends StObject
  object OverlayPointerEventTypes {
    
    inline def auto: typingsJapgolly.reactNativePopupDialog.reactNativePopupDialogStrings.auto = "auto".asInstanceOf[typingsJapgolly.reactNativePopupDialog.reactNativePopupDialogStrings.auto]
    
    inline def none: typingsJapgolly.reactNativePopupDialog.reactNativePopupDialogStrings.none = "none".asInstanceOf[typingsJapgolly.reactNativePopupDialog.reactNativePopupDialogStrings.none]
  }
  
  trait OverlayProps extends StObject {
    
    var animationDuration: js.UndefOr[Double] = js.undefined
    
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    def onPress(event: GestureResponderEvent): Unit
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var pointerEvents: js.UndefOr[String] = js.undefined
    
    var showOverlay: js.UndefOr[Boolean] = js.undefined
    
    var useNativeDriver: js.UndefOr[Boolean] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object OverlayProps {
    
    inline def apply(onPress: GestureResponderEvent => Callback): OverlayProps = {
      val __obj = js.Dynamic.literal(onPress = js.Any.fromFunction1((t0: GestureResponderEvent) => onPress(t0).runNow()))
      __obj.asInstanceOf[OverlayProps]
    }
    
    extension [Self <: OverlayProps](x: Self) {
      
      inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setOnPress(value: GestureResponderEvent => Callback): Self = StObject.set(x, "onPress", js.Any.fromFunction1((t0: GestureResponderEvent) => value(t0).runNow()))
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setPointerEvents(value: String): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
      
      inline def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
      
      inline def setShowOverlay(value: Boolean): Self = StObject.set(x, "showOverlay", value.asInstanceOf[js.Any])
      
      inline def setShowOverlayUndefined: Self = StObject.set(x, "showOverlay", js.undefined)
      
      inline def setUseNativeDriver(value: Boolean): Self = StObject.set(x, "useNativeDriver", value.asInstanceOf[js.Any])
      
      inline def setUseNativeDriverUndefined: Self = StObject.set(x, "useNativeDriver", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactNativePopupDialog.reactNativePopupDialogStrings.top
    - typingsJapgolly.reactNativePopupDialog.reactNativePopupDialogStrings.bottom
    - typingsJapgolly.reactNativePopupDialog.reactNativePopupDialogStrings.left
    - typingsJapgolly.reactNativePopupDialog.reactNativePopupDialogStrings.right
  */
  trait SlideFromTypes extends StObject
  object SlideFromTypes {
    
    inline def bottom: typingsJapgolly.reactNativePopupDialog.reactNativePopupDialogStrings.bottom = "bottom".asInstanceOf[typingsJapgolly.reactNativePopupDialog.reactNativePopupDialogStrings.bottom]
    
    inline def left: typingsJapgolly.reactNativePopupDialog.reactNativePopupDialogStrings.left = "left".asInstanceOf[typingsJapgolly.reactNativePopupDialog.reactNativePopupDialogStrings.left]
    
    inline def right: typingsJapgolly.reactNativePopupDialog.reactNativePopupDialogStrings.right = "right".asInstanceOf[typingsJapgolly.reactNativePopupDialog.reactNativePopupDialogStrings.right]
    
    inline def top: typingsJapgolly.reactNativePopupDialog.reactNativePopupDialogStrings.top = "top".asInstanceOf[typingsJapgolly.reactNativePopupDialog.reactNativePopupDialogStrings.top]
  }
}
