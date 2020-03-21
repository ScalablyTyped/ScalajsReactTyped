package typingsJapgolly.reactJsPagination.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactJsPagination.mod.ReactJsPaginationProps
import typingsJapgolly.reactJsPagination.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactJsPagination {
  def apply(
    activePage: Double,
    totalItemsCount: Double,
    onChange: Double => Callback,
    activeClass: String = null,
    activeLinkClass: String = null,
    disabledClass: String = null,
    firstPageText: String | Element = null,
    getPageUrl: /* pageNumber */ Double => CallbackTo[String] = null,
    hideDisabled: js.UndefOr[Boolean] = js.undefined,
    hideFirstLastPages: js.UndefOr[Boolean] = js.undefined,
    hideNavigation: js.UndefOr[Boolean] = js.undefined,
    innerClass: String = null,
    itemClass: String = null,
    itemClassFirst: String = null,
    itemClassLast: String = null,
    itemClassNext: String = null,
    itemClassPrev: String = null,
    itemsCountPerPage: Int | Double = null,
    lastPageText: String | Element = null,
    linkClass: String = null,
    linkClassFirst: String = null,
    linkClassLast: String = null,
    linkClassNext: String = null,
    linkClassPrev: String = null,
    nextPageText: String | Element = null,
    pageRangeDisplayed: Int | Double = null,
    prevPageText: String | Element = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ReactJsPaginationProps, default, Unit, ReactJsPaginationProps] = {
    val __obj = js.Dynamic.literal(activePage = activePage.asInstanceOf[js.Any], totalItemsCount = totalItemsCount.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: scala.Double) => onChange(t0).runNow()))
    if (activeClass != null) __obj.updateDynamic("activeClass")(activeClass.asInstanceOf[js.Any])
    if (activeLinkClass != null) __obj.updateDynamic("activeLinkClass")(activeLinkClass.asInstanceOf[js.Any])
    if (disabledClass != null) __obj.updateDynamic("disabledClass")(disabledClass.asInstanceOf[js.Any])
    if (firstPageText != null) __obj.updateDynamic("firstPageText")(firstPageText.asInstanceOf[js.Any])
    if (getPageUrl != null) __obj.updateDynamic("getPageUrl")(js.Any.fromFunction1((t0: /* pageNumber */ scala.Double) => getPageUrl(t0).runNow()))
    if (!js.isUndefined(hideDisabled)) __obj.updateDynamic("hideDisabled")(hideDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(hideFirstLastPages)) __obj.updateDynamic("hideFirstLastPages")(hideFirstLastPages.asInstanceOf[js.Any])
    if (!js.isUndefined(hideNavigation)) __obj.updateDynamic("hideNavigation")(hideNavigation.asInstanceOf[js.Any])
    if (innerClass != null) __obj.updateDynamic("innerClass")(innerClass.asInstanceOf[js.Any])
    if (itemClass != null) __obj.updateDynamic("itemClass")(itemClass.asInstanceOf[js.Any])
    if (itemClassFirst != null) __obj.updateDynamic("itemClassFirst")(itemClassFirst.asInstanceOf[js.Any])
    if (itemClassLast != null) __obj.updateDynamic("itemClassLast")(itemClassLast.asInstanceOf[js.Any])
    if (itemClassNext != null) __obj.updateDynamic("itemClassNext")(itemClassNext.asInstanceOf[js.Any])
    if (itemClassPrev != null) __obj.updateDynamic("itemClassPrev")(itemClassPrev.asInstanceOf[js.Any])
    if (itemsCountPerPage != null) __obj.updateDynamic("itemsCountPerPage")(itemsCountPerPage.asInstanceOf[js.Any])
    if (lastPageText != null) __obj.updateDynamic("lastPageText")(lastPageText.asInstanceOf[js.Any])
    if (linkClass != null) __obj.updateDynamic("linkClass")(linkClass.asInstanceOf[js.Any])
    if (linkClassFirst != null) __obj.updateDynamic("linkClassFirst")(linkClassFirst.asInstanceOf[js.Any])
    if (linkClassLast != null) __obj.updateDynamic("linkClassLast")(linkClassLast.asInstanceOf[js.Any])
    if (linkClassNext != null) __obj.updateDynamic("linkClassNext")(linkClassNext.asInstanceOf[js.Any])
    if (linkClassPrev != null) __obj.updateDynamic("linkClassPrev")(linkClassPrev.asInstanceOf[js.Any])
    if (nextPageText != null) __obj.updateDynamic("nextPageText")(nextPageText.asInstanceOf[js.Any])
    if (pageRangeDisplayed != null) __obj.updateDynamic("pageRangeDisplayed")(pageRangeDisplayed.asInstanceOf[js.Any])
    if (prevPageText != null) __obj.updateDynamic("prevPageText")(prevPageText.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactJsPagination.mod.ReactJsPaginationProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactJsPagination.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactJsPagination.mod.ReactJsPaginationProps])(children: _*)
  }
  @JSImport("react-js-pagination", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

