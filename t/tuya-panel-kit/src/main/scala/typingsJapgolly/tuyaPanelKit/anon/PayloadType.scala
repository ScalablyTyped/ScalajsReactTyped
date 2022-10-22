package typingsJapgolly.tuyaPanelKit.anon

import typingsJapgolly.std.Record
import typingsJapgolly.tuyaPanelKit.mod.DevInfo
import typingsJapgolly.tuyaPanelKit.mod.DpType
import typingsJapgolly.tuyaPanelKit.mod.DpValue
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.devInfo
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.deviceOnline
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.dpData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PayloadType extends StObject {
  
  var payload: (Record[String, DpValue]) | (DevInfo[Record[String, DpType]]) | Boolean
  
  var `type`: dpData | devInfo | deviceOnline
}
object PayloadType {
  
  inline def apply(
    payload: (Record[String, DpValue]) | (DevInfo[Record[String, DpType]]) | Boolean,
    `type`: dpData | devInfo | deviceOnline
  ): PayloadType = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayloadType]
  }
  
  extension [Self <: PayloadType](x: Self) {
    
    inline def setPayload(value: (Record[String, DpValue]) | (DevInfo[Record[String, DpType]]) | Boolean): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setType(value: dpData | devInfo | deviceOnline): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
