package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Search for developer metadata in a spreadsheet. To create new developer metadata finder use
  * Range.createDeveloperMetadataFinder(), Sheet.createDeveloperMetadataFinder(),
  * or Spreadsheet.createDeveloperMetadataFinder().
  */
trait DeveloperMetadataFinder extends js.Object {
  def find(): js.Array[DeveloperMetadata]
  def onIntersectingLocations(): DeveloperMetadataFinder
  def withId(id: Integer): DeveloperMetadataFinder
  def withKey(key: String): DeveloperMetadataFinder
  def withLocationType(locationType: DeveloperMetadataLocationType): DeveloperMetadataFinder
  def withValue(value: String): DeveloperMetadataFinder
  def withVisibility(visibility: DeveloperMetadataVisibility): DeveloperMetadataFinder
}

object DeveloperMetadataFinder {
  @scala.inline
  def apply(
    find: CallbackTo[js.Array[DeveloperMetadata]],
    onIntersectingLocations: CallbackTo[DeveloperMetadataFinder],
    withId: Integer => CallbackTo[DeveloperMetadataFinder],
    withKey: String => CallbackTo[DeveloperMetadataFinder],
    withLocationType: DeveloperMetadataLocationType => CallbackTo[DeveloperMetadataFinder],
    withValue: String => CallbackTo[DeveloperMetadataFinder],
    withVisibility: DeveloperMetadataVisibility => CallbackTo[DeveloperMetadataFinder]
  ): DeveloperMetadataFinder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("find")(find.toJsFn)
    __obj.updateDynamic("onIntersectingLocations")(onIntersectingLocations.toJsFn)
    __obj.updateDynamic("withId")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => withId(t0).runNow()))
    __obj.updateDynamic("withKey")(js.Any.fromFunction1((t0: java.lang.String) => withKey(t0).runNow()))
    __obj.updateDynamic("withLocationType")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.DeveloperMetadataLocationType) => withLocationType(t0).runNow()))
    __obj.updateDynamic("withValue")(js.Any.fromFunction1((t0: java.lang.String) => withValue(t0).runNow()))
    __obj.updateDynamic("withVisibility")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.DeveloperMetadataVisibility) => withVisibility(t0).runNow()))
    __obj.asInstanceOf[DeveloperMetadataFinder]
  }
}

