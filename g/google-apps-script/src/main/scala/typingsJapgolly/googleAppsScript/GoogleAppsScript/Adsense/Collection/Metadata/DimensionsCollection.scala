package typingsJapgolly.googleAppsScript.GoogleAppsScript.Adsense.Collection.Metadata

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DimensionsCollection extends js.Object {
  // List the metadata for the dimensions available to this AdSense account.
  def list(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Adsense.Schema.Metadata
}

object DimensionsCollection {
  @scala.inline
  def apply(list: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Adsense.Schema.Metadata]): DimensionsCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(list.toJsFn)
    __obj.asInstanceOf[DimensionsCollection]
  }
}

