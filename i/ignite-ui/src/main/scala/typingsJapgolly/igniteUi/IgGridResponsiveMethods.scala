package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgGridResponsiveMethods extends StObject {
  
  /**
    * Destroys the responsive widget.
    */
  def destroy(): Unit
  
  /**
    * Returns the currently active responsive mode.
    */
  def getCurrentResponsiveMode(): Unit
}
object IgGridResponsiveMethods {
  
  inline def apply(destroy: Callback, getCurrentResponsiveMode: Callback): IgGridResponsiveMethods = {
    val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, getCurrentResponsiveMode = getCurrentResponsiveMode.toJsFn)
    __obj.asInstanceOf[IgGridResponsiveMethods]
  }
  
  extension [Self <: IgGridResponsiveMethods](x: Self) {
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setGetCurrentResponsiveMode(value: Callback): Self = StObject.set(x, "getCurrentResponsiveMode", value.toJsFn)
  }
}
