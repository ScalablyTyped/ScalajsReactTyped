package typingsJapgolly.devextreme.mod.DevExpress.viz

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxFunnelItem extends StObject {
  
  /**
    * The item&apos;s argument.
    */
  var argument: js.UndefOr[String | js.Date | Double] = js.undefined
  
  /**
    * The item&apos;s original data object.
    */
  var data: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets the funnel item&apos;s color specified in the data source or palette.
    */
  def getColor(): String
  
  /**
    * Changes the funnel item&apos;s hover state.
    */
  def hover(state: Boolean): Unit
  
  /**
    * Indicates whether the funnel item is in the hover state.
    */
  def isHovered(): Boolean
  
  /**
    * Indicates whether the funnel item is selected.
    */
  def isSelected(): Boolean
  
  /**
    * The item&apos;s calculated percentage value.
    */
  var percent: js.UndefOr[Double] = js.undefined
  
  /**
    * Selects or cancels the funnel item&apos;s selection.
    */
  def select(state: Boolean): Unit
  
  /**
    * Shows the funnel item&apos;s tooltip.
    */
  def showTooltip(): Unit
  
  /**
    * The item&apos;s value.
    */
  var value: js.UndefOr[Double] = js.undefined
}
object dxFunnelItem {
  
  inline def apply(
    getColor: CallbackTo[String],
    hover: Boolean => Callback,
    isHovered: CallbackTo[Boolean],
    isSelected: CallbackTo[Boolean],
    select: Boolean => Callback,
    showTooltip: Callback
  ): dxFunnelItem = {
    val __obj = js.Dynamic.literal(getColor = getColor.toJsFn, hover = js.Any.fromFunction1((t0: Boolean) => hover(t0).runNow()), isHovered = isHovered.toJsFn, isSelected = isSelected.toJsFn, select = js.Any.fromFunction1((t0: Boolean) => select(t0).runNow()), showTooltip = showTooltip.toJsFn)
    __obj.asInstanceOf[dxFunnelItem]
  }
  
  extension [Self <: dxFunnelItem](x: Self) {
    
    inline def setArgument(value: String | js.Date | Double): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    inline def setArgumentUndefined: Self = StObject.set(x, "argument", js.undefined)
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setGetColor(value: CallbackTo[String]): Self = StObject.set(x, "getColor", value.toJsFn)
    
    inline def setHover(value: Boolean => Callback): Self = StObject.set(x, "hover", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setIsHovered(value: CallbackTo[Boolean]): Self = StObject.set(x, "isHovered", value.toJsFn)
    
    inline def setIsSelected(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSelected", value.toJsFn)
    
    inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    
    inline def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
    
    inline def setSelect(value: Boolean => Callback): Self = StObject.set(x, "select", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setShowTooltip(value: Callback): Self = StObject.set(x, "showTooltip", value.toJsFn)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
