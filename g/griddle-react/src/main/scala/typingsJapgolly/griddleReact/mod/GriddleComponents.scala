package typingsJapgolly.griddleReact.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.griddleReact.mod.components.CellProps
import typingsJapgolly.griddleReact.mod.components.FilterProps
import typingsJapgolly.griddleReact.mod.components.RowProps
import typingsJapgolly.griddleReact.mod.components.SettingsProps
import typingsJapgolly.griddleReact.mod.components.SettingsToggleProps
import typingsJapgolly.griddleReact.mod.components.SettingsWrapperProps
import typingsJapgolly.griddleReact.mod.components.TableBodyProps
import typingsJapgolly.griddleReact.mod.components.TableHeadingCellProps
import typingsJapgolly.griddleReact.mod.components.TableHeadingProps
import typingsJapgolly.griddleReact.mod.components.TableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GriddleComponents extends js.Object {
  var Cell: js.UndefOr[GriddleComponent[CellProps]] = js.undefined
  var CellContainer: js.UndefOr[
    js.Function1[/* OriginalComponent */ GriddleComponent[CellProps], GriddleComponent[CellProps]]
  ] = js.undefined
  var CellContainerEnhancer: js.UndefOr[
    js.Function1[/* OriginalComponent */ GriddleComponent[CellProps], GriddleComponent[CellProps]]
  ] = js.undefined
  var CellEnhancer: js.UndefOr[
    js.Function1[/* OriginalComponent */ GriddleComponent[CellProps], GriddleComponent[CellProps]]
  ] = js.undefined
  var Filter: js.UndefOr[GriddleComponent[FilterProps]] = js.undefined
  var FilterContainer: js.UndefOr[
    js.Function1[
      /* OriginalComponent */ GriddleComponent[FilterProps], 
      GriddleComponent[FilterProps]
    ]
  ] = js.undefined
  var FilterContainerEnhancer: js.UndefOr[
    js.Function1[
      /* OriginalComponent */ GriddleComponent[FilterProps], 
      GriddleComponent[FilterProps]
    ]
  ] = js.undefined
  var FilterEnhancer: js.UndefOr[
    js.Function1[
      /* OriginalComponent */ GriddleComponent[FilterProps], 
      GriddleComponent[FilterProps]
    ]
  ] = js.undefined
  var Layout: js.UndefOr[GriddleComponent[_]] = js.undefined
  var LayoutContainer: js.UndefOr[js.Function1[/* OriginalComponent */ GriddleComponent[_], GriddleComponent[_]]] = js.undefined
  var LayoutContainerEnhancer: js.UndefOr[js.Function1[/* OriginalComponent */ GriddleComponent[_], GriddleComponent[_]]] = js.undefined
  var LayoutEnhancer: js.UndefOr[js.Function1[/* OriginalComponent */ GriddleComponent[_], GriddleComponent[_]]] = js.undefined
  var NextButton: js.UndefOr[GriddleComponent[_]] = js.undefined
  var NextButtonContainer: js.UndefOr[js.Function1[/* OriginalComponent */ GriddleComponent[_], GriddleComponent[_]]] = js.undefined
  var NextButtonContainerEnhancer: js.UndefOr[js.Function1[/* OriginalComponent */ GriddleComponent[_], GriddleComponent[_]]] = js.undefined
  var NextButtonEnhancer: js.UndefOr[js.Function1[/* OriginalComponent */ GriddleComponent[_], GriddleComponent[_]]] = js.undefined
  var NoResults: js.UndefOr[GriddleComponent[_]] = js.undefined
  var NoResultsContainer: js.UndefOr[js.Function1[/* OriginalComponent */ GriddleComponent[_], GriddleComponent[_]]] = js.undefined
  var NoResultsContainerEnhancer: js.UndefOr[js.Function1[/* OriginalComponent */ GriddleComponent[_], GriddleComponent[_]]] = js.undefined
  var NoResultsEnhancer: js.UndefOr[js.Function1[/* OriginalComponent */ GriddleComponent[_], GriddleComponent[_]]] = js.undefined
  var PageDropdown: js.UndefOr[GriddleComponent[_]] = js.undefined
  var PageDropdownContainer: js.UndefOr[js.Function1[/* OriginalComponent */ GriddleComponent[_], GriddleComponent[_]]] = js.undefined
  var PageDropdownContainerEnhancer: js.UndefOr[js.Function1[/* OriginalComponent */ GriddleComponent[_], GriddleComponent[_]]] = js.undefined
  var PageDropdownEnhancer: js.UndefOr[js.Function1[/* OriginalComponent */ GriddleComponent[_], GriddleComponent[_]]] = js.undefined
  var Pagination: js.UndefOr[GriddleComponent[_]] = js.undefined
  var PaginationContainer: js.UndefOr[js.Function1[/* OriginalComponent */ GriddleComponent[_], GriddleComponent[_]]] = js.undefined
  var PaginationContainerEnhancer: js.UndefOr[js.Function1[/* OriginalComponent */ GriddleComponent[_], GriddleComponent[_]]] = js.undefined
  var PaginationEnhancer: js.UndefOr[js.Function1[/* OriginalComponent */ GriddleComponent[_], GriddleComponent[_]]] = js.undefined
  var PreviousButton: js.UndefOr[GriddleComponent[_]] = js.undefined
  var PreviousButtonContainer: js.UndefOr[js.Function1[/* OriginalComponent */ GriddleComponent[_], GriddleComponent[_]]] = js.undefined
  var PreviousButtonContainerEnhancer: js.UndefOr[js.Function1[/* OriginalComponent */ GriddleComponent[_], GriddleComponent[_]]] = js.undefined
  var PreviousButtonEnhancer: js.UndefOr[js.Function1[/* OriginalComponent */ GriddleComponent[_], GriddleComponent[_]]] = js.undefined
  var Row: js.UndefOr[GriddleComponent[RowProps]] = js.undefined
  var RowContainer: js.UndefOr[
    js.Function1[/* OriginalComponent */ GriddleComponent[RowProps], GriddleComponent[RowProps]]
  ] = js.undefined
  var RowContainerEnhancer: js.UndefOr[
    js.Function1[/* OriginalComponent */ GriddleComponent[RowProps], GriddleComponent[RowProps]]
  ] = js.undefined
  var RowEnhancer: js.UndefOr[
    js.Function1[/* OriginalComponent */ GriddleComponent[RowProps], GriddleComponent[RowProps]]
  ] = js.undefined
  var Settings: js.UndefOr[GriddleComponent[SettingsProps]] = js.undefined
  var SettingsComponents: js.UndefOr[PropertyBag[GriddleComponent[_]]] = js.undefined
  var SettingsContainer: js.UndefOr[
    js.Function1[
      /* OriginalComponent */ GriddleComponent[SettingsProps], 
      GriddleComponent[SettingsProps]
    ]
  ] = js.undefined
  var SettingsContainerEnhancer: js.UndefOr[
    js.Function1[
      /* OriginalComponent */ GriddleComponent[SettingsProps], 
      GriddleComponent[SettingsProps]
    ]
  ] = js.undefined
  var SettingsEnhancer: js.UndefOr[
    js.Function1[
      /* OriginalComponent */ GriddleComponent[SettingsProps], 
      GriddleComponent[SettingsProps]
    ]
  ] = js.undefined
  var SettingsToggle: js.UndefOr[GriddleComponent[SettingsToggleProps]] = js.undefined
  var SettingsToggleContainer: js.UndefOr[
    js.Function1[
      /* OriginalComponent */ GriddleComponent[SettingsToggleProps], 
      GriddleComponent[SettingsToggleProps]
    ]
  ] = js.undefined
  var SettingsToggleContainerEnhancer: js.UndefOr[
    js.Function1[
      /* OriginalComponent */ GriddleComponent[SettingsToggleProps], 
      GriddleComponent[SettingsToggleProps]
    ]
  ] = js.undefined
  var SettingsToggleEnhancer: js.UndefOr[
    js.Function1[
      /* OriginalComponent */ GriddleComponent[SettingsToggleProps], 
      GriddleComponent[SettingsToggleProps]
    ]
  ] = js.undefined
  var SettingsWrapper: js.UndefOr[GriddleComponent[SettingsWrapperProps]] = js.undefined
  var SettingsWrapperContainer: js.UndefOr[
    js.Function1[
      /* OriginalComponent */ GriddleComponent[SettingsWrapperProps], 
      GriddleComponent[SettingsWrapperProps]
    ]
  ] = js.undefined
  var SettingsWrapperContainerEnhancer: js.UndefOr[
    js.Function1[
      /* OriginalComponent */ GriddleComponent[SettingsWrapperProps], 
      GriddleComponent[SettingsWrapperProps]
    ]
  ] = js.undefined
  var SettingsWrapperEnhancer: js.UndefOr[
    js.Function1[
      /* OriginalComponent */ GriddleComponent[SettingsWrapperProps], 
      GriddleComponent[SettingsWrapperProps]
    ]
  ] = js.undefined
  var Style: js.UndefOr[GriddleComponent[_]] = js.undefined
  var StyleContainer: js.UndefOr[js.Function1[/* OriginalComponent */ GriddleComponent[_], GriddleComponent[_]]] = js.undefined
  var StyleContainerEnhancer: js.UndefOr[js.Function1[/* OriginalComponent */ GriddleComponent[_], GriddleComponent[_]]] = js.undefined
  var StyleEnhancer: js.UndefOr[js.Function1[/* OriginalComponent */ GriddleComponent[_], GriddleComponent[_]]] = js.undefined
  var Table: js.UndefOr[GriddleComponent[TableProps]] = js.undefined
  var TableBody: js.UndefOr[GriddleComponent[TableBodyProps]] = js.undefined
  var TableBodyContainer: js.UndefOr[
    js.Function1[
      /* OriginalComponent */ GriddleComponent[TableBodyProps], 
      GriddleComponent[TableBodyProps]
    ]
  ] = js.undefined
  var TableBodyContainerEnhancer: js.UndefOr[
    js.Function1[
      /* OriginalComponent */ GriddleComponent[TableBodyProps], 
      GriddleComponent[TableBodyProps]
    ]
  ] = js.undefined
  var TableBodyEnhancer: js.UndefOr[
    js.Function1[
      /* OriginalComponent */ GriddleComponent[TableBodyProps], 
      GriddleComponent[TableBodyProps]
    ]
  ] = js.undefined
  var TableContainer: js.UndefOr[
    js.Function1[/* OriginalComponent */ GriddleComponent[TableProps], GriddleComponent[TableProps]]
  ] = js.undefined
  var TableContainerEnhancer: js.UndefOr[
    js.Function1[/* OriginalComponent */ GriddleComponent[TableProps], GriddleComponent[TableProps]]
  ] = js.undefined
  var TableEnhancer: js.UndefOr[
    js.Function1[/* OriginalComponent */ GriddleComponent[TableProps], GriddleComponent[TableProps]]
  ] = js.undefined
  var TableHeading: js.UndefOr[GriddleComponent[TableHeadingProps]] = js.undefined
  var TableHeadingCell: js.UndefOr[GriddleComponent[TableHeadingCellProps]] = js.undefined
  var TableHeadingCellContainer: js.UndefOr[
    js.Function1[
      /* OriginalComponent */ GriddleComponent[TableHeadingCellProps], 
      GriddleComponent[TableHeadingCellProps]
    ]
  ] = js.undefined
  var TableHeadingCellContainerEnhancer: js.UndefOr[
    js.Function1[
      /* OriginalComponent */ GriddleComponent[TableHeadingCellProps], 
      GriddleComponent[TableHeadingCellProps]
    ]
  ] = js.undefined
  var TableHeadingCellEnhancer: js.UndefOr[
    js.Function1[
      /* OriginalComponent */ GriddleComponent[TableHeadingCellProps], 
      GriddleComponent[TableHeadingCellProps]
    ]
  ] = js.undefined
  var TableHeadingContainer: js.UndefOr[
    js.Function1[
      /* OriginalComponent */ GriddleComponent[TableHeadingProps], 
      GriddleComponent[TableHeadingProps]
    ]
  ] = js.undefined
  var TableHeadingContainerEnhancer: js.UndefOr[
    js.Function1[
      /* OriginalComponent */ GriddleComponent[TableHeadingProps], 
      GriddleComponent[TableHeadingProps]
    ]
  ] = js.undefined
  var TableHeadingEnhancer: js.UndefOr[
    js.Function1[
      /* OriginalComponent */ GriddleComponent[TableHeadingProps], 
      GriddleComponent[TableHeadingProps]
    ]
  ] = js.undefined
}

object GriddleComponents {
  @scala.inline
  def apply(
    Cell: GriddleComponent[CellProps] = null,
    CellContainer: /* OriginalComponent */ GriddleComponent[CellProps] => CallbackTo[GriddleComponent[CellProps]] = null,
    CellContainerEnhancer: /* OriginalComponent */ GriddleComponent[CellProps] => CallbackTo[GriddleComponent[CellProps]] = null,
    CellEnhancer: /* OriginalComponent */ GriddleComponent[CellProps] => CallbackTo[GriddleComponent[CellProps]] = null,
    Filter: GriddleComponent[FilterProps] = null,
    FilterContainer: /* OriginalComponent */ GriddleComponent[FilterProps] => CallbackTo[GriddleComponent[FilterProps]] = null,
    FilterContainerEnhancer: /* OriginalComponent */ GriddleComponent[FilterProps] => CallbackTo[GriddleComponent[FilterProps]] = null,
    FilterEnhancer: /* OriginalComponent */ GriddleComponent[FilterProps] => CallbackTo[GriddleComponent[FilterProps]] = null,
    Layout: GriddleComponent[_] = null,
    LayoutContainer: /* OriginalComponent */ GriddleComponent[js.Any] => CallbackTo[GriddleComponent[js.Any]] = null,
    LayoutContainerEnhancer: /* OriginalComponent */ GriddleComponent[js.Any] => CallbackTo[GriddleComponent[js.Any]] = null,
    LayoutEnhancer: /* OriginalComponent */ GriddleComponent[js.Any] => CallbackTo[GriddleComponent[js.Any]] = null,
    NextButton: GriddleComponent[_] = null,
    NextButtonContainer: /* OriginalComponent */ GriddleComponent[js.Any] => CallbackTo[GriddleComponent[js.Any]] = null,
    NextButtonContainerEnhancer: /* OriginalComponent */ GriddleComponent[js.Any] => CallbackTo[GriddleComponent[js.Any]] = null,
    NextButtonEnhancer: /* OriginalComponent */ GriddleComponent[js.Any] => CallbackTo[GriddleComponent[js.Any]] = null,
    NoResults: GriddleComponent[_] = null,
    NoResultsContainer: /* OriginalComponent */ GriddleComponent[js.Any] => CallbackTo[GriddleComponent[js.Any]] = null,
    NoResultsContainerEnhancer: /* OriginalComponent */ GriddleComponent[js.Any] => CallbackTo[GriddleComponent[js.Any]] = null,
    NoResultsEnhancer: /* OriginalComponent */ GriddleComponent[js.Any] => CallbackTo[GriddleComponent[js.Any]] = null,
    PageDropdown: GriddleComponent[_] = null,
    PageDropdownContainer: /* OriginalComponent */ GriddleComponent[js.Any] => CallbackTo[GriddleComponent[js.Any]] = null,
    PageDropdownContainerEnhancer: /* OriginalComponent */ GriddleComponent[js.Any] => CallbackTo[GriddleComponent[js.Any]] = null,
    PageDropdownEnhancer: /* OriginalComponent */ GriddleComponent[js.Any] => CallbackTo[GriddleComponent[js.Any]] = null,
    Pagination: GriddleComponent[_] = null,
    PaginationContainer: /* OriginalComponent */ GriddleComponent[js.Any] => CallbackTo[GriddleComponent[js.Any]] = null,
    PaginationContainerEnhancer: /* OriginalComponent */ GriddleComponent[js.Any] => CallbackTo[GriddleComponent[js.Any]] = null,
    PaginationEnhancer: /* OriginalComponent */ GriddleComponent[js.Any] => CallbackTo[GriddleComponent[js.Any]] = null,
    PreviousButton: GriddleComponent[_] = null,
    PreviousButtonContainer: /* OriginalComponent */ GriddleComponent[js.Any] => CallbackTo[GriddleComponent[js.Any]] = null,
    PreviousButtonContainerEnhancer: /* OriginalComponent */ GriddleComponent[js.Any] => CallbackTo[GriddleComponent[js.Any]] = null,
    PreviousButtonEnhancer: /* OriginalComponent */ GriddleComponent[js.Any] => CallbackTo[GriddleComponent[js.Any]] = null,
    Row: GriddleComponent[RowProps] = null,
    RowContainer: /* OriginalComponent */ GriddleComponent[RowProps] => CallbackTo[GriddleComponent[RowProps]] = null,
    RowContainerEnhancer: /* OriginalComponent */ GriddleComponent[RowProps] => CallbackTo[GriddleComponent[RowProps]] = null,
    RowEnhancer: /* OriginalComponent */ GriddleComponent[RowProps] => CallbackTo[GriddleComponent[RowProps]] = null,
    Settings: GriddleComponent[SettingsProps] = null,
    SettingsComponents: PropertyBag[GriddleComponent[_]] = null,
    SettingsContainer: /* OriginalComponent */ GriddleComponent[SettingsProps] => CallbackTo[GriddleComponent[SettingsProps]] = null,
    SettingsContainerEnhancer: /* OriginalComponent */ GriddleComponent[SettingsProps] => CallbackTo[GriddleComponent[SettingsProps]] = null,
    SettingsEnhancer: /* OriginalComponent */ GriddleComponent[SettingsProps] => CallbackTo[GriddleComponent[SettingsProps]] = null,
    SettingsToggle: GriddleComponent[SettingsToggleProps] = null,
    SettingsToggleContainer: /* OriginalComponent */ GriddleComponent[SettingsToggleProps] => CallbackTo[GriddleComponent[SettingsToggleProps]] = null,
    SettingsToggleContainerEnhancer: /* OriginalComponent */ GriddleComponent[SettingsToggleProps] => CallbackTo[GriddleComponent[SettingsToggleProps]] = null,
    SettingsToggleEnhancer: /* OriginalComponent */ GriddleComponent[SettingsToggleProps] => CallbackTo[GriddleComponent[SettingsToggleProps]] = null,
    SettingsWrapper: GriddleComponent[SettingsWrapperProps] = null,
    SettingsWrapperContainer: /* OriginalComponent */ GriddleComponent[SettingsWrapperProps] => CallbackTo[GriddleComponent[SettingsWrapperProps]] = null,
    SettingsWrapperContainerEnhancer: /* OriginalComponent */ GriddleComponent[SettingsWrapperProps] => CallbackTo[GriddleComponent[SettingsWrapperProps]] = null,
    SettingsWrapperEnhancer: /* OriginalComponent */ GriddleComponent[SettingsWrapperProps] => CallbackTo[GriddleComponent[SettingsWrapperProps]] = null,
    Style: GriddleComponent[_] = null,
    StyleContainer: /* OriginalComponent */ GriddleComponent[js.Any] => CallbackTo[GriddleComponent[js.Any]] = null,
    StyleContainerEnhancer: /* OriginalComponent */ GriddleComponent[js.Any] => CallbackTo[GriddleComponent[js.Any]] = null,
    StyleEnhancer: /* OriginalComponent */ GriddleComponent[js.Any] => CallbackTo[GriddleComponent[js.Any]] = null,
    Table: GriddleComponent[TableProps] = null,
    TableBody: GriddleComponent[TableBodyProps] = null,
    TableBodyContainer: /* OriginalComponent */ GriddleComponent[TableBodyProps] => CallbackTo[GriddleComponent[TableBodyProps]] = null,
    TableBodyContainerEnhancer: /* OriginalComponent */ GriddleComponent[TableBodyProps] => CallbackTo[GriddleComponent[TableBodyProps]] = null,
    TableBodyEnhancer: /* OriginalComponent */ GriddleComponent[TableBodyProps] => CallbackTo[GriddleComponent[TableBodyProps]] = null,
    TableContainer: /* OriginalComponent */ GriddleComponent[TableProps] => CallbackTo[GriddleComponent[TableProps]] = null,
    TableContainerEnhancer: /* OriginalComponent */ GriddleComponent[TableProps] => CallbackTo[GriddleComponent[TableProps]] = null,
    TableEnhancer: /* OriginalComponent */ GriddleComponent[TableProps] => CallbackTo[GriddleComponent[TableProps]] = null,
    TableHeading: GriddleComponent[TableHeadingProps] = null,
    TableHeadingCell: GriddleComponent[TableHeadingCellProps] = null,
    TableHeadingCellContainer: /* OriginalComponent */ GriddleComponent[TableHeadingCellProps] => CallbackTo[GriddleComponent[TableHeadingCellProps]] = null,
    TableHeadingCellContainerEnhancer: /* OriginalComponent */ GriddleComponent[TableHeadingCellProps] => CallbackTo[GriddleComponent[TableHeadingCellProps]] = null,
    TableHeadingCellEnhancer: /* OriginalComponent */ GriddleComponent[TableHeadingCellProps] => CallbackTo[GriddleComponent[TableHeadingCellProps]] = null,
    TableHeadingContainer: /* OriginalComponent */ GriddleComponent[TableHeadingProps] => CallbackTo[GriddleComponent[TableHeadingProps]] = null,
    TableHeadingContainerEnhancer: /* OriginalComponent */ GriddleComponent[TableHeadingProps] => CallbackTo[GriddleComponent[TableHeadingProps]] = null,
    TableHeadingEnhancer: /* OriginalComponent */ GriddleComponent[TableHeadingProps] => CallbackTo[GriddleComponent[TableHeadingProps]] = null
  ): GriddleComponents = {
    val __obj = js.Dynamic.literal()
    if (Cell != null) __obj.updateDynamic("Cell")(Cell.asInstanceOf[js.Any])
    if (CellContainer != null) __obj.updateDynamic("CellContainer")(js.Any.fromFunction1((t0: /* OriginalComponent */ typingsJapgolly.griddleReact.mod.GriddleComponent[typingsJapgolly.griddleReact.mod.components.CellProps]) => CellContainer(t0).runNow()))
    if (CellContainerEnhancer != null) __obj.updateDynamic("CellContainerEnhancer")(js.Any.fromFunction1((t0: /* OriginalComponent */ typingsJapgolly.griddleReact.mod.GriddleComponent[typingsJapgolly.griddleReact.mod.components.CellProps]) => CellContainerEnhancer(t0).runNow()))
    if (CellEnhancer != null) __obj.updateDynamic("CellEnhancer")(js.Any.fromFunction1((t0: /* OriginalComponent */ typingsJapgolly.griddleReact.mod.GriddleComponent[typingsJapgolly.griddleReact.mod.components.CellProps]) => CellEnhancer(t0).runNow()))
    if (Filter != null) __obj.updateDynamic("Filter")(Filter.asInstanceOf[js.Any])
    if (FilterContainer != null) __obj.updateDynamic("FilterContainer")(js.Any.fromFunction1((t0: /* OriginalComponent */ typingsJapgolly.griddleReact.mod.GriddleComponent[typingsJapgolly.griddleReact.mod.components.FilterProps]) => FilterContainer(t0).runNow()))
    if (FilterContainerEnhancer != null) __obj.updateDynamic("FilterContainerEnhancer")(js.Any.fromFunction1((t0: /* OriginalComponent */ typingsJapgolly.griddleReact.mod.GriddleComponent[typingsJapgolly.griddleReact.mod.components.FilterProps]) => FilterContainerEnhancer(t0).runNow()))
    if (FilterEnhancer != null) __obj.updateDynamic("FilterEnhancer")(js.Any.fromFunction1((t0: /* OriginalComponent */ typingsJapgolly.griddleReact.mod.GriddleComponent[typingsJapgolly.griddleReact.mod.components.FilterProps]) => FilterEnhancer(t0).runNow()))
    if (Layout != null) __obj.updateDynamic("Layout")(Layout.asInstanceOf[js.Any])
    if (LayoutContainer != null) __obj.updateDynamic("LayoutContainer")(js.Any.fromFunction1((t0: /* OriginalComponent */ typingsJapgolly.griddleReact.mod.GriddleComponent[js.Any]) => LayoutContainer(t0).runNow()))
    if (LayoutContainerEnhancer != null) __obj.updateDynamic("LayoutContainerEnhancer")(js.Any.fromFunction1((t0: /* OriginalComponent */ typingsJapgolly.griddleReact.mod.GriddleComponent[js.Any]) => LayoutContainerEnhancer(t0).runNow()))
    if (LayoutEnhancer != null) __obj.updateDynamic("LayoutEnhancer")(js.Any.fromFunction1((t0: /* OriginalComponent */ typingsJapgolly.griddleReact.mod.GriddleComponent[js.Any]) => LayoutEnhancer(t0).runNow()))
    if (NextButton != null) __obj.updateDynamic("NextButton")(NextButton.asInstanceOf[js.Any])
    if (NextButtonContainer != null) __obj.updateDynamic("NextButtonContainer")(js.Any.fromFunction1((t0: /* OriginalComponent */ typingsJapgolly.griddleReact.mod.GriddleComponent[js.Any]) => NextButtonContainer(t0).runNow()))
    if (NextButtonContainerEnhancer != null) __obj.updateDynamic("NextButtonContainerEnhancer")(js.Any.fromFunction1((t0: /* OriginalComponent */ typingsJapgolly.griddleReact.mod.GriddleComponent[js.Any]) => NextButtonContainerEnhancer(t0).runNow()))
    if (NextButtonEnhancer != null) __obj.updateDynamic("NextButtonEnhancer")(js.Any.fromFunction1((t0: /* OriginalComponent */ typingsJapgolly.griddleReact.mod.GriddleComponent[js.Any]) => NextButtonEnhancer(t0).runNow()))
    if (NoResults != null) __obj.updateDynamic("NoResults")(NoResults.asInstanceOf[js.Any])
    if (NoResultsContainer != null) __obj.updateDynamic("NoResultsContainer")(js.Any.fromFunction1((t0: /* OriginalComponent */ typingsJapgolly.griddleReact.mod.GriddleComponent[js.Any]) => NoResultsContainer(t0).runNow()))
    if (NoResultsContainerEnhancer != null) __obj.updateDynamic("NoResultsContainerEnhancer")(js.Any.fromFunction1((t0: /* OriginalComponent */ typingsJapgolly.griddleReact.mod.GriddleComponent[js.Any]) => NoResultsContainerEnhancer(t0).runNow()))
    if (NoResultsEnhancer != null) __obj.updateDynamic("NoResultsEnhancer")(js.Any.fromFunction1((t0: /* OriginalComponent */ typingsJapgolly.griddleReact.mod.GriddleComponent[js.Any]) => NoResultsEnhancer(t0).runNow()))
    if (PageDropdown != null) __obj.updateDynamic("PageDropdown")(PageDropdown.asInstanceOf[js.Any])
    if (PageDropdownContainer != null) __obj.updateDynamic("PageDropdownContainer")(js.Any.fromFunction1((t0: /* OriginalComponent */ typingsJapgolly.griddleReact.mod.GriddleComponent[js.Any]) => PageDropdownContainer(t0).runNow()))
    if (PageDropdownContainerEnhancer != null) __obj.updateDynamic("PageDropdownContainerEnhancer")(js.Any.fromFunction1((t0: /* OriginalComponent */ typingsJapgolly.griddleReact.mod.GriddleComponent[js.Any]) => PageDropdownContainerEnhancer(t0).runNow()))
    if (PageDropdownEnhancer != null) __obj.updateDynamic("PageDropdownEnhancer")(js.Any.fromFunction1((t0: /* OriginalComponent */ typingsJapgolly.griddleReact.mod.GriddleComponent[js.Any]) => PageDropdownEnhancer(t0).runNow()))
    if (Pagination != null) __obj.updateDynamic("Pagination")(Pagination.asInstanceOf[js.Any])
    if (PaginationContainer != null) __obj.updateDynamic("PaginationContainer")(js.Any.fromFunction1((t0: /* OriginalComponent */ typingsJapgolly.griddleReact.mod.GriddleComponent[js.Any]) => PaginationContainer(t0).runNow()))
    if (PaginationContainerEnhancer != null) __obj.updateDynamic("PaginationContainerEnhancer")(js.Any.fromFunction1((t0: /* OriginalComponent */ typingsJapgolly.griddleReact.mod.GriddleComponent[js.Any]) => PaginationContainerEnhancer(t0).runNow()))
    if (PaginationEnhancer != null) __obj.updateDynamic("PaginationEnhancer")(js.Any.fromFunction1((t0: /* OriginalComponent */ typingsJapgolly.griddleReact.mod.GriddleComponent[js.Any]) => PaginationEnhancer(t0).runNow()))
    if (PreviousButton != null) __obj.updateDynamic("PreviousButton")(PreviousButton.asInstanceOf[js.Any])
    if (PreviousButtonContainer != null) __obj.updateDynamic("PreviousButtonContainer")(js.Any.fromFunction1((t0: /* OriginalComponent */ typingsJapgolly.griddleReact.mod.GriddleComponent[js.Any]) => PreviousButtonContainer(t0).runNow()))
    if (PreviousButtonContainerEnhancer != null) __obj.updateDynamic("PreviousButtonContainerEnhancer")(js.Any.fromFunction1((t0: /* OriginalComponent */ typingsJapgolly.griddleReact.mod.GriddleComponent[js.Any]) => PreviousButtonContainerEnhancer(t0).runNow()))
    if (PreviousButtonEnhancer != null) __obj.updateDynamic("PreviousButtonEnhancer")(js.Any.fromFunction1((t0: /* OriginalComponent */ typingsJapgolly.griddleReact.mod.GriddleComponent[js.Any]) => PreviousButtonEnhancer(t0).runNow()))
    if (Row != null) __obj.updateDynamic("Row")(Row.asInstanceOf[js.Any])
    if (RowContainer != null) __obj.updateDynamic("RowContainer")(js.Any.fromFunction1((t0: /* OriginalComponent */ typingsJapgolly.griddleReact.mod.GriddleComponent[typingsJapgolly.griddleReact.mod.components.RowProps]) => RowContainer(t0).runNow()))
    if (RowContainerEnhancer != null) __obj.updateDynamic("RowContainerEnhancer")(js.Any.fromFunction1((t0: /* OriginalComponent */ typingsJapgolly.griddleReact.mod.GriddleComponent[typingsJapgolly.griddleReact.mod.components.RowProps]) => RowContainerEnhancer(t0).runNow()))
    if (RowEnhancer != null) __obj.updateDynamic("RowEnhancer")(js.Any.fromFunction1((t0: /* OriginalComponent */ typingsJapgolly.griddleReact.mod.GriddleComponent[typingsJapgolly.griddleReact.mod.components.RowProps]) => RowEnhancer(t0).runNow()))
    if (Settings != null) __obj.updateDynamic("Settings")(Settings.asInstanceOf[js.Any])
    if (SettingsComponents != null) __obj.updateDynamic("SettingsComponents")(SettingsComponents.asInstanceOf[js.Any])
    if (SettingsContainer != null) __obj.updateDynamic("SettingsContainer")(js.Any.fromFunction1((t0: /* OriginalComponent */ typingsJapgolly.griddleReact.mod.GriddleComponent[typingsJapgolly.griddleReact.mod.components.SettingsProps]) => SettingsContainer(t0).runNow()))
    if (SettingsContainerEnhancer != null) __obj.updateDynamic("SettingsContainerEnhancer")(js.Any.fromFunction1((t0: /* OriginalComponent */ typingsJapgolly.griddleReact.mod.GriddleComponent[typingsJapgolly.griddleReact.mod.components.SettingsProps]) => SettingsContainerEnhancer(t0).runNow()))
    if (SettingsEnhancer != null) __obj.updateDynamic("SettingsEnhancer")(js.Any.fromFunction1((t0: /* OriginalComponent */ typingsJapgolly.griddleReact.mod.GriddleComponent[typingsJapgolly.griddleReact.mod.components.SettingsProps]) => SettingsEnhancer(t0).runNow()))
    if (SettingsToggle != null) __obj.updateDynamic("SettingsToggle")(SettingsToggle.asInstanceOf[js.Any])
    if (SettingsToggleContainer != null) __obj.updateDynamic("SettingsToggleContainer")(js.Any.fromFunction1((t0: /* OriginalComponent */ typingsJapgolly.griddleReact.mod.GriddleComponent[typingsJapgolly.griddleReact.mod.components.SettingsToggleProps]) => SettingsToggleContainer(t0).runNow()))
    if (SettingsToggleContainerEnhancer != null) __obj.updateDynamic("SettingsToggleContainerEnhancer")(js.Any.fromFunction1((t0: /* OriginalComponent */ typingsJapgolly.griddleReact.mod.GriddleComponent[typingsJapgolly.griddleReact.mod.components.SettingsToggleProps]) => SettingsToggleContainerEnhancer(t0).runNow()))
    if (SettingsToggleEnhancer != null) __obj.updateDynamic("SettingsToggleEnhancer")(js.Any.fromFunction1((t0: /* OriginalComponent */ typingsJapgolly.griddleReact.mod.GriddleComponent[typingsJapgolly.griddleReact.mod.components.SettingsToggleProps]) => SettingsToggleEnhancer(t0).runNow()))
    if (SettingsWrapper != null) __obj.updateDynamic("SettingsWrapper")(SettingsWrapper.asInstanceOf[js.Any])
    if (SettingsWrapperContainer != null) __obj.updateDynamic("SettingsWrapperContainer")(js.Any.fromFunction1((t0: /* OriginalComponent */ typingsJapgolly.griddleReact.mod.GriddleComponent[typingsJapgolly.griddleReact.mod.components.SettingsWrapperProps]) => SettingsWrapperContainer(t0).runNow()))
    if (SettingsWrapperContainerEnhancer != null) __obj.updateDynamic("SettingsWrapperContainerEnhancer")(js.Any.fromFunction1((t0: /* OriginalComponent */ typingsJapgolly.griddleReact.mod.GriddleComponent[typingsJapgolly.griddleReact.mod.components.SettingsWrapperProps]) => SettingsWrapperContainerEnhancer(t0).runNow()))
    if (SettingsWrapperEnhancer != null) __obj.updateDynamic("SettingsWrapperEnhancer")(js.Any.fromFunction1((t0: /* OriginalComponent */ typingsJapgolly.griddleReact.mod.GriddleComponent[typingsJapgolly.griddleReact.mod.components.SettingsWrapperProps]) => SettingsWrapperEnhancer(t0).runNow()))
    if (Style != null) __obj.updateDynamic("Style")(Style.asInstanceOf[js.Any])
    if (StyleContainer != null) __obj.updateDynamic("StyleContainer")(js.Any.fromFunction1((t0: /* OriginalComponent */ typingsJapgolly.griddleReact.mod.GriddleComponent[js.Any]) => StyleContainer(t0).runNow()))
    if (StyleContainerEnhancer != null) __obj.updateDynamic("StyleContainerEnhancer")(js.Any.fromFunction1((t0: /* OriginalComponent */ typingsJapgolly.griddleReact.mod.GriddleComponent[js.Any]) => StyleContainerEnhancer(t0).runNow()))
    if (StyleEnhancer != null) __obj.updateDynamic("StyleEnhancer")(js.Any.fromFunction1((t0: /* OriginalComponent */ typingsJapgolly.griddleReact.mod.GriddleComponent[js.Any]) => StyleEnhancer(t0).runNow()))
    if (Table != null) __obj.updateDynamic("Table")(Table.asInstanceOf[js.Any])
    if (TableBody != null) __obj.updateDynamic("TableBody")(TableBody.asInstanceOf[js.Any])
    if (TableBodyContainer != null) __obj.updateDynamic("TableBodyContainer")(js.Any.fromFunction1((t0: /* OriginalComponent */ typingsJapgolly.griddleReact.mod.GriddleComponent[typingsJapgolly.griddleReact.mod.components.TableBodyProps]) => TableBodyContainer(t0).runNow()))
    if (TableBodyContainerEnhancer != null) __obj.updateDynamic("TableBodyContainerEnhancer")(js.Any.fromFunction1((t0: /* OriginalComponent */ typingsJapgolly.griddleReact.mod.GriddleComponent[typingsJapgolly.griddleReact.mod.components.TableBodyProps]) => TableBodyContainerEnhancer(t0).runNow()))
    if (TableBodyEnhancer != null) __obj.updateDynamic("TableBodyEnhancer")(js.Any.fromFunction1((t0: /* OriginalComponent */ typingsJapgolly.griddleReact.mod.GriddleComponent[typingsJapgolly.griddleReact.mod.components.TableBodyProps]) => TableBodyEnhancer(t0).runNow()))
    if (TableContainer != null) __obj.updateDynamic("TableContainer")(js.Any.fromFunction1((t0: /* OriginalComponent */ typingsJapgolly.griddleReact.mod.GriddleComponent[typingsJapgolly.griddleReact.mod.components.TableProps]) => TableContainer(t0).runNow()))
    if (TableContainerEnhancer != null) __obj.updateDynamic("TableContainerEnhancer")(js.Any.fromFunction1((t0: /* OriginalComponent */ typingsJapgolly.griddleReact.mod.GriddleComponent[typingsJapgolly.griddleReact.mod.components.TableProps]) => TableContainerEnhancer(t0).runNow()))
    if (TableEnhancer != null) __obj.updateDynamic("TableEnhancer")(js.Any.fromFunction1((t0: /* OriginalComponent */ typingsJapgolly.griddleReact.mod.GriddleComponent[typingsJapgolly.griddleReact.mod.components.TableProps]) => TableEnhancer(t0).runNow()))
    if (TableHeading != null) __obj.updateDynamic("TableHeading")(TableHeading.asInstanceOf[js.Any])
    if (TableHeadingCell != null) __obj.updateDynamic("TableHeadingCell")(TableHeadingCell.asInstanceOf[js.Any])
    if (TableHeadingCellContainer != null) __obj.updateDynamic("TableHeadingCellContainer")(js.Any.fromFunction1((t0: /* OriginalComponent */ typingsJapgolly.griddleReact.mod.GriddleComponent[typingsJapgolly.griddleReact.mod.components.TableHeadingCellProps]) => TableHeadingCellContainer(t0).runNow()))
    if (TableHeadingCellContainerEnhancer != null) __obj.updateDynamic("TableHeadingCellContainerEnhancer")(js.Any.fromFunction1((t0: /* OriginalComponent */ typingsJapgolly.griddleReact.mod.GriddleComponent[typingsJapgolly.griddleReact.mod.components.TableHeadingCellProps]) => TableHeadingCellContainerEnhancer(t0).runNow()))
    if (TableHeadingCellEnhancer != null) __obj.updateDynamic("TableHeadingCellEnhancer")(js.Any.fromFunction1((t0: /* OriginalComponent */ typingsJapgolly.griddleReact.mod.GriddleComponent[typingsJapgolly.griddleReact.mod.components.TableHeadingCellProps]) => TableHeadingCellEnhancer(t0).runNow()))
    if (TableHeadingContainer != null) __obj.updateDynamic("TableHeadingContainer")(js.Any.fromFunction1((t0: /* OriginalComponent */ typingsJapgolly.griddleReact.mod.GriddleComponent[typingsJapgolly.griddleReact.mod.components.TableHeadingProps]) => TableHeadingContainer(t0).runNow()))
    if (TableHeadingContainerEnhancer != null) __obj.updateDynamic("TableHeadingContainerEnhancer")(js.Any.fromFunction1((t0: /* OriginalComponent */ typingsJapgolly.griddleReact.mod.GriddleComponent[typingsJapgolly.griddleReact.mod.components.TableHeadingProps]) => TableHeadingContainerEnhancer(t0).runNow()))
    if (TableHeadingEnhancer != null) __obj.updateDynamic("TableHeadingEnhancer")(js.Any.fromFunction1((t0: /* OriginalComponent */ typingsJapgolly.griddleReact.mod.GriddleComponent[typingsJapgolly.griddleReact.mod.components.TableHeadingProps]) => TableHeadingEnhancer(t0).runNow()))
    __obj.asInstanceOf[GriddleComponents]
  }
}

