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

trait gray extends js.Object {
  def ansi16(from: GRAY_): ANSI16_
  def ansi256(from: GRAY_): ANSI256_
  def apple(from: GRAY_): APPLE_
  def cmyk(from: GRAY_): CMYK_
  def hcg(from: GRAY_): HCG_
  def hex(from: GRAY_): HEX_
  def hsl(from: GRAY_): HSL_
  def hsv(from: GRAY_): HSV_
  def hwb(from: GRAY_): HWB_
  def keyword(from: GRAY_): KEYWORD_
  def lab(from: GRAY_): LAB_
  def lch(from: GRAY_): LCH_
  def rgb(from: GRAY_): RGB_
  def xyz(from: GRAY_): XYZ_
}

object gray {
  @scala.inline
  def apply(
    ansi16: GRAY_ => CallbackTo[ANSI16_],
    ansi256: GRAY_ => CallbackTo[ANSI256_],
    apple: GRAY_ => CallbackTo[APPLE_],
    cmyk: GRAY_ => CallbackTo[CMYK_],
    hcg: GRAY_ => CallbackTo[HCG_],
    hex: GRAY_ => CallbackTo[HEX_],
    hsl: GRAY_ => CallbackTo[HSL_],
    hsv: GRAY_ => CallbackTo[HSV_],
    hwb: GRAY_ => CallbackTo[HWB_],
    keyword: GRAY_ => CallbackTo[KEYWORD_],
    lab: GRAY_ => CallbackTo[LAB_],
    lch: GRAY_ => CallbackTo[LCH_],
    rgb: GRAY_ => CallbackTo[RGB_],
    xyz: GRAY_ => CallbackTo[XYZ_]
  ): gray = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ansi16")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.GRAY_) => ansi16(t0).runNow()))
    __obj.updateDynamic("ansi256")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.GRAY_) => ansi256(t0).runNow()))
    __obj.updateDynamic("apple")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.GRAY_) => apple(t0).runNow()))
    __obj.updateDynamic("cmyk")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.GRAY_) => cmyk(t0).runNow()))
    __obj.updateDynamic("hcg")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.GRAY_) => hcg(t0).runNow()))
    __obj.updateDynamic("hex")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.GRAY_) => hex(t0).runNow()))
    __obj.updateDynamic("hsl")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.GRAY_) => hsl(t0).runNow()))
    __obj.updateDynamic("hsv")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.GRAY_) => hsv(t0).runNow()))
    __obj.updateDynamic("hwb")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.GRAY_) => hwb(t0).runNow()))
    __obj.updateDynamic("keyword")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.GRAY_) => keyword(t0).runNow()))
    __obj.updateDynamic("lab")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.GRAY_) => lab(t0).runNow()))
    __obj.updateDynamic("lch")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.GRAY_) => lch(t0).runNow()))
    __obj.updateDynamic("rgb")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.GRAY_) => rgb(t0).runNow()))
    __obj.updateDynamic("xyz")(js.Any.fromFunction1((t0: typingsJapgolly.colorConvert.conversionsMod.GRAY_) => xyz(t0).runNow()))
    __obj.asInstanceOf[gray]
  }
}

