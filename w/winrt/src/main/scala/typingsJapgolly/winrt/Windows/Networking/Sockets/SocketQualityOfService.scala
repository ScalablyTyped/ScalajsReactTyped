package typingsJapgolly.winrt.Windows.Networking.Sockets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SocketQualityOfService extends StObject
@JSGlobal("Windows.Networking.Sockets.SocketQualityOfService")
@js.native
object SocketQualityOfService extends StObject {
  
  @js.native
  sealed trait lowLatency
    extends StObject
       with SocketQualityOfService
  
  @js.native
  sealed trait normal
    extends StObject
       with SocketQualityOfService
}
