package typingsJapgolly.iobroker.mod._Global_.ioBroker

import typingsJapgolly.iobroker.iobrokerStrings.adapter
import typingsJapgolly.iobroker.iobrokerStrings.config
import typingsJapgolly.iobroker.iobrokerStrings.enum
import typingsJapgolly.iobroker.iobrokerStrings.group
import typingsJapgolly.iobroker.iobrokerStrings.host
import typingsJapgolly.iobroker.iobrokerStrings.info
import typingsJapgolly.iobroker.iobrokerStrings.instance
import typingsJapgolly.iobroker.iobrokerStrings.meta
import typingsJapgolly.iobroker.iobrokerStrings.script
import typingsJapgolly.iobroker.iobrokerStrings.user
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OtherObject
  extends BaseObject
     with Object {
  @JSName("common")
  var common_OtherObject: OtherCommon
  @JSName("type")
  var type_OtherObject: adapter | config | enum | group | host | info | instance | meta | script | user
}

object OtherObject {
  @scala.inline
  def apply(
    _id: String,
    common: OtherCommon,
    native: Record[String, _],
    `type`: adapter | config | enum | group | host | info | instance | meta | script | user,
    acl: ObjectACL = null,
    enums: Record[String, String] = null
  ): OtherObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (acl != null) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (enums != null) __obj.updateDynamic("enums")(enums.asInstanceOf[js.Any])
    __obj.asInstanceOf[OtherObject]
  }
}

