package typingsJapgolly.ajv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeParams extends ErrorParameters {
  var `type`: String
}

object TypeParams {
  @scala.inline
  def apply(`type`: String): TypeParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeParams]
  }
}

