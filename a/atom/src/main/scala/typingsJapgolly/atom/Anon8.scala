package typingsJapgolly.atom

import typingsJapgolly.atom.atomStrings.`tab alwaysComma enter when suggestion explicitly selected`
import typingsJapgolly.atom.atomStrings.`tab and enter`
import typingsJapgolly.atom.atomStrings.enter
import typingsJapgolly.atom.atomStrings.tab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon8 extends js.Object {
  var newValue: tab | enter | (`tab and enter`) | (`tab alwaysComma enter when suggestion explicitly selected`)
  var oldValue: js.UndefOr[
    tab | enter | (`tab and enter`) | (`tab alwaysComma enter when suggestion explicitly selected`)
  ] = js.undefined
}

object Anon8 {
  @scala.inline
  def apply(
    newValue: tab | enter | (`tab and enter`) | (`tab alwaysComma enter when suggestion explicitly selected`),
    oldValue: tab | enter | (`tab and enter`) | (`tab alwaysComma enter when suggestion explicitly selected`) = null
  ): Anon8 = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon8]
  }
}

