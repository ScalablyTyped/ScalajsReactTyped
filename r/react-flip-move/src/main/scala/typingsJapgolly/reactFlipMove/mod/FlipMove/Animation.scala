package typingsJapgolly.reactFlipMove.mod.FlipMove

import typingsJapgolly.reactFlipMove.PartialCSSStyleDeclaratio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Animation extends _AnimationProp {
  var from: PartialCSSStyleDeclaratio
  var to: PartialCSSStyleDeclaratio
}

object Animation {
  @scala.inline
  def apply(from: PartialCSSStyleDeclaratio, to: PartialCSSStyleDeclaratio): Animation = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Animation]
  }
}

