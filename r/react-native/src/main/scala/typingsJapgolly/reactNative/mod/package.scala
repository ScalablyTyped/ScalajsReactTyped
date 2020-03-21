package typingsJapgolly.reactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ART = typingsJapgolly.reactNative.mod.ARTStatic
  type AccessibilityActionEvent = japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]
  type AccessibilityChangeEvent = scala.Boolean
  type AccessibilityEvent = typingsJapgolly.reactNative.mod.AccessibilityChangeEvent | typingsJapgolly.reactNative.mod.AccessibilityAnnoucementFinishedEvent
  type AccessibilityInfo = typingsJapgolly.reactNative.mod.AccessibilityInfoStatic
  type AccessibilityProperties = typingsJapgolly.reactNative.mod.AccessibilityProps
  type AccessibilityPropertiesAndroid = typingsJapgolly.reactNative.mod.AccessibilityPropsAndroid
  type AccessibilityPropertiesIOS = typingsJapgolly.reactNative.mod.AccessibilityPropsIOS
  type ActionSheetIOS = typingsJapgolly.reactNative.mod.ActionSheetIOSStatic
  type ActivityIndicatorComponent = japgolly.scalajs.react.raw.React.Component[typingsJapgolly.reactNative.mod.ActivityIndicatorProps with js.Object, js.Object]
  type ActivityIndicatorIOSProperties = typingsJapgolly.reactNative.mod.ActivityIndicatorIOSProps
  type ActivityIndicatorProperties = typingsJapgolly.reactNative.mod.ActivityIndicatorProps
  type Alert = typingsJapgolly.reactNative.mod.AlertStatic
  type AppState = typingsJapgolly.reactNative.mod.AppStateStatic
  type AsyncStorage = typingsJapgolly.reactNative.mod.AsyncStorageStatic
  type BackHandler = typingsJapgolly.reactNative.mod.BackHandlerStatic
  type BackPressEventName = typingsJapgolly.reactNative.reactNativeStrings.hardwareBackPress
  type ButtonProperties = typingsJapgolly.reactNative.mod.ButtonProps
  type CameraRoll = typingsJapgolly.reactNative.mod.CameraRollStatic
  type Clipboard = typingsJapgolly.reactNative.mod.ClipboardStatic
  type ComponentProvider = js.Function0[typingsJapgolly.react.mod.ComponentType[js.Any]]
  type Constructor[T] = org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, T]
  type DatePickerAndroid = typingsJapgolly.reactNative.mod.DatePickerAndroidStatic
  type DatePickerIOSComponent = japgolly.scalajs.react.raw.React.Component[typingsJapgolly.reactNative.mod.DatePickerIOSProps with js.Object, js.Object]
  type DatePickerIOSProperties = typingsJapgolly.reactNative.mod.DatePickerIOSProps
  type DrawerLayoutAndroidComponent = japgolly.scalajs.react.raw.React.Component[typingsJapgolly.reactNative.mod.DrawerLayoutAndroidProps with js.Object, js.Object]
  type DrawerLayoutAndroidProperties = typingsJapgolly.reactNative.mod.DrawerLayoutAndroidProps
  type DrawerSlideEvent = japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]
  type Easing = typingsJapgolly.reactNative.mod.EasingStatic
  type EasingFunction = js.Function1[/* value */ scala.Double, scala.Double]
  type ErrorHandlerCallback = js.Function2[/* error */ js.Any, /* isFatal */ js.UndefOr[scala.Boolean], scala.Unit]
  type Falsy = js.UndefOr[scala.Null | typingsJapgolly.reactNative.reactNativeBooleans.`false`]
  type FlatListProperties[ItemT] = typingsJapgolly.reactNative.mod.FlatListProps[ItemT]
  type GestureResponderEvent = japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]
  type Handle = scala.Double
  type I18nManager = typingsJapgolly.reactNative.mod.I18nManagerStatic
  type ImageBackgroundComponent = japgolly.scalajs.react.raw.React.Component[typingsJapgolly.reactNative.mod.ImageBackgroundProps with js.Object, js.Object]
  type ImageBackgroundProperties = typingsJapgolly.reactNative.mod.ImageBackgroundProps
  type ImageComponent = japgolly.scalajs.react.raw.React.Component[typingsJapgolly.reactNative.mod.ImageProps with js.Object, js.Object]
  type ImageEditor = typingsJapgolly.reactNative.mod.ImageEditorStatic
  type ImagePickerIOS = typingsJapgolly.reactNative.mod.ImagePickerIOSStatic
  type ImagePickerResult = js.Tuple3[java.lang.String, scala.Double, scala.Double]
  type ImageProperties = typingsJapgolly.reactNative.mod.ImageProps
  type ImagePropertiesAndroid = typingsJapgolly.reactNative.mod.ImagePropsAndroid
  type ImagePropertiesIOS = typingsJapgolly.reactNative.mod.ImagePropsIOS
  type ImagePropertiesSourceOptions = typingsJapgolly.reactNative.mod.ImageSourcePropType
  type ImageRequireSource = scala.Double
  type ImageSourcePropType = typingsJapgolly.reactNative.mod.ImageURISource | js.Array[typingsJapgolly.reactNative.mod.ImageURISource] | typingsJapgolly.reactNative.mod.ImageRequireSource
  type ImageStore = typingsJapgolly.reactNative.mod.ImageStoreStatic
  type InputAccessoryViewProperties = typingsJapgolly.reactNative.mod.InputAccessoryViewProps
  /**
    * It is a component to solve the common problem of views that need to move out of the way of the virtual keyboard.
    * It can automatically adjust either its position or bottom padding based on the position of the keyboard.
    */
  type KeyboardAvoidingViewComponent = japgolly.scalajs.react.raw.React.Component[
    typingsJapgolly.reactNative.mod.KeyboardAvoidingViewProps with js.Object, 
    js.Object
  ]
  type KeyboardEventListener = js.Function1[/* event */ typingsJapgolly.reactNative.mod.KeyboardEvent, scala.Unit]
  type KeyboardTypeAndroid = typingsJapgolly.reactNative.reactNativeStrings.`visible-password`
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactNative.mod.KeyboardType
    - typingsJapgolly.reactNative.mod.KeyboardTypeAndroid
    - typingsJapgolly.reactNative.mod.KeyboardTypeIOS
  */
  type KeyboardTypeOptions = typingsJapgolly.reactNative.mod._KeyboardTypeOptions | typingsJapgolly.reactNative.mod.KeyboardTypeAndroid
  type LayoutAnimation = typingsJapgolly.reactNative.mod.LayoutAnimationStatic
  type Linking = typingsJapgolly.reactNative.mod.LinkingStatic
  type ListRenderItem[ItemT] = js.Function1[
    /* info */ typingsJapgolly.reactNative.mod.ListRenderItemInfo[ItemT], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]
  type ListViewComponent = japgolly.scalajs.react.raw.React.Component[typingsJapgolly.reactNative.mod.ListViewProps with js.Object, js.Object]
  type ListViewProperties = typingsJapgolly.reactNative.mod.ListViewProps
  /**
    * @see https://facebook.github.io/react-native/docs/maskedviewios.html
    */
  type MaskedViewComponent = japgolly.scalajs.react.raw.React.Component[typingsJapgolly.reactNative.mod.MaskedViewIOSProps with js.Object, js.Object]
  type MaskedViewIOSProperties = typingsJapgolly.reactNative.mod.MaskedViewIOSProps
  type MeasureInWindowOnSuccessCallback = js.Function4[
    /* x */ scala.Double, 
    /* y */ scala.Double, 
    /* width */ scala.Double, 
    /* height */ scala.Double, 
    scala.Unit
  ]
  type MeasureLayoutOnSuccessCallback = js.Function4[
    /* left */ scala.Double, 
    /* top */ scala.Double, 
    /* width */ scala.Double, 
    /* height */ scala.Double, 
    scala.Unit
  ]
  type MeasureOnSuccessCallback = js.Function6[
    /* x */ scala.Double, 
    /* y */ scala.Double, 
    /* width */ scala.Double, 
    /* height */ scala.Double, 
    /* pageX */ scala.Double, 
    /* pageY */ scala.Double, 
    scala.Unit
  ]
  type ModalProperties = typingsJapgolly.reactNative.mod.ModalProps
  type ModalProps = typingsJapgolly.reactNative.mod.ModalBaseProps with typingsJapgolly.reactNative.mod.ModalPropsIOS with typingsJapgolly.reactNative.mod.ModalPropsAndroid
  type NativeComponent = typingsJapgolly.reactNative.mod.NativeMethodsMixinStatic
  type NativeEventEmitter = typingsJapgolly.reactNative.mod.EventEmitter
  type NativeMethodsMixin = typingsJapgolly.reactNative.mod.NativeMethodsMixinStatic
  /**
    * Interface for NativeModules which allows to augment NativeModules with type informations.
    * See react-native-sensor-manager for example.
    */
  type NativeModulesStatic = org.scalablytyped.runtime.StringDictionary[js.Any]
  type NativeSyntheticEvent[T] = japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]
  type NavigatorIOSProperties = typingsJapgolly.reactNative.mod.NavigatorIOSProps
  type NodeHandle = scala.Double
  type PanResponder = typingsJapgolly.reactNative.mod.PanResponderStatic
  type PermissionsAndroid = typingsJapgolly.reactNative.mod.PermissionsAndroidStatic
  /**
    * @see https://facebook.github.io/react-native/docs/pickerios.html
    * @see PickerIOS.ios.js
    */
  type PickerIOSComponent = japgolly.scalajs.react.raw.React.Component[typingsJapgolly.reactNative.mod.PickerIOSProps with js.Object, js.Object]
  type PickerIOSItemProperties = typingsJapgolly.reactNative.mod.PickerIOSItemProps
  type PickerIOSProperties = typingsJapgolly.reactNative.mod.PickerIOSProps
  type PickerItemProperties = typingsJapgolly.reactNative.mod.PickerItemProps
  type PickerProperties = typingsJapgolly.reactNative.mod.PickerProps
  type PickerPropertiesAndroid = typingsJapgolly.reactNative.mod.PickerPropsAndroid
  type PickerPropertiesIOS = typingsJapgolly.reactNative.mod.PickerPropsIOS
  /**
    * React component that wraps the Android-only `ProgressBar`. This component is used to indicate
    * that the app is loading or there is some activity in the app.
    */
  type ProgressBarAndroidComponent = japgolly.scalajs.react.raw.React.Component[typingsJapgolly.reactNative.mod.ProgressBarAndroidProps with js.Object, js.Object]
  type ProgressBarAndroidProperties = typingsJapgolly.reactNative.mod.ProgressBarAndroidProps
  type ProgressViewIOSComponent = japgolly.scalajs.react.raw.React.Component[typingsJapgolly.reactNative.mod.ProgressViewIOSProps with js.Object, js.Object]
  type ProgressViewIOSProperties = typingsJapgolly.reactNative.mod.ProgressViewIOSProps
  type PushNotificationIOS = typingsJapgolly.reactNative.mod.PushNotificationIOSStatic
  /**
    * Receive events from native-code
    * Deprecated - subclass NativeEventEmitter to create granular event modules instead of
    * adding all event listeners directly to RCTNativeAppEventEmitter.
    * @see https://github.com/facebook/react-native/blob/0.34-stable\Libraries\EventEmitter\RCTNativeAppEventEmitter.js
    * @see https://facebook.github.io/react-native/docs/native-modules-ios.html#sending-events-to-javascript
    */
  type RCTNativeAppEventEmitter = typingsJapgolly.reactNative.mod.DeviceEventEmitterStatic
  /**
    * Wrapper around android native recycler view.
    *
    * It simply renders rows passed as children in a separate recycler view cells
    * similarly to how `ScrollView` is doing it. Thanks to the fact that it uses
    * native `RecyclerView` though, rows that are out of sight are going to be
    * automatically detached (similarly on how this would work with
    * `removeClippedSubviews = true` on a `ScrollView.js`).
    *
    * CAUTION: This is an experimental component and should only be used together
    * with javascript implementation of list view (see ListView.js). In order to
    * use it pass this component as `renderScrollComponent` to the list view. For
    * now only horizontal scrolling is supported.
    */
  type RecyclerViewBackedScrollViewComponent = japgolly.scalajs.react.raw.React.Component[
    typingsJapgolly.reactNative.mod.RecyclerViewBackedScrollViewProps with js.Object, 
    js.Object
  ]
  type RecyclerViewBackedScrollViewProperties = typingsJapgolly.reactNative.mod.RecyclerViewBackedScrollViewProps
  type RecyclerViewBackedScrollViewProps = typingsJapgolly.reactNative.mod.ScrollViewProps
  /**
    * This component is used inside a ScrollView or ListView to add pull to refresh
    * functionality. When the ScrollView is at `scrollY: 0`, swiping down
    * triggers an `onRefresh` event.
    *
    * __Note:__ `refreshing` is a controlled prop, this is why it needs to be set to true
    * in the `onRefresh` function otherwise the refresh indicator will stop immediately.
    */
  type RefreshControlComponent = japgolly.scalajs.react.raw.React.Component[typingsJapgolly.reactNative.mod.RefreshControlProps with js.Object, js.Object]
  type RefreshControlProperties = typingsJapgolly.reactNative.mod.RefreshControlProps
  type RefreshControlPropertiesAndroid = typingsJapgolly.reactNative.mod.RefreshControlPropsAndroid
  type RefreshControlPropertiesIOS = typingsJapgolly.reactNative.mod.RefreshControlPropsIOS
  /** Keep a brand of 'T' so that calls to `StyleSheet.flatten` can take `RegisteredStyle<T>` and return `T`. */
  type RegisteredStyle[T] = scala.Double with typingsJapgolly.reactNative.AnonRegisteredStyleBrand[T]
  type Runnable = js.Function1[/* appParameters */ js.Any, scala.Unit]
  /**
    * Renders nested content and automatically applies paddings reflect the portion of the view
    * that is not covered by navigation bars, tab bars, toolbars, and other ancestor views.
    * Moreover, and most importantly, Safe Area's paddings reflect physical limitation of the screen,
    * such as rounded corners or camera notches (aka sensor housing area on iPhone X).
    */
  type SafeAreaViewComponent = japgolly.scalajs.react.raw.React.Component[typingsJapgolly.reactNative.mod.ViewProps with js.Object, js.Object]
  type ScrollResponderEvent = japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]
  type ScrollViewComponent = japgolly.scalajs.react.raw.React.Component[typingsJapgolly.reactNative.mod.ScrollViewProps with js.Object, js.Object]
  type ScrollViewProperties = typingsJapgolly.reactNative.mod.ScrollViewProps
  type ScrollViewPropertiesAndroid = typingsJapgolly.reactNative.mod.ScrollViewPropsAndroid
  type ScrollViewPropertiesIOS = typingsJapgolly.reactNative.mod.ScrollViewPropsIOS
  type SectionListProperties[ItemT] = typingsJapgolly.reactNative.mod.SectionListProps[ItemT]
  type SectionListRenderItem[ItemT] = js.Function1[
    /* info */ typingsJapgolly.reactNative.mod.SectionListRenderItemInfo[ItemT], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]
  /**
    * Use `SegmentedControlIOS` to render a UISegmentedControl iOS.
    *
    * #### Programmatically changing selected index
    *
    * The selected index can be changed on the fly by assigning the
    * selectIndex prop to a state variable, then changing that variable.
    * Note that the state variable would need to be updated as the user
    * selects a value and changes the index, as shown in the example below.
    *
    * ````
    * <SegmentedControlIOS
    *   values={['One', 'Two']}
    *   selectedIndex={this.state.selectedIndex}
    *   onChange={(event) => {
    *     this.setState({selectedIndex: event.nativeEvent.selectedSegmentIndex});
    *   }}
    * />
    * ````
    */
  type SegmentedControlIOSComponent = japgolly.scalajs.react.raw.React.Component[typingsJapgolly.reactNative.mod.SegmentedControlIOSProps with js.Object, js.Object]
  type SegmentedControlIOSProperties = typingsJapgolly.reactNative.mod.SegmentedControlIOSProps
  type Settings = typingsJapgolly.reactNative.mod.SettingsStatic
  type Share = typingsJapgolly.reactNative.mod.ShareStatic
  /**
    * A component used to select a single value from a range of values.
    */
  type SliderComponent = japgolly.scalajs.react.raw.React.Component[typingsJapgolly.reactNative.mod.SliderProps with js.Object, js.Object]
  type SliderIOS = typingsJapgolly.reactNative.mod.Slider
  type SliderProperties = typingsJapgolly.reactNative.mod.SliderProps
  type SliderPropertiesAndroid = typingsJapgolly.reactNative.mod.SliderPropsAndroid
  type SliderPropertiesIOS = typingsJapgolly.reactNative.mod.SliderPropsIOS
  type SnapshotViewIOSComponent = japgolly.scalajs.react.raw.React.Component[typingsJapgolly.reactNative.mod.SnapshotViewIOSProps with js.Object, js.Object]
  type SnapshotViewIOSProperties = typingsJapgolly.reactNative.mod.SnapshotViewIOSProps
  type StatusBarIOS = typingsJapgolly.reactNative.mod.StatusBarIOSStatic
  type StatusBarIOSStatic = typingsJapgolly.reactNative.mod.NativeEventEmitter
  type StatusBarProperties = typingsJapgolly.reactNative.mod.StatusBarProps
  type StatusBarPropertiesAndroid = typingsJapgolly.reactNative.mod.StatusBarPropsAndroid
  type StatusBarPropertiesIOS = typingsJapgolly.reactNative.mod.StatusBarPropsIOS
  type StyleProp[T] = T | typingsJapgolly.reactNative.mod.RegisteredStyle[T] | (typingsJapgolly.reactNative.mod.RecursiveArray[
    T | typingsJapgolly.reactNative.mod.RegisteredStyle[T] | typingsJapgolly.reactNative.mod.Falsy
  ]) | typingsJapgolly.reactNative.mod.Falsy
  /**
    * Renders a boolean input.
    *
    * This is a controlled component that requires an `onValueChange` callback that
    * updates the `value` prop in order for the component to reflect user actions.
    * If the `value` prop is not updated, the component will continue to render
    * the supplied `value` prop instead of the expected result of any user actions.
    */
  type SwitchComponent = japgolly.scalajs.react.raw.React.Component[typingsJapgolly.reactNative.mod.SwitchProps with js.Object, js.Object]
  type SwitchIOSProperties = typingsJapgolly.reactNative.mod.SwitchIOSProps
  type SwitchProperties = typingsJapgolly.reactNative.mod.SwitchProps
  type SwitchPropertiesIOS = typingsJapgolly.reactNative.mod.SwitchPropsIOS
  type Systrace = typingsJapgolly.reactNative.mod.SystraceStatic
  type TabBarIOSItemProperties = typingsJapgolly.reactNative.mod.TabBarIOSItemProps
  type TabBarIOSProperties = typingsJapgolly.reactNative.mod.TabBarIOSProps
  type Task = js.Function1[/* taskData */ js.Any, js.Promise[scala.Unit]]
  type TaskProvider = js.Function0[typingsJapgolly.reactNative.mod.Task]
  /**
    * A React component for displaying text which supports nesting, styling, and touch handling.
    */
  type TextComponent = japgolly.scalajs.react.raw.React.Component[typingsJapgolly.reactNative.mod.TextProps with js.Object, js.Object]
  type TextInputAndroidProperties = typingsJapgolly.reactNative.mod.TextInputAndroidProps
  /**
    * @see https://facebook.github.io/react-native/docs/textinput.html#methods
    */
  type TextInputComponent = japgolly.scalajs.react.raw.React.Component[typingsJapgolly.reactNative.mod.TextInputProps with js.Object, js.Object]
  type TextInputIOSProperties = typingsJapgolly.reactNative.mod.TextInputIOSProps
  type TextInputProperties = typingsJapgolly.reactNative.mod.TextInputProps
  type TextProperties = typingsJapgolly.reactNative.mod.TextProps
  type TextPropertiesAndroid = typingsJapgolly.reactNative.mod.TextPropsAndroid
  type TextPropertiesIOS = typingsJapgolly.reactNative.mod.TextPropsIOS
  type TimePickerAndroid = typingsJapgolly.reactNative.mod.TimePickerAndroidStatic
  type ToastAndroid = typingsJapgolly.reactNative.mod.ToastAndroidStatic
  /**
    * React component that wraps the Android-only [`Toolbar` widget][0]. A Toolbar can display a logo,
    * navigation icon (e.g. hamburger menu), a title & subtitle and a list of actions. The title and
    * subtitle are expanded so the logo and navigation icons are displayed on the left, title and
    * subtitle in the middle and the actions on the right.
    *
    * If the toolbar has an only child, it will be displayed between the title and actions.
    *
    * Although the Toolbar supports remote images for the logo, navigation and action icons, this
    * should only be used in DEV mode where `require('./some_icon.png')` translates into a packager
    * URL. In release mode you should always use a drawable resource for these icons. Using
    * `require('./some_icon.png')` will do this automatically for you, so as long as you don't
    * explicitly use e.g. `{uri: 'http://...'}`, you will be good.
    *
    * [0]: https://developer.android.com/reference/android/support/v7/widget/Toolbar.html
    */
  type ToolbarAndroidComponent = japgolly.scalajs.react.raw.React.Component[typingsJapgolly.reactNative.mod.ToolbarAndroidProps with js.Object, js.Object]
  type ToolbarAndroidProperties = typingsJapgolly.reactNative.mod.ToolbarAndroidProps
  /**
    * A wrapper for making views respond properly to touches.
    * On press down, the opacity of the wrapped view is decreased,
    * which allows the underlay color to show through, darkening or tinting the view.
    * The underlay comes from adding a view to the view hierarchy,
    * which can sometimes cause unwanted visual artifacts if not used correctly,
    * for example if the backgroundColor of the wrapped view isn't explicitly set to an opaque color.
    *
    * NOTE: TouchableHighlight supports only one child
    * If you wish to have several child components, wrap them in a View.
    *
    * @see https://facebook.github.io/react-native/docs/touchablehighlight.html
    */
  type TouchableHighlightComponent = japgolly.scalajs.react.raw.React.Component[typingsJapgolly.reactNative.mod.TouchableHighlightProps with js.Object, js.Object]
  type TouchableHighlightProperties = typingsJapgolly.reactNative.mod.TouchableHighlightProps
  /**
    * A wrapper for making views respond properly to touches (Android only).
    * On Android this component uses native state drawable to display touch feedback.
    * At the moment it only supports having a single View instance as a child node,
    * as it's implemented by replacing that View with another instance of RCTView node with some additional properties set.
    *
    * Background drawable of native feedback touchable can be customized with background property.
    *
    * @see https://facebook.github.io/react-native/docs/touchablenativefeedback.html#content
    */
  type TouchableNativeFeedbackComponent = japgolly.scalajs.react.raw.React.Component[
    typingsJapgolly.reactNative.mod.TouchableNativeFeedbackProps with js.Object, 
    js.Object
  ]
  type TouchableNativeFeedbackProperties = typingsJapgolly.reactNative.mod.TouchableNativeFeedbackProps
  /**
    * A wrapper for making views respond properly to touches.
    * On press down, the opacity of the wrapped view is decreased, dimming it.
    * This is done without actually changing the view hierarchy,
    * and in general is easy to add to an app without weird side-effects.
    *
    * @see https://facebook.github.io/react-native/docs/touchableopacity.html
    */
  type TouchableOpacityComponent = japgolly.scalajs.react.raw.React.Component[typingsJapgolly.reactNative.mod.TouchableOpacityProps with js.Object, js.Object]
  type TouchableOpacityProperties = typingsJapgolly.reactNative.mod.TouchableOpacityProps
  /**
    * Do not use unless you have a very good reason.
    * All the elements that respond to press should have a visual feedback when touched.
    * This is one of the primary reason a "web" app doesn't feel "native".
    *
    * @see https://facebook.github.io/react-native/docs/touchablewithoutfeedback.html
    */
  type TouchableWithoutFeedbackComponent = japgolly.scalajs.react.raw.React.Component[
    typingsJapgolly.reactNative.mod.TouchableWithoutFeedbackProps with js.Object, 
    js.Object
  ]
  type TouchableWithoutFeedbackProperties = typingsJapgolly.reactNative.mod.TouchableWithoutFeedbackProps
  type UIManager = typingsJapgolly.reactNative.mod.UIManagerStatic
  type Vibration = typingsJapgolly.reactNative.mod.VibrationStatic
  /**
    * The most fundamental component for building UI, View is a container that supports layout with flexbox, style, some touch handling,
    * and accessibility controls, and is designed to be nested inside other views and to have 0 to many children of any type.
    * View maps directly to the native view equivalent on whatever platform React is running on,
    * whether that is a UIView, <div>, android.view, etc.
    */
  type ViewComponent = japgolly.scalajs.react.raw.React.Component[typingsJapgolly.reactNative.mod.ViewProps with js.Object, js.Object]
  type ViewPagerAndroidComponent = japgolly.scalajs.react.raw.React.Component[typingsJapgolly.reactNative.mod.ViewPagerAndroidProps with js.Object, js.Object]
  type ViewPagerAndroidProperties = typingsJapgolly.reactNative.mod.ViewPagerAndroidProps
  type ViewProperties = typingsJapgolly.reactNative.mod.ViewProps
  type ViewPropertiesAndroid = typingsJapgolly.reactNative.mod.ViewPropsAndroid
  type ViewPropertiesIOS = typingsJapgolly.reactNative.mod.ViewPropsIOS
  type ViewabilityConfigCallbackPairs = js.Array[typingsJapgolly.reactNative.mod.ViewabilityConfigCallbackPair]
  type VirtualizedListProperties[ItemT] = typingsJapgolly.reactNative.mod.VirtualizedListProps[ItemT]
}
