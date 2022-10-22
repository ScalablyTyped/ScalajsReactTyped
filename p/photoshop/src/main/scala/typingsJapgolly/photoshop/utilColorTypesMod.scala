package typingsJapgolly.photoshop

import typingsJapgolly.photoshop.anon.Unit
import typingsJapgolly.photoshop.photoshopStrings.CMYKColorClass
import typingsJapgolly.photoshop.photoshopStrings.HSBColorClass
import typingsJapgolly.photoshop.photoshopStrings.RGBColor
import typingsJapgolly.photoshop.photoshopStrings.grayscale_
import typingsJapgolly.photoshop.photoshopStrings.labColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilColorTypesMod {
  
  trait CMYKColorDescriptor
    extends StObject
       with ColorDescriptor {
    
    var _obj: CMYKColorClass
    
    var black: Double
    
    var cyan: Double
    
    var magenta: Double
    
    var yellow: Double
  }
  object CMYKColorDescriptor {
    
    inline def apply(black: Double, cyan: Double, magenta: Double, yellow: Double): CMYKColorDescriptor = {
      val __obj = js.Dynamic.literal(_obj = "CMYKColorClass", black = black.asInstanceOf[js.Any], cyan = cyan.asInstanceOf[js.Any], magenta = magenta.asInstanceOf[js.Any], yellow = yellow.asInstanceOf[js.Any])
      __obj.asInstanceOf[CMYKColorDescriptor]
    }
    
    extension [Self <: CMYKColorDescriptor](x: Self) {
      
      inline def setBlack(value: Double): Self = StObject.set(x, "black", value.asInstanceOf[js.Any])
      
      inline def setCyan(value: Double): Self = StObject.set(x, "cyan", value.asInstanceOf[js.Any])
      
      inline def setMagenta(value: Double): Self = StObject.set(x, "magenta", value.asInstanceOf[js.Any])
      
      inline def setYellow(value: Double): Self = StObject.set(x, "yellow", value.asInstanceOf[js.Any])
      
      inline def set_obj(value: CMYKColorClass): Self = StObject.set(x, "_obj", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.photoshop.utilColorTypesMod.RGBColorDescriptor
    - typingsJapgolly.photoshop.utilColorTypesMod.HSBColorDescriptor
    - typingsJapgolly.photoshop.utilColorTypesMod.CMYKColorDescriptor
    - typingsJapgolly.photoshop.utilColorTypesMod.LabColorDescriptor
    - typingsJapgolly.photoshop.utilColorTypesMod.GrayscaleColorDescriptor
  */
  trait ColorDescriptor extends StObject
  object ColorDescriptor {
    
    inline def CMYKColorDescriptor(black: Double, cyan: Double, magenta: Double, yellow: Double): typingsJapgolly.photoshop.utilColorTypesMod.CMYKColorDescriptor = {
      val __obj = js.Dynamic.literal(_obj = "CMYKColorClass", black = black.asInstanceOf[js.Any], cyan = cyan.asInstanceOf[js.Any], magenta = magenta.asInstanceOf[js.Any], yellow = yellow.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.photoshop.utilColorTypesMod.CMYKColorDescriptor]
    }
    
    inline def GrayscaleColorDescriptor(gray: Double): typingsJapgolly.photoshop.utilColorTypesMod.GrayscaleColorDescriptor = {
      val __obj = js.Dynamic.literal(_obj = "grayscale", gray = gray.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.photoshop.utilColorTypesMod.GrayscaleColorDescriptor]
    }
    
    inline def HSBColorDescriptor(brightness: Double, hue: Unit, saturation: Double): typingsJapgolly.photoshop.utilColorTypesMod.HSBColorDescriptor = {
      val __obj = js.Dynamic.literal(_obj = "HSBColorClass", brightness = brightness.asInstanceOf[js.Any], hue = hue.asInstanceOf[js.Any], saturation = saturation.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.photoshop.utilColorTypesMod.HSBColorDescriptor]
    }
    
    inline def LabColorDescriptor(a: Double, b: Double, luminance: Double): typingsJapgolly.photoshop.utilColorTypesMod.LabColorDescriptor = {
      val __obj = js.Dynamic.literal(_obj = "labColor", a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], luminance = luminance.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.photoshop.utilColorTypesMod.LabColorDescriptor]
    }
    
    inline def RGBColorDescriptor(blue: Double, green: Double, red: Double): typingsJapgolly.photoshop.utilColorTypesMod.RGBColorDescriptor = {
      val __obj = js.Dynamic.literal(_obj = "RGBColor", blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.photoshop.utilColorTypesMod.RGBColorDescriptor]
    }
  }
  
  trait GrayscaleColorDescriptor
    extends StObject
       with ColorDescriptor {
    
    var _obj: grayscale_
    
    var gray: Double
  }
  object GrayscaleColorDescriptor {
    
    inline def apply(gray: Double): GrayscaleColorDescriptor = {
      val __obj = js.Dynamic.literal(_obj = "grayscale", gray = gray.asInstanceOf[js.Any])
      __obj.asInstanceOf[GrayscaleColorDescriptor]
    }
    
    extension [Self <: GrayscaleColorDescriptor](x: Self) {
      
      inline def setGray(value: Double): Self = StObject.set(x, "gray", value.asInstanceOf[js.Any])
      
      inline def set_obj(value: grayscale_): Self = StObject.set(x, "_obj", value.asInstanceOf[js.Any])
    }
  }
  
  trait HSBColorDescriptor
    extends StObject
       with ColorDescriptor {
    
    var _obj: HSBColorClass
    
    var brightness: Double
    
    var hue: Unit
    
    var saturation: Double
  }
  object HSBColorDescriptor {
    
    inline def apply(brightness: Double, hue: Unit, saturation: Double): HSBColorDescriptor = {
      val __obj = js.Dynamic.literal(_obj = "HSBColorClass", brightness = brightness.asInstanceOf[js.Any], hue = hue.asInstanceOf[js.Any], saturation = saturation.asInstanceOf[js.Any])
      __obj.asInstanceOf[HSBColorDescriptor]
    }
    
    extension [Self <: HSBColorDescriptor](x: Self) {
      
      inline def setBrightness(value: Double): Self = StObject.set(x, "brightness", value.asInstanceOf[js.Any])
      
      inline def setHue(value: Unit): Self = StObject.set(x, "hue", value.asInstanceOf[js.Any])
      
      inline def setSaturation(value: Double): Self = StObject.set(x, "saturation", value.asInstanceOf[js.Any])
      
      inline def set_obj(value: HSBColorClass): Self = StObject.set(x, "_obj", value.asInstanceOf[js.Any])
    }
  }
  
  trait LabColorDescriptor
    extends StObject
       with ColorDescriptor {
    
    var _obj: labColor
    
    var a: Double
    
    var b: Double
    
    var luminance: Double
  }
  object LabColorDescriptor {
    
    inline def apply(a: Double, b: Double, luminance: Double): LabColorDescriptor = {
      val __obj = js.Dynamic.literal(_obj = "labColor", a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], luminance = luminance.asInstanceOf[js.Any])
      __obj.asInstanceOf[LabColorDescriptor]
    }
    
    extension [Self <: LabColorDescriptor](x: Self) {
      
      inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setLuminance(value: Double): Self = StObject.set(x, "luminance", value.asInstanceOf[js.Any])
      
      inline def set_obj(value: labColor): Self = StObject.set(x, "_obj", value.asInstanceOf[js.Any])
    }
  }
  
  trait RGBColorDescriptor
    extends StObject
       with ColorDescriptor {
    
    var _obj: RGBColor
    
    var blue: Double
    
    var green: Double
    
    var red: Double
  }
  object RGBColorDescriptor {
    
    inline def apply(blue: Double, green: Double, red: Double): RGBColorDescriptor = {
      val __obj = js.Dynamic.literal(_obj = "RGBColor", blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
      __obj.asInstanceOf[RGBColorDescriptor]
    }
    
    extension [Self <: RGBColorDescriptor](x: Self) {
      
      inline def setBlue(value: Double): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
      
      inline def setGreen(value: Double): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
      
      inline def setRed(value: Double): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
      
      inline def set_obj(value: RGBColor): Self = StObject.set(x, "_obj", value.asInstanceOf[js.Any])
    }
  }
}
