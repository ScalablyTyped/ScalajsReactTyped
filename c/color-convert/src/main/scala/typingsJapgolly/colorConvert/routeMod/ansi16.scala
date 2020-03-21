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

trait ansi16 extends js.Object {
  def ansi256(from: ANSI16_): ANSI256_
  def apple(from: ANSI16_): APPLE_
  def cmyk(from: ANSI16_): CMYK_
  def gray(from: ANSI16_): GRAY_
  def hcg(from: ANSI16_): HCG_
  def hex(from: ANSI16_): HEX_
  def hsl(from: ANSI16_): HSL_
  def hsv(from: ANSI16_): HSV_
  def hwb(from: ANSI16_): HWB_
  def keyword(from: ANSI16_): KEYWORD_
  def lab(from: ANSI16_): LAB_
  def lch(from: ANSI16_): LCH_
  def rgb(from: ANSI16_): RGB_
  def xyz(from: ANSI16_): XYZ_
}

object ansi16 {
  @scala.inline
  def apply(
    ansi256: ANSI16_ => CallbackTo[ANSI256_],
    apple: ANSI16_ => CallbackTo[APPLE_],
    cmyk: ANSI16_ => CallbackTo[CMYK_],
    gray: ANSI16_ => CallbackTo[GRAY_],
    hcg: ANSI16_ => CallbackTo[HCG_],
    hex: ANSI16_ => CallbackTo[HEX_],
    hsl: ANSI16_ => CallbackTo[HSL_],
    hsv: ANSI16_ => CallbackTo[HSV_],
    hwb: ANSI16_ => CallbackTo[HWB_],
    keyword: ANSI16_ => CallbackTo[KEYWORD_],
    lab: ANSI16_ => CallbackTo[LAB_],
    lch: ANSI16_ => CallbackTo[LCH_],
    rgb: ANSI16_ => CallbackTo[RGB_],
    xyz: ANSI16_ => CallbackTo[XYZ_]
  ): ansi16 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ansi256")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.ANSI16_) => ansi256(t0).runNow()))
    __obj.updateDynamic("apple")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.ANSI16_) => apple(t0).runNow()))
    __obj.updateDynamic("cmyk")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.ANSI16_) => cmyk(t0).runNow()))
    __obj.updateDynamic("gray")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.ANSI16_) => gray(t0).runNow()))
    __obj.updateDynamic("hcg")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.ANSI16_) => hcg(t0).runNow()))
    __obj.updateDynamic("hex")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.ANSI16_) => hex(t0).runNow()))
    __obj.updateDynamic("hsl")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.ANSI16_) => hsl(t0).runNow()))
    __obj.updateDynamic("hsv")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.ANSI16_) => hsv(t0).runNow()))
    __obj.updateDynamic("hwb")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.ANSI16_) => hwb(t0).runNow()))
    __obj.updateDynamic("keyword")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.ANSI16_) => keyword(t0).runNow()))
    __obj.updateDynamic("lab")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.ANSI16_) => lab(t0).runNow()))
    __obj.updateDynamic("lch")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.ANSI16_) => lch(t0).runNow()))
    __obj.updateDynamic("rgb")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.ANSI16_) => rgb(t0).runNow()))
    __obj.updateDynamic("xyz")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.ANSI16_) => xyz(t0).runNow()))
    __obj.asInstanceOf[ansi16]
  }
}

