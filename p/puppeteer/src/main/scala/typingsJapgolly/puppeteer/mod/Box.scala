package typingsJapgolly.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Box extends js.Object {
  var x: Double
  var y: Double
}

object Box {
  @scala.inline
  def apply(x: Double, y: Double): Box = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Box]
  }
}

