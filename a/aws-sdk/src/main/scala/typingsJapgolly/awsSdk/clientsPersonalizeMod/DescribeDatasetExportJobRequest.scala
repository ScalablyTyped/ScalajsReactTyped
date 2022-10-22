package typingsJapgolly.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDatasetExportJobRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the dataset export job to describe.
    */
  var datasetExportJobArn: Arn
}
object DescribeDatasetExportJobRequest {
  
  inline def apply(datasetExportJobArn: Arn): DescribeDatasetExportJobRequest = {
    val __obj = js.Dynamic.literal(datasetExportJobArn = datasetExportJobArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDatasetExportJobRequest]
  }
  
  extension [Self <: DescribeDatasetExportJobRequest](x: Self) {
    
    inline def setDatasetExportJobArn(value: Arn): Self = StObject.set(x, "datasetExportJobArn", value.asInstanceOf[js.Any])
  }
}
