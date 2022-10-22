package typingsJapgolly.tabris.global.tabris

import typingsJapgolly.std.InstanceType
import typingsJapgolly.std.Number
import typingsJapgolly.tabris.Crypto
import typingsJapgolly.tabris.RequestInit
import typingsJapgolly.tabris.anon.Attribute
import typingsJapgolly.tabris.anon.Children
import typingsJapgolly.tabris.anon.Name
import typingsJapgolly.tabris.anon.`0`
import typingsJapgolly.tabris.global.tabris.^
import typingsJapgolly.tabris.mod.ActionFactory
import typingsJapgolly.tabris.mod.ActivityIndicatorFactory
import typingsJapgolly.tabris.mod.ApplyAttributes
import typingsJapgolly.tabris.mod.Attributes
import typingsJapgolly.tabris.mod.BaseConstructor
import typingsJapgolly.tabris.mod.ButtonFactory
import typingsJapgolly.tabris.mod.CallableConstructor
import typingsJapgolly.tabris.mod.CameraViewFactory
import typingsJapgolly.tabris.mod.CanvasFactory
import typingsJapgolly.tabris.mod.CheckBoxFactory
import typingsJapgolly.tabris.mod.CollectionViewFactory
import typingsJapgolly.tabris.mod.CompositeFactory
import typingsJapgolly.tabris.mod.Constructor
import typingsJapgolly.tabris.mod.ImageViewFactory
import typingsJapgolly.tabris.mod.JSXCandidate
import typingsJapgolly.tabris.mod.JSXChildren
import typingsJapgolly.tabris.mod.NavigationViewFactory
import typingsJapgolly.tabris.mod.ObservableDataFactory
import typingsJapgolly.tabris.mod.PageFactory
import typingsJapgolly.tabris.mod.PdfViewFactory
import typingsJapgolly.tabris.mod.PickerFactory
import typingsJapgolly.tabris.mod.ProgressBarFactory
import typingsJapgolly.tabris.mod.RadioButtonFactory
import typingsJapgolly.tabris.mod.RefreshCompositeFactory
import typingsJapgolly.tabris.mod.RowFactory
import typingsJapgolly.tabris.mod.RuleSet
import typingsJapgolly.tabris.mod.ScrollViewFactory
import typingsJapgolly.tabris.mod.SearchActionFactory
import typingsJapgolly.tabris.mod.Selector
import typingsJapgolly.tabris.mod.SelectorString
import typingsJapgolly.tabris.mod.SliderFactory
import typingsJapgolly.tabris.mod.StackFactory
import typingsJapgolly.tabris.mod.SwitchFactory
import typingsJapgolly.tabris.mod.TabFactory
import typingsJapgolly.tabris.mod.TabFolderFactory
import typingsJapgolly.tabris.mod.TextInputFactory
import typingsJapgolly.tabris.mod.TextViewFactory
import typingsJapgolly.tabris.mod.ToggleButtonFactory
import typingsJapgolly.tabris.mod.VideoFactory
import typingsJapgolly.tabris.mod.WebViewFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def Action: ActionFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("Action").asInstanceOf[ActionFactory]

inline def ActivityIndicator: ActivityIndicatorFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("ActivityIndicator").asInstanceOf[ActivityIndicatorFactory]

inline def Apply[WidgetConstructor /* <: BaseConstructor[typingsJapgolly.tabris.mod.Widget[Any]] */](attr: ApplyAttributes[WidgetConstructor]): typingsJapgolly.tabris.anon.Apply = ^.asInstanceOf[js.Dynamic].applyDynamic("Apply")(attr.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.tabris.anon.Apply]

inline def Button: ButtonFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("Button").asInstanceOf[ButtonFactory]

inline def CameraView: CameraViewFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("CameraView").asInstanceOf[CameraViewFactory]

inline def Canvas: CanvasFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("Canvas").asInstanceOf[CanvasFactory]

inline def CheckBox: CheckBoxFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("CheckBox").asInstanceOf[CheckBoxFactory]

inline def CollectionView: CollectionViewFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("CollectionView").asInstanceOf[CollectionViewFactory]

inline def Composite: CompositeFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("Composite").asInstanceOf[CompositeFactory]

inline def ImageView: ImageViewFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("ImageView").asInstanceOf[ImageViewFactory]

inline def NavigationView: NavigationViewFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("NavigationView").asInstanceOf[NavigationViewFactory]

inline def ObservableData: ObservableDataFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("ObservableData").asInstanceOf[ObservableDataFactory]

inline def Page: PageFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("Page").asInstanceOf[PageFactory]

inline def PdfView: PdfViewFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("PdfView").asInstanceOf[PdfViewFactory]

inline def Picker: PickerFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("Picker").asInstanceOf[PickerFactory]

inline def ProgressBar: ProgressBarFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("ProgressBar").asInstanceOf[ProgressBarFactory]

inline def RadioButton: RadioButtonFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("RadioButton").asInstanceOf[RadioButtonFactory]

inline def RefreshComposite: RefreshCompositeFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("RefreshComposite").asInstanceOf[RefreshCompositeFactory]

inline def Row: RowFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("Row").asInstanceOf[RowFactory]

inline def ScrollView: ScrollViewFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("ScrollView").asInstanceOf[ScrollViewFactory]

inline def SearchAction: SearchActionFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("SearchAction").asInstanceOf[SearchActionFactory]

inline def Set[TargetConstructor /* <: BaseConstructor[typingsJapgolly.tabris.mod.NativeObject] */, ResultType, AttrName /* <: /* keyof ResultType */ String */](attr: Attribute[TargetConstructor, AttrName, ResultType]): ResultType = ^.asInstanceOf[js.Dynamic].applyDynamic("Set")(attr.asInstanceOf[js.Any]).asInstanceOf[ResultType]

inline def Set_prototype[WidgetConstructor /* <: BaseConstructor[typingsJapgolly.tabris.mod.Widget[Any]] */](
  target: WidgetConstructor,
  attributes: Attributes[
  /* import warning: importer.ImportType#apply Failed type conversion: WidgetConstructor['prototype'] */ js.Any, 
  Any
]
): Attributes[
/* import warning: importer.ImportType#apply Failed type conversion: WidgetConstructor['prototype'] */ js.Any, 
Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("Set")(target.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[Attributes[
/* import warning: importer.ImportType#apply Failed type conversion: WidgetConstructor['prototype'] */ js.Any, 
Any]]
inline def Set_prototype[WidgetConstructor /* <: BaseConstructor[typingsJapgolly.tabris.mod.Widget[Any]] */](
  target: WidgetConstructor,
  selector: SelectorString,
  attributes: Attributes[
  /* import warning: importer.ImportType#apply Failed type conversion: WidgetConstructor['prototype'] */ js.Any, 
  Any
]
): RuleSet[typingsJapgolly.tabris.mod.Widget[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("Set")(target.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[RuleSet[typingsJapgolly.tabris.mod.Widget[Any]]]

inline def Setter[TargetConstructor /* <: BaseConstructor[typingsJapgolly.tabris.mod.NativeObject] */, ResultType, AttrName /* <: /* keyof ResultType */ String */](attr: Attribute[TargetConstructor, AttrName, ResultType]): ResultType = ^.asInstanceOf[js.Dynamic].applyDynamic("Setter")(attr.asInstanceOf[js.Any]).asInstanceOf[ResultType]

inline def Setter_prototype[WidgetConstructor /* <: BaseConstructor[typingsJapgolly.tabris.mod.Widget[Any]] */](
  target: WidgetConstructor,
  attributes: Attributes[
  /* import warning: importer.ImportType#apply Failed type conversion: WidgetConstructor['prototype'] */ js.Any, 
  Any
]
): Attributes[
/* import warning: importer.ImportType#apply Failed type conversion: WidgetConstructor['prototype'] */ js.Any, 
Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("Setter")(target.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[Attributes[
/* import warning: importer.ImportType#apply Failed type conversion: WidgetConstructor['prototype'] */ js.Any, 
Any]]
inline def Setter_prototype[WidgetConstructor /* <: BaseConstructor[typingsJapgolly.tabris.mod.Widget[Any]] */](
  target: WidgetConstructor,
  selector: SelectorString,
  attributes: Attributes[
  /* import warning: importer.ImportType#apply Failed type conversion: WidgetConstructor['prototype'] */ js.Any, 
  Any
]
): RuleSet[typingsJapgolly.tabris.mod.Widget[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("Setter")(target.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[RuleSet[typingsJapgolly.tabris.mod.Widget[Any]]]

inline def Slider: SliderFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("Slider").asInstanceOf[SliderFactory]

inline def Stack: StackFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("Stack").asInstanceOf[StackFactory]

inline def Switch: SwitchFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("Switch").asInstanceOf[SwitchFactory]

inline def Tab: TabFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("Tab").asInstanceOf[TabFactory]

inline def TabFolder: TabFolderFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("TabFolder").asInstanceOf[TabFolderFactory]

inline def TextInput: TextInputFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("TextInput").asInstanceOf[TextInputFactory]

inline def TextView: TextViewFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("TextView").asInstanceOf[TextViewFactory]

inline def ToggleButton: ToggleButtonFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("ToggleButton").asInstanceOf[ToggleButtonFactory]

inline def Video: VideoFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("Video").asInstanceOf[VideoFactory]

inline def WebView: WebViewFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("WebView").asInstanceOf[WebViewFactory]

inline def _empty(attributes: Null, children: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("$")(attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[String]
inline def _empty(attributes: Null, children: js.Array[Null | String | Double | Boolean]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("$")(attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[String]
inline def _empty(attributes: Null, children: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("$")(attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[String]
inline def _empty(attributes: Null, children: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("$")(attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[String]
inline def _empty(attributes: Null, children: JSXChildren[typingsJapgolly.tabris.mod.Widget[Any]]): typingsJapgolly.tabris.mod.WidgetCollection[typingsJapgolly.tabris.mod.Widget[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("$")(attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.tabris.mod.WidgetCollection[typingsJapgolly.tabris.mod.Widget[Any]]]
/**
  * A JSX stateless functional component that groups all given widgets in a WidgetCollection
  * @param attributes This parameter needs to be null since <$> does not support any attributes
  * @param children The widgets to be included in the resulting WidgetCollection instance.
  */
/* was `typeof $` */
inline def _empty(attributes: Children, children: JSXChildren[typingsJapgolly.tabris.mod.Widget[Any]]): typingsJapgolly.tabris.mod.WidgetCollection[typingsJapgolly.tabris.mod.Widget[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("$")(attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.tabris.mod.WidgetCollection[typingsJapgolly.tabris.mod.Widget[Any]]]
/**
  * A JSX stateless functional component that joins any given content in to a single string.
  * @param attributes This parameter needs to be null since <$> does not support any attributes.
  * @param children The content of the resulting string.
  */
/* was `typeof $` */
inline def _empty(attributes: `0`, children: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("$")(attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[String]
inline def _empty(attributes: `0`, children: js.Array[Null | String | Double | Boolean]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("$")(attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[String]
inline def _empty(attributes: `0`, children: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("$")(attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[String]
inline def _empty(attributes: `0`, children: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("$")(attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[String]
/**
  * Returns the non-disposed `NativeObject` instance (e.g. a widget) associated with the given cid
  * number. The number can be obtained via the [cid](./NativeObject.md#cid) property. Example: If the cid
  * of an object is `'$23'` it can be obtained by `$(23)`. The cid is visible in the log when passing a
  * NativeObject to any log method, e.g. [`console.log(widget)`](./console.md#logvalues), or
  * [`console.dirxml(widget)`](./console.md#dirxmlobject). The native object may then be obtained using
  * the developer console or the interactive console feature for the tabris CLI serve command.
  * This feature is meant for debugging purposes only. **Using it in production code is dangerous since
  * it allows interfering with the internals of the framework or encapsulated components.** Also, the
  * `cid` of a NativeObject is not stable, meaning it can change each time the code is executed.
  * @param cidNumber The cid number is the trailing part of the [cid](./NativeObject.md#cid) property string.
  */
/* was `typeof $` */
inline def _empty(cidNumber: Double): typingsJapgolly.tabris.mod.NativeObject = ^.asInstanceOf[js.Dynamic].applyDynamic("$")(cidNumber.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.tabris.mod.NativeObject]
// $
/**
  * A shortcut to [`tabris.contentView.find()`](./Composite.md#findselector). Returns a collection
  * containing all descendants of contentView that match the given selector. This does *not* include any
  * widgets in the drawer, a popover, or an encapsulated custom component. A custom component is
  * encapsulated if it overrides the `children()` method or uses the `@component` decorator.
  * @param selector A selector expression or a predicate function to filter the results.
  */
/* was `typeof $` */
inline def _empty[Result /* <: typingsJapgolly.tabris.mod.Widget[Any] */](): typingsJapgolly.tabris.mod.WidgetCollection[Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("$")().asInstanceOf[typingsJapgolly.tabris.mod.WidgetCollection[Result]]
inline def _empty[Result /* <: typingsJapgolly.tabris.mod.Widget[Any] */](selector: Selector[typingsJapgolly.tabris.mod.Widget[Any], Result]): typingsJapgolly.tabris.mod.WidgetCollection[Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("$")(selector.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.tabris.mod.WidgetCollection[Result]]

inline def app: typingsJapgolly.tabris.mod.App_ = ^.asInstanceOf[js.Dynamic].selectDynamic("app").asInstanceOf[typingsJapgolly.tabris.mod.App_]

inline def asFactory[OriginalConstructor /* <: Constructor[JSXCandidate] & js.Object */, Instance /* <: JSXCandidate */](constructor: OriginalConstructor): CallableConstructor[
OriginalConstructor, 
InstanceType[OriginalConstructor], 
js.Function1[/* repeated */ Any, typingsJapgolly.tabris.mod.Widget[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("asFactory")(constructor.asInstanceOf[js.Any]).asInstanceOf[CallableConstructor[
OriginalConstructor, 
InstanceType[OriginalConstructor], 
js.Function1[/* repeated */ Any, typingsJapgolly.tabris.mod.Widget[Any]]]]

inline def authentication: typingsJapgolly.tabris.mod.Authentication_ = ^.asInstanceOf[js.Dynamic].selectDynamic("authentication").asInstanceOf[typingsJapgolly.tabris.mod.Authentication_]

inline def checkType(value: Any, `type`: BaseConstructor[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("checkType")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[String]
inline def checkType(
  value: Any,
  `type`: BaseConstructor[Boolean | Number | String],
  callback: js.Function1[(/* value */ Boolean) | (/* value */ Double) | (/* value */ String), Any]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkType")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def checkType(value: Any, `type`: BaseConstructor[String], options: Name): String = (^.asInstanceOf[js.Dynamic].applyDynamic("checkType")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]

inline def checkType_Boolean(value: Any, `type`: BaseConstructor[Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkType")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def checkType_Boolean(value: Any, `type`: BaseConstructor[Boolean], options: Name): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkType")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def checkType_Double(value: Any, `type`: BaseConstructor[Number]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("checkType")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def checkType_Double(value: Any, `type`: BaseConstructor[Number], options: Name): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("checkType")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def checkType_T[T](value: Any, `type`: BaseConstructor[T], callback: js.Function1[/* value */ T, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkType")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def checkType_T_T[T](value: Any, `type`: BaseConstructor[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("checkType")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[T]
inline def checkType_T_T[T](value: Any, `type`: BaseConstructor[T], options: Name): T = (^.asInstanceOf[js.Dynamic].applyDynamic("checkType")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]

inline def contentView: typingsJapgolly.tabris.mod.ContentView_[typingsJapgolly.tabris.mod.Widget[Any]] = ^.asInstanceOf[js.Dynamic].selectDynamic("contentView").asInstanceOf[typingsJapgolly.tabris.mod.ContentView_[typingsJapgolly.tabris.mod.Widget[Any]]]

inline def crypto: Crypto = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto").asInstanceOf[Crypto]
inline def crypto_=(x: Crypto): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("crypto")(x.asInstanceOf[js.Any])

inline def devTools: typingsJapgolly.tabris.mod.DevTools_ = ^.asInstanceOf[js.Dynamic].selectDynamic("devTools").asInstanceOf[typingsJapgolly.tabris.mod.DevTools_]

inline def device: typingsJapgolly.tabris.mod.Device_ = ^.asInstanceOf[js.Dynamic].selectDynamic("device").asInstanceOf[typingsJapgolly.tabris.mod.Device_]

inline def drawer: typingsJapgolly.tabris.mod.Drawer_ = ^.asInstanceOf[js.Dynamic].selectDynamic("drawer").asInstanceOf[typingsJapgolly.tabris.mod.Drawer_]

// fetch
/* was `typeof fetch` */
inline def fetch(url: String): js.Promise[typingsJapgolly.tabris.Response] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.tabris.Response]]
inline def fetch(url: String, init: RequestInit): js.Promise[typingsJapgolly.tabris.Response] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(url.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.tabris.Response]]
inline def fetch(url: typingsJapgolly.tabris.Request): js.Promise[typingsJapgolly.tabris.Response] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.tabris.Response]]
inline def fetch(url: typingsJapgolly.tabris.Request, init: RequestInit): js.Promise[typingsJapgolly.tabris.Response] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(url.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.tabris.Response]]

inline def format(data: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(data.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
inline def format(message: String, data: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(scala.List(message.asInstanceOf[js.Any]).`++`(data.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]

inline def fs: typingsJapgolly.tabris.mod.FileSystem = ^.asInstanceOf[js.Dynamic].selectDynamic("fs").asInstanceOf[typingsJapgolly.tabris.mod.FileSystem]

inline def input: typingsJapgolly.tabris.mod.Input_ = ^.asInstanceOf[js.Dynamic].selectDynamic("input").asInstanceOf[typingsJapgolly.tabris.mod.Input_]

inline def navigationBar: typingsJapgolly.tabris.mod.NavigationBar_ = ^.asInstanceOf[js.Dynamic].selectDynamic("navigationBar").asInstanceOf[typingsJapgolly.tabris.mod.NavigationBar_]

inline def permission: typingsJapgolly.tabris.mod.Permission_ = ^.asInstanceOf[js.Dynamic].selectDynamic("permission").asInstanceOf[typingsJapgolly.tabris.mod.Permission_]

inline def printer: typingsJapgolly.tabris.mod.Printer_ = ^.asInstanceOf[js.Dynamic].selectDynamic("printer").asInstanceOf[typingsJapgolly.tabris.mod.Printer_]

inline def sizeMeasurement: typingsJapgolly.tabris.mod.SizeMeasurement_ = ^.asInstanceOf[js.Dynamic].selectDynamic("sizeMeasurement").asInstanceOf[typingsJapgolly.tabris.mod.SizeMeasurement_]

inline def statusBar: typingsJapgolly.tabris.mod.StatusBar_ = ^.asInstanceOf[js.Dynamic].selectDynamic("statusBar").asInstanceOf[typingsJapgolly.tabris.mod.StatusBar_]

inline def tabris: typingsJapgolly.tabris.mod.Tabris_ = ^.asInstanceOf[js.Dynamic].selectDynamic("tabris").asInstanceOf[typingsJapgolly.tabris.mod.Tabris_]
