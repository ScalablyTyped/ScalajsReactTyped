package typingsJapgolly.winrtUwp.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the current power and availability status of the cash drawer. */
trait CashDrawerStatus extends StObject {
  
  /** ExtendedStatus provides a way for a Point of Service driver or provider to send custom notifications to the app. */
  var extendedStatus: Double
  
  /** Gets the status kind for the cash drawer status. */
  var statusKind: CashDrawerStatusKind
}
object CashDrawerStatus {
  
  inline def apply(extendedStatus: Double, statusKind: CashDrawerStatusKind): CashDrawerStatus = {
    val __obj = js.Dynamic.literal(extendedStatus = extendedStatus.asInstanceOf[js.Any], statusKind = statusKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[CashDrawerStatus]
  }
  
  extension [Self <: CashDrawerStatus](x: Self) {
    
    inline def setExtendedStatus(value: Double): Self = StObject.set(x, "extendedStatus", value.asInstanceOf[js.Any])
    
    inline def setStatusKind(value: CashDrawerStatusKind): Self = StObject.set(x, "statusKind", value.asInstanceOf[js.Any])
  }
}
