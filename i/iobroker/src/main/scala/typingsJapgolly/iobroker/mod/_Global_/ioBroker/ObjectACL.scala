package typingsJapgolly.iobroker.mod._Global_.ioBroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines access rights for a single object */
trait ObjectACL extends js.Object {
  /** Linux-type permissions defining access to this object */
  var `object`: Double
  /** Full name of the user who owns this object, e.g. "system.user.admin" */
  var owner: String
  /** Full name of the group who owns this object, e.g. "system.group.administrator" */
  var ownerGroup: String
}

object ObjectACL {
  @scala.inline
  def apply(`object`: Double, owner: String, ownerGroup: String): ObjectACL = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], ownerGroup = ownerGroup.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectACL]
  }
}

