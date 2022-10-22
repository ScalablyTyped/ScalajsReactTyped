package typingsJapgolly.awsSdk.clientsTimestreamqueryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteScheduledQueryRequest extends StObject {
  
  /**
    * The ARN of the scheduled query. 
    */
  var ScheduledQueryArn: AmazonResourceName
}
object DeleteScheduledQueryRequest {
  
  inline def apply(ScheduledQueryArn: AmazonResourceName): DeleteScheduledQueryRequest = {
    val __obj = js.Dynamic.literal(ScheduledQueryArn = ScheduledQueryArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteScheduledQueryRequest]
  }
  
  extension [Self <: DeleteScheduledQueryRequest](x: Self) {
    
    inline def setScheduledQueryArn(value: AmazonResourceName): Self = StObject.set(x, "ScheduledQueryArn", value.asInstanceOf[js.Any])
  }
}
