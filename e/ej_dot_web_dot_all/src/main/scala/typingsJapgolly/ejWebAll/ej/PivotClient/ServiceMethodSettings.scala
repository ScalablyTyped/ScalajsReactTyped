package typingsJapgolly.ejWebAll.ej.PivotClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceMethodSettings extends js.Object {
  /** Allows you to set the custom name for the service method that is responsible for updating the report with the calculated member.
    * @Default {CalculatedMember}
    */
  var calculatedMember: js.UndefOr[String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for updating the entire report and widget, while changing the cube.
    * @Default {CubeChanged}
    */
  var cubeChanged: js.UndefOr[String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for performing the drill through operation in the data table.
    * @Default {DrillThroughDataTable}
    */
  var drillThroughDataTable: js.UndefOr[String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for performing the drill through operation.
    * @Default {DrillThroughHierarchies}
    */
  var drillThroughHierarchies: js.UndefOr[String] = js.undefined
  /** Allows to set the custom name for the service method responsible for exporting.
    * @Default {Export}
    */
  var exportPivotClient: js.UndefOr[String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible to get the members for tree-view in the member-editor dialog.
    * @Default {FetchMemberTreeNodes}
    */
  var fetchMemberTreeNodes: js.UndefOr[String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for fetching the report names from the database.
    * @Default {FetchReportListFromDB}
    */
  var fetchReportList: js.UndefOr[String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for updating the report while filtering the members.
    * @Default {FilterElement}
    */
  var filterElement: js.UndefOr[String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for initializing the pivot client.
    * @Default {InitializeClient}
    */
  var initialize: js.UndefOr[String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for loading a report collection from the database.
    * @Default {LoadReportFromDB}
    */
  var loadReport: js.UndefOr[String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for retrieving the MDX query for the current report.
    * @Default {GetMDXQuery}
    */
  var mdxQuery: js.UndefOr[String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for updating the tree-view in the cube browser, while changing the measure group.
    * @Default {MeasureGroupChanged}
    */
  var measureGroupChanged: js.UndefOr[String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible to get the child members, on tree-view node expansion.
    * @Default {MemberExpanded}
    */
  var memberExpand: js.UndefOr[String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for updating the report while dropping a node/split button in the axis element builder.
    * @Default {NodeDropped}
    */
  var nodeDropped: js.UndefOr[String] = js.undefined
  /** Allows you to set the custom name for the service method while navigating between the pages in the paged pivot client.
    * @Default {Paging}
    */
  var paging: js.UndefOr[String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible to remove a report collection from the database.
    * @Default {RemoveReportFromDB}
    */
  var removeDBReport: js.UndefOr[String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible to update the report while removing the split button from the axis element builder.
    * @Default {RemoveSplitButton}
    */
  var removeSplitButton: js.UndefOr[String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for renaming the report collection in the database.
    * @Default {RenameReportInDB}
    */
  var renameDBReport: js.UndefOr[String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for saving the report collection in the database.
    * @Default {SaveReportToDB}
    */
  var saveReport: js.UndefOr[String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for toggling the elements in the row and column axes.
    * @Default {ToggleAxis}
    */
  var toggleAxis: js.UndefOr[String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for all the toolbar operations.
    * @Default {ToolbarOperations}
    */
  var toolbarServices: js.UndefOr[String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for updating the report collection.
    * @Default {UpdateReport}
    */
  var updateReport: js.UndefOr[String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for performing value sorting operation in the PivotClient.
    * @Default {ValueSorting}
    */
  var valueSorting: js.UndefOr[String] = js.undefined
}

object ServiceMethodSettings {
  @scala.inline
  def apply(
    calculatedMember: String = null,
    cubeChanged: String = null,
    drillThroughDataTable: String = null,
    drillThroughHierarchies: String = null,
    exportPivotClient: String = null,
    fetchMemberTreeNodes: String = null,
    fetchReportList: String = null,
    filterElement: String = null,
    initialize: String = null,
    loadReport: String = null,
    mdxQuery: String = null,
    measureGroupChanged: String = null,
    memberExpand: String = null,
    nodeDropped: String = null,
    paging: String = null,
    removeDBReport: String = null,
    removeSplitButton: String = null,
    renameDBReport: String = null,
    saveReport: String = null,
    toggleAxis: String = null,
    toolbarServices: String = null,
    updateReport: String = null,
    valueSorting: String = null
  ): ServiceMethodSettings = {
    val __obj = js.Dynamic.literal()
    if (calculatedMember != null) __obj.updateDynamic("calculatedMember")(calculatedMember.asInstanceOf[js.Any])
    if (cubeChanged != null) __obj.updateDynamic("cubeChanged")(cubeChanged.asInstanceOf[js.Any])
    if (drillThroughDataTable != null) __obj.updateDynamic("drillThroughDataTable")(drillThroughDataTable.asInstanceOf[js.Any])
    if (drillThroughHierarchies != null) __obj.updateDynamic("drillThroughHierarchies")(drillThroughHierarchies.asInstanceOf[js.Any])
    if (exportPivotClient != null) __obj.updateDynamic("exportPivotClient")(exportPivotClient.asInstanceOf[js.Any])
    if (fetchMemberTreeNodes != null) __obj.updateDynamic("fetchMemberTreeNodes")(fetchMemberTreeNodes.asInstanceOf[js.Any])
    if (fetchReportList != null) __obj.updateDynamic("fetchReportList")(fetchReportList.asInstanceOf[js.Any])
    if (filterElement != null) __obj.updateDynamic("filterElement")(filterElement.asInstanceOf[js.Any])
    if (initialize != null) __obj.updateDynamic("initialize")(initialize.asInstanceOf[js.Any])
    if (loadReport != null) __obj.updateDynamic("loadReport")(loadReport.asInstanceOf[js.Any])
    if (mdxQuery != null) __obj.updateDynamic("mdxQuery")(mdxQuery.asInstanceOf[js.Any])
    if (measureGroupChanged != null) __obj.updateDynamic("measureGroupChanged")(measureGroupChanged.asInstanceOf[js.Any])
    if (memberExpand != null) __obj.updateDynamic("memberExpand")(memberExpand.asInstanceOf[js.Any])
    if (nodeDropped != null) __obj.updateDynamic("nodeDropped")(nodeDropped.asInstanceOf[js.Any])
    if (paging != null) __obj.updateDynamic("paging")(paging.asInstanceOf[js.Any])
    if (removeDBReport != null) __obj.updateDynamic("removeDBReport")(removeDBReport.asInstanceOf[js.Any])
    if (removeSplitButton != null) __obj.updateDynamic("removeSplitButton")(removeSplitButton.asInstanceOf[js.Any])
    if (renameDBReport != null) __obj.updateDynamic("renameDBReport")(renameDBReport.asInstanceOf[js.Any])
    if (saveReport != null) __obj.updateDynamic("saveReport")(saveReport.asInstanceOf[js.Any])
    if (toggleAxis != null) __obj.updateDynamic("toggleAxis")(toggleAxis.asInstanceOf[js.Any])
    if (toolbarServices != null) __obj.updateDynamic("toolbarServices")(toolbarServices.asInstanceOf[js.Any])
    if (updateReport != null) __obj.updateDynamic("updateReport")(updateReport.asInstanceOf[js.Any])
    if (valueSorting != null) __obj.updateDynamic("valueSorting")(valueSorting.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceMethodSettings]
  }
}

