package typingsJapgolly.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An error in a cell.
  */
@js.native
trait SchemaErrorValue extends js.Object {
  /**
    * A message with more information about the error (in the spreadsheet&#39;s
    * locale).
    */
  var message: js.UndefOr[String] = js.native
  /**
    * The type of error.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaErrorValue {
  @scala.inline
  def apply(message: String = null, `type`: String = null): SchemaErrorValue = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaErrorValue]
  }
}

