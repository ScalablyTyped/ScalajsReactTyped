package typingsJapgolly.seen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Viewport extends js.Object {
  var postscale: Matrix
  var prescale: Matrix
}

object Viewport {
  @scala.inline
  def apply(postscale: Matrix, prescale: Matrix): Viewport = {
    val __obj = js.Dynamic.literal(postscale = postscale.asInstanceOf[js.Any], prescale = prescale.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Viewport]
  }
}

