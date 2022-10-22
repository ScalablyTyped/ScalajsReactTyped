package typingsJapgolly.babar

import typingsJapgolly.babar.babarStrings.ascii
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(points: js.Array[js.Tuple2[Double, Double]]): String = ^.asInstanceOf[js.Dynamic].apply(points.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(points: js.Array[js.Tuple2[Double, Double]], options: Options): String = (^.asInstanceOf[js.Dynamic].apply(points.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("babar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var caption: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[typingsJapgolly.babar.mod.color | ascii] = js.undefined
    
    var grid: js.UndefOr[color] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var maxX: js.UndefOr[Double] = js.undefined
    
    var maxY: js.UndefOr[Double] = js.undefined
    
    var minX: js.UndefOr[Double] = js.undefined
    
    var minY: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
    
    var xFractions: js.UndefOr[Double] = js.undefined
    
    var yFractions: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
      
      inline def setColor(value: color | ascii): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setGrid(value: color): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setMaxX(value: Double): Self = StObject.set(x, "maxX", value.asInstanceOf[js.Any])
      
      inline def setMaxXUndefined: Self = StObject.set(x, "maxX", js.undefined)
      
      inline def setMaxY(value: Double): Self = StObject.set(x, "maxY", value.asInstanceOf[js.Any])
      
      inline def setMaxYUndefined: Self = StObject.set(x, "maxY", js.undefined)
      
      inline def setMinX(value: Double): Self = StObject.set(x, "minX", value.asInstanceOf[js.Any])
      
      inline def setMinXUndefined: Self = StObject.set(x, "minX", js.undefined)
      
      inline def setMinY(value: Double): Self = StObject.set(x, "minY", value.asInstanceOf[js.Any])
      
      inline def setMinYUndefined: Self = StObject.set(x, "minY", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setXFractions(value: Double): Self = StObject.set(x, "xFractions", value.asInstanceOf[js.Any])
      
      inline def setXFractionsUndefined: Self = StObject.set(x, "xFractions", js.undefined)
      
      inline def setYFractions(value: Double): Self = StObject.set(x, "yFractions", value.asInstanceOf[js.Any])
      
      inline def setYFractionsUndefined: Self = StObject.set(x, "yFractions", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.babar.babarStrings.yellow
    - typingsJapgolly.babar.babarStrings.cyan
    - typingsJapgolly.babar.babarStrings.white
    - typingsJapgolly.babar.babarStrings.magenta
    - typingsJapgolly.babar.babarStrings.green
    - typingsJapgolly.babar.babarStrings.red
    - typingsJapgolly.babar.babarStrings.grey
    - typingsJapgolly.babar.babarStrings.blue
  */
  trait color extends StObject
  object color {
    
    inline def blue: typingsJapgolly.babar.babarStrings.blue = "blue".asInstanceOf[typingsJapgolly.babar.babarStrings.blue]
    
    inline def cyan: typingsJapgolly.babar.babarStrings.cyan = "cyan".asInstanceOf[typingsJapgolly.babar.babarStrings.cyan]
    
    inline def green: typingsJapgolly.babar.babarStrings.green = "green".asInstanceOf[typingsJapgolly.babar.babarStrings.green]
    
    inline def grey: typingsJapgolly.babar.babarStrings.grey = "grey".asInstanceOf[typingsJapgolly.babar.babarStrings.grey]
    
    inline def magenta: typingsJapgolly.babar.babarStrings.magenta = "magenta".asInstanceOf[typingsJapgolly.babar.babarStrings.magenta]
    
    inline def red: typingsJapgolly.babar.babarStrings.red = "red".asInstanceOf[typingsJapgolly.babar.babarStrings.red]
    
    inline def white: typingsJapgolly.babar.babarStrings.white = "white".asInstanceOf[typingsJapgolly.babar.babarStrings.white]
    
    inline def yellow: typingsJapgolly.babar.babarStrings.yellow = "yellow".asInstanceOf[typingsJapgolly.babar.babarStrings.yellow]
  }
}
