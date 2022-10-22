package typingsJapgolly.colorConvert

import typingsJapgolly.colorConvert.colorConvertInts.`1`
import typingsJapgolly.colorConvert.colorConvertInts.`3`
import typingsJapgolly.colorConvert.colorConvertInts.`4`
import typingsJapgolly.colorConvert.colorConvertStrings.b16
import typingsJapgolly.colorConvert.colorConvertStrings.c
import typingsJapgolly.colorConvert.colorConvertStrings.g
import typingsJapgolly.colorConvert.colorConvertStrings.g16
import typingsJapgolly.colorConvert.colorConvertStrings.h
import typingsJapgolly.colorConvert.colorConvertStrings.r16
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object conversionsMod {
  
  object ansi16 {
    
    @JSImport("color-convert/conversions", "ansi16")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("color-convert/conversions", "ansi16.channels")
    @js.native
    val channels: `1` = js.native
    
    @JSImport("color-convert/conversions", "ansi16.labels")
    @js.native
    val labels: js.Array[typingsJapgolly.colorConvert.colorConvertStrings.ansi16] = js.native
    
    inline def rgb(ansi16: ANSI16_): RGB_ = ^.asInstanceOf[js.Dynamic].applyDynamic("rgb")(ansi16.asInstanceOf[js.Any]).asInstanceOf[RGB_]
  }
  
  object ansi256 {
    
    @JSImport("color-convert/conversions", "ansi256")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("color-convert/conversions", "ansi256.channels")
    @js.native
    val channels: `1` = js.native
    
    @JSImport("color-convert/conversions", "ansi256.labels")
    @js.native
    val labels: js.Array[typingsJapgolly.colorConvert.colorConvertStrings.ansi256] = js.native
    
    inline def rgb(ansi256: ANSI256_): RGB_ = ^.asInstanceOf[js.Dynamic].applyDynamic("rgb")(ansi256.asInstanceOf[js.Any]).asInstanceOf[RGB_]
  }
  
  object apple {
    
    @JSImport("color-convert/conversions", "apple")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("color-convert/conversions", "apple.channels")
    @js.native
    val channels: `3` = js.native
    
    @JSImport("color-convert/conversions", "apple.labels")
    @js.native
    val labels: js.Tuple3[r16, g16, b16] = js.native
    
    inline def rgb(apple: APPLE_): RGB_ = ^.asInstanceOf[js.Dynamic].applyDynamic("rgb")(apple.asInstanceOf[js.Any]).asInstanceOf[RGB_]
  }
  
  object cmyk {
    
    @JSImport("color-convert/conversions", "cmyk")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("color-convert/conversions", "cmyk.channels")
    @js.native
    val channels: `4` = js.native
    
    @JSImport("color-convert/conversions", "cmyk.labels")
    @js.native
    val labels: typingsJapgolly.colorConvert.colorConvertStrings.cmyk = js.native
    
    inline def rgb(cmyk: CMYK_): RGB_ = ^.asInstanceOf[js.Dynamic].applyDynamic("rgb")(cmyk.asInstanceOf[js.Any]).asInstanceOf[RGB_]
  }
  
  object gray {
    
    @JSImport("color-convert/conversions", "gray")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("color-convert/conversions", "gray.channels")
    @js.native
    val channels: `1` = js.native
    
    inline def cmyk(gray: GRAY_): CMYK_ = ^.asInstanceOf[js.Dynamic].applyDynamic("cmyk")(gray.asInstanceOf[js.Any]).asInstanceOf[CMYK_]
    
    inline def hex(gray: GRAY_): HEX_ = ^.asInstanceOf[js.Dynamic].applyDynamic("hex")(gray.asInstanceOf[js.Any]).asInstanceOf[HEX_]
    
    inline def hsl(gray: GRAY_): HSL_ = ^.asInstanceOf[js.Dynamic].applyDynamic("hsl")(gray.asInstanceOf[js.Any]).asInstanceOf[HSL_]
    
    inline def hsv(gray: GRAY_): HSV_ = ^.asInstanceOf[js.Dynamic].applyDynamic("hsv")(gray.asInstanceOf[js.Any]).asInstanceOf[HSV_]
    
    inline def hwb(gray: GRAY_): HWB_ = ^.asInstanceOf[js.Dynamic].applyDynamic("hwb")(gray.asInstanceOf[js.Any]).asInstanceOf[HWB_]
    
    inline def lab(gray: GRAY_): LAB_ = ^.asInstanceOf[js.Dynamic].applyDynamic("lab")(gray.asInstanceOf[js.Any]).asInstanceOf[LAB_]
    
    @JSImport("color-convert/conversions", "gray.labels")
    @js.native
    val labels: js.Array[typingsJapgolly.colorConvert.colorConvertStrings.gray] = js.native
    
    inline def rgb(gray: GRAY_): RGB_ = ^.asInstanceOf[js.Dynamic].applyDynamic("rgb")(gray.asInstanceOf[js.Any]).asInstanceOf[RGB_]
  }
  
  object hcg {
    
    @JSImport("color-convert/conversions", "hcg")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("color-convert/conversions", "hcg.channels")
    @js.native
    val channels: `3` = js.native
    
    inline def hsl(hcg: HCG_): HSL_ = ^.asInstanceOf[js.Dynamic].applyDynamic("hsl")(hcg.asInstanceOf[js.Any]).asInstanceOf[HSL_]
    
    inline def hsv(hcg: HCG_): HSV_ = ^.asInstanceOf[js.Dynamic].applyDynamic("hsv")(hcg.asInstanceOf[js.Any]).asInstanceOf[HSV_]
    
    inline def hwb(hcg: HCG_): HWB_ = ^.asInstanceOf[js.Dynamic].applyDynamic("hwb")(hcg.asInstanceOf[js.Any]).asInstanceOf[HWB_]
    
    @JSImport("color-convert/conversions", "hcg.labels")
    @js.native
    val labels: js.Tuple3[h, c, g] = js.native
    
    inline def rgb(hcg: HCG_): RGB_ = ^.asInstanceOf[js.Dynamic].applyDynamic("rgb")(hcg.asInstanceOf[js.Any]).asInstanceOf[RGB_]
  }
  
  object hex {
    
    @JSImport("color-convert/conversions", "hex")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("color-convert/conversions", "hex.channels")
    @js.native
    val channels: `1` = js.native
    
    @JSImport("color-convert/conversions", "hex.labels")
    @js.native
    val labels: js.Array[typingsJapgolly.colorConvert.colorConvertStrings.hex] = js.native
    
    inline def rgb(hex: HEX_): RGB_ = ^.asInstanceOf[js.Dynamic].applyDynamic("rgb")(hex.asInstanceOf[js.Any]).asInstanceOf[RGB_]
  }
  
  object hsl {
    
    @JSImport("color-convert/conversions", "hsl")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("color-convert/conversions", "hsl.channels")
    @js.native
    val channels: `3` = js.native
    
    inline def hcg(hsl: HSL_): HCG_ = ^.asInstanceOf[js.Dynamic].applyDynamic("hcg")(hsl.asInstanceOf[js.Any]).asInstanceOf[HCG_]
    
    inline def hsv(hsl: HSL_): HSV_ = ^.asInstanceOf[js.Dynamic].applyDynamic("hsv")(hsl.asInstanceOf[js.Any]).asInstanceOf[HSV_]
    
    @JSImport("color-convert/conversions", "hsl.labels")
    @js.native
    val labels: typingsJapgolly.colorConvert.colorConvertStrings.hsl = js.native
    
    inline def rgb(hsl: HSL_): RGB_ = ^.asInstanceOf[js.Dynamic].applyDynamic("rgb")(hsl.asInstanceOf[js.Any]).asInstanceOf[RGB_]
  }
  
  object hsv {
    
    @JSImport("color-convert/conversions", "hsv")
    @js.native
    val ^ : js.Any = js.native
    
    inline def ansi16(hsv: HSV_): ANSI16_ = ^.asInstanceOf[js.Dynamic].applyDynamic("ansi16")(hsv.asInstanceOf[js.Any]).asInstanceOf[ANSI16_]
    
    @JSImport("color-convert/conversions", "hsv.channels")
    @js.native
    val channels: `3` = js.native
    
    inline def hcg(hsv: HSV_): HCG_ = ^.asInstanceOf[js.Dynamic].applyDynamic("hcg")(hsv.asInstanceOf[js.Any]).asInstanceOf[HCG_]
    
    inline def hsl(hsv: HSV_): HSL_ = ^.asInstanceOf[js.Dynamic].applyDynamic("hsl")(hsv.asInstanceOf[js.Any]).asInstanceOf[HSL_]
    
    @JSImport("color-convert/conversions", "hsv.labels")
    @js.native
    val labels: typingsJapgolly.colorConvert.colorConvertStrings.hsv = js.native
    
    inline def rgb(hsv: HSV_): RGB_ = ^.asInstanceOf[js.Dynamic].applyDynamic("rgb")(hsv.asInstanceOf[js.Any]).asInstanceOf[RGB_]
  }
  
  object hwb {
    
    @JSImport("color-convert/conversions", "hwb")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("color-convert/conversions", "hwb.channels")
    @js.native
    val channels: `3` = js.native
    
    inline def hcg(hwb: HWB_): HCG_ = ^.asInstanceOf[js.Dynamic].applyDynamic("hcg")(hwb.asInstanceOf[js.Any]).asInstanceOf[HCG_]
    
    @JSImport("color-convert/conversions", "hwb.labels")
    @js.native
    val labels: typingsJapgolly.colorConvert.colorConvertStrings.hwb = js.native
    
    inline def rgb(hwb: HWB_): RGB_ = ^.asInstanceOf[js.Dynamic].applyDynamic("rgb")(hwb.asInstanceOf[js.Any]).asInstanceOf[RGB_]
  }
  
  object keyword {
    
    @JSImport("color-convert/conversions", "keyword")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("color-convert/conversions", "keyword.channels")
    @js.native
    val channels: `1` = js.native
    
    @JSImport("color-convert/conversions", "keyword.labels")
    @js.native
    val labels: js.Array[typingsJapgolly.colorConvert.colorConvertStrings.keyword] = js.native
    
    inline def rgb(keyword: KEYWORD_): RGB_ = ^.asInstanceOf[js.Dynamic].applyDynamic("rgb")(keyword.asInstanceOf[js.Any]).asInstanceOf[RGB_]
  }
  
  object lab {
    
    @JSImport("color-convert/conversions", "lab")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("color-convert/conversions", "lab.channels")
    @js.native
    val channels: `3` = js.native
    
    @JSImport("color-convert/conversions", "lab.labels")
    @js.native
    val labels: typingsJapgolly.colorConvert.colorConvertStrings.lab = js.native
    
    inline def lch(lab: LAB_): LCH_ = ^.asInstanceOf[js.Dynamic].applyDynamic("lch")(lab.asInstanceOf[js.Any]).asInstanceOf[LCH_]
    
    inline def xyz(lab: LAB_): XYZ_ = ^.asInstanceOf[js.Dynamic].applyDynamic("xyz")(lab.asInstanceOf[js.Any]).asInstanceOf[XYZ_]
  }
  
  object lch {
    
    @JSImport("color-convert/conversions", "lch")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("color-convert/conversions", "lch.channels")
    @js.native
    val channels: `3` = js.native
    
    inline def lab(lch: LCH_): LAB_ = ^.asInstanceOf[js.Dynamic].applyDynamic("lab")(lch.asInstanceOf[js.Any]).asInstanceOf[LAB_]
    
    @JSImport("color-convert/conversions", "lch.labels")
    @js.native
    val labels: typingsJapgolly.colorConvert.colorConvertStrings.lch = js.native
  }
  
  object rgb {
    
    @JSImport("color-convert/conversions", "rgb")
    @js.native
    val ^ : js.Any = js.native
    
    inline def ansi16(rgb: RGB_): ANSI16_ = ^.asInstanceOf[js.Dynamic].applyDynamic("ansi16")(rgb.asInstanceOf[js.Any]).asInstanceOf[ANSI16_]
    
    inline def ansi256(rgb: RGB_): ANSI256_ = ^.asInstanceOf[js.Dynamic].applyDynamic("ansi256")(rgb.asInstanceOf[js.Any]).asInstanceOf[ANSI256_]
    
    inline def apple(rgb: RGB_): APPLE_ = ^.asInstanceOf[js.Dynamic].applyDynamic("apple")(rgb.asInstanceOf[js.Any]).asInstanceOf[APPLE_]
    
    @JSImport("color-convert/conversions", "rgb.channels")
    @js.native
    val channels: `3` = js.native
    
    inline def cmyk(rgb: RGB_): CMYK_ = ^.asInstanceOf[js.Dynamic].applyDynamic("cmyk")(rgb.asInstanceOf[js.Any]).asInstanceOf[CMYK_]
    
    inline def gray(rgb: RGB_): GRAY_ = ^.asInstanceOf[js.Dynamic].applyDynamic("gray")(rgb.asInstanceOf[js.Any]).asInstanceOf[GRAY_]
    
    inline def hcg(rgb: RGB_): HCG_ = ^.asInstanceOf[js.Dynamic].applyDynamic("hcg")(rgb.asInstanceOf[js.Any]).asInstanceOf[HCG_]
    
    inline def hex(rgb: RGB_): HEX_ = ^.asInstanceOf[js.Dynamic].applyDynamic("hex")(rgb.asInstanceOf[js.Any]).asInstanceOf[HEX_]
    
    inline def hsl(rgb: RGB_): HSL_ = ^.asInstanceOf[js.Dynamic].applyDynamic("hsl")(rgb.asInstanceOf[js.Any]).asInstanceOf[HSL_]
    
    inline def hsv(rgb: RGB_): HSV_ = ^.asInstanceOf[js.Dynamic].applyDynamic("hsv")(rgb.asInstanceOf[js.Any]).asInstanceOf[HSV_]
    
    inline def hwb(rgb: RGB_): HWB_ = ^.asInstanceOf[js.Dynamic].applyDynamic("hwb")(rgb.asInstanceOf[js.Any]).asInstanceOf[HWB_]
    
    inline def keyword(rgb: RGB_): KEYWORD_ = ^.asInstanceOf[js.Dynamic].applyDynamic("keyword")(rgb.asInstanceOf[js.Any]).asInstanceOf[KEYWORD_]
    
    inline def lab(rgb: RGB_): LAB_ = ^.asInstanceOf[js.Dynamic].applyDynamic("lab")(rgb.asInstanceOf[js.Any]).asInstanceOf[LAB_]
    
    @JSImport("color-convert/conversions", "rgb.labels")
    @js.native
    val labels: typingsJapgolly.colorConvert.colorConvertStrings.rgb = js.native
    
    inline def xyz(rgb: RGB_): XYZ_ = ^.asInstanceOf[js.Dynamic].applyDynamic("xyz")(rgb.asInstanceOf[js.Any]).asInstanceOf[XYZ_]
  }
  
  object xyz {
    
    @JSImport("color-convert/conversions", "xyz")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("color-convert/conversions", "xyz.channels")
    @js.native
    val channels: `3` = js.native
    
    inline def lab(xyz: XYZ_): LAB_ = ^.asInstanceOf[js.Dynamic].applyDynamic("lab")(xyz.asInstanceOf[js.Any]).asInstanceOf[LAB_]
    
    @JSImport("color-convert/conversions", "xyz.labels")
    @js.native
    val labels: typingsJapgolly.colorConvert.colorConvertStrings.xyz = js.native
    
    inline def rgb(xyz: XYZ_): RGB_ = ^.asInstanceOf[js.Dynamic].applyDynamic("rgb")(xyz.asInstanceOf[js.Any]).asInstanceOf[RGB_]
  }
  
  type ANSI16_ = Double
  
  type ANSI256_ = Double
  
  type APPLE_ = js.Tuple3[Double, Double, Double]
  
  type CMYK_ = js.Tuple4[Double, Double, Double, Double]
  
  type GRAY_ = js.Array[Double]
  
  type HCG_ = js.Tuple3[Double, Double, Double]
  
  type HEX_ = String
  
  type HSL_ = js.Tuple3[Double, Double, Double]
  
  type HSV_ = js.Tuple3[Double, Double, Double]
  
  type HWB_ = js.Tuple3[Double, Double, Double]
  
  /* keyof color-convert.anon.Typeofcolors */ /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.colorConvert.colorConvertStrings.black
    - typingsJapgolly.colorConvert.colorConvertStrings.magenta
    - typingsJapgolly.colorConvert.colorConvertStrings.skyblue
    - typingsJapgolly.colorConvert.colorConvertStrings.darkseagreen
    - typingsJapgolly.colorConvert.colorConvertStrings.midnightblue
    - typingsJapgolly.colorConvert.colorConvertStrings.rosybrown
    - typingsJapgolly.colorConvert.colorConvertStrings.honeydew
    - typingsJapgolly.colorConvert.colorConvertStrings.cadetblue
    - typingsJapgolly.colorConvert.colorConvertStrings.darkgrey
    - typingsJapgolly.colorConvert.colorConvertStrings.lavenderblush
    - typingsJapgolly.colorConvert.colorConvertStrings.lightblue
    - typingsJapgolly.colorConvert.colorConvertStrings.moccasin
    - typingsJapgolly.colorConvert.colorConvertStrings.salmon
    - typingsJapgolly.colorConvert.colorConvertStrings.indianred
    - typingsJapgolly.colorConvert.colorConvertStrings.red
    - typingsJapgolly.colorConvert.colorConvertStrings.purple
    - typingsJapgolly.colorConvert.colorConvertStrings.chocolate
    - typingsJapgolly.colorConvert.colorConvertStrings.darkslategray
    - typingsJapgolly.colorConvert.colorConvertStrings.lightcyan
    - typingsJapgolly.colorConvert.colorConvertStrings.limegreen
    - typingsJapgolly.colorConvert.colorConvertStrings.lightslategray
    - typingsJapgolly.colorConvert.colorConvertStrings.sandybrown
    - typingsJapgolly.colorConvert.colorConvertStrings.mediumblue
    - typingsJapgolly.colorConvert.colorConvertStrings.darkorange
    - typingsJapgolly.colorConvert.colorConvertStrings.darkgray
    - typingsJapgolly.colorConvert.colorConvertStrings.darkslategrey
    - typingsJapgolly.colorConvert.colorConvertStrings.lightgrey
    - typingsJapgolly.colorConvert.colorConvertStrings.ivory
    - typingsJapgolly.colorConvert.colorConvertStrings.green
    - typingsJapgolly.colorConvert.colorConvertStrings.lavender
    - typingsJapgolly.colorConvert.colorConvertStrings.lightpink
    - typingsJapgolly.colorConvert.colorConvertStrings.darkmagenta
    - typingsJapgolly.colorConvert.colorConvertStrings.mediumspringgreen
    - typingsJapgolly.colorConvert.colorConvertStrings.darkorchid
    - typingsJapgolly.colorConvert.colorConvertStrings.aqua
    - typingsJapgolly.colorConvert.colorConvertStrings.lightyellow
    - typingsJapgolly.colorConvert.colorConvertStrings.hotpink
    - typingsJapgolly.colorConvert.colorConvertStrings.khaki
    - typingsJapgolly.colorConvert.colorConvertStrings.beige
    - typingsJapgolly.colorConvert.colorConvertStrings.darkred
    - typingsJapgolly.colorConvert.colorConvertStrings.darkslateblue
    - typingsJapgolly.colorConvert.colorConvertStrings.sienna
    - typingsJapgolly.colorConvert.colorConvertStrings.lightsalmon
    - typingsJapgolly.colorConvert.colorConvertStrings.mediumseagreen
    - typingsJapgolly.colorConvert.colorConvertStrings.blue
    - typingsJapgolly.colorConvert.colorConvertStrings.lightsteelblue
    - typingsJapgolly.colorConvert.colorConvertStrings.lightgoldenrodyellow
    - typingsJapgolly.colorConvert.colorConvertStrings.mediumpurple
    - typingsJapgolly.colorConvert.colorConvertStrings.maroon
    - typingsJapgolly.colorConvert.colorConvertStrings.slategrey
    - typingsJapgolly.colorConvert.colorConvertStrings.darkgoldenrod
    - typingsJapgolly.colorConvert.colorConvertStrings.violet
    - typingsJapgolly.colorConvert.colorConvertStrings.darkolivegreen
    - typingsJapgolly.colorConvert.colorConvertStrings.springgreen
    - typingsJapgolly.colorConvert.colorConvertStrings.oldlace
    - typingsJapgolly.colorConvert.colorConvertStrings.forestgreen
    - typingsJapgolly.colorConvert.colorConvertStrings.goldenrod
    - typingsJapgolly.colorConvert.colorConvertStrings.coral
    - typingsJapgolly.colorConvert.colorConvertStrings.aquamarine
    - typingsJapgolly.colorConvert.colorConvertStrings.mintcream
    - typingsJapgolly.colorConvert.colorConvertStrings.snow
    - typingsJapgolly.colorConvert.colorConvertStrings.lightseagreen
    - typingsJapgolly.colorConvert.colorConvertStrings.seashell
    - typingsJapgolly.colorConvert.colorConvertStrings.palevioletred
    - typingsJapgolly.colorConvert.colorConvertStrings.darkcyan
    - typingsJapgolly.colorConvert.colorConvertStrings.aliceblue
    - typingsJapgolly.colorConvert.colorConvertStrings.linen
    - typingsJapgolly.colorConvert.colorConvertStrings.wheat
    - typingsJapgolly.colorConvert.colorConvertStrings.mediumturquoise
    - typingsJapgolly.colorConvert.colorConvertStrings.crimson
    - typingsJapgolly.colorConvert.colorConvertStrings.dodgerblue
    - typingsJapgolly.colorConvert.colorConvertStrings.yellowgreen
    - typingsJapgolly.colorConvert.colorConvertStrings.firebrick
    - typingsJapgolly.colorConvert.colorConvertStrings.burlywood
    - typingsJapgolly.colorConvert.colorConvertStrings.darkviolet
    - typingsJapgolly.colorConvert.colorConvertStrings.gray
    - typingsJapgolly.colorConvert.colorConvertStrings.mediumorchid
    - typingsJapgolly.colorConvert.colorConvertStrings.navy
    - typingsJapgolly.colorConvert.colorConvertStrings.azure
    - typingsJapgolly.colorConvert.colorConvertStrings.mediumslateblue
    - typingsJapgolly.colorConvert.colorConvertStrings.fuchsia
    - typingsJapgolly.colorConvert.colorConvertStrings.papayawhip
    - typingsJapgolly.colorConvert.colorConvertStrings.lemonchiffon
    - typingsJapgolly.colorConvert.colorConvertStrings.orangered
    - typingsJapgolly.colorConvert.colorConvertStrings.lightskyblue
    - typingsJapgolly.colorConvert.colorConvertStrings.mistyrose
    - typingsJapgolly.colorConvert.colorConvertStrings.lightgreen
    - typingsJapgolly.colorConvert.colorConvertStrings.royalblue
    - typingsJapgolly.colorConvert.colorConvertStrings.antiquewhite
    - typingsJapgolly.colorConvert.colorConvertStrings.grey
    - typingsJapgolly.colorConvert.colorConvertStrings.tan
    - typingsJapgolly.colorConvert.colorConvertStrings.brown
    - typingsJapgolly.colorConvert.colorConvertStrings.chartreuse
    - typingsJapgolly.colorConvert.colorConvertStrings.gainsboro
    - typingsJapgolly.colorConvert.colorConvertStrings.pink
    - typingsJapgolly.colorConvert.colorConvertStrings.lightcoral
    - typingsJapgolly.colorConvert.colorConvertStrings.lightgray
    - typingsJapgolly.colorConvert.colorConvertStrings.darkgreen
    - typingsJapgolly.colorConvert.colorConvertStrings.lawngreen
    - typingsJapgolly.colorConvert.colorConvertStrings.blueviolet
    - typingsJapgolly.colorConvert.colorConvertStrings.steelblue
    - typingsJapgolly.colorConvert.colorConvertStrings.slategray
    - typingsJapgolly.colorConvert.colorConvertStrings.ghostwhite
    - typingsJapgolly.colorConvert.colorConvertStrings.greenyellow
    - typingsJapgolly.colorConvert.colorConvertStrings.palegoldenrod
    - typingsJapgolly.colorConvert.colorConvertStrings.darkturquoise
    - typingsJapgolly.colorConvert.colorConvertStrings.deeppink
    - typingsJapgolly.colorConvert.colorConvertStrings.whitesmoke
    - typingsJapgolly.colorConvert.colorConvertStrings.thistle
    - typingsJapgolly.colorConvert.colorConvertStrings.paleturquoise
    - typingsJapgolly.colorConvert.colorConvertStrings.white
    - typingsJapgolly.colorConvert.colorConvertStrings.plum
    - typingsJapgolly.colorConvert.colorConvertStrings.blanchedalmond
    - typingsJapgolly.colorConvert.colorConvertStrings.orange
    - typingsJapgolly.colorConvert.colorConvertStrings.deepskyblue
    - typingsJapgolly.colorConvert.colorConvertStrings.darkkhaki
    - typingsJapgolly.colorConvert.colorConvertStrings.mediumvioletred
    - typingsJapgolly.colorConvert.colorConvertStrings.silver
    - typingsJapgolly.colorConvert.colorConvertStrings.peru
    - typingsJapgolly.colorConvert.colorConvertStrings.slateblue
    - typingsJapgolly.colorConvert.colorConvertStrings.cornflowerblue
    - typingsJapgolly.colorConvert.colorConvertStrings.floralwhite
    - typingsJapgolly.colorConvert.colorConvertStrings.darksalmon
    - typingsJapgolly.colorConvert.colorConvertStrings.mediumaquamarine
    - typingsJapgolly.colorConvert.colorConvertStrings.turquoise
    - typingsJapgolly.colorConvert.colorConvertStrings.seagreen
    - typingsJapgolly.colorConvert.colorConvertStrings.palegreen
    - typingsJapgolly.colorConvert.colorConvertStrings.saddlebrown
    - typingsJapgolly.colorConvert.colorConvertStrings.cyan
    - typingsJapgolly.colorConvert.colorConvertStrings.peachpuff
    - typingsJapgolly.colorConvert.colorConvertStrings.darkblue
    - typingsJapgolly.colorConvert.colorConvertStrings.olivedrab
    - typingsJapgolly.colorConvert.colorConvertStrings.powderblue
    - typingsJapgolly.colorConvert.colorConvertStrings.orchid
    - typingsJapgolly.colorConvert.colorConvertStrings.bisque
    - typingsJapgolly.colorConvert.colorConvertStrings.dimgray
    - typingsJapgolly.colorConvert.colorConvertStrings.navajowhite
    - typingsJapgolly.colorConvert.colorConvertStrings.teal
    - typingsJapgolly.colorConvert.colorConvertStrings.rebeccapurple
    - typingsJapgolly.colorConvert.colorConvertStrings.indigo
    - typingsJapgolly.colorConvert.colorConvertStrings.lime
    - typingsJapgolly.colorConvert.colorConvertStrings.gold
    - typingsJapgolly.colorConvert.colorConvertStrings.dimgrey
    - typingsJapgolly.colorConvert.colorConvertStrings.cornsilk
    - typingsJapgolly.colorConvert.colorConvertStrings.tomato
    - typingsJapgolly.colorConvert.colorConvertStrings.olive
    - typingsJapgolly.colorConvert.colorConvertStrings.lightslategrey
    - typingsJapgolly.colorConvert.colorConvertStrings.yellow
  */
  trait KEYWORD_ extends StObject
  
  type LAB_ = js.Tuple3[Double, Double, Double]
  
  type LCH_ = js.Tuple3[Double, Double, Double]
  
  type RGB_ = js.Tuple3[Double, Double, Double]
  
  type XYZ_ = js.Tuple3[Double, Double, Double]
}
