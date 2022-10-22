package typingsJapgolly.achingbrainSsdp

import typingsJapgolly.achingbrainSsdp.mod.NetworkAddress
import typingsJapgolly.achingbrainSsdp.mod.SSDP
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcSendSsdpMessageMod {
  
  @JSImport("@achingbrain/ssdp/dist/src/send-ssdp-message", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sendSsdpMessage(ssdp: SSDP, status: String, headers: Record[String, String], remote: NetworkAddress): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendSsdpMessage")(ssdp.asInstanceOf[js.Any], status.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], remote.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
