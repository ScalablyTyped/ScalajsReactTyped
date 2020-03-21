package typingsJapgolly.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Landmark extends js.Object {
  /**
    * Type of landmark.
    */
  var Type: js.UndefOr[LandmarkType] = js.native
  /**
    * The x-coordinate from the top left of the landmark expressed as the ratio of the width of the image. For example, if the image is 700 x 200 and the x-coordinate of the landmark is at 350 pixels, this value is 0.5. 
    */
  var X: js.UndefOr[Float] = js.native
  /**
    * The y-coordinate from the top left of the landmark expressed as the ratio of the height of the image. For example, if the image is 700 x 200 and the y-coordinate of the landmark is at 100 pixels, this value is 0.5.
    */
  var Y: js.UndefOr[Float] = js.native
}

object Landmark {
  @scala.inline
  def apply(Type: LandmarkType = null, X: Int | Double = null, Y: Int | Double = null): Landmark = {
    val __obj = js.Dynamic.literal()
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (X != null) __obj.updateDynamic("X")(X.asInstanceOf[js.Any])
    if (Y != null) __obj.updateDynamic("Y")(Y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Landmark]
  }
}

