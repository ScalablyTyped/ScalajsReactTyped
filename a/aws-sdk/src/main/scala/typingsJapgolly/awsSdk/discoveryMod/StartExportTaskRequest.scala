package typingsJapgolly.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartExportTaskRequest extends js.Object {
  /**
    * The end timestamp for exported data from the single Application Discovery Agent selected in the filters. If no value is specified, exported data includes the most recent data collected by the agent.
    */
  var endTime: js.UndefOr[js.Date] = js.native
  /**
    * The file format for the returned export data. Default value is CSV. Note: The GRAPHML option has been deprecated. 
    */
  var exportDataFormat: js.UndefOr[ExportDataFormats] = js.native
  /**
    * If a filter is present, it selects the single agentId of the Application Discovery Agent for which data is exported. The agentId can be found in the results of the DescribeAgents API or CLI. If no filter is present, startTime and endTime are ignored and exported data includes both Agentless Discovery Connector data and summary data from Application Discovery agents. 
    */
  var filters: js.UndefOr[ExportFilters] = js.native
  /**
    * The start timestamp for exported data from the single Application Discovery Agent selected in the filters. If no value is specified, data is exported starting from the first data collected by the agent.
    */
  var startTime: js.UndefOr[js.Date] = js.native
}

object StartExportTaskRequest {
  @scala.inline
  def apply(
    endTime: js.Date = null,
    exportDataFormat: ExportDataFormats = null,
    filters: ExportFilters = null,
    startTime: js.Date = null
  ): StartExportTaskRequest = {
    val __obj = js.Dynamic.literal()
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (exportDataFormat != null) __obj.updateDynamic("exportDataFormat")(exportDataFormat.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartExportTaskRequest]
  }
}

