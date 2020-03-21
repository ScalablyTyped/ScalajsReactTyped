package typingsJapgolly.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRange extends js.Object {
  /** The maximum value. */
  var max: Double
  /** The minimum value. */
  var min: Double
}

object IRange {
  @scala.inline
  def apply(max: Double, min: Double): IRange = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IRange]
  }
}

