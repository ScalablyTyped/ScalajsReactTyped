package typingsJapgolly.diagnosticChannelPublishers.pgPubMod

import typingsJapgolly.diagnosticChannelPublishers.AnonPlan
import typingsJapgolly.diagnosticChannelPublishers.AnonPort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPostgresData extends js.Object {
  var database: AnonPort
  var duration: Double
  var error: js.UndefOr[js.Error] = js.undefined
  var query: AnonPlan
  var result: js.UndefOr[IPostgresResult] = js.undefined
}

object IPostgresData {
  @scala.inline
  def apply(
    database: AnonPort,
    duration: Double,
    query: AnonPlan,
    error: js.Error = null,
    result: IPostgresResult = null
  ): IPostgresData = {
    val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPostgresData]
  }
}

