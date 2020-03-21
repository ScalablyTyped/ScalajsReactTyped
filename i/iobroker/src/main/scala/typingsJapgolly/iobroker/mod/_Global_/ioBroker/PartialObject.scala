package typingsJapgolly.iobroker.mod._Global_.ioBroker

import typingsJapgolly.iobroker.PartialChannelCommon
import typingsJapgolly.iobroker.PartialDeviceCommon
import typingsJapgolly.iobroker.PartialObjectCommon
import typingsJapgolly.iobroker.PartialStateACL
import typingsJapgolly.iobroker.PartialStateCommon
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
  - typingsJapgolly.iobroker.mod._Global_.ioBroker.PartialStateObject
  - typingsJapgolly.iobroker.mod._Global_.ioBroker.PartialChannelObject
  - typingsJapgolly.iobroker.mod._Global_.ioBroker.PartialDeviceObject
  - typingsJapgolly.iobroker.mod._Global_.ioBroker.PartialOtherObject
*/
trait PartialObject extends js.Object

object PartialObject {
  @scala.inline
  def PartialStateObject(
    _id: String = null,
    acl: PartialStateACL = null,
    common: PartialStateCommon = null,
    enums: Record[String, String] = null,
    native: Record[String, _] = null,
    `type`: state = null
  ): PartialObject = {
    val __obj = js.Dynamic.literal()
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (acl != null) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (common != null) __obj.updateDynamic("common")(common.asInstanceOf[js.Any])
    if (enums != null) __obj.updateDynamic("enums")(enums.asInstanceOf[js.Any])
    if (native != null) __obj.updateDynamic("native")(native.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialObject]
  }
  @scala.inline
  def PartialChannelObject(
    _id: String = null,
    acl: ObjectACL = null,
    common: PartialChannelCommon = null,
    enums: Record[String, String] = null,
    native: Record[String, _] = null,
    `type`: channel = null
  ): PartialObject = {
    val __obj = js.Dynamic.literal()
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (acl != null) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (common != null) __obj.updateDynamic("common")(common.asInstanceOf[js.Any])
    if (enums != null) __obj.updateDynamic("enums")(enums.asInstanceOf[js.Any])
    if (native != null) __obj.updateDynamic("native")(native.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialObject]
  }
  @scala.inline
  def PartialDeviceObject(
    _id: String = null,
    acl: ObjectACL = null,
    common: PartialDeviceCommon = null,
    enums: Record[String, String] = null,
    native: Record[String, _] = null,
    `type`: device = null
  ): PartialObject = {
    val __obj = js.Dynamic.literal()
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (acl != null) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (common != null) __obj.updateDynamic("common")(common.asInstanceOf[js.Any])
    if (enums != null) __obj.updateDynamic("enums")(enums.asInstanceOf[js.Any])
    if (native != null) __obj.updateDynamic("native")(native.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialObject]
  }
  @scala.inline
  def PartialOtherObject(
    _id: String = null,
    acl: ObjectACL = null,
    common: PartialObjectCommon = null,
    enums: Record[String, String] = null,
    native: Record[String, _] = null,
    `type`: adapter | config | enum | group | host | info | instance | meta | script | user = null
  ): PartialObject = {
    val __obj = js.Dynamic.literal()
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (acl != null) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (common != null) __obj.updateDynamic("common")(common.asInstanceOf[js.Any])
    if (enums != null) __obj.updateDynamic("enums")(enums.asInstanceOf[js.Any])
    if (native != null) __obj.updateDynamic("native")(native.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialObject]
  }
}

