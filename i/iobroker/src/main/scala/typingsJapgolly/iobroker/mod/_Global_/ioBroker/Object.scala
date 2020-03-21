package typingsJapgolly.iobroker.mod._Global_.ioBroker

import typingsJapgolly.iobroker.iobrokerStrings.adapter
import typingsJapgolly.iobroker.iobrokerStrings.channel
import typingsJapgolly.iobroker.iobrokerStrings.config
import typingsJapgolly.iobroker.iobrokerStrings.device
import typingsJapgolly.iobroker.iobrokerStrings.enum
import typingsJapgolly.iobroker.iobrokerStrings.group
import typingsJapgolly.iobroker.iobrokerStrings.host
import typingsJapgolly.iobroker.iobrokerStrings.info
import typingsJapgolly.iobroker.iobrokerStrings.instance
import typingsJapgolly.iobroker.iobrokerStrings.meta
import typingsJapgolly.iobroker.iobrokerStrings.script
import typingsJapgolly.iobroker.iobrokerStrings.state
import typingsJapgolly.iobroker.iobrokerStrings.user
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.iobroker.mod._Global_.ioBroker.StateObject
  - typingsJapgolly.iobroker.mod._Global_.ioBroker.ChannelObject
  - typingsJapgolly.iobroker.mod._Global_.ioBroker.DeviceObject
  - typingsJapgolly.iobroker.mod._Global_.ioBroker.OtherObject
*/
trait Object extends js.Object

object Object {
  @scala.inline
  def StateObject(
    _id: String,
    common: StateCommon,
    native: Record[String, _],
    `type`: state,
    acl: StateACL = null,
    enums: Record[String, String] = null
  ): Object = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (acl != null) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (enums != null) __obj.updateDynamic("enums")(enums.asInstanceOf[js.Any])
    __obj.asInstanceOf[Object]
  }
  @scala.inline
  def ChannelObject(
    _id: String,
    common: ChannelCommon,
    native: Record[String, _],
    `type`: channel,
    acl: ObjectACL = null,
    enums: Record[String, String] = null
  ): Object = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (acl != null) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (enums != null) __obj.updateDynamic("enums")(enums.asInstanceOf[js.Any])
    __obj.asInstanceOf[Object]
  }
  @scala.inline
  def DeviceObject(
    _id: String,
    common: DeviceCommon,
    native: Record[String, _],
    `type`: device,
    acl: ObjectACL = null,
    enums: Record[String, String] = null
  ): Object = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (acl != null) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (enums != null) __obj.updateDynamic("enums")(enums.asInstanceOf[js.Any])
    __obj.asInstanceOf[Object]
  }
  @scala.inline
  def OtherObject(
    _id: String,
    common: OtherCommon,
    native: Record[String, _],
    `type`: adapter | config | enum | group | host | info | instance | meta | script | user,
    acl: ObjectACL = null,
    enums: Record[String, String] = null
  ): Object = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (acl != null) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (enums != null) __obj.updateDynamic("enums")(enums.asInstanceOf[js.Any])
    __obj.asInstanceOf[Object]
  }
}

