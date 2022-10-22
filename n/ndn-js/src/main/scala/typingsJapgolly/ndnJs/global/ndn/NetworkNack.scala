package typingsJapgolly.ndnJs.global.ndn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ndn.NetworkNack")
@js.native
open class NetworkNack ()
  extends typingsJapgolly.ndnJs.mod.NetworkNack
object NetworkNack {
  
  @JSGlobal("ndn.NetworkNack.Reason")
  @js.native
  object Reason extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ndnJs.networkNackMod.NetworkNack.Reason & Double] = js.native
    
    /* 50 */ val CONGESTION: typingsJapgolly.ndnJs.networkNackMod.NetworkNack.Reason.CONGESTION & Double = js.native
    
    /* 100 */ val DUPLICATE: typingsJapgolly.ndnJs.networkNackMod.NetworkNack.Reason.DUPLICATE & Double = js.native
    
    /* 0 */ val NONE: typingsJapgolly.ndnJs.networkNackMod.NetworkNack.Reason.NONE & Double = js.native
    
    /* 150 */ val NO_ROUTE: typingsJapgolly.ndnJs.networkNackMod.NetworkNack.Reason.NO_ROUTE & Double = js.native
    
    /* 0x7fff */ val OTHER_CODE: typingsJapgolly.ndnJs.networkNackMod.NetworkNack.Reason.OTHER_CODE & Double = js.native
  }
}
