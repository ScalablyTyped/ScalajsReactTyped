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

trait hsv extends js.Object {
  def ansi16(from: HSV_): ANSI16_
  def ansi256(from: HSV_): ANSI256_
  def apple(from: HSV_): APPLE_
  def cmyk(from: HSV_): CMYK_
  def gray(from: HSV_): GRAY_
  def hcg(from: HSV_): HCG_
  def hex(from: HSV_): HEX_
  def hsl(from: HSV_): HSL_
  def hwb(from: HSV_): HWB_
  def keyword(from: HSV_): KEYWORD_
  def lab(from: HSV_): LAB_
  def lch(from: HSV_): LCH_
  def rgb(from: HSV_): RGB_
  def xyz(from: HSV_): XYZ_
}

object hsv {
  @scala.inline
  def apply(
    ansi16: HSV_ => CallbackTo[ANSI16_],
    ansi256: HSV_ => CallbackTo[ANSI256_],
    apple: HSV_ => CallbackTo[APPLE_],
    cmyk: HSV_ => CallbackTo[CMYK_],
    gray: HSV_ => CallbackTo[GRAY_],
    hcg: HSV_ => CallbackTo[HCG_],
    hex: HSV_ => CallbackTo[HEX_],
    hsl: HSV_ => CallbackTo[HSL_],
    hwb: HSV_ => CallbackTo[HWB_],
    keyword: HSV_ => CallbackTo[KEYWORD_],
    lab: HSV_ => CallbackTo[LAB_],
    lch: HSV_ => CallbackTo[LCH_],
    rgb: HSV_ => CallbackTo[RGB_],
    xyz: HSV_ => CallbackTo[XYZ_]
  ): hsv = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ansi16")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HSV_) => ansi16(t0).runNow()))
    __obj.updateDynamic("ansi256")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HSV_) => ansi256(t0).runNow()))
    __obj.updateDynamic("apple")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HSV_) => apple(t0).runNow()))
    __obj.updateDynamic("cmyk")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HSV_) => cmyk(t0).runNow()))
    __obj.updateDynamic("gray")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HSV_) => gray(t0).runNow()))
    __obj.updateDynamic("hcg")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HSV_) => hcg(t0).runNow()))
    __obj.updateDynamic("hex")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HSV_) => hex(t0).runNow()))
    __obj.updateDynamic("hsl")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HSV_) => hsl(t0).runNow()))
    __obj.updateDynamic("hwb")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HSV_) => hwb(t0).runNow()))
    __obj.updateDynamic("keyword")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HSV_) => keyword(t0).runNow()))
    __obj.updateDynamic("lab")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HSV_) => lab(t0).runNow()))
    __obj.updateDynamic("lch")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HSV_) => lch(t0).runNow()))
    __obj.updateDynamic("rgb")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HSV_) => rgb(t0).runNow()))
    __obj.updateDynamic("xyz")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.HSV_) => xyz(t0).runNow()))
    __obj.asInstanceOf[hsv]
  }
}

