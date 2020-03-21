package typingsJapgolly.officeUiFabricReact.groupShowAllTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import org.scalajs.dom.raw.HTMLButtonElement
import typingsJapgolly.officeUiFabricReact.groupHeaderTypesMod.IGroupHeaderProps
import typingsJapgolly.officeUiFabricReact.groupedListTypesMod.IGroup
import typingsJapgolly.officeUiFabricReact.groupedListTypesMod.IGroupDividerProps
import typingsJapgolly.officeUiFabricReact.withViewportMod.IViewport
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import typingsJapgolly.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGroupShowAllProps extends IGroupDividerProps {
  /**
    * Style function to be passed in to override the themed or default styles
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IGroupShowAllStyleProps, IGroupShowAllStyles]] = js.undefined
}

object IGroupShowAllProps {
  @scala.inline
  def apply(
    className: String = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    componentRef: IRefObject[js.Object] = null,
    expandButtonProps: HTMLAttributes[HTMLButtonElement] = null,
    footerText: String = null,
    group: IGroup = null,
    groupIndex: Int | Double = null,
    groupLevel: Int | Double = null,
    groups: js.Array[IGroup] = null,
    indentWidth: Int | Double = null,
    isCollapsedGroupSelectVisible: js.UndefOr[Boolean] = js.undefined,
    isGroupLoading: /* group */ IGroup => CallbackTo[Boolean] = null,
    isSelected: js.UndefOr[Boolean] = js.undefined,
    loadingText: String = null,
    onGroupHeaderClick: /* group */ IGroup => Callback = null,
    onRenderTitle: (/* props */ js.UndefOr[IGroupHeaderProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IGroupHeaderProps], Element | Null]]) => CallbackTo[Element | Null] = null,
    onToggleCollapse: /* group */ IGroup => Callback = null,
    onToggleSelectGroup: /* group */ IGroup => Callback = null,
    onToggleSummarize: /* group */ IGroup => Callback = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    selectionMode: SelectionMode = null,
    showAllLinkText: String = null,
    styles: IStyleFunctionOrObject[IGroupShowAllStyleProps, IGroupShowAllStyles] = null,
    theme: ITheme = null,
    viewport: IViewport = null
  ): IGroupShowAllProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (expandButtonProps != null) __obj.updateDynamic("expandButtonProps")(expandButtonProps.asInstanceOf[js.Any])
    if (footerText != null) __obj.updateDynamic("footerText")(footerText.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (groupIndex != null) __obj.updateDynamic("groupIndex")(groupIndex.asInstanceOf[js.Any])
    if (groupLevel != null) __obj.updateDynamic("groupLevel")(groupLevel.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (indentWidth != null) __obj.updateDynamic("indentWidth")(indentWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(isCollapsedGroupSelectVisible)) __obj.updateDynamic("isCollapsedGroupSelectVisible")(isCollapsedGroupSelectVisible.asInstanceOf[js.Any])
    if (isGroupLoading != null) __obj.updateDynamic("isGroupLoading")(js.Any.fromFunction1((t0: /* group */ typingsJapgolly.officeUiFabricReact.groupedListTypesMod.IGroup) => isGroupLoading(t0).runNow()))
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected.asInstanceOf[js.Any])
    if (loadingText != null) __obj.updateDynamic("loadingText")(loadingText.asInstanceOf[js.Any])
    if (onGroupHeaderClick != null) __obj.updateDynamic("onGroupHeaderClick")(js.Any.fromFunction1((t0: /* group */ typingsJapgolly.officeUiFabricReact.groupedListTypesMod.IGroup) => onGroupHeaderClick(t0).runNow()))
    if (onRenderTitle != null) __obj.updateDynamic("onRenderTitle")(js.Any.fromFunction2((t0: /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.groupHeaderTypesMod.IGroupHeaderProps], t1: /* defaultRender */ js.UndefOr[
  js.Function1[
    /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.groupHeaderTypesMod.IGroupHeaderProps], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]]) => onRenderTitle(t0, t1).runNow()))
    if (onToggleCollapse != null) __obj.updateDynamic("onToggleCollapse")(js.Any.fromFunction1((t0: /* group */ typingsJapgolly.officeUiFabricReact.groupedListTypesMod.IGroup) => onToggleCollapse(t0).runNow()))
    if (onToggleSelectGroup != null) __obj.updateDynamic("onToggleSelectGroup")(js.Any.fromFunction1((t0: /* group */ typingsJapgolly.officeUiFabricReact.groupedListTypesMod.IGroup) => onToggleSelectGroup(t0).runNow()))
    if (onToggleSummarize != null) __obj.updateDynamic("onToggleSummarize")(js.Any.fromFunction1((t0: /* group */ typingsJapgolly.officeUiFabricReact.groupedListTypesMod.IGroup) => onToggleSummarize(t0).runNow()))
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (showAllLinkText != null) __obj.updateDynamic("showAllLinkText")(showAllLinkText.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (viewport != null) __obj.updateDynamic("viewport")(viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGroupShowAllProps]
  }
}

