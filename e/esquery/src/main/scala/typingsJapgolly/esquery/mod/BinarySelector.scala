package typingsJapgolly.esquery.mod

import typingsJapgolly.esquery.esqueryStrings.adjacent
import typingsJapgolly.esquery.esqueryStrings.child
import typingsJapgolly.esquery.esqueryStrings.descendant
import typingsJapgolly.esquery.esqueryStrings.sibling
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.esquery.mod.Descendant
  - typingsJapgolly.esquery.mod.Child
  - typingsJapgolly.esquery.mod.Sibling
  - typingsJapgolly.esquery.mod.Adjacent
*/
trait BinarySelector extends SubjectSelector

object BinarySelector {
  @scala.inline
  def Descendant(
    left: SubjectSelector,
    right: SubjectSelector,
    `type`: descendant,
    subject: js.UndefOr[Boolean] = js.undefined
  ): BinarySelector = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinarySelector]
  }
  @scala.inline
  def Child(
    left: SubjectSelector,
    right: SubjectSelector,
    `type`: child,
    subject: js.UndefOr[Boolean] = js.undefined
  ): BinarySelector = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinarySelector]
  }
  @scala.inline
  def Sibling(
    left: SubjectSelector,
    right: SubjectSelector,
    `type`: sibling,
    subject: js.UndefOr[Boolean] = js.undefined
  ): BinarySelector = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinarySelector]
  }
  @scala.inline
  def Adjacent(
    left: SubjectSelector,
    right: SubjectSelector,
    `type`: adjacent,
    subject: js.UndefOr[Boolean] = js.undefined
  ): BinarySelector = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinarySelector]
  }
}

