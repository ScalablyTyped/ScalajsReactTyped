package typingsJapgolly.weixinApp.wx

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Record
import typingsJapgolly.weixinApp.anon.Cursor
import typingsJapgolly.weixinApp.anon.Instantiable
import typingsJapgolly.weixinApp.anon.Value
import typingsJapgolly.weixinApp.weixinAppStrings.form
import typingsJapgolly.weixinApp.weixinAppStrings.input
import typingsJapgolly.weixinApp.weixinAppStrings.scroll
import typingsJapgolly.weixinApp.weixinAppStrings.tap
import typingsJapgolly.weixinApp.weixinAppStrings.touchcancel
import typingsJapgolly.weixinApp.weixinAppStrings.touchend
import typingsJapgolly.weixinApp.weixinAppStrings.touchforcechange
import typingsJapgolly.weixinApp.weixinAppStrings.touchmove
import typingsJapgolly.weixinApp.weixinAppStrings.touchstart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccelerometerChangeCallback = js.Function1[/* res */ AccelerometerData, Unit]

type AccelerometerOptions = BaseOptions[Any, Any]

type ArrayPropsDefinition[T] = js.Array[/* keyof T */ String]

type BuiltInEvent[T /* <: EventType */, Detail] = BaseEvent[T, Detail]

type CheckSessionOption = BaseOptions[Any, Any]

// CombinedInstance models the `this`, i.e. instance type for (user defined) component
type CombinedInstance[Instance /* <: Component[Data, Props, Behaviors] */, Data, Methods, Props, Behaviors /* <: js.Array[(Behavior[js.Object, js.Object, js.Object]) | String] */] = Methods & Instance & UnboxBehaviorsMethods[Behaviors]

type CompassChangeCallback = js.Function1[/* res */ CompassData, Unit]

type CompassOptions = BaseOptions[Any, Any]

type CustomEvent[T /* <: String */, Detail] = BaseEvent[T, Detail]

// #endregion
// #region Compontent组件
type DefaultData[V] = js.Object | (js.ThisFunction0[/* this */ V, js.Object])

type DefaultMethods[V] = StringDictionary[js.ThisFunction1[/* this */ V, /* repeated */ Any, Any]]

type DefaultProps = js.Object | (Record[String, Any])

type FormEvent = BuiltInEvent[form, Value]

/**
  * 指定focus时的光标位置
  * @version 1.5.0
  */
type InputEvent = BuiltInEvent[input, Cursor]

/**
  * https://developers.weixin.qq.com/miniprogram/dev/framework/custom-component/observer.html
  */
type ObserversDefs[V] = StringDictionary[js.ThisFunction1[/* this */ V, /* repeated */ Any, Any]]

type Prop[T] = js.Function0[T] | Instantiable[T]

type PropValidator[T] = PropOptions[T] | Prop[T] | js.Array[Prop[T]]

type PropsDefinition[T] = ArrayPropsDefinition[T] | RecordPropsDefinition[T]

type RemoveSavedFileOptions = GetSavedFileInfoOptions

// #endregion
// #region 网络API列表
// 发起请求
type RequestHeader = StringDictionary[String]

type RmdirOptions = MkdirOptions

// #endregion
// #region App里的onLaunch、onShow回调参数
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.weixinApp.weixinAppInts.`1001`
  - typingsJapgolly.weixinApp.weixinAppInts.`1005`
  - typingsJapgolly.weixinApp.weixinAppInts.`1006`
  - typingsJapgolly.weixinApp.weixinAppInts.`1007`
  - typingsJapgolly.weixinApp.weixinAppInts.`1008`
  - typingsJapgolly.weixinApp.weixinAppInts.`1011`
  - typingsJapgolly.weixinApp.weixinAppInts.`1012`
  - typingsJapgolly.weixinApp.weixinAppInts.`1013`
  - typingsJapgolly.weixinApp.weixinAppInts.`1014`
  - typingsJapgolly.weixinApp.weixinAppInts.`1017`
  - typingsJapgolly.weixinApp.weixinAppInts.`1019`
  - typingsJapgolly.weixinApp.weixinAppInts.`1020`
  - typingsJapgolly.weixinApp.weixinAppInts.`1022`
  - typingsJapgolly.weixinApp.weixinAppInts.`1023`
  - typingsJapgolly.weixinApp.weixinAppInts.`1024`
  - typingsJapgolly.weixinApp.weixinAppInts.`1025`
  - typingsJapgolly.weixinApp.weixinAppInts.`1026`
  - typingsJapgolly.weixinApp.weixinAppInts.`1027`
  - typingsJapgolly.weixinApp.weixinAppInts.`1028`
  - typingsJapgolly.weixinApp.weixinAppInts.`1029`
  - typingsJapgolly.weixinApp.weixinAppInts.`1030`
  - typingsJapgolly.weixinApp.weixinAppInts.`1031`
  - typingsJapgolly.weixinApp.weixinAppInts.`1032`
  - typingsJapgolly.weixinApp.weixinAppInts.`1034`
  - typingsJapgolly.weixinApp.weixinAppInts.`1035`
  - typingsJapgolly.weixinApp.weixinAppInts.`1036`
  - typingsJapgolly.weixinApp.weixinAppInts.`1037`
  - typingsJapgolly.weixinApp.weixinAppInts.`1038`
  - typingsJapgolly.weixinApp.weixinAppInts.`1039`
  - typingsJapgolly.weixinApp.weixinAppInts.`1042`
  - typingsJapgolly.weixinApp.weixinAppInts.`1043`
  - typingsJapgolly.weixinApp.weixinAppInts.`1044`
  - typingsJapgolly.weixinApp.weixinAppInts.`1045`
  - typingsJapgolly.weixinApp.weixinAppInts.`1046`
  - typingsJapgolly.weixinApp.weixinAppInts.`1047`
  - typingsJapgolly.weixinApp.weixinAppInts.`1048`
  - typingsJapgolly.weixinApp.weixinAppInts.`1049`
  - typingsJapgolly.weixinApp.weixinAppInts.`1052`
  - typingsJapgolly.weixinApp.weixinAppInts.`1053`
  - typingsJapgolly.weixinApp.weixinAppInts.`1054`
  - typingsJapgolly.weixinApp.weixinAppInts.`1056`
  - typingsJapgolly.weixinApp.weixinAppInts.`1057`
  - typingsJapgolly.weixinApp.weixinAppInts.`1058`
  - typingsJapgolly.weixinApp.weixinAppInts.`1059`
  - typingsJapgolly.weixinApp.weixinAppInts.`1064`
  - typingsJapgolly.weixinApp.weixinAppInts.`1067`
  - typingsJapgolly.weixinApp.weixinAppInts.`1068`
  - typingsJapgolly.weixinApp.weixinAppInts.`1069`
  - typingsJapgolly.weixinApp.weixinAppInts.`1071`
  - typingsJapgolly.weixinApp.weixinAppInts.`1072`
  - typingsJapgolly.weixinApp.weixinAppInts.`1073`
  - typingsJapgolly.weixinApp.weixinAppInts.`1074`
  - typingsJapgolly.weixinApp.weixinAppInts.`1077`
  - typingsJapgolly.weixinApp.weixinAppInts.`1078`
  - typingsJapgolly.weixinApp.weixinAppInts.`1079`
  - typingsJapgolly.weixinApp.weixinAppInts.`1081`
  - typingsJapgolly.weixinApp.weixinAppInts.`1082`
  - typingsJapgolly.weixinApp.weixinAppInts.`1084`
  - typingsJapgolly.weixinApp.weixinAppInts.`1089`
  - typingsJapgolly.weixinApp.weixinAppInts.`1090`
  - typingsJapgolly.weixinApp.weixinAppInts.`1091`
  - typingsJapgolly.weixinApp.weixinAppInts.`1092`
  - typingsJapgolly.weixinApp.weixinAppInts.`1095`
  - typingsJapgolly.weixinApp.weixinAppInts.`1096`
  - typingsJapgolly.weixinApp.weixinAppInts.`1097`
  - typingsJapgolly.weixinApp.weixinAppInts.`1099`
  - typingsJapgolly.weixinApp.weixinAppInts.`1102`
  - typingsJapgolly.weixinApp.weixinAppInts.`1103`
  - typingsJapgolly.weixinApp.weixinAppInts.`1104`
  - scala.Double
*/
type SceneValues = _SceneValues | Double

type ScrollEvent = BuiltInEvent[scroll, js.Object]

type TapEvent = TouchEvent[tap]

type TouchCancelEvent = TouchEvent[touchcancel]

type TouchEndEvent = TouchEvent[touchend]

type TouchForceChangeEvent = TouchEvent[touchforcechange]

type TouchMoveEvent = TouchEvent[touchmove]

type TouchStartEvent = TouchEvent[touchstart]

type UnboxBehaviorsData[Behaviors /* <: js.Array[(Behavior[js.Object, js.Object, js.Object]) | String] */] = UnboxBehaviorData[UnionToIntersection[ArrayType[Behaviors]]]

type UnboxBehaviorsMethods[Behaviors /* <: js.Array[(Behavior[js.Object, js.Object, js.Object]) | String] */] = UnboxBehaviorMethods[UnionToIntersection[ArrayType[Behaviors]]]

type UnboxBehaviorsProps[Behaviors /* <: js.Array[(Behavior[js.Object, js.Object, js.Object]) | String] */] = UnboxBehaviorProps[UnionToIntersection[ArrayType[Behaviors]]]

type WriteFileOptions = AppendFileOptions
