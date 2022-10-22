package typingsJapgolly.kurentoClient.mod

import typingsJapgolly.kurentoClient.anon.NetworkCache
import typingsJapgolly.kurentoClient.anon.UseDataChannels
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientInstance extends StObject {
  
  def close(): Unit = js.native
  
  def create(`type`: String): js.Promise[MediaElement] = js.native
  def create(`type`: String, options: Record[String, Any]): js.Promise[MediaElement] = js.native
  @JSName("create")
  def create_Composite(`type`: typingsJapgolly.kurentoClient.kurentoClientStrings.Composite): js.Promise[Composite] = js.native
  @JSName("create")
  def create_MediaPipeline(`type`: typingsJapgolly.kurentoClient.kurentoClientStrings.MediaPipeline): js.Promise[MediaPipeline] = js.native
  @JSName("create")
  def create_PlayerEndpoint(`type`: typingsJapgolly.kurentoClient.kurentoClientStrings.PlayerEndpoint): js.Promise[PlayerEndpoint] = js.native
  @JSName("create")
  def create_PlayerEndpoint(`type`: typingsJapgolly.kurentoClient.kurentoClientStrings.PlayerEndpoint, options: NetworkCache): js.Promise[PlayerEndpoint] = js.native
  @JSName("create")
  def create_RecorderEndpoint(
    `type`: typingsJapgolly.kurentoClient.kurentoClientStrings.RecorderEndpoint,
    options: RecorderEndpointOptions
  ): js.Promise[RecorderEndpoint] = js.native
  @JSName("create")
  def create_RtpEndpoint(`type`: typingsJapgolly.kurentoClient.kurentoClientStrings.RtpEndpoint): js.Promise[RtpEndpoint] = js.native
  @JSName("create")
  def create_RtpEndpoint(
    `type`: typingsJapgolly.kurentoClient.kurentoClientStrings.RtpEndpoint,
    options: RtpEndpointOptions
  ): js.Promise[RtpEndpoint] = js.native
  @JSName("create")
  def create_WebRtcEndpoint(`type`: typingsJapgolly.kurentoClient.kurentoClientStrings.WebRtcEndpoint): js.Promise[WebRtcEndpoint] = js.native
  @JSName("create")
  def create_WebRtcEndpoint(
    `type`: typingsJapgolly.kurentoClient.kurentoClientStrings.WebRtcEndpoint,
    options: UseDataChannels
  ): js.Promise[WebRtcEndpoint] = js.native
  
  // tslint:disable-next-line
  def getMediaobjectById[T /* <: MediaObject */](objectId: String): js.Promise[T] = js.native
  
  def getServerManager(): js.Promise[ServerManager] = js.native
  def getServerManager(callback: Callback[ServerManager]): js.Promise[ServerManager] = js.native
}
