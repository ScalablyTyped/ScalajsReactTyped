package typingsJapgolly.std.global

import typingsJapgolly.std.RTCRtpCapabilities
import typingsJapgolly.std.RTCRtpContributingSource
import typingsJapgolly.std.RTCRtpReceiveParameters
import typingsJapgolly.std.RTCRtpSynchronizationSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("RTCRtpReceiver")
@js.native
/* standard dom */
open class RTCRtpReceiver ()
  extends StObject
     with typingsJapgolly.std.RTCRtpReceiver {
  
  /* standard dom */
  /* CompleteClass */
  override def getContributingSources(): js.Array[RTCRtpContributingSource] = js.native
  
  /* standard dom */
  /* CompleteClass */
  override def getParameters(): RTCRtpReceiveParameters = js.native
  
  /* standard dom */
  /* CompleteClass */
  override def getStats(): js.Promise[org.scalajs.dom.RTCStatsReport] = js.native
  
  /* standard dom */
  /* CompleteClass */
  override def getSynchronizationSources(): js.Array[RTCRtpSynchronizationSource] = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val track: org.scalajs.dom.MediaStreamTrack = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val transport: typingsJapgolly.std.RTCDtlsTransport | Null = js.native
}
object RTCRtpReceiver {
  
  @JSGlobal("RTCRtpReceiver")
  @js.native
  val ^ : js.Any = js.native
  
  /* standard dom */
  inline def getCapabilities(kind: java.lang.String): RTCRtpCapabilities | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getCapabilities")(kind.asInstanceOf[js.Any]).asInstanceOf[RTCRtpCapabilities | Null]
}
