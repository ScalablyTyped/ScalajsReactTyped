package typingsJapgolly.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointObjectLiteral extends js.Object {
  var x: Double
  var y: Double
}

object PointObjectLiteral {
  @scala.inline
  def apply(x: Double, y: Double): PointObjectLiteral = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PointObjectLiteral]
  }
}

