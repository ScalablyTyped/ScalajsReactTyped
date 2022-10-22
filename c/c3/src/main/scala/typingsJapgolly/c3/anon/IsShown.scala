package typingsJapgolly.c3.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsShown extends StObject {
  
  /**
    * Hides sub chart.
    */
  def hide(): scala.Unit
  
  /**
    * Returns true if the sub chart is shown.
    */
  def isShown(): Boolean
  
  /**
    * Shows sub chart at the bottom of the chart.
    */
  def show(): scala.Unit
}
object IsShown {
  
  inline def apply(hide: Callback, isShown: CallbackTo[Boolean], show: Callback): IsShown = {
    val __obj = js.Dynamic.literal(hide = hide.toJsFn, isShown = isShown.toJsFn, show = show.toJsFn)
    __obj.asInstanceOf[IsShown]
  }
  
  extension [Self <: IsShown](x: Self) {
    
    inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
    
    inline def setIsShown(value: CallbackTo[Boolean]): Self = StObject.set(x, "isShown", value.toJsFn)
    
    inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
  }
}
