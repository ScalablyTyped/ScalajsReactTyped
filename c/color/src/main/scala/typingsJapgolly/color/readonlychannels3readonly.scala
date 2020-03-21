package typingsJapgolly.color

import typingsJapgolly.color.colorNumbers.`3`
import typingsJapgolly.color.colorStrings.rgb
import typingsJapgolly.colorConvert.Anon0
import typingsJapgolly.colorConvert.Anon1
import typingsJapgolly.colorConvert.Anon10
import typingsJapgolly.colorConvert.Anon11
import typingsJapgolly.colorConvert.Anon12
import typingsJapgolly.colorConvert.Anon2
import typingsJapgolly.colorConvert.Anon3
import typingsJapgolly.colorConvert.Anon4
import typingsJapgolly.colorConvert.Anon5
import typingsJapgolly.colorConvert.Anon6
import typingsJapgolly.colorConvert.Anon7
import typingsJapgolly.colorConvert.Anon8
import typingsJapgolly.colorConvert.Anon9
import typingsJapgolly.colorConvert.AnonRaw
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined { readonly channels  :3,  readonly labels  :'rgb', readonly hsl (rgb : color-convert.color-convert/conversions.RGB): color-convert.color-convert/conversions.HSL, readonly hsv (rgb : color-convert.color-convert/conversions.RGB): color-convert.color-convert/conversions.HSV, readonly hwb (rgb : color-convert.color-convert/conversions.RGB): color-convert.color-convert/conversions.HWB, readonly cmyk (rgb : color-convert.color-convert/conversions.RGB): color-convert.color-convert/conversions.CMYK, readonly keyword (rgb : color-convert.color-convert/conversions.RGB): color-convert.color-convert/conversions.KEYWORD, readonly xyz (rgb : color-convert.color-convert/conversions.RGB): color-convert.color-convert/conversions.XYZ, readonly lab (rgb : color-convert.color-convert/conversions.RGB): color-convert.color-convert/conversions.LAB, readonly ansi16 (rgb : color-convert.color-convert/conversions.RGB): color-convert.color-convert/conversions.ANSI16, readonly ansi256 (rgb : color-convert.color-convert/conversions.RGB): color-convert.color-convert/conversions.ANSI256, readonly hex (rgb : color-convert.color-convert/conversions.RGB): color-convert.color-convert/conversions.HEX, readonly hcg (rgb : color-convert.color-convert/conversions.RGB): color-convert.color-convert/conversions.HCG, readonly apple (rgb : color-convert.color-convert/conversions.RGB): color-convert.color-convert/conversions.APPLE, readonly gray (rgb : color-convert.color-convert/conversions.RGB): color-convert.color-convert/conversions.GRAY} & color-convert.color-convert/route.rgb & {[ F in keyof color-convert.color-convert/route.rgb ]: {  raw  :color-convert.color-convert/route.rgb[F]}} */
@js.native
trait readonlychannels3readonly extends js.Object {
  var ansi16: Anon2 = js.native
  var ansi256: Anon1 = js.native
  var apple: Anon10 = js.native
  val channels: `3` = js.native
  var cmyk: Anon5 = js.native
  var gray: Anon8 = js.native
  var hcg: Anon0 = js.native
  var hex: Anon3 = js.native
  var hsl: Anon6 = js.native
  var hsv: Anon9 = js.native
  var hwb: Anon11 = js.native
  var keyword: Anon7 = js.native
  var lab: Anon12 = js.native
  val labels: rgb = js.native
  var lch: Anon4 = js.native
  var xyz: AnonRaw = js.native
  def ansi16(rgb: RGB_): ANSI16_ = js.native
  def ansi256(rgb: RGB_): ANSI256_ = js.native
  def apple(rgb: RGB_): APPLE_ = js.native
  def cmyk(rgb: RGB_): CMYK_ = js.native
  def gray(rgb: RGB_): GRAY_ = js.native
  def hcg(rgb: RGB_): HCG_ = js.native
  def hex(rgb: RGB_): HEX_ = js.native
  def hsl(rgb: RGB_): HSL_ = js.native
  def hsv(rgb: RGB_): HSV_ = js.native
  def hwb(rgb: RGB_): HWB_ = js.native
  def keyword(rgb: RGB_): KEYWORD_ = js.native
  def lab(rgb: RGB_): LAB_ = js.native
  def lch(from: RGB_): LCH_ = js.native
  def xyz(rgb: RGB_): XYZ_ = js.native
}

