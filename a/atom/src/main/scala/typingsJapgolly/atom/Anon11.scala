package typingsJapgolly.atom

import typingsJapgolly.atom.atomStrings.none
import typingsJapgolly.atom.atomStrings.textOrSnippet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon11 extends js.Object {
  var newValue: none | textOrSnippet
  var oldValue: js.UndefOr[none | textOrSnippet] = js.undefined
}

object Anon11 {
  @scala.inline
  def apply(newValue: none | textOrSnippet, oldValue: none | textOrSnippet = null): Anon11 = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon11]
  }
}

