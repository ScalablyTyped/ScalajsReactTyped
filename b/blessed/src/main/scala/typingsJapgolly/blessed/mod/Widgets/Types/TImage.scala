package typingsJapgolly.blessed.mod.Widgets.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TImage extends js.Object {
  /**
    * Image bitmap.
    */
  var bmp: js.Any
  /**
    * Image cellmap (bitmap scaled down to cell size).
    */
  var cellmap: js.Any
  /**
    * Pixel height.
    */
  var height: Double
  /**
    * Pixel width.
    */
  var width: Double
}

object TImage {
  @scala.inline
  def apply(bmp: js.Any, cellmap: js.Any, height: Double, width: Double): TImage = {
    val __obj = js.Dynamic.literal(bmp = bmp.asInstanceOf[js.Any], cellmap = cellmap.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TImage]
  }
}

