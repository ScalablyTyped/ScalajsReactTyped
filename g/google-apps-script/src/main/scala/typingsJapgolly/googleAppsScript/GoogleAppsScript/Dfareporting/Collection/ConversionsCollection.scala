package typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.ConversionsBatchInsertRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.ConversionsBatchInsertResponse
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.ConversionsBatchUpdateRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.ConversionsBatchUpdateResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConversionsCollection extends js.Object {
  // Inserts conversions.
  def batchinsert(resource: ConversionsBatchInsertRequest, profileId: String): ConversionsBatchInsertResponse
  // Updates existing conversions.
  def batchupdate(resource: ConversionsBatchUpdateRequest, profileId: String): ConversionsBatchUpdateResponse
}

object ConversionsCollection {
  @scala.inline
  def apply(
    batchinsert: (ConversionsBatchInsertRequest, String) => CallbackTo[ConversionsBatchInsertResponse],
    batchupdate: (ConversionsBatchUpdateRequest, String) => CallbackTo[ConversionsBatchUpdateResponse]
  ): ConversionsCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("batchinsert")(js.Any.fromFunction2((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.ConversionsBatchInsertRequest, t1: java.lang.String) => batchinsert(t0, t1).runNow()))
    __obj.updateDynamic("batchupdate")(js.Any.fromFunction2((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.ConversionsBatchUpdateRequest, t1: java.lang.String) => batchupdate(t0, t1).runNow()))
    __obj.asInstanceOf[ConversionsCollection]
  }
}

