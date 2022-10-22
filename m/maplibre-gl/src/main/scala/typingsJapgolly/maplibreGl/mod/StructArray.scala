package typingsJapgolly.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StructArray extends StObject {
  
  /**
  	 * Create TypedArray views for the current ArrayBuffer.
  	 */
  def _refreshViews(): scala.Unit
  
  /**
  	 * Resize the array to discard unused capacity.
  	 */
  def _trim(): scala.Unit
  
  var arrayBuffer: js.typedarray.ArrayBuffer
  
  var bytesPerElement: Double
  
  var capacity: Double
  
  /**
  	 * Resets the the length of the array to 0 without de-allocating capcacity.
  	 */
  def clear(): scala.Unit
  
  def emplace(i: Double, v: Double*): Any
  
  def emplaceBack(v: Double*): Any
  
  var isTransferred: Boolean
  
  var length: Double
  
  var members: js.Array[StructArrayMember]
  
  /**
  	 * Indicate a planned increase in size, so that any necessary allocation may
  	 * be done once, ahead of time.
  	 * @param {number} n The expected size of the array.
  	 */
  def reserve(n: Double): scala.Unit
  
  /**
  	 * Resize the array.
  	 * If `n` is greater than the current length then additional elements with undefined values are added.
  	 * If `n` is less than the current length then the array will be reduced to the first `n` elements.
  	 * @param {number} n The new size of the array.
  	 */
  def resize(n: Double): scala.Unit
  
  var uint8: js.typedarray.Uint8Array
}
object StructArray {
  
  inline def apply(
    _refreshViews: japgolly.scalajs.react.Callback,
    _trim: japgolly.scalajs.react.Callback,
    arrayBuffer: js.typedarray.ArrayBuffer,
    bytesPerElement: Double,
    capacity: Double,
    clear: japgolly.scalajs.react.Callback,
    emplace: (Double, /* repeated */ Double) => Any,
    emplaceBack: /* repeated */ Double => Any,
    isTransferred: Boolean,
    length: Double,
    members: js.Array[StructArrayMember],
    reserve: Double => japgolly.scalajs.react.Callback,
    resize: Double => japgolly.scalajs.react.Callback,
    uint8: js.typedarray.Uint8Array
  ): StructArray = {
    val __obj = js.Dynamic.literal(_refreshViews = _refreshViews.toJsFn, _trim = _trim.toJsFn, arrayBuffer = arrayBuffer.asInstanceOf[js.Any], bytesPerElement = bytesPerElement.asInstanceOf[js.Any], capacity = capacity.asInstanceOf[js.Any], clear = clear.toJsFn, emplace = js.Any.fromFunction2(emplace), emplaceBack = js.Any.fromFunction1(emplaceBack), isTransferred = isTransferred.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], reserve = js.Any.fromFunction1((t0: Double) => reserve(t0).runNow()), resize = js.Any.fromFunction1((t0: Double) => resize(t0).runNow()), uint8 = uint8.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructArray]
  }
  
  extension [Self <: StructArray](x: Self) {
    
    inline def setArrayBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "arrayBuffer", value.asInstanceOf[js.Any])
    
    inline def setBytesPerElement(value: Double): Self = StObject.set(x, "bytesPerElement", value.asInstanceOf[js.Any])
    
    inline def setCapacity(value: Double): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
    
    inline def setClear(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setEmplace(value: (Double, /* repeated */ Double) => Any): Self = StObject.set(x, "emplace", js.Any.fromFunction2(value))
    
    inline def setEmplaceBack(value: /* repeated */ Double => Any): Self = StObject.set(x, "emplaceBack", js.Any.fromFunction1(value))
    
    inline def setIsTransferred(value: Boolean): Self = StObject.set(x, "isTransferred", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setMembers(value: js.Array[StructArrayMember]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersVarargs(value: StructArrayMember*): Self = StObject.set(x, "members", js.Array(value*))
    
    inline def setReserve(value: Double => japgolly.scalajs.react.Callback): Self = StObject.set(x, "reserve", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setResize(value: Double => japgolly.scalajs.react.Callback): Self = StObject.set(x, "resize", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setUint8(value: js.typedarray.Uint8Array): Self = StObject.set(x, "uint8", value.asInstanceOf[js.Any])
    
    inline def set_refreshViews(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "_refreshViews", value.toJsFn)
    
    inline def set_trim(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "_trim", value.toJsFn)
  }
}
