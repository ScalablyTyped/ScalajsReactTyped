package typingsJapgolly.devextreme.mod.DevExpress.viz

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxSankeyNode extends StObject {
  
  /**
    * Hides the sankey node&apos;s tooltip.
    */
  def hideTooltip(): Unit
  
  /**
    * Changes the sankey node&apos;s hover state.
    */
  def hover(state: Boolean): Unit
  
  /**
    * Indicates whether the sankey node is in the hover state.
    */
  def isHovered(): Boolean
  
  /**
    * The node&apos;s label.
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * The node&apos;s incoming links.
    */
  var linksIn: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * The node&apos;s outgoing links.
    */
  var linksOut: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * Shows the sankey node&apos;s tooltip.
    */
  def showTooltip(): Unit
  
  /**
    * The node&apos;s label.
    * @deprecated Use label instead.
    */
  var title: js.UndefOr[String] = js.undefined
}
object dxSankeyNode {
  
  inline def apply(
    hideTooltip: Callback,
    hover: Boolean => Callback,
    isHovered: CallbackTo[Boolean],
    showTooltip: Callback
  ): dxSankeyNode = {
    val __obj = js.Dynamic.literal(hideTooltip = hideTooltip.toJsFn, hover = js.Any.fromFunction1((t0: Boolean) => hover(t0).runNow()), isHovered = isHovered.toJsFn, showTooltip = showTooltip.toJsFn)
    __obj.asInstanceOf[dxSankeyNode]
  }
  
  extension [Self <: dxSankeyNode](x: Self) {
    
    inline def setHideTooltip(value: Callback): Self = StObject.set(x, "hideTooltip", value.toJsFn)
    
    inline def setHover(value: Boolean => Callback): Self = StObject.set(x, "hover", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setIsHovered(value: CallbackTo[Boolean]): Self = StObject.set(x, "isHovered", value.toJsFn)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLinksIn(value: js.Array[Any]): Self = StObject.set(x, "linksIn", value.asInstanceOf[js.Any])
    
    inline def setLinksInUndefined: Self = StObject.set(x, "linksIn", js.undefined)
    
    inline def setLinksInVarargs(value: Any*): Self = StObject.set(x, "linksIn", js.Array(value*))
    
    inline def setLinksOut(value: js.Array[Any]): Self = StObject.set(x, "linksOut", value.asInstanceOf[js.Any])
    
    inline def setLinksOutUndefined: Self = StObject.set(x, "linksOut", js.undefined)
    
    inline def setLinksOutVarargs(value: Any*): Self = StObject.set(x, "linksOut", js.Array(value*))
    
    inline def setShowTooltip(value: Callback): Self = StObject.set(x, "showTooltip", value.toJsFn)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
