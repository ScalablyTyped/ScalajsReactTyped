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

trait hex extends js.Object {
  def ansi16(from: HEX_): ANSI16_
  def ansi256(from: HEX_): ANSI256_
  def apple(from: HEX_): APPLE_
  def cmyk(from: HEX_): CMYK_
  def gray(from: HEX_): GRAY_
  def hcg(from: HEX_): HCG_
  def hsl(from: HEX_): HSL_
  def hsv(from: HEX_): HSV_
  def hwb(from: HEX_): HWB_
  def keyword(from: HEX_): KEYWORD_
  def lab(from: HEX_): LAB_
  def lch(from: HEX_): LCH_
  def rgb(from: HEX_): RGB_
  def xyz(from: HEX_): XYZ_
}

object hex {
  @scala.inline
  def apply(
    ansi16: HEX_ => CallbackTo[ANSI16_],
    ansi256: HEX_ => CallbackTo[ANSI256_],
    apple: HEX_ => CallbackTo[APPLE_],
    cmyk: HEX_ => CallbackTo[CMYK_],
    gray: HEX_ => CallbackTo[GRAY_],
    hcg: HEX_ => CallbackTo[HCG_],
    hsl: HEX_ => CallbackTo[HSL_],
    hsv: HEX_ => CallbackTo[HSV_],
    hwb: HEX_ => CallbackTo[HWB_],
    keyword: HEX_ => CallbackTo[KEYWORD_],
    lab: HEX_ => CallbackTo[LAB_],
    lch: HEX_ => CallbackTo[LCH_],
    rgb: HEX_ => CallbackTo[RGB_],
    xyz: HEX_ => CallbackTo[XYZ_]
  ): hex = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ansi16")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HEX_) => ansi16(t0).runNow()))
    __obj.updateDynamic("ansi256")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HEX_) => ansi256(t0).runNow()))
    __obj.updateDynamic("apple")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HEX_) => apple(t0).runNow()))
    __obj.updateDynamic("cmyk")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HEX_) => cmyk(t0).runNow()))
    __obj.updateDynamic("gray")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HEX_) => gray(t0).runNow()))
    __obj.updateDynamic("hcg")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HEX_) => hcg(t0).runNow()))
    __obj.updateDynamic("hsl")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HEX_) => hsl(t0).runNow()))
    __obj.updateDynamic("hsv")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HEX_) => hsv(t0).runNow()))
    __obj.updateDynamic("hwb")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HEX_) => hwb(t0).runNow()))
    __obj.updateDynamic("keyword")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HEX_) => keyword(t0).runNow()))
    __obj.updateDynamic("lab")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HEX_) => lab(t0).runNow()))
    __obj.updateDynamic("lch")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HEX_) => lch(t0).runNow()))
    __obj.updateDynamic("rgb")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HEX_) => rgb(t0).runNow()))
    __obj.updateDynamic("xyz")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HEX_) => xyz(t0).runNow()))
    __obj.asInstanceOf[hex]
  }
}

