package typingsJapgolly.kurentoClient.mod

import typingsJapgolly.kurentoClient.anon.EventPaused
import typingsJapgolly.kurentoClient.anon.EventRecording
import typingsJapgolly.kurentoClient.anon.EventStopped
import typingsJapgolly.kurentoClient.kurentoClientStrings.Paused
import typingsJapgolly.kurentoClient.kurentoClientStrings.Recording
import typingsJapgolly.kurentoClient.kurentoClientStrings.Stopped
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecorderEndpoint
  extends StObject
     with UriEndpoint {
  
  def getMaxOutputBitrate(): js.Promise[Double] = js.native
  def getMaxOutputBitrate(callback: Callback[Double]): js.Promise[Double] = js.native
  
  def getMinOutputBitrate(): js.Promise[Double] = js.native
  def getMinOutputBitrate(callback: Callback[Double]): js.Promise[Double] = js.native
  
  @JSName("on")
  def on_Paused(eventName: Paused, callback: js.Function1[/* event */ EventPaused, Unit]): RecorderEndpoint = js.native
  @JSName("on")
  def on_Recording(eventName: Recording, callback: js.Function1[/* event */ EventRecording, Unit]): RecorderEndpoint = js.native
  @JSName("on")
  def on_Stopped(eventName: Stopped, callback: js.Function1[/* event */ EventStopped, Unit]): RecorderEndpoint = js.native
  
  def record(): js.Promise[Unit] = js.native
  def record(callback: Callback[Unit]): js.Promise[Unit] = js.native
  
  def setMaxOutputBitrate(bitrate: Double): js.Promise[Double] = js.native
  def setMaxOutputBitrate(bitrate: Double, callback: Callback[Double]): js.Promise[Double] = js.native
  
  def setMinOutputBitrate(bitrate: Double): js.Promise[Double] = js.native
  def setMinOutputBitrate(bitrate: Double, callback: Callback[Double]): js.Promise[Double] = js.native
  
  def stopAndWait(): js.Promise[Unit] = js.native
  def stopAndWait(callback: Callback[Unit]): js.Promise[Unit] = js.native
  
  var stopOnEndOfStream: Boolean = js.native
  
  var uri: String = js.native
}
