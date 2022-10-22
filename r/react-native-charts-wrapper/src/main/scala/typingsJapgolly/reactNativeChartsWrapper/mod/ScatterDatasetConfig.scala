package typingsJapgolly.reactNativeChartsWrapper.mod

import typingsJapgolly.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.CIRCLE
import typingsJapgolly.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.CROSS
import typingsJapgolly.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.SQUARE
import typingsJapgolly.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.TRIANGLE
import typingsJapgolly.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScatterDatasetConfig
  extends StObject
     with CommonDatasetConfig
     with BarLineScatterCandleBubbleConfig
     with LineScatterCandleRadarConfig {
  
  var scatterShape: js.UndefOr[SQUARE | CIRCLE | TRIANGLE | CROSS | X] = js.undefined
  
  var scatterShapeHoleColor: js.UndefOr[Color] = js.undefined
  
  var scatterShapeHoleRadius: js.UndefOr[Double] = js.undefined
  
  var scatterShapeSize: js.UndefOr[Double] = js.undefined
}
object ScatterDatasetConfig {
  
  inline def apply(): ScatterDatasetConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScatterDatasetConfig]
  }
  
  extension [Self <: ScatterDatasetConfig](x: Self) {
    
    inline def setScatterShape(value: SQUARE | CIRCLE | TRIANGLE | CROSS | X): Self = StObject.set(x, "scatterShape", value.asInstanceOf[js.Any])
    
    inline def setScatterShapeHoleColor(value: Color): Self = StObject.set(x, "scatterShapeHoleColor", value.asInstanceOf[js.Any])
    
    inline def setScatterShapeHoleColorUndefined: Self = StObject.set(x, "scatterShapeHoleColor", js.undefined)
    
    inline def setScatterShapeHoleRadius(value: Double): Self = StObject.set(x, "scatterShapeHoleRadius", value.asInstanceOf[js.Any])
    
    inline def setScatterShapeHoleRadiusUndefined: Self = StObject.set(x, "scatterShapeHoleRadius", js.undefined)
    
    inline def setScatterShapeSize(value: Double): Self = StObject.set(x, "scatterShapeSize", value.asInstanceOf[js.Any])
    
    inline def setScatterShapeSizeUndefined: Self = StObject.set(x, "scatterShapeSize", js.undefined)
    
    inline def setScatterShapeUndefined: Self = StObject.set(x, "scatterShape", js.undefined)
  }
}
