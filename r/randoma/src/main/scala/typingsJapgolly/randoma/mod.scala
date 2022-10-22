package typingsJapgolly.randoma

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.color.mod.Color
import typingsJapgolly.color.mod.ColorConstructor
import typingsJapgolly.color.mod.ColorParam
import typingsJapgolly.randoma.randomaStrings.ansi16
import typingsJapgolly.randoma.randomaStrings.ansi256
import typingsJapgolly.randoma.randomaStrings.apple
import typingsJapgolly.randoma.randomaStrings.cmyk
import typingsJapgolly.randoma.randomaStrings.gray
import typingsJapgolly.randoma.randomaStrings.hcg
import typingsJapgolly.randoma.randomaStrings.hex
import typingsJapgolly.randoma.randomaStrings.hsl
import typingsJapgolly.randoma.randomaStrings.hsv
import typingsJapgolly.randoma.randomaStrings.hwb
import typingsJapgolly.randoma.randomaStrings.keyword
import typingsJapgolly.randoma.randomaStrings.lab
import typingsJapgolly.randoma.randomaStrings.lch
import typingsJapgolly.randoma.randomaStrings.rgb
import typingsJapgolly.randoma.randomaStrings.xyz
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("randoma", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Randoma {
    /**
    	User-friendly [pseudorandom number generator (PRNG)](https://en.wikipedia.org/wiki/Pseudorandom_number_generator).
    	This is not cryptographically secure.
    	@example
    	```
    	import Randoma from 'randoma';
    	const random = new Randoma({seed: 10});
    	random.integer();
    	//=> 2027521326
    	random.integer();
    	//=> 677268843
    	(new Randoma({seed: '🦄'}).integer());
    	//=> 1659974344
    	(new Randoma({seed: '🦄'}).integer());
    	//=> 1659974344
    	```
    	*/
    def this(options: Options) = this()
  }
  /* static members */
  object default {
    
    @JSImport("randoma", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
    	@returns A random seed you could use in the `seed` option if you for some reason don't want deterministic randomness.
    	*/
    inline def seed(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("seed")().asInstanceOf[Double]
  }
  
  object Color extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("randoma", "Color")
    @js.native
    open class ^[T /* <: ColorParam */] ()
      extends StObject
         with typingsJapgolly.color.mod.Color[T] {
      def this(obj: T) = this()
      def this(
        obj: T,
        model: /* keyof color.anon.Typeofconvert */ rgb | xyz | hcg | ansi256 | ansi16 | hex | lch | cmyk | hsl | keyword | gray | hsv | apple | hwb | lab
      ) = this()
      def this(
        obj: Unit,
        model: /* keyof color.anon.Typeofconvert */ rgb | xyz | hcg | ansi256 | ansi16 | hex | lch | cmyk | hsl | keyword | gray | hsv | apple | hwb | lab
      ) = this()
    }
    
    @JSImport("randoma", "Color")
    @js.native
    val ^ : js.Object & ColorConstructor = js.native
    
    type _To = js.Object & ColorConstructor
    
    /* This means you don't have to write `^`, but can instead just say `Color.foo` */
    override def _to: js.Object & ColorConstructor = ^
  }
  
  trait Options extends StObject {
    
    /**
    	[Initialization seed.](https://en.wikipedia.org/wiki/Random_seed)
    	Multiple instances of `Randoma` with the same seed will generate the same random numbers.
    	*/
    val seed: String | Double
  }
  object Options {
    
    inline def apply(seed: String | Double): Options = {
      val __obj = js.Dynamic.literal(seed = seed.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setSeed(value: String | Double): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Randoma extends StObject {
    
    def arrayItem[T](array: js.Array[T]): T = js.native
    
    def boolean(): Boolean = js.native
    
    /**
    	@param saturation - A percentage in the range `0...1`. Default: `0.5`.
    	@returns A random [aesthetically pleasing color](https://martin.ankerl.com/2009/12/09/how-to-create-random-colors-programmatically/) as a [`color`](https://github.com/Qix-/color) object.
    	@example
    	```
    	random.color(0.5).hex().toString()
    	//=> '#AAF2B0'
    	```
    	*/
    def color(): Color[ColorParam] = js.native
    def color(saturation: Double): Color[ColorParam] = js.native
    
    def date(): js.Date = js.native
    
    def dateInRange(startDate: js.Date, endDate: js.Date): js.Date = js.native
    
    def float(): Double = js.native
    
    def floatInRange(minimum: Double, maximum: Double): Double = js.native
    
    def integer(): Double = js.native
    
    def integerInRange(minimum: Double, maximum: Double): Double = js.native
  }
}
