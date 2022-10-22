package typingsJapgolly.sourceMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined source-map.source-map.MappedPosition & {  bias :number | undefined} */
  trait MappedPositionbiasnumberu extends StObject {
    
    var bias: js.UndefOr[Double] = js.undefined
    
    var column: Double
    
    var line: Double
    
    var name: js.UndefOr[String] = js.undefined
    
    var source: String
  }
  object MappedPositionbiasnumberu {
    
    inline def apply(column: Double, line: Double, source: String): MappedPositionbiasnumberu = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[MappedPositionbiasnumberu]
    }
    
    extension [Self <: MappedPositionbiasnumberu](x: Self) {
      
      inline def setBias(value: Double): Self = StObject.set(x, "bias", value.asInstanceOf[js.Any])
      
      inline def setBiasUndefined: Self = StObject.set(x, "bias", js.undefined)
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined source-map.source-map.Position & {  bias :number | undefined} */
  trait Positionbiasnumberundefin extends StObject {
    
    var bias: js.UndefOr[Double] = js.undefined
    
    var column: Double
    
    var line: Double
  }
  object Positionbiasnumberundefin {
    
    inline def apply(column: Double, line: Double): Positionbiasnumberundefin = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[Positionbiasnumberundefin]
    }
    
    extension [Self <: Positionbiasnumberundefin](x: Self) {
      
      inline def setBias(value: Double): Self = StObject.set(x, "bias", value.asInstanceOf[js.Any])
      
      inline def setBiasUndefined: Self = StObject.set(x, "bias", js.undefined)
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
}
