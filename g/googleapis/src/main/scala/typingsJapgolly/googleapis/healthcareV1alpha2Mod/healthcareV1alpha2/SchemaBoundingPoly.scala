package typingsJapgolly.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A bounding polygon for the detected image annotation.
  */
@js.native
trait SchemaBoundingPoly extends js.Object {
  var label: js.UndefOr[String] = js.native
  var vertices: js.UndefOr[js.Array[SchemaVertex]] = js.native
}

object SchemaBoundingPoly {
  @scala.inline
  def apply(label: String = null, vertices: js.Array[SchemaVertex] = null): SchemaBoundingPoly = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (vertices != null) __obj.updateDynamic("vertices")(vertices.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBoundingPoly]
  }
}

