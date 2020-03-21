package typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PositionedObjectProperties extends js.Object {
  var embeddedObject: js.UndefOr[EmbeddedObject] = js.undefined
  var positioning: js.UndefOr[PositionedObjectPositioning] = js.undefined
}

object PositionedObjectProperties {
  @scala.inline
  def apply(embeddedObject: EmbeddedObject = null, positioning: PositionedObjectPositioning = null): PositionedObjectProperties = {
    val __obj = js.Dynamic.literal()
    if (embeddedObject != null) __obj.updateDynamic("embeddedObject")(embeddedObject.asInstanceOf[js.Any])
    if (positioning != null) __obj.updateDynamic("positioning")(positioning.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionedObjectProperties]
  }
}

