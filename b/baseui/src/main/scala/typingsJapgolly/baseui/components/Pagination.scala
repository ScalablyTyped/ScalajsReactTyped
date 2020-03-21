package typingsJapgolly.baseui.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.baseui.AnonEventAny
import typingsJapgolly.baseui.AnonNextPage
import typingsJapgolly.baseui.paginationMod.Labels
import typingsJapgolly.baseui.paginationMod.PaginationOverrides
import typingsJapgolly.baseui.paginationMod.PaginationProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Pagination {
  def apply(
    currentPage: Double,
    numPages: Double,
    labels: Labels = null,
    onNextClick: /* args */ AnonEventAny => CallbackTo[js.Any] = null,
    onPageChange: /* args */ AnonNextPage => CallbackTo[js.Any] = null,
    onPrevClick: /* args */ AnonEventAny => CallbackTo[js.Any] = null,
    overrides: PaginationOverrides = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    PaginationProps, 
    typingsJapgolly.baseui.paginationMod.Pagination, 
    Unit, 
    PaginationProps
  ] = {
    val __obj = js.Dynamic.literal(currentPage = currentPage.asInstanceOf[js.Any], numPages = numPages.asInstanceOf[js.Any])
  
      if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (onNextClick != null) __obj.updateDynamic("onNextClick")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.baseui.AnonEventAny) => onNextClick(t0).runNow()))
    if (onPageChange != null) __obj.updateDynamic("onPageChange")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.baseui.AnonNextPage) => onPageChange(t0).runNow()))
    if (onPrevClick != null) __obj.updateDynamic("onPrevClick")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.baseui.AnonEventAny) => onPrevClick(t0).runNow()))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.baseui.paginationMod.PaginationProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.baseui.paginationMod.Pagination](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.baseui.paginationMod.PaginationProps])(children: _*)
  }
  @JSImport("baseui/pagination", "Pagination")
  @js.native
  object componentImport extends js.Object
  
}

