package typingsJapgolly.ndnJs.mod

import typingsJapgolly.ndnJs.faceMod.FaceCtorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ndn-js", "Face")
@js.native
open class Face ()
  extends typingsJapgolly.ndnJs.faceMod.Face {
  def this(settings: FaceCtorOptions) = this()
  def this(
    transport: typingsJapgolly.ndnJs.transportMod.Transport,
    connectionInfo: typingsJapgolly.ndnJs.transportMod.TransportConnectionInfo
  ) = this()
}
/* static members */
object Face {
  
  @JSImport("ndn-js", "Face")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getMaxNdnPacketSize(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMaxNdnPacketSize")().asInstanceOf[Double]
}
