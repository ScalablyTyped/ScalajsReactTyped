package typingsJapgolly.camljs.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFinalizableToString extends StObject {
  
  /** Get the resulting CAML query as string */
  def ToString(): String
}
object IFinalizableToString {
  
  inline def apply(ToString: CallbackTo[String]): IFinalizableToString = {
    val __obj = js.Dynamic.literal(ToString = ToString.toJsFn)
    __obj.asInstanceOf[IFinalizableToString]
  }
  
  extension [Self <: IFinalizableToString](x: Self) {
    
    inline def setToString(value: CallbackTo[String]): Self = StObject.set(x, "ToString", value.toJsFn)
  }
}
