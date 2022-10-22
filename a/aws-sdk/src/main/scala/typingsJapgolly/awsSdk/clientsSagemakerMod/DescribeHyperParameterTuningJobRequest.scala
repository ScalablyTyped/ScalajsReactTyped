package typingsJapgolly.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeHyperParameterTuningJobRequest extends StObject {
  
  /**
    * The name of the tuning job.
    */
  var HyperParameterTuningJobName: typingsJapgolly.awsSdk.clientsSagemakerMod.HyperParameterTuningJobName
}
object DescribeHyperParameterTuningJobRequest {
  
  inline def apply(HyperParameterTuningJobName: HyperParameterTuningJobName): DescribeHyperParameterTuningJobRequest = {
    val __obj = js.Dynamic.literal(HyperParameterTuningJobName = HyperParameterTuningJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeHyperParameterTuningJobRequest]
  }
  
  extension [Self <: DescribeHyperParameterTuningJobRequest](x: Self) {
    
    inline def setHyperParameterTuningJobName(value: HyperParameterTuningJobName): Self = StObject.set(x, "HyperParameterTuningJobName", value.asInstanceOf[js.Any])
  }
}
