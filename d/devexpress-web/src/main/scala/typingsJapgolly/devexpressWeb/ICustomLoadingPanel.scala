package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines custom loading panel members.
  */
trait ICustomLoadingPanel extends StObject {
  
  /**
    * Hides the loading panel.
    */
  def hide(): Unit
  
  /**
    * Shows the loading panel.
    */
  def show(): Unit
  
  /**
    * Specifies whether the panel is visible.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object ICustomLoadingPanel {
  
  inline def apply(hide: Callback, show: Callback): ICustomLoadingPanel = {
    val __obj = js.Dynamic.literal(hide = hide.toJsFn, show = show.toJsFn)
    __obj.asInstanceOf[ICustomLoadingPanel]
  }
  
  extension [Self <: ICustomLoadingPanel](x: Self) {
    
    inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
    
    inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
