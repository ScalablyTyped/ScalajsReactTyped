package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NativeDataStream extends StObject {
  
  /* private */ val _float32s: Any
  
  /* private */ var _flush: Any
  
  /* private */ var _flushIfNecessary: Any
  
  /* private */ val _int32s: Any
  
  /* private */ val _length: Any
  
  /* private */ val _nativeDataStream: Any
  
  /* private */ var _position: Any
  
  /* private */ val _uint32s: Any
  
  def writeBoolean(value: Boolean): Unit
  
  def writeFloat32(value: Double): Unit
  
  def writeFloat32Array(values: js.typedarray.Float32Array): Unit
  
  def writeInt32(value: Double): Unit
  
  def writeInt32Array(values: js.typedarray.Int32Array): Unit
  
  def writeNativeData(handle: js.typedarray.Uint32Array): Unit
  
  def writeUint32(value: Double): Unit
  
  def writeUint32Array(values: js.typedarray.Uint32Array): Unit
}
object NativeDataStream {
  
  inline def apply(
    _float32s: Any,
    _flush: Any,
    _flushIfNecessary: Any,
    _int32s: Any,
    _length: Any,
    _nativeDataStream: Any,
    _position: Any,
    _uint32s: Any,
    writeBoolean: Boolean => Callback,
    writeFloat32: Double => Callback,
    writeFloat32Array: js.typedarray.Float32Array => Callback,
    writeInt32: Double => Callback,
    writeInt32Array: js.typedarray.Int32Array => Callback,
    writeNativeData: js.typedarray.Uint32Array => Callback,
    writeUint32: Double => Callback,
    writeUint32Array: js.typedarray.Uint32Array => Callback
  ): NativeDataStream = {
    val __obj = js.Dynamic.literal(_float32s = _float32s.asInstanceOf[js.Any], _flush = _flush.asInstanceOf[js.Any], _flushIfNecessary = _flushIfNecessary.asInstanceOf[js.Any], _int32s = _int32s.asInstanceOf[js.Any], _length = _length.asInstanceOf[js.Any], _nativeDataStream = _nativeDataStream.asInstanceOf[js.Any], _position = _position.asInstanceOf[js.Any], _uint32s = _uint32s.asInstanceOf[js.Any], writeBoolean = js.Any.fromFunction1((t0: Boolean) => writeBoolean(t0).runNow()), writeFloat32 = js.Any.fromFunction1((t0: Double) => writeFloat32(t0).runNow()), writeFloat32Array = js.Any.fromFunction1((t0: js.typedarray.Float32Array) => writeFloat32Array(t0).runNow()), writeInt32 = js.Any.fromFunction1((t0: Double) => writeInt32(t0).runNow()), writeInt32Array = js.Any.fromFunction1((t0: js.typedarray.Int32Array) => writeInt32Array(t0).runNow()), writeNativeData = js.Any.fromFunction1((t0: js.typedarray.Uint32Array) => writeNativeData(t0).runNow()), writeUint32 = js.Any.fromFunction1((t0: Double) => writeUint32(t0).runNow()), writeUint32Array = js.Any.fromFunction1((t0: js.typedarray.Uint32Array) => writeUint32Array(t0).runNow()))
    __obj.asInstanceOf[NativeDataStream]
  }
  
  extension [Self <: NativeDataStream](x: Self) {
    
    inline def setWriteBoolean(value: Boolean => Callback): Self = StObject.set(x, "writeBoolean", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setWriteFloat32(value: Double => Callback): Self = StObject.set(x, "writeFloat32", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setWriteFloat32Array(value: js.typedarray.Float32Array => Callback): Self = StObject.set(x, "writeFloat32Array", js.Any.fromFunction1((t0: js.typedarray.Float32Array) => value(t0).runNow()))
    
    inline def setWriteInt32(value: Double => Callback): Self = StObject.set(x, "writeInt32", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setWriteInt32Array(value: js.typedarray.Int32Array => Callback): Self = StObject.set(x, "writeInt32Array", js.Any.fromFunction1((t0: js.typedarray.Int32Array) => value(t0).runNow()))
    
    inline def setWriteNativeData(value: js.typedarray.Uint32Array => Callback): Self = StObject.set(x, "writeNativeData", js.Any.fromFunction1((t0: js.typedarray.Uint32Array) => value(t0).runNow()))
    
    inline def setWriteUint32(value: Double => Callback): Self = StObject.set(x, "writeUint32", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setWriteUint32Array(value: js.typedarray.Uint32Array => Callback): Self = StObject.set(x, "writeUint32Array", js.Any.fromFunction1((t0: js.typedarray.Uint32Array) => value(t0).runNow()))
    
    inline def set_float32s(value: Any): Self = StObject.set(x, "_float32s", value.asInstanceOf[js.Any])
    
    inline def set_flush(value: Any): Self = StObject.set(x, "_flush", value.asInstanceOf[js.Any])
    
    inline def set_flushIfNecessary(value: Any): Self = StObject.set(x, "_flushIfNecessary", value.asInstanceOf[js.Any])
    
    inline def set_int32s(value: Any): Self = StObject.set(x, "_int32s", value.asInstanceOf[js.Any])
    
    inline def set_length(value: Any): Self = StObject.set(x, "_length", value.asInstanceOf[js.Any])
    
    inline def set_nativeDataStream(value: Any): Self = StObject.set(x, "_nativeDataStream", value.asInstanceOf[js.Any])
    
    inline def set_position(value: Any): Self = StObject.set(x, "_position", value.asInstanceOf[js.Any])
    
    inline def set_uint32s(value: Any): Self = StObject.set(x, "_uint32s", value.asInstanceOf[js.Any])
  }
}
