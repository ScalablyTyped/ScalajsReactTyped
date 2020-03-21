package typingsJapgolly.regexpp.validatorMod.RegExpValidator

import japgolly.scalajs.react.Callback
import typingsJapgolly.regexpp.ecmaVersionsMod.EcmaVersion
import typingsJapgolly.regexpp.regexppStrings.any
import typingsJapgolly.regexpp.regexppStrings.digit
import typingsJapgolly.regexpp.regexppStrings.end
import typingsJapgolly.regexpp.regexppStrings.lookahead
import typingsJapgolly.regexpp.regexppStrings.lookbehind
import typingsJapgolly.regexpp.regexppStrings.property
import typingsJapgolly.regexpp.regexppStrings.space
import typingsJapgolly.regexpp.regexppStrings.start
import typingsJapgolly.regexpp.regexppStrings.word
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var ecmaVersion: js.UndefOr[EcmaVersion] = js.undefined
  var onAlternativeEnter: js.UndefOr[js.Function2[/* start */ Double, /* index */ Double, Unit]] = js.undefined
  var onAlternativeLeave: js.UndefOr[js.Function3[/* start */ Double, /* end */ Double, /* index */ Double, Unit]] = js.undefined
  var onAnyCharacterSet: js.UndefOr[js.Function3[/* start */ Double, /* end */ Double, any, Unit]] = js.undefined
  var onBackreference: js.UndefOr[
    js.Function3[/* start */ Double, /* end */ Double, /* ref */ Double | String, Unit]
  ] = js.undefined
  var onCapturingGroupEnter: js.UndefOr[js.Function2[/* start */ Double, /* name */ String | Null, Unit]] = js.undefined
  var onCapturingGroupLeave: js.UndefOr[
    js.Function3[/* start */ Double, /* end */ Double, /* name */ String | Null, Unit]
  ] = js.undefined
  var onCharacter: js.UndefOr[js.Function3[/* start */ Double, /* end */ Double, /* value */ Double, Unit]] = js.undefined
  var onCharacterClassEnter: js.UndefOr[js.Function2[/* start */ Double, /* negate */ Boolean, Unit]] = js.undefined
  var onCharacterClassLeave: js.UndefOr[js.Function3[/* start */ Double, /* end */ Double, /* negate */ Boolean, Unit]] = js.undefined
  var onCharacterClassRange: js.UndefOr[
    js.Function4[/* start */ Double, /* end */ Double, /* min */ Double, /* max */ Double, Unit]
  ] = js.undefined
  var onDisjunctionEnter: js.UndefOr[js.Function1[/* start */ Double, Unit]] = js.undefined
  var onDisjunctionLeave: js.UndefOr[js.Function2[/* start */ Double, /* end */ Double, Unit]] = js.undefined
  var onEdgeAssertion: js.UndefOr[js.Function3[/* start */ Double, /* end */ Double, /* kind */ start | end, Unit]] = js.undefined
  var onEscapeCharacterSet: js.UndefOr[
    js.Function4[
      /* start */ Double, 
      /* end */ Double, 
      /* kind */ digit | space | word, 
      /* negate */ Boolean, 
      Unit
    ]
  ] = js.undefined
  var onFlags: js.UndefOr[
    js.Function8[
      /* start */ Double, 
      /* end */ Double, 
      /* global */ Boolean, 
      /* ignoreCase */ Boolean, 
      /* multiline */ Boolean, 
      /* unicode */ Boolean, 
      /* sticky */ Boolean, 
      /* dotAll */ Boolean, 
      Unit
    ]
  ] = js.undefined
  var onGroupEnter: js.UndefOr[js.Function1[/* start */ Double, Unit]] = js.undefined
  var onGroupLeave: js.UndefOr[js.Function2[/* start */ Double, /* end */ Double, Unit]] = js.undefined
  var onLiteralEnter: js.UndefOr[js.Function1[/* start */ Double, Unit]] = js.undefined
  var onLiteralLeave: js.UndefOr[js.Function2[/* start */ Double, /* end */ Double, Unit]] = js.undefined
  var onLookaroundAssertionEnter: js.UndefOr[
    js.Function3[/* start */ Double, /* kind */ lookahead | lookbehind, /* negate */ Boolean, Unit]
  ] = js.undefined
  var onLookaroundAssertionLeave: js.UndefOr[
    js.Function4[
      /* start */ Double, 
      /* end */ Double, 
      /* kind */ lookahead | lookbehind, 
      /* negate */ Boolean, 
      Unit
    ]
  ] = js.undefined
  var onPatternEnter: js.UndefOr[js.Function1[/* start */ Double, Unit]] = js.undefined
  var onPatternLeave: js.UndefOr[js.Function2[/* start */ Double, /* end */ Double, Unit]] = js.undefined
  var onQuantifier: js.UndefOr[
    js.Function5[
      /* start */ Double, 
      /* end */ Double, 
      /* min */ Double, 
      /* max */ Double, 
      /* greedy */ Boolean, 
      Unit
    ]
  ] = js.undefined
  var onUnicodePropertyCharacterSet: js.UndefOr[
    js.Function6[
      /* start */ Double, 
      /* end */ Double, 
      property, 
      /* key */ String, 
      /* value */ String | Null, 
      /* negate */ Boolean, 
      Unit
    ]
  ] = js.undefined
  var onWordBoundaryAssertion: js.UndefOr[
    js.Function4[/* start */ Double, /* end */ Double, word, /* negate */ Boolean, Unit]
  ] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    ecmaVersion: EcmaVersion = null,
    onAlternativeEnter: (/* start */ Double, /* index */ Double) => Callback = null,
    onAlternativeLeave: (/* start */ Double, /* end */ Double, /* index */ Double) => Callback = null,
    onAnyCharacterSet: (/* start */ Double, /* end */ Double, any) => Callback = null,
    onBackreference: (/* start */ Double, /* end */ Double, /* ref */ Double | String) => Callback = null,
    onCapturingGroupEnter: (/* start */ Double, /* name */ String | Null) => Callback = null,
    onCapturingGroupLeave: (/* start */ Double, /* end */ Double, /* name */ String | Null) => Callback = null,
    onCharacter: (/* start */ Double, /* end */ Double, /* value */ Double) => Callback = null,
    onCharacterClassEnter: (/* start */ Double, /* negate */ Boolean) => Callback = null,
    onCharacterClassLeave: (/* start */ Double, /* end */ Double, /* negate */ Boolean) => Callback = null,
    onCharacterClassRange: (/* start */ Double, /* end */ Double, /* min */ Double, /* max */ Double) => Callback = null,
    onDisjunctionEnter: /* start */ Double => Callback = null,
    onDisjunctionLeave: (/* start */ Double, /* end */ Double) => Callback = null,
    onEdgeAssertion: (/* start */ Double, /* end */ Double, /* kind */ start | end) => Callback = null,
    onEscapeCharacterSet: (/* start */ Double, /* end */ Double, /* kind */ digit | space | word, /* negate */ Boolean) => Callback = null,
    onFlags: (/* start */ Double, /* end */ Double, /* global */ Boolean, /* ignoreCase */ Boolean, /* multiline */ Boolean, /* unicode */ Boolean, /* sticky */ Boolean, /* dotAll */ Boolean) => Callback = null,
    onGroupEnter: /* start */ Double => Callback = null,
    onGroupLeave: (/* start */ Double, /* end */ Double) => Callback = null,
    onLiteralEnter: /* start */ Double => Callback = null,
    onLiteralLeave: (/* start */ Double, /* end */ Double) => Callback = null,
    onLookaroundAssertionEnter: (/* start */ Double, /* kind */ lookahead | lookbehind, /* negate */ Boolean) => Callback = null,
    onLookaroundAssertionLeave: (/* start */ Double, /* end */ Double, /* kind */ lookahead | lookbehind, /* negate */ Boolean) => Callback = null,
    onPatternEnter: /* start */ Double => Callback = null,
    onPatternLeave: (/* start */ Double, /* end */ Double) => Callback = null,
    onQuantifier: (/* start */ Double, /* end */ Double, /* min */ Double, /* max */ Double, /* greedy */ Boolean) => Callback = null,
    onUnicodePropertyCharacterSet: (/* start */ Double, /* end */ Double, property, /* key */ String, /* value */ String | Null, /* negate */ Boolean) => Callback = null,
    onWordBoundaryAssertion: (/* start */ Double, /* end */ Double, word, /* negate */ Boolean) => Callback = null,
    strict: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (ecmaVersion != null) __obj.updateDynamic("ecmaVersion")(ecmaVersion.asInstanceOf[js.Any])
    if (onAlternativeEnter != null) __obj.updateDynamic("onAlternativeEnter")(js.Any.fromFunction2((t0: /* start */ scala.Double, t1: /* index */ scala.Double) => onAlternativeEnter(t0, t1).runNow()))
    if (onAlternativeLeave != null) __obj.updateDynamic("onAlternativeLeave")(js.Any.fromFunction3((t0: /* start */ scala.Double, t1: /* end */ scala.Double, t2: /* index */ scala.Double) => onAlternativeLeave(t0, t1, t2).runNow()))
    if (onAnyCharacterSet != null) __obj.updateDynamic("onAnyCharacterSet")(js.Any.fromFunction3((t0: /* start */ scala.Double, t1: /* end */ scala.Double, t2: typingsJapgolly.regexpp.regexppStrings.any) => onAnyCharacterSet(t0, t1, t2).runNow()))
    if (onBackreference != null) __obj.updateDynamic("onBackreference")(js.Any.fromFunction3((t0: /* start */ scala.Double, t1: /* end */ scala.Double, t2: /* ref */ scala.Double | java.lang.String) => onBackreference(t0, t1, t2).runNow()))
    if (onCapturingGroupEnter != null) __obj.updateDynamic("onCapturingGroupEnter")(js.Any.fromFunction2((t0: /* start */ scala.Double, t1: /* name */ java.lang.String | scala.Null) => onCapturingGroupEnter(t0, t1).runNow()))
    if (onCapturingGroupLeave != null) __obj.updateDynamic("onCapturingGroupLeave")(js.Any.fromFunction3((t0: /* start */ scala.Double, t1: /* end */ scala.Double, t2: /* name */ java.lang.String | scala.Null) => onCapturingGroupLeave(t0, t1, t2).runNow()))
    if (onCharacter != null) __obj.updateDynamic("onCharacter")(js.Any.fromFunction3((t0: /* start */ scala.Double, t1: /* end */ scala.Double, t2: /* value */ scala.Double) => onCharacter(t0, t1, t2).runNow()))
    if (onCharacterClassEnter != null) __obj.updateDynamic("onCharacterClassEnter")(js.Any.fromFunction2((t0: /* start */ scala.Double, t1: /* negate */ scala.Boolean) => onCharacterClassEnter(t0, t1).runNow()))
    if (onCharacterClassLeave != null) __obj.updateDynamic("onCharacterClassLeave")(js.Any.fromFunction3((t0: /* start */ scala.Double, t1: /* end */ scala.Double, t2: /* negate */ scala.Boolean) => onCharacterClassLeave(t0, t1, t2).runNow()))
    if (onCharacterClassRange != null) __obj.updateDynamic("onCharacterClassRange")(js.Any.fromFunction4((t0: /* start */ scala.Double, t1: /* end */ scala.Double, t2: /* min */ scala.Double, t3: /* max */ scala.Double) => onCharacterClassRange(t0, t1, t2, t3).runNow()))
    if (onDisjunctionEnter != null) __obj.updateDynamic("onDisjunctionEnter")(js.Any.fromFunction1((t0: /* start */ scala.Double) => onDisjunctionEnter(t0).runNow()))
    if (onDisjunctionLeave != null) __obj.updateDynamic("onDisjunctionLeave")(js.Any.fromFunction2((t0: /* start */ scala.Double, t1: /* end */ scala.Double) => onDisjunctionLeave(t0, t1).runNow()))
    if (onEdgeAssertion != null) __obj.updateDynamic("onEdgeAssertion")(js.Any.fromFunction3((t0: /* start */ scala.Double, t1: /* end */ scala.Double, t2: /* kind */ typingsJapgolly.regexpp.regexppStrings.start | typingsJapgolly.regexpp.regexppStrings.end) => onEdgeAssertion(t0, t1, t2).runNow()))
    if (onEscapeCharacterSet != null) __obj.updateDynamic("onEscapeCharacterSet")(js.Any.fromFunction4((t0: /* start */ scala.Double, t1: /* end */ scala.Double, t2: /* kind */ typingsJapgolly.regexpp.regexppStrings.digit | typingsJapgolly.regexpp.regexppStrings.space | typingsJapgolly.regexpp.regexppStrings.word, t3: /* negate */ scala.Boolean) => onEscapeCharacterSet(t0, t1, t2, t3).runNow()))
    if (onFlags != null) __obj.updateDynamic("onFlags")(js.Any.fromFunction8((t0: /* start */ scala.Double, t1: /* end */ scala.Double, t2: /* global */ scala.Boolean, t3: /* ignoreCase */ scala.Boolean, t4: /* multiline */ scala.Boolean, t5: /* unicode */ scala.Boolean, t6: /* sticky */ scala.Boolean, t7: /* dotAll */ scala.Boolean) => onFlags(t0, t1, t2, t3, t4, t5, t6, t7).runNow()))
    if (onGroupEnter != null) __obj.updateDynamic("onGroupEnter")(js.Any.fromFunction1((t0: /* start */ scala.Double) => onGroupEnter(t0).runNow()))
    if (onGroupLeave != null) __obj.updateDynamic("onGroupLeave")(js.Any.fromFunction2((t0: /* start */ scala.Double, t1: /* end */ scala.Double) => onGroupLeave(t0, t1).runNow()))
    if (onLiteralEnter != null) __obj.updateDynamic("onLiteralEnter")(js.Any.fromFunction1((t0: /* start */ scala.Double) => onLiteralEnter(t0).runNow()))
    if (onLiteralLeave != null) __obj.updateDynamic("onLiteralLeave")(js.Any.fromFunction2((t0: /* start */ scala.Double, t1: /* end */ scala.Double) => onLiteralLeave(t0, t1).runNow()))
    if (onLookaroundAssertionEnter != null) __obj.updateDynamic("onLookaroundAssertionEnter")(js.Any.fromFunction3((t0: /* start */ scala.Double, t1: /* kind */ typingsJapgolly.regexpp.regexppStrings.lookahead | typingsJapgolly.regexpp.regexppStrings.lookbehind, t2: /* negate */ scala.Boolean) => onLookaroundAssertionEnter(t0, t1, t2).runNow()))
    if (onLookaroundAssertionLeave != null) __obj.updateDynamic("onLookaroundAssertionLeave")(js.Any.fromFunction4((t0: /* start */ scala.Double, t1: /* end */ scala.Double, t2: /* kind */ typingsJapgolly.regexpp.regexppStrings.lookahead | typingsJapgolly.regexpp.regexppStrings.lookbehind, t3: /* negate */ scala.Boolean) => onLookaroundAssertionLeave(t0, t1, t2, t3).runNow()))
    if (onPatternEnter != null) __obj.updateDynamic("onPatternEnter")(js.Any.fromFunction1((t0: /* start */ scala.Double) => onPatternEnter(t0).runNow()))
    if (onPatternLeave != null) __obj.updateDynamic("onPatternLeave")(js.Any.fromFunction2((t0: /* start */ scala.Double, t1: /* end */ scala.Double) => onPatternLeave(t0, t1).runNow()))
    if (onQuantifier != null) __obj.updateDynamic("onQuantifier")(js.Any.fromFunction5((t0: /* start */ scala.Double, t1: /* end */ scala.Double, t2: /* min */ scala.Double, t3: /* max */ scala.Double, t4: /* greedy */ scala.Boolean) => onQuantifier(t0, t1, t2, t3, t4).runNow()))
    if (onUnicodePropertyCharacterSet != null) __obj.updateDynamic("onUnicodePropertyCharacterSet")(js.Any.fromFunction6((t0: /* start */ scala.Double, t1: /* end */ scala.Double, t2: typingsJapgolly.regexpp.regexppStrings.property, t3: /* key */ java.lang.String, t4: /* value */ java.lang.String | scala.Null, t5: /* negate */ scala.Boolean) => onUnicodePropertyCharacterSet(t0, t1, t2, t3, t4, t5).runNow()))
    if (onWordBoundaryAssertion != null) __obj.updateDynamic("onWordBoundaryAssertion")(js.Any.fromFunction4((t0: /* start */ scala.Double, t1: /* end */ scala.Double, t2: typingsJapgolly.regexpp.regexppStrings.word, t3: /* negate */ scala.Boolean) => onWordBoundaryAssertion(t0, t1, t2, t3).runNow()))
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

