package typingsJapgolly.ansiStyles.escapeCodeMod.EscapeCode

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Conversions extends js.Object {
  def ansi(ansi: Double): String
  def ansi256(ansi256: Double): String
  /**
    * apple RGB to ansi code
    */
  def apple(r: Double, g: Double, b: Double): String
  def cmyk(c: Double, m: Double, y: Double, k: Double): String
  def gray(grayscale: Double): String
  def hcg(h: Double, c: Double, g: Double): String
  def hex(hex: String): String
  def hsl(h: Double, s: Double, l: Double): String
  def hsv(h: Double, s: Double, v: Double): String
  def hwb(h: Double, w: Double, b: Double): String
  /**
    * color keyword in css to ansi code
    */
  def keyword(keyword: String): String
  def lab(l: Double, a: Double, b: Double): String
  def lch(l: Double, c: Double, h: Double): String
  def rgb(r: Double, g: Double, b: Double): String
  def xyz(x: Double, y: Double, z: Double): String
}

object Conversions {
  @scala.inline
  def apply(
    ansi: Double => CallbackTo[String],
    ansi256: Double => CallbackTo[String],
    apple: (Double, Double, Double) => CallbackTo[String],
    cmyk: (Double, Double, Double, Double) => CallbackTo[String],
    gray: Double => CallbackTo[String],
    hcg: (Double, Double, Double) => CallbackTo[String],
    hex: String => CallbackTo[String],
    hsl: (Double, Double, Double) => CallbackTo[String],
    hsv: (Double, Double, Double) => CallbackTo[String],
    hwb: (Double, Double, Double) => CallbackTo[String],
    keyword: String => CallbackTo[String],
    lab: (Double, Double, Double) => CallbackTo[String],
    lch: (Double, Double, Double) => CallbackTo[String],
    rgb: (Double, Double, Double) => CallbackTo[String],
    xyz: (Double, Double, Double) => CallbackTo[String]
  ): Conversions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ansi")(js.Any.fromFunction1((t0: scala.Double) => ansi(t0).runNow()))
    __obj.updateDynamic("ansi256")(js.Any.fromFunction1((t0: scala.Double) => ansi256(t0).runNow()))
    __obj.updateDynamic("apple")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => apple(t0, t1, t2).runNow()))
    __obj.updateDynamic("cmyk")(js.Any.fromFunction4((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: scala.Double) => cmyk(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("gray")(js.Any.fromFunction1((t0: scala.Double) => gray(t0).runNow()))
    __obj.updateDynamic("hcg")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => hcg(t0, t1, t2).runNow()))
    __obj.updateDynamic("hex")(js.Any.fromFunction1((t0: java.lang.String) => hex(t0).runNow()))
    __obj.updateDynamic("hsl")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => hsl(t0, t1, t2).runNow()))
    __obj.updateDynamic("hsv")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => hsv(t0, t1, t2).runNow()))
    __obj.updateDynamic("hwb")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => hwb(t0, t1, t2).runNow()))
    __obj.updateDynamic("keyword")(js.Any.fromFunction1((t0: java.lang.String) => keyword(t0).runNow()))
    __obj.updateDynamic("lab")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => lab(t0, t1, t2).runNow()))
    __obj.updateDynamic("lch")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => lch(t0, t1, t2).runNow()))
    __obj.updateDynamic("rgb")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => rgb(t0, t1, t2).runNow()))
    __obj.updateDynamic("xyz")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => xyz(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Conversions]
  }
}

