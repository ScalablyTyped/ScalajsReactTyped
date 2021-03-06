package typingsJapgolly.instagramPrivateApi

import typingsJapgolly.instagramPrivateApi.mediaEntityOembedResponseMod.MediaEntityOembedResponse
import typingsJapgolly.instagramPrivateApi.repositoryMod.Repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/entities/media.entity", JSImport.Namespace)
@js.native
object mediaEntityMod extends js.Object {
  @js.native
  class MediaEntity () extends Repository
  
  /* static members */
  @js.native
  object MediaEntity extends js.Object {
    def oembed(url: String): js.Promise[MediaEntityOembedResponse] = js.native
  }
  
}

