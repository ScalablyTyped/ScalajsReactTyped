package typingsJapgolly.rethinkdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropResult extends StObject {
  
  var dropped: Double
}
object DropResult {
  
  inline def apply(dropped: Double): DropResult = {
    val __obj = js.Dynamic.literal(dropped = dropped.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropResult]
  }
  
  extension [Self <: DropResult](x: Self) {
    
    inline def setDropped(value: Double): Self = StObject.set(x, "dropped", value.asInstanceOf[js.Any])
  }
}
