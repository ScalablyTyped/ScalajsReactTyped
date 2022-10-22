package typingsJapgolly.trezorConnect.libTypescriptEventsMod

import typingsJapgolly.trezorConnect.anon.DeviceProgress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirmwareProgress
  extends StObject
     with _UiEvent {
  
  var payload: DeviceProgress
  
  var `type`: /* "ui-firmware-progress" */ String
}
object FirmwareProgress {
  
  inline def apply(payload: DeviceProgress, `type`: /* "ui-firmware-progress" */ String): FirmwareProgress = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirmwareProgress]
  }
  
  extension [Self <: FirmwareProgress](x: Self) {
    
    inline def setPayload(value: DeviceProgress): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setType(value: /* "ui-firmware-progress" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
