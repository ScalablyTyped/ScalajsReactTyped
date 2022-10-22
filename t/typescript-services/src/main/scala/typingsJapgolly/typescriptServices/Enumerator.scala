package typingsJapgolly.typescriptServices

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Enumerator extends StObject {
  
  def atEnd(): Boolean
  
  def item(): Any
  
  def moveNext(): Boolean
}
object Enumerator {
  
  inline def apply(atEnd: CallbackTo[Boolean], item: CallbackTo[Any], moveNext: CallbackTo[Boolean]): Enumerator = {
    val __obj = js.Dynamic.literal(atEnd = atEnd.toJsFn, item = item.toJsFn, moveNext = moveNext.toJsFn)
    __obj.asInstanceOf[Enumerator]
  }
  
  extension [Self <: Enumerator](x: Self) {
    
    inline def setAtEnd(value: CallbackTo[Boolean]): Self = StObject.set(x, "atEnd", value.toJsFn)
    
    inline def setItem(value: CallbackTo[Any]): Self = StObject.set(x, "item", value.toJsFn)
    
    inline def setMoveNext(value: CallbackTo[Boolean]): Self = StObject.set(x, "moveNext", value.toJsFn)
  }
}
