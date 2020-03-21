package typingsJapgolly.jqueryColorpicker.JQueryColorpickerStatic

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jqueryColorpicker.AnonA
import typingsJapgolly.jqueryColorpicker.AnonCmyk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  var set: Boolean
  def copy(): Color
  def distance(color: Color): Double
  def equals(color: Color): Boolean
  def getAlpha(): Double
  def getCMYK(): CMYK
  def getChannels(): AnonA
  def getHSL(): HSL
  def getHSV(): HSV
  def getLAB(): LAB
  def getRGB(): RGB
  def getSpaces(): AnonCmyk
  def limit(steps: Double): Unit
  def normalize(): Color
  def setAlpha(a: Double): Color
  def setCMYK(c: Double, m: Double, y: Double, k: Double): Color
  def setHSL(h: Double, s: Double, l: Double): Color
  def setHSV(h: Double, s: Double, v: Double): Color
  def setLAB(l: Double, a: Double, b: Double): Color
  def setRGB(r: Double, g: Double, b: Double): Color
  def setSpaces(new_spaces: js.Any): Color
  def toCSS(): String
  def toHEX(): String
}

object Color {
  @scala.inline
  def apply(
    copy: CallbackTo[Color],
    distance: Color => CallbackTo[Double],
    equals: Color => CallbackTo[Boolean],
    getAlpha: CallbackTo[Double],
    getCMYK: CallbackTo[CMYK],
    getChannels: CallbackTo[AnonA],
    getHSL: CallbackTo[HSL],
    getHSV: CallbackTo[HSV],
    getLAB: CallbackTo[LAB],
    getRGB: CallbackTo[RGB],
    getSpaces: CallbackTo[AnonCmyk],
    limit: Double => Callback,
    normalize: CallbackTo[Color],
    set: Boolean,
    setAlpha: Double => CallbackTo[Color],
    setCMYK: (Double, Double, Double, Double) => CallbackTo[Color],
    setHSL: (Double, Double, Double) => CallbackTo[Color],
    setHSV: (Double, Double, Double) => CallbackTo[Color],
    setLAB: (Double, Double, Double) => CallbackTo[Color],
    setRGB: (Double, Double, Double) => CallbackTo[Color],
    setSpaces: js.Any => CallbackTo[Color],
    toCSS: CallbackTo[String],
    toHEX: CallbackTo[String]
  ): Color = {
    val __obj = js.Dynamic.literal(set = set.asInstanceOf[js.Any])
    __obj.updateDynamic("copy")(copy.toJsFn)
    __obj.updateDynamic("distance")(js.Any.fromFunction1((t0: typingsJapgolly.jqueryColorpicker.JQueryColorpickerStatic.Color) => distance(t0).runNow()))
    __obj.updateDynamic("equals")(js.Any.fromFunction1((t0: typingsJapgolly.jqueryColorpicker.JQueryColorpickerStatic.Color) => equals(t0).runNow()))
    __obj.updateDynamic("getAlpha")(getAlpha.toJsFn)
    __obj.updateDynamic("getCMYK")(getCMYK.toJsFn)
    __obj.updateDynamic("getChannels")(getChannels.toJsFn)
    __obj.updateDynamic("getHSL")(getHSL.toJsFn)
    __obj.updateDynamic("getHSV")(getHSV.toJsFn)
    __obj.updateDynamic("getLAB")(getLAB.toJsFn)
    __obj.updateDynamic("getRGB")(getRGB.toJsFn)
    __obj.updateDynamic("getSpaces")(getSpaces.toJsFn)
    __obj.updateDynamic("limit")(js.Any.fromFunction1((t0: scala.Double) => limit(t0).runNow()))
    __obj.updateDynamic("normalize")(normalize.toJsFn)
    __obj.updateDynamic("setAlpha")(js.Any.fromFunction1((t0: scala.Double) => setAlpha(t0).runNow()))
    __obj.updateDynamic("setCMYK")(js.Any.fromFunction4((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: scala.Double) => setCMYK(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("setHSL")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => setHSL(t0, t1, t2).runNow()))
    __obj.updateDynamic("setHSV")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => setHSV(t0, t1, t2).runNow()))
    __obj.updateDynamic("setLAB")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => setLAB(t0, t1, t2).runNow()))
    __obj.updateDynamic("setRGB")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => setRGB(t0, t1, t2).runNow()))
    __obj.updateDynamic("setSpaces")(js.Any.fromFunction1((t0: js.Any) => setSpaces(t0).runNow()))
    __obj.updateDynamic("toCSS")(toCSS.toJsFn)
    __obj.updateDynamic("toHEX")(toHEX.toJsFn)
    __obj.asInstanceOf[Color]
  }
}

