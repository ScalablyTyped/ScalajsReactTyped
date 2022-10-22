package typingsJapgolly.reactNativeVectorIcons

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.react.mod.Component
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
import typingsJapgolly.reactNativeVectorIcons.anon.Brand
import typingsJapgolly.reactNativeVectorIcons.anon.KinFontAwesome5IconVarian
import typingsJapgolly.reactNativeVectorIcons.iconMod.Icon.TabBarItem
import typingsJapgolly.reactNativeVectorIcons.iconMod.Icon.TabBarItemIOS
import typingsJapgolly.reactNativeVectorIcons.iconMod.ImageSource
import typingsJapgolly.reactNativeVectorIcons.reactNativeVectorIconsInts.`0`
import typingsJapgolly.reactNativeVectorIcons.reactNativeVectorIconsInts.`1`
import typingsJapgolly.reactNativeVectorIcons.reactNativeVectorIconsInts.`2`
import typingsJapgolly.reactNativeVectorIcons.reactNativeVectorIconsInts.`3`
import typingsJapgolly.reactNativeVectorIcons.reactNativeVectorIconsStrings.`no-hide-descendants`
import typingsJapgolly.reactNativeVectorIcons.reactNativeVectorIconsStrings.all
import typingsJapgolly.reactNativeVectorIcons.reactNativeVectorIconsStrings.assertive
import typingsJapgolly.reactNativeVectorIcons.reactNativeVectorIconsStrings.auto
import typingsJapgolly.reactNativeVectorIcons.reactNativeVectorIconsStrings.balanced
import typingsJapgolly.reactNativeVectorIcons.reactNativeVectorIconsStrings.clip
import typingsJapgolly.reactNativeVectorIcons.reactNativeVectorIconsStrings.email
import typingsJapgolly.reactNativeVectorIcons.reactNativeVectorIconsStrings.full
import typingsJapgolly.reactNativeVectorIcons.reactNativeVectorIconsStrings.head
import typingsJapgolly.reactNativeVectorIcons.reactNativeVectorIconsStrings.highQuality
import typingsJapgolly.reactNativeVectorIcons.reactNativeVectorIconsStrings.link
import typingsJapgolly.reactNativeVectorIcons.reactNativeVectorIconsStrings.middle
import typingsJapgolly.reactNativeVectorIcons.reactNativeVectorIconsStrings.no
import typingsJapgolly.reactNativeVectorIcons.reactNativeVectorIconsStrings.none
import typingsJapgolly.reactNativeVectorIcons.reactNativeVectorIconsStrings.normal
import typingsJapgolly.reactNativeVectorIcons.reactNativeVectorIconsStrings.phoneNumber
import typingsJapgolly.reactNativeVectorIcons.reactNativeVectorIconsStrings.polite
import typingsJapgolly.reactNativeVectorIcons.reactNativeVectorIconsStrings.simple
import typingsJapgolly.reactNativeVectorIcons.reactNativeVectorIconsStrings.tail
import typingsJapgolly.reactNativeVectorIcons.reactNativeVectorIconsStrings.yes
import typingsJapgolly.std.Exclude
import typingsJapgolly.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fontAwesome5Mod {
  
  @JSImport("react-native-vector-icons/FontAwesome5", JSImport.Default)
  @js.native
  open class default () extends Component[FontAwesome5IconProps, Any, Any]
  /* static members */
  object default {
    
    @JSImport("react-native-vector-icons/FontAwesome5", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-vector-icons/FontAwesome5", "default.Button")
    @js.native
    def Button: Instantiable0[FontAwesome5IconButton] = js.native
    inline def Button_=(x: Instantiable0[FontAwesome5IconButton]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Button")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-vector-icons/FontAwesome5", "default.TabBarItem")
    @js.native
    def TabBarItem: Instantiable0[typingsJapgolly.reactNativeVectorIcons.iconMod.Icon.TabBarItem] = js.native
    
    @JSImport("react-native-vector-icons/FontAwesome5", "default.TabBarItemIOS")
    @js.native
    def TabBarItemIOS: Instantiable0[typingsJapgolly.reactNativeVectorIcons.iconMod.Icon.TabBarItemIOS] = js.native
    inline def TabBarItemIOS_=(x: Instantiable0[TabBarItemIOS]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TabBarItemIOS")(x.asInstanceOf[js.Any])
    
    inline def TabBarItem_=(x: Instantiable0[TabBarItem]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TabBarItem")(x.asInstanceOf[js.Any])
    
    inline def getImageSource(name: String): js.Promise[ImageSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("getImageSource")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ImageSource]]
    inline def getImageSource(name: String, size: Double): js.Promise[ImageSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageSource")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImageSource]]
    inline def getImageSource(name: String, size: Double, color: String): js.Promise[ImageSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageSource")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImageSource]]
    inline def getImageSource(name: String, size: Double, color: String, fa5Style: ValueOf[Brand]): js.Promise[ImageSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageSource")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any], color.asInstanceOf[js.Any], fa5Style.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImageSource]]
    inline def getImageSource(name: String, size: Double, color: Unit, fa5Style: ValueOf[Brand]): js.Promise[ImageSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageSource")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any], color.asInstanceOf[js.Any], fa5Style.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImageSource]]
    inline def getImageSource(name: String, size: Unit, color: String): js.Promise[ImageSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageSource")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImageSource]]
    inline def getImageSource(name: String, size: Unit, color: String, fa5Style: ValueOf[Brand]): js.Promise[ImageSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageSource")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any], color.asInstanceOf[js.Any], fa5Style.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImageSource]]
    inline def getImageSource(name: String, size: Unit, color: Unit, fa5Style: ValueOf[Brand]): js.Promise[ImageSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageSource")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any], color.asInstanceOf[js.Any], fa5Style.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImageSource]]
    
    inline def getImageSourceSync(name: String): ImageSource = ^.asInstanceOf[js.Dynamic].applyDynamic("getImageSourceSync")(name.asInstanceOf[js.Any]).asInstanceOf[ImageSource]
    inline def getImageSourceSync(name: String, size: Double): ImageSource = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageSourceSync")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[ImageSource]
    inline def getImageSourceSync(name: String, size: Double, color: String): ImageSource = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageSourceSync")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[ImageSource]
    inline def getImageSourceSync(name: String, size: Double, color: String, fa5Style: ValueOf[Brand]): ImageSource = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageSourceSync")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any], color.asInstanceOf[js.Any], fa5Style.asInstanceOf[js.Any])).asInstanceOf[ImageSource]
    inline def getImageSourceSync(name: String, size: Double, color: Unit, fa5Style: ValueOf[Brand]): ImageSource = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageSourceSync")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any], color.asInstanceOf[js.Any], fa5Style.asInstanceOf[js.Any])).asInstanceOf[ImageSource]
    inline def getImageSourceSync(name: String, size: Unit, color: String): ImageSource = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageSourceSync")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[ImageSource]
    inline def getImageSourceSync(name: String, size: Unit, color: String, fa5Style: ValueOf[Brand]): ImageSource = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageSourceSync")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any], color.asInstanceOf[js.Any], fa5Style.asInstanceOf[js.Any])).asInstanceOf[ImageSource]
    inline def getImageSourceSync(name: String, size: Unit, color: Unit, fa5Style: ValueOf[Brand]): ImageSource = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageSourceSync")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any], color.asInstanceOf[js.Any], fa5Style.asInstanceOf[js.Any])).asInstanceOf[ImageSource]
    
    inline def hasIcon(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasIcon")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def loadFont(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadFont")().asInstanceOf[js.Promise[Unit]]
    inline def loadFont(file: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadFont")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  }
  
  object FA5Style {
    
    @JSImport("react-native-vector-icons/FontAwesome5", "FA5Style")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-vector-icons/FontAwesome5", "FA5Style.brand")
    @js.native
    def brand: `3` = js.native
    inline def brand_=(x: `3`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("brand")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-vector-icons/FontAwesome5", "FA5Style.light")
    @js.native
    def light: `1` = js.native
    inline def light_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("light")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-vector-icons/FontAwesome5", "FA5Style.regular")
    @js.native
    def regular: `0` = js.native
    inline def regular_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("regular")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-vector-icons/FontAwesome5", "FA5Style.solid")
    @js.native
    def solid: `2` = js.native
    inline def solid_=(x: `2`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("solid")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-native-vector-icons/FontAwesome5", "FontAwesome5IconButton")
  @js.native
  open class FontAwesome5IconButton protected () extends Component[KinFontAwesome5IconVarian, Any, Any] {
    def this(props: KinFontAwesome5IconVarian) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: KinFontAwesome5IconVarian, context: Any) = this()
  }
  
  type FontAwesome5Icon = japgolly.scalajs.react.facade.React.Component[FontAwesome5IconProps & js.Object, js.Object]
  
  /* Inlined {[ K in react-native-vector-icons.react-native-vector-icons/FontAwesome5.FontAwesome5IconVariants ]:? boolean} & react-native-vector-icons.react-native-vector-icons/Icon.IconProps */
  trait FontAwesome5IconProps extends StObject {
    
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
    
    var brand: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    /**
      * Color of the icon
      *
      */
    var color: js.UndefOr[ColorValue | Double] = js.undefined
    
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
    
    var light: js.UndefOr[Boolean] = js.undefined
    
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
      * Name of the icon to show
      *
      * See Icon Explorer app
      * {@link https://github.com/oblador/react-native-vector-icons/tree/master/Examples/IconExplorer}
      */
    var name: String
    
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
    
    /**
      * Size of the icon, can also be passed as fontSize in the style object.
      *
      * @default 12
      */
    var size: js.UndefOr[Double] = js.undefined
    
    var solid: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @see https://reactnative.dev/docs/text#style
      */
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
  object FontAwesome5IconProps {
    
    inline def apply(name: String): FontAwesome5IconProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FontAwesome5IconProps]
    }
    
    extension [Self <: FontAwesome5IconProps](x: Self) {
      
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
      
      inline def setAllowFontScaling(value: Boolean): Self = StObject.set(x, "allowFontScaling", value.asInstanceOf[js.Any])
      
      inline def setAllowFontScalingUndefined: Self = StObject.set(x, "allowFontScaling", js.undefined)
      
      inline def setAndroid_hyphenationFrequency(value: normal | none | full): Self = StObject.set(x, "android_hyphenationFrequency", value.asInstanceOf[js.Any])
      
      inline def setAndroid_hyphenationFrequencyUndefined: Self = StObject.set(x, "android_hyphenationFrequency", js.undefined)
      
      inline def setBrand(value: Boolean): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
      
      inline def setBrandUndefined: Self = StObject.set(x, "brand", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setColor(value: ColorValue | Double): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDataDetectorType(value: phoneNumber | link | email | none | all): Self = StObject.set(x, "dataDetectorType", value.asInstanceOf[js.Any])
      
      inline def setDataDetectorTypeNull: Self = StObject.set(x, "dataDetectorType", null)
      
      inline def setDataDetectorTypeUndefined: Self = StObject.set(x, "dataDetectorType", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setEllipsizeMode(value: head | middle | tail | clip): Self = StObject.set(x, "ellipsizeMode", value.asInstanceOf[js.Any])
      
      inline def setEllipsizeModeUndefined: Self = StObject.set(x, "ellipsizeMode", js.undefined)
      
      inline def setImportantForAccessibility(value: auto | yes | no | `no-hide-descendants`): Self = StObject.set(x, "importantForAccessibility", value.asInstanceOf[js.Any])
      
      inline def setImportantForAccessibilityUndefined: Self = StObject.set(x, "importantForAccessibility", js.undefined)
      
      inline def setLight(value: Boolean): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
      
      inline def setLightUndefined: Self = StObject.set(x, "light", js.undefined)
      
      inline def setLineBreakMode(value: head | middle | tail | clip): Self = StObject.set(x, "lineBreakMode", value.asInstanceOf[js.Any])
      
      inline def setLineBreakModeUndefined: Self = StObject.set(x, "lineBreakMode", js.undefined)
      
      inline def setMaxFontSizeMultiplier(value: Double): Self = StObject.set(x, "maxFontSizeMultiplier", value.asInstanceOf[js.Any])
      
      inline def setMaxFontSizeMultiplierNull: Self = StObject.set(x, "maxFontSizeMultiplier", null)
      
      inline def setMaxFontSizeMultiplierUndefined: Self = StObject.set(x, "maxFontSizeMultiplier", js.undefined)
      
      inline def setMinimumFontScale(value: Double): Self = StObject.set(x, "minimumFontScale", value.asInstanceOf[js.Any])
      
      inline def setMinimumFontScaleUndefined: Self = StObject.set(x, "minimumFontScale", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
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
      
      inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      inline def setSelectionColor(value: ColorValue): Self = StObject.set(x, "selectionColor", value.asInstanceOf[js.Any])
      
      inline def setSelectionColorUndefined: Self = StObject.set(x, "selectionColor", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSolid(value: Boolean): Self = StObject.set(x, "solid", value.asInstanceOf[js.Any])
      
      inline def setSolidUndefined: Self = StObject.set(x, "solid", js.undefined)
      
      inline def setStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSuppressHighlighting(value: Boolean): Self = StObject.set(x, "suppressHighlighting", value.asInstanceOf[js.Any])
      
      inline def setSuppressHighlightingUndefined: Self = StObject.set(x, "suppressHighlighting", js.undefined)
      
      inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
      
      inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
      
      inline def setTextBreakStrategy(value: simple | highQuality | balanced): Self = StObject.set(x, "textBreakStrategy", value.asInstanceOf[js.Any])
      
      inline def setTextBreakStrategyUndefined: Self = StObject.set(x, "textBreakStrategy", js.undefined)
    }
  }
  
  /* Inlined keyof react-native-vector-icons.react-native-vector-icons/FontAwesome5.Omit<{  regular :0,   light :1,   solid :2,   brand :3}, 'regular'> */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactNativeVectorIcons.reactNativeVectorIconsStrings.light
    - typingsJapgolly.reactNativeVectorIcons.reactNativeVectorIconsStrings.solid
    - typingsJapgolly.reactNativeVectorIcons.reactNativeVectorIconsStrings.brand
  */
  trait FontAwesome5IconVariants extends StObject
  object FontAwesome5IconVariants {
    
    inline def brand: typingsJapgolly.reactNativeVectorIcons.reactNativeVectorIconsStrings.brand = "brand".asInstanceOf[typingsJapgolly.reactNativeVectorIcons.reactNativeVectorIconsStrings.brand]
    
    inline def light: typingsJapgolly.reactNativeVectorIcons.reactNativeVectorIconsStrings.light = "light".asInstanceOf[typingsJapgolly.reactNativeVectorIcons.reactNativeVectorIconsStrings.light]
    
    inline def solid: typingsJapgolly.reactNativeVectorIcons.reactNativeVectorIconsStrings.solid = "solid".asInstanceOf[typingsJapgolly.reactNativeVectorIcons.reactNativeVectorIconsStrings.solid]
  }
  
  type Omit[T, K] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  type ValueOf[T] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
}
