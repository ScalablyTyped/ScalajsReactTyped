package typingsJapgolly.terminalKit.terminalMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.terminalKit.terminalKitBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputFieldOptions extends js.Object {
  var autoComplete: js.UndefOr[js.Array[String] | Autocompletion] = js.undefined
  var autoCompleteHint: js.UndefOr[Boolean] = js.undefined
  var autoCompleteMenu: js.UndefOr[Boolean | Autocompletion] = js.undefined
  var cancelable: js.UndefOr[Boolean] = js.undefined
  var cursorPosition: js.UndefOr[Double] = js.undefined
  var default: js.UndefOr[String] = js.undefined
  var echo: js.UndefOr[Boolean] = js.undefined
  var echoChar: js.UndefOr[String | `true`] = js.undefined
  var hintStyle: js.UndefOr[CTerminal] = js.undefined
  var history: js.UndefOr[js.Array[String]] = js.undefined
  var keyBindings: js.UndefOr[StringDictionary[String]] = js.undefined
  var maxLength: js.UndefOr[Double] = js.undefined
  var minLength: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CTerminal] = js.undefined
  var tokenHook: js.UndefOr[
    js.Function5[
      /* token */ String, 
      /* isEndOfInput */ Boolean, 
      /* previousTokens */ js.Array[String], 
      /* term */ Terminal, 
      /* config */ HookConfig, 
      String | CTerminal | Null | Unit
    ]
  ] = js.undefined
  var tokenRegExp: js.UndefOr[js.RegExp] = js.undefined
  var tokenResetHook: js.UndefOr[
    js.Function2[/* term */ Terminal, /* config */ js.UndefOr[HookConfig], String | CTerminal]
  ] = js.undefined
}

object InputFieldOptions {
  @scala.inline
  def apply(
    autoComplete: js.Array[String] | Autocompletion = null,
    autoCompleteHint: js.UndefOr[Boolean] = js.undefined,
    autoCompleteMenu: Boolean | Autocompletion = null,
    cancelable: js.UndefOr[Boolean] = js.undefined,
    cursorPosition: Int | Double = null,
    default: String = null,
    echo: js.UndefOr[Boolean] = js.undefined,
    echoChar: String | `true` = null,
    hintStyle: CTerminal = null,
    history: js.Array[String] = null,
    keyBindings: StringDictionary[String] = null,
    maxLength: Int | Double = null,
    minLength: Int | Double = null,
    style: CTerminal = null,
    tokenHook: (/* token */ String, /* isEndOfInput */ Boolean, /* previousTokens */ js.Array[String], /* term */ Terminal, /* config */ HookConfig) => CallbackTo[String | CTerminal | Null | Unit] = null,
    tokenRegExp: js.RegExp = null,
    tokenResetHook: (/* term */ Terminal, /* config */ js.UndefOr[HookConfig]) => CallbackTo[String | CTerminal] = null
  ): InputFieldOptions = {
    val __obj = js.Dynamic.literal()
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete.asInstanceOf[js.Any])
    if (!js.isUndefined(autoCompleteHint)) __obj.updateDynamic("autoCompleteHint")(autoCompleteHint.asInstanceOf[js.Any])
    if (autoCompleteMenu != null) __obj.updateDynamic("autoCompleteMenu")(autoCompleteMenu.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.asInstanceOf[js.Any])
    if (cursorPosition != null) __obj.updateDynamic("cursorPosition")(cursorPosition.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (!js.isUndefined(echo)) __obj.updateDynamic("echo")(echo.asInstanceOf[js.Any])
    if (echoChar != null) __obj.updateDynamic("echoChar")(echoChar.asInstanceOf[js.Any])
    if (hintStyle != null) __obj.updateDynamic("hintStyle")(hintStyle.asInstanceOf[js.Any])
    if (history != null) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    if (keyBindings != null) __obj.updateDynamic("keyBindings")(keyBindings.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tokenHook != null) __obj.updateDynamic("tokenHook")(js.Any.fromFunction5((t0: /* token */ java.lang.String, t1: /* isEndOfInput */ scala.Boolean, t2: /* previousTokens */ js.Array[java.lang.String], t3: /* term */ typingsJapgolly.terminalKit.terminalMod.Terminal, t4: /* config */ typingsJapgolly.terminalKit.terminalMod.HookConfig) => tokenHook(t0, t1, t2, t3, t4).runNow()))
    if (tokenRegExp != null) __obj.updateDynamic("tokenRegExp")(tokenRegExp.asInstanceOf[js.Any])
    if (tokenResetHook != null) __obj.updateDynamic("tokenResetHook")(js.Any.fromFunction2((t0: /* term */ typingsJapgolly.terminalKit.terminalMod.Terminal, t1: /* config */ js.UndefOr[typingsJapgolly.terminalKit.terminalMod.HookConfig]) => tokenResetHook(t0, t1).runNow()))
    __obj.asInstanceOf[InputFieldOptions]
  }
}

