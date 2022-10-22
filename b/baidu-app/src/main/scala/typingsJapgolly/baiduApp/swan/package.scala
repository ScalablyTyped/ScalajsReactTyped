package typingsJapgolly.baiduApp.swan

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.baiduApp.anon.Cursor
import typingsJapgolly.baiduApp.anon.Instantiable
import typingsJapgolly.baiduApp.anon.Value
import typingsJapgolly.baiduApp.baiduAppStrings.form
import typingsJapgolly.baiduApp.baiduAppStrings.input
import typingsJapgolly.baiduApp.baiduAppStrings.scroll
import typingsJapgolly.baiduApp.baiduAppStrings.tap
import typingsJapgolly.baiduApp.baiduAppStrings.touchcancel
import typingsJapgolly.baiduApp.baiduAppStrings.touchend
import typingsJapgolly.baiduApp.baiduAppStrings.touchforcechange
import typingsJapgolly.baiduApp.baiduAppStrings.touchmove
import typingsJapgolly.baiduApp.baiduAppStrings.touchstart
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccelerometerChangeCallback = js.Function1[/* res */ AccelerometerData, Unit]

type ArrayPropsDefinition[T] = js.Array[/* keyof T */ String]

type BuiltInEvent[T /* <: EventType */, Detail] = BaseEvent[T, Detail]

type CheckSessionOption = BaseOptions[Any, Any]

// CombinedInstance models the `this`, i.e. instance type for (user defined) component
type CombinedInstance[Instance /* <: Component[Data, Props] */, Data, Methods, Props] = Methods & Instance

type CompassChangeCallback = js.Function1[/* res */ CompassData, Unit]

type CompassOptions = BaseOptions[Any, Any]

type CustomEvent[T /* <: String */, Detail] = BaseEvent[T, Detail]

// #endregion
// #region Compontent组件
type DefaultData[V] = js.Object | (js.ThisFunction0[/* this */ V, js.Object])

type DefaultMethods[V] = StringDictionary[js.ThisFunction1[/* this */ V, /* repeated */ Any, Any]]

type DefaultProps = js.Object | (Record[String, Any])

type ExtendedComponent[Instance /* <: Component[Data, Props] */, Data, Methods, Props] = (CombinedInstance[Instance, Data, Methods, Props]) & (Component[Data, Props])

type FormEvent = BuiltInEvent[form, Value]

/**
  * 指定focus时的光标位置
  * @version 1.5.0
  */
type InputEvent = BuiltInEvent[input, Cursor]

type Prop[T] = js.Function0[T] | Instantiable[T]

type PropValidator[T] = PropOptions[T] | Prop[T] | js.Array[Prop[T]]

type PropsDefinition[T] = ArrayPropsDefinition[T] | RecordPropsDefinition[T]

// #endregion
// #region 网络API列表
// 发起请求
type RequestHeader = StringDictionary[String]

type ScrollEvent = BuiltInEvent[scroll, js.Object]

type TapEvent = TouchEvent[tap]

type TouchCancelEvent = TouchEvent[touchcancel]

type TouchEndEvent = TouchEvent[touchend]

type TouchForceChangeEvent = TouchEvent[touchforcechange]

type TouchMoveEvent = TouchEvent[touchmove]

type TouchStartEvent = TouchEvent[touchstart]
