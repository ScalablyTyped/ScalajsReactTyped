package typingsJapgolly.googleapis.fusiontablesV1Mod.fusiontablesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a polygon object.
  */
@js.native
trait SchemaPolygon extends js.Object {
  /**
    * The coordinates that define the polygon.
    */
  var coordinates: js.UndefOr[js.Array[js.Array[js.Array[Double]]]] = js.native
  /**
    * Type: A polygon geometry.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaPolygon {
  @scala.inline
  def apply(coordinates: js.Array[js.Array[js.Array[Double]]] = null, `type`: String = null): SchemaPolygon = {
    val __obj = js.Dynamic.literal()
    if (coordinates != null) __obj.updateDynamic("coordinates")(coordinates.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPolygon]
  }
}

