package typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TetheringOperationStatus extends StObject
/** Defines the values returned with a NetworkOperatorTetheringOperationResult object to indicate the status of a tethering operation. */
@JSGlobal("Windows.Networking.NetworkOperators.TetheringOperationStatus")
@js.native
object TetheringOperationStatus extends StObject {
  
  /** The operation did not complete because the account does not currently support tethering operations. */
  @js.native
  sealed trait entitlementCheckFailure
    extends StObject
       with TetheringOperationStatus
  
  /** The operation did not complete because the mobile operator could not be contacted to confirm tethering capabilities are provided for this account. */
  @js.native
  sealed trait entitlementCheckTimeout
    extends StObject
       with TetheringOperationStatus
  
  /** The operation could not begin because the mobile broadband device is turned off. */
  @js.native
  sealed trait mobileBroadbandDeviceOff
    extends StObject
       with TetheringOperationStatus
  
  /** The operation is still in progress. */
  @js.native
  sealed trait operationInProgress
    extends StObject
       with TetheringOperationStatus
  
  /** The operation completed successfully. */
  @js.native
  sealed trait success
    extends StObject
       with TetheringOperationStatus
  
  /** The status of the operation is unknown. */
  @js.native
  sealed trait unknown
    extends StObject
       with TetheringOperationStatus
  
  /** The operation could not begin because the Wifi device is turned off. */
  @js.native
  sealed trait wiFiDeviceOff
    extends StObject
       with TetheringOperationStatus
}
