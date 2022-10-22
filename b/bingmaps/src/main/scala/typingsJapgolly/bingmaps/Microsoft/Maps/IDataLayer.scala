package typingsJapgolly.bingmaps.Microsoft.Maps

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDataLayer
  extends StObject
     with ILayer {
  
  /** Clears all data in the layer. */
  def clear(): Unit
}
object IDataLayer {
  
  inline def apply(clear: Callback): IDataLayer = {
    val __obj = js.Dynamic.literal(clear = clear.toJsFn)
    __obj.asInstanceOf[IDataLayer]
  }
  
  extension [Self <: IDataLayer](x: Self) {
    
    inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
  }
}
