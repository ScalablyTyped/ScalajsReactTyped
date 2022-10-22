package typingsJapgolly.winrt.Windows.Foundation

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPropertyValue extends StObject {
  
  def getBoolean(): Boolean
  
  def getBooleanArray(): js.Array[Boolean]
  
  def getChar16(): String
  
  def getChar16Array(): js.Array[String]
  
  def getDateTime(): js.Date
  
  def getDateTimeArray(): js.Array[js.Date]
  
  def getDouble(): Double
  
  def getDoubleArray(): js.typedarray.Float64Array
  
  def getGuid(): String
  
  def getGuidArray(): js.Array[String]
  
  def getInspectableArray(): js.Array[Any]
  
  def getInt16(): Double
  
  def getInt16Array(): js.typedarray.Int16Array
  
  def getInt32(): Double
  
  def getInt32Array(): js.typedarray.Int32Array
  
  def getInt64(): Double
  
  def getInt64Array(): js.Array[Double]
  
  def getPoint(): Point
  
  def getPointArray(): js.Array[Point]
  
  def getRect(): Rect
  
  def getRectArray(): js.Array[Rect]
  
  def getSingle(): Double
  
  def getSingleArray(): js.typedarray.Float32Array
  
  def getSize(): Size
  
  def getSizeArray(): js.Array[Size]
  
  def getString(): String
  
  def getStringArray(): js.Array[String]
  
  def getTimeSpan(): Double
  
  def getTimeSpanArray(): js.Array[Double]
  
  def getUInt16(): Double
  
  def getUInt16Array(): js.typedarray.Uint16Array
  
  def getUInt32(): Double
  
  def getUInt32Array(): js.typedarray.Uint32Array
  
  def getUInt64(): Double
  
  def getUInt64Array(): js.Array[Double]
  
  def getUInt8(): Double
  
  def getUInt8Array(): js.typedarray.Uint8Array
  
  var isNumericScalar: Boolean
  
  var `type`: PropertyType
}
object IPropertyValue {
  
  inline def apply(
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
    `type`: PropertyType
  ): IPropertyValue = {
    val __obj = js.Dynamic.literal(getBoolean = getBoolean.toJsFn, getBooleanArray = getBooleanArray.toJsFn, getChar16 = getChar16.toJsFn, getChar16Array = getChar16Array.toJsFn, getDateTime = getDateTime.toJsFn, getDateTimeArray = getDateTimeArray.toJsFn, getDouble = getDouble.toJsFn, getDoubleArray = getDoubleArray.toJsFn, getGuid = getGuid.toJsFn, getGuidArray = getGuidArray.toJsFn, getInspectableArray = getInspectableArray.toJsFn, getInt16 = getInt16.toJsFn, getInt16Array = getInt16Array.toJsFn, getInt32 = getInt32.toJsFn, getInt32Array = getInt32Array.toJsFn, getInt64 = getInt64.toJsFn, getInt64Array = getInt64Array.toJsFn, getPoint = getPoint.toJsFn, getPointArray = getPointArray.toJsFn, getRect = getRect.toJsFn, getRectArray = getRectArray.toJsFn, getSingle = getSingle.toJsFn, getSingleArray = getSingleArray.toJsFn, getSize = getSize.toJsFn, getSizeArray = getSizeArray.toJsFn, getString = getString.toJsFn, getStringArray = getStringArray.toJsFn, getTimeSpan = getTimeSpan.toJsFn, getTimeSpanArray = getTimeSpanArray.toJsFn, getUInt16 = getUInt16.toJsFn, getUInt16Array = getUInt16Array.toJsFn, getUInt32 = getUInt32.toJsFn, getUInt32Array = getUInt32Array.toJsFn, getUInt64 = getUInt64.toJsFn, getUInt64Array = getUInt64Array.toJsFn, getUInt8 = getUInt8.toJsFn, getUInt8Array = getUInt8Array.toJsFn, isNumericScalar = isNumericScalar.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPropertyValue]
  }
  
  extension [Self <: IPropertyValue](x: Self) {
    
    inline def setGetBoolean(value: CallbackTo[Boolean]): Self = StObject.set(x, "getBoolean", value.toJsFn)
    
    inline def setGetBooleanArray(value: CallbackTo[js.Array[Boolean]]): Self = StObject.set(x, "getBooleanArray", value.toJsFn)
    
    inline def setGetChar16(value: CallbackTo[String]): Self = StObject.set(x, "getChar16", value.toJsFn)
    
    inline def setGetChar16Array(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "getChar16Array", value.toJsFn)
    
    inline def setGetDateTime(value: CallbackTo[js.Date]): Self = StObject.set(x, "getDateTime", value.toJsFn)
    
    inline def setGetDateTimeArray(value: CallbackTo[js.Array[js.Date]]): Self = StObject.set(x, "getDateTimeArray", value.toJsFn)
    
    inline def setGetDouble(value: CallbackTo[Double]): Self = StObject.set(x, "getDouble", value.toJsFn)
    
    inline def setGetDoubleArray(value: CallbackTo[js.typedarray.Float64Array]): Self = StObject.set(x, "getDoubleArray", value.toJsFn)
    
    inline def setGetGuid(value: CallbackTo[String]): Self = StObject.set(x, "getGuid", value.toJsFn)
    
    inline def setGetGuidArray(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "getGuidArray", value.toJsFn)
    
    inline def setGetInspectableArray(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "getInspectableArray", value.toJsFn)
    
    inline def setGetInt16(value: CallbackTo[Double]): Self = StObject.set(x, "getInt16", value.toJsFn)
    
    inline def setGetInt16Array(value: CallbackTo[js.typedarray.Int16Array]): Self = StObject.set(x, "getInt16Array", value.toJsFn)
    
    inline def setGetInt32(value: CallbackTo[Double]): Self = StObject.set(x, "getInt32", value.toJsFn)
    
    inline def setGetInt32Array(value: CallbackTo[js.typedarray.Int32Array]): Self = StObject.set(x, "getInt32Array", value.toJsFn)
    
    inline def setGetInt64(value: CallbackTo[Double]): Self = StObject.set(x, "getInt64", value.toJsFn)
    
    inline def setGetInt64Array(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "getInt64Array", value.toJsFn)
    
    inline def setGetPoint(value: CallbackTo[Point]): Self = StObject.set(x, "getPoint", value.toJsFn)
    
    inline def setGetPointArray(value: CallbackTo[js.Array[Point]]): Self = StObject.set(x, "getPointArray", value.toJsFn)
    
    inline def setGetRect(value: CallbackTo[Rect]): Self = StObject.set(x, "getRect", value.toJsFn)
    
    inline def setGetRectArray(value: CallbackTo[js.Array[Rect]]): Self = StObject.set(x, "getRectArray", value.toJsFn)
    
    inline def setGetSingle(value: CallbackTo[Double]): Self = StObject.set(x, "getSingle", value.toJsFn)
    
    inline def setGetSingleArray(value: CallbackTo[js.typedarray.Float32Array]): Self = StObject.set(x, "getSingleArray", value.toJsFn)
    
    inline def setGetSize(value: CallbackTo[Size]): Self = StObject.set(x, "getSize", value.toJsFn)
    
    inline def setGetSizeArray(value: CallbackTo[js.Array[Size]]): Self = StObject.set(x, "getSizeArray", value.toJsFn)
    
    inline def setGetString(value: CallbackTo[String]): Self = StObject.set(x, "getString", value.toJsFn)
    
    inline def setGetStringArray(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "getStringArray", value.toJsFn)
    
    inline def setGetTimeSpan(value: CallbackTo[Double]): Self = StObject.set(x, "getTimeSpan", value.toJsFn)
    
    inline def setGetTimeSpanArray(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "getTimeSpanArray", value.toJsFn)
    
    inline def setGetUInt16(value: CallbackTo[Double]): Self = StObject.set(x, "getUInt16", value.toJsFn)
    
    inline def setGetUInt16Array(value: CallbackTo[js.typedarray.Uint16Array]): Self = StObject.set(x, "getUInt16Array", value.toJsFn)
    
    inline def setGetUInt32(value: CallbackTo[Double]): Self = StObject.set(x, "getUInt32", value.toJsFn)
    
    inline def setGetUInt32Array(value: CallbackTo[js.typedarray.Uint32Array]): Self = StObject.set(x, "getUInt32Array", value.toJsFn)
    
    inline def setGetUInt64(value: CallbackTo[Double]): Self = StObject.set(x, "getUInt64", value.toJsFn)
    
    inline def setGetUInt64Array(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "getUInt64Array", value.toJsFn)
    
    inline def setGetUInt8(value: CallbackTo[Double]): Self = StObject.set(x, "getUInt8", value.toJsFn)
    
    inline def setGetUInt8Array(value: CallbackTo[js.typedarray.Uint8Array]): Self = StObject.set(x, "getUInt8Array", value.toJsFn)
    
    inline def setIsNumericScalar(value: Boolean): Self = StObject.set(x, "isNumericScalar", value.asInstanceOf[js.Any])
    
    inline def setType(value: PropertyType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
