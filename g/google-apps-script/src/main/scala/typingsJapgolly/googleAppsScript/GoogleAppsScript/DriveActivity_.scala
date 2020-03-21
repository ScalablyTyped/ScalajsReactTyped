package typingsJapgolly.googleAppsScript.GoogleAppsScript

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.DriveActivity.Collection.ActivityCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.DriveActivity.Schema.ConsolidationStrategy
import typingsJapgolly.googleAppsScript.GoogleAppsScript.DriveActivity.Schema.QueryDriveActivityRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DriveActivity_ extends js.Object {
  var Activity: js.UndefOr[ActivityCollection] = js.undefined
  // Create a new instance of ConsolidationStrategy
  def newConsolidationStrategy(): ConsolidationStrategy
  // Create a new instance of Legacy
  def newLegacy(): js.Any
  // Create a new instance of NoConsolidation
  def newNoConsolidation(): js.Any
  // Create a new instance of QueryDriveActivityRequest
  def newQueryDriveActivityRequest(): QueryDriveActivityRequest
}

object DriveActivity_ {
  @scala.inline
  def apply(
    newConsolidationStrategy: CallbackTo[ConsolidationStrategy],
    newLegacy: CallbackTo[js.Any],
    newNoConsolidation: CallbackTo[js.Any],
    newQueryDriveActivityRequest: CallbackTo[QueryDriveActivityRequest],
    Activity: ActivityCollection = null
  ): DriveActivity_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("newConsolidationStrategy")(newConsolidationStrategy.toJsFn)
    __obj.updateDynamic("newLegacy")(newLegacy.toJsFn)
    __obj.updateDynamic("newNoConsolidation")(newNoConsolidation.toJsFn)
    __obj.updateDynamic("newQueryDriveActivityRequest")(newQueryDriveActivityRequest.toJsFn)
    if (Activity != null) __obj.updateDynamic("Activity")(Activity.asInstanceOf[js.Any])
    __obj.asInstanceOf[DriveActivity_]
  }
}

