package typingsJapgolly.mongodb

import typingsJapgolly.mongodb.mod.ClientSession
import typingsJapgolly.mongodb.mod.ReadPreferenceOrMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBatchSizeReadPreference extends js.Object {
  var batchSize: js.UndefOr[Double] = js.undefined
  var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.undefined
  var session: js.UndefOr[ClientSession] = js.undefined
}

object AnonBatchSizeReadPreference {
  @scala.inline
  def apply(
    batchSize: Int | Double = null,
    readPreference: ReadPreferenceOrMode = null,
    session: ClientSession = null
  ): AnonBatchSizeReadPreference = {
    val __obj = js.Dynamic.literal()
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (readPreference != null) __obj.updateDynamic("readPreference")(readPreference.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBatchSizeReadPreference]
  }
}

