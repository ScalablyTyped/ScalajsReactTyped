package typingsJapgolly.webBluetooth

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.BufferSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BluetoothRemoteGATTDescriptor extends StObject {
  
  val characteristic: BluetoothRemoteGATTCharacteristic
  
  def readValue(): js.Promise[js.typedarray.DataView]
  
  val uuid: String
  
  val value: js.UndefOr[js.typedarray.DataView] = js.undefined
  
  def writeValue(value: BufferSource): js.Promise[Unit]
}
object BluetoothRemoteGATTDescriptor {
  
  inline def apply(
    characteristic: BluetoothRemoteGATTCharacteristic,
    readValue: CallbackTo[js.Promise[js.typedarray.DataView]],
    uuid: String,
    writeValue: BufferSource => js.Promise[Unit]
  ): BluetoothRemoteGATTDescriptor = {
    val __obj = js.Dynamic.literal(characteristic = characteristic.asInstanceOf[js.Any], readValue = readValue.toJsFn, uuid = uuid.asInstanceOf[js.Any], writeValue = js.Any.fromFunction1(writeValue))
    __obj.asInstanceOf[BluetoothRemoteGATTDescriptor]
  }
  
  extension [Self <: BluetoothRemoteGATTDescriptor](x: Self) {
    
    inline def setCharacteristic(value: BluetoothRemoteGATTCharacteristic): Self = StObject.set(x, "characteristic", value.asInstanceOf[js.Any])
    
    inline def setReadValue(value: CallbackTo[js.Promise[js.typedarray.DataView]]): Self = StObject.set(x, "readValue", value.toJsFn)
    
    inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.typedarray.DataView): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setWriteValue(value: BufferSource => js.Promise[Unit]): Self = StObject.set(x, "writeValue", js.Any.fromFunction1(value))
  }
}
