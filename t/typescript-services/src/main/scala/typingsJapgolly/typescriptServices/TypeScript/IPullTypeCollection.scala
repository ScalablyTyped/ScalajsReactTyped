package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPullTypeCollection extends StObject {
  
  def getLength(): Double
  
  def getTypeAtIndex(index: Double): PullTypeSymbol
}
object IPullTypeCollection {
  
  inline def apply(getLength: CallbackTo[Double], getTypeAtIndex: Double => PullTypeSymbol): IPullTypeCollection = {
    val __obj = js.Dynamic.literal(getLength = getLength.toJsFn, getTypeAtIndex = js.Any.fromFunction1(getTypeAtIndex))
    __obj.asInstanceOf[IPullTypeCollection]
  }
  
  extension [Self <: IPullTypeCollection](x: Self) {
    
    inline def setGetLength(value: CallbackTo[Double]): Self = StObject.set(x, "getLength", value.toJsFn)
    
    inline def setGetTypeAtIndex(value: Double => PullTypeSymbol): Self = StObject.set(x, "getTypeAtIndex", js.Any.fromFunction1(value))
  }
}
