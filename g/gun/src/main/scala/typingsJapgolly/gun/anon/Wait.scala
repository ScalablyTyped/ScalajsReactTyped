package typingsJapgolly.gun.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Wait extends StObject {
  
  @JSName("wait")
  var wait_FWait: Double
}
object Wait {
  
  inline def apply(wait_ : Double): Wait = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("wait")(wait_.asInstanceOf[js.Any])
    __obj.asInstanceOf[Wait]
  }
  
  extension [Self <: Wait](x: Self) {
    
    inline def setWait_(value: Double): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
  }
}
