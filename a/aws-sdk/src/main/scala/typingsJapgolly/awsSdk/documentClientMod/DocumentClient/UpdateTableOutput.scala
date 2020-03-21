package typingsJapgolly.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTableOutput extends js.Object {
  /**
    * Represents the properties of the table.
    */
  var TableDescription: js.UndefOr[typingsJapgolly.awsSdk.documentClientMod.DocumentClient.TableDescription] = js.native
}

object UpdateTableOutput {
  @scala.inline
  def apply(TableDescription: TableDescription = null): UpdateTableOutput = {
    val __obj = js.Dynamic.literal()
    if (TableDescription != null) __obj.updateDynamic("TableDescription")(TableDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTableOutput]
  }
}

