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

trait hsl extends js.Object {
  def ansi16(from: HSL_): ANSI16_
  def ansi256(from: HSL_): ANSI256_
  def apple(from: HSL_): APPLE_
  def cmyk(from: HSL_): CMYK_
  def gray(from: HSL_): GRAY_
  def hcg(from: HSL_): HCG_
  def hex(from: HSL_): HEX_
  def hsv(from: HSL_): HSV_
  def hwb(from: HSL_): HWB_
  def keyword(from: HSL_): KEYWORD_
  def lab(from: HSL_): LAB_
  def lch(from: HSL_): LCH_
  def rgb(from: HSL_): RGB_
  def xyz(from: HSL_): XYZ_
}

object hsl {
  @scala.inline
  def apply(
    ansi16: HSL_ => CallbackTo[ANSI16_],
    ansi256: HSL_ => CallbackTo[ANSI256_],
    apple: HSL_ => CallbackTo[APPLE_],
    cmyk: HSL_ => CallbackTo[CMYK_],
    gray: HSL_ => CallbackTo[GRAY_],
    hcg: HSL_ => CallbackTo[HCG_],
    hex: HSL_ => CallbackTo[HEX_],
    hsv: HSL_ => CallbackTo[HSV_],
    hwb: HSL_ => CallbackTo[HWB_],
    keyword: HSL_ => CallbackTo[KEYWORD_],
    lab: HSL_ => CallbackTo[LAB_],
    lch: HSL_ => CallbackTo[LCH_],
    rgb: HSL_ => CallbackTo[RGB_],
    xyz: HSL_ => CallbackTo[XYZ_]
  ): hsl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ansi16")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HSL_) => ansi16(t0).runNow()))
    __obj.updateDynamic("ansi256")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HSL_) => ansi256(t0).runNow()))
    __obj.updateDynamic("apple")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HSL_) => apple(t0).runNow()))
    __obj.updateDynamic("cmyk")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HSL_) => cmyk(t0).runNow()))
    __obj.updateDynamic("gray")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HSL_) => gray(t0).runNow()))
    __obj.updateDynamic("hcg")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HSL_) => hcg(t0).runNow()))
    __obj.updateDynamic("hex")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HSL_) => hex(t0).runNow()))
    __obj.updateDynamic("hsv")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HSL_) => hsv(t0).runNow()))
    __obj.updateDynamic("hwb")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HSL_) => hwb(t0).runNow()))
    __obj.updateDynamic("keyword")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HSL_) => keyword(t0).runNow()))
    __obj.updateDynamic("lab")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HSL_) => lab(t0).runNow()))
    __obj.updateDynamic("lch")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HSL_) => lch(t0).runNow()))
    __obj.updateDynamic("rgb")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HSL_) => rgb(t0).runNow()))
    __obj.updateDynamic("xyz")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HSL_) => xyz(t0).runNow()))
    __obj.asInstanceOf[hsl]
  }
}

