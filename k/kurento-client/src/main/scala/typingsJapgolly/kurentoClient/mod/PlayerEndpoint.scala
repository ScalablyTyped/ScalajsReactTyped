package typingsJapgolly.kurentoClient.mod

import typingsJapgolly.kurentoClient.anon.EventEndOfStream
import typingsJapgolly.kurentoClient.kurentoClientStrings.EndOfStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlayerEndpoint
  extends StObject
     with UriEndpoint {
  
  var mediaPipeline: MediaPipeline = js.native
  
  var networkCache: js.UndefOr[Double] = js.native
  
  @JSName("on")
  def on_EndOfStream(eventName: EndOfStream, callback: js.Function1[/* event */ EventEndOfStream, Unit]): PlayerEndpoint = js.native
  
  def play(): js.Promise[Unit] = js.native
  def play(callback: js.Function1[/* error */ Error, Unit]): js.Promise[Unit] = js.native
  
  var uri: String = js.native
  
  var useEncodedMedia: js.UndefOr[Boolean] = js.native
}
