package typingsJapgolly.ndnJs.global.ndn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSGlobal("ndn.Transport")
@js.native
open class Transport ()
  extends typingsJapgolly.ndnJs.mod.Transport
/* static members */
object Transport {
  
  @JSGlobal("ndn.Transport")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("ndn.Transport.ConnectionInfo")
  @js.native
  def ConnectionInfo: typingsJapgolly.ndnJs.transportMod.TransportConnectionInfo = js.native
  inline def ConnectionInfo_=(x: typingsJapgolly.ndnJs.transportMod.TransportConnectionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ConnectionInfo")(x.asInstanceOf[js.Any])
}
