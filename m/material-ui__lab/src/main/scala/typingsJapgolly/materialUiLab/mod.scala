package typingsJapgolly.materialUiLab

import typingsJapgolly.materialUiCore.buttonBaseButtonBaseMod.ButtonBaseTypeMap
import typingsJapgolly.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBase
import typingsJapgolly.materialUiCore.overridableComponentMod.OverridableComponent
import typingsJapgolly.materialUiLab.alertAlertMod.AlertProps
import typingsJapgolly.materialUiLab.alertTitleAlertTitleMod.AlertTitleProps
import typingsJapgolly.materialUiLab.anon.AnchorEl
import typingsJapgolly.materialUiLab.autocompleteAutocompleteMod.AutocompleteProps
import typingsJapgolly.materialUiLab.avatarGroupAvatarGroupMod.AvatarGroupProps
import typingsJapgolly.materialUiLab.materialUiLabStrings.button
import typingsJapgolly.materialUiLab.materialUiLabStrings.div
import typingsJapgolly.materialUiLab.materialUiLabStrings.span
import typingsJapgolly.materialUiLab.paginationItemPaginationItemMod.PaginationItemTypeMap
import typingsJapgolly.materialUiLab.paginationPaginationMod.PaginationProps
import typingsJapgolly.materialUiLab.paginationUsePaginationMod.UsePaginationProps
import typingsJapgolly.materialUiLab.paginationUsePaginationMod.UsePaginationResult
import typingsJapgolly.materialUiLab.ratingRatingMod.RatingProps
import typingsJapgolly.materialUiLab.skeletonSkeletonMod.SkeletonTypeMap
import typingsJapgolly.materialUiLab.speedDialActionSpeedDialActionMod.SpeedDialActionProps
import typingsJapgolly.materialUiLab.speedDialIconSpeedDialIconMod.SpeedDialIconProps
import typingsJapgolly.materialUiLab.speedDialSpeedDialMod.SpeedDialProps
import typingsJapgolly.materialUiLab.tabContextTabContextMod.TabContextProps
import typingsJapgolly.materialUiLab.tabContextTabContextMod.TabContextValue
import typingsJapgolly.materialUiLab.tabListTabListMod.TabListTypeMap
import typingsJapgolly.materialUiLab.tabPanelTabPanelMod.TabPanelProps
import typingsJapgolly.materialUiLab.timelineConnectorTimelineConnectorMod.TimelineConnectorProps
import typingsJapgolly.materialUiLab.timelineContentTimelineContentMod.TimelineContentProps
import typingsJapgolly.materialUiLab.timelineDotTimelineDotMod.TimelineDotProps
import typingsJapgolly.materialUiLab.timelineItemTimelineItemMod.TimelineItemProps
import typingsJapgolly.materialUiLab.timelineOppositeContentTimelineOppositeContentMod.TimelineOppositeContentProps
import typingsJapgolly.materialUiLab.timelineSeparatorTimelineSeparatorMod.TimelineSeparatorProps
import typingsJapgolly.materialUiLab.timelineTimelineMod.TimelineProps
import typingsJapgolly.materialUiLab.toggleButtonGroupToggleButtonGroupMod.ToggleButtonGroupProps
import typingsJapgolly.materialUiLab.toggleButtonToggleButtonMod.ToggleButtonTypeMap
import typingsJapgolly.materialUiLab.treeItemTreeItemMod.TreeItemProps
import typingsJapgolly.materialUiLab.treeViewTreeViewMod.TreeViewProps
import typingsJapgolly.materialUiLab.useAutocompleteUseAutocompleteMod.CreateFilterOptionsConfig
import typingsJapgolly.materialUiLab.useAutocompleteUseAutocompleteMod.FilterOptionsState
import typingsJapgolly.materialUiLab.useAutocompleteUseAutocompleteMod.UseAutocompleteProps
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@material-ui/lab", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T, Multiple /* <: js.UndefOr[Boolean] */, DisableClearable /* <: js.UndefOr[Boolean] */, FreeSolo /* <: js.UndefOr[Boolean] */](props: UseAutocompleteProps[T, Multiple, DisableClearable, FreeSolo]): AnchorEl[T, Multiple, DisableClearable, FreeSolo] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[AnchorEl[T, Multiple, DisableClearable, FreeSolo]]
  
  inline def Alert(props: AlertProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Alert")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def AlertTitle(props: AlertTitleProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("AlertTitle")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def Autocomplete[T, Multiple /* <: js.UndefOr[Boolean] */, DisableClearable /* <: js.UndefOr[Boolean] */, FreeSolo /* <: js.UndefOr[Boolean] */](props: AutocompleteProps[T, Multiple, DisableClearable, FreeSolo]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Autocomplete")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def AvatarGroup(props: AvatarGroupProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("AvatarGroup")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def Pagination(props: PaginationProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Pagination")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  inline def Pagination(props: UsePaginationProps): UsePaginationResult = ^.asInstanceOf[js.Dynamic].applyDynamic("Pagination")(props.asInstanceOf[js.Any]).asInstanceOf[UsePaginationResult]
  
  /**
    *
    * Demos:
    *
    * - [Pagination](https://mui.com/components/pagination/)
    *
    * API:
    *
    * - [PaginationItem API](https://mui.com/api/pagination-item/)
    */
  @JSImport("@material-ui/lab", "PaginationItem")
  @js.native
  val PaginationItem: OverridableComponent[PaginationItemTypeMap[js.Object, div]] = js.native
  
  inline def Rating(props: RatingProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Rating")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /**
    *
    * Demos:
    *
    * - [Skeleton](https://mui.com/components/skeleton/)
    *
    * API:
    *
    * - [Skeleton API](https://mui.com/api/skeleton/)
    */
  @JSImport("@material-ui/lab", "Skeleton")
  @js.native
  val Skeleton: OverridableComponent[SkeletonTypeMap[js.Object, span]] = js.native
  
  inline def SpeedDial(props: SpeedDialProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SpeedDial")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def SpeedDialAction(props: SpeedDialActionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SpeedDialAction")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def SpeedDialIcon(props: SpeedDialIconProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SpeedDialIcon")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def TabContext(props: TabContextProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TabContext")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /**
    *
    * Demos:
    *
    * - [Tabs](https://mui.com/components/tabs/)
    *
    * API:
    *
    * - [TabList API](https://mui.com/api/tab-list/)
    * - inherits [Tabs API](https://mui.com/api/tabs/)
    */
  @JSImport("@material-ui/lab", "TabList")
  @js.native
  val TabList: OverridableComponent[
    TabListTypeMap[js.Object, ExtendButtonBase[ButtonBaseTypeMap[js.Object, button]]]
  ] = js.native
  
  inline def TabPanel(props: TabPanelProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TabPanel")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def Timeline(props: TimelineProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Timeline")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def TimelineConnector(props: TimelineConnectorProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TimelineConnector")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def TimelineContent(props: TimelineContentProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TimelineContent")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def TimelineDot(props: TimelineDotProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TimelineDot")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def TimelineItem(props: TimelineItemProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TimelineItem")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def TimelineOppositeContent(props: TimelineOppositeContentProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TimelineOppositeContent")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def TimelineSeparator(props: TimelineSeparatorProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TimelineSeparator")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /**
    *
    * Demos:
    *
    * - [Toggle Button](https://mui.com/components/toggle-button/)
    *
    * API:
    *
    * - [ToggleButton API](https://mui.com/api/toggle-button/)
    * - inherits [ButtonBase API](https://mui.com/api/button-base/)
    */
  @JSImport("@material-ui/lab", "ToggleButton")
  @js.native
  val ToggleButton: ExtendButtonBase[ToggleButtonTypeMap[js.Object, button]] = js.native
  
  inline def ToggleButtonGroup(props: ToggleButtonGroupProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ToggleButtonGroup")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def TreeItem(props: TreeItemProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TreeItem")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def TreeView(props: TreeViewProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TreeView")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def createFilterOptions[T](): js.Function2[/* options */ js.Array[T], /* state */ FilterOptionsState[T], js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFilterOptions")().asInstanceOf[js.Function2[/* options */ js.Array[T], /* state */ FilterOptionsState[T], js.Array[T]]]
  inline def createFilterOptions[T](config: CreateFilterOptionsConfig[T]): js.Function2[/* options */ js.Array[T], /* state */ FilterOptionsState[T], js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFilterOptions")(config.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* options */ js.Array[T], /* state */ FilterOptionsState[T], js.Array[T]]]
  
  inline def getPanelId(context: TabContextValue, tabValue: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getPanelId")(context.asInstanceOf[js.Any], tabValue.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getTabId(context: TabContextValue, tabValue: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getTabId")(context.asInstanceOf[js.Any], tabValue.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def useAutocomplete[T, Multiple /* <: js.UndefOr[Boolean] */, DisableClearable /* <: js.UndefOr[Boolean] */, FreeSolo /* <: js.UndefOr[Boolean] */](props: UseAutocompleteProps[T, Multiple, DisableClearable, FreeSolo]): AnchorEl[T, Multiple, DisableClearable, FreeSolo] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAutocomplete")(props.asInstanceOf[js.Any]).asInstanceOf[AnchorEl[T, Multiple, DisableClearable, FreeSolo]]
  
  inline def usePagination(props: UsePaginationProps): UsePaginationResult = ^.asInstanceOf[js.Dynamic].applyDynamic("usePagination")(props.asInstanceOf[js.Any]).asInstanceOf[UsePaginationResult]
  
  inline def useTabContext(): TabContextValue | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useTabContext")().asInstanceOf[TabContextValue | Null]
}
