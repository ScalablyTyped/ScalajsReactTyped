package typingsJapgolly.jqueryWatermark

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStatic extends js.Object {
  var watermark: Watermark
}

object JQueryStatic {
  @scala.inline
  def apply(watermark: Watermark): JQueryStatic = {
    val __obj = js.Dynamic.literal(watermark = watermark.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JQueryStatic]
  }
}

