package typingsJapgolly.std.global

import org.scalajs.dom.RTCConfiguration
import typingsJapgolly.std.AlgorithmIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("RTCPeerConnection")
@js.native
/* standard dom */
open class RTCPeerConnection ()
  extends StObject
     with typingsJapgolly.std.RTCPeerConnection {
  def this(configuration: RTCConfiguration) = this()
}
object RTCPeerConnection {
  
  @JSGlobal("RTCPeerConnection")
  @js.native
  val ^ : js.Any = js.native
  
  /* standard dom */
  inline def generateCertificate(keygenAlgorithm: AlgorithmIdentifier): js.Promise[typingsJapgolly.std.RTCCertificate] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateCertificate")(keygenAlgorithm.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.std.RTCCertificate]]
}
