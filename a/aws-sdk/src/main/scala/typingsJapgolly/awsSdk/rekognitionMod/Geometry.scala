package typingsJapgolly.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Geometry extends js.Object {
  /**
    * An axis-aligned coarse representation of the detected item's location on the image.
    */
  var BoundingBox: js.UndefOr[typingsJapgolly.awsSdk.rekognitionMod.BoundingBox] = js.native
  /**
    * Within the bounding box, a fine-grained polygon around the detected item.
    */
  var Polygon: js.UndefOr[typingsJapgolly.awsSdk.rekognitionMod.Polygon] = js.native
}

object Geometry {
  @scala.inline
  def apply(BoundingBox: BoundingBox = null, Polygon: Polygon = null): Geometry = {
    val __obj = js.Dynamic.literal()
    if (BoundingBox != null) __obj.updateDynamic("BoundingBox")(BoundingBox.asInstanceOf[js.Any])
    if (Polygon != null) __obj.updateDynamic("Polygon")(Polygon.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry]
  }
}

