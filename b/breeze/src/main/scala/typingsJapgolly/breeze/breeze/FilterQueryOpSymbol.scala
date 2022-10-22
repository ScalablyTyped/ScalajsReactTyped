package typingsJapgolly.breeze.breeze

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.breeze.breeze.core.EnumSymbol
import typingsJapgolly.breeze.breeze.core.IEnum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterQueryOpSymbol
  extends StObject
     with EnumSymbol {
  
  var operator: String
}
object FilterQueryOpSymbol {
  
  inline def apply(getName: CallbackTo[String], operator: String, parentEnum: IEnum): FilterQueryOpSymbol = {
    val __obj = js.Dynamic.literal(getName = getName.toJsFn, operator = operator.asInstanceOf[js.Any], parentEnum = parentEnum.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterQueryOpSymbol]
  }
  
  extension [Self <: FilterQueryOpSymbol](x: Self) {
    
    inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
  }
}
