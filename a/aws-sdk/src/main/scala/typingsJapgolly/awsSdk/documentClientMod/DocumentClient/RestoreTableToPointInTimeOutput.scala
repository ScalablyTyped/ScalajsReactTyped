package typingsJapgolly.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestoreTableToPointInTimeOutput extends js.Object {
  /**
    * Represents the properties of a table.
    */
  var TableDescription: js.UndefOr[typingsJapgolly.awsSdk.documentClientMod.DocumentClient.TableDescription] = js.native
}

object RestoreTableToPointInTimeOutput {
  @scala.inline
  def apply(TableDescription: TableDescription = null): RestoreTableToPointInTimeOutput = {
    val __obj = js.Dynamic.literal()
    if (TableDescription != null) __obj.updateDynamic("TableDescription")(TableDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreTableToPointInTimeOutput]
  }
}

