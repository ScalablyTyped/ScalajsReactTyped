package typingsJapgolly.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEventSourceMappingsRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the event source.    Amazon Kinesis - The ARN of the data stream or a stream consumer.    Amazon DynamoDB Streams - The ARN of the stream.    Amazon Simple Queue Service - The ARN of the queue.    Amazon Managed Streaming for Apache Kafka - The ARN of the cluster.  
    */
  var EventSourceArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The name of the Lambda function.  Name formats     Function name - MyFunction.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction.    Version or Alias ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction:PROD.    Partial ARN - 123456789012:function:MyFunction.   The length constraint applies only to the full ARN. If you specify only the function name, it's limited to 64 characters in length.
    */
  var FunctionName: js.UndefOr[typingsJapgolly.awsSdk.clientsLambdaMod.FunctionName] = js.undefined
  
  /**
    * A pagination token returned by a previous call.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of event source mappings to return. Note that ListEventSourceMappings returns a maximum of 100 items in each response, even if you set the number higher.
    */
  var MaxItems: js.UndefOr[MaxListItems] = js.undefined
}
object ListEventSourceMappingsRequest {
  
  inline def apply(): ListEventSourceMappingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEventSourceMappingsRequest]
  }
  
  extension [Self <: ListEventSourceMappingsRequest](x: Self) {
    
    inline def setEventSourceArn(value: Arn): Self = StObject.set(x, "EventSourceArn", value.asInstanceOf[js.Any])
    
    inline def setEventSourceArnUndefined: Self = StObject.set(x, "EventSourceArn", js.undefined)
    
    inline def setFunctionName(value: FunctionName): Self = StObject.set(x, "FunctionName", value.asInstanceOf[js.Any])
    
    inline def setFunctionNameUndefined: Self = StObject.set(x, "FunctionName", js.undefined)
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setMaxItems(value: MaxListItems): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    inline def setMaxItemsUndefined: Self = StObject.set(x, "MaxItems", js.undefined)
  }
}
