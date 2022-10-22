package typingsJapgolly.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dismantle extends StObject {
  
  var dismantle: typingsJapgolly.screeps.screepsInts.`2`
}
object Dismantle {
  
  inline def apply(): Dismantle = {
    val __obj = js.Dynamic.literal(dismantle = 2)
    __obj.asInstanceOf[Dismantle]
  }
  
  extension [Self <: Dismantle](x: Self) {
    
    inline def setDismantle(value: typingsJapgolly.screeps.screepsInts.`2`): Self = StObject.set(x, "dismantle", value.asInstanceOf[js.Any])
  }
}
