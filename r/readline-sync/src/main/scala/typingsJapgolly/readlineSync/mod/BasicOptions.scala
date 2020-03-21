package typingsJapgolly.readlineSync.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicOptions extends js.Object {
  var bufferSize: js.UndefOr[Double] = js.undefined
  var cancel: js.UndefOr[js.Any] = js.undefined
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  var cd: js.UndefOr[Boolean] = js.undefined
  var charlist: js.UndefOr[String] = js.undefined
  var confirmMessage: js.UndefOr[js.Any] = js.undefined
  var create: js.UndefOr[Boolean] = js.undefined
  var defaultInput: js.UndefOr[String] = js.undefined
  var encoding: js.UndefOr[String] = js.undefined
  var exists: js.UndefOr[js.Any] = js.undefined
  var falseValue: js.UndefOr[OptionType | js.Array[OptionType]] = js.undefined
  var guide: js.UndefOr[Boolean] = js.undefined
  var hideEchoBack: js.UndefOr[Boolean] = js.undefined
  var history: js.UndefOr[Boolean] = js.undefined
  var isDirectory: js.UndefOr[Boolean] = js.undefined
  var isFile: js.UndefOr[Boolean] = js.undefined
  var keepWhitespace: js.UndefOr[Boolean] = js.undefined
  var limit: js.UndefOr[OptionType | js.Array[OptionType]] = js.undefined
  var limitMessage: js.UndefOr[String] = js.undefined
  var mask: js.UndefOr[String] = js.undefined
  var max: js.UndefOr[js.Any] = js.undefined
  var min: js.UndefOr[js.Any] = js.undefined
  var print: js.UndefOr[js.Function2[/* display */ String, /* encoding */ String, Unit]] = js.undefined
  var prompt: js.UndefOr[js.Any] = js.undefined
  var trueValue: js.UndefOr[OptionType | js.Array[OptionType]] = js.undefined
  var unmatchMessage: js.UndefOr[js.Any] = js.undefined
  var validate: js.UndefOr[js.Function1[/* path */ String, Boolean | String]] = js.undefined
}

object BasicOptions {
  @scala.inline
  def apply(
    bufferSize: Int | Double = null,
    cancel: js.Any = null,
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    cd: js.UndefOr[Boolean] = js.undefined,
    charlist: String = null,
    confirmMessage: js.Any = null,
    create: js.UndefOr[Boolean] = js.undefined,
    defaultInput: String = null,
    encoding: String = null,
    exists: js.Any = null,
    falseValue: OptionType | js.Array[OptionType] = null,
    guide: js.UndefOr[Boolean] = js.undefined,
    hideEchoBack: js.UndefOr[Boolean] = js.undefined,
    history: js.UndefOr[Boolean] = js.undefined,
    isDirectory: js.UndefOr[Boolean] = js.undefined,
    isFile: js.UndefOr[Boolean] = js.undefined,
    keepWhitespace: js.UndefOr[Boolean] = js.undefined,
    limit: OptionType | js.Array[OptionType] = null,
    limitMessage: String = null,
    mask: String = null,
    max: js.Any = null,
    min: js.Any = null,
    print: (/* display */ String, /* encoding */ String) => Callback = null,
    prompt: js.Any = null,
    trueValue: OptionType | js.Array[OptionType] = null,
    unmatchMessage: js.Any = null,
    validate: /* path */ String => CallbackTo[Boolean | String] = null
  ): BasicOptions = {
    val __obj = js.Dynamic.literal()
    if (bufferSize != null) __obj.updateDynamic("bufferSize")(bufferSize.asInstanceOf[js.Any])
    if (cancel != null) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.asInstanceOf[js.Any])
    if (!js.isUndefined(cd)) __obj.updateDynamic("cd")(cd.asInstanceOf[js.Any])
    if (charlist != null) __obj.updateDynamic("charlist")(charlist.asInstanceOf[js.Any])
    if (confirmMessage != null) __obj.updateDynamic("confirmMessage")(confirmMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(create)) __obj.updateDynamic("create")(create.asInstanceOf[js.Any])
    if (defaultInput != null) __obj.updateDynamic("defaultInput")(defaultInput.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (exists != null) __obj.updateDynamic("exists")(exists.asInstanceOf[js.Any])
    if (falseValue != null) __obj.updateDynamic("falseValue")(falseValue.asInstanceOf[js.Any])
    if (!js.isUndefined(guide)) __obj.updateDynamic("guide")(guide.asInstanceOf[js.Any])
    if (!js.isUndefined(hideEchoBack)) __obj.updateDynamic("hideEchoBack")(hideEchoBack.asInstanceOf[js.Any])
    if (!js.isUndefined(history)) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    if (!js.isUndefined(isDirectory)) __obj.updateDynamic("isDirectory")(isDirectory.asInstanceOf[js.Any])
    if (!js.isUndefined(isFile)) __obj.updateDynamic("isFile")(isFile.asInstanceOf[js.Any])
    if (!js.isUndefined(keepWhitespace)) __obj.updateDynamic("keepWhitespace")(keepWhitespace.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (limitMessage != null) __obj.updateDynamic("limitMessage")(limitMessage.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (print != null) __obj.updateDynamic("print")(js.Any.fromFunction2((t0: /* display */ java.lang.String, t1: /* encoding */ java.lang.String) => print(t0, t1).runNow()))
    if (prompt != null) __obj.updateDynamic("prompt")(prompt.asInstanceOf[js.Any])
    if (trueValue != null) __obj.updateDynamic("trueValue")(trueValue.asInstanceOf[js.Any])
    if (unmatchMessage != null) __obj.updateDynamic("unmatchMessage")(unmatchMessage.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction1((t0: /* path */ java.lang.String) => validate(t0).runNow()))
    __obj.asInstanceOf[BasicOptions]
  }
}

