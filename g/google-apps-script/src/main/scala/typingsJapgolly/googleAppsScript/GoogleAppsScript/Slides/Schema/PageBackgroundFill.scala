package typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageBackgroundFill extends js.Object {
  var propertyState: js.UndefOr[String] = js.undefined
  var solidFill: js.UndefOr[SolidFill] = js.undefined
  var stretchedPictureFill: js.UndefOr[StretchedPictureFill] = js.undefined
}

object PageBackgroundFill {
  @scala.inline
  def apply(
    propertyState: String = null,
    solidFill: SolidFill = null,
    stretchedPictureFill: StretchedPictureFill = null
  ): PageBackgroundFill = {
    val __obj = js.Dynamic.literal()
    if (propertyState != null) __obj.updateDynamic("propertyState")(propertyState.asInstanceOf[js.Any])
    if (solidFill != null) __obj.updateDynamic("solidFill")(solidFill.asInstanceOf[js.Any])
    if (stretchedPictureFill != null) __obj.updateDynamic("stretchedPictureFill")(stretchedPictureFill.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageBackgroundFill]
  }
}

