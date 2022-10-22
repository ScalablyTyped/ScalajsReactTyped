package typingsJapgolly.achingbrainSsdp

import org.scalajs.dom.AbortSignal
import typingsJapgolly.achingbrainSsdp.mod.SSDP
import typingsJapgolly.achingbrainSsdp.mod.SSDPSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCreateSocketsMod {
  
  @JSImport("@achingbrain/ssdp/dist/src/create-sockets", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createSockets(ssdp: SSDP, signal: AbortSignal): js.Promise[js.Array[SSDPSocket]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSockets")(ssdp.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[SSDPSocket]]]
}
