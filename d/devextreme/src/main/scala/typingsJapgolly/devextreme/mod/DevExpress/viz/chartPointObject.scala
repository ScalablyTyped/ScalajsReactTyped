package typingsJapgolly.devextreme.mod.DevExpress.viz

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait chartPointObject
  extends StObject
     with basePointObject {
  
  /**
    * Provides information about the aggregation interval and the data objects that fall within it.
    */
  var aggregationInfo: js.UndefOr[chartPointAggregationInfoObject] = js.undefined
  
  /**
    * Gets the parameters of the point&apos;s minimum bounding rectangle (MBR).
    */
  def getBoundingRect(): Any
  
  /**
    * Contains the close value of the point. This field is useful for points belonging to a series of the candle stick or stock type only.
    */
  var originalCloseValue: js.UndefOr[Double | String] = js.undefined
  
  /**
    * Contains the high value of the point. This field is useful for points belonging to a series of the candle stick or stock type only.
    */
  var originalHighValue: js.UndefOr[Double | String] = js.undefined
  
  /**
    * Contains the low value of the point. This field is useful for points belonging to a series of the candle stick or stock type only.
    */
  var originalLowValue: js.UndefOr[Double | String] = js.undefined
  
  /**
    * Contains the first value of the point. This field is useful for points belonging to a series of the range area or range bar type only.
    */
  var originalMinValue: js.UndefOr[String | Double | js.Date] = js.undefined
  
  /**
    * Contains the open value of the point. This field is useful for points belonging to a series of the candle stick or stock type only.
    */
  var originalOpenValue: js.UndefOr[Double | String] = js.undefined
  
  /**
    * Contains the size of the bubble as it was set in the data source. This field is useful for points belonging to a series of the bubble type only.
    */
  var size: js.UndefOr[Double | String] = js.undefined
}
object chartPointObject {
  
  inline def apply(
    clearHover: Callback,
    clearSelection: Callback,
    getBoundingRect: CallbackTo[Any],
    getColor: CallbackTo[String],
    getLabel: CallbackTo[baseLabelObject & js.Array[baseLabelObject]],
    hideTooltip: Callback,
    hover: Callback,
    isHovered: CallbackTo[Boolean],
    isSelected: CallbackTo[Boolean],
    select: Callback,
    showTooltip: Callback
  ): chartPointObject = {
    val __obj = js.Dynamic.literal(clearHover = clearHover.toJsFn, clearSelection = clearSelection.toJsFn, getBoundingRect = getBoundingRect.toJsFn, getColor = getColor.toJsFn, getLabel = getLabel.toJsFn, hideTooltip = hideTooltip.toJsFn, hover = hover.toJsFn, isHovered = isHovered.toJsFn, isSelected = isSelected.toJsFn, select = select.toJsFn, showTooltip = showTooltip.toJsFn)
    __obj.asInstanceOf[chartPointObject]
  }
  
  extension [Self <: chartPointObject](x: Self) {
    
    inline def setAggregationInfo(value: chartPointAggregationInfoObject): Self = StObject.set(x, "aggregationInfo", value.asInstanceOf[js.Any])
    
    inline def setAggregationInfoUndefined: Self = StObject.set(x, "aggregationInfo", js.undefined)
    
    inline def setGetBoundingRect(value: CallbackTo[Any]): Self = StObject.set(x, "getBoundingRect", value.toJsFn)
    
    inline def setOriginalCloseValue(value: Double | String): Self = StObject.set(x, "originalCloseValue", value.asInstanceOf[js.Any])
    
    inline def setOriginalCloseValueUndefined: Self = StObject.set(x, "originalCloseValue", js.undefined)
    
    inline def setOriginalHighValue(value: Double | String): Self = StObject.set(x, "originalHighValue", value.asInstanceOf[js.Any])
    
    inline def setOriginalHighValueUndefined: Self = StObject.set(x, "originalHighValue", js.undefined)
    
    inline def setOriginalLowValue(value: Double | String): Self = StObject.set(x, "originalLowValue", value.asInstanceOf[js.Any])
    
    inline def setOriginalLowValueUndefined: Self = StObject.set(x, "originalLowValue", js.undefined)
    
    inline def setOriginalMinValue(value: String | Double | js.Date): Self = StObject.set(x, "originalMinValue", value.asInstanceOf[js.Any])
    
    inline def setOriginalMinValueUndefined: Self = StObject.set(x, "originalMinValue", js.undefined)
    
    inline def setOriginalOpenValue(value: Double | String): Self = StObject.set(x, "originalOpenValue", value.asInstanceOf[js.Any])
    
    inline def setOriginalOpenValueUndefined: Self = StObject.set(x, "originalOpenValue", js.undefined)
    
    inline def setSize(value: Double | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
