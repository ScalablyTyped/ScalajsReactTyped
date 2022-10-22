package typingsJapgolly.yandexMaps.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IIterator extends StObject {
  
  def getNext(): js.Object | Null
}
object IIterator {
  
  inline def apply(getNext: CallbackTo[js.Object | Null]): IIterator = {
    val __obj = js.Dynamic.literal(getNext = getNext.toJsFn)
    __obj.asInstanceOf[IIterator]
  }
  
  extension [Self <: IIterator](x: Self) {
    
    inline def setGetNext(value: CallbackTo[js.Object | Null]): Self = StObject.set(x, "getNext", value.toJsFn)
  }
}
