package typingsJapgolly.ndnJs.mod

import typingsJapgolly.ndnJs.faceMod.FaceCtorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js", "Face")
@js.native
class Face ()
  extends typingsJapgolly.ndnJs.faceMod.Face {
  def this(settings: FaceCtorOptions) = this()
  def this(
    transport: typingsJapgolly.ndnJs.transportMod.Transport,
    connectionInfo: typingsJapgolly.ndnJs.transportMod.TransportConnectionInfo
  ) = this()
}

/* static members */
@JSImport("ndn-js", "Face")
@js.native
object Face extends js.Object {
  def getMaxNdnPacketSize(): Double = js.native
}

