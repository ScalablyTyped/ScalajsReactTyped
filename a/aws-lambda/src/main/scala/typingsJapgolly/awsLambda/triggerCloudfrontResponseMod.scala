package typingsJapgolly.awsLambda

import typingsJapgolly.awsLambda.anon.Cf
import typingsJapgolly.awsLambda.commonCloudfrontMod.CloudFrontResultResponse
import typingsJapgolly.awsLambda.handlerMod.Callback
import typingsJapgolly.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object triggerCloudfrontResponseMod {
  
  type CloudFrontResponseCallback = Callback[CloudFrontResponseResult]
  
  trait CloudFrontResponseEvent extends StObject {
    
    var Records: js.Array[Cf]
  }
  object CloudFrontResponseEvent {
    
    inline def apply(Records: js.Array[Cf]): CloudFrontResponseEvent = {
      val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloudFrontResponseEvent]
    }
    
    extension [Self <: CloudFrontResponseEvent](x: Self) {
      
      inline def setRecords(value: js.Array[Cf]): Self = StObject.set(x, "Records", value.asInstanceOf[js.Any])
      
      inline def setRecordsVarargs(value: Cf*): Self = StObject.set(x, "Records", js.Array(value*))
    }
  }
  
  type CloudFrontResponseHandler = Handler[CloudFrontResponseEvent, CloudFrontResponseResult]
  
  type CloudFrontResponseResult = js.UndefOr[Null | CloudFrontResultResponse]
}
