package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgGridAppendRowsOnDemandMethods extends StObject {
  
  /**
    * Destroys the append rows on demand widget
    */
  def destroy(): Unit
  
  /**
    * Loads the next chunk of data.
    */
  def nextChunk(): Unit
}
object IgGridAppendRowsOnDemandMethods {
  
  inline def apply(destroy: Callback, nextChunk: Callback): IgGridAppendRowsOnDemandMethods = {
    val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, nextChunk = nextChunk.toJsFn)
    __obj.asInstanceOf[IgGridAppendRowsOnDemandMethods]
  }
  
  extension [Self <: IgGridAppendRowsOnDemandMethods](x: Self) {
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setNextChunk(value: Callback): Self = StObject.set(x, "nextChunk", value.toJsFn)
  }
}
