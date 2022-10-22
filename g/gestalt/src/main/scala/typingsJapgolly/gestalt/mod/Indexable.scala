package typingsJapgolly.gestalt.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Indexable extends StObject {
  
  def index(): Double
}
object Indexable {
  
  inline def apply(index: CallbackTo[Double]): Indexable = {
    val __obj = js.Dynamic.literal(index = index.toJsFn)
    __obj.asInstanceOf[Indexable]
  }
  
  extension [Self <: Indexable](x: Self) {
    
    inline def setIndex(value: CallbackTo[Double]): Self = StObject.set(x, "index", value.toJsFn)
  }
}
