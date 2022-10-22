package typingsJapgolly.antvComponent.libTypesMod

import typingsJapgolly.antvComponent.anon.DisplayLength
import typingsJapgolly.antvComponent.anon.DisplayStyle
import typingsJapgolly.antvComponent.antvComponentStrings.downward
import typingsJapgolly.antvComponent.antvComponentStrings.upward
import typingsJapgolly.antvGBase.libInterfacesMod.IGroup
import typingsJapgolly.antvGBase.libTypesMod.BBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataMarkerAnnotationCfg
  extends StObject
     with GroupComponentCfg {
  
  /**
    * 是否自动调整
    */
  var autoAdjust: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Coord 的 BBox，用于 autoAdjust
    */
  var coordBBox: js.UndefOr[BBox] = js.undefined
  
  /**
    * 方向
    */
  var direction: js.UndefOr[upward | downward] = js.undefined
  
  var line: js.UndefOr[DisplayLength] = js.undefined
  
  var point: js.UndefOr[DisplayStyle] = js.undefined
  
  var text: DataMarkerTextCfg
  
  /**
    * 标注位置 x
    * @type {number}
    */
  var x: Double
  
  /**
    * 标注位置 y
    * @type {number}
    */
  var y: Double
}
object DataMarkerAnnotationCfg {
  
  inline def apply(container: IGroup, text: DataMarkerTextCfg, x: Double, y: Double): DataMarkerAnnotationCfg = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataMarkerAnnotationCfg]
  }
  
  extension [Self <: DataMarkerAnnotationCfg](x: Self) {
    
    inline def setAutoAdjust(value: Boolean): Self = StObject.set(x, "autoAdjust", value.asInstanceOf[js.Any])
    
    inline def setAutoAdjustUndefined: Self = StObject.set(x, "autoAdjust", js.undefined)
    
    inline def setCoordBBox(value: BBox): Self = StObject.set(x, "coordBBox", value.asInstanceOf[js.Any])
    
    inline def setCoordBBoxUndefined: Self = StObject.set(x, "coordBBox", js.undefined)
    
    inline def setDirection(value: upward | downward): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setLine(value: DisplayLength): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setPoint(value: DisplayStyle): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    inline def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
    
    inline def setText(value: DataMarkerTextCfg): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
