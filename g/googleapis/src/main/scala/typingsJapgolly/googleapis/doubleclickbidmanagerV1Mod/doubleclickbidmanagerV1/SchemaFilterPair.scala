package typingsJapgolly.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Filter used to match traffic data in your report.
  */
@js.native
trait SchemaFilterPair extends js.Object {
  /**
    * Filter type.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Filter value.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaFilterPair {
  @scala.inline
  def apply(`type`: String = null, value: String = null): SchemaFilterPair = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFilterPair]
  }
}

