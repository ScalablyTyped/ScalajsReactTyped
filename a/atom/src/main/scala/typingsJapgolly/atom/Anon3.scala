package typingsJapgolly.atom

import typingsJapgolly.atom.atomStrings.experimental
import typingsJapgolly.atom.atomStrings.native
import typingsJapgolly.atom.atomStrings.poll
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon3 extends js.Object {
  var newValue: native | experimental | poll | typingsJapgolly.atom.atomStrings.atom
  var oldValue: js.UndefOr[native | experimental | poll | typingsJapgolly.atom.atomStrings.atom] = js.undefined
}

object Anon3 {
  @scala.inline
  def apply(
    newValue: native | experimental | poll | typingsJapgolly.atom.atomStrings.atom,
    oldValue: native | experimental | poll | typingsJapgolly.atom.atomStrings.atom = null
  ): Anon3 = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon3]
  }
}

