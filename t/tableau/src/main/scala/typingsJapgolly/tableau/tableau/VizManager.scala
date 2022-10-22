package typingsJapgolly.tableau.tableau

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region Viz Classes
trait VizManager extends StObject {
  
  def getVizs(): js.Array[Viz]
}
object VizManager {
  
  inline def apply(getVizs: CallbackTo[js.Array[Viz]]): VizManager = {
    val __obj = js.Dynamic.literal(getVizs = getVizs.toJsFn)
    __obj.asInstanceOf[VizManager]
  }
  
  extension [Self <: VizManager](x: Self) {
    
    inline def setGetVizs(value: CallbackTo[js.Array[Viz]]): Self = StObject.set(x, "getVizs", value.toJsFn)
  }
}
