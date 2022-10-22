package typingsJapgolly.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Capacity extends StObject {
  
  var capacity: typingsJapgolly.screeps.screepsInts.`2`
}
object Capacity {
  
  inline def apply(): Capacity = {
    val __obj = js.Dynamic.literal(capacity = 2)
    __obj.asInstanceOf[Capacity]
  }
  
  extension [Self <: Capacity](x: Self) {
    
    inline def setCapacity(value: typingsJapgolly.screeps.screepsInts.`2`): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
  }
}
