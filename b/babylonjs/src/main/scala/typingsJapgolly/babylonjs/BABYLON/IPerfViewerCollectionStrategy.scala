package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPerfViewerCollectionStrategy extends StObject {
  
  /**
    * Function which does any necessary cleanup. Called when performanceViewerCollector.dispose() is called.
    */
  def dispose(): Unit
  
  /**
    * Function which gets the data for the strategy.
    */
  def getData(): Double
  
  /**
    * The id of the strategy.
    */
  var id: String
}
object IPerfViewerCollectionStrategy {
  
  inline def apply(dispose: Callback, getData: CallbackTo[Double], id: String): IPerfViewerCollectionStrategy = {
    val __obj = js.Dynamic.literal(dispose = dispose.toJsFn, getData = getData.toJsFn, id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPerfViewerCollectionStrategy]
  }
  
  extension [Self <: IPerfViewerCollectionStrategy](x: Self) {
    
    inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
    
    inline def setGetData(value: CallbackTo[Double]): Self = StObject.set(x, "getData", value.toJsFn)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
