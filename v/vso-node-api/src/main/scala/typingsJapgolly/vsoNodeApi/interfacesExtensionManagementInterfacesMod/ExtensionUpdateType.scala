package typingsJapgolly.vsoNodeApi.interfacesExtensionManagementInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExtensionUpdateType extends StObject
@JSImport("vso-node-api/interfaces/ExtensionManagementInterfaces", "ExtensionUpdateType")
@js.native
object ExtensionUpdateType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionUpdateType & Double] = js.native
  
  @js.native
  sealed trait ActionRequired
    extends StObject
       with ExtensionUpdateType
  /* 6 */ val ActionRequired: typingsJapgolly.vsoNodeApi.interfacesExtensionManagementInterfacesMod.ExtensionUpdateType.ActionRequired & Double = js.native
  
  @js.native
  sealed trait ActionResolved
    extends StObject
       with ExtensionUpdateType
  /* 7 */ val ActionResolved: typingsJapgolly.vsoNodeApi.interfacesExtensionManagementInterfacesMod.ExtensionUpdateType.ActionResolved & Double = js.native
  
  @js.native
  sealed trait Disabled
    extends StObject
       with ExtensionUpdateType
  /* 4 */ val Disabled: typingsJapgolly.vsoNodeApi.interfacesExtensionManagementInterfacesMod.ExtensionUpdateType.Disabled & Double = js.native
  
  @js.native
  sealed trait Enabled
    extends StObject
       with ExtensionUpdateType
  /* 3 */ val Enabled: typingsJapgolly.vsoNodeApi.interfacesExtensionManagementInterfacesMod.ExtensionUpdateType.Enabled & Double = js.native
  
  @js.native
  sealed trait Installed
    extends StObject
       with ExtensionUpdateType
  /* 1 */ val Installed: typingsJapgolly.vsoNodeApi.interfacesExtensionManagementInterfacesMod.ExtensionUpdateType.Installed & Double = js.native
  
  @js.native
  sealed trait Uninstalled
    extends StObject
       with ExtensionUpdateType
  /* 2 */ val Uninstalled: typingsJapgolly.vsoNodeApi.interfacesExtensionManagementInterfacesMod.ExtensionUpdateType.Uninstalled & Double = js.native
  
  @js.native
  sealed trait VersionUpdated
    extends StObject
       with ExtensionUpdateType
  /* 5 */ val VersionUpdated: typingsJapgolly.vsoNodeApi.interfacesExtensionManagementInterfacesMod.ExtensionUpdateType.VersionUpdated & Double = js.native
}
