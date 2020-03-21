package typingsJapgolly.winrt.Windows.Foundation

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPropertyValueStatics extends js.Object {
  def createBoolean(value: Boolean): js.Any
  def createBooleanArray(value: js.Array[Boolean]): js.Any
  def createChar16(value: String): js.Any
  def createChar16Array(value: js.Array[String]): js.Any
  def createDateTime(value: js.Date): js.Any
  def createDateTimeArray(value: js.Array[js.Date]): js.Any
  def createDouble(value: Double): js.Any
  def createDoubleArray(value: scala.scalajs.js.typedarray.Float64Array): js.Any
  def createEmpty(): js.Any
  def createGuid(value: String): js.Any
  def createGuidArray(value: js.Array[String]): js.Any
  def createInspectable(value: js.Any): js.Any
  def createInspectableArray(value: js.Array[_]): js.Any
  def createInt16(value: Double): js.Any
  def createInt16Array(value: scala.scalajs.js.typedarray.Int16Array): js.Any
  def createInt32(value: Double): js.Any
  def createInt32Array(value: scala.scalajs.js.typedarray.Int32Array): js.Any
  def createInt64(value: Double): js.Any
  def createInt64Array(value: js.Array[Double]): js.Any
  def createPoint(value: Point): js.Any
  def createPointArray(value: js.Array[Point]): js.Any
  def createRect(value: Rect): js.Any
  def createRectArray(value: js.Array[Rect]): js.Any
  def createSingle(value: Double): js.Any
  def createSingleArray(value: scala.scalajs.js.typedarray.Float32Array): js.Any
  def createSize(value: Size): js.Any
  def createSizeArray(value: js.Array[Size]): js.Any
  def createString(value: String): js.Any
  def createStringArray(value: js.Array[String]): js.Any
  def createTimeSpan(value: Double): js.Any
  def createTimeSpanArray(value: js.Array[Double]): js.Any
  def createUInt16(value: Double): js.Any
  def createUInt16Array(value: scala.scalajs.js.typedarray.Uint16Array): js.Any
  def createUInt32(value: Double): js.Any
  def createUInt32Array(value: scala.scalajs.js.typedarray.Uint32Array): js.Any
  def createUInt64(value: Double): js.Any
  def createUInt64Array(value: js.Array[Double]): js.Any
  def createUInt8(value: Double): js.Any
  def createUInt8Array(value: scala.scalajs.js.typedarray.Uint8Array): js.Any
}

object IPropertyValueStatics {
  @scala.inline
  def apply(
    createBoolean: Boolean => CallbackTo[js.Any],
    createBooleanArray: js.Array[Boolean] => CallbackTo[js.Any],
    createChar16: String => CallbackTo[js.Any],
    createChar16Array: js.Array[String] => CallbackTo[js.Any],
    createDateTime: js.Date => CallbackTo[js.Any],
    createDateTimeArray: js.Array[js.Date] => CallbackTo[js.Any],
    createDouble: Double => CallbackTo[js.Any],
    createDoubleArray: scala.scalajs.js.typedarray.Float64Array => CallbackTo[js.Any],
    createEmpty: CallbackTo[js.Any],
    createGuid: String => CallbackTo[js.Any],
    createGuidArray: js.Array[String] => CallbackTo[js.Any],
    createInspectable: js.Any => CallbackTo[js.Any],
    createInspectableArray: js.Array[js.Any] => CallbackTo[js.Any],
    createInt16: Double => CallbackTo[js.Any],
    createInt16Array: scala.scalajs.js.typedarray.Int16Array => CallbackTo[js.Any],
    createInt32: Double => CallbackTo[js.Any],
    createInt32Array: scala.scalajs.js.typedarray.Int32Array => CallbackTo[js.Any],
    createInt64: Double => CallbackTo[js.Any],
    createInt64Array: js.Array[Double] => CallbackTo[js.Any],
    createPoint: Point => CallbackTo[js.Any],
    createPointArray: js.Array[Point] => CallbackTo[js.Any],
    createRect: Rect => CallbackTo[js.Any],
    createRectArray: js.Array[Rect] => CallbackTo[js.Any],
    createSingle: Double => CallbackTo[js.Any],
    createSingleArray: scala.scalajs.js.typedarray.Float32Array => CallbackTo[js.Any],
    createSize: Size => CallbackTo[js.Any],
    createSizeArray: js.Array[Size] => CallbackTo[js.Any],
    createString: String => CallbackTo[js.Any],
    createStringArray: js.Array[String] => CallbackTo[js.Any],
    createTimeSpan: Double => CallbackTo[js.Any],
    createTimeSpanArray: js.Array[Double] => CallbackTo[js.Any],
    createUInt16: Double => CallbackTo[js.Any],
    createUInt16Array: scala.scalajs.js.typedarray.Uint16Array => CallbackTo[js.Any],
    createUInt32: Double => CallbackTo[js.Any],
    createUInt32Array: scala.scalajs.js.typedarray.Uint32Array => CallbackTo[js.Any],
    createUInt64: Double => CallbackTo[js.Any],
    createUInt64Array: js.Array[Double] => CallbackTo[js.Any],
    createUInt8: Double => CallbackTo[js.Any],
    createUInt8Array: scala.scalajs.js.typedarray.Uint8Array => CallbackTo[js.Any]
  ): IPropertyValueStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createBoolean")(js.Any.fromFunction1((t0: scala.Boolean) => createBoolean(t0).runNow()))
    __obj.updateDynamic("createBooleanArray")(js.Any.fromFunction1((t0: js.Array[scala.Boolean]) => createBooleanArray(t0).runNow()))
    __obj.updateDynamic("createChar16")(js.Any.fromFunction1((t0: java.lang.String) => createChar16(t0).runNow()))
    __obj.updateDynamic("createChar16Array")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => createChar16Array(t0).runNow()))
    __obj.updateDynamic("createDateTime")(js.Any.fromFunction1((t0: js.Date) => createDateTime(t0).runNow()))
    __obj.updateDynamic("createDateTimeArray")(js.Any.fromFunction1((t0: js.Array[js.Date]) => createDateTimeArray(t0).runNow()))
    __obj.updateDynamic("createDouble")(js.Any.fromFunction1((t0: scala.Double) => createDouble(t0).runNow()))
    __obj.updateDynamic("createDoubleArray")(js.Any.fromFunction1((t0: scala.scalajs.js.typedarray.Float64Array) => createDoubleArray(t0).runNow()))
    __obj.updateDynamic("createEmpty")(createEmpty.toJsFn)
    __obj.updateDynamic("createGuid")(js.Any.fromFunction1((t0: java.lang.String) => createGuid(t0).runNow()))
    __obj.updateDynamic("createGuidArray")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => createGuidArray(t0).runNow()))
    __obj.updateDynamic("createInspectable")(js.Any.fromFunction1((t0: js.Any) => createInspectable(t0).runNow()))
    __obj.updateDynamic("createInspectableArray")(js.Any.fromFunction1((t0: js.Array[js.Any]) => createInspectableArray(t0).runNow()))
    __obj.updateDynamic("createInt16")(js.Any.fromFunction1((t0: scala.Double) => createInt16(t0).runNow()))
    __obj.updateDynamic("createInt16Array")(js.Any.fromFunction1((t0: scala.scalajs.js.typedarray.Int16Array) => createInt16Array(t0).runNow()))
    __obj.updateDynamic("createInt32")(js.Any.fromFunction1((t0: scala.Double) => createInt32(t0).runNow()))
    __obj.updateDynamic("createInt32Array")(js.Any.fromFunction1((t0: scala.scalajs.js.typedarray.Int32Array) => createInt32Array(t0).runNow()))
    __obj.updateDynamic("createInt64")(js.Any.fromFunction1((t0: scala.Double) => createInt64(t0).runNow()))
    __obj.updateDynamic("createInt64Array")(js.Any.fromFunction1((t0: js.Array[scala.Double]) => createInt64Array(t0).runNow()))
    __obj.updateDynamic("createPoint")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Foundation.Point) => createPoint(t0).runNow()))
    __obj.updateDynamic("createPointArray")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.winrt.Windows.Foundation.Point]) => createPointArray(t0).runNow()))
    __obj.updateDynamic("createRect")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Foundation.Rect) => createRect(t0).runNow()))
    __obj.updateDynamic("createRectArray")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.winrt.Windows.Foundation.Rect]) => createRectArray(t0).runNow()))
    __obj.updateDynamic("createSingle")(js.Any.fromFunction1((t0: scala.Double) => createSingle(t0).runNow()))
    __obj.updateDynamic("createSingleArray")(js.Any.fromFunction1((t0: scala.scalajs.js.typedarray.Float32Array) => createSingleArray(t0).runNow()))
    __obj.updateDynamic("createSize")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Foundation.Size) => createSize(t0).runNow()))
    __obj.updateDynamic("createSizeArray")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.winrt.Windows.Foundation.Size]) => createSizeArray(t0).runNow()))
    __obj.updateDynamic("createString")(js.Any.fromFunction1((t0: java.lang.String) => createString(t0).runNow()))
    __obj.updateDynamic("createStringArray")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => createStringArray(t0).runNow()))
    __obj.updateDynamic("createTimeSpan")(js.Any.fromFunction1((t0: scala.Double) => createTimeSpan(t0).runNow()))
    __obj.updateDynamic("createTimeSpanArray")(js.Any.fromFunction1((t0: js.Array[scala.Double]) => createTimeSpanArray(t0).runNow()))
    __obj.updateDynamic("createUInt16")(js.Any.fromFunction1((t0: scala.Double) => createUInt16(t0).runNow()))
    __obj.updateDynamic("createUInt16Array")(js.Any.fromFunction1((t0: scala.scalajs.js.typedarray.Uint16Array) => createUInt16Array(t0).runNow()))
    __obj.updateDynamic("createUInt32")(js.Any.fromFunction1((t0: scala.Double) => createUInt32(t0).runNow()))
    __obj.updateDynamic("createUInt32Array")(js.Any.fromFunction1((t0: scala.scalajs.js.typedarray.Uint32Array) => createUInt32Array(t0).runNow()))
    __obj.updateDynamic("createUInt64")(js.Any.fromFunction1((t0: scala.Double) => createUInt64(t0).runNow()))
    __obj.updateDynamic("createUInt64Array")(js.Any.fromFunction1((t0: js.Array[scala.Double]) => createUInt64Array(t0).runNow()))
    __obj.updateDynamic("createUInt8")(js.Any.fromFunction1((t0: scala.Double) => createUInt8(t0).runNow()))
    __obj.updateDynamic("createUInt8Array")(js.Any.fromFunction1((t0: scala.scalajs.js.typedarray.Uint8Array) => createUInt8Array(t0).runNow()))
    __obj.asInstanceOf[IPropertyValueStatics]
  }
}

