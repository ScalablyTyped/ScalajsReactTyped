package typingsJapgolly.lovefield.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Binder extends StObject {
  
  def getIndex(): Double
}
object Binder {
  
  inline def apply(getIndex: CallbackTo[Double]): Binder = {
    val __obj = js.Dynamic.literal(getIndex = getIndex.toJsFn)
    __obj.asInstanceOf[Binder]
  }
  
  extension [Self <: Binder](x: Self) {
    
    inline def setGetIndex(value: CallbackTo[Double]): Self = StObject.set(x, "getIndex", value.toJsFn)
  }
}
