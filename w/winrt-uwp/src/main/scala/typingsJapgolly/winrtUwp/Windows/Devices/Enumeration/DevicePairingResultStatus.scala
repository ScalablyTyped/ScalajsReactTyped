package typingsJapgolly.winrtUwp.Windows.Devices.Enumeration

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DevicePairingResultStatus extends js.Object

/** The result of the pairing action with an Association Endpoint (AEP) device object. For more information about AEP objects, see DeviceInformationKind . */
@JSGlobal("Windows.Devices.Enumeration.DevicePairingResultStatus")
@js.native
object DevicePairingResultStatus extends js.Object {
  /** Your application does not have the appropriate permissions level to pair the device object. */
  @js.native
  sealed trait accessDenied extends DevicePairingResultStatus
  
  /** The device object has already been paired. */
  @js.native
  sealed trait alreadyPaired extends DevicePairingResultStatus
  
  /** Authentication failed, so the device is not paired. Either the device object or the application rejected the authentication. */
  @js.native
  sealed trait authenticationFailure extends DevicePairingResultStatus
  
  /** The authentication protocol is not supported, so the device is not paired. */
  @js.native
  sealed trait authenticationNotAllowed extends DevicePairingResultStatus
  
  /** The authentication process timed out before it could complete. */
  @js.native
  sealed trait authenticationTimeout extends DevicePairingResultStatus
  
  /** The device object rejected the connection. */
  @js.native
  sealed trait connectionRejected extends DevicePairingResultStatus
  
  /** An unknown failure occurred. */
  @js.native
  sealed trait failed extends DevicePairingResultStatus
  
  /** The device object indicated there was a hardware failure. */
  @js.native
  sealed trait hardwareFailure extends DevicePairingResultStatus
  
  /** The ceremony data was incorrect. */
  @js.native
  sealed trait invalidCeremonyData extends DevicePairingResultStatus
  
  /** There are no network profiles for this device object to use. */
  @js.native
  sealed trait noSupportedProfiles extends DevicePairingResultStatus
  
  /** The device object is not currently paired. */
  @js.native
  sealed trait notPaired extends DevicePairingResultStatus
  
  /** The device object is not in a state where it can be paired. */
  @js.native
  sealed trait notReadyToPair extends DevicePairingResultStatus
  
  /** The device object is already attempting to pair or unpair. */
  @js.native
  sealed trait operationAlreadyInProgress extends DevicePairingResultStatus
  
  /** The device object is now paired. */
  @js.native
  sealed trait paired extends DevicePairingResultStatus
  
  /** The pairing action was canceled before completion. */
  @js.native
  sealed trait pairingCanceled extends DevicePairingResultStatus
  
  /** The minimum level of protection is not supported by the device object or the application. */
  @js.native
  sealed trait protectionLevelCouldNotBeMet extends DevicePairingResultStatus
  
  /** The application handler rejected the pairing. */
  @js.native
  sealed trait rejectedByHandler extends DevicePairingResultStatus
  
  /** The remove device already has an association. */
  @js.native
  sealed trait remoteDeviceHasAssociation extends DevicePairingResultStatus
  
  /** Either the event handler wasn't registered or a required DevicePairingKinds was not supported. */
  @js.native
  sealed trait requiredHandlerNotRegistered extends DevicePairingResultStatus
  
  /** The device object indicated it cannot accept any more incoming connections. */
  @js.native
  sealed trait tooManyConnections extends DevicePairingResultStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DevicePairingResultStatus with Double] = js.native
  /* 12 */ @js.native
  object accessDenied extends TopLevel[accessDenied with Double]
  
  /* 3 */ @js.native
  object alreadyPaired extends TopLevel[alreadyPaired with Double]
  
  /* 9 */ @js.native
  object authenticationFailure extends TopLevel[authenticationFailure with Double]
  
  /* 8 */ @js.native
  object authenticationNotAllowed extends TopLevel[authenticationNotAllowed with Double]
  
  /* 7 */ @js.native
  object authenticationTimeout extends TopLevel[authenticationTimeout with Double]
  
  /* 4 */ @js.native
  object connectionRejected extends TopLevel[connectionRejected with Double]
  
  /* 19 */ @js.native
  object failed extends TopLevel[failed with Double]
  
  /* 6 */ @js.native
  object hardwareFailure extends TopLevel[hardwareFailure with Double]
  
  /* 13 */ @js.native
  object invalidCeremonyData extends TopLevel[invalidCeremonyData with Double]
  
  /* 10 */ @js.native
  object noSupportedProfiles extends TopLevel[noSupportedProfiles with Double]
  
  /* 2 */ @js.native
  object notPaired extends TopLevel[notPaired with Double]
  
  /* 1 */ @js.native
  object notReadyToPair extends TopLevel[notReadyToPair with Double]
  
  /* 15 */ @js.native
  object operationAlreadyInProgress extends TopLevel[operationAlreadyInProgress with Double]
  
  /* 0 */ @js.native
  object paired extends TopLevel[paired with Double]
  
  /* 14 */ @js.native
  object pairingCanceled extends TopLevel[pairingCanceled with Double]
  
  /* 11 */ @js.native
  object protectionLevelCouldNotBeMet extends TopLevel[protectionLevelCouldNotBeMet with Double]
  
  /* 17 */ @js.native
  object rejectedByHandler extends TopLevel[rejectedByHandler with Double]
  
  /* 18 */ @js.native
  object remoteDeviceHasAssociation extends TopLevel[remoteDeviceHasAssociation with Double]
  
  /* 16 */ @js.native
  object requiredHandlerNotRegistered extends TopLevel[requiredHandlerNotRegistered with Double]
  
  /* 5 */ @js.native
  object tooManyConnections extends TopLevel[tooManyConnections with Double]
  
}

