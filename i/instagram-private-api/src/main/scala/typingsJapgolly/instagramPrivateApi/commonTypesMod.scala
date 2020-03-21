package typingsJapgolly.instagramPrivateApi

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.caseless.mod.Caseless
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.close
import typingsJapgolly.node.NodeJS.ReadableStream
import typingsJapgolly.node.NodeJS.WritableStream
import typingsJapgolly.node.httpMod.IncomingHttpHeaders
import typingsJapgolly.node.netMod.Socket
import typingsJapgolly.request.AnonConnect
import typingsJapgolly.request.AnonDns
import typingsJapgolly.request.mod.Request
import typingsJapgolly.request.mod.ResponseAsJSON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/types/common.types", JSImport.Namespace)
@js.native
object commonTypesMod extends js.Object {
  /* Inlined std.Pick<request.request.Response, std.Exclude<keyof request.request.Response, 'body'>> & {  body  :Body} */
  @js.native
  trait IgResponse[Body] extends js.Object {
    @JSName("_destroy")
    var _destroy_Original: js.Function2[
        /* error */ js.Error, 
        /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
        Unit
      ] = js.native
    @JSName("_read")
    var _read_Original: js.Function1[/* size */ Double, Unit] = js.native
    @JSName("addListener")
    var addListener_Original: js.Function2[close, /* listener */ js.Function0[Unit], this.type] = js.native
    var body: Body = js.native
    var caseless: Caseless = js.native
    var complete: Boolean = js.native
    var connection: Socket = js.native
    @JSName("constructor")
    var constructor_Original: js.Function1[/* socket */ Socket, js.Any] = js.native
    var defaultMaxListeners: js.Any = js.native
    @JSName("destroy")
    var destroy_Original: js.Function0[Unit] = js.native
    var destroyed: Boolean = js.native
    var elapsedTime: js.UndefOr[Double] = js.native
    @JSName("emit")
    var emit_Original: js.Function1[close, Boolean] = js.native
    @JSName("eventNames")
    var eventNames_Original: js.Function0[js.Array[String | js.Symbol]] = js.native
    var from: js.Any = js.native
    @JSName("getMaxListeners")
    var getMaxListeners_Original: js.Function0[Double] = js.native
    var headers: IncomingHttpHeaders = js.native
    var httpVersion: String = js.native
    var httpVersionMajor: Double = js.native
    var httpVersionMinor: Double = js.native
    @JSName("isPaused")
    var isPaused_Original: js.Function0[Boolean] = js.native
    @JSName("listenerCount")
    var listenerCount_Original: js.Function1[/* type */ String, Double] = js.native
    @JSName("listeners")
    var listeners_Original: js.Function1[/* event */ String, js.Array[js.Function]] = js.native
    var method: js.UndefOr[String] = js.native
    @JSName("off")
    var off_Original: js.Function2[
        /* event */ String, 
        /* listener */ js.Function1[/* repeated */ js.Any, Unit], 
        this.type
      ] = js.native
    @JSName("on")
    var on_Original: js.Function2[close, /* listener */ js.Function0[Unit], this.type] = js.native
    @JSName("once")
    var once_Original: js.Function2[close, /* listener */ js.Function0[Unit], this.type] = js.native
    @JSName("pause")
    var pause_Original: js.Function0[this.type] = js.native
    @JSName("pipe")
    var pipe_Original: js.Function1[/* destination */ WritableStream, WritableStream] = js.native
    @JSName("prependListener")
    var prependListener_Original: js.Function2[close, /* listener */ js.Function0[Unit], this.type] = js.native
    @JSName("prependOnceListener")
    var prependOnceListener_Original: js.Function2[close, /* listener */ js.Function0[Unit], this.type] = js.native
    @JSName("push")
    var push_Original: js.Function1[/* chunk */ js.Any, Boolean] = js.native
    var rawHeaders: js.Array[String] = js.native
    @JSName("rawListeners")
    var rawListeners_Original: js.Function1[/* event */ String, js.Array[js.Function]] = js.native
    var rawTrailers: js.Array[String] = js.native
    @JSName("read")
    var read_Original: js.Function0[_] = js.native
    var readable: Boolean = js.native
    var readableHighWaterMark: Double = js.native
    var readableLength: Double = js.native
    var readableObjectMode: Boolean = js.native
    @JSName("removeAllListeners")
    var removeAllListeners_Original: js.Function0[this.type] = js.native
    @JSName("removeListener")
    var removeListener_Original: js.Function2[close, /* listener */ js.Function0[Unit], this.type] = js.native
    var request: Request = js.native
    @JSName("resume")
    var resume_Original: js.Function0[this.type] = js.native
    @JSName("setEncoding")
    var setEncoding_Original: js.Function1[/* encoding */ String, this.type] = js.native
    @JSName("setMaxListeners")
    var setMaxListeners_Original: js.Function1[/* n */ Double, this.type] = js.native
    @JSName("setTimeout")
    var setTimeout_Original: js.Function1[/* msecs */ Double, this.type] = js.native
    var socket: Socket = js.native
    var statusCode: Double = js.native
    var statusMessage: String = js.native
    var timingPhases: js.UndefOr[AnonDns] = js.native
    var timingStart: js.UndefOr[Double] = js.native
    var timings: js.UndefOr[AnonConnect] = js.native
    @JSName("toJSON")
    var toJSON_Original: js.Function0[ResponseAsJSON] = js.native
    var trailers: StringDictionary[js.UndefOr[String]] = js.native
    @JSName("unpipe")
    var unpipe_Original: js.Function0[this.type] = js.native
    @JSName("unshift")
    var unshift_Original: js.Function1[/* chunk */ js.Any, Unit] = js.native
    var url: js.UndefOr[String] = js.native
    @JSName("wrap")
    var wrap_Original: js.Function1[/* oldStream */ ReadableStream, this.type] = js.native
    def _destroy(error: js.Error, callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
    def _read(size: Double): Unit = js.native
    @JSName("addListener")
    def addListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    def destroy(): Unit = js.native
    @JSName("emit")
    def emit_close(event: close): Boolean = js.native
    def eventNames(): js.Array[String | js.Symbol] = js.native
    def getMaxListeners(): Double = js.native
    def isPaused(): Boolean = js.native
    def listenerCount(`type`: String): Double = js.native
    def listeners(event: String): js.Array[js.Function] = js.native
    def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("on")
    def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    def pause(): this.type = js.native
    def pipe[T /* <: WritableStream */](destination: T): T = js.native
    @JSName("prependListener")
    def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    def push(chunk: js.Any): Boolean = js.native
    def rawListeners(event: String): js.Array[js.Function] = js.native
    def read(): js.Any = js.native
    def removeAllListeners(): this.type = js.native
    @JSName("removeListener")
    def removeListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    def resume(): this.type = js.native
    def setEncoding(encoding: String): this.type = js.native
    def setMaxListeners(n: Double): this.type = js.native
    def setTimeout(msecs: Double): this.type = js.native
    def toJSON(): ResponseAsJSON = js.native
    def unpipe(): this.type = js.native
    def unshift(chunk: js.Any): Unit = js.native
    def wrap(oldStream: ReadableStream): this.type = js.native
  }
  
  trait _IgAppModule extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.feed_timeline
    - typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.newsfeed
    - typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.profile
    - typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.media_view_profile
    - typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.video_view_profile
    - typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.photo_view_profile
    - typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.followers
    - typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.following
    - typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.self_followers
    - typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.self_following
    - typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.comment_likers
    - typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.comment_owner
    - typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.feed_contextual_post
    - typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.feed_contextual_hashtag
    - typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.feed_contextual_location
    - typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.feed_contextual_newsfeed_multi_media_liked
    - typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.likers_likers_media_view_profile
    - typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.likers_likers_photo_view_profile
    - typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.likers_likers_video_view_profile
    - typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.self_likers_self_likers_media_view_profile
    - typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.self_likers_self_likers_photo_view_profile
    - typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.self_likers_self_likers_video_view_profile
    - typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.story_camera_music_overlay_post_capture
    - typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.story_camera_music_overlay_pre_capture
    - typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.story_viewer_profile
    - typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.story_viewer_default
    - typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.find_friends_contacts
    - typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.explore_people
    - typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.igtv_feed_timeline
    - java.lang.String
  */
  type IgAppModule = _IgAppModule | String
}

