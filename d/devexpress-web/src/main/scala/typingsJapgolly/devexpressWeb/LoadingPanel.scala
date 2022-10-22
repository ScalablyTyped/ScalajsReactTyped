package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings related to the loading panel functionality.
  */
trait LoadingPanel extends StObject {
  
  /**
    * Allows you to provide a custom loading panel.
    */
  var customPanel: js.UndefOr[ICustomLoadingPanel] = js.undefined
  
  /**
    * Specifies whether the loading panel is enabled in the control.
    */
  var enabled: Boolean
  
  /**
    * Hides the loading panel.
    */
  def hide(): Unit
  
  /**
    * Shows the loading panel.
    */
  def show(): Unit
}
object LoadingPanel {
  
  inline def apply(enabled: Boolean, hide: Callback, show: Callback): LoadingPanel = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], hide = hide.toJsFn, show = show.toJsFn)
    __obj.asInstanceOf[LoadingPanel]
  }
  
  extension [Self <: LoadingPanel](x: Self) {
    
    inline def setCustomPanel(value: ICustomLoadingPanel): Self = StObject.set(x, "customPanel", value.asInstanceOf[js.Any])
    
    inline def setCustomPanelUndefined: Self = StObject.set(x, "customPanel", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
    
    inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
  }
}
