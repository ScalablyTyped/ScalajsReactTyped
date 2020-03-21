package typingsJapgolly.atom

import typingsJapgolly.atom.atomStrings.auto
import typingsJapgolly.atom.atomStrings.hard
import typingsJapgolly.atom.atomStrings.soft
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon7 extends js.Object {
  var newValue: auto | soft | hard
  var oldValue: js.UndefOr[auto | soft | hard] = js.undefined
}

object Anon7 {
  @scala.inline
  def apply(newValue: auto | soft | hard, oldValue: auto | soft | hard = null): Anon7 = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon7]
  }
}

