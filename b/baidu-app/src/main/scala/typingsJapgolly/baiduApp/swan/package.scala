package typingsJapgolly.baiduApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object swan {
  type AccelerometerChangeCallback = js.Function1[/* res */ typingsJapgolly.baiduApp.swan.AccelerometerData, scala.Unit]
  type ArrayPropsDefinition[T] = js.Array[java.lang.String]
  type BuiltInEvent[T /* <: typingsJapgolly.baiduApp.swan.EventType */, Detail] = typingsJapgolly.baiduApp.swan.BaseEvent[T, Detail]
  type CheckSessionOption = typingsJapgolly.baiduApp.swan.BaseOptions[js.Any, js.Any]
  // CombinedInstance models the `this`, i.e. instance type for (user defined) component
  type CombinedInstance[Instance /* <: typingsJapgolly.baiduApp.swan.Component[Data, Props] */, Data, Methods, Props] = Methods with Instance
  type CompassChangeCallback = js.Function1[/* res */ typingsJapgolly.baiduApp.swan.CompassData, scala.Unit]
  type CompassOptions = typingsJapgolly.baiduApp.swan.BaseOptions[js.Any, js.Any]
  type CustomEvent[T /* <: java.lang.String */, Detail] = typingsJapgolly.baiduApp.swan.BaseEvent[T, Detail]
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
  type DataValueType[Def] = js.Any
  // #endregion
  // #region Compontent组件
  type DefaultData[V] = js.Object | (js.ThisFunction0[/* this */ V, js.Object])
  type DefaultMethods[V] = org.scalablytyped.runtime.StringDictionary[js.ThisFunction1[/* this */ V, /* repeated */ js.Any, js.Any]]
  type DefaultProps = js.Object | (typingsJapgolly.std.Record[java.lang.String, js.Any])
  type ExtendedComponent[Instance /* <: typingsJapgolly.baiduApp.swan.Component[Data, Props] */, Data, Methods, Props] = (typingsJapgolly.baiduApp.swan.CombinedInstance[Instance, Data, Methods, Props]) with (typingsJapgolly.baiduApp.swan.Component[Data, Props])
  type FormEvent = typingsJapgolly.baiduApp.swan.BuiltInEvent[typingsJapgolly.baiduApp.baiduAppStrings.form, typingsJapgolly.baiduApp.AnonValue]
  /**
  	 * 指定focus时的光标位置
  	 * @version 1.5.0
  	 */
  type InputEvent = typingsJapgolly.baiduApp.swan.BuiltInEvent[
    typingsJapgolly.baiduApp.baiduAppStrings.input, 
    typingsJapgolly.baiduApp.AnonCursor
  ]
  type Prop[T] = js.Function0[T] | typingsJapgolly.baiduApp.AnonInstantiable[T]
  type PropValidator[T] = typingsJapgolly.baiduApp.swan.PropOptions[T] | typingsJapgolly.baiduApp.swan.Prop[T] | js.Array[typingsJapgolly.baiduApp.swan.Prop[T]]
  type PropsDefinition[T] = typingsJapgolly.baiduApp.swan.ArrayPropsDefinition[T] | typingsJapgolly.baiduApp.swan.RecordPropsDefinition[T]
  type RecordPropsDefinition[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: baidu-app.swan.PropValidator<T[K]>}
    */ typingsJapgolly.baiduApp.baiduAppStrings.RecordPropsDefinition with T
  // #endregion
  // #region 网络API列表
  // 发起请求
  type RequestHeader = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type ScrollEvent = typingsJapgolly.baiduApp.swan.BuiltInEvent[typingsJapgolly.baiduApp.baiduAppStrings.scroll, js.Object]
  type TapEvent = typingsJapgolly.baiduApp.swan.TouchEvent[typingsJapgolly.baiduApp.baiduAppStrings.tap]
  type ThisTypedComponentOptionsWithRecordProps[V /* <: typingsJapgolly.baiduApp.swan.Component[Data, Props] */, Data, Methods, Props] = js.Object with (typingsJapgolly.baiduApp.swan.ComponentOptions[V, Data, Methods, Props]) with (typingsJapgolly.std.ThisType[typingsJapgolly.baiduApp.swan.CombinedInstance[V, Data, Methods, Props]])
  type TouchCancelEvent = typingsJapgolly.baiduApp.swan.TouchEvent[typingsJapgolly.baiduApp.baiduAppStrings.touchcancel]
  type TouchEndEvent = typingsJapgolly.baiduApp.swan.TouchEvent[typingsJapgolly.baiduApp.baiduAppStrings.touchend]
  type TouchForceChangeEvent = typingsJapgolly.baiduApp.swan.TouchEvent[typingsJapgolly.baiduApp.baiduAppStrings.touchforcechange]
  type TouchMoveEvent = typingsJapgolly.baiduApp.swan.TouchEvent[typingsJapgolly.baiduApp.baiduAppStrings.touchmove]
  type TouchStartEvent = typingsJapgolly.baiduApp.swan.TouchEvent[typingsJapgolly.baiduApp.baiduAppStrings.touchstart]
}
