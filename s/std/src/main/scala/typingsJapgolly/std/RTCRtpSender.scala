package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the ability to control and obtain details about how a particular MediaStreamTrack is encoded and sent to a remote peer. */
@js.native
trait RTCRtpSender extends StObject {
  
  /* standard dom */
  val dtmf: org.scalajs.dom.RTCDTMFSender | Null = js.native
  
  /* standard dom */
  def getParameters(): RTCRtpSendParameters = js.native
  
  /* standard dom */
  def getStats(): js.Promise[org.scalajs.dom.RTCStatsReport] = js.native
  
  /* standard dom */
  def replaceTrack(): js.Promise[Unit] = js.native
  def replaceTrack(withTrack: org.scalajs.dom.MediaStreamTrack): js.Promise[Unit] = js.native
  
  /* standard dom */
  def setParameters(parameters: RTCRtpSendParameters): js.Promise[Unit] = js.native
  
  /* standard dom */
  def setStreams(streams: org.scalajs.dom.MediaStream*): Unit = js.native
  
  /* standard dom */
  val track: org.scalajs.dom.MediaStreamTrack | Null = js.native
  
  /* standard dom */
  val transport: RTCDtlsTransport | Null = js.native
}
