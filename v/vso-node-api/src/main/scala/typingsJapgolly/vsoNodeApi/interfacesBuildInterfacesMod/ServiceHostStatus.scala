package typingsJapgolly.vsoNodeApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ServiceHostStatus extends StObject
@JSImport("vso-node-api/interfaces/BuildInterfaces", "ServiceHostStatus")
@js.native
object ServiceHostStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ServiceHostStatus & Double] = js.native
  
  /**
    * The service host is currently disconnected and not accepting commands.
    */
  @js.native
  sealed trait Offline
    extends StObject
       with ServiceHostStatus
  /* 2 */ val Offline: typingsJapgolly.vsoNodeApi.interfacesBuildInterfacesMod.ServiceHostStatus.Offline & Double = js.native
  
  /**
    * The service host is currently connected and accepting commands.
    */
  @js.native
  sealed trait Online
    extends StObject
       with ServiceHostStatus
  /* 1 */ val Online: typingsJapgolly.vsoNodeApi.interfacesBuildInterfacesMod.ServiceHostStatus.Online & Double = js.native
}
