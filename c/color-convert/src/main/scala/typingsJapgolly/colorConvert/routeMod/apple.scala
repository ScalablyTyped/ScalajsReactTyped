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

trait apple extends js.Object {
  def ansi16(from: APPLE_): ANSI16_
  def ansi256(from: APPLE_): ANSI256_
  def cmyk(from: APPLE_): CMYK_
  def gray(from: APPLE_): GRAY_
  def hcg(from: APPLE_): HCG_
  def hex(from: APPLE_): HEX_
  def hsl(from: APPLE_): HSL_
  def hsv(from: APPLE_): HSV_
  def hwb(from: APPLE_): HWB_
  def keyword(from: APPLE_): KEYWORD_
  def lab(from: APPLE_): LAB_
  def lch(from: APPLE_): LCH_
  def rgb(from: APPLE_): RGB_
  def xyz(from: APPLE_): XYZ_
}

object apple {
  @scala.inline
  def apply(
    ansi16: APPLE_ => CallbackTo[ANSI16_],
    ansi256: APPLE_ => CallbackTo[ANSI256_],
    cmyk: APPLE_ => CallbackTo[CMYK_],
    gray: APPLE_ => CallbackTo[GRAY_],
    hcg: APPLE_ => CallbackTo[HCG_],
    hex: APPLE_ => CallbackTo[HEX_],
    hsl: APPLE_ => CallbackTo[HSL_],
    hsv: APPLE_ => CallbackTo[HSV_],
    hwb: APPLE_ => CallbackTo[HWB_],
    keyword: APPLE_ => CallbackTo[KEYWORD_],
    lab: APPLE_ => CallbackTo[LAB_],
    lch: APPLE_ => CallbackTo[LCH_],
    rgb: APPLE_ => CallbackTo[RGB_],
    xyz: APPLE_ => CallbackTo[XYZ_]
  ): apple = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ansi16")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.APPLE_) => ansi16(t0).runNow()))
    __obj.updateDynamic("ansi256")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.APPLE_) => ansi256(t0).runNow()))
    __obj.updateDynamic("cmyk")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.APPLE_) => cmyk(t0).runNow()))
    __obj.updateDynamic("gray")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.APPLE_) => gray(t0).runNow()))
    __obj.updateDynamic("hcg")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.APPLE_) => hcg(t0).runNow()))
    __obj.updateDynamic("hex")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.APPLE_) => hex(t0).runNow()))
    __obj.updateDynamic("hsl")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.APPLE_) => hsl(t0).runNow()))
    __obj.updateDynamic("hsv")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.APPLE_) => hsv(t0).runNow()))
    __obj.updateDynamic("hwb")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.APPLE_) => hwb(t0).runNow()))
    __obj.updateDynamic("keyword")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.APPLE_) => keyword(t0).runNow()))
    __obj.updateDynamic("lab")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.APPLE_) => lab(t0).runNow()))
    __obj.updateDynamic("lch")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.APPLE_) => lch(t0).runNow()))
    __obj.updateDynamic("rgb")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.APPLE_) => rgb(t0).runNow()))
    __obj.updateDynamic("xyz")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.APPLE_) => xyz(t0).runNow()))
    __obj.asInstanceOf[apple]
  }
}

