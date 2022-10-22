package typingsJapgolly.winrtUwp.Windows.Devices.Bluetooth.Advertisement

import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A Bluetooth LE manufacturer-specific data section (one particular type of LE advertisement section) */
trait BluetoothLEManufacturerData extends StObject {
  
  /** The Bluetooth LE company identifier code as defined by the Bluetooth Special Interest Group (SIG). */
  var companyId: Double
  
  /** Bluetooth LE manufacturer-specific section data. */
  var data: IBuffer
}
object BluetoothLEManufacturerData {
  
  inline def apply(companyId: Double, data: IBuffer): BluetoothLEManufacturerData = {
    val __obj = js.Dynamic.literal(companyId = companyId.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothLEManufacturerData]
  }
  
  extension [Self <: BluetoothLEManufacturerData](x: Self) {
    
    inline def setCompanyId(value: Double): Self = StObject.set(x, "companyId", value.asInstanceOf[js.Any])
    
    inline def setData(value: IBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
