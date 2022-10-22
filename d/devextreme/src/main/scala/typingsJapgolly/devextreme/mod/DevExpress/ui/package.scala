package typingsJapgolly.devextreme.mod.DevExpress.ui

import typingsJapgolly.devextreme.anon.AllDay
import typingsJapgolly.devextreme.mod.DevExpress.DOMComponent
import typingsJapgolly.devextreme.mod.DevExpress.DOMComponentOptions
import typingsJapgolly.devextreme.mod.DevExpress.ExternalFormat
import typingsJapgolly.devextreme.mod.DevExpress.core.template
import typingsJapgolly.devextreme.mod.DevExpress.ui.CollectionWidget.ItemLike
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxDataGrid.ColumnBase
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxDataGrid.ColumnButtonBase
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxDataGrid.Editing
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxDataGrid.EditingBase
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxDataGrid.EditingTextsBase
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxDataGrid.PagingBase
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxDataGrid.Scrolling
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxDataGrid.ScrollingBase
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxDataGrid.Selection
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxDataGrid.SelectionBase
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.EditingTexts
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.Node
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.Paging
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type CollectionWidgetItemTemplate = CollectionWidgetItem

type DataExpressionMixinItemTemplate = CollectionWidgetItem

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.devextreme.mod.DevExpress.FormatObject
  - typingsJapgolly.devextreme.mod.DevExpress.common.Format
  - java.lang.String
  - js.Function1[js.Date | scala.Double, java.lang.String]
  - typingsJapgolly.devextreme.mod.DevExpress.ExternalFormat
*/
type Format = _Format | (js.Function1[js.Date | Double, String]) | String | ExternalFormat

type GridBaseColumn[TRowData] = ColumnBase[TRowData]

type GridBaseColumnButton = ColumnButtonBase

type GridBaseEditing[TRowData, TKey] = EditingBase[TRowData, TKey]

type GridBaseEditingTexts = EditingTextsBase

type GridBasePaging = PagingBase

type GridBaseScrolling = ScrollingBase

type GridBaseSelection = SelectionBase

type HierarchicalCollectionWidget[TProperties /* <: HierarchicalCollectionWidgetOptions[Any, TItem, TKey] */, TItem /* <: ItemLike */, TKey] = CollectionWidget[TProperties, TItem, TKey]

type Template = template

type dxAccordionItemTemplate = dxAccordionItem

type dxActionSheetItemTemplate = dxActionSheetItem[Any]

type dxAutocomplete = dxDropDownList[dxAutocompleteOptions]

type dxBox[TItem /* <: typingsJapgolly.devextreme.mod.DevExpress.ui.dxBox.ItemLike[TKey] */, TKey] = CollectionWidget[dxBoxOptions[TItem, TKey], TItem, TKey]

type dxBoxItemTemplate = dxBoxItem[Any]

type dxButton = Widget[dxButtonOptions]

type dxButtonGroup = Widget[dxButtonGroupOptions]

type dxCalendar = Editor[dxCalendarOptions]

type dxColorBox = dxDropDownEditor[dxColorBoxOptions]

type dxContextMenuItemTemplate = dxContextMenuItem

type dxDataGridEditing[TRowData, TKey] = Editing[TRowData, TKey]

type dxDataGridScrolling = Scrolling

type dxDataGridSelection = Selection

type dxDeferRendering = Widget[dxDeferRenderingOptions]

type dxGalleryItemTemplate = dxGalleryItem

type dxListItemTemplate = dxListItem

type dxLoadIndicator = Widget[dxLoadIndicatorOptions]

type dxLoadPanel = dxOverlay[dxLoadPanelOptions]

type dxLookup = dxDropDownList[dxLookupOptions]

type dxMenu[TKey] = dxMenuBase[dxMenuOptions[TKey], dxMenuItem, TKey]

type dxMenuBaseItemTemplate = dxMenuBaseItem

type dxMenuItemTemplate = dxMenuItem

type dxMultiView[TProperties /* <: dxMultiViewOptions[TItem, TKey] */, TItem /* <: typingsJapgolly.devextreme.mod.DevExpress.ui.dxMultiView.ItemLike */, TKey] = CollectionWidget[TProperties, TItem, TKey]

type dxMultiViewItem = CollectionWidgetItem

type dxMultiViewItemTemplate = dxMultiViewItem

type dxNavBar[TItem /* <: typingsJapgolly.devextreme.mod.DevExpress.ui.dxNavBar.ItemLike */, TKey] = dxTabs[dxNavBarOptions[TItem, TKey], TItem, TKey]

type dxNavBarItemTemplate = dxNavBarItem

type dxNumberBox = dxTextEditor[dxNumberBoxOptions]

type dxPopup[TProperties] = dxOverlay[TProperties]

type dxProgressBar = dxTrackBar[dxProgressBarOptions]

type dxRangeSlider = dxTrackBar[dxRangeSliderOptions]

type dxRecurrenceEditor = Editor[dxRecurrenceEditorOptions]

type dxResizable = DOMComponent[dxResizableOptions]

type dxResponsiveBox[TItem /* <: typingsJapgolly.devextreme.mod.DevExpress.ui.dxResponsiveBox.ItemLike */, TKey] = CollectionWidget[dxResponsiveBoxOptions[TItem, TKey], TItem, TKey]

type dxResponsiveBoxItemTemplate = dxResponsiveBoxItem

type dxSchedulerAppointment = CollectionWidgetItem & AllDay & (Record[String, Any])

type dxSchedulerAppointmentTemplate = dxSchedulerAppointment

type dxSelectBox[TProperties] = dxDropDownList[TProperties]

type dxSlideOutItemTemplate = dxSlideOutItem

type dxSlider = dxTrackBar[dxSliderOptions]

type dxSpeedDialAction = Widget[dxSpeedDialActionOptions]

type dxSwitch = Editor[dxSwitchOptions]

type dxTabPanel[TItem /* <: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTabPanel.ItemLike */, TKey] = dxMultiView[dxTabPanelOptions[TItem, TKey], TItem, TKey]

type dxTabPanelItemTemplate = dxTabPanelItem

type dxTabs[TProperties /* <: dxTabsOptions[TItem, TKey] */, TItem /* <: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTabs.ItemLike */, TKey] = CollectionWidget[TProperties, TItem, TKey]

type dxTabsItemTemplate = dxTabsItem

type dxTagBox = dxSelectBox[dxTagBoxOptions]

type dxTextArea = dxTextBox[dxTextAreaOptions]

type dxTextBox[TProperties] = dxTextEditor[TProperties]

type dxTileViewItemTemplate = dxTileViewItem

type dxToast = dxOverlay[dxToastOptions]

type dxToolbar[TItem /* <: typingsJapgolly.devextreme.mod.DevExpress.ui.dxToolbar.ItemLike */, TKey] = CollectionWidget[dxToolbarOptions[TItem, TKey], TItem, TKey]

type dxToolbarItemTemplate = dxToolbarItem

type dxTooltip = dxPopover[dxTooltipOptions]

type dxTrackBar[TProperties] = Editor[TProperties]

type dxTreeListEditing[TRowData, TKey] = typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.Editing[TRowData, TKey]

type dxTreeListEditingTexts = EditingTexts

type dxTreeListNode[TRowData, TKey] = Node[TRowData, TKey]

type dxTreeListPaging = Paging

type dxTreeListScrolling = typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.Scrolling

type dxTreeListSelection = typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.Selection

type dxTreeViewItemTemplate = dxTreeViewItem

type dxValidationGroupOptions = DOMComponentOptions[dxValidationGroup]

type dxValidationMessage = dxOverlay[dxValidationMessageOptions]
