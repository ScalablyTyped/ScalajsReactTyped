package typingsJapgolly.instagramPrivateApi.mod

import typingsJapgolly.instagramPrivateApi.mediaEntityOembedResponseMod.MediaEntityOembedResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api", "MediaEntity")
@js.native
class MediaEntity ()
  extends typingsJapgolly.instagramPrivateApi.entitiesMod.MediaEntity

/* static members */
@JSImport("instagram-private-api", "MediaEntity")
@js.native
object MediaEntity extends js.Object {
  def oembed(url: String): js.Promise[MediaEntityOembedResponse] = js.native
}

