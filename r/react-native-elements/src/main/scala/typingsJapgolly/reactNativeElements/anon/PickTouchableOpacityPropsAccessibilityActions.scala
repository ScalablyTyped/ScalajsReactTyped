package typingsJapgolly.reactNativeElements.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Component
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.reactNative.mod.AccessibilityActionEvent
import typingsJapgolly.reactNative.mod.AccessibilityActionInfo
import typingsJapgolly.reactNative.mod.AccessibilityRole
import typingsJapgolly.reactNative.mod.AccessibilityState
import typingsJapgolly.reactNative.mod.AccessibilityValue
import typingsJapgolly.reactNative.mod.BackgroundPropType
import typingsJapgolly.reactNative.mod.GestureResponderEvent
import typingsJapgolly.reactNative.mod.ImageURISource
import typingsJapgolly.reactNative.mod.Insets
import typingsJapgolly.reactNative.mod.LayoutChangeEvent
import typingsJapgolly.reactNative.mod.NativeSyntheticEvent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TVParallaxProperties
import typingsJapgolly.reactNative.mod.TargetedEvent
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.ImageComponent
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.`no-hide-descendants`
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.assertive
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.auto
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.no
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.none
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.polite
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<react-native.react-native.TouchableOpacityProps & react-native.react-native.TouchableNativeFeedbackProps & {  title :string | undefined,   icon :react-native-elements.react-native-elements/dist/icons/Icon.IconObject & react-native-vector-icons.react-native-vector-icons/Icon.IconButtonProps & {  type :string | undefined,   Component :{  contextType :react.react.Context<any> | undefined} & new <P = {}, S = {}, SS = any>(props : std.Readonly</ * import warning: RewrittenClass.unapply cls was tparam P * / any>): react.react.Component<P, S, SS> | undefined,   reverse :boolean | undefined,   raised :boolean | undefined,   containerStyle :react-native.react-native.StyleProp<react-native.react-native.ViewStyle> | undefined,   iconProps :react-native-elements.react-native-elements/dist/icons/Icon.IconProps | undefined,   reverseColor :string | undefined,   disabled :boolean | undefined,   disabledStyle :react-native.react-native.StyleProp<react-native.react-native.ViewStyle> | undefined,   solid :boolean | undefined,   brand :boolean | undefined} | undefined,   caption :react.react.ReactNode | undefined,   imageSrc :string | number | react-native.react-native.ImageURISource | std.Array<react-native.react-native.ImageURISource> | undefined,   activeOpacity :number | undefined,   containerStyle :react-native.react-native.StyleProp<react-native.react-native.ViewStyle> | undefined,   imageContainerStyle :react-native.react-native.StyleProp<react-native.react-native.ViewStyle> | undefined,   iconContainerStyle :react-native.react-native.StyleProp<react-native.react-native.ViewStyle> | undefined,   overlayContainerStyle :react-native.react-native.StyleProp<react-native.react-native.ViewStyle> | undefined,   titleStyle :react-native.react-native.StyleProp<react-native.react-native.TextStyle> | undefined,   captionStyle :react-native.react-native.StyleProp<react-native.react-native.TextStyle> | undefined,   width :number | undefined,   height :number | undefined,   featured :boolean | undefined,   contentContainerStyle :react-native.react-native.StyleProp<react-native.react-native.ViewStyle> | undefined,   titleNumberOfLines :number | undefined,   imageProps :std.Partial<react-native.react-native.ImageProps> | undefined,   ImageComponent :{  contextType :react.react.Context<any> | undefined} & new <P = {}, S = {}, SS = any>(props : std.Readonly</ * import warning: RewrittenClass.unapply cls was tparam P * / any>): react.react.Component<P, S, SS> | undefined} & std.Partial<react-native-elements.react-native-elements/dist/config.ThemeProps<react-native-elements.react-native-elements/dist/tile/Tile.TileProps>>, 'style' | 'onLayout' | 'testID' | 'width' | 'height' | 'accessible' | 'accessibilityActions' | 'accessibilityLabel' | 'accessibilityRole' | 'accessibilityState' | 'accessibilityHint' | 'accessibilityValue' | 'onAccessibilityAction' | 'accessibilityLiveRegion' | 'importantForAccessibility' | 'accessibilityElementsHidden' | 'accessibilityViewIsModal' | 'onAccessibilityEscape' | 'onAccessibilityTap' | 'onMagicTap' | 'accessibilityIgnoresInvertColors' | 'disabled' | 'onPress' | 'onLongPress' | 'activeOpacity' | 'delayLongPress' | 'delayPressIn' | 'delayPressOut' | 'hitSlop' | 'onBlur' | 'onFocus' | 'onPressIn' | 'onPressOut' | 'pressRetentionOffset' | 'hasTVPreferredFocus' | 'tvParallaxProperties' | 'touchSoundDisabled' | 'background' | 'useForeground' | 'containerStyle' | 'caption' | 'title' | 'ImageComponent' | 'icon' | 'titleStyle' | 'overlayContainerStyle' | 'imageProps' | 'contentContainerStyle' | 'iconContainerStyle' | 'imageSrc' | 'imageContainerStyle' | 'captionStyle' | 'featured' | 'titleNumberOfLines'> */
trait PickTouchableOpacityPropsAccessibilityActions extends StObject {
  
  var ImageComponent: js.UndefOr[
    TypeofComponent & (Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
      Component[
        typingsJapgolly.reactNativeElements.reactNativeElementsStrings.ImageComponent & js.Object, 
        js.Object
      ]
    ])
  ] = js.undefined
  
  var accessibilityActions: js.UndefOr[js.Array[AccessibilityActionInfo]] = js.undefined
  
  var accessibilityElementsHidden: js.UndefOr[Boolean] = js.undefined
  
  var accessibilityHint: js.UndefOr[String] = js.undefined
  
  var accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.undefined
  
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  
  var accessibilityLiveRegion: js.UndefOr[none | polite | assertive] = js.undefined
  
  var accessibilityRole: js.UndefOr[AccessibilityRole] = js.undefined
  
  var accessibilityState: js.UndefOr[AccessibilityState] = js.undefined
  
  var accessibilityValue: js.UndefOr[AccessibilityValue] = js.undefined
  
  var accessibilityViewIsModal: js.UndefOr[Boolean] = js.undefined
  
  var accessible: js.UndefOr[Boolean] = js.undefined
  
  var activeOpacity: js.UndefOr[Double] = js.undefined
  
  var background: js.UndefOr[BackgroundPropType] = js.undefined
  
  var caption: js.UndefOr[Node] = js.undefined
  
  var captionStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var contentContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var delayLongPress: js.UndefOr[Double] = js.undefined
  
  var delayPressIn: js.UndefOr[Double] = js.undefined
  
  var delayPressOut: js.UndefOr[Double] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var featured: js.UndefOr[Boolean] = js.undefined
  
  var hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var hitSlop: js.UndefOr[Insets] = js.undefined
  
  var icon: js.UndefOr[IconObjectIconButtonProps] = js.undefined
  
  var iconContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var imageContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var imageProps: js.UndefOr[PartialImagePropsAccessibilityActions] = js.undefined
  
  var imageSrc: js.UndefOr[String | Double | ImageURISource | js.Array[ImageURISource]] = js.undefined
  
  var importantForAccessibility: js.UndefOr[auto | yes | no | `no-hide-descendants`] = js.undefined
  
  var onAccessibilityAction: js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]] = js.undefined
  
  var onAccessibilityEscape: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onAccessibilityTap: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onBlur: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TargetedEvent], Unit]] = js.undefined
  
  var onFocus: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TargetedEvent], Unit]] = js.undefined
  
  var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.undefined
  
  var onLongPress: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onMagicTap: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onPress: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onPressIn: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onPressOut: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var overlayContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var pressRetentionOffset: js.UndefOr[Insets] = js.undefined
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var testID: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var titleNumberOfLines: js.UndefOr[Double] = js.undefined
  
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var touchSoundDisabled: js.UndefOr[Boolean] = js.undefined
  
  var tvParallaxProperties: js.UndefOr[TVParallaxProperties] = js.undefined
  
  var useForeground: js.UndefOr[Boolean] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object PickTouchableOpacityPropsAccessibilityActions {
  
  inline def apply(): PickTouchableOpacityPropsAccessibilityActions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickTouchableOpacityPropsAccessibilityActions]
  }
  
  extension [Self <: PickTouchableOpacityPropsAccessibilityActions](x: Self) {
    
    inline def setAccessibilityActions(value: js.Array[AccessibilityActionInfo]): Self = StObject.set(x, "accessibilityActions", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityActionsUndefined: Self = StObject.set(x, "accessibilityActions", js.undefined)
    
    inline def setAccessibilityActionsVarargs(value: AccessibilityActionInfo*): Self = StObject.set(x, "accessibilityActions", js.Array(value*))
    
    inline def setAccessibilityElementsHidden(value: Boolean): Self = StObject.set(x, "accessibilityElementsHidden", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityElementsHiddenUndefined: Self = StObject.set(x, "accessibilityElementsHidden", js.undefined)
    
    inline def setAccessibilityHint(value: String): Self = StObject.set(x, "accessibilityHint", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityHintUndefined: Self = StObject.set(x, "accessibilityHint", js.undefined)
    
    inline def setAccessibilityIgnoresInvertColors(value: Boolean): Self = StObject.set(x, "accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityIgnoresInvertColorsUndefined: Self = StObject.set(x, "accessibilityIgnoresInvertColors", js.undefined)
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    inline def setAccessibilityLiveRegion(value: none | polite | assertive): Self = StObject.set(x, "accessibilityLiveRegion", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLiveRegionUndefined: Self = StObject.set(x, "accessibilityLiveRegion", js.undefined)
    
    inline def setAccessibilityRole(value: AccessibilityRole): Self = StObject.set(x, "accessibilityRole", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityRoleUndefined: Self = StObject.set(x, "accessibilityRole", js.undefined)
    
    inline def setAccessibilityState(value: AccessibilityState): Self = StObject.set(x, "accessibilityState", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityStateUndefined: Self = StObject.set(x, "accessibilityState", js.undefined)
    
    inline def setAccessibilityValue(value: AccessibilityValue): Self = StObject.set(x, "accessibilityValue", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityValueUndefined: Self = StObject.set(x, "accessibilityValue", js.undefined)
    
    inline def setAccessibilityViewIsModal(value: Boolean): Self = StObject.set(x, "accessibilityViewIsModal", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityViewIsModalUndefined: Self = StObject.set(x, "accessibilityViewIsModal", js.undefined)
    
    inline def setAccessible(value: Boolean): Self = StObject.set(x, "accessible", value.asInstanceOf[js.Any])
    
    inline def setAccessibleUndefined: Self = StObject.set(x, "accessible", js.undefined)
    
    inline def setActiveOpacity(value: Double): Self = StObject.set(x, "activeOpacity", value.asInstanceOf[js.Any])
    
    inline def setActiveOpacityUndefined: Self = StObject.set(x, "activeOpacity", js.undefined)
    
    inline def setBackground(value: BackgroundPropType): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setCaption(value: VdomNode): Self = StObject.set(x, "caption", value.rawNode.asInstanceOf[js.Any])
    
    inline def setCaptionNull: Self = StObject.set(x, "caption", null)
    
    inline def setCaptionStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "captionStyle", value.asInstanceOf[js.Any])
    
    inline def setCaptionStyleNull: Self = StObject.set(x, "captionStyle", null)
    
    inline def setCaptionStyleUndefined: Self = StObject.set(x, "captionStyle", js.undefined)
    
    inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    inline def setCaptionVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "caption", js.Array(value*))
    
    inline def setCaptionVdomElement(value: VdomElement): Self = StObject.set(x, "caption", value.rawElement.asInstanceOf[js.Any])
    
    inline def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
    
    inline def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
    
    inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
    
    inline def setContentContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "contentContainerStyle", value.asInstanceOf[js.Any])
    
    inline def setContentContainerStyleNull: Self = StObject.set(x, "contentContainerStyle", null)
    
    inline def setContentContainerStyleUndefined: Self = StObject.set(x, "contentContainerStyle", js.undefined)
    
    inline def setDelayLongPress(value: Double): Self = StObject.set(x, "delayLongPress", value.asInstanceOf[js.Any])
    
    inline def setDelayLongPressUndefined: Self = StObject.set(x, "delayLongPress", js.undefined)
    
    inline def setDelayPressIn(value: Double): Self = StObject.set(x, "delayPressIn", value.asInstanceOf[js.Any])
    
    inline def setDelayPressInUndefined: Self = StObject.set(x, "delayPressIn", js.undefined)
    
    inline def setDelayPressOut(value: Double): Self = StObject.set(x, "delayPressOut", value.asInstanceOf[js.Any])
    
    inline def setDelayPressOutUndefined: Self = StObject.set(x, "delayPressOut", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setFeatured(value: Boolean): Self = StObject.set(x, "featured", value.asInstanceOf[js.Any])
    
    inline def setFeaturedUndefined: Self = StObject.set(x, "featured", js.undefined)
    
    inline def setHasTVPreferredFocus(value: Boolean): Self = StObject.set(x, "hasTVPreferredFocus", value.asInstanceOf[js.Any])
    
    inline def setHasTVPreferredFocusUndefined: Self = StObject.set(x, "hasTVPreferredFocus", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHitSlop(value: Insets): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
    
    inline def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
    
    inline def setIcon(value: IconObjectIconButtonProps): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "iconContainerStyle", value.asInstanceOf[js.Any])
    
    inline def setIconContainerStyleNull: Self = StObject.set(x, "iconContainerStyle", null)
    
    inline def setIconContainerStyleUndefined: Self = StObject.set(x, "iconContainerStyle", js.undefined)
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setImageComponent(
      value: TypeofComponent & (Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
          Component[ImageComponent & js.Object, js.Object]
        ])
    ): Self = StObject.set(x, "ImageComponent", value.asInstanceOf[js.Any])
    
    inline def setImageComponentUndefined: Self = StObject.set(x, "ImageComponent", js.undefined)
    
    inline def setImageContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "imageContainerStyle", value.asInstanceOf[js.Any])
    
    inline def setImageContainerStyleNull: Self = StObject.set(x, "imageContainerStyle", null)
    
    inline def setImageContainerStyleUndefined: Self = StObject.set(x, "imageContainerStyle", js.undefined)
    
    inline def setImageProps(value: PartialImagePropsAccessibilityActions): Self = StObject.set(x, "imageProps", value.asInstanceOf[js.Any])
    
    inline def setImagePropsUndefined: Self = StObject.set(x, "imageProps", js.undefined)
    
    inline def setImageSrc(value: String | Double | ImageURISource | js.Array[ImageURISource]): Self = StObject.set(x, "imageSrc", value.asInstanceOf[js.Any])
    
    inline def setImageSrcUndefined: Self = StObject.set(x, "imageSrc", js.undefined)
    
    inline def setImageSrcVarargs(value: ImageURISource*): Self = StObject.set(x, "imageSrc", js.Array(value*))
    
    inline def setImportantForAccessibility(value: auto | yes | no | `no-hide-descendants`): Self = StObject.set(x, "importantForAccessibility", value.asInstanceOf[js.Any])
    
    inline def setImportantForAccessibilityUndefined: Self = StObject.set(x, "importantForAccessibility", js.undefined)
    
    inline def setOnAccessibilityAction(value: /* event */ AccessibilityActionEvent => Callback): Self = StObject.set(x, "onAccessibilityAction", js.Any.fromFunction1((t0: /* event */ AccessibilityActionEvent) => value(t0).runNow()))
    
    inline def setOnAccessibilityActionUndefined: Self = StObject.set(x, "onAccessibilityAction", js.undefined)
    
    inline def setOnAccessibilityEscape(value: Callback): Self = StObject.set(x, "onAccessibilityEscape", value.toJsFn)
    
    inline def setOnAccessibilityEscapeUndefined: Self = StObject.set(x, "onAccessibilityEscape", js.undefined)
    
    inline def setOnAccessibilityTap(value: Callback): Self = StObject.set(x, "onAccessibilityTap", value.toJsFn)
    
    inline def setOnAccessibilityTapUndefined: Self = StObject.set(x, "onAccessibilityTap", js.undefined)
    
    inline def setOnBlur(value: /* e */ NativeSyntheticEvent[TargetedEvent] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: /* e */ NativeSyntheticEvent[TargetedEvent]) => value(t0).runNow()))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnFocus(value: /* e */ NativeSyntheticEvent[TargetedEvent] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: /* e */ NativeSyntheticEvent[TargetedEvent]) => value(t0).runNow()))
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setOnLayout(value: /* event */ LayoutChangeEvent => Callback): Self = StObject.set(x, "onLayout", js.Any.fromFunction1((t0: /* event */ LayoutChangeEvent) => value(t0).runNow()))
    
    inline def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
    
    inline def setOnLongPress(value: /* event */ GestureResponderEvent => Callback): Self = StObject.set(x, "onLongPress", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
    
    inline def setOnMagicTap(value: Callback): Self = StObject.set(x, "onMagicTap", value.toJsFn)
    
    inline def setOnMagicTapUndefined: Self = StObject.set(x, "onMagicTap", js.undefined)
    
    inline def setOnPress(value: /* event */ GestureResponderEvent => Callback): Self = StObject.set(x, "onPress", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def setOnPressIn(value: /* event */ GestureResponderEvent => Callback): Self = StObject.set(x, "onPressIn", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def setOnPressInUndefined: Self = StObject.set(x, "onPressIn", js.undefined)
    
    inline def setOnPressOut(value: /* event */ GestureResponderEvent => Callback): Self = StObject.set(x, "onPressOut", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def setOnPressOutUndefined: Self = StObject.set(x, "onPressOut", js.undefined)
    
    inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    inline def setOverlayContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "overlayContainerStyle", value.asInstanceOf[js.Any])
    
    inline def setOverlayContainerStyleNull: Self = StObject.set(x, "overlayContainerStyle", null)
    
    inline def setOverlayContainerStyleUndefined: Self = StObject.set(x, "overlayContainerStyle", js.undefined)
    
    inline def setPressRetentionOffset(value: Insets): Self = StObject.set(x, "pressRetentionOffset", value.asInstanceOf[js.Any])
    
    inline def setPressRetentionOffsetUndefined: Self = StObject.set(x, "pressRetentionOffset", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNumberOfLines(value: Double): Self = StObject.set(x, "titleNumberOfLines", value.asInstanceOf[js.Any])
    
    inline def setTitleNumberOfLinesUndefined: Self = StObject.set(x, "titleNumberOfLines", js.undefined)
    
    inline def setTitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
    
    inline def setTitleStyleNull: Self = StObject.set(x, "titleStyle", null)
    
    inline def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTouchSoundDisabled(value: Boolean): Self = StObject.set(x, "touchSoundDisabled", value.asInstanceOf[js.Any])
    
    inline def setTouchSoundDisabledUndefined: Self = StObject.set(x, "touchSoundDisabled", js.undefined)
    
    inline def setTvParallaxProperties(value: TVParallaxProperties): Self = StObject.set(x, "tvParallaxProperties", value.asInstanceOf[js.Any])
    
    inline def setTvParallaxPropertiesUndefined: Self = StObject.set(x, "tvParallaxProperties", js.undefined)
    
    inline def setUseForeground(value: Boolean): Self = StObject.set(x, "useForeground", value.asInstanceOf[js.Any])
    
    inline def setUseForegroundUndefined: Self = StObject.set(x, "useForeground", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
