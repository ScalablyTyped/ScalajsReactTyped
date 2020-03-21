package typingsJapgolly.instagramPrivateApi

import typingsJapgolly.instagramPrivateApi.commonTypesMod.IgResponse
import typingsJapgolly.instagramPrivateApi.igResponseErrorMod.IgResponseError
import typingsJapgolly.instagramPrivateApi.uploadRepositoryVideoResponseMod.UploadRepositoryVideoResponseRootObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/errors/ig-upload-video-error", JSImport.Namespace)
@js.native
object igUploadVideoErrorMod extends js.Object {
  @js.native
  class IgUploadVideoError protected ()
    extends IgResponseError[js.Any] {
    def this(response: IgResponse[UploadRepositoryVideoResponseRootObject], videoInfo: js.Any) = this()
    var videoInfo: js.Any = js.native
  }
  
}

