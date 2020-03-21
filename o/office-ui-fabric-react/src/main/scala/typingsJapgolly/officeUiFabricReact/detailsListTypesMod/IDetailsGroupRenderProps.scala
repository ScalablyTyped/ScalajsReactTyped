package typingsJapgolly.officeUiFabricReact.detailsListTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.officeUiFabricReact.groupFooterTypesMod.IGroupFooterProps
import typingsJapgolly.officeUiFabricReact.groupHeaderTypesMod.IGroupHeaderProps
import typingsJapgolly.officeUiFabricReact.groupShowAllTypesMod.IGroupShowAllProps
import typingsJapgolly.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility
import typingsJapgolly.officeUiFabricReact.groupedListTypesMod.IGroup
import typingsJapgolly.officeUiFabricReact.groupedListTypesMod.IGroupRenderProps
import typingsJapgolly.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDetailsGroupRenderProps extends IGroupRenderProps {
  @JSName("onRenderFooter")
  var onRenderFooter_IDetailsGroupRenderProps: js.UndefOr[IRenderFunction[IDetailsGroupDividerProps]] = js.undefined
  @JSName("onRenderHeader")
  var onRenderHeader_IDetailsGroupRenderProps: js.UndefOr[IRenderFunction[IDetailsGroupDividerProps]] = js.undefined
}

object IDetailsGroupRenderProps {
  @scala.inline
  def apply(
    collapseAllVisibility: CollapseAllVisibility = null,
    footerProps: IGroupFooterProps = null,
    getGroupItemLimit: /* group */ IGroup => CallbackTo[Double] = null,
    headerProps: IGroupHeaderProps = null,
    isAllGroupsCollapsed: js.UndefOr[Boolean] = js.undefined,
    onRenderFooter: (/* props */ js.UndefOr[IDetailsGroupDividerProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDetailsGroupDividerProps], Element | Null]]) => CallbackTo[Element | Null] = null,
    onRenderHeader: (/* props */ js.UndefOr[IDetailsGroupDividerProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDetailsGroupDividerProps], Element | Null]]) => CallbackTo[Element | Null] = null,
    onRenderShowAll: (/* props */ js.UndefOr[IGroupShowAllProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IGroupShowAllProps], Element | Null]]) => CallbackTo[Element | Null] = null,
    onToggleCollapseAll: /* isAllCollapsed */ Boolean => Callback = null,
    role: String = null,
    showAllProps: IGroupShowAllProps = null,
    showEmptyGroups: js.UndefOr[Boolean] = js.undefined
  ): IDetailsGroupRenderProps = {
    val __obj = js.Dynamic.literal()
    if (collapseAllVisibility != null) __obj.updateDynamic("collapseAllVisibility")(collapseAllVisibility.asInstanceOf[js.Any])
    if (footerProps != null) __obj.updateDynamic("footerProps")(footerProps.asInstanceOf[js.Any])
    if (getGroupItemLimit != null) __obj.updateDynamic("getGroupItemLimit")(js.Any.fromFunction1((t0: /* group */ typingsJapgolly.officeUiFabricReact.groupedListTypesMod.IGroup) => getGroupItemLimit(t0).runNow()))
    if (headerProps != null) __obj.updateDynamic("headerProps")(headerProps.asInstanceOf[js.Any])
    if (!js.isUndefined(isAllGroupsCollapsed)) __obj.updateDynamic("isAllGroupsCollapsed")(isAllGroupsCollapsed.asInstanceOf[js.Any])
    if (onRenderFooter != null) __obj.updateDynamic("onRenderFooter")(js.Any.fromFunction2((t0: /* props */ js.UndefOr[
  typingsJapgolly.officeUiFabricReact.detailsListTypesMod.IDetailsGroupDividerProps], t1: /* defaultRender */ js.UndefOr[
  js.Function1[
    /* props */ js.UndefOr[
      typingsJapgolly.officeUiFabricReact.detailsListTypesMod.IDetailsGroupDividerProps
    ], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]]) => onRenderFooter(t0, t1).runNow()))
    if (onRenderHeader != null) __obj.updateDynamic("onRenderHeader")(js.Any.fromFunction2((t0: /* props */ js.UndefOr[
  typingsJapgolly.officeUiFabricReact.detailsListTypesMod.IDetailsGroupDividerProps], t1: /* defaultRender */ js.UndefOr[
  js.Function1[
    /* props */ js.UndefOr[
      typingsJapgolly.officeUiFabricReact.detailsListTypesMod.IDetailsGroupDividerProps
    ], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]]) => onRenderHeader(t0, t1).runNow()))
    if (onRenderShowAll != null) __obj.updateDynamic("onRenderShowAll")(js.Any.fromFunction2((t0: /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.groupShowAllTypesMod.IGroupShowAllProps], t1: /* defaultRender */ js.UndefOr[
  js.Function1[
    /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.groupShowAllTypesMod.IGroupShowAllProps], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]]) => onRenderShowAll(t0, t1).runNow()))
    if (onToggleCollapseAll != null) __obj.updateDynamic("onToggleCollapseAll")(js.Any.fromFunction1((t0: /* isAllCollapsed */ scala.Boolean) => onToggleCollapseAll(t0).runNow()))
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (showAllProps != null) __obj.updateDynamic("showAllProps")(showAllProps.asInstanceOf[js.Any])
    if (!js.isUndefined(showEmptyGroups)) __obj.updateDynamic("showEmptyGroups")(showEmptyGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsGroupRenderProps]
  }
}

