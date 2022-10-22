package typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TetheringCapability extends StObject
/** Defines values that can be returned after calling getTetheringCapability to indicate the tethering capabilities of a network account. */
@JSGlobal("Windows.Networking.NetworkOperators.TetheringCapability")
@js.native
object TetheringCapability extends StObject {
  
  /** Tethering is disabled according to the current group policy. */
  @js.native
  sealed trait disabledByGroupPolicy
    extends StObject
       with TetheringCapability
  
  /** Tethering not available due to hardware limitations. */
  @js.native
  sealed trait disabledByHardwareLimitation
    extends StObject
       with TetheringCapability
  
  /** Tethering operations disabled for this account by the network operator. */
  @js.native
  sealed trait disabledByOperator
    extends StObject
       with TetheringCapability
  
  /** An application required for tethering operations is not available. */
  @js.native
  sealed trait disabledByRequiredAppNotInstalled
    extends StObject
       with TetheringCapability
  
  /** Tethering is not supported by the current account services. */
  @js.native
  sealed trait disabledBySku
    extends StObject
       with TetheringCapability
  
  /** Tethering has been disabled by the system because the app lacks the necessary DeviceCapability entry in its manifest. See CreateFromConnectionProfile for more information about manifest requirements. */
  @js.native
  sealed trait disabledBySystemCapability
    extends StObject
       with TetheringCapability
  
  /** Tethering is disabled for unknown reasons. */
  @js.native
  sealed trait disabledDueToUnknownCause
    extends StObject
       with TetheringCapability
  
  /** Tethering is enabled. */
  @js.native
  sealed trait enabled
    extends StObject
       with TetheringCapability
}
