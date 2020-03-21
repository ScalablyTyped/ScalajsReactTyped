package typingsJapgolly.minecraftScriptingTypesShared

import typingsJapgolly.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.Equalssign
import typingsJapgolly.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.EqualssignEqualssign
import typingsJapgolly.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.ExclamationmarkEqualssign
import typingsJapgolly.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.Greaterthansign
import typingsJapgolly.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.GreaterthansignEqualssign
import typingsJapgolly.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.Lessthansign
import typingsJapgolly.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.LessthansignEqualssign
import typingsJapgolly.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.LessthansignGreaterthansign
import typingsJapgolly.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.equals
import typingsJapgolly.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.not
import typingsJapgolly.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.other
import typingsJapgolly.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.parent
import typingsJapgolly.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.player
import typingsJapgolly.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.self
import typingsJapgolly.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.target
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinecraftFilter extends js.Object {
  var all_of: js.UndefOr[js.Array[MinecraftFilter]] = js.undefined
  var any_of: js.UndefOr[js.Array[MinecraftFilter]] = js.undefined
  var domain: js.UndefOr[String] = js.undefined
  var operator: js.UndefOr[
    ExclamationmarkEqualssign | Lessthansign | LessthansignEqualssign | LessthansignGreaterthansign | Equalssign | EqualssignEqualssign | Greaterthansign | GreaterthansignEqualssign | equals | not
  ] = js.undefined
  var subject: js.UndefOr[other | parent | player | self | target] = js.undefined
  var test: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object MinecraftFilter {
  @scala.inline
  def apply(
    all_of: js.Array[MinecraftFilter] = null,
    any_of: js.Array[MinecraftFilter] = null,
    domain: String = null,
    operator: ExclamationmarkEqualssign | Lessthansign | LessthansignEqualssign | LessthansignGreaterthansign | Equalssign | EqualssignEqualssign | Greaterthansign | GreaterthansignEqualssign | equals | not = null,
    subject: other | parent | player | self | target = null,
    test: String = null,
    value: js.Any = null
  ): MinecraftFilter = {
    val __obj = js.Dynamic.literal()
    if (all_of != null) __obj.updateDynamic("all_of")(all_of.asInstanceOf[js.Any])
    if (any_of != null) __obj.updateDynamic("any_of")(any_of.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinecraftFilter]
  }
}

