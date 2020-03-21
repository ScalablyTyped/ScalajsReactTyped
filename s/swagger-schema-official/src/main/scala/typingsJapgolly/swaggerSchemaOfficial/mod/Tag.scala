package typingsJapgolly.swaggerSchemaOfficial.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var externalDocs: js.UndefOr[ExternalDocs] = js.undefined
  var name: String
}

object Tag {
  @scala.inline
  def apply(name: String, description: String = null, externalDocs: ExternalDocs = null): Tag = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (externalDocs != null) __obj.updateDynamic("externalDocs")(externalDocs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
}

