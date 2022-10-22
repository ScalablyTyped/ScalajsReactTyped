package typingsJapgolly.devextreme.mod.DevExpress.viz

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait piePointObject
  extends StObject
     with basePointObject {
  
  /**
    * Hides a specific point.
    */
  def hide(): Unit
  
  /**
    * Provides information about the visibility state of a point.
    */
  def isVisible(): Boolean
  
  /**
    * Gets the percentage value of the specific point.
    */
  var percent: js.UndefOr[String | Double | js.Date] = js.undefined
  
  /**
    * Makes a specific point visible.
    */
  def show(): Unit
}
object piePointObject {
  
  inline def apply(
    clearHover: Callback,
    clearSelection: Callback,
    getColor: CallbackTo[String],
    getLabel: CallbackTo[baseLabelObject & js.Array[baseLabelObject]],
    hide: Callback,
    hideTooltip: Callback,
    hover: Callback,
    isHovered: CallbackTo[Boolean],
    isSelected: CallbackTo[Boolean],
    isVisible: CallbackTo[Boolean],
    select: Callback,
    show: Callback,
    showTooltip: Callback
  ): piePointObject = {
    val __obj = js.Dynamic.literal(clearHover = clearHover.toJsFn, clearSelection = clearSelection.toJsFn, getColor = getColor.toJsFn, getLabel = getLabel.toJsFn, hide = hide.toJsFn, hideTooltip = hideTooltip.toJsFn, hover = hover.toJsFn, isHovered = isHovered.toJsFn, isSelected = isSelected.toJsFn, isVisible = isVisible.toJsFn, select = select.toJsFn, show = show.toJsFn, showTooltip = showTooltip.toJsFn)
    __obj.asInstanceOf[piePointObject]
  }
  
  extension [Self <: piePointObject](x: Self) {
    
    inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
    
    inline def setIsVisible(value: CallbackTo[Boolean]): Self = StObject.set(x, "isVisible", value.toJsFn)
    
    inline def setPercent(value: String | Double | js.Date): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    
    inline def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
    
    inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
  }
}
