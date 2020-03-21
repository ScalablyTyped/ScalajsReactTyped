package typingsJapgolly.documentdbServer

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAttachment extends Object {
  /** MIME contentType of the attachment */
  var contentType: String
  /** media link associated with the attachment content */
  var media: String
}

object IAttachment {
  @scala.inline
  def apply(
    constructor: js.Function,
    contentType: String,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    media: String,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean]
  ): IAttachment = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[IAttachment]
  }
}

