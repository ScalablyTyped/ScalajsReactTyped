package typingsJapgolly.awsSdk.clientsIvsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPlaybackKeyPairRequest extends StObject {
  
  /**
    * ARN of the key pair to be returned.
    */
  var arn: PlaybackKeyPairArn
}
object GetPlaybackKeyPairRequest {
  
  inline def apply(arn: PlaybackKeyPairArn): GetPlaybackKeyPairRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPlaybackKeyPairRequest]
  }
  
  extension [Self <: GetPlaybackKeyPairRequest](x: Self) {
    
    inline def setArn(value: PlaybackKeyPairArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
