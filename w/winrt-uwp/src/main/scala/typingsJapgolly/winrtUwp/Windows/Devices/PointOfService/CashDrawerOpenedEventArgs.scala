package typingsJapgolly.winrtUwp.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This object is passed as a parameter to the event handlers for the DrawerOpened event. */
trait CashDrawerOpenedEventArgs extends StObject {
  
  /** Gets the data associated with the DrawerOpened event. */
  var cashDrawer: CashDrawer
}
object CashDrawerOpenedEventArgs {
  
  inline def apply(cashDrawer: CashDrawer): CashDrawerOpenedEventArgs = {
    val __obj = js.Dynamic.literal(cashDrawer = cashDrawer.asInstanceOf[js.Any])
    __obj.asInstanceOf[CashDrawerOpenedEventArgs]
  }
  
  extension [Self <: CashDrawerOpenedEventArgs](x: Self) {
    
    inline def setCashDrawer(value: CashDrawer): Self = StObject.set(x, "cashDrawer", value.asInstanceOf[js.Any])
  }
}
