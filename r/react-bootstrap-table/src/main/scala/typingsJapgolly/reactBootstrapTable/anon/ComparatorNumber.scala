package typingsJapgolly.reactBootstrapTable.anon

import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComparatorNumber extends StObject {
  
  var comparator: CSSProperties
  
  var number: CSSProperties
}
object ComparatorNumber {
  
  inline def apply(comparator: CSSProperties, number: CSSProperties): ComparatorNumber = {
    val __obj = js.Dynamic.literal(comparator = comparator.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComparatorNumber]
  }
  
  extension [Self <: ComparatorNumber](x: Self) {
    
    inline def setComparator(value: CSSProperties): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: CSSProperties): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
  }
}
