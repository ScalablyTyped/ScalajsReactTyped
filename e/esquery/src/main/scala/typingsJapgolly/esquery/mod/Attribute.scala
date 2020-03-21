package typingsJapgolly.esquery.mod

import typingsJapgolly.esquery.esqueryStrings.Equalssign
import typingsJapgolly.esquery.esqueryStrings.ExclamationmarkEqualssign
import typingsJapgolly.esquery.esqueryStrings.Greaterthansign
import typingsJapgolly.esquery.esqueryStrings.GreaterthansignEqualssign
import typingsJapgolly.esquery.esqueryStrings.Lessthansign
import typingsJapgolly.esquery.esqueryStrings.LessthansignEqualssign
import typingsJapgolly.esquery.esqueryStrings.attribute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attribute
  extends SubjectSelectorAtom
     with Selector
     with SubjectSelector {
  var name: String
  var operator: js.UndefOr[
    Equalssign | ExclamationmarkEqualssign | Greaterthansign | Lessthansign | GreaterthansignEqualssign | LessthansignEqualssign
  ] = js.undefined
  @JSName("type")
  var type_Attribute: attribute
  var value: js.UndefOr[Literal | RegExpLiteral | Type] = js.undefined
}

object Attribute {
  @scala.inline
  def apply(
    name: String,
    `type`: attribute,
    operator: Equalssign | ExclamationmarkEqualssign | Greaterthansign | Lessthansign | GreaterthansignEqualssign | LessthansignEqualssign = null,
    subject: js.UndefOr[Boolean] = js.undefined,
    value: Literal | RegExpLiteral | Type = null
  ): Attribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attribute]
  }
}

