package typingsJapgolly.instagramPrivateApi

import typingsJapgolly.instagramPrivateApi.liveObsSettingsMod.LiveRtmpSettings
import typingsJapgolly.instagramPrivateApi.mediaEntityOembedResponseMod.MediaEntityOembedResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/entities", JSImport.Namespace)
@js.native
object entitiesMod extends js.Object {
  @js.native
  class DirectThreadEntity ()
    extends typingsJapgolly.instagramPrivateApi.directThreadEntityMod.DirectThreadEntity
  
  @js.native
  class LiveEntity ()
    extends typingsJapgolly.instagramPrivateApi.liveEntityMod.LiveEntity
  
  @js.native
  class MediaEntity ()
    extends typingsJapgolly.instagramPrivateApi.mediaEntityMod.MediaEntity
  
  @js.native
  class ProfileEntity ()
    extends typingsJapgolly.instagramPrivateApi.profileEntityMod.ProfileEntity
  
  /* static members */
  @js.native
  object LiveEntity extends js.Object {
    def getUrlAndKey(info: AnonBroadcastid): LiveRtmpSettings = js.native
  }
  
  /* static members */
  @js.native
  object MediaEntity extends js.Object {
    def oembed(url: String): js.Promise[MediaEntityOembedResponse] = js.native
  }
  
}

