package typingsJapgolly.sharp

import typingsJapgolly.sharp.mod.Create
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCreate extends js.Object {
  var create: Create
}

object AnonCreate {
  @scala.inline
  def apply(create: Create): AnonCreate = {
    val __obj = js.Dynamic.literal(create = create.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCreate]
  }
}

