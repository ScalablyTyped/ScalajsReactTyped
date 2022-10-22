package typingsJapgolly.trezorConnect.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Permissions extends StObject {
  
  var device: typingsJapgolly.trezorConnect.libTypescriptTrezorDeviceMod.Device
  
  var permissions: js.Array[String]
}
object Permissions {
  
  inline def apply(
    device: typingsJapgolly.trezorConnect.libTypescriptTrezorDeviceMod.Device,
    permissions: js.Array[String]
  ): Permissions = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Permissions]
  }
  
  extension [Self <: Permissions](x: Self) {
    
    inline def setDevice(value: typingsJapgolly.trezorConnect.libTypescriptTrezorDeviceMod.Device): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setPermissions(value: js.Array[String]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsVarargs(value: String*): Self = StObject.set(x, "permissions", js.Array(value*))
  }
}
