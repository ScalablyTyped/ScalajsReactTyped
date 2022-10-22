package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fluentuiTheme.libTypesIthemeMod.ITheme
import typingsJapgolly.officeUiFabricReact.libComponentsGroupedListGroupHeaderDottypesMod.IGroupHeaderProps
import typingsJapgolly.officeUiFabricReact.libComponentsGroupedListGroupShowAllDottypesMod.IGroupShowAllStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsGroupedListGroupShowAllDottypesMod.IGroupShowAllStyles
import typingsJapgolly.officeUiFabricReact.libComponentsGroupedListGroupedListDottypesMod.IGroup
import typingsJapgolly.officeUiFabricReact.libUtilitiesDecoratorsWithViewportMod.IViewport
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typingsJapgolly.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricUtilities.libCreateRefMod.IRefObject
import typingsJapgolly.uifabricUtilities.libSelectionSelectionDottypesMod.SelectionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_IGroupShowAllProps910745868 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def ariaColSpan(value: Double): this.type = set("ariaColSpan", value.asInstanceOf[js.Any])
  
  inline def ariaPosInSet(value: Double): this.type = set("ariaPosInSet", value.asInstanceOf[js.Any])
  
  inline def ariaRowCount(value: Double): this.type = set("ariaRowCount", value.asInstanceOf[js.Any])
  
  inline def ariaRowIndex(value: Double): this.type = set("ariaRowIndex", value.asInstanceOf[js.Any])
  
  inline def ariaSetSize(value: Double): this.type = set("ariaSetSize", value.asInstanceOf[js.Any])
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def compact(value: Boolean): this.type = set("compact", value.asInstanceOf[js.Any])
  
  inline def componentRef(value: IRefObject[js.Object]): this.type = set("componentRef", value.asInstanceOf[js.Any])
  
  inline def componentRefFunction1(value: /* ref */ js.Object | Null => Callback): this.type = set("componentRef", js.Any.fromFunction1((t0: /* ref */ js.Object | Null) => value(t0).runNow()))
  
  inline def expandButtonProps(value: HTMLAttributes[HTMLButtonElement]): this.type = set("expandButtonProps", value.asInstanceOf[js.Any])
  
  inline def footerText(value: String): this.type = set("footerText", value.asInstanceOf[js.Any])
  
  inline def group(value: IGroup): this.type = set("group", value.asInstanceOf[js.Any])
  
  inline def groupIndex(value: Double): this.type = set("groupIndex", value.asInstanceOf[js.Any])
  
  inline def groupLevel(value: Double): this.type = set("groupLevel", value.asInstanceOf[js.Any])
  
  inline def groups(value: js.Array[IGroup]): this.type = set("groups", value.asInstanceOf[js.Any])
  
  inline def groupsVarargs(value: IGroup*): this.type = set("groups", js.Array(value*))
  
  inline def indentWidth(value: Double): this.type = set("indentWidth", value.asInstanceOf[js.Any])
  
  inline def isCollapsedGroupSelectVisible(value: Boolean): this.type = set("isCollapsedGroupSelectVisible", value.asInstanceOf[js.Any])
  
  inline def isGroupLoading(value: /* group */ IGroup => Boolean): this.type = set("isGroupLoading", js.Any.fromFunction1(value))
  
  inline def isSelected(value: Boolean): this.type = set("isSelected", value.asInstanceOf[js.Any])
  
  inline def loadingText(value: String): this.type = set("loadingText", value.asInstanceOf[js.Any])
  
  inline def onGroupHeaderClick(value: /* group */ IGroup => Callback): this.type = set("onGroupHeaderClick", js.Any.fromFunction1((t0: /* group */ IGroup) => value(t0).runNow()))
  
  inline def onGroupHeaderKeyUp(value: (/* ev */ ReactKeyboardEventFrom[HTMLElement], /* group */ IGroup) => Callback): this.type = set("onGroupHeaderKeyUp", js.Any.fromFunction2((t0: /* ev */ ReactKeyboardEventFrom[HTMLElement], t1: /* group */ IGroup) => (value(t0, t1)).runNow()))
  
  inline def onRenderName(
    value: (/* props */ js.UndefOr[IGroupHeaderProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IGroupHeaderProps], Element | Null]]) => Element | Null
  ): this.type = set("onRenderName", js.Any.fromFunction2(value))
  
  inline def onRenderTitle(
    value: (/* props */ js.UndefOr[IGroupHeaderProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IGroupHeaderProps], Element | Null]]) => Element | Null
  ): this.type = set("onRenderTitle", js.Any.fromFunction2(value))
  
  inline def onToggleCollapse(value: /* group */ IGroup => Callback): this.type = set("onToggleCollapse", js.Any.fromFunction1((t0: /* group */ IGroup) => value(t0).runNow()))
  
  inline def onToggleSelectGroup(value: /* group */ IGroup => Callback): this.type = set("onToggleSelectGroup", js.Any.fromFunction1((t0: /* group */ IGroup) => value(t0).runNow()))
  
  inline def onToggleSummarize(value: /* group */ IGroup => Callback): this.type = set("onToggleSummarize", js.Any.fromFunction1((t0: /* group */ IGroup) => value(t0).runNow()))
  
  inline def selected(value: Boolean): this.type = set("selected", value.asInstanceOf[js.Any])
  
  inline def selectionMode(value: SelectionMode): this.type = set("selectionMode", value.asInstanceOf[js.Any])
  
  inline def showAllLinkText(value: String): this.type = set("showAllLinkText", value.asInstanceOf[js.Any])
  
  inline def styles(value: IStyleFunctionOrObject[IGroupShowAllStyleProps, IGroupShowAllStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
  
  inline def stylesFunction1(value: IGroupShowAllStyleProps => DeepPartial[IGroupShowAllStyles]): this.type = set("styles", js.Any.fromFunction1(value))
  
  inline def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
  
  inline def viewport(value: IViewport): this.type = set("viewport", value.asInstanceOf[js.Any])
}
