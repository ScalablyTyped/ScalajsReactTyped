package typingsJapgolly.iobroker.objectsMod.global.ioBroker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines access rights for a single state object */
trait StateACL
  extends StObject
     with ObjectACL {
  
  /** Linux-type permissions defining access to this state */
  var state: Double
}
object StateACL {
  
  inline def apply(`object`: Double, owner: String, ownerGroup: String, state: Double): StateACL = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], ownerGroup = ownerGroup.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateACL]
  }
  
  extension [Self <: StateACL](x: Self) {
    
    inline def setState(value: Double): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
