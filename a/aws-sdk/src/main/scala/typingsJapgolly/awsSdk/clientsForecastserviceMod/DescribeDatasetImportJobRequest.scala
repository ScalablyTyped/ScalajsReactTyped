package typingsJapgolly.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDatasetImportJobRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the dataset import job.
    */
  var DatasetImportJobArn: Arn
}
object DescribeDatasetImportJobRequest {
  
  inline def apply(DatasetImportJobArn: Arn): DescribeDatasetImportJobRequest = {
    val __obj = js.Dynamic.literal(DatasetImportJobArn = DatasetImportJobArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDatasetImportJobRequest]
  }
  
  extension [Self <: DescribeDatasetImportJobRequest](x: Self) {
    
    inline def setDatasetImportJobArn(value: Arn): Self = StObject.set(x, "DatasetImportJobArn", value.asInstanceOf[js.Any])
  }
}
