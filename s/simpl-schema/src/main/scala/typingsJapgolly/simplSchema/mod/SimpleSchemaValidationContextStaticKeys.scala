package typingsJapgolly.simplSchema.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleSchemaValidationContextStaticKeys extends js.Object {
  var name: String
  var `type`: String
  var value: js.UndefOr[js.Any] = js.undefined
}

object SimpleSchemaValidationContextStaticKeys {
  @scala.inline
  def apply(name: String, `type`: String, value: js.Any = null): SimpleSchemaValidationContextStaticKeys = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleSchemaValidationContextStaticKeys]
  }
}

