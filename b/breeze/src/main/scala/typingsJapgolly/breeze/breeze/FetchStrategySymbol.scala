package typingsJapgolly.breeze.breeze

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.breeze.breeze.core.EnumSymbol
import typingsJapgolly.breeze.breeze.core.IEnum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FetchStrategySymbol
  extends StObject
     with EnumSymbol {
  
  /* private */ var foo: Any
}
object FetchStrategySymbol {
  
  inline def apply(foo: Any, getName: CallbackTo[String], parentEnum: IEnum): FetchStrategySymbol = {
    val __obj = js.Dynamic.literal(foo = foo.asInstanceOf[js.Any], getName = getName.toJsFn, parentEnum = parentEnum.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchStrategySymbol]
  }
  
  extension [Self <: FetchStrategySymbol](x: Self) {
    
    inline def setFoo(value: Any): Self = StObject.set(x, "foo", value.asInstanceOf[js.Any])
  }
}
