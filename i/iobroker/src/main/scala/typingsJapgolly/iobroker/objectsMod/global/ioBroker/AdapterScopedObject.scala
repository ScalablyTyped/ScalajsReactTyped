package typingsJapgolly.iobroker.objectsMod.global.ioBroker

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** All objects that usually appear in an adapter scope */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.iobroker.objectsMod.global.ioBroker.FolderObject
  - typingsJapgolly.iobroker.objectsMod.global.ioBroker.DeviceObject
  - typingsJapgolly.iobroker.objectsMod.global.ioBroker.ChannelObject
  - typingsJapgolly.iobroker.objectsMod.global.ioBroker.StateObject
*/
trait AdapterScopedObject extends StObject
object AdapterScopedObject {
  
  inline def ChannelObject(_id: String, common: ChannelCommon, native: Record[String, Any]): typingsJapgolly.iobroker.objectsMod.global.ioBroker.ChannelObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("channel")
    __obj.asInstanceOf[typingsJapgolly.iobroker.objectsMod.global.ioBroker.ChannelObject]
  }
  
  inline def DeviceObject(_id: String, common: DeviceCommon, native: Record[String, Any]): typingsJapgolly.iobroker.objectsMod.global.ioBroker.DeviceObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("device")
    __obj.asInstanceOf[typingsJapgolly.iobroker.objectsMod.global.ioBroker.DeviceObject]
  }
  
  inline def FolderObject(_id: String, common: OtherCommon, native: Record[String, Any]): typingsJapgolly.iobroker.objectsMod.global.ioBroker.FolderObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("folder")
    __obj.asInstanceOf[typingsJapgolly.iobroker.objectsMod.global.ioBroker.FolderObject]
  }
  
  inline def StateObject(_id: String, common: StateCommon, native: Record[String, Any]): typingsJapgolly.iobroker.objectsMod.global.ioBroker.StateObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("state")
    __obj.asInstanceOf[typingsJapgolly.iobroker.objectsMod.global.ioBroker.StateObject]
  }
}
