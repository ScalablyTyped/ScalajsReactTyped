package typingsJapgolly.esquery.mod

import typingsJapgolly.esquery.esqueryStrings.sibling
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sibling
  extends BinarySelectorAtom
     with BinarySelector
     with Selector {
  @JSName("type")
  var type_Sibling: sibling
}

object Sibling {
  @scala.inline
  def apply(
    left: SubjectSelector,
    right: SubjectSelector,
    `type`: sibling,
    subject: js.UndefOr[Boolean] = js.undefined
  ): Sibling = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sibling]
  }
}

