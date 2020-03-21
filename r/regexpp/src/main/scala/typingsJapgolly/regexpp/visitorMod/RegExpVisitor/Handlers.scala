package typingsJapgolly.regexpp.visitorMod.RegExpVisitor

import japgolly.scalajs.react.Callback
import typingsJapgolly.regexpp.astMod.Alternative
import typingsJapgolly.regexpp.astMod.Assertion
import typingsJapgolly.regexpp.astMod.Backreference
import typingsJapgolly.regexpp.astMod.CapturingGroup
import typingsJapgolly.regexpp.astMod.Character
import typingsJapgolly.regexpp.astMod.CharacterClass
import typingsJapgolly.regexpp.astMod.CharacterClassRange
import typingsJapgolly.regexpp.astMod.CharacterSet
import typingsJapgolly.regexpp.astMod.Flags
import typingsJapgolly.regexpp.astMod.Group
import typingsJapgolly.regexpp.astMod.Pattern
import typingsJapgolly.regexpp.astMod.Quantifier
import typingsJapgolly.regexpp.astMod.RegExpLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Handlers extends js.Object {
  var onAlternativeEnter: js.UndefOr[js.Function1[/* node */ Alternative, Unit]] = js.undefined
  var onAlternativeLeave: js.UndefOr[js.Function1[/* node */ Alternative, Unit]] = js.undefined
  var onAssertionEnter: js.UndefOr[js.Function1[/* node */ Assertion, Unit]] = js.undefined
  var onAssertionLeave: js.UndefOr[js.Function1[/* node */ Assertion, Unit]] = js.undefined
  var onBackreferenceEnter: js.UndefOr[js.Function1[/* node */ Backreference, Unit]] = js.undefined
  var onBackreferenceLeave: js.UndefOr[js.Function1[/* node */ Backreference, Unit]] = js.undefined
  var onCapturingGroupEnter: js.UndefOr[js.Function1[/* node */ CapturingGroup, Unit]] = js.undefined
  var onCapturingGroupLeave: js.UndefOr[js.Function1[/* node */ CapturingGroup, Unit]] = js.undefined
  var onCharacterClassEnter: js.UndefOr[js.Function1[/* node */ CharacterClass, Unit]] = js.undefined
  var onCharacterClassLeave: js.UndefOr[js.Function1[/* node */ CharacterClass, Unit]] = js.undefined
  var onCharacterClassRangeEnter: js.UndefOr[js.Function1[/* node */ CharacterClassRange, Unit]] = js.undefined
  var onCharacterClassRangeLeave: js.UndefOr[js.Function1[/* node */ CharacterClassRange, Unit]] = js.undefined
  var onCharacterEnter: js.UndefOr[js.Function1[/* node */ Character, Unit]] = js.undefined
  var onCharacterLeave: js.UndefOr[js.Function1[/* node */ Character, Unit]] = js.undefined
  var onCharacterSetEnter: js.UndefOr[js.Function1[/* node */ CharacterSet, Unit]] = js.undefined
  var onCharacterSetLeave: js.UndefOr[js.Function1[/* node */ CharacterSet, Unit]] = js.undefined
  var onFlagsEnter: js.UndefOr[js.Function1[/* node */ Flags, Unit]] = js.undefined
  var onFlagsLeave: js.UndefOr[js.Function1[/* node */ Flags, Unit]] = js.undefined
  var onGroupEnter: js.UndefOr[js.Function1[/* node */ Group, Unit]] = js.undefined
  var onGroupLeave: js.UndefOr[js.Function1[/* node */ Group, Unit]] = js.undefined
  var onPatternEnter: js.UndefOr[js.Function1[/* node */ Pattern, Unit]] = js.undefined
  var onPatternLeave: js.UndefOr[js.Function1[/* node */ Pattern, Unit]] = js.undefined
  var onQuantifierEnter: js.UndefOr[js.Function1[/* node */ Quantifier, Unit]] = js.undefined
  var onQuantifierLeave: js.UndefOr[js.Function1[/* node */ Quantifier, Unit]] = js.undefined
  var onRegExpLiteralEnter: js.UndefOr[js.Function1[/* node */ RegExpLiteral, Unit]] = js.undefined
  var onRegExpLiteralLeave: js.UndefOr[js.Function1[/* node */ RegExpLiteral, Unit]] = js.undefined
}

object Handlers {
  @scala.inline
  def apply(
    onAlternativeEnter: /* node */ Alternative => Callback = null,
    onAlternativeLeave: /* node */ Alternative => Callback = null,
    onAssertionEnter: /* node */ Assertion => Callback = null,
    onAssertionLeave: /* node */ Assertion => Callback = null,
    onBackreferenceEnter: /* node */ Backreference => Callback = null,
    onBackreferenceLeave: /* node */ Backreference => Callback = null,
    onCapturingGroupEnter: /* node */ CapturingGroup => Callback = null,
    onCapturingGroupLeave: /* node */ CapturingGroup => Callback = null,
    onCharacterClassEnter: /* node */ CharacterClass => Callback = null,
    onCharacterClassLeave: /* node */ CharacterClass => Callback = null,
    onCharacterClassRangeEnter: /* node */ CharacterClassRange => Callback = null,
    onCharacterClassRangeLeave: /* node */ CharacterClassRange => Callback = null,
    onCharacterEnter: /* node */ Character => Callback = null,
    onCharacterLeave: /* node */ Character => Callback = null,
    onCharacterSetEnter: /* node */ CharacterSet => Callback = null,
    onCharacterSetLeave: /* node */ CharacterSet => Callback = null,
    onFlagsEnter: /* node */ Flags => Callback = null,
    onFlagsLeave: /* node */ Flags => Callback = null,
    onGroupEnter: /* node */ Group => Callback = null,
    onGroupLeave: /* node */ Group => Callback = null,
    onPatternEnter: /* node */ Pattern => Callback = null,
    onPatternLeave: /* node */ Pattern => Callback = null,
    onQuantifierEnter: /* node */ Quantifier => Callback = null,
    onQuantifierLeave: /* node */ Quantifier => Callback = null,
    onRegExpLiteralEnter: /* node */ RegExpLiteral => Callback = null,
    onRegExpLiteralLeave: /* node */ RegExpLiteral => Callback = null
  ): Handlers = {
    val __obj = js.Dynamic.literal()
    if (onAlternativeEnter != null) __obj.updateDynamic("onAlternativeEnter")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.regexpp.astMod.Alternative) => onAlternativeEnter(t0).runNow()))
    if (onAlternativeLeave != null) __obj.updateDynamic("onAlternativeLeave")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.regexpp.astMod.Alternative) => onAlternativeLeave(t0).runNow()))
    if (onAssertionEnter != null) __obj.updateDynamic("onAssertionEnter")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.regexpp.astMod.Assertion) => onAssertionEnter(t0).runNow()))
    if (onAssertionLeave != null) __obj.updateDynamic("onAssertionLeave")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.regexpp.astMod.Assertion) => onAssertionLeave(t0).runNow()))
    if (onBackreferenceEnter != null) __obj.updateDynamic("onBackreferenceEnter")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.regexpp.astMod.Backreference) => onBackreferenceEnter(t0).runNow()))
    if (onBackreferenceLeave != null) __obj.updateDynamic("onBackreferenceLeave")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.regexpp.astMod.Backreference) => onBackreferenceLeave(t0).runNow()))
    if (onCapturingGroupEnter != null) __obj.updateDynamic("onCapturingGroupEnter")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.regexpp.astMod.CapturingGroup) => onCapturingGroupEnter(t0).runNow()))
    if (onCapturingGroupLeave != null) __obj.updateDynamic("onCapturingGroupLeave")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.regexpp.astMod.CapturingGroup) => onCapturingGroupLeave(t0).runNow()))
    if (onCharacterClassEnter != null) __obj.updateDynamic("onCharacterClassEnter")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.regexpp.astMod.CharacterClass) => onCharacterClassEnter(t0).runNow()))
    if (onCharacterClassLeave != null) __obj.updateDynamic("onCharacterClassLeave")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.regexpp.astMod.CharacterClass) => onCharacterClassLeave(t0).runNow()))
    if (onCharacterClassRangeEnter != null) __obj.updateDynamic("onCharacterClassRangeEnter")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.regexpp.astMod.CharacterClassRange) => onCharacterClassRangeEnter(t0).runNow()))
    if (onCharacterClassRangeLeave != null) __obj.updateDynamic("onCharacterClassRangeLeave")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.regexpp.astMod.CharacterClassRange) => onCharacterClassRangeLeave(t0).runNow()))
    if (onCharacterEnter != null) __obj.updateDynamic("onCharacterEnter")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.regexpp.astMod.Character) => onCharacterEnter(t0).runNow()))
    if (onCharacterLeave != null) __obj.updateDynamic("onCharacterLeave")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.regexpp.astMod.Character) => onCharacterLeave(t0).runNow()))
    if (onCharacterSetEnter != null) __obj.updateDynamic("onCharacterSetEnter")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.regexpp.astMod.CharacterSet) => onCharacterSetEnter(t0).runNow()))
    if (onCharacterSetLeave != null) __obj.updateDynamic("onCharacterSetLeave")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.regexpp.astMod.CharacterSet) => onCharacterSetLeave(t0).runNow()))
    if (onFlagsEnter != null) __obj.updateDynamic("onFlagsEnter")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.regexpp.astMod.Flags) => onFlagsEnter(t0).runNow()))
    if (onFlagsLeave != null) __obj.updateDynamic("onFlagsLeave")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.regexpp.astMod.Flags) => onFlagsLeave(t0).runNow()))
    if (onGroupEnter != null) __obj.updateDynamic("onGroupEnter")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.regexpp.astMod.Group) => onGroupEnter(t0).runNow()))
    if (onGroupLeave != null) __obj.updateDynamic("onGroupLeave")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.regexpp.astMod.Group) => onGroupLeave(t0).runNow()))
    if (onPatternEnter != null) __obj.updateDynamic("onPatternEnter")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.regexpp.astMod.Pattern) => onPatternEnter(t0).runNow()))
    if (onPatternLeave != null) __obj.updateDynamic("onPatternLeave")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.regexpp.astMod.Pattern) => onPatternLeave(t0).runNow()))
    if (onQuantifierEnter != null) __obj.updateDynamic("onQuantifierEnter")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.regexpp.astMod.Quantifier) => onQuantifierEnter(t0).runNow()))
    if (onQuantifierLeave != null) __obj.updateDynamic("onQuantifierLeave")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.regexpp.astMod.Quantifier) => onQuantifierLeave(t0).runNow()))
    if (onRegExpLiteralEnter != null) __obj.updateDynamic("onRegExpLiteralEnter")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.regexpp.astMod.RegExpLiteral) => onRegExpLiteralEnter(t0).runNow()))
    if (onRegExpLiteralLeave != null) __obj.updateDynamic("onRegExpLiteralLeave")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.regexpp.astMod.RegExpLiteral) => onRegExpLiteralLeave(t0).runNow()))
    __obj.asInstanceOf[Handlers]
  }
}

