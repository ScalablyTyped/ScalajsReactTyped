package typingsJapgolly.dxf

import typingsJapgolly.dxf.commonMod.ColorNumber
import typingsJapgolly.dxf.commonMod.UnitTypes
import typingsJapgolly.dxf.handlersEntitiesMod.Entity
import typingsJapgolly.dxf.informationMod.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object handlersEntityVertexMod {
  
  @JSImport("dxf/handlers/entity/vertex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("dxf/handlers/entity/vertex", "TYPE")
  @js.native
  val TYPE: String = js.native
  
  inline def process(value: Property): VertexEntityData = ^.asInstanceOf[js.Dynamic].applyDynamic("process")(value.asInstanceOf[js.Any]).asInstanceOf[VertexEntityData]
  
  /* Inlined {  bulge :number | undefined} & std.Partial<dxf.dxf/Common.Point3D> & std.Partial<dxf.dxf/handlers/entity/common.CommonEntityData> */
  trait VertexEntityData
    extends StObject
       with Entity {
    
    @JSName("$INSUNITS")
    var $INSUNITS: js.UndefOr[UnitTypes] = js.undefined
    
    var TYPE: js.UndefOr[String] = js.undefined
    
    var bulge: js.UndefOr[Double] = js.undefined
    
    var colorNumber: js.UndefOr[ColorNumber] = js.undefined
    
    var extrusionX: js.UndefOr[Any] = js.undefined
    
    var extrusionY: js.UndefOr[Any] = js.undefined
    
    var extrusionZ: js.UndefOr[Any] = js.undefined
    
    var layer: js.UndefOr[String] = js.undefined
    
    var lineTypeName: js.UndefOr[String] = js.undefined
    
    var lineTypeScale: js.UndefOr[Any] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
    
    var z: js.UndefOr[Double] = js.undefined
  }
  object VertexEntityData {
    
    inline def apply(): VertexEntityData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VertexEntityData]
    }
    
    extension [Self <: VertexEntityData](x: Self) {
      
      inline def set$INSUNITS(value: UnitTypes): Self = StObject.set(x, "$INSUNITS", value.asInstanceOf[js.Any])
      
      inline def set$INSUNITSUndefined: Self = StObject.set(x, "$INSUNITS", js.undefined)
      
      inline def setBulge(value: Double): Self = StObject.set(x, "bulge", value.asInstanceOf[js.Any])
      
      inline def setBulgeUndefined: Self = StObject.set(x, "bulge", js.undefined)
      
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
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
      
      inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
      
      inline def setZUndefined: Self = StObject.set(x, "z", js.undefined)
    }
  }
}
