package typingsJapgolly.instagramPrivateApi

import typingsJapgolly.instagramPrivateApi.directThreadBroadcastMediaOptionsMod.DirectThreadBroadcastPhotoOptions
import typingsJapgolly.instagramPrivateApi.directThreadBroadcastMediaOptionsMod.DirectThreadBroadcastPhotoStoryOptions
import typingsJapgolly.instagramPrivateApi.directThreadBroadcastMediaOptionsMod.DirectThreadBroadcastVideoOptions
import typingsJapgolly.instagramPrivateApi.directThreadBroadcastMediaOptionsMod.DirectThreadBroadcastVideoStoryOptions
import typingsJapgolly.instagramPrivateApi.directThreadBroadcastMediaOptionsMod.DirectThreadBroadcastVoiceOptions
import typingsJapgolly.instagramPrivateApi.directThreadBroadcastReelOptionsMod.DirectThreadBroadcastReelOptions
import typingsJapgolly.instagramPrivateApi.directThreadRepositoryAddUserResponseMod.DirectThreadRepositoryAddUserResponseRootObject
import typingsJapgolly.instagramPrivateApi.directThreadRepositoryBroadcastResponseMod.DirectThreadRepositoryBroadcastResponsePayload
import typingsJapgolly.instagramPrivateApi.directThreadRepositoryBroadcastResponseMod.DirectThreadRepositoryBroadcastResponseRootObject
import typingsJapgolly.instagramPrivateApi.directThreadRepositoryUpdateTitleResponseMod.DirectThreadRepositoryUpdateTitleResponseRootObject
import typingsJapgolly.instagramPrivateApi.repositoryMod.Repository
import typingsJapgolly.instagramPrivateApi.statusResponseMod.StatusResponse
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/entities/direct-thread.entity", JSImport.Namespace)
@js.native
object directThreadEntityMod extends js.Object {
  @js.native
  class DirectThreadEntity () extends Repository {
    var broadcast: js.Any = js.native
    var threadId: String = js.native
    var userIds: js.Array[String] = js.native
    def addUser(userIds: js.Array[Double | String]): js.Promise[DirectThreadRepositoryAddUserResponseRootObject] = js.native
    def broadcastLink(link_text: String, link_urls: js.Array[String]): js.Promise[
        DirectThreadRepositoryBroadcastResponseRootObject | DirectThreadRepositoryBroadcastResponsePayload
      ] = js.native
    def broadcastPhoto(options: DirectThreadBroadcastPhotoOptions): js.Promise[
        DirectThreadRepositoryBroadcastResponseRootObject | DirectThreadRepositoryBroadcastResponsePayload
      ] = js.native
    def broadcastProfile(id: String): js.Promise[
        DirectThreadRepositoryBroadcastResponseRootObject | DirectThreadRepositoryBroadcastResponsePayload
      ] = js.native
    def broadcastProfile(id: Double): js.Promise[
        DirectThreadRepositoryBroadcastResponseRootObject | DirectThreadRepositoryBroadcastResponsePayload
      ] = js.native
    def broadcastReel(options: DirectThreadBroadcastReelOptions): js.Promise[
        DirectThreadRepositoryBroadcastResponseRootObject | DirectThreadRepositoryBroadcastResponsePayload
      ] = js.native
    def broadcastStory(input: DirectThreadBroadcastPhotoStoryOptions): js.Promise[_] = js.native
    def broadcastStory(input: DirectThreadBroadcastVideoStoryOptions): js.Promise[_] = js.native
    def broadcastStory(input: Buffer): js.Promise[_] = js.native
    def broadcastText(text: String): js.Promise[
        DirectThreadRepositoryBroadcastResponseRootObject | DirectThreadRepositoryBroadcastResponsePayload
      ] = js.native
    def broadcastUserStory(options: DirectThreadBroadcastReelOptions): js.Promise[
        DirectThreadRepositoryBroadcastResponseRootObject | DirectThreadRepositoryBroadcastResponsePayload
      ] = js.native
    def broadcastVideo(options: DirectThreadBroadcastVideoOptions): js.Promise[
        DirectThreadRepositoryBroadcastResponseRootObject | DirectThreadRepositoryBroadcastResponsePayload
      ] = js.native
    def broadcastVoice(options: DirectThreadBroadcastVoiceOptions): js.Promise[
        DirectThreadRepositoryBroadcastResponseRootObject | DirectThreadRepositoryBroadcastResponsePayload
      ] = js.native
    def deleteItem(itemId: String): js.Promise[StatusResponse] = js.native
    def deleteItem(itemId: Double): js.Promise[StatusResponse] = js.native
    def hide(): js.Promise[StatusResponse] = js.native
    def leave(): js.Promise[StatusResponse] = js.native
    def markItemSeen(threadItemId: String): js.Promise[StatusResponse] = js.native
    def mute(): js.Promise[StatusResponse] = js.native
    def unmute(): js.Promise[StatusResponse] = js.native
    def updateTitle(title: String): js.Promise[DirectThreadRepositoryUpdateTitleResponseRootObject] = js.native
  }
  
}

