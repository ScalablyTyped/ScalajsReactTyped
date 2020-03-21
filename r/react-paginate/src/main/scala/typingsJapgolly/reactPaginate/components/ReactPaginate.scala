package typingsJapgolly.reactPaginate.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactPaginate.AnonSelected
import typingsJapgolly.reactPaginate.mod.ReactPaginateProps
import typingsJapgolly.reactPaginate.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactPaginate {
  def apply(
    marginPagesDisplayed: Double,
    pageCount: Double,
    pageRangeDisplayed: Double,
    activeClassName: String = null,
    activeLinkClassName: String = null,
    breakClassName: String = null,
    breakLabel: String | Node = null,
    breakLinkClassName: String = null,
    containerClassName: String = null,
    disableInitialCallback: js.UndefOr[Boolean] = js.undefined,
    disabledClassName: String = null,
    extraAriaContext: String = null,
    forcePage: Int | Double = null,
    hrefBuilder: /* pageIndex */ Double => Callback = null,
    initialPage: Int | Double = null,
    nextClassName: String = null,
    nextLabel: VdomNode = null,
    nextLinkClassName: String = null,
    onPageChange: /* selectedItem */ AnonSelected => Callback = null,
    pageClassName: String = null,
    pageLinkClassName: String = null,
    previousClassName: String = null,
    previousLabel: VdomNode = null,
    previousLinkClassName: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ReactPaginateProps, default, Unit, ReactPaginateProps] = {
    val __obj = js.Dynamic.literal(marginPagesDisplayed = marginPagesDisplayed.asInstanceOf[js.Any], pageCount = pageCount.asInstanceOf[js.Any], pageRangeDisplayed = pageRangeDisplayed.asInstanceOf[js.Any])
  
      if (activeClassName != null) __obj.updateDynamic("activeClassName")(activeClassName.asInstanceOf[js.Any])
    if (activeLinkClassName != null) __obj.updateDynamic("activeLinkClassName")(activeLinkClassName.asInstanceOf[js.Any])
    if (breakClassName != null) __obj.updateDynamic("breakClassName")(breakClassName.asInstanceOf[js.Any])
    if (breakLabel != null) __obj.updateDynamic("breakLabel")(breakLabel.asInstanceOf[js.Any])
    if (breakLinkClassName != null) __obj.updateDynamic("breakLinkClassName")(breakLinkClassName.asInstanceOf[js.Any])
    if (containerClassName != null) __obj.updateDynamic("containerClassName")(containerClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(disableInitialCallback)) __obj.updateDynamic("disableInitialCallback")(disableInitialCallback.asInstanceOf[js.Any])
    if (disabledClassName != null) __obj.updateDynamic("disabledClassName")(disabledClassName.asInstanceOf[js.Any])
    if (extraAriaContext != null) __obj.updateDynamic("extraAriaContext")(extraAriaContext.asInstanceOf[js.Any])
    if (forcePage != null) __obj.updateDynamic("forcePage")(forcePage.asInstanceOf[js.Any])
    if (hrefBuilder != null) __obj.updateDynamic("hrefBuilder")(js.Any.fromFunction1((t0: /* pageIndex */ scala.Double) => hrefBuilder(t0).runNow()))
    if (initialPage != null) __obj.updateDynamic("initialPage")(initialPage.asInstanceOf[js.Any])
    if (nextClassName != null) __obj.updateDynamic("nextClassName")(nextClassName.asInstanceOf[js.Any])
    if (nextLabel != null) __obj.updateDynamic("nextLabel")(nextLabel.rawNode.asInstanceOf[js.Any])
    if (nextLinkClassName != null) __obj.updateDynamic("nextLinkClassName")(nextLinkClassName.asInstanceOf[js.Any])
    if (onPageChange != null) __obj.updateDynamic("onPageChange")(js.Any.fromFunction1((t0: /* selectedItem */ typingsJapgolly.reactPaginate.AnonSelected) => onPageChange(t0).runNow()))
    if (pageClassName != null) __obj.updateDynamic("pageClassName")(pageClassName.asInstanceOf[js.Any])
    if (pageLinkClassName != null) __obj.updateDynamic("pageLinkClassName")(pageLinkClassName.asInstanceOf[js.Any])
    if (previousClassName != null) __obj.updateDynamic("previousClassName")(previousClassName.asInstanceOf[js.Any])
    if (previousLabel != null) __obj.updateDynamic("previousLabel")(previousLabel.rawNode.asInstanceOf[js.Any])
    if (previousLinkClassName != null) __obj.updateDynamic("previousLinkClassName")(previousLinkClassName.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactPaginate.mod.ReactPaginateProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactPaginate.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactPaginate.mod.ReactPaginateProps])(children: _*)
  }
  @JSImport("react-paginate", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

