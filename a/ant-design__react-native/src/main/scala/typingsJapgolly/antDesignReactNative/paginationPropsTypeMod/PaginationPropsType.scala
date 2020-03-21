package typingsJapgolly.antDesignReactNative.paginationPropsTypeMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.button
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.number
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.pointer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationPropsType extends js.Object {
  var current: Double
  var mode: js.UndefOr[button | number | pointer] = js.undefined
  var nextText: js.UndefOr[String] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* current */ Double, Unit]] = js.undefined
  var onNext: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPrev: js.UndefOr[js.Function0[Unit]] = js.undefined
  var prevText: js.UndefOr[String] = js.undefined
  var simple: js.UndefOr[Boolean] = js.undefined
  var total: Double
}

object PaginationPropsType {
  @scala.inline
  def apply(
    current: Double,
    total: Double,
    mode: button | number | pointer = null,
    nextText: String = null,
    onChange: /* current */ Double => Callback = null,
    onNext: js.UndefOr[Callback] = js.undefined,
    onPrev: js.UndefOr[Callback] = js.undefined,
    prevText: String = null,
    simple: js.UndefOr[Boolean] = js.undefined
  ): PaginationPropsType = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (nextText != null) __obj.updateDynamic("nextText")(nextText.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* current */ scala.Double) => onChange(t0).runNow()))
    onNext.foreach(p => __obj.updateDynamic("onNext")(p.toJsFn))
    onPrev.foreach(p => __obj.updateDynamic("onPrev")(p.toJsFn))
    if (prevText != null) __obj.updateDynamic("prevText")(prevText.asInstanceOf[js.Any])
    if (!js.isUndefined(simple)) __obj.updateDynamic("simple")(simple.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationPropsType]
  }
}

