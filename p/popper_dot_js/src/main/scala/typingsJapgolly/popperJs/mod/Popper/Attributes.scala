package typingsJapgolly.popperJs.mod.Popper

import typingsJapgolly.popperJs.popperJsBooleans.`false`
import typingsJapgolly.popperJs.popperJsStrings._empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attributes extends js.Object {
  var `x-out-of-boundaries`: _empty | `false`
  var `x-placement`: Placement
}

object Attributes {
  @scala.inline
  def apply(`x-out-of-boundaries`: _empty | `false`, `x-placement`: Placement): Attributes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("x-out-of-boundaries")(`x-out-of-boundaries`.asInstanceOf[js.Any])
    __obj.updateDynamic("x-placement")(`x-placement`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributes]
  }
}

