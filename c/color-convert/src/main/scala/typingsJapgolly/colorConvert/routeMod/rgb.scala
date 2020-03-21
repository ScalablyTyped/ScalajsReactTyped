package typingsJapgolly.colorConvert.routeMod

import japgolly.scalajs.react.CallbackTo
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

trait rgb extends js.Object {
  def ansi16(from: RGB_): ANSI16_
  def ansi256(from: RGB_): ANSI256_
  def apple(from: RGB_): APPLE_
  def cmyk(from: RGB_): CMYK_
  def gray(from: RGB_): GRAY_
  def hcg(from: RGB_): HCG_
  def hex(from: RGB_): HEX_
  def hsl(from: RGB_): HSL_
  def hsv(from: RGB_): HSV_
  def hwb(from: RGB_): HWB_
  def keyword(from: RGB_): KEYWORD_
  def lab(from: RGB_): LAB_
  def lch(from: RGB_): LCH_
  def xyz(from: RGB_): XYZ_
}

object rgb {
  @scala.inline
  def apply(
    ansi16: RGB_ => CallbackTo[ANSI16_],
    ansi256: RGB_ => CallbackTo[ANSI256_],
    apple: RGB_ => CallbackTo[APPLE_],
    cmyk: RGB_ => CallbackTo[CMYK_],
    gray: RGB_ => CallbackTo[GRAY_],
    hcg: RGB_ => CallbackTo[HCG_],
    hex: RGB_ => CallbackTo[HEX_],
    hsl: RGB_ => CallbackTo[HSL_],
    hsv: RGB_ => CallbackTo[HSV_],
    hwb: RGB_ => CallbackTo[HWB_],
    keyword: RGB_ => CallbackTo[KEYWORD_],
    lab: RGB_ => CallbackTo[LAB_],
    lch: RGB_ => CallbackTo[LCH_],
    xyz: RGB_ => CallbackTo[XYZ_]
  ): rgb = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ansi16")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.RGB_) => ansi16(t0).runNow()))
    __obj.updateDynamic("ansi256")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.RGB_) => ansi256(t0).runNow()))
    __obj.updateDynamic("apple")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.RGB_) => apple(t0).runNow()))
    __obj.updateDynamic("cmyk")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.RGB_) => cmyk(t0).runNow()))
    __obj.updateDynamic("gray")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.RGB_) => gray(t0).runNow()))
    __obj.updateDynamic("hcg")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.RGB_) => hcg(t0).runNow()))
    __obj.updateDynamic("hex")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.RGB_) => hex(t0).runNow()))
    __obj.updateDynamic("hsl")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.RGB_) => hsl(t0).runNow()))
    __obj.updateDynamic("hsv")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.RGB_) => hsv(t0).runNow()))
    __obj.updateDynamic("hwb")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.RGB_) => hwb(t0).runNow()))
    __obj.updateDynamic("keyword")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.RGB_) => keyword(t0).runNow()))
    __obj.updateDynamic("lab")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.RGB_) => lab(t0).runNow()))
    __obj.updateDynamic("lch")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.RGB_) => lch(t0).runNow()))
    __obj.updateDynamic("xyz")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.RGB_) => xyz(t0).runNow()))
    __obj.asInstanceOf[rgb]
  }
}

