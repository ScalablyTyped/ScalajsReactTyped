package typingsJapgolly.ajv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatParams extends ErrorParameters {
  var format: String
}

object FormatParams {
  @scala.inline
  def apply(format: String): FormatParams = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FormatParams]
  }
}

