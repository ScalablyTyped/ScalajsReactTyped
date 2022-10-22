package typingsJapgolly.devextreme.mod.DevExpress.viz

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxSankeyLink extends StObject {
  
  /**
    * An object that describes the connection.
    */
  var connection: js.UndefOr[dxSankeyConnectionInfoObject] = js.undefined
  
  /**
    * Hides the sankey link&apos;s tooltip.
    */
  def hideTooltip(): Unit
  
  /**
    * Changes the sankey link&apos;s hover state.
    */
  def hover(state: Boolean): Unit
  
  /**
    * Indicates whether the sankey link is in the hover state.
    */
  def isHovered(): Boolean
  
  /**
    * Shows the sankey link&apos;s tooltip.
    */
  def showTooltip(): Unit
}
object dxSankeyLink {
  
  inline def apply(
    hideTooltip: Callback,
    hover: Boolean => Callback,
    isHovered: CallbackTo[Boolean],
    showTooltip: Callback
  ): dxSankeyLink = {
    val __obj = js.Dynamic.literal(hideTooltip = hideTooltip.toJsFn, hover = js.Any.fromFunction1((t0: Boolean) => hover(t0).runNow()), isHovered = isHovered.toJsFn, showTooltip = showTooltip.toJsFn)
    __obj.asInstanceOf[dxSankeyLink]
  }
  
  extension [Self <: dxSankeyLink](x: Self) {
    
    inline def setConnection(value: dxSankeyConnectionInfoObject): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
    
    inline def setHideTooltip(value: Callback): Self = StObject.set(x, "hideTooltip", value.toJsFn)
    
    inline def setHover(value: Boolean => Callback): Self = StObject.set(x, "hover", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setIsHovered(value: CallbackTo[Boolean]): Self = StObject.set(x, "isHovered", value.toJsFn)
    
    inline def setShowTooltip(value: Callback): Self = StObject.set(x, "showTooltip", value.toJsFn)
  }
}
