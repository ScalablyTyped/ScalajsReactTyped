package typingsJapgolly.ndnJs.global.ndn

import typingsJapgolly.ndnJs.faceMod.FaceCtorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ndn.Face")
@js.native
open class Face ()
  extends typingsJapgolly.ndnJs.mod.Face {
  def this(settings: FaceCtorOptions) = this()
  def this(
    transport: typingsJapgolly.ndnJs.transportMod.Transport,
    connectionInfo: typingsJapgolly.ndnJs.transportMod.TransportConnectionInfo
  ) = this()
}
/* static members */
object Face {
  
  @JSGlobal("ndn.Face")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getMaxNdnPacketSize(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMaxNdnPacketSize")().asInstanceOf[Double]
}
