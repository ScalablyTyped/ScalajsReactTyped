package typingsJapgolly.devextreme.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseGauge[TProperties]
  extends StObject
     with BaseWidget[TProperties] {
  
  /**
    * Gets subvalues.
    */
  def subvalues(): js.Array[Double] = js.native
  /**
    * Updates subvalues.
    */
  def subvalues(subvalues: js.Array[Double]): Unit = js.native
  
  /**
    * Gets the main value.
    */
  def value(): Double = js.native
  /**
    * Updates the main value.
    */
  def value(value: Double): Unit = js.native
}
object BaseGauge {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.circle
    - typingsJapgolly.devextreme.devextremeStrings.rangeBar
    - typingsJapgolly.devextreme.devextremeStrings.rectangle
    - typingsJapgolly.devextreme.devextremeStrings.rectangleNeedle
    - typingsJapgolly.devextreme.devextremeStrings.rhombus
    - typingsJapgolly.devextreme.devextremeStrings.textCloud
    - typingsJapgolly.devextreme.devextremeStrings.triangleMarker
    - typingsJapgolly.devextreme.devextremeStrings.triangleNeedle
    - typingsJapgolly.devextreme.devextremeStrings.twoColorNeedle
  */
  trait GaugeIndicatorType extends StObject
  object GaugeIndicatorType {
    
    inline def circle: typingsJapgolly.devextreme.devextremeStrings.circle = "circle".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.circle]
    
    inline def rangeBar: typingsJapgolly.devextreme.devextremeStrings.rangeBar = "rangeBar".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.rangeBar]
    
    inline def rectangle: typingsJapgolly.devextreme.devextremeStrings.rectangle = "rectangle".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.rectangle]
    
    inline def rectangleNeedle: typingsJapgolly.devextreme.devextremeStrings.rectangleNeedle = "rectangleNeedle".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.rectangleNeedle]
    
    inline def rhombus: typingsJapgolly.devextreme.devextremeStrings.rhombus = "rhombus".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.rhombus]
    
    inline def textCloud: typingsJapgolly.devextreme.devextremeStrings.textCloud = "textCloud".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.textCloud]
    
    inline def triangleMarker: typingsJapgolly.devextreme.devextremeStrings.triangleMarker = "triangleMarker".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.triangleMarker]
    
    inline def triangleNeedle: typingsJapgolly.devextreme.devextremeStrings.triangleNeedle = "triangleNeedle".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.triangleNeedle]
    
    inline def twoColorNeedle: typingsJapgolly.devextreme.devextremeStrings.twoColorNeedle = "twoColorNeedle".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.twoColorNeedle]
  }
  
  trait TooltipInfo extends StObject {
    
    var target: Any
  }
  object TooltipInfo {
    
    inline def apply(target: Any): TooltipInfo = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipInfo]
    }
    
    extension [Self <: TooltipInfo](x: Self) {
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
