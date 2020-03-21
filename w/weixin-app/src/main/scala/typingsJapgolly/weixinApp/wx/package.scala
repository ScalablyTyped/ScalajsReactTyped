package typingsJapgolly.weixinApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object wx {
  type AccelerometerChangeCallback = js.Function1[/* res */ typingsJapgolly.weixinApp.wx.AccelerometerData, scala.Unit]
  type AccelerometerOptions = typingsJapgolly.weixinApp.wx.BaseOptions[js.Any, js.Any]
  type ArrayPropsDefinition[T] = js.Array[java.lang.String]
  type ArrayType[T /* <: js.Array[_] */] = js.Any
  type BuiltInEvent[T /* <: typingsJapgolly.weixinApp.wx.EventType */, Detail] = typingsJapgolly.weixinApp.wx.BaseEvent[T, Detail]
  type CheckSessionOption = typingsJapgolly.weixinApp.wx.BaseOptions[js.Any, js.Any]
  // CombinedInstance models the `this`, i.e. instance type for (user defined) component
  type CombinedInstance[Instance /* <: typingsJapgolly.weixinApp.wx.Component[Data, Props, Behaviors] */, Data, Methods, Props, Behaviors /* <: js.Array[
    (typingsJapgolly.weixinApp.wx.Behavior[js.Object, js.Object, js.Object]) | java.lang.String
  ] */] = Methods with Instance with typingsJapgolly.weixinApp.wx.UnboxBehaviorsMethods[Behaviors]
  type CompassChangeCallback = js.Function1[/* res */ typingsJapgolly.weixinApp.wx.CompassData, scala.Unit]
  type CompassOptions = typingsJapgolly.weixinApp.wx.BaseOptions[js.Any, js.Any]
  type CustomEvent[T /* <: java.lang.String */, Detail] = typingsJapgolly.weixinApp.wx.BaseEvent[T, Detail]
  // #endregion
  // #region Compontent组件
  type DefaultData[V] = js.Object | (js.ThisFunction0[/* this */ V, js.Object])
  type DefaultMethods[V] = org.scalablytyped.runtime.StringDictionary[js.ThisFunction1[/* this */ V, /* repeated */ js.Any, js.Any]]
  type DefaultProps = js.Object | (typingsJapgolly.std.Record[java.lang.String, js.Any])
  type FormEvent = typingsJapgolly.weixinApp.wx.BuiltInEvent[
    typingsJapgolly.weixinApp.weixinAppStrings.form, 
    typingsJapgolly.weixinApp.AnonValue
  ]
  /**
  	 * 指定focus时的光标位置
  	 * @version 1.5.0
  	 */
  type InputEvent = typingsJapgolly.weixinApp.wx.BuiltInEvent[
    typingsJapgolly.weixinApp.weixinAppStrings.input, 
    typingsJapgolly.weixinApp.AnonCursor
  ]
  /**
  	 * https://developers.weixin.qq.com/miniprogram/dev/framework/custom-component/observer.html
  	 */
  type ObserversDefs[V] = org.scalablytyped.runtime.StringDictionary[js.ThisFunction1[/* this */ V, /* repeated */ js.Any, js.Any]]
  type Prop[T] = js.Function0[T] | typingsJapgolly.weixinApp.AnonInstantiable[T]
  type PropValidator[T] = typingsJapgolly.weixinApp.wx.PropOptions[T] | typingsJapgolly.weixinApp.wx.Prop[T] | js.Array[typingsJapgolly.weixinApp.wx.Prop[T]]
  /**
  	 * There are two valid ways to define the type of data / properties:
  	 *
  	 * 1. { name: valueType }
  	 * 2. { name: { type: valueType, value?: value } }
  	 *
  	 * and this conditional type will extract that out so the call-site will typecheck.
  	 *
  	 * Note this is different from PropOptions as it is the definitions you passed to Component function
  	 * whereas this type is for call-site.
  	 */
  type PropValueType[Def] = js.Any
  type PropsDefinition[T] = typingsJapgolly.weixinApp.wx.ArrayPropsDefinition[T] | typingsJapgolly.weixinApp.wx.RecordPropsDefinition[T]
  type RecordPropsDefinition[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: weixin-app.wx.PropValidator<T[K]>}
    */ typingsJapgolly.weixinApp.weixinAppStrings.RecordPropsDefinition with T
  type RemoveSavedFileOptions = typingsJapgolly.weixinApp.wx.GetSavedFileInfoOptions
  // #endregion
  // #region 网络API列表
  // 发起请求
  type RequestHeader = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type RmdirOptions = typingsJapgolly.weixinApp.wx.MkdirOptions
  // #endregion
  // #region App里的onLaunch、onShow回调参数
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1001`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1005`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1006`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1007`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1008`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1011`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1012`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1013`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1014`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1017`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1019`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1020`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1022`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1023`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1024`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1025`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1026`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1027`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1028`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1029`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1030`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1031`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1032`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1034`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1035`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1036`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1037`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1038`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1039`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1042`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1043`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1044`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1045`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1046`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1047`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1048`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1049`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1052`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1053`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1054`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1056`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1057`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1058`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1059`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1064`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1067`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1068`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1069`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1071`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1072`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1073`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1074`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1077`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1078`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1079`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1081`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1082`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1084`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1089`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1090`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1091`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1092`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1095`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1096`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1097`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1099`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1102`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1103`
    - typingsJapgolly.weixinApp.weixinAppNumbers.`1104`
    - scala.Double
  */
  type SceneValues = typingsJapgolly.weixinApp.wx._SceneValues | scala.Double
  type ScrollEvent = typingsJapgolly.weixinApp.wx.BuiltInEvent[typingsJapgolly.weixinApp.weixinAppStrings.scroll, js.Object]
  type TapEvent = typingsJapgolly.weixinApp.wx.TouchEvent[typingsJapgolly.weixinApp.weixinAppStrings.tap]
  type ThisTypedComponentOptionsWithRecordProps[V /* <: typingsJapgolly.weixinApp.wx.Component[Data, Props, Behaviors] */, Data, Methods, Props, Behaviors /* <: js.Array[
    (typingsJapgolly.weixinApp.wx.Behavior[js.Object, js.Object, js.Object]) | java.lang.String
  ] */] = js.Object with (typingsJapgolly.weixinApp.wx.ComponentOptions[V, Data, Methods, Props, Behaviors]) with (typingsJapgolly.std.ThisType[
    typingsJapgolly.weixinApp.wx.CombinedInstance[V, Data, Methods, Props, Behaviors]
  ])
  type TouchCancelEvent = typingsJapgolly.weixinApp.wx.TouchEvent[typingsJapgolly.weixinApp.weixinAppStrings.touchcancel]
  type TouchEndEvent = typingsJapgolly.weixinApp.wx.TouchEvent[typingsJapgolly.weixinApp.weixinAppStrings.touchend]
  type TouchForceChangeEvent = typingsJapgolly.weixinApp.wx.TouchEvent[typingsJapgolly.weixinApp.weixinAppStrings.touchforcechange]
  type TouchMoveEvent = typingsJapgolly.weixinApp.wx.TouchEvent[typingsJapgolly.weixinApp.weixinAppStrings.touchmove]
  type TouchStartEvent = typingsJapgolly.weixinApp.wx.TouchEvent[typingsJapgolly.weixinApp.weixinAppStrings.touchstart]
  type UnboxBehaviorData[T] = js.Object | (/* import warning: importer.ImportType#apply Failed type conversion: T['__DO_NOT_USE_INTERNAL_FIELD_DATA'] */ js.Any)
  type UnboxBehaviorMethods[T] = js.Object | (/* import warning: importer.ImportType#apply Failed type conversion: T['__DO_NOT_USE_INTERNAL_FIELD_METHODS'] */ js.Any)
  type UnboxBehaviorProps[T] = js.Object | (/* import warning: importer.ImportType#apply Failed type conversion: T['__DO_NOT_USE_INTERNAL_FIELD_PROPS'] */ js.Any)
  type UnboxBehaviorsData[Behaviors /* <: js.Array[
    (typingsJapgolly.weixinApp.wx.Behavior[js.Object, js.Object, js.Object]) | java.lang.String
  ] */] = typingsJapgolly.weixinApp.wx.UnboxBehaviorData[
    typingsJapgolly.weixinApp.wx.UnionToIntersection[typingsJapgolly.weixinApp.wx.ArrayType[Behaviors]]
  ]
  type UnboxBehaviorsMethods[Behaviors /* <: js.Array[
    (typingsJapgolly.weixinApp.wx.Behavior[js.Object, js.Object, js.Object]) | java.lang.String
  ] */] = typingsJapgolly.weixinApp.wx.UnboxBehaviorMethods[
    typingsJapgolly.weixinApp.wx.UnionToIntersection[typingsJapgolly.weixinApp.wx.ArrayType[Behaviors]]
  ]
  type UnboxBehaviorsProps[Behaviors /* <: js.Array[
    (typingsJapgolly.weixinApp.wx.Behavior[js.Object, js.Object, js.Object]) | java.lang.String
  ] */] = typingsJapgolly.weixinApp.wx.UnboxBehaviorProps[
    typingsJapgolly.weixinApp.wx.UnionToIntersection[typingsJapgolly.weixinApp.wx.ArrayType[Behaviors]]
  ]
  type UnionToIntersection[U] = js.Any
  type WriteFileOptions = typingsJapgolly.weixinApp.wx.AppendFileOptions
}
