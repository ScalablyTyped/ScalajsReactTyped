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

trait hcg extends js.Object {
  def ansi16(from: HCG_): ANSI16_
  def ansi256(from: HCG_): ANSI256_
  def apple(from: HCG_): APPLE_
  def cmyk(from: HCG_): CMYK_
  def gray(from: HCG_): GRAY_
  def hex(from: HCG_): HEX_
  def hsl(from: HCG_): HSL_
  def hsv(from: HCG_): HSV_
  def hwb(from: HCG_): HWB_
  def keyword(from: HCG_): KEYWORD_
  def lab(from: HCG_): LAB_
  def lch(from: HCG_): LCH_
  def rgb(from: HCG_): RGB_
  def xyz(from: HCG_): XYZ_
}

object hcg {
  @scala.inline
  def apply(
    ansi16: HCG_ => CallbackTo[ANSI16_],
    ansi256: HCG_ => CallbackTo[ANSI256_],
    apple: HCG_ => CallbackTo[APPLE_],
    cmyk: HCG_ => CallbackTo[CMYK_],
    gray: HCG_ => CallbackTo[GRAY_],
    hex: HCG_ => CallbackTo[HEX_],
    hsl: HCG_ => CallbackTo[HSL_],
    hsv: HCG_ => CallbackTo[HSV_],
    hwb: HCG_ => CallbackTo[HWB_],
    keyword: HCG_ => CallbackTo[KEYWORD_],
    lab: HCG_ => CallbackTo[LAB_],
    lch: HCG_ => CallbackTo[LCH_],
    rgb: HCG_ => CallbackTo[RGB_],
    xyz: HCG_ => CallbackTo[XYZ_]
  ): hcg = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ansi16")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HCG_) => ansi16(t0).runNow()))
    __obj.updateDynamic("ansi256")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HCG_) => ansi256(t0).runNow()))
    __obj.updateDynamic("apple")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HCG_) => apple(t0).runNow()))
    __obj.updateDynamic("cmyk")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HCG_) => cmyk(t0).runNow()))
    __obj.updateDynamic("gray")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HCG_) => gray(t0).runNow()))
    __obj.updateDynamic("hex")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HCG_) => hex(t0).runNow()))
    __obj.updateDynamic("hsl")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HCG_) => hsl(t0).runNow()))
    __obj.updateDynamic("hsv")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HCG_) => hsv(t0).runNow()))
    __obj.updateDynamic("hwb")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HCG_) => hwb(t0).runNow()))
    __obj.updateDynamic("keyword")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HCG_) => keyword(t0).runNow()))
    __obj.updateDynamic("lab")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HCG_) => lab(t0).runNow()))
    __obj.updateDynamic("lch")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HCG_) => lch(t0).runNow()))
    __obj.updateDynamic("rgb")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HCG_) => rgb(t0).runNow()))
    __obj.updateDynamic("xyz")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HCG_) => xyz(t0).runNow()))
    __obj.asInstanceOf[hcg]
  }
}

