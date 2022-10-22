package typingsJapgolly.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublishAppVersionRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:partition:resiliencehub:region:account:app/app-id. For more information about ARNs, see  Amazon Resource Names (ARNs) in the AWS General Reference.
    */
  var appArn: Arn
}
object PublishAppVersionRequest {
  
  inline def apply(appArn: Arn): PublishAppVersionRequest = {
    val __obj = js.Dynamic.literal(appArn = appArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishAppVersionRequest]
  }
  
  extension [Self <: PublishAppVersionRequest](x: Self) {
    
    inline def setAppArn(value: Arn): Self = StObject.set(x, "appArn", value.asInstanceOf[js.Any])
  }
}
