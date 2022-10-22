package typingsJapgolly.reactNativeFbsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactNativeFbsdk.mod.ShareLinkContent
  - typingsJapgolly.reactNativeFbsdk.mod.SharePhotoContent
  - typingsJapgolly.reactNativeFbsdk.mod.ShareVideoContent
  - typingsJapgolly.reactNativeFbsdk.mod.ShareOpenGraphContent
*/
trait ShareContent extends StObject
object ShareContent {
  
  inline def ShareLinkContent(contentUrl: String): typingsJapgolly.reactNativeFbsdk.mod.ShareLinkContent = {
    val __obj = js.Dynamic.literal(contentType = "link", contentUrl = contentUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.reactNativeFbsdk.mod.ShareLinkContent]
  }
  
  inline def ShareOpenGraphContent(action: ShareOpenGraphAction, previewPropertyName: String): typingsJapgolly.reactNativeFbsdk.mod.ShareOpenGraphContent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], contentType = "open-graph", previewPropertyName = previewPropertyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.reactNativeFbsdk.mod.ShareOpenGraphContent]
  }
  
  inline def SharePhotoContent(photos: js.Array[SharePhoto]): typingsJapgolly.reactNativeFbsdk.mod.SharePhotoContent = {
    val __obj = js.Dynamic.literal(contentType = "photo", photos = photos.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.reactNativeFbsdk.mod.SharePhotoContent]
  }
  
  inline def ShareVideoContent(video: ShareVideo): typingsJapgolly.reactNativeFbsdk.mod.ShareVideoContent = {
    val __obj = js.Dynamic.literal(contentType = "video", video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.reactNativeFbsdk.mod.ShareVideoContent]
  }
}
