package typingsJapgolly.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListImagesResponse extends StObject {
  
  /**
    * A list of images and their properties.
    */
  var Images: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.Images] = js.undefined
  
  /**
    * A token for getting the next set of images, if there are any.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
}
object ListImagesResponse {
  
  inline def apply(): ListImagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListImagesResponse]
  }
  
  extension [Self <: ListImagesResponse](x: Self) {
    
    inline def setImages(value: Images): Self = StObject.set(x, "Images", value.asInstanceOf[js.Any])
    
    inline def setImagesUndefined: Self = StObject.set(x, "Images", js.undefined)
    
    inline def setImagesVarargs(value: Image*): Self = StObject.set(x, "Images", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
