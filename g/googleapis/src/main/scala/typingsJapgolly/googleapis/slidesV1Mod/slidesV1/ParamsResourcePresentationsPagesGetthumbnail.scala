package typingsJapgolly.googleapis.slidesV1Mod.slidesV1

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourcePresentationsPagesGetthumbnail extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The object ID of the page whose thumbnail to retrieve.
    */
  var pageObjectId: js.UndefOr[String] = js.native
  /**
    * The ID of the presentation to retrieve.
    */
  var presentationId: js.UndefOr[String] = js.native
  /**
    * The optional mime type of the thumbnail image.  If you don't specify the
    * mime type, the default mime type will be PNG.
    */
  @JSName("thumbnailProperties.mimeType")
  var thumbnailPropertiesDotmimeType: js.UndefOr[String] = js.native
  /**
    * The optional thumbnail image size.  If you don't specify the size, the
    * server chooses a default size of the image.
    */
  @JSName("thumbnailProperties.thumbnailSize")
  var thumbnailPropertiesDotthumbnailSize: js.UndefOr[String] = js.native
}

