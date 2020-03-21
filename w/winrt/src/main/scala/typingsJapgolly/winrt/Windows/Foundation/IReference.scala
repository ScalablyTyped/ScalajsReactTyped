package typingsJapgolly.winrt.Windows.Foundation

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IReference[T] extends IPropertyValue {
  var value: T
}

object IReference {
  @scala.inline
  def apply[T](
    getBoolean: CallbackTo[Boolean],
    getBooleanArray: CallbackTo[js.Array[Boolean]],
    getChar16: CallbackTo[String],
    getChar16Array: CallbackTo[js.Array[String]],
    getDateTime: CallbackTo[js.Date],
    getDateTimeArray: CallbackTo[js.Array[js.Date]],
    getDouble: CallbackTo[Double],
    getDoubleArray: CallbackTo[scala.scalajs.js.typedarray.Float64Array],
    getGuid: CallbackTo[String],
    getGuidArray: CallbackTo[js.Array[String]],
    getInspectableArray: CallbackTo[js.Array[js.Any]],
    getInt16: CallbackTo[Double],
    getInt16Array: CallbackTo[scala.scalajs.js.typedarray.Int16Array],
    getInt32: CallbackTo[Double],
    getInt32Array: CallbackTo[scala.scalajs.js.typedarray.Int32Array],
    getInt64: CallbackTo[Double],
    getInt64Array: CallbackTo[js.Array[Double]],
    getPoint: CallbackTo[Point],
    getPointArray: CallbackTo[js.Array[Point]],
    getRect: CallbackTo[Rect],
    getRectArray: CallbackTo[js.Array[Rect]],
    getSingle: CallbackTo[Double],
    getSingleArray: CallbackTo[scala.scalajs.js.typedarray.Float32Array],
    getSize: CallbackTo[Size],
    getSizeArray: CallbackTo[js.Array[Size]],
    getString: CallbackTo[String],
    getStringArray: CallbackTo[js.Array[String]],
    getTimeSpan: CallbackTo[Double],
    getTimeSpanArray: CallbackTo[js.Array[Double]],
    getUInt16: CallbackTo[Double],
    getUInt16Array: CallbackTo[scala.scalajs.js.typedarray.Uint16Array],
    getUInt32: CallbackTo[Double],
    getUInt32Array: CallbackTo[scala.scalajs.js.typedarray.Uint32Array],
    getUInt64: CallbackTo[Double],
    getUInt64Array: CallbackTo[js.Array[Double]],
    getUInt8: CallbackTo[Double],
    getUInt8Array: CallbackTo[scala.scalajs.js.typedarray.Uint8Array],
    isNumericScalar: Boolean,
    `type`: PropertyType,
    value: T
  ): IReference[T] = {
    val __obj = js.Dynamic.literal(isNumericScalar = isNumericScalar.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("getBoolean")(getBoolean.toJsFn)
    __obj.updateDynamic("getBooleanArray")(getBooleanArray.toJsFn)
    __obj.updateDynamic("getChar16")(getChar16.toJsFn)
    __obj.updateDynamic("getChar16Array")(getChar16Array.toJsFn)
    __obj.updateDynamic("getDateTime")(getDateTime.toJsFn)
    __obj.updateDynamic("getDateTimeArray")(getDateTimeArray.toJsFn)
    __obj.updateDynamic("getDouble")(getDouble.toJsFn)
    __obj.updateDynamic("getDoubleArray")(getDoubleArray.toJsFn)
    __obj.updateDynamic("getGuid")(getGuid.toJsFn)
    __obj.updateDynamic("getGuidArray")(getGuidArray.toJsFn)
    __obj.updateDynamic("getInspectableArray")(getInspectableArray.toJsFn)
    __obj.updateDynamic("getInt16")(getInt16.toJsFn)
    __obj.updateDynamic("getInt16Array")(getInt16Array.toJsFn)
    __obj.updateDynamic("getInt32")(getInt32.toJsFn)
    __obj.updateDynamic("getInt32Array")(getInt32Array.toJsFn)
    __obj.updateDynamic("getInt64")(getInt64.toJsFn)
    __obj.updateDynamic("getInt64Array")(getInt64Array.toJsFn)
    __obj.updateDynamic("getPoint")(getPoint.toJsFn)
    __obj.updateDynamic("getPointArray")(getPointArray.toJsFn)
    __obj.updateDynamic("getRect")(getRect.toJsFn)
    __obj.updateDynamic("getRectArray")(getRectArray.toJsFn)
    __obj.updateDynamic("getSingle")(getSingle.toJsFn)
    __obj.updateDynamic("getSingleArray")(getSingleArray.toJsFn)
    __obj.updateDynamic("getSize")(getSize.toJsFn)
    __obj.updateDynamic("getSizeArray")(getSizeArray.toJsFn)
    __obj.updateDynamic("getString")(getString.toJsFn)
    __obj.updateDynamic("getStringArray")(getStringArray.toJsFn)
    __obj.updateDynamic("getTimeSpan")(getTimeSpan.toJsFn)
    __obj.updateDynamic("getTimeSpanArray")(getTimeSpanArray.toJsFn)
    __obj.updateDynamic("getUInt16")(getUInt16.toJsFn)
    __obj.updateDynamic("getUInt16Array")(getUInt16Array.toJsFn)
    __obj.updateDynamic("getUInt32")(getUInt32.toJsFn)
    __obj.updateDynamic("getUInt32Array")(getUInt32Array.toJsFn)
    __obj.updateDynamic("getUInt64")(getUInt64.toJsFn)
    __obj.updateDynamic("getUInt64Array")(getUInt64Array.toJsFn)
    __obj.updateDynamic("getUInt8")(getUInt8.toJsFn)
    __obj.updateDynamic("getUInt8Array")(getUInt8Array.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IReference[T]]
  }
}

