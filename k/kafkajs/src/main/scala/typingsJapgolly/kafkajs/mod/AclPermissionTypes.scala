package typingsJapgolly.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AclPermissionTypes extends StObject
@JSImport("kafkajs", "AclPermissionTypes")
@js.native
object AclPermissionTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AclPermissionTypes & Double] = js.native
  
  @js.native
  sealed trait ALLOW
    extends StObject
       with AclPermissionTypes
  /* 3 */ val ALLOW: typingsJapgolly.kafkajs.mod.AclPermissionTypes.ALLOW & Double = js.native
  
  @js.native
  sealed trait ANY
    extends StObject
       with AclPermissionTypes
  /* 1 */ val ANY: typingsJapgolly.kafkajs.mod.AclPermissionTypes.ANY & Double = js.native
  
  @js.native
  sealed trait DENY
    extends StObject
       with AclPermissionTypes
  /* 2 */ val DENY: typingsJapgolly.kafkajs.mod.AclPermissionTypes.DENY & Double = js.native
  
  @js.native
  sealed trait UNKNOWN
    extends StObject
       with AclPermissionTypes
  /* 0 */ val UNKNOWN: typingsJapgolly.kafkajs.mod.AclPermissionTypes.UNKNOWN & Double = js.native
}
