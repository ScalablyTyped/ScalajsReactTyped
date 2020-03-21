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

trait lch extends js.Object {
  def ansi16(from: LCH_): ANSI16_
  def ansi256(from: LCH_): ANSI256_
  def apple(from: LCH_): APPLE_
  def cmyk(from: LCH_): CMYK_
  def gray(from: LCH_): GRAY_
  def hcg(from: LCH_): HCG_
  def hex(from: LCH_): HEX_
  def hsl(from: LCH_): HSL_
  def hsv(from: LCH_): HSV_
  def hwb(from: LCH_): HWB_
  def keyword(from: LCH_): KEYWORD_
  def lab(from: LCH_): LAB_
  def rgb(from: LCH_): RGB_
  def xyz(from: LCH_): XYZ_
}

object lch {
  @scala.inline
  def apply(
    ansi16: LCH_ => CallbackTo[ANSI16_],
    ansi256: LCH_ => CallbackTo[ANSI256_],
    apple: LCH_ => CallbackTo[APPLE_],
    cmyk: LCH_ => CallbackTo[CMYK_],
    gray: LCH_ => CallbackTo[GRAY_],
    hcg: LCH_ => CallbackTo[HCG_],
    hex: LCH_ => CallbackTo[HEX_],
    hsl: LCH_ => CallbackTo[HSL_],
    hsv: LCH_ => CallbackTo[HSV_],
    hwb: LCH_ => CallbackTo[HWB_],
    keyword: LCH_ => CallbackTo[KEYWORD_],
    lab: LCH_ => CallbackTo[LAB_],
    rgb: LCH_ => CallbackTo[RGB_],
    xyz: LCH_ => CallbackTo[XYZ_]
  ): lch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ansi16")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.LCH_) => ansi16(t0).runNow()))
    __obj.updateDynamic("ansi256")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.LCH_) => ansi256(t0).runNow()))
    __obj.updateDynamic("apple")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.LCH_) => apple(t0).runNow()))
    __obj.updateDynamic("cmyk")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.LCH_) => cmyk(t0).runNow()))
    __obj.updateDynamic("gray")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.LCH_) => gray(t0).runNow()))
    __obj.updateDynamic("hcg")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.LCH_) => hcg(t0).runNow()))
    __obj.updateDynamic("hex")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.LCH_) => hex(t0).runNow()))
    __obj.updateDynamic("hsl")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.LCH_) => hsl(t0).runNow()))
    __obj.updateDynamic("hsv")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.LCH_) => hsv(t0).runNow()))
    __obj.updateDynamic("hwb")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.LCH_) => hwb(t0).runNow()))
    __obj.updateDynamic("keyword")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.LCH_) => keyword(t0).runNow()))
    __obj.updateDynamic("lab")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.LCH_) => lab(t0).runNow()))
    __obj.updateDynamic("rgb")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.LCH_) => rgb(t0).runNow()))
    __obj.updateDynamic("xyz")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.LCH_) => xyz(t0).runNow()))
    __obj.asInstanceOf[lch]
  }
}

