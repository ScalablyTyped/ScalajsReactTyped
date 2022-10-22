package typingsJapgolly.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EStreamTransport extends StObject
@JSImport("steam-user", "EStreamTransport")
@js.native
object EStreamTransport extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EStreamTransport & Double] = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with EStreamTransport
  /* 0 */ val None: typingsJapgolly.steamUser.mod.EStreamTransport.None & Double = js.native
  
  @js.native
  sealed trait SDR
    extends StObject
       with EStreamTransport
  /* 4 */ val SDR: typingsJapgolly.steamUser.mod.EStreamTransport.SDR & Double = js.native
  
  @js.native
  sealed trait SNS
    extends StObject
       with EStreamTransport
  /* 6 */ val SNS: typingsJapgolly.steamUser.mod.EStreamTransport.SNS & Double = js.native
  
  @js.native
  sealed trait UDP
    extends StObject
       with EStreamTransport
  /* 1 */ val UDP: typingsJapgolly.steamUser.mod.EStreamTransport.UDP & Double = js.native
  
  @js.native
  sealed trait UDPRelay
    extends StObject
       with EStreamTransport
  /* 2 */ val UDPRelay: typingsJapgolly.steamUser.mod.EStreamTransport.UDPRelay & Double = js.native
  
  @js.native
  sealed trait UDPRelay_SNS
    extends StObject
       with EStreamTransport
  /* 6 */ val UDPRelay_SNS: typingsJapgolly.steamUser.mod.EStreamTransport.UDPRelay_SNS & Double = js.native
  
  @js.native
  sealed trait UDP_SNS
    extends StObject
       with EStreamTransport
  /* 5 */ val UDP_SNS: typingsJapgolly.steamUser.mod.EStreamTransport.UDP_SNS & Double = js.native
  
  @js.native
  sealed trait WebRTC
    extends StObject
       with EStreamTransport
  /* 3 */ val WebRTC: typingsJapgolly.steamUser.mod.EStreamTransport.WebRTC & Double = js.native
}
