package typingsJapgolly.camljs.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFinalizable
  extends StObject
     with IFinalizableToString {
  
  /** Get the resulting CAML query as SP.CamlQuery object */
  def ToCamlQuery(): Any
}
object IFinalizable {
  
  inline def apply(ToCamlQuery: CallbackTo[Any], ToString: CallbackTo[String]): IFinalizable = {
    val __obj = js.Dynamic.literal(ToCamlQuery = ToCamlQuery.toJsFn, ToString = ToString.toJsFn)
    __obj.asInstanceOf[IFinalizable]
  }
  
  extension [Self <: IFinalizable](x: Self) {
    
    inline def setToCamlQuery(value: CallbackTo[Any]): Self = StObject.set(x, "ToCamlQuery", value.toJsFn)
  }
}
