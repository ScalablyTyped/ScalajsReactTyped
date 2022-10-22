package typingsJapgolly.nivoGenerators

import typingsJapgolly.nivoGenerators.anon.DataId
import typingsJapgolly.nivoGenerators.anon.SerieIds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesXySeriesMod {
  
  @JSImport("@nivo/generators/dist/types/xySeries", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateXYSeries(hasSerieIdsXY: SerieIds): js.Array[DataId] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateXYSeries")(hasSerieIdsXY.asInstanceOf[js.Any]).asInstanceOf[js.Array[DataId]]
  
  trait XYRandomNumericValues
    extends StObject
       with XYRangeValues {
    
    var length: Double
    
    var max: Double
    
    var min: Double
    
    var round: js.UndefOr[Boolean] = js.undefined
  }
  object XYRandomNumericValues {
    
    inline def apply(length: Double, max: Double, min: Double): XYRandomNumericValues = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
      __obj.asInstanceOf[XYRandomNumericValues]
    }
    
    extension [Self <: XYRandomNumericValues](x: Self) {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setRound(value: Boolean): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
      
      inline def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
    }
  }
  
  trait XYRangeStaticValues
    extends StObject
       with XYRangeValues {
    
    var values: js.Array[Double | String]
  }
  object XYRangeStaticValues {
    
    inline def apply(values: js.Array[Double | String]): XYRangeStaticValues = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[XYRangeStaticValues]
    }
    
    extension [Self <: XYRangeStaticValues](x: Self) {
      
      inline def setValues(value: js.Array[Double | String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: (Double | String)*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.nivoGenerators.distTypesXySeriesMod.XYRangeStaticValues
    - typingsJapgolly.nivoGenerators.distTypesXySeriesMod.XYRandomNumericValues
  */
  trait XYRangeValues extends StObject
  object XYRangeValues {
    
    inline def XYRandomNumericValues(length: Double, max: Double, min: Double): typingsJapgolly.nivoGenerators.distTypesXySeriesMod.XYRandomNumericValues = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.nivoGenerators.distTypesXySeriesMod.XYRandomNumericValues]
    }
    
    inline def XYRangeStaticValues(values: js.Array[Double | String]): typingsJapgolly.nivoGenerators.distTypesXySeriesMod.XYRangeStaticValues = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.nivoGenerators.distTypesXySeriesMod.XYRangeStaticValues]
    }
  }
}
