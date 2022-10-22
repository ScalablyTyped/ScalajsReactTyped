package typingsJapgolly.dxf

import typingsJapgolly.dxf.commonMod.ColorNumber
import typingsJapgolly.dxf.commonMod.Point3D
import typingsJapgolly.dxf.commonMod.UnitTypes
import typingsJapgolly.dxf.handlersEntitiesMod.Entity
import typingsJapgolly.dxf.informationMod.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object handlersEntitySolidMod {
  
  @JSImport("dxf/handlers/entity/solid", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("dxf/handlers/entity/solid", "TYPE")
  @js.native
  val TYPE: String = js.native
  
  inline def process(value: Property): SolidEntityData = ^.asInstanceOf[js.Dynamic].applyDynamic("process")(value.asInstanceOf[js.Any]).asInstanceOf[SolidEntityData]
  
  /* Inlined {  corners :[dxf.dxf/Common.Point3D, dxf.dxf/Common.Point3D, dxf.dxf/Common.Point3D, dxf.dxf/Common.Point3D],   thickness :number} & std.Partial<dxf.dxf/handlers/entity/common.CommonEntityData> */
  trait SolidEntityData
    extends StObject
       with Entity {
    
    @JSName("$INSUNITS")
    var $INSUNITS: js.UndefOr[UnitTypes] = js.undefined
    
    var TYPE: js.UndefOr[String] = js.undefined
    
    var colorNumber: js.UndefOr[ColorNumber] = js.undefined
    
    var corners: js.Tuple4[Point3D, Point3D, Point3D, Point3D]
    
    var extrusionX: js.UndefOr[Any] = js.undefined
    
    var extrusionY: js.UndefOr[Any] = js.undefined
    
    var extrusionZ: js.UndefOr[Any] = js.undefined
    
    var layer: js.UndefOr[String] = js.undefined
    
    var lineTypeName: js.UndefOr[String] = js.undefined
    
    var lineTypeScale: js.UndefOr[Any] = js.undefined
    
    var thickness: Double
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object SolidEntityData {
    
    inline def apply(corners: js.Tuple4[Point3D, Point3D, Point3D, Point3D], thickness: Double): SolidEntityData = {
      val __obj = js.Dynamic.literal(corners = corners.asInstanceOf[js.Any], thickness = thickness.asInstanceOf[js.Any])
      __obj.asInstanceOf[SolidEntityData]
    }
    
    extension [Self <: SolidEntityData](x: Self) {
      
      inline def set$INSUNITS(value: UnitTypes): Self = StObject.set(x, "$INSUNITS", value.asInstanceOf[js.Any])
      
      inline def set$INSUNITSUndefined: Self = StObject.set(x, "$INSUNITS", js.undefined)
      
      inline def setColorNumber(value: ColorNumber): Self = StObject.set(x, "colorNumber", value.asInstanceOf[js.Any])
      
      inline def setColorNumberUndefined: Self = StObject.set(x, "colorNumber", js.undefined)
      
      inline def setCorners(value: js.Tuple4[Point3D, Point3D, Point3D, Point3D]): Self = StObject.set(x, "corners", value.asInstanceOf[js.Any])
      
      inline def setExtrusionX(value: Any): Self = StObject.set(x, "extrusionX", value.asInstanceOf[js.Any])
      
      inline def setExtrusionXUndefined: Self = StObject.set(x, "extrusionX", js.undefined)
      
      inline def setExtrusionY(value: Any): Self = StObject.set(x, "extrusionY", value.asInstanceOf[js.Any])
      
      inline def setExtrusionYUndefined: Self = StObject.set(x, "extrusionY", js.undefined)
      
      inline def setExtrusionZ(value: Any): Self = StObject.set(x, "extrusionZ", value.asInstanceOf[js.Any])
      
      inline def setExtrusionZUndefined: Self = StObject.set(x, "extrusionZ", js.undefined)
      
      inline def setLayer(value: String): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
      
      inline def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
      
      inline def setLineTypeName(value: String): Self = StObject.set(x, "lineTypeName", value.asInstanceOf[js.Any])
      
      inline def setLineTypeNameUndefined: Self = StObject.set(x, "lineTypeName", js.undefined)
      
      inline def setLineTypeScale(value: Any): Self = StObject.set(x, "lineTypeScale", value.asInstanceOf[js.Any])
      
      inline def setLineTypeScaleUndefined: Self = StObject.set(x, "lineTypeScale", js.undefined)
      
      inline def setTYPE(value: String): Self = StObject.set(x, "TYPE", value.asInstanceOf[js.Any])
      
      inline def setTYPEUndefined: Self = StObject.set(x, "TYPE", js.undefined)
      
      inline def setThickness(value: Double): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
