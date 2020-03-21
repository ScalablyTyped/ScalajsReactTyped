package typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateShapeRequest extends js.Object {
  var elementProperties: js.UndefOr[PageElementProperties] = js.undefined
  var objectId: js.UndefOr[String] = js.undefined
  var shapeType: js.UndefOr[String] = js.undefined
}

object CreateShapeRequest {
  @scala.inline
  def apply(elementProperties: PageElementProperties = null, objectId: String = null, shapeType: String = null): CreateShapeRequest = {
    val __obj = js.Dynamic.literal()
    if (elementProperties != null) __obj.updateDynamic("elementProperties")(elementProperties.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    if (shapeType != null) __obj.updateDynamic("shapeType")(shapeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateShapeRequest]
  }
}

