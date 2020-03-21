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

trait hwb extends js.Object {
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
  @scala.inline
  def apply(
    ansi16: HWB_ => CallbackTo[ANSI16_],
    ansi256: HWB_ => CallbackTo[ANSI256_],
    apple: HWB_ => CallbackTo[APPLE_],
    cmyk: HWB_ => CallbackTo[CMYK_],
    gray: HWB_ => CallbackTo[GRAY_],
    hcg: HWB_ => CallbackTo[HCG_],
    hex: HWB_ => CallbackTo[HEX_],
    hsl: HWB_ => CallbackTo[HSL_],
    hsv: HWB_ => CallbackTo[HSV_],
    keyword: HWB_ => CallbackTo[KEYWORD_],
    lab: HWB_ => CallbackTo[LAB_],
    lch: HWB_ => CallbackTo[LCH_],
    rgb: HWB_ => CallbackTo[RGB_],
    xyz: HWB_ => CallbackTo[XYZ_]
  ): hwb = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ansi16")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HWB_) => ansi16(t0).runNow()))
    __obj.updateDynamic("ansi256")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HWB_) => ansi256(t0).runNow()))
    __obj.updateDynamic("apple")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HWB_) => apple(t0).runNow()))
    __obj.updateDynamic("cmyk")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HWB_) => cmyk(t0).runNow()))
    __obj.updateDynamic("gray")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HWB_) => gray(t0).runNow()))
    __obj.updateDynamic("hcg")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HWB_) => hcg(t0).runNow()))
    __obj.updateDynamic("hex")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HWB_) => hex(t0).runNow()))
    __obj.updateDynamic("hsl")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HWB_) => hsl(t0).runNow()))
    __obj.updateDynamic("hsv")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HWB_) => hsv(t0).runNow()))
    __obj.updateDynamic("keyword")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HWB_) => keyword(t0).runNow()))
    __obj.updateDynamic("lab")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HWB_) => lab(t0).runNow()))
    __obj.updateDynamic("lch")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HWB_) => lch(t0).runNow()))
    __obj.updateDynamic("rgb")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HWB_) => rgb(t0).runNow()))
    __obj.updateDynamic("xyz")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HWB_) => xyz(t0).runNow()))
    __obj.asInstanceOf[hwb]
  }
}

