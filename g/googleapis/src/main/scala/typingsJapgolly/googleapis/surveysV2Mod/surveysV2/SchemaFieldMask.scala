package typingsJapgolly.googleapis.surveysV2Mod.surveysV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaFieldMask extends js.Object {
  var fields: js.UndefOr[js.Array[SchemaFieldMask]] = js.native
  var id: js.UndefOr[Double] = js.native
}

object SchemaFieldMask {
  @scala.inline
  def apply(fields: js.Array[SchemaFieldMask] = null, id: Int | Double = null): SchemaFieldMask = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFieldMask]
  }
}

