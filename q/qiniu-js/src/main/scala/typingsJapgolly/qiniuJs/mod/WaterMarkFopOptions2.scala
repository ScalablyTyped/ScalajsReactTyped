package typingsJapgolly.qiniuJs.mod

import typingsJapgolly.qiniuJs.qiniuJsNumbers.`2`
import typingsJapgolly.qiniuJs.qiniuJsStrings.Center
import typingsJapgolly.qiniuJs.qiniuJsStrings.East
import typingsJapgolly.qiniuJs.qiniuJsStrings.North
import typingsJapgolly.qiniuJs.qiniuJsStrings.NorthEast
import typingsJapgolly.qiniuJs.qiniuJsStrings.NorthWest
import typingsJapgolly.qiniuJs.qiniuJsStrings.South
import typingsJapgolly.qiniuJs.qiniuJsStrings.SouthEast
import typingsJapgolly.qiniuJs.qiniuJsStrings.SouthWest
import typingsJapgolly.qiniuJs.qiniuJsStrings.West
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaterMarkFopOptions2 extends WaterMarkOptions2 {
  var fop: typingsJapgolly.qiniuJs.qiniuJsStrings.watermark
}

object WaterMarkFopOptions2 {
  @scala.inline
  def apply(
    dissolve: Double,
    dx: Double,
    dy: Double,
    fill: String,
    font: String,
    fontsize: Double,
    fop: typingsJapgolly.qiniuJs.qiniuJsStrings.watermark,
    gravity: NorthWest | North | NorthEast | West | Center | East | SouthWest | South | SouthEast,
    mode: `2`,
    text: String
  ): WaterMarkFopOptions2 = {
    val __obj = js.Dynamic.literal(dissolve = dissolve.asInstanceOf[js.Any], dx = dx.asInstanceOf[js.Any], dy = dy.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], fontsize = fontsize.asInstanceOf[js.Any], fop = fop.asInstanceOf[js.Any], gravity = gravity.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WaterMarkFopOptions2]
  }
}

