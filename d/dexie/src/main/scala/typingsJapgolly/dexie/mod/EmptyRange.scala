package typingsJapgolly.dexie.mod

import typingsJapgolly.dexie.dexieInts.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmptyRange
  extends StObject
     with IntervalTree {
  
  var d: `0`
}
object EmptyRange {
  
  inline def apply(): EmptyRange = {
    val __obj = js.Dynamic.literal(d = 0)
    __obj.asInstanceOf[EmptyRange]
  }
  
  extension [Self <: EmptyRange](x: Self) {
    
    inline def setD(value: `0`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
  }
}
