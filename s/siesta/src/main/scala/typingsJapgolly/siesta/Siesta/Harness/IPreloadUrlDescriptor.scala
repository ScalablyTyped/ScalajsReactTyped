package typingsJapgolly.siesta.Siesta.Harness

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPreloadUrlDescriptor extends js.Object {
  var `type`: String
  var url: String
}

object IPreloadUrlDescriptor {
  @scala.inline
  def apply(`type`: String, url: String): IPreloadUrlDescriptor = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPreloadUrlDescriptor]
  }
}

