package typingsJapgolly.tileReduce

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TileReduce {
  
  type BBox = js.Tuple4[Double, Double, Double, Double]
  
  trait Source extends StObject {
    
    var layers: js.UndefOr[js.Array[String]] = js.undefined
    
    var maxrate: js.UndefOr[Double] = js.undefined
    
    var mbtiles: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var raw: js.UndefOr[Boolean] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object Source {
    
    inline def apply(name: String): Source = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Source]
    }
    
    extension [Self <: Source](x: Self) {
      
      inline def setLayers(value: js.Array[String]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
      
      inline def setLayersVarargs(value: String*): Self = StObject.set(x, "layers", js.Array(value*))
      
      inline def setMaxrate(value: Double): Self = StObject.set(x, "maxrate", value.asInstanceOf[js.Any])
      
      inline def setMaxrateUndefined: Self = StObject.set(x, "maxrate", js.undefined)
      
      inline def setMbtiles(value: String): Self = StObject.set(x, "mbtiles", value.asInstanceOf[js.Any])
      
      inline def setMbtilesUndefined: Self = StObject.set(x, "mbtiles", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  type Tile = js.Tuple3[Double, Double, Double]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.tileReduce.tileReduceStrings.start
    - typingsJapgolly.tileReduce.tileReduceStrings.map
    - typingsJapgolly.tileReduce.tileReduceStrings.reduce
    - typingsJapgolly.tileReduce.tileReduceStrings.end
  */
  trait Types extends StObject
  object Types {
    
    inline def end: typingsJapgolly.tileReduce.tileReduceStrings.end = "end".asInstanceOf[typingsJapgolly.tileReduce.tileReduceStrings.end]
    
    inline def map: typingsJapgolly.tileReduce.tileReduceStrings.map = "map".asInstanceOf[typingsJapgolly.tileReduce.tileReduceStrings.map]
    
    inline def reduce: typingsJapgolly.tileReduce.tileReduceStrings.reduce = "reduce".asInstanceOf[typingsJapgolly.tileReduce.tileReduceStrings.reduce]
    
    inline def start: typingsJapgolly.tileReduce.tileReduceStrings.start = "start".asInstanceOf[typingsJapgolly.tileReduce.tileReduceStrings.start]
  }
}
