package typingsJapgolly.nivoBullet

import typingsJapgolly.nivoBullet.anon.Data
import typingsJapgolly.nivoBullet.anon.Height
import typingsJapgolly.nivoBullet.anon.PickBulletRectsPropsdataC
import typingsJapgolly.nivoBullet.distTypesTypesMod.ComputedRangeDatum
import typingsJapgolly.nivoBullet.nivoBulletStrings.horizontal
import typingsJapgolly.nivoBullet.nivoBulletStrings.measures
import typingsJapgolly.nivoBullet.nivoBulletStrings.range
import typingsJapgolly.nivoBullet.nivoBulletStrings.vertical
import typingsJapgolly.nivoScales.distTypesTypesMod.ScaleLinear
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComputeMod {
  
  @JSImport("@nivo/bullet/dist/types/compute", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeRects(hasDataLayoutReverseScaleHeight: PickBulletRectsPropsdataC): js.Array[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeRects")(hasDataLayoutReverseScaleHeight.asInstanceOf[js.Any]).asInstanceOf[js.Array[Data]]
  
  inline def getComputeRect(hasLayoutReverseScaleHeight: ComputeRect): js.Function1[/* d */ ComputedRangeDatum, Height] = ^.asInstanceOf[js.Dynamic].applyDynamic("getComputeRect")(hasLayoutReverseScaleHeight.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* d */ ComputedRangeDatum, Height]]
  
  inline def stackValues(
    values: js.Array[Double],
    scale: ScaleLinear[Double],
    colorScale: ReturnType[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify getColorScale */ Any
    ],
    `type`: range | measures
  ): js.Array[ComputedRangeDatum] = (^.asInstanceOf[js.Dynamic].applyDynamic("stackValues")(values.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], colorScale.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Array[ComputedRangeDatum]]
  inline def stackValues(
    values: js.Array[Double],
    scale: ScaleLinear[Double],
    colorScale: ReturnType[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify getColorScale */ Any
    ],
    `type`: range | measures,
    useAverage: Boolean
  ): js.Array[ComputedRangeDatum] = (^.asInstanceOf[js.Dynamic].applyDynamic("stackValues")(values.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], colorScale.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], useAverage.asInstanceOf[js.Any])).asInstanceOf[js.Array[ComputedRangeDatum]]
  
  /* Inlined std.Pick<@nivo/bullet.@nivo/bullet/dist/types/types.BulletRectsProps, 'layout' | 'reverse' | 'scale' | 'height'> */
  trait ComputeRect extends StObject {
    
    var height: Double
    
    var layout: horizontal | vertical
    
    var reverse: Boolean
    
    var scale: ScaleLinear[Double]
  }
  object ComputeRect {
    
    inline def apply(height: Double, layout: horizontal | vertical, reverse: Boolean, scale: ScaleLinear[Double]): ComputeRect = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], reverse = reverse.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComputeRect]
    }
    
    extension [Self <: ComputeRect](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLayout(value: horizontal | vertical): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setScale(value: ScaleLinear[Double]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    }
  }
}
