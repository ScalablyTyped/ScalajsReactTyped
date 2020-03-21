package typingsJapgolly.arcgisRestApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Field extends js.Object {
  var alias: js.UndefOr[String] = js.undefined
  var length: js.UndefOr[Double] = js.undefined
  var name: String
  var `type`: String
}

object Field {
  @scala.inline
  def apply(name: String, `type`: String, alias: String = null, length: Int | Double = null): Field = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    __obj.asInstanceOf[Field]
  }
}

