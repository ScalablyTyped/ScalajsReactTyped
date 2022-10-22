package typingsJapgolly.nivoGeo

import typingsJapgolly.nivoGeo.mod.ChoroplethBoundFeature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Feature extends StObject {
    
    var feature: ChoroplethBoundFeature
  }
  object Feature {
    
    inline def apply(feature: ChoroplethBoundFeature): Feature = {
      val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any])
      __obj.asInstanceOf[Feature]
    }
    
    extension [Self <: Feature](x: Self) {
      
      inline def setFeature(value: ChoroplethBoundFeature): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    }
  }
  
  trait FeatureAny extends StObject {
    
    var feature: Any
  }
  object FeatureAny {
    
    inline def apply(feature: Any): FeatureAny = {
      val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any])
      __obj.asInstanceOf[FeatureAny]
    }
    
    extension [Self <: FeatureAny](x: Self) {
      
      inline def setFeature(value: Any): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@nivo/core.@nivo/core.Box> */
  trait PartialBox extends StObject {
    
    var bottom: js.UndefOr[Double] = js.undefined
    
    var left: js.UndefOr[Double] = js.undefined
    
    var right: js.UndefOr[Double] = js.undefined
    
    var top: js.UndefOr[Double] = js.undefined
  }
  object PartialBox {
    
    inline def apply(): PartialBox = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialBox]
    }
    
    extension [Self <: PartialBox](x: Self) {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
}
