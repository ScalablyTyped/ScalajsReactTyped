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

trait ansi256 extends js.Object {
  def ansi16(from: ANSI256_): ANSI16_
  def apple(from: ANSI256_): APPLE_
  def cmyk(from: ANSI256_): CMYK_
  def gray(from: ANSI256_): GRAY_
  def hcg(from: ANSI256_): HCG_
  def hex(from: ANSI256_): HEX_
  def hsl(from: ANSI256_): HSL_
  def hsv(from: ANSI256_): HSV_
  def hwb(from: ANSI256_): HWB_
  def keyword(from: ANSI256_): KEYWORD_
  def lab(from: ANSI256_): LAB_
  def lch(from: ANSI256_): LCH_
  def rgb(from: ANSI256_): RGB_
  def xyz(from: ANSI256_): XYZ_
}

object ansi256 {
  @scala.inline
  def apply(
    ansi16: ANSI256_ => CallbackTo[ANSI16_],
    apple: ANSI256_ => CallbackTo[APPLE_],
    cmyk: ANSI256_ => CallbackTo[CMYK_],
    gray: ANSI256_ => CallbackTo[GRAY_],
    hcg: ANSI256_ => CallbackTo[HCG_],
    hex: ANSI256_ => CallbackTo[HEX_],
    hsl: ANSI256_ => CallbackTo[HSL_],
    hsv: ANSI256_ => CallbackTo[HSV_],
    hwb: ANSI256_ => CallbackTo[HWB_],
    keyword: ANSI256_ => CallbackTo[KEYWORD_],
    lab: ANSI256_ => CallbackTo[LAB_],
    lch: ANSI256_ => CallbackTo[LCH_],
    rgb: ANSI256_ => CallbackTo[RGB_],
    xyz: ANSI256_ => CallbackTo[XYZ_]
  ): ansi256 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ansi16")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.ANSI256_) => ansi16(t0).runNow()))
    __obj.updateDynamic("apple")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.ANSI256_) => apple(t0).runNow()))
    __obj.updateDynamic("cmyk")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.ANSI256_) => cmyk(t0).runNow()))
    __obj.updateDynamic("gray")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.ANSI256_) => gray(t0).runNow()))
    __obj.updateDynamic("hcg")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.ANSI256_) => hcg(t0).runNow()))
    __obj.updateDynamic("hex")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.ANSI256_) => hex(t0).runNow()))
    __obj.updateDynamic("hsl")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.ANSI256_) => hsl(t0).runNow()))
    __obj.updateDynamic("hsv")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.ANSI256_) => hsv(t0).runNow()))
    __obj.updateDynamic("hwb")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.ANSI256_) => hwb(t0).runNow()))
    __obj.updateDynamic("keyword")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.ANSI256_) => keyword(t0).runNow()))
    __obj.updateDynamic("lab")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.ANSI256_) => lab(t0).runNow()))
    __obj.updateDynamic("lch")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.ANSI256_) => lch(t0).runNow()))
    __obj.updateDynamic("rgb")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.ANSI256_) => rgb(t0).runNow()))
    __obj.updateDynamic("xyz")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.ANSI256_) => xyz(t0).runNow()))
    __obj.asInstanceOf[ansi256]
  }
}

