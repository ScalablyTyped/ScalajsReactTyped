package typingsJapgolly.seleniumWebdriver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILocation extends js.Object {
  var x: Double
  var y: Double
}

object ILocation {
  @scala.inline
  def apply(x: Double, y: Double): ILocation = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ILocation]
  }
}

