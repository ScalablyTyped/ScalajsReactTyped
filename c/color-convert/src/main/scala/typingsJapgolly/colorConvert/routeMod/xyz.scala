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

trait xyz extends js.Object {
  def ansi16(from: XYZ_): ANSI16_
  def ansi256(from: XYZ_): ANSI256_
  def apple(from: XYZ_): APPLE_
  def cmyk(from: XYZ_): CMYK_
  def gray(from: XYZ_): GRAY_
  def hcg(from: XYZ_): HCG_
  def hex(from: XYZ_): HEX_
  def hsl(from: XYZ_): HSL_
  def hsv(from: XYZ_): HSV_
  def hwb(from: XYZ_): HWB_
  def keyword(from: XYZ_): KEYWORD_
  def lab(from: XYZ_): LAB_
  def lch(from: XYZ_): LCH_
  def rgb(from: XYZ_): RGB_
}

object xyz {
  @scala.inline
  def apply(
    ansi16: XYZ_ => CallbackTo[ANSI16_],
    ansi256: XYZ_ => CallbackTo[ANSI256_],
    apple: XYZ_ => CallbackTo[APPLE_],
    cmyk: XYZ_ => CallbackTo[CMYK_],
    gray: XYZ_ => CallbackTo[GRAY_],
    hcg: XYZ_ => CallbackTo[HCG_],
    hex: XYZ_ => CallbackTo[HEX_],
    hsl: XYZ_ => CallbackTo[HSL_],
    hsv: XYZ_ => CallbackTo[HSV_],
    hwb: XYZ_ => CallbackTo[HWB_],
    keyword: XYZ_ => CallbackTo[KEYWORD_],
    lab: XYZ_ => CallbackTo[LAB_],
    lch: XYZ_ => CallbackTo[LCH_],
    rgb: XYZ_ => CallbackTo[RGB_]
  ): xyz = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ansi16")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.XYZ_) => ansi16(t0).runNow()))
    __obj.updateDynamic("ansi256")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.XYZ_) => ansi256(t0).runNow()))
    __obj.updateDynamic("apple")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.XYZ_) => apple(t0).runNow()))
    __obj.updateDynamic("cmyk")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.XYZ_) => cmyk(t0).runNow()))
    __obj.updateDynamic("gray")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.XYZ_) => gray(t0).runNow()))
    __obj.updateDynamic("hcg")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.XYZ_) => hcg(t0).runNow()))
    __obj.updateDynamic("hex")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.XYZ_) => hex(t0).runNow()))
    __obj.updateDynamic("hsl")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.XYZ_) => hsl(t0).runNow()))
    __obj.updateDynamic("hsv")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.XYZ_) => hsv(t0).runNow()))
    __obj.updateDynamic("hwb")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.XYZ_) => hwb(t0).runNow()))
    __obj.updateDynamic("keyword")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.XYZ_) => keyword(t0).runNow()))
    __obj.updateDynamic("lab")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.XYZ_) => lab(t0).runNow()))
    __obj.updateDynamic("lch")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.XYZ_) => lch(t0).runNow()))
    __obj.updateDynamic("rgb")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.XYZ_) => rgb(t0).runNow()))
    __obj.asInstanceOf[xyz]
  }
}

