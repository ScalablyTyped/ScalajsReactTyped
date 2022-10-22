package typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VirtualServerStatus extends StObject
@JSImport("ts3-nodejs-library/lib/types/enum", "VirtualServerStatus")
@js.native
object VirtualServerStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[VirtualServerStatus & String] = js.native
  
  @js.native
  sealed trait BOOTING_UP
    extends StObject
       with VirtualServerStatus
  /* "booting up" */ val BOOTING_UP: typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.VirtualServerStatus.BOOTING_UP & String = js.native
  
  @js.native
  sealed trait DEPLOY_RUNNING
    extends StObject
       with VirtualServerStatus
  /* "deploy running" */ val DEPLOY_RUNNING: typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.VirtualServerStatus.DEPLOY_RUNNING & String = js.native
  
  @js.native
  sealed trait OFFLINE
    extends StObject
       with VirtualServerStatus
  /* "offline" */ val OFFLINE: typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.VirtualServerStatus.OFFLINE & String = js.native
  
  @js.native
  sealed trait ONLINE
    extends StObject
       with VirtualServerStatus
  /* "online" */ val ONLINE: typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.VirtualServerStatus.ONLINE & String = js.native
  
  @js.native
  sealed trait ONLINE_VIRTUAL
    extends StObject
       with VirtualServerStatus
  /* "online virtual" */ val ONLINE_VIRTUAL: typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.VirtualServerStatus.ONLINE_VIRTUAL & String = js.native
  
  @js.native
  sealed trait OTHER_INSTANCE
    extends StObject
       with VirtualServerStatus
  /* "other instance" */ val OTHER_INSTANCE: typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.VirtualServerStatus.OTHER_INSTANCE & String = js.native
  
  @js.native
  sealed trait SHUTTING_DOWN
    extends StObject
       with VirtualServerStatus
  /* "shutting down" */ val SHUTTING_DOWN: typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.VirtualServerStatus.SHUTTING_DOWN & String = js.native
  
  @js.native
  sealed trait UNKNOWN
    extends StObject
       with VirtualServerStatus
  /* "unknown" */ val UNKNOWN: typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.VirtualServerStatus.UNKNOWN & String = js.native
}
