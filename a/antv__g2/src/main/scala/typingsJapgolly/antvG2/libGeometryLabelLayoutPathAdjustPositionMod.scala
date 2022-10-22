package typingsJapgolly.antvG2

import typingsJapgolly.antvG2.libGeometryLabelInterfaceMod.LabelItem
import typingsJapgolly.antvGBase.libInterfacesMod.IGroup
import typingsJapgolly.antvGBase.libInterfacesMod.IShape
import typingsJapgolly.antvGBase.libTypesMod.BBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGeometryLabelLayoutPathAdjustPositionMod {
  
  @JSImport("@antv/g2/lib/geometry/label/layout/path/adjust-position", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pathAdjustPosition(
    items: js.Array[LabelItem],
    labels: js.Array[IGroup],
    shapes: js.Array[IGroup | IShape],
    region: BBox,
    cfg: PointAdjustPositionLayoutCfg
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pathAdjustPosition")(items.asInstanceOf[js.Any], labels.asInstanceOf[js.Any], shapes.asInstanceOf[js.Any], region.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait PointAdjustPositionLayoutCfg extends StObject {
    
    var offset: js.UndefOr[Double] = js.undefined
  }
  object PointAdjustPositionLayoutCfg {
    
    inline def apply(): PointAdjustPositionLayoutCfg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PointAdjustPositionLayoutCfg]
    }
    
    extension [Self <: PointAdjustPositionLayoutCfg](x: Self) {
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    }
  }
}
