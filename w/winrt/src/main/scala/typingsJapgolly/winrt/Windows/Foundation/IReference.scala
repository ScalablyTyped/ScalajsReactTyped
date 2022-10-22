package typingsJapgolly.winrt.Windows.Foundation

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IReference[T]
  extends StObject
     with IPropertyValue {
  
  var value: T
}
object IReference {
  
  inline def apply[T](
    getBoolean: CallbackTo[Boolean],
    getBooleanArray: CallbackTo[js.Array[Boolean]],
    getChar16: CallbackTo[String],
    getChar16Array: CallbackTo[js.Array[String]],
    getDateTime: CallbackTo[js.Date],
    getDateTimeArray: CallbackTo[js.Array[js.Date]],
    getDouble: CallbackTo[Double],
    getDoubleArray: CallbackTo[js.typedarray.Float64Array],
    getGuid: CallbackTo[String],
    getGuidArray: CallbackTo[js.Array[String]],
    getInspectableArray: CallbackTo[js.Array[Any]],
    getInt16: CallbackTo[Double],
    getInt16Array: CallbackTo[js.typedarray.Int16Array],
    getInt32: CallbackTo[Double],
    getInt32Array: CallbackTo[js.typedarray.Int32Array],
    getInt64: CallbackTo[Double],
    getInt64Array: CallbackTo[js.Array[Double]],
    getPoint: CallbackTo[Point],
    getPointArray: CallbackTo[js.Array[Point]],
    getRect: CallbackTo[Rect],
    getRectArray: CallbackTo[js.Array[Rect]],
    getSingle: CallbackTo[Double],
    getSingleArray: CallbackTo[js.typedarray.Float32Array],
    getSize: CallbackTo[Size],
    getSizeArray: CallbackTo[js.Array[Size]],
    getString: CallbackTo[String],
    getStringArray: CallbackTo[js.Array[String]],
    getTimeSpan: CallbackTo[Double],
    getTimeSpanArray: CallbackTo[js.Array[Double]],
    getUInt16: CallbackTo[Double],
    getUInt16Array: CallbackTo[js.typedarray.Uint16Array],
    getUInt32: CallbackTo[Double],
    getUInt32Array: CallbackTo[js.typedarray.Uint32Array],
    getUInt64: CallbackTo[Double],
    getUInt64Array: CallbackTo[js.Array[Double]],
    getUInt8: CallbackTo[Double],
    getUInt8Array: CallbackTo[js.typedarray.Uint8Array],
    isNumericScalar: Boolean,
    `type`: PropertyType,
    value: T
  ): IReference[T] = {
    val __obj = js.Dynamic.literal(getBoolean = getBoolean.toJsFn, getBooleanArray = getBooleanArray.toJsFn, getChar16 = getChar16.toJsFn, getChar16Array = getChar16Array.toJsFn, getDateTime = getDateTime.toJsFn, getDateTimeArray = getDateTimeArray.toJsFn, getDouble = getDouble.toJsFn, getDoubleArray = getDoubleArray.toJsFn, getGuid = getGuid.toJsFn, getGuidArray = getGuidArray.toJsFn, getInspectableArray = getInspectableArray.toJsFn, getInt16 = getInt16.toJsFn, getInt16Array = getInt16Array.toJsFn, getInt32 = getInt32.toJsFn, getInt32Array = getInt32Array.toJsFn, getInt64 = getInt64.toJsFn, getInt64Array = getInt64Array.toJsFn, getPoint = getPoint.toJsFn, getPointArray = getPointArray.toJsFn, getRect = getRect.toJsFn, getRectArray = getRectArray.toJsFn, getSingle = getSingle.toJsFn, getSingleArray = getSingleArray.toJsFn, getSize = getSize.toJsFn, getSizeArray = getSizeArray.toJsFn, getString = getString.toJsFn, getStringArray = getStringArray.toJsFn, getTimeSpan = getTimeSpan.toJsFn, getTimeSpanArray = getTimeSpanArray.toJsFn, getUInt16 = getUInt16.toJsFn, getUInt16Array = getUInt16Array.toJsFn, getUInt32 = getUInt32.toJsFn, getUInt32Array = getUInt32Array.toJsFn, getUInt64 = getUInt64.toJsFn, getUInt64Array = getUInt64Array.toJsFn, getUInt8 = getUInt8.toJsFn, getUInt8Array = getUInt8Array.toJsFn, isNumericScalar = isNumericScalar.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IReference[T]]
  }
  
  extension [Self <: IReference[?], T](x: Self & IReference[T]) {
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
