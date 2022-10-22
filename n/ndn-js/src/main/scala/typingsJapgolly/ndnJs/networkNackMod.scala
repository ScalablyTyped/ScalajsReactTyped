package typingsJapgolly.ndnJs

import typingsJapgolly.ndnJs.networkNackMod.NetworkNack.Reason
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object networkNackMod {
  
  @JSImport("ndn-js/network-nack", "NetworkNack")
  @js.native
  open class NetworkNack () extends StObject {
    
    def getOtherReasonCode(): Double = js.native
    
    def getReason(): Reason = js.native
  }
  object NetworkNack {
    
    @js.native
    sealed trait Reason extends StObject
    @JSImport("ndn-js/network-nack", "NetworkNack.Reason")
    @js.native
    object Reason extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[Reason & Double] = js.native
      
      @js.native
      sealed trait CONGESTION
        extends StObject
           with Reason
      /* 50 */ val CONGESTION: typingsJapgolly.ndnJs.networkNackMod.NetworkNack.Reason.CONGESTION & Double = js.native
      
      @js.native
      sealed trait DUPLICATE
        extends StObject
           with Reason
      /* 100 */ val DUPLICATE: typingsJapgolly.ndnJs.networkNackMod.NetworkNack.Reason.DUPLICATE & Double = js.native
      
      @js.native
      sealed trait NONE
        extends StObject
           with Reason
      /* 0 */ val NONE: typingsJapgolly.ndnJs.networkNackMod.NetworkNack.Reason.NONE & Double = js.native
      
      @js.native
      sealed trait NO_ROUTE
        extends StObject
           with Reason
      /* 150 */ val NO_ROUTE: typingsJapgolly.ndnJs.networkNackMod.NetworkNack.Reason.NO_ROUTE & Double = js.native
      
      @js.native
      sealed trait OTHER_CODE
        extends StObject
           with Reason
      /* 0x7fff */ val OTHER_CODE: typingsJapgolly.ndnJs.networkNackMod.NetworkNack.Reason.OTHER_CODE & Double = js.native
    }
  }
}
