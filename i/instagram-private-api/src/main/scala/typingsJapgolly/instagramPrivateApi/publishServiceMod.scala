package typingsJapgolly.instagramPrivateApi

import typingsJapgolly.bluebird.mod.^
import typingsJapgolly.instagramPrivateApi.mediaRepositoryConfigureResponseMod.MediaRepositoryConfigureResponseRootObject
import typingsJapgolly.instagramPrivateApi.postingAlbumOptionsMod.PostingAlbumOptions
import typingsJapgolly.instagramPrivateApi.postingIgtvOptionsMod.PostingIgtvOptions
import typingsJapgolly.instagramPrivateApi.postingPhotoOptionsMod.PostingPhotoOptions
import typingsJapgolly.instagramPrivateApi.postingPhotoOptionsMod.PostingStoryPhotoOptions
import typingsJapgolly.instagramPrivateApi.postingVideoOptionsMod.PostingStoryVideoOptions
import typingsJapgolly.instagramPrivateApi.postingVideoOptionsMod.PostingVideoOptions
import typingsJapgolly.instagramPrivateApi.repositoryMod.Repository
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/services/publish.service", JSImport.Namespace)
@js.native
object publishServiceMod extends js.Object {
  @js.native
  class PublishService () extends Repository {
    var chance: js.Any = js.native
    var regularVideo: js.Any = js.native
    var segmentedVideo: js.Any = js.native
    var uploadAndConfigureStoryPhoto: js.Any = js.native
    var uploadAndConfigureStoryVideo: js.Any = js.native
    def album(options: PostingAlbumOptions): js.Promise[_] = js.native
    def igtvVideo(options: PostingIgtvOptions): js.Promise[_] = js.native
    def photo(options: PostingPhotoOptions): js.Promise[MediaRepositoryConfigureResponseRootObject] = js.native
    def story(options: PostingStoryPhotoOptions): js.Promise[_] = js.native
    def story(options: PostingStoryVideoOptions): js.Promise[_] = js.native
    def video(options: PostingVideoOptions): js.Promise[MediaRepositoryConfigureResponseRootObject] = js.native
  }
  
  /* static members */
  @js.native
  object PublishService extends js.Object {
    var makeLocationOptions: js.Any = js.native
    var publishDebug: js.Any = js.native
    var read16: js.Any = js.native
    var read32: js.Any = js.native
    def catchTranscodeError(videoInfo: js.Any, transcodeDelayInMs: Double): js.Function1[/* error */ js.Any, ^[Unit]] = js.native
    def getMP4Duration(buffer: Buffer): Double = js.native
    def getVideoInfo(buffer: Buffer): AnonDuration = js.native
  }
  
}

