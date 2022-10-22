package typingsJapgolly.officeUiFabricReact

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilitiesColorInterfacesMod {
  
  trait IColor
    extends StObject
       with IRGB
       with IHSV {
    
    /** Hex string for the color (excluding alpha component), *not* prefixed with #. */
    var hex: String
    
    /** CSS color string. If a hex value, it must be prefixed with #. */
    var str: String
    
    /** Transparency value, range 0 (opaque) to 100 (transparent). Usually assumed to be 0 if not specified. */
    var t: js.UndefOr[Double] = js.undefined
  }
  object IColor {
    
    inline def apply(b: Double, g: Double, h: Double, hex: String, r: Double, s: Double, str: String, v: Double): IColor = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], hex = hex.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], str = str.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[IColor]
    }
    
    extension [Self <: IColor](x: Self) {
      
      inline def setHex(value: String): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
      
      inline def setStr(value: String): Self = StObject.set(x, "str", value.asInstanceOf[js.Any])
      
      inline def setT(value: Double): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
      
      inline def setTUndefined: Self = StObject.set(x, "t", js.undefined)
    }
  }
  
  trait IHSL extends StObject {
    
    /** Hue, range 0-359. */
    var h: Double
    
    /** Lightness, range 0-100. */
    var l: Double
    
    /** Saturation, range 0-100. */
    var s: Double
  }
  object IHSL {
    
    inline def apply(h: Double, l: Double, s: Double): IHSL = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
      __obj.asInstanceOf[IHSL]
    }
    
    extension [Self <: IHSL](x: Self) {
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setL(value: Double): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
      
      inline def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    }
  }
  
  trait IHSV extends StObject {
    
    /** Hue, range 0-359. */
    var h: Double
    
    /** Saturation, range 0-100. */
    var s: Double
    
    /** Value, range 0-100. */
    var v: Double
  }
  object IHSV {
    
    inline def apply(h: Double, s: Double, v: Double): IHSV = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[IHSV]
    }
    
    extension [Self <: IHSV](x: Self) {
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      inline def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
  
  trait IRGB extends StObject {
    
    /** Alpha, range 0 (transparent)-100. Usually assumed to be 100 if not specified. */
    var a: js.UndefOr[Double] = js.undefined
    
    /** Blue, range 0-255. */
    var b: Double
    
    /** Green, range 0-255. */
    var g: Double
    
    /** Red, range 0-255. */
    var r: Double
  }
  object IRGB {
    
    inline def apply(b: Double, g: Double, r: Double): IRGB = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRGB]
    }
    
    extension [Self <: IRGB](x: Self) {
      
      inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setAUndefined: Self = StObject.set(x, "a", js.undefined)
      
      inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
}
