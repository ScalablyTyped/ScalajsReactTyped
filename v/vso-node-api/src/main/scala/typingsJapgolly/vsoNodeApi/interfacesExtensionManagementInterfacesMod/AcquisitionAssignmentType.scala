package typingsJapgolly.vsoNodeApi.interfacesExtensionManagementInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AcquisitionAssignmentType extends StObject
@JSImport("vso-node-api/interfaces/ExtensionManagementInterfaces", "AcquisitionAssignmentType")
@js.native
object AcquisitionAssignmentType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AcquisitionAssignmentType & Double] = js.native
  
  /**
    * Assign for all users in the account
    */
  @js.native
  sealed trait All
    extends StObject
       with AcquisitionAssignmentType
  /* 2 */ val All: typingsJapgolly.vsoNodeApi.interfacesExtensionManagementInterfacesMod.AcquisitionAssignmentType.All & Double = js.native
  
  /**
    * Just assign for me
    */
  @js.native
  sealed trait Me
    extends StObject
       with AcquisitionAssignmentType
  /* 1 */ val Me: typingsJapgolly.vsoNodeApi.interfacesExtensionManagementInterfacesMod.AcquisitionAssignmentType.Me & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with AcquisitionAssignmentType
  /* 0 */ val None: typingsJapgolly.vsoNodeApi.interfacesExtensionManagementInterfacesMod.AcquisitionAssignmentType.None & Double = js.native
}
