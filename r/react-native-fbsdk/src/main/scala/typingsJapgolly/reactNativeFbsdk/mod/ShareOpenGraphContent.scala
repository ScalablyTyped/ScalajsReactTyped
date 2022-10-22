package typingsJapgolly.reactNativeFbsdk.mod

import typingsJapgolly.reactNativeFbsdk.reactNativeFbsdkStrings.`open-graph`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShareOpenGraphContent
  extends StObject
     with ShareContent {
  
  /**
    * Open Graph Action to be shared.
    */
  var action: ShareOpenGraphAction
  
  /**
    * Common parameters for share content;
    */
  var commonParameters: js.UndefOr[ShareContentCommonParameters] = js.undefined
  
  /**
    * The type of content to be shared is open graph content.
    */
  var contentType: `open-graph`
  
  /**
    * URL for the content being shared.
    */
  var contentUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Property name that points to the primary Open Graph Object in the action.
    */
  var previewPropertyName: String
}
object ShareOpenGraphContent {
  
  inline def apply(action: ShareOpenGraphAction, previewPropertyName: String): ShareOpenGraphContent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], contentType = "open-graph", previewPropertyName = previewPropertyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareOpenGraphContent]
  }
  
  extension [Self <: ShareOpenGraphContent](x: Self) {
    
    inline def setAction(value: ShareOpenGraphAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setCommonParameters(value: ShareContentCommonParameters): Self = StObject.set(x, "commonParameters", value.asInstanceOf[js.Any])
    
    inline def setCommonParametersUndefined: Self = StObject.set(x, "commonParameters", js.undefined)
    
    inline def setContentType(value: `open-graph`): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentUrl(value: String): Self = StObject.set(x, "contentUrl", value.asInstanceOf[js.Any])
    
    inline def setContentUrlUndefined: Self = StObject.set(x, "contentUrl", js.undefined)
    
    inline def setPreviewPropertyName(value: String): Self = StObject.set(x, "previewPropertyName", value.asInstanceOf[js.Any])
  }
}
