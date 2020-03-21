package typingsJapgolly.googleapis.booksV1Mod.booksV1

import typingsJapgolly.googleapis.AnonLayerId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAnnotationsSummary extends js.Object {
  var kind: js.UndefOr[String] = js.native
  var layers: js.UndefOr[js.Array[AnonLayerId]] = js.native
}

object SchemaAnnotationsSummary {
  @scala.inline
  def apply(kind: String = null, layers: js.Array[AnonLayerId] = null): SchemaAnnotationsSummary = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAnnotationsSummary]
  }
}

