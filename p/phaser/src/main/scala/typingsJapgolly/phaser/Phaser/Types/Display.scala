package typingsJapgolly.phaser.Phaser.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Display {
  
  trait ColorObject extends StObject {
    
    /**
      * The alpha color value in the range 0 to 255.
      */
    var a: Double
    
    /**
      * The blue color value in the range 0 to 255.
      */
    var b: Double
    
    /**
      * The green color value in the range 0 to 255.
      */
    var g: Double
    
    /**
      * The red color value in the range 0 to 255.
      */
    var r: Double
  }
  object ColorObject {
    
    inline def apply(a: Double, b: Double, g: Double, r: Double): ColorObject = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorObject]
    }
    
    extension [Self <: ColorObject](x: Self) {
      
      inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
  
  trait HSVColorObject extends StObject {
    
    /**
      * The hue color value. A number between 0 and 1
      */
    var h: Double
    
    /**
      * The saturation color value. A number between 0 and 1
      */
    var s: Double
    
    /**
      * The lightness color value. A number between 0 and 1
      */
    var v: Double
  }
  object HSVColorObject {
    
    inline def apply(h: Double, s: Double, v: Double): HSVColorObject = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[HSVColorObject]
    }
    
    extension [Self <: HSVColorObject](x: Self) {
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      inline def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
  
  trait InputColorObject extends StObject {
    
    /**
      * The alpha color value in the range 0 to 255.
      */
    var a: js.UndefOr[Double] = js.undefined
    
    /**
      * The blue color value in the range 0 to 255.
      */
    var b: js.UndefOr[Double] = js.undefined
    
    /**
      * The green color value in the range 0 to 255.
      */
    var g: js.UndefOr[Double] = js.undefined
    
    /**
      * The red color value in the range 0 to 255.
      */
    var r: js.UndefOr[Double] = js.undefined
  }
  object InputColorObject {
    
    inline def apply(): InputColorObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputColorObject]
    }
    
    extension [Self <: InputColorObject](x: Self) {
      
      inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setAUndefined: Self = StObject.set(x, "a", js.undefined)
      
      inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setBUndefined: Self = StObject.set(x, "b", js.undefined)
      
      inline def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      inline def setGUndefined: Self = StObject.set(x, "g", js.undefined)
      
      inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      inline def setRUndefined: Self = StObject.set(x, "r", js.undefined)
    }
  }
}
