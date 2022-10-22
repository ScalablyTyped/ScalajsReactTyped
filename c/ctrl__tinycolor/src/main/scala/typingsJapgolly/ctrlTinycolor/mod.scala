package typingsJapgolly.ctrlTinycolor

import typingsJapgolly.ctrlTinycolor.anon.A
import typingsJapgolly.ctrlTinycolor.anon.NumberifyHSL
import typingsJapgolly.ctrlTinycolor.anon.NumberifyHSV
import typingsJapgolly.ctrlTinycolor.anon.NumberifyRGB
import typingsJapgolly.ctrlTinycolor.anon.PartialTinyColorOptions
import typingsJapgolly.ctrlTinycolor.distFromRatioMod.RatioInput
import typingsJapgolly.ctrlTinycolor.distInterfacesMod.HSL
import typingsJapgolly.ctrlTinycolor.distInterfacesMod.HSLA
import typingsJapgolly.ctrlTinycolor.distInterfacesMod.HSV
import typingsJapgolly.ctrlTinycolor.distInterfacesMod.HSVA
import typingsJapgolly.ctrlTinycolor.distInterfacesMod.RGB
import typingsJapgolly.ctrlTinycolor.distInterfacesMod.RGBA
import typingsJapgolly.ctrlTinycolor.distMod.ColorInput
import typingsJapgolly.ctrlTinycolor.distRandomMod.ColorBound
import typingsJapgolly.ctrlTinycolor.distRandomMod.RandomCountOptions
import typingsJapgolly.ctrlTinycolor.distRandomMod.RandomOptions
import typingsJapgolly.ctrlTinycolor.distReadabilityMod.WCAG2FallbackParms
import typingsJapgolly.ctrlTinycolor.distReadabilityMod.WCAG2Parms
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ctrl/tinycolor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): typingsJapgolly.ctrlTinycolor.distMod.TinyColor_ = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[typingsJapgolly.ctrlTinycolor.distMod.TinyColor_]
  inline def default(color: Unit, opts: PartialTinyColorOptions): typingsJapgolly.ctrlTinycolor.distMod.TinyColor_ = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(color.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ctrlTinycolor.distMod.TinyColor_]
  inline def default(color: ColorInput): typingsJapgolly.ctrlTinycolor.distMod.TinyColor_ = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(color.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ctrlTinycolor.distMod.TinyColor_]
  inline def default(color: ColorInput, opts: PartialTinyColorOptions): typingsJapgolly.ctrlTinycolor.distMod.TinyColor_ = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(color.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ctrlTinycolor.distMod.TinyColor_]
  
  @JSImport("@ctrl/tinycolor", "TinyColor")
  @js.native
  open class TinyColor_ ()
    extends typingsJapgolly.ctrlTinycolor.distMod.TinyColor_ {
    def this(color: ColorInput) = this()
    def this(color: Unit, opts: PartialTinyColorOptions) = this()
    def this(color: ColorInput, opts: PartialTinyColorOptions) = this()
  }
  
  @JSImport("@ctrl/tinycolor", "bounds")
  @js.native
  val bounds: js.Array[ColorBound] = js.native
  
  inline def convertDecimalToHex(d: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertDecimalToHex")(d.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def convertDecimalToHex(d: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertDecimalToHex")(d.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def convertHexToDecimal(h: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("convertHexToDecimal")(h.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def fromRatio(ratio: RatioInput): typingsJapgolly.ctrlTinycolor.distMod.TinyColor_ = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRatio")(ratio.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ctrlTinycolor.distMod.TinyColor_]
  inline def fromRatio(ratio: RatioInput, opts: Any): typingsJapgolly.ctrlTinycolor.distMod.TinyColor_ = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRatio")(ratio.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ctrlTinycolor.distMod.TinyColor_]
  
  inline def hslToRgb(h: String, s: String, l: String): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("hslToRgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  inline def hslToRgb(h: String, s: String, l: Double): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("hslToRgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  inline def hslToRgb(h: String, s: Double, l: String): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("hslToRgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  inline def hslToRgb(h: String, s: Double, l: Double): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("hslToRgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  inline def hslToRgb(h: Double, s: String, l: String): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("hslToRgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  inline def hslToRgb(h: Double, s: String, l: Double): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("hslToRgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  inline def hslToRgb(h: Double, s: Double, l: String): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("hslToRgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  inline def hslToRgb(h: Double, s: Double, l: Double): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("hslToRgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  
  inline def hsvToRgb(h: String, s: String, v: String): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("hsvToRgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  inline def hsvToRgb(h: String, s: String, v: Double): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("hsvToRgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  inline def hsvToRgb(h: String, s: Double, v: String): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("hsvToRgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  inline def hsvToRgb(h: String, s: Double, v: Double): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("hsvToRgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  inline def hsvToRgb(h: Double, s: String, v: String): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("hsvToRgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  inline def hsvToRgb(h: Double, s: String, v: Double): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("hsvToRgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  inline def hsvToRgb(h: Double, s: Double, v: String): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("hsvToRgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  inline def hsvToRgb(h: Double, s: Double, v: Double): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("hsvToRgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  
  inline def inputToRGB(color: String): A = ^.asInstanceOf[js.Dynamic].applyDynamic("inputToRGB")(color.asInstanceOf[js.Any]).asInstanceOf[A]
  inline def inputToRGB(color: Any): A = ^.asInstanceOf[js.Dynamic].applyDynamic("inputToRGB")(color.asInstanceOf[js.Any]).asInstanceOf[A]
  inline def inputToRGB(color: HSL): A = ^.asInstanceOf[js.Dynamic].applyDynamic("inputToRGB")(color.asInstanceOf[js.Any]).asInstanceOf[A]
  inline def inputToRGB(color: HSLA): A = ^.asInstanceOf[js.Dynamic].applyDynamic("inputToRGB")(color.asInstanceOf[js.Any]).asInstanceOf[A]
  inline def inputToRGB(color: HSV): A = ^.asInstanceOf[js.Dynamic].applyDynamic("inputToRGB")(color.asInstanceOf[js.Any]).asInstanceOf[A]
  inline def inputToRGB(color: HSVA): A = ^.asInstanceOf[js.Dynamic].applyDynamic("inputToRGB")(color.asInstanceOf[js.Any]).asInstanceOf[A]
  inline def inputToRGB(color: RGB): A = ^.asInstanceOf[js.Dynamic].applyDynamic("inputToRGB")(color.asInstanceOf[js.Any]).asInstanceOf[A]
  inline def inputToRGB(color: RGBA): A = ^.asInstanceOf[js.Dynamic].applyDynamic("inputToRGB")(color.asInstanceOf[js.Any]).asInstanceOf[A]
  
  inline def isReadable(color1: ColorInput, color2: ColorInput): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isReadable")(color1.asInstanceOf[js.Any], color2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isReadable(color1: ColorInput, color2: ColorInput, wcag2: WCAG2Parms): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isReadable")(color1.asInstanceOf[js.Any], color2.asInstanceOf[js.Any], wcag2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isValidCSSUnit(color: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidCSSUnit")(color.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isValidCSSUnit(color: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidCSSUnit")(color.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def legacyRandom(): typingsJapgolly.ctrlTinycolor.distMod.TinyColor_ = ^.asInstanceOf[js.Dynamic].applyDynamic("legacyRandom")().asInstanceOf[typingsJapgolly.ctrlTinycolor.distMod.TinyColor_]
  
  inline def mostReadable(baseColor: ColorInput, colorList: js.Array[ColorInput]): typingsJapgolly.ctrlTinycolor.distMod.TinyColor_ | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("mostReadable")(baseColor.asInstanceOf[js.Any], colorList.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ctrlTinycolor.distMod.TinyColor_ | Null]
  inline def mostReadable(baseColor: ColorInput, colorList: js.Array[ColorInput], args: WCAG2FallbackParms): typingsJapgolly.ctrlTinycolor.distMod.TinyColor_ | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("mostReadable")(baseColor.asInstanceOf[js.Any], colorList.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ctrlTinycolor.distMod.TinyColor_ | Null]
  
  @JSImport("@ctrl/tinycolor", "names")
  @js.native
  val names: Record[String, String] = js.native
  
  inline def numberInputToObject(color: Double): RGB = ^.asInstanceOf[js.Dynamic].applyDynamic("numberInputToObject")(color.asInstanceOf[js.Any]).asInstanceOf[RGB]
  
  inline def parseIntFromHex(`val`: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("parseIntFromHex")(`val`.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def random(): typingsJapgolly.ctrlTinycolor.distMod.TinyColor_ = ^.asInstanceOf[js.Dynamic].applyDynamic("random")().asInstanceOf[typingsJapgolly.ctrlTinycolor.distMod.TinyColor_]
  inline def random(options: RandomCountOptions): js.Array[typingsJapgolly.ctrlTinycolor.distMod.TinyColor_] = ^.asInstanceOf[js.Dynamic].applyDynamic("random")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[typingsJapgolly.ctrlTinycolor.distMod.TinyColor_]]
  inline def random(options: RandomOptions): typingsJapgolly.ctrlTinycolor.distMod.TinyColor_ = ^.asInstanceOf[js.Dynamic].applyDynamic("random")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ctrlTinycolor.distMod.TinyColor_]
  
  inline def random_Array(): js.Array[typingsJapgolly.ctrlTinycolor.distMod.TinyColor_] = ^.asInstanceOf[js.Dynamic].applyDynamic("random")().asInstanceOf[js.Array[typingsJapgolly.ctrlTinycolor.distMod.TinyColor_]]
  
  inline def readability(color1: ColorInput, color2: ColorInput): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readability")(color1.asInstanceOf[js.Any], color2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def rgbToHex(r: Double, g: Double, b: Double, allow3Char: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("rgbToHex")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any], allow3Char.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def rgbToHsl(r: Double, g: Double, b: Double): NumberifyHSL = (^.asInstanceOf[js.Dynamic].applyDynamic("rgbToHsl")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[NumberifyHSL]
  
  inline def rgbToHsv(r: Double, g: Double, b: Double): NumberifyHSV = (^.asInstanceOf[js.Dynamic].applyDynamic("rgbToHsv")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[NumberifyHSV]
  
  inline def rgbToRgb(r: String, g: String, b: String): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("rgbToRgb")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  inline def rgbToRgb(r: String, g: String, b: Double): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("rgbToRgb")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  inline def rgbToRgb(r: String, g: Double, b: String): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("rgbToRgb")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  inline def rgbToRgb(r: String, g: Double, b: Double): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("rgbToRgb")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  inline def rgbToRgb(r: Double, g: String, b: String): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("rgbToRgb")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  inline def rgbToRgb(r: Double, g: String, b: Double): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("rgbToRgb")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  inline def rgbToRgb(r: Double, g: Double, b: String): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("rgbToRgb")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  inline def rgbToRgb(r: Double, g: Double, b: Double): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("rgbToRgb")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  
  inline def rgbaToArgbHex(r: Double, g: Double, b: Double, a: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("rgbaToArgbHex")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def rgbaToHex(r: Double, g: Double, b: Double, a: Double, allow4Char: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("rgbaToHex")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any], a.asInstanceOf[js.Any], allow4Char.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def stringInputToObject(color: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("stringInputToObject")(color.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def tinycolor(): typingsJapgolly.ctrlTinycolor.distMod.TinyColor_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tinycolor")().asInstanceOf[typingsJapgolly.ctrlTinycolor.distMod.TinyColor_]
  inline def tinycolor(color: Unit, opts: PartialTinyColorOptions): typingsJapgolly.ctrlTinycolor.distMod.TinyColor_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tinycolor")(color.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ctrlTinycolor.distMod.TinyColor_]
  inline def tinycolor(color: ColorInput): typingsJapgolly.ctrlTinycolor.distMod.TinyColor_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tinycolor")(color.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ctrlTinycolor.distMod.TinyColor_]
  inline def tinycolor(color: ColorInput, opts: PartialTinyColorOptions): typingsJapgolly.ctrlTinycolor.distMod.TinyColor_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tinycolor")(color.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ctrlTinycolor.distMod.TinyColor_]
  
  inline def toMsFilter(firstColor: ColorInput): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toMsFilter")(firstColor.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toMsFilter(firstColor: ColorInput, secondColor: ColorInput): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toMsFilter")(firstColor.asInstanceOf[js.Any], secondColor.asInstanceOf[js.Any])).asInstanceOf[String]
}
