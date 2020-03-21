package typingsJapgolly.ndnJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js", "NetworkNack")
@js.native
class NetworkNack ()
  extends typingsJapgolly.ndnJs.networkNackMod.NetworkNack

@JSImport("ndn-js", "NetworkNack")
@js.native
object NetworkNack extends js.Object {
  @js.native
  object Reason extends js.Object {
    /* 50 */ val CONGESTION: typingsJapgolly.ndnJs.networkNackMod.NetworkNack.Reason.CONGESTION with Double = js.native
    /* 100 */ val DUPLICATE: typingsJapgolly.ndnJs.networkNackMod.NetworkNack.Reason.DUPLICATE with Double = js.native
    /* 0 */ val NONE: typingsJapgolly.ndnJs.networkNackMod.NetworkNack.Reason.NONE with Double = js.native
    /* 150 */ val NO_ROUTE: typingsJapgolly.ndnJs.networkNackMod.NetworkNack.Reason.NO_ROUTE with Double = js.native
    /* 0x7fff */ val OTHER_CODE: typingsJapgolly.ndnJs.networkNackMod.NetworkNack.Reason.OTHER_CODE with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ndnJs.networkNackMod.NetworkNack.Reason with Double] = js.native
  }
  
}

