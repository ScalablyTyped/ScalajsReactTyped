package typingsJapgolly.esquery.mod

import typingsJapgolly.esquery.esqueryStrings.Asterisk
import typingsJapgolly.esquery.esqueryStrings.Equalssign
import typingsJapgolly.esquery.esqueryStrings.ExclamationmarkEqualssign
import typingsJapgolly.esquery.esqueryStrings.Greaterthansign
import typingsJapgolly.esquery.esqueryStrings.GreaterthansignEqualssign
import typingsJapgolly.esquery.esqueryStrings.Lessthansign
import typingsJapgolly.esquery.esqueryStrings.LessthansignEqualssign
import typingsJapgolly.esquery.esqueryStrings.`nth-child`
import typingsJapgolly.esquery.esqueryStrings.`nth-last-child`
import typingsJapgolly.esquery.esqueryStrings.adjacent
import typingsJapgolly.esquery.esqueryStrings.attribute
import typingsJapgolly.esquery.esqueryStrings.child
import typingsJapgolly.esquery.esqueryStrings.compound
import typingsJapgolly.esquery.esqueryStrings.descendant
import typingsJapgolly.esquery.esqueryStrings.has
import typingsJapgolly.esquery.esqueryStrings.identifier
import typingsJapgolly.esquery.esqueryStrings.not
import typingsJapgolly.esquery.esqueryStrings.sibling
import typingsJapgolly.esquery.esqueryStrings.wildcard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.esquery.mod.NthSelector
  - typingsJapgolly.esquery.mod.BinarySelector
  - typingsJapgolly.esquery.mod.MultiSelector
  - typingsJapgolly.esquery.mod.Identifier
  - typingsJapgolly.esquery.mod.Wildcard
  - typingsJapgolly.esquery.mod.Attribute
*/
trait SubjectSelector extends js.Object

object SubjectSelector {
  @scala.inline
  def Matches_(
    selectors: js.Array[SubjectSelector],
    `type`: typingsJapgolly.esquery.esqueryStrings.matches,
    subject: js.UndefOr[Boolean] = js.undefined
  ): SubjectSelector = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubjectSelector]
  }
  @scala.inline
  def Has(selectors: js.Array[SubjectSelector], `type`: has, subject: js.UndefOr[Boolean] = js.undefined): SubjectSelector = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubjectSelector]
  }
  @scala.inline
  def Sequence(
    selectors: js.Array[SubjectSelector],
    `type`: compound,
    subject: js.UndefOr[Boolean] = js.undefined
  ): SubjectSelector = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubjectSelector]
  }
  @scala.inline
  def NthChild(index: NumericLiteral, `type`: `nth-child`, subject: js.UndefOr[Boolean] = js.undefined): SubjectSelector = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubjectSelector]
  }
  @scala.inline
  def Attribute(
    name: String,
    `type`: attribute,
    operator: Equalssign | ExclamationmarkEqualssign | Greaterthansign | Lessthansign | GreaterthansignEqualssign | LessthansignEqualssign = null,
    subject: js.UndefOr[Boolean] = js.undefined,
    value: Literal | RegExpLiteral | Type = null
  ): SubjectSelector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubjectSelector]
  }
  @scala.inline
  def Adjacent(
    left: SubjectSelector,
    right: SubjectSelector,
    `type`: adjacent,
    subject: js.UndefOr[Boolean] = js.undefined
  ): SubjectSelector = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubjectSelector]
  }
  @scala.inline
  def Wildcard(`type`: wildcard, value: Asterisk, subject: js.UndefOr[Boolean] = js.undefined): SubjectSelector = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubjectSelector]
  }
  @scala.inline
  def Child(
    left: SubjectSelector,
    right: SubjectSelector,
    `type`: child,
    subject: js.UndefOr[Boolean] = js.undefined
  ): SubjectSelector = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubjectSelector]
  }
  @scala.inline
  def NthLastChild(index: NumericLiteral, `type`: `nth-last-child`, subject: js.UndefOr[Boolean] = js.undefined): SubjectSelector = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubjectSelector]
  }
  @scala.inline
  def Sibling(
    left: SubjectSelector,
    right: SubjectSelector,
    `type`: sibling,
    subject: js.UndefOr[Boolean] = js.undefined
  ): SubjectSelector = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubjectSelector]
  }
  @scala.inline
  def Negation(selectors: js.Array[SubjectSelector], `type`: not, subject: js.UndefOr[Boolean] = js.undefined): SubjectSelector = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubjectSelector]
  }
  @scala.inline
  def Descendant(
    left: SubjectSelector,
    right: SubjectSelector,
    `type`: descendant,
    subject: js.UndefOr[Boolean] = js.undefined
  ): SubjectSelector = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubjectSelector]
  }
  @scala.inline
  def Identifier(`type`: identifier, value: String, subject: js.UndefOr[Boolean] = js.undefined): SubjectSelector = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubjectSelector]
  }
}

