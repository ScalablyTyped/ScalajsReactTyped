package typingsJapgolly.ssh2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubsystemInfo extends StObject {
  
  /** The name of the subsystem. */
  var name: String
}
object SubsystemInfo {
  
  inline def apply(name: String): SubsystemInfo = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubsystemInfo]
  }
  
  extension [Self <: SubsystemInfo](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
