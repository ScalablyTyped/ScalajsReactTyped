package typingsJapgolly.postmark.statsMod

import typingsJapgolly.postmark.AnonOpens
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenCounts extends js.Object {
  var Days: js.Array[AnonOpens]
  var Opens: Double
  var Unique: Double
}

object OpenCounts {
  @scala.inline
  def apply(Days: js.Array[AnonOpens], Opens: Double, Unique: Double): OpenCounts = {
    val __obj = js.Dynamic.literal(Days = Days.asInstanceOf[js.Any], Opens = Opens.asInstanceOf[js.Any], Unique = Unique.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OpenCounts]
  }
}

