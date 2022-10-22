package typingsJapgolly.winrtUwp.Windows.Devices.WiFiDirect.Services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WiFiDirectServiceError extends StObject
/** Values used for the WiFiDirectServiceAdvertiser.ServiceError property. */
@JSGlobal("Windows.Devices.WiFiDirect.Services.WiFiDirectServiceError")
@js.native
object WiFiDirectServiceError extends StObject {
  
  /** No Wi-Fi adapter is found. */
  @js.native
  sealed trait noHardware
    extends StObject
       with WiFiDirectServiceError
  
  /** The Wi-Fi Direct radio is not available. */
  @js.native
  sealed trait radioNotAvailable
    extends StObject
       with WiFiDirectServiceError
  
  /** A required resource is in use. */
  @js.native
  sealed trait resourceInUse
    extends StObject
       with WiFiDirectServiceError
  
  /** No error. */
  @js.native
  sealed trait success
    extends StObject
       with WiFiDirectServiceError
  
  /** The Wi-Fi adapter does not support Wi-Fi Direct. */
  @js.native
  sealed trait unsupportedHardware
    extends StObject
       with WiFiDirectServiceError
}
