package typingsJapgolly.winrtUwp.Windows.Devices.Enumeration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Describes the physical location of a device in its enclosure. */
trait EnclosureLocation extends StObject {
  
  /** Indicates whether the device is physically located in the docking station of the portable computer. */
  var inDock: Boolean
  
  /** Indicates whether the device is physically located in the lid of the portable computer. */
  var inLid: Boolean
  
  /** Indicates which panel of the computer the device is physically located on. */
  var panel: Panel
}
object EnclosureLocation {
  
  inline def apply(inDock: Boolean, inLid: Boolean, panel: Panel): EnclosureLocation = {
    val __obj = js.Dynamic.literal(inDock = inDock.asInstanceOf[js.Any], inLid = inLid.asInstanceOf[js.Any], panel = panel.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnclosureLocation]
  }
  
  extension [Self <: EnclosureLocation](x: Self) {
    
    inline def setInDock(value: Boolean): Self = StObject.set(x, "inDock", value.asInstanceOf[js.Any])
    
    inline def setInLid(value: Boolean): Self = StObject.set(x, "inLid", value.asInstanceOf[js.Any])
    
    inline def setPanel(value: Panel): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
  }
}
