package typingsJapgolly.baseui.paginationMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.baseui.AnonEventAny
import typingsJapgolly.baseui.AnonNextPage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationProps extends Callbacks {
  var currentPage: Double
  var labels: js.UndefOr[Labels] = js.undefined
  var numPages: Double
  var overrides: js.UndefOr[PaginationOverrides] = js.undefined
}

object PaginationProps {
  @scala.inline
  def apply(
    currentPage: Double,
    numPages: Double,
    labels: Labels = null,
    onNextClick: /* args */ AnonEventAny => CallbackTo[js.Any] = null,
    onPageChange: /* args */ AnonNextPage => CallbackTo[js.Any] = null,
    onPrevClick: /* args */ AnonEventAny => CallbackTo[js.Any] = null,
    overrides: PaginationOverrides = null
  ): PaginationProps = {
    val __obj = js.Dynamic.literal(currentPage = currentPage.asInstanceOf[js.Any], numPages = numPages.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (onNextClick != null) __obj.updateDynamic("onNextClick")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.baseui.AnonEventAny) => onNextClick(t0).runNow()))
    if (onPageChange != null) __obj.updateDynamic("onPageChange")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.baseui.AnonNextPage) => onPageChange(t0).runNow()))
    if (onPrevClick != null) __obj.updateDynamic("onPrevClick")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.baseui.AnonEventAny) => onPrevClick(t0).runNow()))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationProps]
  }
}

