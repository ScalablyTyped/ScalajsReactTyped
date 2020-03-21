package typingsJapgolly.primereact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.primereact.paginatorMod.PageState
import typingsJapgolly.primereact.paginatorMod.PaginatorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Paginator {
  def apply(
    alwaysShow: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    currentPageReportTemplate: String = null,
    first: Int | Double = null,
    leftContent: VdomElement = null,
    onPageChange: /* event */ PageState => Callback = null,
    pageLinkSize: Int | Double = null,
    rightContent: VdomElement = null,
    rows: Int | Double = null,
    rowsPerPageOptions: js.Array[_] = null,
    style: js.Object = null,
    template: String = null,
    totalRecords: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    PaginatorProps, 
    typingsJapgolly.primereact.primereactPaginatorMod.Paginator, 
    Unit, 
    PaginatorProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(alwaysShow)) __obj.updateDynamic("alwaysShow")(alwaysShow.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (currentPageReportTemplate != null) __obj.updateDynamic("currentPageReportTemplate")(currentPageReportTemplate.asInstanceOf[js.Any])
    if (first != null) __obj.updateDynamic("first")(first.asInstanceOf[js.Any])
    if (leftContent != null) __obj.updateDynamic("leftContent")(leftContent.rawElement.asInstanceOf[js.Any])
    if (onPageChange != null) __obj.updateDynamic("onPageChange")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.primereact.paginatorMod.PageState) => onPageChange(t0).runNow()))
    if (pageLinkSize != null) __obj.updateDynamic("pageLinkSize")(pageLinkSize.asInstanceOf[js.Any])
    if (rightContent != null) __obj.updateDynamic("rightContent")(rightContent.rawElement.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (rowsPerPageOptions != null) __obj.updateDynamic("rowsPerPageOptions")(rowsPerPageOptions.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (totalRecords != null) __obj.updateDynamic("totalRecords")(totalRecords.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.primereact.paginatorMod.PaginatorProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.primereact.primereactPaginatorMod.Paginator](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.primereact.paginatorMod.PaginatorProps])(children: _*)
  }
  @JSImport("primereact/paginator", "Paginator")
  @js.native
  object componentImport extends js.Object
  
}

