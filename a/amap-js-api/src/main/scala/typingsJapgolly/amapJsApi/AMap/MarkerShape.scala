package typingsJapgolly.amapJsApi.AMap

import typingsJapgolly.amapJsApi.amapJsApiStrings.circle
import typingsJapgolly.amapJsApi.amapJsApiStrings.poly
import typingsJapgolly.amapJsApi.amapJsApiStrings.rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MarkerShape {
  
  trait CircleOptions
    extends StObject
       with Options {
    
    var coords: js.Tuple3[Double, Double, Double]
    
    var `type`: circle
  }
  object CircleOptions {
    
    inline def apply(coords: js.Tuple3[Double, Double, Double]): CircleOptions = {
      val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("circle")
      __obj.asInstanceOf[CircleOptions]
    }
    
    extension [Self <: CircleOptions](x: Self) {
      
      inline def setCoords(value: js.Tuple3[Double, Double, Double]): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
      
      inline def setType(value: circle): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.amapJsApi.AMap.MarkerShape.CircleOptions
    - typingsJapgolly.amapJsApi.AMap.MarkerShape.PolyOptions
    - typingsJapgolly.amapJsApi.AMap.MarkerShape.RectOptions
  */
  trait Options extends StObject
  object Options {
    
    inline def CircleOptions(coords: js.Tuple3[Double, Double, Double]): typingsJapgolly.amapJsApi.AMap.MarkerShape.CircleOptions = {
      val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("circle")
      __obj.asInstanceOf[typingsJapgolly.amapJsApi.AMap.MarkerShape.CircleOptions]
    }
    
    inline def PolyOptions(coords: js.Array[Double]): typingsJapgolly.amapJsApi.AMap.MarkerShape.PolyOptions = {
      val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("poly")
      __obj.asInstanceOf[typingsJapgolly.amapJsApi.AMap.MarkerShape.PolyOptions]
    }
    
    inline def RectOptions(coords: js.Tuple4[Double, Double, Double, Double]): typingsJapgolly.amapJsApi.AMap.MarkerShape.RectOptions = {
      val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("rect")
      __obj.asInstanceOf[typingsJapgolly.amapJsApi.AMap.MarkerShape.RectOptions]
    }
  }
  
  trait PolyOptions
    extends StObject
       with Options {
    
    var coords: js.Array[Double]
    
    var `type`: poly
  }
  object PolyOptions {
    
    inline def apply(coords: js.Array[Double]): PolyOptions = {
      val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("poly")
      __obj.asInstanceOf[PolyOptions]
    }
    
    extension [Self <: PolyOptions](x: Self) {
      
      inline def setCoords(value: js.Array[Double]): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
      
      inline def setCoordsVarargs(value: Double*): Self = StObject.set(x, "coords", js.Array(value*))
      
      inline def setType(value: poly): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait RectOptions
    extends StObject
       with Options {
    
    var coords: js.Tuple4[Double, Double, Double, Double]
    
    var `type`: rect
  }
  object RectOptions {
    
    inline def apply(coords: js.Tuple4[Double, Double, Double, Double]): RectOptions = {
      val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("rect")
      __obj.asInstanceOf[RectOptions]
    }
    
    extension [Self <: RectOptions](x: Self) {
      
      inline def setCoords(value: js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
      
      inline def setType(value: rect): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
