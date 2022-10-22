package typingsJapgolly.jssip.libRtcsessionMod

import org.scalajs.dom.MediaStream
import typingsJapgolly.std.RTCPeerConnection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCPeerConnectionDeprecated
  extends StObject
     with RTCPeerConnection {
  
  /**
    * @deprecated
    * @see https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection/getRemoteStreams
    */
  def getRemoteStreams(): js.Array[MediaStream] = js.native
}
