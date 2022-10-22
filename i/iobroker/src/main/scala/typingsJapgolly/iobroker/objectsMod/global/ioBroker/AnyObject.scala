package typingsJapgolly.iobroker.objectsMod.global.ioBroker

import typingsJapgolly.iobroker.iobrokerStrings.chart
import typingsJapgolly.iobroker.iobrokerStrings.config
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.iobroker.objectsMod.global.ioBroker.StateObject
  - typingsJapgolly.iobroker.objectsMod.global.ioBroker.ChannelObject
  - typingsJapgolly.iobroker.objectsMod.global.ioBroker.DeviceObject
  - typingsJapgolly.iobroker.objectsMod.global.ioBroker.FolderObject
  - typingsJapgolly.iobroker.objectsMod.global.ioBroker.EnumObject
  - typingsJapgolly.iobroker.objectsMod.global.ioBroker.MetaObject
  - typingsJapgolly.iobroker.objectsMod.global.ioBroker.HostObject
  - typingsJapgolly.iobroker.objectsMod.global.ioBroker.AdapterObject
  - typingsJapgolly.iobroker.objectsMod.global.ioBroker.InstanceObject
  - typingsJapgolly.iobroker.objectsMod.global.ioBroker.UserObject
  - typingsJapgolly.iobroker.objectsMod.global.ioBroker.GroupObject
  - typingsJapgolly.iobroker.objectsMod.global.ioBroker.ScriptObject
  - typingsJapgolly.iobroker.objectsMod.global.ioBroker.OtherObject
*/
trait AnyObject extends StObject
object AnyObject {
  
  inline def AdapterObject(_id: String, common: AdapterCommon, native: Record[String, Any]): typingsJapgolly.iobroker.objectsMod.global.ioBroker.AdapterObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("adapter")
    __obj.asInstanceOf[typingsJapgolly.iobroker.objectsMod.global.ioBroker.AdapterObject]
  }
  
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
  
  inline def EnumObject(_id: String, common: EnumCommon, native: Record[String, Any]): typingsJapgolly.iobroker.objectsMod.global.ioBroker.EnumObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("enum")
    __obj.asInstanceOf[typingsJapgolly.iobroker.objectsMod.global.ioBroker.EnumObject]
  }
  
  inline def FolderObject(_id: String, common: OtherCommon, native: Record[String, Any]): typingsJapgolly.iobroker.objectsMod.global.ioBroker.FolderObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("folder")
    __obj.asInstanceOf[typingsJapgolly.iobroker.objectsMod.global.ioBroker.FolderObject]
  }
  
  inline def GroupObject(_id: String, common: GroupCommon, native: Record[String, Any]): typingsJapgolly.iobroker.objectsMod.global.ioBroker.GroupObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("group")
    __obj.asInstanceOf[typingsJapgolly.iobroker.objectsMod.global.ioBroker.GroupObject]
  }
  
  inline def HostObject(_id: String, common: HostCommon, native: HostNative): typingsJapgolly.iobroker.objectsMod.global.ioBroker.HostObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("host")
    __obj.asInstanceOf[typingsJapgolly.iobroker.objectsMod.global.ioBroker.HostObject]
  }
  
  inline def InstanceObject(_id: String, common: InstanceCommon, native: Record[String, Any]): typingsJapgolly.iobroker.objectsMod.global.ioBroker.InstanceObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("instance")
    __obj.asInstanceOf[typingsJapgolly.iobroker.objectsMod.global.ioBroker.InstanceObject]
  }
  
  inline def MetaObject(_id: String, common: MetaCommon, native: Record[String, Any]): typingsJapgolly.iobroker.objectsMod.global.ioBroker.MetaObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("meta")
    __obj.asInstanceOf[typingsJapgolly.iobroker.objectsMod.global.ioBroker.MetaObject]
  }
  
  inline def OtherObject(_id: String, common: OtherCommon, native: Record[String, Any], `type`: config | chart): typingsJapgolly.iobroker.objectsMod.global.ioBroker.OtherObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.iobroker.objectsMod.global.ioBroker.OtherObject]
  }
  
  inline def ScriptObject(_id: String, common: ScriptCommon, native: Record[String, Any]): typingsJapgolly.iobroker.objectsMod.global.ioBroker.ScriptObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("script")
    __obj.asInstanceOf[typingsJapgolly.iobroker.objectsMod.global.ioBroker.ScriptObject]
  }
  
  inline def StateObject(_id: String, common: StateCommon, native: Record[String, Any]): typingsJapgolly.iobroker.objectsMod.global.ioBroker.StateObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("state")
    __obj.asInstanceOf[typingsJapgolly.iobroker.objectsMod.global.ioBroker.StateObject]
  }
  
  inline def UserObject(_id: String, common: UserCommon, native: Record[String, Any]): typingsJapgolly.iobroker.objectsMod.global.ioBroker.UserObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("user")
    __obj.asInstanceOf[typingsJapgolly.iobroker.objectsMod.global.ioBroker.UserObject]
  }
}
