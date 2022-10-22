package typingsJapgolly.awsSdk.clientsDiscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeExportTasksResponse extends StObject {
  
  /**
    * Contains one or more sets of export request details. When the status of a request is SUCCEEDED, the response includes a URL for an Amazon S3 bucket where you can view the data in a CSV file.
    */
  var exportsInfo: js.UndefOr[ExportsInfo] = js.undefined
  
  /**
    * The nextToken value to include in a future DescribeExportTasks request. When the results of a DescribeExportTasks request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object DescribeExportTasksResponse {
  
  inline def apply(): DescribeExportTasksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeExportTasksResponse]
  }
  
  extension [Self <: DescribeExportTasksResponse](x: Self) {
    
    inline def setExportsInfo(value: ExportsInfo): Self = StObject.set(x, "exportsInfo", value.asInstanceOf[js.Any])
    
    inline def setExportsInfoUndefined: Self = StObject.set(x, "exportsInfo", js.undefined)
    
    inline def setExportsInfoVarargs(value: ExportInfo*): Self = StObject.set(x, "exportsInfo", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
