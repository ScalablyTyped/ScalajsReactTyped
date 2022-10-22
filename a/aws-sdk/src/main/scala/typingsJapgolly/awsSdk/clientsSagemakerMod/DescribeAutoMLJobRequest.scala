package typingsJapgolly.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAutoMLJobRequest extends StObject {
  
  /**
    * Requests information about an AutoML job using its unique name.
    */
  var AutoMLJobName: typingsJapgolly.awsSdk.clientsSagemakerMod.AutoMLJobName
}
object DescribeAutoMLJobRequest {
  
  inline def apply(AutoMLJobName: AutoMLJobName): DescribeAutoMLJobRequest = {
    val __obj = js.Dynamic.literal(AutoMLJobName = AutoMLJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAutoMLJobRequest]
  }
  
  extension [Self <: DescribeAutoMLJobRequest](x: Self) {
    
    inline def setAutoMLJobName(value: AutoMLJobName): Self = StObject.set(x, "AutoMLJobName", value.asInstanceOf[js.Any])
  }
}
