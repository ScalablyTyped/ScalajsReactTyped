package typingsJapgolly.trianglify

import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.SVGElement
import typingsJapgolly.trianglify.mod.trianglify.Options
import typingsJapgolly.trianglify.mod.trianglify.Pattern
import typingsJapgolly.trianglify.trianglifyBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Pattern = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Pattern]
  inline def apply(opts: Options): Pattern = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[Pattern]
  
  @JSImport("trianglify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object trianglify {
    
    trait Options extends StObject {
      
      /** Size of the cells used to generate a randomized grid */
      var cell_size: js.UndefOr[Double] = js.undefined
      
      /** Color function f(x, y) that returns a color specification that is consumable by chroma-js */
      var color_function: js.UndefOr[(js.Function2[/* x */ Double, /* y */ Double, String]) | Null] = js.undefined
      
      /** Color space used for gradient construction & interpolation */
      var color_space: js.UndefOr[String] = js.undefined
      
      /** Height of pattern */
      var height: js.UndefOr[Double] = js.undefined
      
      /** An array of [x,y] coordinates to trianglulate. Defaults to undefined, and points are generated. */
      var points: js.UndefOr[js.Array[Double]] = js.undefined
      
      /** Seed for the RNG */
      var seed: js.UndefOr[Double | String | Null] = js.undefined
      
      /** Width of stroke. Defaults to 1.51 to fix an issue with canvas antialiasing. */
      var stroke_width: js.UndefOr[Double] = js.undefined
      
      /** how much to randomize the grid */
      var variance: js.UndefOr[Double] = js.undefined
      
      /** Width of pattern */
      var width: js.UndefOr[Double] = js.undefined
      
      /** X color stops */
      var x_colors: js.UndefOr[`false` | String | js.Array[String]] = js.undefined
      
      /** Y color stops */
      var y_colors: js.UndefOr[`false` | String | js.Array[String]] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setCell_size(value: Double): Self = StObject.set(x, "cell_size", value.asInstanceOf[js.Any])
        
        inline def setCell_sizeUndefined: Self = StObject.set(x, "cell_size", js.undefined)
        
        inline def setColor_function(value: (/* x */ Double, /* y */ Double) => String): Self = StObject.set(x, "color_function", js.Any.fromFunction2(value))
        
        inline def setColor_functionNull: Self = StObject.set(x, "color_function", null)
        
        inline def setColor_functionUndefined: Self = StObject.set(x, "color_function", js.undefined)
        
        inline def setColor_space(value: String): Self = StObject.set(x, "color_space", value.asInstanceOf[js.Any])
        
        inline def setColor_spaceUndefined: Self = StObject.set(x, "color_space", js.undefined)
        
        inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
        
        inline def setPoints(value: js.Array[Double]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
        
        inline def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
        
        inline def setPointsVarargs(value: Double*): Self = StObject.set(x, "points", js.Array(value*))
        
        inline def setSeed(value: Double | String): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
        
        inline def setSeedNull: Self = StObject.set(x, "seed", null)
        
        inline def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
        
        inline def setStroke_width(value: Double): Self = StObject.set(x, "stroke_width", value.asInstanceOf[js.Any])
        
        inline def setStroke_widthUndefined: Self = StObject.set(x, "stroke_width", js.undefined)
        
        inline def setVariance(value: Double): Self = StObject.set(x, "variance", value.asInstanceOf[js.Any])
        
        inline def setVarianceUndefined: Self = StObject.set(x, "variance", js.undefined)
        
        inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
        
        inline def setX_colors(value: `false` | String | js.Array[String]): Self = StObject.set(x, "x_colors", value.asInstanceOf[js.Any])
        
        inline def setX_colorsUndefined: Self = StObject.set(x, "x_colors", js.undefined)
        
        inline def setX_colorsVarargs(value: String*): Self = StObject.set(x, "x_colors", js.Array(value*))
        
        inline def setY_colors(value: `false` | String | js.Array[String]): Self = StObject.set(x, "y_colors", value.asInstanceOf[js.Any])
        
        inline def setY_colorsUndefined: Self = StObject.set(x, "y_colors", js.undefined)
        
        inline def setY_colorsVarargs(value: String*): Self = StObject.set(x, "y_colors", js.Array(value*))
      }
    }
    
    @js.native
    trait Pattern extends StObject {
      
      def canvas(): HTMLCanvasElement = js.native
      def canvas(canvas: HTMLCanvasElement): HTMLCanvasElement = js.native
      
      var opts: Options = js.native
      
      def png(): String = js.native
      
      var polys: Any = js.native
      
      def svg(): SVGElement = js.native
      def svg(opts: SVGOptions): SVGElement = js.native
    }
    
    trait SVGOptions extends StObject {
      
      var includeNamespace: Boolean
    }
    object SVGOptions {
      
      inline def apply(includeNamespace: Boolean): SVGOptions = {
        val __obj = js.Dynamic.literal(includeNamespace = includeNamespace.asInstanceOf[js.Any])
        __obj.asInstanceOf[SVGOptions]
      }
      
      extension [Self <: SVGOptions](x: Self) {
        
        inline def setIncludeNamespace(value: Boolean): Self = StObject.set(x, "includeNamespace", value.asInstanceOf[js.Any])
      }
    }
  }
}
