package typingsJapgolly.meshblu.Meshblu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterData extends js.Object {
  var `type`: String
}

object RegisterData {
  @scala.inline
  def apply(`type`: String): RegisterData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterData]
  }
}

