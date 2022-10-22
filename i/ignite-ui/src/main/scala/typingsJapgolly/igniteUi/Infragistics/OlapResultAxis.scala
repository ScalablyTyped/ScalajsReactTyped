package typingsJapgolly.igniteUi.Infragistics

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OlapResultAxis extends StObject {
  
  /**
    * Returns the count of the $.ig.OlapResultAxisMember objects of each tuple.
    */
  def tupleSize(): Double
  
  /**
    * Returns an array of $.ig.OlapResultTuple objects which form the axis.
    */
  def tuples(): js.Array[Any]
}
object OlapResultAxis {
  
  inline def apply(tupleSize: CallbackTo[Double], tuples: CallbackTo[js.Array[Any]]): OlapResultAxis = {
    val __obj = js.Dynamic.literal(tupleSize = tupleSize.toJsFn, tuples = tuples.toJsFn)
    __obj.asInstanceOf[OlapResultAxis]
  }
  
  extension [Self <: OlapResultAxis](x: Self) {
    
    inline def setTupleSize(value: CallbackTo[Double]): Self = StObject.set(x, "tupleSize", value.toJsFn)
    
    inline def setTuples(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "tuples", value.toJsFn)
  }
}
