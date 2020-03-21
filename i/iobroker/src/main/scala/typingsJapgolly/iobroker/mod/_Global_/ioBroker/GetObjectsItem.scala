package typingsJapgolly.iobroker.mod._Global_.ioBroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetObjectsItem[T /* <: BaseObject */] extends js.Object {
  /** The ID of this object */
  var id: String
  /** A copy of the object from the DB */
  var value: T
}

object GetObjectsItem {
  @scala.inline
  def apply[T /* <: BaseObject */](id: String, value: T): GetObjectsItem[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetObjectsItem[T]]
  }
}

