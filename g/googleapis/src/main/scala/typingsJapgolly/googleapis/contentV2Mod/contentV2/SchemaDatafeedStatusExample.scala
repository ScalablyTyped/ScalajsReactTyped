package typingsJapgolly.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An example occurrence for a particular error.
  */
@js.native
trait SchemaDatafeedStatusExample extends js.Object {
  /**
    * The ID of the example item.
    */
  var itemId: js.UndefOr[String] = js.native
  /**
    * Line number in the data feed where the example is found.
    */
  var lineNumber: js.UndefOr[String] = js.native
  /**
    * The problematic value.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaDatafeedStatusExample {
  @scala.inline
  def apply(itemId: String = null, lineNumber: String = null, value: String = null): SchemaDatafeedStatusExample = {
    val __obj = js.Dynamic.literal()
    if (itemId != null) __obj.updateDynamic("itemId")(itemId.asInstanceOf[js.Any])
    if (lineNumber != null) __obj.updateDynamic("lineNumber")(lineNumber.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDatafeedStatusExample]
  }
}

