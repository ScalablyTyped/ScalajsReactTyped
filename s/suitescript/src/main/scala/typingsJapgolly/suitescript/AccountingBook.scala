package typingsJapgolly.suitescript

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountingBook extends StObject {
  
  def getId(): Double
  
  def isPrimary(): Boolean
}
object AccountingBook {
  
  inline def apply(getId: CallbackTo[Double], isPrimary: CallbackTo[Boolean]): AccountingBook = {
    val __obj = js.Dynamic.literal(getId = getId.toJsFn, isPrimary = isPrimary.toJsFn)
    __obj.asInstanceOf[AccountingBook]
  }
  
  extension [Self <: AccountingBook](x: Self) {
    
    inline def setGetId(value: CallbackTo[Double]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setIsPrimary(value: CallbackTo[Boolean]): Self = StObject.set(x, "isPrimary", value.toJsFn)
  }
}
