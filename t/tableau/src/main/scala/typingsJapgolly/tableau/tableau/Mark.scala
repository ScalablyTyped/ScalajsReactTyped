package typingsJapgolly.tableau.tableau

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region Marks Selection
/**
  * A mark represents a single data point on the visualization.
  * It is independent of the type of visualization (bar, line, pie, etc.).
  */
trait Mark extends StObject {
  
  /** Gets a collection of field name/value pairs associated with the mark. */
  def getPairs(): js.Array[Pair]
}
object Mark {
  
  inline def apply(getPairs: CallbackTo[js.Array[Pair]]): Mark = {
    val __obj = js.Dynamic.literal(getPairs = getPairs.toJsFn)
    __obj.asInstanceOf[Mark]
  }
  
  extension [Self <: Mark](x: Self) {
    
    inline def setGetPairs(value: CallbackTo[js.Array[Pair]]): Self = StObject.set(x, "getPairs", value.toJsFn)
  }
}
