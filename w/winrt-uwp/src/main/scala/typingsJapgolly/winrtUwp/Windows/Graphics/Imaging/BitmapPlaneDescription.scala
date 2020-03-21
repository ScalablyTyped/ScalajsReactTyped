package typingsJapgolly.winrtUwp.Windows.Graphics.Imaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines the format of a bitmap plane. */
trait BitmapPlaneDescription extends js.Object {
  /** The height of the plane, in pixels. */
  var height: Double
  /** The start index of the pixel data within the plane. */
  var startIndex: Double
  /** The stride of the bitmap data. */
  var stride: Double
  /** The width of the plane, in pixels. */
  var width: Double
}

object BitmapPlaneDescription {
  @scala.inline
  def apply(height: Double, startIndex: Double, stride: Double, width: Double): BitmapPlaneDescription = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any], stride = stride.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BitmapPlaneDescription]
  }
}

