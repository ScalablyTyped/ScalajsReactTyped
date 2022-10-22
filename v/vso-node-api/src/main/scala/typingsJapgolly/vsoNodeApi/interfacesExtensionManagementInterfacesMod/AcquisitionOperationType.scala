package typingsJapgolly.vsoNodeApi.interfacesExtensionManagementInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AcquisitionOperationType extends StObject
@JSImport("vso-node-api/interfaces/ExtensionManagementInterfaces", "AcquisitionOperationType")
@js.native
object AcquisitionOperationType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AcquisitionOperationType & Double] = js.native
  
  /**
    * Buy licenses for this extension and install into the host provided
    */
  @js.native
  sealed trait Buy
    extends StObject
       with AcquisitionOperationType
  /* 2 */ val Buy: typingsJapgolly.vsoNodeApi.interfacesExtensionManagementInterfacesMod.AcquisitionOperationType.Buy & Double = js.native
  
  /**
    * Not yet used
    */
  @js.native
  sealed trait Get
    extends StObject
       with AcquisitionOperationType
  /* 0 */ val Get: typingsJapgolly.vsoNodeApi.interfacesExtensionManagementInterfacesMod.AcquisitionOperationType.Get & Double = js.native
  
  /**
    * Install this extension into the host provided
    */
  @js.native
  sealed trait Install
    extends StObject
       with AcquisitionOperationType
  /* 1 */ val Install: typingsJapgolly.vsoNodeApi.interfacesExtensionManagementInterfacesMod.AcquisitionOperationType.Install & Double = js.native
  
  /**
    * No action found
    */
  @js.native
  sealed trait None
    extends StObject
       with AcquisitionOperationType
  /* 5 */ val None: typingsJapgolly.vsoNodeApi.interfacesExtensionManagementInterfacesMod.AcquisitionOperationType.None & Double = js.native
  
  /**
    * Request admins for purchasing extension
    */
  @js.native
  sealed trait PurchaseRequest
    extends StObject
       with AcquisitionOperationType
  /* 6 */ val PurchaseRequest: typingsJapgolly.vsoNodeApi.interfacesExtensionManagementInterfacesMod.AcquisitionOperationType.PurchaseRequest & Double = js.native
  
  /**
    * Request this extension for installation
    */
  @js.native
  sealed trait Request
    extends StObject
       with AcquisitionOperationType
  /* 4 */ val Request: typingsJapgolly.vsoNodeApi.interfacesExtensionManagementInterfacesMod.AcquisitionOperationType.Request & Double = js.native
  
  /**
    * Try this extension
    */
  @js.native
  sealed trait Try
    extends StObject
       with AcquisitionOperationType
  /* 3 */ val Try: typingsJapgolly.vsoNodeApi.interfacesExtensionManagementInterfacesMod.AcquisitionOperationType.Try & Double = js.native
}
