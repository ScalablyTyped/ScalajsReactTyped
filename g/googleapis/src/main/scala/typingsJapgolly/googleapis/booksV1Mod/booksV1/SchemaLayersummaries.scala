package typingsJapgolly.googleapis.booksV1Mod.booksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLayersummaries extends js.Object {
  /**
    * A list of layer summary items.
    */
  var items: js.UndefOr[js.Array[SchemaLayersummary]] = js.native
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The total number of layer summaries found.
    */
  var totalItems: js.UndefOr[Double] = js.native
}

object SchemaLayersummaries {
  @scala.inline
  def apply(items: js.Array[SchemaLayersummary] = null, kind: String = null, totalItems: Int | Double = null): SchemaLayersummaries = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLayersummaries]
  }
}

