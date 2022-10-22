package typingsJapgolly.ssh2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignalInfo extends StObject {
  
  /** The signal name (e.g. SIGUSR1). */
  var name: String
}
object SignalInfo {
  
  inline def apply(name: String): SignalInfo = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignalInfo]
  }
  
  extension [Self <: SignalInfo](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
