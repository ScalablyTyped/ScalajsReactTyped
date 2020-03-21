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

trait lab extends js.Object {
  def ansi16(from: LAB_): ANSI16_
  def ansi256(from: LAB_): ANSI256_
  def apple(from: LAB_): APPLE_
  def cmyk(from: LAB_): CMYK_
  def gray(from: LAB_): GRAY_
  def hcg(from: LAB_): HCG_
  def hex(from: LAB_): HEX_
  def hsl(from: LAB_): HSL_
  def hsv(from: LAB_): HSV_
  def hwb(from: LAB_): HWB_
  def keyword(from: LAB_): KEYWORD_
  def lch(from: LAB_): LCH_
  def rgb(from: LAB_): RGB_
  def xyz(from: LAB_): XYZ_
}

object lab {
  @scala.inline
  def apply(
    ansi16: LAB_ => CallbackTo[ANSI16_],
    ansi256: LAB_ => CallbackTo[ANSI256_],
    apple: LAB_ => CallbackTo[APPLE_],
    cmyk: LAB_ => CallbackTo[CMYK_],
    gray: LAB_ => CallbackTo[GRAY_],
    hcg: LAB_ => CallbackTo[HCG_],
    hex: LAB_ => CallbackTo[HEX_],
    hsl: LAB_ => CallbackTo[HSL_],
    hsv: LAB_ => CallbackTo[HSV_],
    hwb: LAB_ => CallbackTo[HWB_],
    keyword: LAB_ => CallbackTo[KEYWORD_],
    lch: LAB_ => CallbackTo[LCH_],
    rgb: LAB_ => CallbackTo[RGB_],
    xyz: LAB_ => CallbackTo[XYZ_]
  ): lab = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ansi16")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.LAB_) => ansi16(t0).runNow()))
    __obj.updateDynamic("ansi256")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.LAB_) => ansi256(t0).runNow()))
    __obj.updateDynamic("apple")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.LAB_) => apple(t0).runNow()))
    __obj.updateDynamic("cmyk")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.LAB_) => cmyk(t0).runNow()))
    __obj.updateDynamic("gray")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.LAB_) => gray(t0).runNow()))
    __obj.updateDynamic("hcg")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.LAB_) => hcg(t0).runNow()))
    __obj.updateDynamic("hex")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.LAB_) => hex(t0).runNow()))
    __obj.updateDynamic("hsl")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.LAB_) => hsl(t0).runNow()))
    __obj.updateDynamic("hsv")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.LAB_) => hsv(t0).runNow()))
    __obj.updateDynamic("hwb")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.LAB_) => hwb(t0).runNow()))
    __obj.updateDynamic("keyword")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.LAB_) => keyword(t0).runNow()))
    __obj.updateDynamic("lch")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.LAB_) => lch(t0).runNow()))
    __obj.updateDynamic("rgb")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.LAB_) => rgb(t0).runNow()))
    __obj.updateDynamic("xyz")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.LAB_) => xyz(t0).runNow()))
    __obj.asInstanceOf[lab]
  }
}

