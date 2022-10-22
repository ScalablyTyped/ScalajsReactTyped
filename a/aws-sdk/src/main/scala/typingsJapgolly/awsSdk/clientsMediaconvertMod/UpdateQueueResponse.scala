package typingsJapgolly.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateQueueResponse extends StObject {
  
  /**
    * You can use queues to manage the resources that are available to your AWS account for running multiple transcoding jobs at the same time. If you don't specify a queue, the service sends all jobs through the default queue. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-queues.html.
    */
  var Queue: js.UndefOr[typingsJapgolly.awsSdk.clientsMediaconvertMod.Queue] = js.undefined
}
object UpdateQueueResponse {
  
  inline def apply(): UpdateQueueResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateQueueResponse]
  }
  
  extension [Self <: UpdateQueueResponse](x: Self) {
    
    inline def setQueue(value: Queue): Self = StObject.set(x, "Queue", value.asInstanceOf[js.Any])
    
    inline def setQueueUndefined: Self = StObject.set(x, "Queue", js.undefined)
  }
}
