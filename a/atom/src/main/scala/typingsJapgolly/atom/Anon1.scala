package typingsJapgolly.atom

import typingsJapgolly.atom.atomStrings.always
import typingsJapgolly.atom.atomStrings.no
import typingsJapgolly.atom.atomStrings.yes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon1 extends js.Object {
  var newValue: no | yes | always
  var oldValue: js.UndefOr[no | yes | always] = js.undefined
}

object Anon1 {
  @scala.inline
  def apply(newValue: no | yes | always, oldValue: no | yes | always = null): Anon1 = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon1]
  }
}

