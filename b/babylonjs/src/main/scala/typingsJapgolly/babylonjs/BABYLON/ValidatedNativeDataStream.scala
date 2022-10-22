package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidatedNativeDataStream
  extends StObject
     with NativeDataStream
object ValidatedNativeDataStream {
  
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
  ): ValidatedNativeDataStream = {
    val __obj = js.Dynamic.literal(_float32s = _float32s.asInstanceOf[js.Any], _flush = _flush.asInstanceOf[js.Any], _flushIfNecessary = _flushIfNecessary.asInstanceOf[js.Any], _int32s = _int32s.asInstanceOf[js.Any], _length = _length.asInstanceOf[js.Any], _nativeDataStream = _nativeDataStream.asInstanceOf[js.Any], _position = _position.asInstanceOf[js.Any], _uint32s = _uint32s.asInstanceOf[js.Any], writeBoolean = js.Any.fromFunction1((t0: Boolean) => writeBoolean(t0).runNow()), writeFloat32 = js.Any.fromFunction1((t0: Double) => writeFloat32(t0).runNow()), writeFloat32Array = js.Any.fromFunction1((t0: js.typedarray.Float32Array) => writeFloat32Array(t0).runNow()), writeInt32 = js.Any.fromFunction1((t0: Double) => writeInt32(t0).runNow()), writeInt32Array = js.Any.fromFunction1((t0: js.typedarray.Int32Array) => writeInt32Array(t0).runNow()), writeNativeData = js.Any.fromFunction1((t0: js.typedarray.Uint32Array) => writeNativeData(t0).runNow()), writeUint32 = js.Any.fromFunction1((t0: Double) => writeUint32(t0).runNow()), writeUint32Array = js.Any.fromFunction1((t0: js.typedarray.Uint32Array) => writeUint32Array(t0).runNow()))
    __obj.asInstanceOf[ValidatedNativeDataStream]
  }
}
