package typingsJapgolly.colorConvert.routeMod

import typingsJapgolly.colorConvert.conversionsMod.ANSI16_
import typingsJapgolly.colorConvert.conversionsMod.ANSI256_
import typingsJapgolly.colorConvert.conversionsMod.APPLE_
import typingsJapgolly.colorConvert.conversionsMod.CMYK_
import typingsJapgolly.colorConvert.conversionsMod.GRAY_
import typingsJapgolly.colorConvert.conversionsMod.HCG_
import typingsJapgolly.colorConvert.conversionsMod.HEX_
import typingsJapgolly.colorConvert.conversionsMod.HSL_
import typingsJapgolly.colorConvert.conversionsMod.HSV_
import typingsJapgolly.colorConvert.conversionsMod.HWB_
import typingsJapgolly.colorConvert.conversionsMod.KEYWORD_
import typingsJapgolly.colorConvert.conversionsMod.LAB_
import typingsJapgolly.colorConvert.conversionsMod.LCH_
import typingsJapgolly.colorConvert.conversionsMod.RGB_
import typingsJapgolly.colorConvert.conversionsMod.XYZ_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait hwb extends StObject {
  
  def ansi16(from: HWB_): ANSI16_
  
  def ansi256(from: HWB_): ANSI256_
  
  def apple(from: HWB_): APPLE_
  
  def cmyk(from: HWB_): CMYK_
  
  def gray(from: HWB_): GRAY_
  
  def hcg(from: HWB_): HCG_
  
  def hex(from: HWB_): HEX_
  
  def hsl(from: HWB_): HSL_
  
  def hsv(from: HWB_): HSV_
  
  def keyword(from: HWB_): KEYWORD_
  
  def lab(from: HWB_): LAB_
  
  def lch(from: HWB_): LCH_
  
  def rgb(from: HWB_): RGB_
  
  def xyz(from: HWB_): XYZ_
}
object hwb {
  
  inline def apply(
    ansi16: HWB_ => ANSI16_,
    ansi256: HWB_ => ANSI256_,
    apple: HWB_ => APPLE_,
    cmyk: HWB_ => CMYK_,
    gray: HWB_ => GRAY_,
    hcg: HWB_ => HCG_,
    hex: HWB_ => HEX_,
    hsl: HWB_ => HSL_,
    hsv: HWB_ => HSV_,
    keyword: HWB_ => KEYWORD_,
    lab: HWB_ => LAB_,
    lch: HWB_ => LCH_,
    rgb: HWB_ => RGB_,
    xyz: HWB_ => XYZ_
  ): hwb = {
    val __obj = js.Dynamic.literal(ansi16 = js.Any.fromFunction1(ansi16), ansi256 = js.Any.fromFunction1(ansi256), apple = js.Any.fromFunction1(apple), cmyk = js.Any.fromFunction1(cmyk), gray = js.Any.fromFunction1(gray), hcg = js.Any.fromFunction1(hcg), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction1(hsl), hsv = js.Any.fromFunction1(hsv), keyword = js.Any.fromFunction1(keyword), lab = js.Any.fromFunction1(lab), lch = js.Any.fromFunction1(lch), rgb = js.Any.fromFunction1(rgb), xyz = js.Any.fromFunction1(xyz))
    __obj.asInstanceOf[hwb]
  }
  
  extension [Self <: hwb](x: Self) {
    
    inline def setAnsi16(value: HWB_ => ANSI16_): Self = StObject.set(x, "ansi16", js.Any.fromFunction1(value))
    
    inline def setAnsi256(value: HWB_ => ANSI256_): Self = StObject.set(x, "ansi256", js.Any.fromFunction1(value))
    
    inline def setApple(value: HWB_ => APPLE_): Self = StObject.set(x, "apple", js.Any.fromFunction1(value))
    
    inline def setCmyk(value: HWB_ => CMYK_): Self = StObject.set(x, "cmyk", js.Any.fromFunction1(value))
    
    inline def setGray(value: HWB_ => GRAY_): Self = StObject.set(x, "gray", js.Any.fromFunction1(value))
    
    inline def setHcg(value: HWB_ => HCG_): Self = StObject.set(x, "hcg", js.Any.fromFunction1(value))
    
    inline def setHex(value: HWB_ => HEX_): Self = StObject.set(x, "hex", js.Any.fromFunction1(value))
    
    inline def setHsl(value: HWB_ => HSL_): Self = StObject.set(x, "hsl", js.Any.fromFunction1(value))
    
    inline def setHsv(value: HWB_ => HSV_): Self = StObject.set(x, "hsv", js.Any.fromFunction1(value))
    
    inline def setKeyword(value: HWB_ => KEYWORD_): Self = StObject.set(x, "keyword", js.Any.fromFunction1(value))
    
    inline def setLab(value: HWB_ => LAB_): Self = StObject.set(x, "lab", js.Any.fromFunction1(value))
    
    inline def setLch(value: HWB_ => LCH_): Self = StObject.set(x, "lch", js.Any.fromFunction1(value))
    
    inline def setRgb(value: HWB_ => RGB_): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
    
    inline def setXyz(value: HWB_ => XYZ_): Self = StObject.set(x, "xyz", js.Any.fromFunction1(value))
  }
}
