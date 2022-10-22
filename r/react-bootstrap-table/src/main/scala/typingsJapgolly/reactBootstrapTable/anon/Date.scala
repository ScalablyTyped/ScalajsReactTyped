package typingsJapgolly.reactBootstrapTable.anon

import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Date extends StObject {
  
  var comparator: CSSProperties
  
  var date: CSSProperties
}
object Date {
  
  inline def apply(comparator: CSSProperties, date: CSSProperties): Date = {
    val __obj = js.Dynamic.literal(comparator = comparator.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[Date]
  }
  
  extension [Self <: Date](x: Self) {
    
    inline def setComparator(value: CSSProperties): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
    
    inline def setDate(value: CSSProperties): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
  }
}
