package typingsJapgolly.reactNativeElements.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reactNative.mod.AccessibilityActionEvent
import typingsJapgolly.reactNative.mod.AccessibilityActionInfo
import typingsJapgolly.reactNative.mod.AccessibilityRole
import typingsJapgolly.reactNative.mod.AccessibilityState
import typingsJapgolly.reactNative.mod.AccessibilityValue
import typingsJapgolly.reactNative.mod.ColorValue
import typingsJapgolly.reactNative.mod.GestureResponderEvent
import typingsJapgolly.reactNative.mod.LayoutChangeEvent
import typingsJapgolly.reactNative.mod.NativeSyntheticEvent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextLayoutEventData
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewProps
import typingsJapgolly.reactNativeElements.distAvatarAccessoryMod.AccessoryProps
import typingsJapgolly.reactNativeElements.distAvatarAvatarMod.AvatarProps
import typingsJapgolly.reactNativeElements.distBadgeBadgeMod.BadgeProps
import typingsJapgolly.reactNativeElements.distBottomSheetBottomSheetMod.BottomSheetProps
import typingsJapgolly.reactNativeElements.distButtonsButtonGroupMod.ButtonGroupProps
import typingsJapgolly.reactNativeElements.distButtonsButtonMod.ButtonProps
import typingsJapgolly.reactNativeElements.distButtonsFabMod.FABProps
import typingsJapgolly.reactNativeElements.distButtonsSpeedDialMod.SpeedDialActionProps
import typingsJapgolly.reactNativeElements.distButtonsSpeedDialMod.SpeedDialProps
import typingsJapgolly.reactNativeElements.distCardCardMod.CardProps
import typingsJapgolly.reactNativeElements.distCheckboxCheckBoxMod.CheckBoxProps
import typingsJapgolly.reactNativeElements.distConfigColorsMod.Colors
import typingsJapgolly.reactNativeElements.distConfigThemeMod.RecursivePartial
import typingsJapgolly.reactNativeElements.distDividerDividerMod.DividerProps
import typingsJapgolly.reactNativeElements.distHeaderHeaderMod.HeaderProps
import typingsJapgolly.reactNativeElements.distIconsIconMod.IconProps
import typingsJapgolly.reactNativeElements.distImageImageMod.ImageProps
import typingsJapgolly.reactNativeElements.distInputInputMod.InputProps
import typingsJapgolly.reactNativeElements.distLinearProgressLinearProgressMod.LinearProgressProps
import typingsJapgolly.reactNativeElements.distListListItemAccordionMod.ListItemAccordionProps
import typingsJapgolly.reactNativeElements.distListListItemBaseMod.ListItemProps
import typingsJapgolly.reactNativeElements.distOverlayOverlayMod.OverlayProps
import typingsJapgolly.reactNativeElements.distPricingPricingCardMod.PricingCardProps
import typingsJapgolly.reactNativeElements.distSearchbarSearchBarMod.SearchBarProps
import typingsJapgolly.reactNativeElements.distSliderSliderMod.SliderProps
import typingsJapgolly.reactNativeElements.distSocialSocialIconMod.SocialIconProps
import typingsJapgolly.reactNativeElements.distSwitchSwitchMod.SwitchProps
import typingsJapgolly.reactNativeElements.distTabTabMod.TabItemProps
import typingsJapgolly.reactNativeElements.distTabTabMod.TabProps
import typingsJapgolly.reactNativeElements.distTabTabViewMod.TabViewProps
import typingsJapgolly.reactNativeElements.distTextTextMod.TextProps
import typingsJapgolly.reactNativeElements.distTileTileMod.TileProps
import typingsJapgolly.reactNativeElements.distTooltipTooltipMod.TooltipProps
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.`no-hide-descendants`
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.all
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.assertive
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.auto
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.balanced
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.clip
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.email
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.full
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.head
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.highQuality
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.link
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.middle
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.no
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.none
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.normal
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.phoneNumber
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.polite
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.simple
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.tail
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.yes
import typingsJapgolly.reactNativeRatings.distSwipeRatingMod.SwipeRatingProps
import typingsJapgolly.reactNativeRatings.distTapRatingMod.TapRatingProps
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native-elements.react-native-elements/dist/config/theme.Theme<react-native-elements.react-native-elements.TextProps> */
trait ThemeTextProps extends StObject {
  
  var AirbnbRating: js.UndefOr[Partial[SwipeRatingProps]] = js.undefined
  
  var Avatar: js.UndefOr[Partial[AvatarProps]] = js.undefined
  
  var AvatarAccessory: js.UndefOr[Partial[AccessoryProps]] = js.undefined
  
  var Badge: js.UndefOr[Partial[BadgeProps]] = js.undefined
  
  var BottomSheet: js.UndefOr[Partial[BottomSheetProps]] = js.undefined
  
  var Button: js.UndefOr[Partial[ButtonProps]] = js.undefined
  
  var ButtonGroup: js.UndefOr[Partial[ButtonGroupProps]] = js.undefined
  
  var Card: js.UndefOr[Partial[CardProps]] = js.undefined
  
  var CardDivider: js.UndefOr[Partial[DividerProps]] = js.undefined
  
  var CardFeaturedSubtitle: js.UndefOr[Partial[TextProps]] = js.undefined
  
  var CardFeaturedTitle: js.UndefOr[Partial[TextProps]] = js.undefined
  
  var CardImage: js.UndefOr[Partial[ImageProps]] = js.undefined
  
  var CardTitle: js.UndefOr[Partial[TextProps]] = js.undefined
  
  var CheckBox: js.UndefOr[Partial[CheckBoxProps]] = js.undefined
  
  var Divider: js.UndefOr[Partial[DividerProps]] = js.undefined
  
  var FAB: js.UndefOr[Partial[FABProps]] = js.undefined
  
  var Header: js.UndefOr[Partial[HeaderProps]] = js.undefined
  
  var Icon: js.UndefOr[Partial[IconProps]] = js.undefined
  
  var Image: js.UndefOr[Partial[ImageProps]] = js.undefined
  
  var Input: js.UndefOr[Partial[InputProps]] = js.undefined
  
  var LinearProgress: js.UndefOr[Partial[LinearProgressProps]] = js.undefined
  
  var ListItem: js.UndefOr[Partial[ListItemProps]] = js.undefined
  
  var ListItemAccordion: js.UndefOr[Partial[ListItemAccordionProps]] = js.undefined
  
  var ListItemButtonGroup: js.UndefOr[Partial[ButtonGroupProps]] = js.undefined
  
  var ListItemCheckBox: js.UndefOr[Partial[CheckBoxProps]] = js.undefined
  
  var ListItemChevron: js.UndefOr[Partial[IconProps]] = js.undefined
  
  var ListItemContent: js.UndefOr[Partial[ViewProps]] = js.undefined
  
  var ListItemInput: js.UndefOr[Partial[InputProps]] = js.undefined
  
  var ListItemSubtitle: js.UndefOr[Partial[TextProps]] = js.undefined
  
  var ListItemTitle: js.UndefOr[Partial[TextProps]] = js.undefined
  
  var Overlay: js.UndefOr[Partial[OverlayProps]] = js.undefined
  
  var PricingCard: js.UndefOr[Partial[PricingCardProps]] = js.undefined
  
  var Rating: js.UndefOr[Partial[TapRatingProps]] = js.undefined
  
  var SearchBar: js.UndefOr[Partial[SearchBarProps]] = js.undefined
  
  var Slider: js.UndefOr[Partial[SliderProps]] = js.undefined
  
  var SocialIcon: js.UndefOr[Partial[SocialIconProps]] = js.undefined
  
  var SpeedDial: js.UndefOr[Partial[SpeedDialProps]] = js.undefined
  
  var SpeedDialAction: js.UndefOr[Partial[SpeedDialActionProps]] = js.undefined
  
  var Switch: js.UndefOr[Partial[SwitchProps]] = js.undefined
  
  var Tab: js.UndefOr[Partial[TabProps]] = js.undefined
  
  var TabItem: js.UndefOr[Partial[TabItemProps]] = js.undefined
  
  var TabView: js.UndefOr[Partial[TabViewProps]] = js.undefined
  
  var TabViewItem: js.UndefOr[Partial[ViewProps]] = js.undefined
  
  var Text: js.UndefOr[Partial[TextProps]] = js.undefined
  
  var Tile: js.UndefOr[Partial[TileProps]] = js.undefined
  
  var Tooltip: js.UndefOr[Partial[TooltipProps]] = js.undefined
  
  /**
    * Provides an array of custom actions available for accessibility.
    */
  var accessibilityActions: js.UndefOr[js.Array[AccessibilityActionInfo]] = js.undefined
  
  /**
    * A Boolean value indicating whether the accessibility elements contained within this accessibility element
    * are hidden to the screen reader.
    * @platform ios
    */
  var accessibilityElementsHidden: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An accessibility hint helps users understand what will happen when they perform an action on the accessibility element when that result is not obvious from the accessibility label.
    */
  var accessibilityHint: js.UndefOr[String] = js.undefined
  
  /**
    * https://reactnative.dev/docs/accessibility#accessibilityignoresinvertcolorsios
    * @platform ios
    */
  var accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Overrides the text that's read by the screen reader when the user interacts with the element. By default, the
    * label is constructed by traversing all the children and accumulating all the Text nodes separated by space.
    */
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the nativeID of the associated label text. When the assistive technology focuses on the component with this props, the text is read aloud.
    * @platform android
    */
  var accessibilityLabelledBy: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * Indicates to the accessibility services that the UI component is in
    * a specific language. The provided string should be formatted following
    * the BCP 47 specification (https://www.rfc-editor.org/info/bcp47).
    * @platform ios
    */
  var accessibilityLanguage: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates to accessibility services whether the user should be notified when this view changes.
    * Works for Android API >= 19 only.
    * See http://developer.android.com/reference/android/view/View.html#attr_android:accessibilityLiveRegion for references.
    * @platform android
    */
  var accessibilityLiveRegion: js.UndefOr[none | polite | assertive] = js.undefined
  
  /**
    * Accessibility Role tells a person using either VoiceOver on iOS or TalkBack on Android the type of element that is focused on.
    */
  var accessibilityRole: js.UndefOr[AccessibilityRole] = js.undefined
  
  /**
    * Accessibility State tells a person using either VoiceOver on iOS or TalkBack on Android the state of the element currently focused on.
    */
  var accessibilityState: js.UndefOr[AccessibilityState] = js.undefined
  
  /**
    * Represents the current value of a component. It can be a textual description of a component's value, or for range-based components, such as sliders and progress bars,
    * it contains range information (minimum, current, and maximum).
    */
  var accessibilityValue: js.UndefOr[AccessibilityValue] = js.undefined
  
  /**
    * A Boolean value indicating whether VoiceOver should ignore the elements within views that are siblings of the receiver.
    * @platform ios
    */
  var accessibilityViewIsModal: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When true, indicates that the view is an accessibility element.
    * By default, all the touchable elements are accessible.
    */
  var accessible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether font should be scaled down automatically to fit given style constraints.
    */
  var adjustsFontSizeToFit: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether fonts should scale to respect Text Size accessibility settings.
    * The default is `true`.
    */
  var allowFontScaling: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Hyphenation strategy
    */
  var android_hyphenationFrequency: js.UndefOr[normal | none | full] = js.undefined
  
  var children: js.UndefOr[Node] = js.undefined
  
  var colors: js.UndefOr[RecursivePartial[Colors]] = js.undefined
  
  /**
    * Determines the types of data converted to clickable URLs in the text element.
    * By default no data types are detected.
    */
  var dataDetectorType: js.UndefOr[Null | phoneNumber | link | email | none | all] = js.undefined
  
  /**
    * Specifies the disabled state of the text view for testing purposes.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This can be one of the following values:
    *
    * - `head` - The line is displayed so that the end fits in the container and the missing text
    * at the beginning of the line is indicated by an ellipsis glyph. e.g., "...wxyz"
    * - `middle` - The line is displayed so that the beginning and end fit in the container and the
    * missing text in the middle is indicated by an ellipsis glyph. "ab...yz"
    * - `tail` - The line is displayed so that the beginning fits in the container and the
    * missing text at the end of the line is indicated by an ellipsis glyph. e.g., "abcd..."
    * - `clip` - Lines are not drawn past the edge of the text container.
    *
    * The default is `tail`.
    *
    * `numberOfLines` must be set in conjunction with this prop.
    *
    * > `clip` is working only for iOS
    */
  var ellipsizeMode: js.UndefOr[head | middle | tail | clip] = js.undefined
  
  var h1: js.UndefOr[Boolean] = js.undefined
  
  var h1Style: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var h2: js.UndefOr[Boolean] = js.undefined
  
  var h2Style: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var h3: js.UndefOr[Boolean] = js.undefined
  
  var h3Style: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var h4: js.UndefOr[Boolean] = js.undefined
  
  var h4Style: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  /**
    * Controls how view is important for accessibility which is if it fires accessibility events
    * and if it is reported to accessibility services that query the screen.
    * Works for Android only. See http://developer.android.com/reference/android/R.attr.html#importantForAccessibility for references.
    *
    * Possible values:
    *      'auto' - The system determines whether the view is important for accessibility - default (recommended).
    *      'yes' - The view is important for accessibility.
    *      'no' - The view is not important for accessibility.
    *      'no-hide-descendants' - The view is not important for accessibility, nor are any of its descendant views.
    */
  var importantForAccessibility: js.UndefOr[auto | yes | no | `no-hide-descendants`] = js.undefined
  
  /**
    * Line Break mode. Works only with numberOfLines.
    * clip is working only for iOS
    */
  var lineBreakMode: js.UndefOr[head | middle | tail | clip] = js.undefined
  
  /**
    * Specifies largest possible scale a font can reach when allowFontScaling is enabled. Possible values:
    * - null/undefined (default): inherit from the parent node or the global default (0)
    * - 0: no max, ignore parent/global default
    * - >= 1: sets the maxFontSizeMultiplier of this node to this value
    */
  var maxFontSizeMultiplier: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Specifies smallest possible scale a font can reach when adjustsFontSizeToFit is enabled. (values 0.01-1.0).
    */
  var minimumFontScale: js.UndefOr[Double] = js.undefined
  
  /**
    * Used to reference react managed views from native code.
    */
  var nativeID: js.UndefOr[String] = js.undefined
  
  /**
    * Used to truncate the text with an ellipsis after computing the text
    * layout, including line wrapping, such that the total number of lines
    * does not exceed this number.
    *
    * This prop is commonly used with `ellipsizeMode`.
    */
  var numberOfLines: js.UndefOr[Double] = js.undefined
  
  /**
    * When `accessible` is true, the system will try to invoke this function when the user performs an accessibility custom action.
    */
  var onAccessibilityAction: js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]] = js.undefined
  
  /**
    * When accessibile is true, the system will invoke this function when the user performs the escape gesture (scrub with two fingers).
    * @platform ios
    */
  var onAccessibilityEscape: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * When `accessible` is true, the system will try to invoke this function when the user performs accessibility tap gesture.
    * @platform ios
    */
  var onAccessibilityTap: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Invoked on mount and layout changes with
    *
    * {nativeEvent: { layout: {x, y, width, height}}}.
    */
  var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.undefined
  
  /**
    * This function is called on long press.
    * e.g., `onLongPress={this.increaseSize}>``
    */
  var onLongPress: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  /**
    * When accessible is true, the system will invoke this function when the user performs the magic tap gesture.
    * @platform ios
    */
  var onMagicTap: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * This function is called on press.
    * Text intrinsically supports press handling with a default highlight state (which can be disabled with suppressHighlighting).
    */
  var onPress: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onPressIn: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onPressOut: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  /**
    * Invoked on Text layout
    */
  var onTextLayout: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[TextLayoutEventData], Unit]] = js.undefined
  
  /**
    * Lets the user select text, to use the native copy and paste functionality.
    */
  var selectable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The highlight color of the text.
    */
  var selectionColor: js.UndefOr[ColorValue] = js.undefined
  
  var style: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  /**
    * When `true`, no visual change is made when text is pressed down. By
    * default, a gray oval highlights the text on press down.
    */
  var suppressHighlighting: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Used to locate this view in end-to-end tests.
    */
  var testID: js.UndefOr[String] = js.undefined
  
  /**
    * Set text break strategy on Android API Level 23+
    * default is `highQuality`.
    */
  var textBreakStrategy: js.UndefOr[simple | highQuality | balanced] = js.undefined
}
object ThemeTextProps {
  
  inline def apply(): ThemeTextProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeTextProps]
  }
  
  extension [Self <: ThemeTextProps](x: Self) {
    
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
    
    inline def setAccessibilityLabelledBy(value: String | js.Array[String]): Self = StObject.set(x, "accessibilityLabelledBy", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelledByUndefined: Self = StObject.set(x, "accessibilityLabelledBy", js.undefined)
    
    inline def setAccessibilityLabelledByVarargs(value: String*): Self = StObject.set(x, "accessibilityLabelledBy", js.Array(value*))
    
    inline def setAccessibilityLanguage(value: String): Self = StObject.set(x, "accessibilityLanguage", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLanguageUndefined: Self = StObject.set(x, "accessibilityLanguage", js.undefined)
    
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
    
    inline def setAdjustsFontSizeToFit(value: Boolean): Self = StObject.set(x, "adjustsFontSizeToFit", value.asInstanceOf[js.Any])
    
    inline def setAdjustsFontSizeToFitUndefined: Self = StObject.set(x, "adjustsFontSizeToFit", js.undefined)
    
    inline def setAirbnbRating(value: Partial[SwipeRatingProps]): Self = StObject.set(x, "AirbnbRating", value.asInstanceOf[js.Any])
    
    inline def setAirbnbRatingUndefined: Self = StObject.set(x, "AirbnbRating", js.undefined)
    
    inline def setAllowFontScaling(value: Boolean): Self = StObject.set(x, "allowFontScaling", value.asInstanceOf[js.Any])
    
    inline def setAllowFontScalingUndefined: Self = StObject.set(x, "allowFontScaling", js.undefined)
    
    inline def setAndroid_hyphenationFrequency(value: normal | none | full): Self = StObject.set(x, "android_hyphenationFrequency", value.asInstanceOf[js.Any])
    
    inline def setAndroid_hyphenationFrequencyUndefined: Self = StObject.set(x, "android_hyphenationFrequency", js.undefined)
    
    inline def setAvatar(value: Partial[AvatarProps]): Self = StObject.set(x, "Avatar", value.asInstanceOf[js.Any])
    
    inline def setAvatarAccessory(value: Partial[AccessoryProps]): Self = StObject.set(x, "AvatarAccessory", value.asInstanceOf[js.Any])
    
    inline def setAvatarAccessoryUndefined: Self = StObject.set(x, "AvatarAccessory", js.undefined)
    
    inline def setAvatarUndefined: Self = StObject.set(x, "Avatar", js.undefined)
    
    inline def setBadge(value: Partial[BadgeProps]): Self = StObject.set(x, "Badge", value.asInstanceOf[js.Any])
    
    inline def setBadgeUndefined: Self = StObject.set(x, "Badge", js.undefined)
    
    inline def setBottomSheet(value: Partial[BottomSheetProps]): Self = StObject.set(x, "BottomSheet", value.asInstanceOf[js.Any])
    
    inline def setBottomSheetUndefined: Self = StObject.set(x, "BottomSheet", js.undefined)
    
    inline def setButton(value: Partial[ButtonProps]): Self = StObject.set(x, "Button", value.asInstanceOf[js.Any])
    
    inline def setButtonGroup(value: Partial[ButtonGroupProps]): Self = StObject.set(x, "ButtonGroup", value.asInstanceOf[js.Any])
    
    inline def setButtonGroupUndefined: Self = StObject.set(x, "ButtonGroup", js.undefined)
    
    inline def setButtonUndefined: Self = StObject.set(x, "Button", js.undefined)
    
    inline def setCard(value: Partial[CardProps]): Self = StObject.set(x, "Card", value.asInstanceOf[js.Any])
    
    inline def setCardDivider(value: Partial[DividerProps]): Self = StObject.set(x, "CardDivider", value.asInstanceOf[js.Any])
    
    inline def setCardDividerUndefined: Self = StObject.set(x, "CardDivider", js.undefined)
    
    inline def setCardFeaturedSubtitle(value: Partial[TextProps]): Self = StObject.set(x, "CardFeaturedSubtitle", value.asInstanceOf[js.Any])
    
    inline def setCardFeaturedSubtitleUndefined: Self = StObject.set(x, "CardFeaturedSubtitle", js.undefined)
    
    inline def setCardFeaturedTitle(value: Partial[TextProps]): Self = StObject.set(x, "CardFeaturedTitle", value.asInstanceOf[js.Any])
    
    inline def setCardFeaturedTitleUndefined: Self = StObject.set(x, "CardFeaturedTitle", js.undefined)
    
    inline def setCardImage(value: Partial[ImageProps]): Self = StObject.set(x, "CardImage", value.asInstanceOf[js.Any])
    
    inline def setCardImageUndefined: Self = StObject.set(x, "CardImage", js.undefined)
    
    inline def setCardTitle(value: Partial[TextProps]): Self = StObject.set(x, "CardTitle", value.asInstanceOf[js.Any])
    
    inline def setCardTitleUndefined: Self = StObject.set(x, "CardTitle", js.undefined)
    
    inline def setCardUndefined: Self = StObject.set(x, "Card", js.undefined)
    
    inline def setCheckBox(value: Partial[CheckBoxProps]): Self = StObject.set(x, "CheckBox", value.asInstanceOf[js.Any])
    
    inline def setCheckBoxUndefined: Self = StObject.set(x, "CheckBox", js.undefined)
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setColors(value: RecursivePartial[Colors]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setDataDetectorType(value: phoneNumber | link | email | none | all): Self = StObject.set(x, "dataDetectorType", value.asInstanceOf[js.Any])
    
    inline def setDataDetectorTypeNull: Self = StObject.set(x, "dataDetectorType", null)
    
    inline def setDataDetectorTypeUndefined: Self = StObject.set(x, "dataDetectorType", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setDivider(value: Partial[DividerProps]): Self = StObject.set(x, "Divider", value.asInstanceOf[js.Any])
    
    inline def setDividerUndefined: Self = StObject.set(x, "Divider", js.undefined)
    
    inline def setEllipsizeMode(value: head | middle | tail | clip): Self = StObject.set(x, "ellipsizeMode", value.asInstanceOf[js.Any])
    
    inline def setEllipsizeModeUndefined: Self = StObject.set(x, "ellipsizeMode", js.undefined)
    
    inline def setFAB(value: Partial[FABProps]): Self = StObject.set(x, "FAB", value.asInstanceOf[js.Any])
    
    inline def setFABUndefined: Self = StObject.set(x, "FAB", js.undefined)
    
    inline def setH1(value: Boolean): Self = StObject.set(x, "h1", value.asInstanceOf[js.Any])
    
    inline def setH1Style(value: StyleProp[TextStyle]): Self = StObject.set(x, "h1Style", value.asInstanceOf[js.Any])
    
    inline def setH1StyleNull: Self = StObject.set(x, "h1Style", null)
    
    inline def setH1StyleUndefined: Self = StObject.set(x, "h1Style", js.undefined)
    
    inline def setH1Undefined: Self = StObject.set(x, "h1", js.undefined)
    
    inline def setH2(value: Boolean): Self = StObject.set(x, "h2", value.asInstanceOf[js.Any])
    
    inline def setH2Style(value: StyleProp[TextStyle]): Self = StObject.set(x, "h2Style", value.asInstanceOf[js.Any])
    
    inline def setH2StyleNull: Self = StObject.set(x, "h2Style", null)
    
    inline def setH2StyleUndefined: Self = StObject.set(x, "h2Style", js.undefined)
    
    inline def setH2Undefined: Self = StObject.set(x, "h2", js.undefined)
    
    inline def setH3(value: Boolean): Self = StObject.set(x, "h3", value.asInstanceOf[js.Any])
    
    inline def setH3Style(value: StyleProp[TextStyle]): Self = StObject.set(x, "h3Style", value.asInstanceOf[js.Any])
    
    inline def setH3StyleNull: Self = StObject.set(x, "h3Style", null)
    
    inline def setH3StyleUndefined: Self = StObject.set(x, "h3Style", js.undefined)
    
    inline def setH3Undefined: Self = StObject.set(x, "h3", js.undefined)
    
    inline def setH4(value: Boolean): Self = StObject.set(x, "h4", value.asInstanceOf[js.Any])
    
    inline def setH4Style(value: StyleProp[TextStyle]): Self = StObject.set(x, "h4Style", value.asInstanceOf[js.Any])
    
    inline def setH4StyleNull: Self = StObject.set(x, "h4Style", null)
    
    inline def setH4StyleUndefined: Self = StObject.set(x, "h4Style", js.undefined)
    
    inline def setH4Undefined: Self = StObject.set(x, "h4", js.undefined)
    
    inline def setHeader(value: Partial[HeaderProps]): Self = StObject.set(x, "Header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "Header", js.undefined)
    
    inline def setIcon(value: Partial[IconProps]): Self = StObject.set(x, "Icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "Icon", js.undefined)
    
    inline def setImage(value: Partial[ImageProps]): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "Image", js.undefined)
    
    inline def setImportantForAccessibility(value: auto | yes | no | `no-hide-descendants`): Self = StObject.set(x, "importantForAccessibility", value.asInstanceOf[js.Any])
    
    inline def setImportantForAccessibilityUndefined: Self = StObject.set(x, "importantForAccessibility", js.undefined)
    
    inline def setInput(value: Partial[InputProps]): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "Input", js.undefined)
    
    inline def setLineBreakMode(value: head | middle | tail | clip): Self = StObject.set(x, "lineBreakMode", value.asInstanceOf[js.Any])
    
    inline def setLineBreakModeUndefined: Self = StObject.set(x, "lineBreakMode", js.undefined)
    
    inline def setLinearProgress(value: Partial[LinearProgressProps]): Self = StObject.set(x, "LinearProgress", value.asInstanceOf[js.Any])
    
    inline def setLinearProgressUndefined: Self = StObject.set(x, "LinearProgress", js.undefined)
    
    inline def setListItem(value: Partial[ListItemProps]): Self = StObject.set(x, "ListItem", value.asInstanceOf[js.Any])
    
    inline def setListItemAccordion(value: Partial[ListItemAccordionProps]): Self = StObject.set(x, "ListItemAccordion", value.asInstanceOf[js.Any])
    
    inline def setListItemAccordionUndefined: Self = StObject.set(x, "ListItemAccordion", js.undefined)
    
    inline def setListItemButtonGroup(value: Partial[ButtonGroupProps]): Self = StObject.set(x, "ListItemButtonGroup", value.asInstanceOf[js.Any])
    
    inline def setListItemButtonGroupUndefined: Self = StObject.set(x, "ListItemButtonGroup", js.undefined)
    
    inline def setListItemCheckBox(value: Partial[CheckBoxProps]): Self = StObject.set(x, "ListItemCheckBox", value.asInstanceOf[js.Any])
    
    inline def setListItemCheckBoxUndefined: Self = StObject.set(x, "ListItemCheckBox", js.undefined)
    
    inline def setListItemChevron(value: Partial[IconProps]): Self = StObject.set(x, "ListItemChevron", value.asInstanceOf[js.Any])
    
    inline def setListItemChevronUndefined: Self = StObject.set(x, "ListItemChevron", js.undefined)
    
    inline def setListItemContent(value: Partial[ViewProps]): Self = StObject.set(x, "ListItemContent", value.asInstanceOf[js.Any])
    
    inline def setListItemContentUndefined: Self = StObject.set(x, "ListItemContent", js.undefined)
    
    inline def setListItemInput(value: Partial[InputProps]): Self = StObject.set(x, "ListItemInput", value.asInstanceOf[js.Any])
    
    inline def setListItemInputUndefined: Self = StObject.set(x, "ListItemInput", js.undefined)
    
    inline def setListItemSubtitle(value: Partial[TextProps]): Self = StObject.set(x, "ListItemSubtitle", value.asInstanceOf[js.Any])
    
    inline def setListItemSubtitleUndefined: Self = StObject.set(x, "ListItemSubtitle", js.undefined)
    
    inline def setListItemTitle(value: Partial[TextProps]): Self = StObject.set(x, "ListItemTitle", value.asInstanceOf[js.Any])
    
    inline def setListItemTitleUndefined: Self = StObject.set(x, "ListItemTitle", js.undefined)
    
    inline def setListItemUndefined: Self = StObject.set(x, "ListItem", js.undefined)
    
    inline def setMaxFontSizeMultiplier(value: Double): Self = StObject.set(x, "maxFontSizeMultiplier", value.asInstanceOf[js.Any])
    
    inline def setMaxFontSizeMultiplierNull: Self = StObject.set(x, "maxFontSizeMultiplier", null)
    
    inline def setMaxFontSizeMultiplierUndefined: Self = StObject.set(x, "maxFontSizeMultiplier", js.undefined)
    
    inline def setMinimumFontScale(value: Double): Self = StObject.set(x, "minimumFontScale", value.asInstanceOf[js.Any])
    
    inline def setMinimumFontScaleUndefined: Self = StObject.set(x, "minimumFontScale", js.undefined)
    
    inline def setNativeID(value: String): Self = StObject.set(x, "nativeID", value.asInstanceOf[js.Any])
    
    inline def setNativeIDUndefined: Self = StObject.set(x, "nativeID", js.undefined)
    
    inline def setNumberOfLines(value: Double): Self = StObject.set(x, "numberOfLines", value.asInstanceOf[js.Any])
    
    inline def setNumberOfLinesUndefined: Self = StObject.set(x, "numberOfLines", js.undefined)
    
    inline def setOnAccessibilityAction(value: /* event */ AccessibilityActionEvent => Callback): Self = StObject.set(x, "onAccessibilityAction", js.Any.fromFunction1((t0: /* event */ AccessibilityActionEvent) => value(t0).runNow()))
    
    inline def setOnAccessibilityActionUndefined: Self = StObject.set(x, "onAccessibilityAction", js.undefined)
    
    inline def setOnAccessibilityEscape(value: Callback): Self = StObject.set(x, "onAccessibilityEscape", value.toJsFn)
    
    inline def setOnAccessibilityEscapeUndefined: Self = StObject.set(x, "onAccessibilityEscape", js.undefined)
    
    inline def setOnAccessibilityTap(value: Callback): Self = StObject.set(x, "onAccessibilityTap", value.toJsFn)
    
    inline def setOnAccessibilityTapUndefined: Self = StObject.set(x, "onAccessibilityTap", js.undefined)
    
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
    
    inline def setOnTextLayout(value: /* event */ NativeSyntheticEvent[TextLayoutEventData] => Callback): Self = StObject.set(x, "onTextLayout", js.Any.fromFunction1((t0: /* event */ NativeSyntheticEvent[TextLayoutEventData]) => value(t0).runNow()))
    
    inline def setOnTextLayoutUndefined: Self = StObject.set(x, "onTextLayout", js.undefined)
    
    inline def setOverlay(value: Partial[OverlayProps]): Self = StObject.set(x, "Overlay", value.asInstanceOf[js.Any])
    
    inline def setOverlayUndefined: Self = StObject.set(x, "Overlay", js.undefined)
    
    inline def setPricingCard(value: Partial[PricingCardProps]): Self = StObject.set(x, "PricingCard", value.asInstanceOf[js.Any])
    
    inline def setPricingCardUndefined: Self = StObject.set(x, "PricingCard", js.undefined)
    
    inline def setRating(value: Partial[TapRatingProps]): Self = StObject.set(x, "Rating", value.asInstanceOf[js.Any])
    
    inline def setRatingUndefined: Self = StObject.set(x, "Rating", js.undefined)
    
    inline def setSearchBar(value: Partial[SearchBarProps]): Self = StObject.set(x, "SearchBar", value.asInstanceOf[js.Any])
    
    inline def setSearchBarUndefined: Self = StObject.set(x, "SearchBar", js.undefined)
    
    inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    
    inline def setSelectionColor(value: ColorValue): Self = StObject.set(x, "selectionColor", value.asInstanceOf[js.Any])
    
    inline def setSelectionColorUndefined: Self = StObject.set(x, "selectionColor", js.undefined)
    
    inline def setSlider(value: Partial[SliderProps]): Self = StObject.set(x, "Slider", value.asInstanceOf[js.Any])
    
    inline def setSliderUndefined: Self = StObject.set(x, "Slider", js.undefined)
    
    inline def setSocialIcon(value: Partial[SocialIconProps]): Self = StObject.set(x, "SocialIcon", value.asInstanceOf[js.Any])
    
    inline def setSocialIconUndefined: Self = StObject.set(x, "SocialIcon", js.undefined)
    
    inline def setSpeedDial(value: Partial[SpeedDialProps]): Self = StObject.set(x, "SpeedDial", value.asInstanceOf[js.Any])
    
    inline def setSpeedDialAction(value: Partial[SpeedDialActionProps]): Self = StObject.set(x, "SpeedDialAction", value.asInstanceOf[js.Any])
    
    inline def setSpeedDialActionUndefined: Self = StObject.set(x, "SpeedDialAction", js.undefined)
    
    inline def setSpeedDialUndefined: Self = StObject.set(x, "SpeedDial", js.undefined)
    
    inline def setStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setSuppressHighlighting(value: Boolean): Self = StObject.set(x, "suppressHighlighting", value.asInstanceOf[js.Any])
    
    inline def setSuppressHighlightingUndefined: Self = StObject.set(x, "suppressHighlighting", js.undefined)
    
    inline def setSwitch(value: Partial[SwitchProps]): Self = StObject.set(x, "Switch", value.asInstanceOf[js.Any])
    
    inline def setSwitchUndefined: Self = StObject.set(x, "Switch", js.undefined)
    
    inline def setTab(value: Partial[TabProps]): Self = StObject.set(x, "Tab", value.asInstanceOf[js.Any])
    
    inline def setTabItem(value: Partial[TabItemProps]): Self = StObject.set(x, "TabItem", value.asInstanceOf[js.Any])
    
    inline def setTabItemUndefined: Self = StObject.set(x, "TabItem", js.undefined)
    
    inline def setTabUndefined: Self = StObject.set(x, "Tab", js.undefined)
    
    inline def setTabView(value: Partial[TabViewProps]): Self = StObject.set(x, "TabView", value.asInstanceOf[js.Any])
    
    inline def setTabViewItem(value: Partial[ViewProps]): Self = StObject.set(x, "TabViewItem", value.asInstanceOf[js.Any])
    
    inline def setTabViewItemUndefined: Self = StObject.set(x, "TabViewItem", js.undefined)
    
    inline def setTabViewUndefined: Self = StObject.set(x, "TabView", js.undefined)
    
    inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
    
    inline def setText(value: Partial[TextProps]): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    inline def setTextBreakStrategy(value: simple | highQuality | balanced): Self = StObject.set(x, "textBreakStrategy", value.asInstanceOf[js.Any])
    
    inline def setTextBreakStrategyUndefined: Self = StObject.set(x, "textBreakStrategy", js.undefined)
    
    inline def setTextUndefined: Self = StObject.set(x, "Text", js.undefined)
    
    inline def setTile(value: Partial[TileProps]): Self = StObject.set(x, "Tile", value.asInstanceOf[js.Any])
    
    inline def setTileUndefined: Self = StObject.set(x, "Tile", js.undefined)
    
    inline def setTooltip(value: Partial[TooltipProps]): Self = StObject.set(x, "Tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "Tooltip", js.undefined)
  }
}
