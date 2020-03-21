package typingsJapgolly.plottable

import typingsJapgolly.plottable.plottableStrings.bottomup
import typingsJapgolly.plottable.plottableStrings.topdown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBottomup extends js.Object {
  var bottomup: typingsJapgolly.plottable.plottableStrings.bottomup
  var topdown: typingsJapgolly.plottable.plottableStrings.topdown
}

object AnonBottomup {
  @scala.inline
  def apply(bottomup: bottomup, topdown: topdown): AnonBottomup = {
    val __obj = js.Dynamic.literal(bottomup = bottomup.asInstanceOf[js.Any], topdown = topdown.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBottomup]
  }
}

