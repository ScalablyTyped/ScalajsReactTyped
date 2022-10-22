package typingsJapgolly.awsSdk.clientsHealthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEntityAggregatesRequest extends StObject {
  
  /**
    * A list of event ARNs (unique identifiers). For example: "arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-CDE456", "arn:aws:health:us-west-1::event/EBS/AWS_EBS_LOST_VOLUME/AWS_EBS_LOST_VOLUME_CHI789_JKL101" 
    */
  var eventArns: js.UndefOr[EventArnsList] = js.undefined
}
object DescribeEntityAggregatesRequest {
  
  inline def apply(): DescribeEntityAggregatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEntityAggregatesRequest]
  }
  
  extension [Self <: DescribeEntityAggregatesRequest](x: Self) {
    
    inline def setEventArns(value: EventArnsList): Self = StObject.set(x, "eventArns", value.asInstanceOf[js.Any])
    
    inline def setEventArnsUndefined: Self = StObject.set(x, "eventArns", js.undefined)
    
    inline def setEventArnsVarargs(value: eventArn*): Self = StObject.set(x, "eventArns", js.Array(value*))
  }
}
