package typingsJapgolly.randomcolor

import typingsJapgolly.randomcolor.randomcolorStrings.bright
import typingsJapgolly.randomcolor.randomcolorStrings.dark
import typingsJapgolly.randomcolor.randomcolorStrings.hex
import typingsJapgolly.randomcolor.randomcolorStrings.hsl
import typingsJapgolly.randomcolor.randomcolorStrings.hslArray
import typingsJapgolly.randomcolor.randomcolorStrings.hsla
import typingsJapgolly.randomcolor.randomcolorStrings.hsvArray
import typingsJapgolly.randomcolor.randomcolorStrings.light
import typingsJapgolly.randomcolor.randomcolorStrings.random
import typingsJapgolly.randomcolor.randomcolorStrings.rgb
import typingsJapgolly.randomcolor.randomcolorStrings.rgbArray
import typingsJapgolly.randomcolor.randomcolorStrings.rgba
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): String = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[String]
  inline def apply(options: RandomColorOptionsMultiple): js.Array[String] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def apply(options: RandomColorOptionsSingle): String = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("randomcolor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait RandomColorOptionsMultiple
    extends StObject
       with RandomColorOptionsSingle {
    
    var count: Double
  }
  object RandomColorOptionsMultiple {
    
    inline def apply(count: Double): RandomColorOptionsMultiple = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
      __obj.asInstanceOf[RandomColorOptionsMultiple]
    }
    
    extension [Self <: RandomColorOptionsMultiple](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    }
  }
  
  trait RandomColorOptionsSingle extends StObject {
    
    var alpha: js.UndefOr[Double] = js.undefined
    
    var format: js.UndefOr[hsvArray | hslArray | hsl | hsla | rgbArray | rgb | rgba | hex] = js.undefined
    
    var hue: js.UndefOr[Double | String] = js.undefined
    
    var luminosity: js.UndefOr[bright | light | dark | random] = js.undefined
    
    var seed: js.UndefOr[Double | String] = js.undefined
  }
  object RandomColorOptionsSingle {
    
    inline def apply(): RandomColorOptionsSingle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RandomColorOptionsSingle]
    }
    
    extension [Self <: RandomColorOptionsSingle](x: Self) {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      inline def setFormat(value: hsvArray | hslArray | hsl | hsla | rgbArray | rgb | rgba | hex): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setHue(value: Double | String): Self = StObject.set(x, "hue", value.asInstanceOf[js.Any])
      
      inline def setHueUndefined: Self = StObject.set(x, "hue", js.undefined)
      
      inline def setLuminosity(value: bright | light | dark | random): Self = StObject.set(x, "luminosity", value.asInstanceOf[js.Any])
      
      inline def setLuminosityUndefined: Self = StObject.set(x, "luminosity", js.undefined)
      
      inline def setSeed(value: Double | String): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
      
      inline def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
    }
  }
}
