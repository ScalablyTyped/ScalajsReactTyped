package typingsJapgolly.baseui.paginationMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.baseui.AnonEventAny
import typingsJapgolly.baseui.AnonNextPage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Callbacks extends js.Object {
  var onNextClick: js.UndefOr[js.Function1[/* args */ AnonEventAny, _]] = js.undefined
  var onPageChange: js.UndefOr[js.Function1[/* args */ AnonNextPage, _]] = js.undefined
  var onPrevClick: js.UndefOr[js.Function1[/* args */ AnonEventAny, _]] = js.undefined
}

object Callbacks {
  @scala.inline
  def apply(
    onNextClick: /* args */ AnonEventAny => CallbackTo[js.Any] = null,
    onPageChange: /* args */ AnonNextPage => CallbackTo[js.Any] = null,
    onPrevClick: /* args */ AnonEventAny => CallbackTo[js.Any] = null
  ): Callbacks = {
    val __obj = js.Dynamic.literal()
    if (onNextClick != null) __obj.updateDynamic("onNextClick")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.baseui.AnonEventAny) => onNextClick(t0).runNow()))
    if (onPageChange != null) __obj.updateDynamic("onPageChange")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.baseui.AnonNextPage) => onPageChange(t0).runNow()))
    if (onPrevClick != null) __obj.updateDynamic("onPrevClick")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.baseui.AnonEventAny) => onPrevClick(t0).runNow()))
    __obj.asInstanceOf[Callbacks]
  }
}

