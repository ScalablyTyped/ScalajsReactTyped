package typingsJapgolly.intercomClient.userMod

import typingsJapgolly.intercomClient.AnonNext
import typingsJapgolly.intercomClient.intercomClientStrings.userDotlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait List extends js.Object {
  var pages: AnonNext
  var total_count: Double
  var `type`: userDotlist
  var users: js.Array[User]
}

object List {
  @scala.inline
  def apply(pages: AnonNext, total_count: Double, `type`: userDotlist, users: js.Array[User]): List = {
    val __obj = js.Dynamic.literal(pages = pages.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[List]
  }
}

