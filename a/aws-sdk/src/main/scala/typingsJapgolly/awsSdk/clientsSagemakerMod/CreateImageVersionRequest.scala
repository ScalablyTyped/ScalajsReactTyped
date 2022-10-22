package typingsJapgolly.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateImageVersionRequest extends StObject {
  
  /**
    * The registry path of the container image to use as the starting point for this version. The path is an Amazon Elastic Container Registry (ECR) URI in the following format:  &lt;acct-id&gt;.dkr.ecr.&lt;region&gt;.amazonaws.com/&lt;repo-name[:tag] or [@digest]&gt; 
    */
  var BaseImage: ImageBaseImage
  
  /**
    * A unique ID. If not specified, the Amazon Web Services CLI and Amazon Web Services SDKs, such as the SDK for Python (Boto3), add a unique value to the call.
    */
  var ClientToken: typingsJapgolly.awsSdk.clientsSagemakerMod.ClientToken
  
  /**
    * The ImageName of the Image to create a version of.
    */
  var ImageName: typingsJapgolly.awsSdk.clientsSagemakerMod.ImageName
}
object CreateImageVersionRequest {
  
  inline def apply(BaseImage: ImageBaseImage, ClientToken: ClientToken, ImageName: ImageName): CreateImageVersionRequest = {
    val __obj = js.Dynamic.literal(BaseImage = BaseImage.asInstanceOf[js.Any], ClientToken = ClientToken.asInstanceOf[js.Any], ImageName = ImageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateImageVersionRequest]
  }
  
  extension [Self <: CreateImageVersionRequest](x: Self) {
    
    inline def setBaseImage(value: ImageBaseImage): Self = StObject.set(x, "BaseImage", value.asInstanceOf[js.Any])
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setImageName(value: ImageName): Self = StObject.set(x, "ImageName", value.asInstanceOf[js.Any])
  }
}
