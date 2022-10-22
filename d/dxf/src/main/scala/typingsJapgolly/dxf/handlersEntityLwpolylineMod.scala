package typingsJapgolly.dxf

import typingsJapgolly.dxf.commonMod.ColorNumber
import typingsJapgolly.dxf.commonMod.Point2D
import typingsJapgolly.dxf.commonMod.UnitTypes
import typingsJapgolly.dxf.handlersEntitiesMod.Entity
import typingsJapgolly.dxf.informationMod.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object handlersEntityLwpolylineMod {
  
  @JSImport("dxf/handlers/entity/lwpolyline", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("dxf/handlers/entity/lwpolyline", "TYPE")
  @js.native
  val TYPE: String = js.native
  
  inline def process(value: Property): LWPolylineEntityData = ^.asInstanceOf[js.Dynamic].applyDynamic("process")(value.asInstanceOf[js.Any]).asInstanceOf[LWPolylineEntityData]
  
  /* Inlined {  closed :boolean | undefined,   vertices :std.Array<dxf.dxf/Common.Point2D> | undefined,   bulge :number | undefined,   thickness :number | undefined,   vertexX :any | undefined} & std.Partial<dxf.dxf/handlers/entity/common.CommonEntityData> */
  trait LWPolylineEntityData
    extends StObject
       with Entity {
    
    @JSName("$INSUNITS")
    var $INSUNITS: js.UndefOr[UnitTypes] = js.undefined
    
    var TYPE: js.UndefOr[String] = js.undefined
    
    var bulge: js.UndefOr[Double] = js.undefined
    
    var closed: js.UndefOr[Boolean] = js.undefined
    
    var colorNumber: js.UndefOr[ColorNumber] = js.undefined
    
    var extrusionX: js.UndefOr[Any] = js.undefined
    
    var extrusionY: js.UndefOr[Any] = js.undefined
    
    var extrusionZ: js.UndefOr[Any] = js.undefined
    
    var layer: js.UndefOr[String] = js.undefined
    
    var lineTypeName: js.UndefOr[String] = js.undefined
    
    var lineTypeScale: js.UndefOr[Any] = js.undefined
    
    var thickness: js.UndefOr[Double] = js.undefined
    
    var vertexX: js.UndefOr[Any] = js.undefined
    
    var vertices: js.UndefOr[js.Array[Point2D]] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object LWPolylineEntityData {
    
    inline def apply(): LWPolylineEntityData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LWPolylineEntityData]
    }
    
    extension [Self <: LWPolylineEntityData](x: Self) {
      
      inline def set$INSUNITS(value: UnitTypes): Self = StObject.set(x, "$INSUNITS", value.asInstanceOf[js.Any])
      
      inline def set$INSUNITSUndefined: Self = StObject.set(x, "$INSUNITS", js.undefined)
      
      inline def setBulge(value: Double): Self = StObject.set(x, "bulge", value.asInstanceOf[js.Any])
      
      inline def setBulgeUndefined: Self = StObject.set(x, "bulge", js.undefined)
      
      inline def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
      
      inline def setClosedUndefined: Self = StObject.set(x, "closed", js.undefined)
      
      inline def setColorNumber(value: ColorNumber): Self = StObject.set(x, "colorNumber", value.asInstanceOf[js.Any])
      
      inline def setColorNumberUndefined: Self = StObject.set(x, "colorNumber", js.undefined)
      
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
      
      inline def setThicknessUndefined: Self = StObject.set(x, "thickness", js.undefined)
      
      inline def setVertexX(value: Any): Self = StObject.set(x, "vertexX", value.asInstanceOf[js.Any])
      
      inline def setVertexXUndefined: Self = StObject.set(x, "vertexX", js.undefined)
      
      inline def setVertices(value: js.Array[Point2D]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
      
      inline def setVerticesUndefined: Self = StObject.set(x, "vertices", js.undefined)
      
      inline def setVerticesVarargs(value: Point2D*): Self = StObject.set(x, "vertices", js.Array(value*))
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
