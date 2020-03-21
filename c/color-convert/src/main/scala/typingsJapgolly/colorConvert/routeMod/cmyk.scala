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

trait cmyk extends js.Object {
  def ansi16(from: CMYK_): ANSI16_
  def ansi256(from: CMYK_): ANSI256_
  def apple(from: CMYK_): APPLE_
  def gray(from: CMYK_): GRAY_
  def hcg(from: CMYK_): HCG_
  def hex(from: CMYK_): HEX_
  def hsl(from: CMYK_): HSL_
  def hsv(from: CMYK_): HSV_
  def hwb(from: CMYK_): HWB_
  def keyword(from: CMYK_): KEYWORD_
  def lab(from: CMYK_): LAB_
  def lch(from: CMYK_): LCH_
  def rgb(from: CMYK_): RGB_
  def xyz(from: CMYK_): XYZ_
}

object cmyk {
  @scala.inline
  def apply(
    ansi16: CMYK_ => CallbackTo[ANSI16_],
    ansi256: CMYK_ => CallbackTo[ANSI256_],
    apple: CMYK_ => CallbackTo[APPLE_],
    gray: CMYK_ => CallbackTo[GRAY_],
    hcg: CMYK_ => CallbackTo[HCG_],
    hex: CMYK_ => CallbackTo[HEX_],
    hsl: CMYK_ => CallbackTo[HSL_],
    hsv: CMYK_ => CallbackTo[HSV_],
    hwb: CMYK_ => CallbackTo[HWB_],
    keyword: CMYK_ => CallbackTo[KEYWORD_],
    lab: CMYK_ => CallbackTo[LAB_],
    lch: CMYK_ => CallbackTo[LCH_],
    rgb: CMYK_ => CallbackTo[RGB_],
    xyz: CMYK_ => CallbackTo[XYZ_]
  ): cmyk = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ansi16")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.CMYK_) => ansi16(t0).runNow()))
    __obj.updateDynamic("ansi256")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.CMYK_) => ansi256(t0).runNow()))
    __obj.updateDynamic("apple")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.CMYK_) => apple(t0).runNow()))
    __obj.updateDynamic("gray")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.CMYK_) => gray(t0).runNow()))
    __obj.updateDynamic("hcg")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.CMYK_) => hcg(t0).runNow()))
    __obj.updateDynamic("hex")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.CMYK_) => hex(t0).runNow()))
    __obj.updateDynamic("hsl")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.CMYK_) => hsl(t0).runNow()))
    __obj.updateDynamic("hsv")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.CMYK_) => hsv(t0).runNow()))
    __obj.updateDynamic("hwb")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.CMYK_) => hwb(t0).runNow()))
    __obj.updateDynamic("keyword")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.CMYK_) => keyword(t0).runNow()))
    __obj.updateDynamic("lab")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.CMYK_) => lab(t0).runNow()))
    __obj.updateDynamic("lch")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.CMYK_) => lch(t0).runNow()))
    __obj.updateDynamic("rgb")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.CMYK_) => rgb(t0).runNow()))
    __obj.updateDynamic("xyz")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.CMYK_) => xyz(t0).runNow()))
    __obj.asInstanceOf[cmyk]
  }
}

