package typingsJapgolly.iobroker.mod._Global_.ioBroker

import typingsJapgolly.iobroker.iobrokerStrings.`object`
import typingsJapgolly.iobroker.iobrokerStrings.create
import typingsJapgolly.iobroker.iobrokerStrings.delete
import typingsJapgolly.iobroker.iobrokerStrings.file
import typingsJapgolly.iobroker.iobrokerStrings.list
import typingsJapgolly.iobroker.iobrokerStrings.read
import typingsJapgolly.iobroker.iobrokerStrings.state
import typingsJapgolly.iobroker.iobrokerStrings.users
import typingsJapgolly.iobroker.iobrokerStrings.write
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectOrStatePermission extends Permission {
  @JSName("operation")
  var operation_ObjectOrStatePermission: list | read | write | create | delete
  @JSName("type")
  var type_ObjectOrStatePermission: `object` | file | users | state
}

object ObjectOrStatePermission {
  @scala.inline
  def apply(operation: list | read | write | create | delete, `type`: `object` | file | users | state): ObjectOrStatePermission = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectOrStatePermission]
  }
}

