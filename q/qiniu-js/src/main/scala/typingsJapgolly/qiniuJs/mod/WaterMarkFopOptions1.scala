package typingsJapgolly.qiniuJs.mod

import typingsJapgolly.qiniuJs.qiniuJsNumbers.`1`
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

trait WaterMarkFopOptions1 extends WaterMarkOptions1 {
  var fop: typingsJapgolly.qiniuJs.qiniuJsStrings.watermark
}

object WaterMarkFopOptions1 {
  @scala.inline
  def apply(
    dissolve: Double,
    dx: Double,
    dy: Double,
    fop: typingsJapgolly.qiniuJs.qiniuJsStrings.watermark,
    gravity: NorthWest | North | NorthEast | West | Center | East | SouthWest | South | SouthEast,
    image: String,
    mode: `1`
  ): WaterMarkFopOptions1 = {
    val __obj = js.Dynamic.literal(dissolve = dissolve.asInstanceOf[js.Any], dx = dx.asInstanceOf[js.Any], dy = dy.asInstanceOf[js.Any], fop = fop.asInstanceOf[js.Any], gravity = gravity.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WaterMarkFopOptions1]
  }
}

