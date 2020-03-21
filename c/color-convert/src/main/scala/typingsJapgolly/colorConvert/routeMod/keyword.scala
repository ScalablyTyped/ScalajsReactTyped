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

trait keyword extends js.Object {
  def ansi16(from: KEYWORD_): ANSI16_
  def ansi256(from: KEYWORD_): ANSI256_
  def apple(from: KEYWORD_): APPLE_
  def cmyk(from: KEYWORD_): CMYK_
  def gray(from: KEYWORD_): GRAY_
  def hcg(from: KEYWORD_): HCG_
  def hex(from: KEYWORD_): HEX_
  def hsl(from: KEYWORD_): HSL_
  def hsv(from: KEYWORD_): HSV_
  def hwb(from: KEYWORD_): HWB_
  def lab(from: KEYWORD_): LAB_
  def lch(from: KEYWORD_): LCH_
  def rgb(from: KEYWORD_): RGB_
  def xyz(from: KEYWORD_): XYZ_
}

object keyword {
  @scala.inline
  def apply(
    ansi16: KEYWORD_ => CallbackTo[ANSI16_],
    ansi256: KEYWORD_ => CallbackTo[ANSI256_],
    apple: KEYWORD_ => CallbackTo[APPLE_],
    cmyk: KEYWORD_ => CallbackTo[CMYK_],
    gray: KEYWORD_ => CallbackTo[GRAY_],
    hcg: KEYWORD_ => CallbackTo[HCG_],
    hex: KEYWORD_ => CallbackTo[HEX_],
    hsl: KEYWORD_ => CallbackTo[HSL_],
    hsv: KEYWORD_ => CallbackTo[HSV_],
    hwb: KEYWORD_ => CallbackTo[HWB_],
    lab: KEYWORD_ => CallbackTo[LAB_],
    lch: KEYWORD_ => CallbackTo[LCH_],
    rgb: KEYWORD_ => CallbackTo[RGB_],
    xyz: KEYWORD_ => CallbackTo[XYZ_]
  ): keyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ansi16")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.KEYWORD_) => ansi16(t0).runNow()))
    __obj.updateDynamic("ansi256")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.KEYWORD_) => ansi256(t0).runNow()))
    __obj.updateDynamic("apple")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.KEYWORD_) => apple(t0).runNow()))
    __obj.updateDynamic("cmyk")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.KEYWORD_) => cmyk(t0).runNow()))
    __obj.updateDynamic("gray")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.KEYWORD_) => gray(t0).runNow()))
    __obj.updateDynamic("hcg")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.KEYWORD_) => hcg(t0).runNow()))
    __obj.updateDynamic("hex")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.KEYWORD_) => hex(t0).runNow()))
    __obj.updateDynamic("hsl")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.KEYWORD_) => hsl(t0).runNow()))
    __obj.updateDynamic("hsv")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.KEYWORD_) => hsv(t0).runNow()))
    __obj.updateDynamic("hwb")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.KEYWORD_) => hwb(t0).runNow()))
    __obj.updateDynamic("lab")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.KEYWORD_) => lab(t0).runNow()))
    __obj.updateDynamic("lch")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.KEYWORD_) => lch(t0).runNow()))
    __obj.updateDynamic("rgb")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.KEYWORD_) => rgb(t0).runNow()))
    __obj.updateDynamic("xyz")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.KEYWORD_) => xyz(t0).runNow()))
    __obj.asInstanceOf[keyword]
  }
}

