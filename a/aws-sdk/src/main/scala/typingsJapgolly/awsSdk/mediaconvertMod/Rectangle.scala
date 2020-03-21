package typingsJapgolly.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rectangle extends js.Object {
  /**
    * Height of rectangle in pixels. Specify only even numbers.
    */
  var Height: js.UndefOr[integerMin2Max2147483647] = js.native
  /**
    * Width of rectangle in pixels. Specify only even numbers.
    */
  var Width: js.UndefOr[integerMin2Max2147483647] = js.native
  /**
    * The distance, in pixels, between the rectangle and the left edge of the video frame. Specify only even numbers.
    */
  var X: js.UndefOr[integerMin0Max2147483647] = js.native
  /**
    * The distance, in pixels, between the rectangle and the top edge of the video frame. Specify only even numbers.
    */
  var Y: js.UndefOr[integerMin0Max2147483647] = js.native
}

object Rectangle {
  @scala.inline
  def apply(
    Height: Int | Double = null,
    Width: Int | Double = null,
    X: Int | Double = null,
    Y: Int | Double = null
  ): Rectangle = {
    val __obj = js.Dynamic.literal()
    if (Height != null) __obj.updateDynamic("Height")(Height.asInstanceOf[js.Any])
    if (Width != null) __obj.updateDynamic("Width")(Width.asInstanceOf[js.Any])
    if (X != null) __obj.updateDynamic("X")(X.asInstanceOf[js.Any])
    if (Y != null) __obj.updateDynamic("Y")(Y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rectangle]
  }
}

