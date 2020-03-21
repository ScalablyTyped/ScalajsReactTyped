package typingsJapgolly.maskedinput

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryMaskedInputOptions extends js.Object {
  var alias: js.UndefOr[String] = js.undefined
  var autoUnmask: js.UndefOr[Boolean] = js.undefined
  var clearIncomplete: js.UndefOr[Boolean] = js.undefined
  var clearMaskOnLostFocus: js.UndefOr[Boolean] = js.undefined
  var greedy: js.UndefOr[Boolean] = js.undefined
  var isComplete: js.UndefOr[js.Function2[/* buffer */ js.Any, /* options */ js.Any, js.Object]] = js.undefined
  var mask: js.UndefOr[String] = js.undefined
  var numeric: js.UndefOr[Boolean] = js.undefined
  var onBeforeMask: js.UndefOr[js.Function1[/* initialValue */ js.Any, Unit]] = js.undefined
  var onBeforePaste: js.UndefOr[js.Function1[/* pastedValue */ js.Any, Unit]] = js.undefined
  var onKeyValidation: js.UndefOr[js.Function1[/* result */ js.Any, Unit]] = js.undefined
  var onUnMask: js.UndefOr[js.Function2[/* maskedValue */ js.Any, /* unmaskedValue */ js.Any, Unit]] = js.undefined
  var oncleared: js.UndefOr[js.Function0[Unit]] = js.undefined
  var oncomplete: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.undefined
  var onincomplete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var radixPoint: js.UndefOr[String] = js.undefined
  var repeat: js.UndefOr[Double] = js.undefined
  var rightAlignNumerics: js.UndefOr[Boolean] = js.undefined
  var showMaskOnFocus: js.UndefOr[Boolean] = js.undefined
  var showMaskOnHover: js.UndefOr[Boolean] = js.undefined
  var showToolTip: js.UndefOr[Boolean] = js.undefined
  var skipOptionalPartCharacter: js.UndefOr[String] = js.undefined
}

object JQueryMaskedInputOptions {
  @scala.inline
  def apply(
    alias: String = null,
    autoUnmask: js.UndefOr[Boolean] = js.undefined,
    clearIncomplete: js.UndefOr[Boolean] = js.undefined,
    clearMaskOnLostFocus: js.UndefOr[Boolean] = js.undefined,
    greedy: js.UndefOr[Boolean] = js.undefined,
    isComplete: (/* buffer */ js.Any, /* options */ js.Any) => CallbackTo[js.Object] = null,
    mask: String = null,
    numeric: js.UndefOr[Boolean] = js.undefined,
    onBeforeMask: /* initialValue */ js.Any => Callback = null,
    onBeforePaste: /* pastedValue */ js.Any => Callback = null,
    onKeyValidation: /* result */ js.Any => Callback = null,
    onUnMask: (/* maskedValue */ js.Any, /* unmaskedValue */ js.Any) => Callback = null,
    oncleared: js.UndefOr[Callback] = js.undefined,
    oncomplete: /* value */ js.UndefOr[js.Any] => Callback = null,
    onincomplete: js.UndefOr[Callback] = js.undefined,
    placeholder: String = null,
    radixPoint: String = null,
    repeat: Int | Double = null,
    rightAlignNumerics: js.UndefOr[Boolean] = js.undefined,
    showMaskOnFocus: js.UndefOr[Boolean] = js.undefined,
    showMaskOnHover: js.UndefOr[Boolean] = js.undefined,
    showToolTip: js.UndefOr[Boolean] = js.undefined,
    skipOptionalPartCharacter: String = null
  ): JQueryMaskedInputOptions = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (!js.isUndefined(autoUnmask)) __obj.updateDynamic("autoUnmask")(autoUnmask.asInstanceOf[js.Any])
    if (!js.isUndefined(clearIncomplete)) __obj.updateDynamic("clearIncomplete")(clearIncomplete.asInstanceOf[js.Any])
    if (!js.isUndefined(clearMaskOnLostFocus)) __obj.updateDynamic("clearMaskOnLostFocus")(clearMaskOnLostFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(greedy)) __obj.updateDynamic("greedy")(greedy.asInstanceOf[js.Any])
    if (isComplete != null) __obj.updateDynamic("isComplete")(js.Any.fromFunction2((t0: /* buffer */ js.Any, t1: /* options */ js.Any) => isComplete(t0, t1).runNow()))
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (!js.isUndefined(numeric)) __obj.updateDynamic("numeric")(numeric.asInstanceOf[js.Any])
    if (onBeforeMask != null) __obj.updateDynamic("onBeforeMask")(js.Any.fromFunction1((t0: /* initialValue */ js.Any) => onBeforeMask(t0).runNow()))
    if (onBeforePaste != null) __obj.updateDynamic("onBeforePaste")(js.Any.fromFunction1((t0: /* pastedValue */ js.Any) => onBeforePaste(t0).runNow()))
    if (onKeyValidation != null) __obj.updateDynamic("onKeyValidation")(js.Any.fromFunction1((t0: /* result */ js.Any) => onKeyValidation(t0).runNow()))
    if (onUnMask != null) __obj.updateDynamic("onUnMask")(js.Any.fromFunction2((t0: /* maskedValue */ js.Any, t1: /* unmaskedValue */ js.Any) => onUnMask(t0, t1).runNow()))
    oncleared.foreach(p => __obj.updateDynamic("oncleared")(p.toJsFn))
    if (oncomplete != null) __obj.updateDynamic("oncomplete")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[js.Any]) => oncomplete(t0).runNow()))
    onincomplete.foreach(p => __obj.updateDynamic("onincomplete")(p.toJsFn))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (radixPoint != null) __obj.updateDynamic("radixPoint")(radixPoint.asInstanceOf[js.Any])
    if (repeat != null) __obj.updateDynamic("repeat")(repeat.asInstanceOf[js.Any])
    if (!js.isUndefined(rightAlignNumerics)) __obj.updateDynamic("rightAlignNumerics")(rightAlignNumerics.asInstanceOf[js.Any])
    if (!js.isUndefined(showMaskOnFocus)) __obj.updateDynamic("showMaskOnFocus")(showMaskOnFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(showMaskOnHover)) __obj.updateDynamic("showMaskOnHover")(showMaskOnHover.asInstanceOf[js.Any])
    if (!js.isUndefined(showToolTip)) __obj.updateDynamic("showToolTip")(showToolTip.asInstanceOf[js.Any])
    if (skipOptionalPartCharacter != null) __obj.updateDynamic("skipOptionalPartCharacter")(skipOptionalPartCharacter.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryMaskedInputOptions]
  }
}

