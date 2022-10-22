package typingsJapgolly.devextreme.mod.DevExpress.viz

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait basePointObject extends StObject {
  
  /**
    * Switches the point from the hover state back to normal.
    */
  def clearHover(): Unit
  
  /**
    * Deselects the point.
    */
  def clearSelection(): Unit
  
  /**
    * Contains the data object that the series point represents.
    */
  var data: js.UndefOr[Any] = js.undefined
  
  /**
    * Provides information about the state of the point object.
    */
  var fullState: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets the color of a particular point.
    */
  def getColor(): String
  
  /**
    * Allows you to obtain the label(s) of the series point.
    */
  def getLabel(): baseLabelObject & js.Array[baseLabelObject]
  
  /**
    * Hides the tooltip of the point.
    */
  def hideTooltip(): Unit
  
  /**
    * Switches the point into the hover state, the same as when a user places the mouse pointer on it.
    */
  def hover(): Unit
  
  /**
    * Provides information about the hover state of a point.
    */
  def isHovered(): Boolean
  
  /**
    * Provides information about the selection state of a point.
    */
  def isSelected(): Boolean
  
  /**
    * Returns the point&apos;s argument value that was set in the data source.
    */
  var originalArgument: js.UndefOr[String | Double | js.Date] = js.undefined
  
  /**
    * Returns the point&apos;s value that was set in the data source.
    */
  var originalValue: js.UndefOr[String | Double | js.Date] = js.undefined
  
  /**
    * Selects the point. The point is displayed in a &apos;selected&apos; style until another point is selected or the current point is deselected programmatically.
    */
  def select(): Unit
  
  /**
    * Returns the series object to which the point belongs.
    */
  var series: js.UndefOr[Any] = js.undefined
  
  /**
    * Shows the tooltip of the point.
    */
  def showTooltip(): Unit
  
  /**
    * Returns the tag of the point.
    */
  var tag: js.UndefOr[Any] = js.undefined
}
object basePointObject {
  
  inline def apply(
    clearHover: Callback,
    clearSelection: Callback,
    getColor: CallbackTo[String],
    getLabel: CallbackTo[baseLabelObject & js.Array[baseLabelObject]],
    hideTooltip: Callback,
    hover: Callback,
    isHovered: CallbackTo[Boolean],
    isSelected: CallbackTo[Boolean],
    select: Callback,
    showTooltip: Callback
  ): basePointObject = {
    val __obj = js.Dynamic.literal(clearHover = clearHover.toJsFn, clearSelection = clearSelection.toJsFn, getColor = getColor.toJsFn, getLabel = getLabel.toJsFn, hideTooltip = hideTooltip.toJsFn, hover = hover.toJsFn, isHovered = isHovered.toJsFn, isSelected = isSelected.toJsFn, select = select.toJsFn, showTooltip = showTooltip.toJsFn)
    __obj.asInstanceOf[basePointObject]
  }
  
  extension [Self <: basePointObject](x: Self) {
    
    inline def setClearHover(value: Callback): Self = StObject.set(x, "clearHover", value.toJsFn)
    
    inline def setClearSelection(value: Callback): Self = StObject.set(x, "clearSelection", value.toJsFn)
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setFullState(value: Double): Self = StObject.set(x, "fullState", value.asInstanceOf[js.Any])
    
    inline def setFullStateUndefined: Self = StObject.set(x, "fullState", js.undefined)
    
    inline def setGetColor(value: CallbackTo[String]): Self = StObject.set(x, "getColor", value.toJsFn)
    
    inline def setGetLabel(value: CallbackTo[baseLabelObject & js.Array[baseLabelObject]]): Self = StObject.set(x, "getLabel", value.toJsFn)
    
    inline def setHideTooltip(value: Callback): Self = StObject.set(x, "hideTooltip", value.toJsFn)
    
    inline def setHover(value: Callback): Self = StObject.set(x, "hover", value.toJsFn)
    
    inline def setIsHovered(value: CallbackTo[Boolean]): Self = StObject.set(x, "isHovered", value.toJsFn)
    
    inline def setIsSelected(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSelected", value.toJsFn)
    
    inline def setOriginalArgument(value: String | Double | js.Date): Self = StObject.set(x, "originalArgument", value.asInstanceOf[js.Any])
    
    inline def setOriginalArgumentUndefined: Self = StObject.set(x, "originalArgument", js.undefined)
    
    inline def setOriginalValue(value: String | Double | js.Date): Self = StObject.set(x, "originalValue", value.asInstanceOf[js.Any])
    
    inline def setOriginalValueUndefined: Self = StObject.set(x, "originalValue", js.undefined)
    
    inline def setSelect(value: Callback): Self = StObject.set(x, "select", value.toJsFn)
    
    inline def setSeries(value: Any): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    inline def setShowTooltip(value: Callback): Self = StObject.set(x, "showTooltip", value.toJsFn)
    
    inline def setTag(value: Any): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
