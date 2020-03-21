package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISimpleText extends js.Object {
  def charCodeAt(index: Double): Double
  def copyTo(sourceIndex: Double, destination: js.Array[Double], destinationIndex: Double, count: Double): Unit
  def length(): Double
  def lineMap(): LineMap
  def subText(span: TextSpan): ISimpleText
  def substr(start: Double, length: Double, intern: Boolean): String
}

object ISimpleText {
  @scala.inline
  def apply(
    charCodeAt: Double => CallbackTo[Double],
    copyTo: (Double, js.Array[Double], Double, Double) => Callback,
    length: CallbackTo[Double],
    lineMap: CallbackTo[LineMap],
    subText: TextSpan => CallbackTo[ISimpleText],
    substr: (Double, Double, Boolean) => CallbackTo[String]
  ): ISimpleText = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("charCodeAt")(js.Any.fromFunction1((t0: scala.Double) => charCodeAt(t0).runNow()))
    __obj.updateDynamic("copyTo")(js.Any.fromFunction4((t0: scala.Double, t1: js.Array[scala.Double], t2: scala.Double, t3: scala.Double) => copyTo(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("length")(length.toJsFn)
    __obj.updateDynamic("lineMap")(lineMap.toJsFn)
    __obj.updateDynamic("subText")(js.Any.fromFunction1((t0: typingsJapgolly.typescriptServices.TypeScript.TextSpan) => subText(t0).runNow()))
    __obj.updateDynamic("substr")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Boolean) => substr(t0, t1, t2).runNow()))
    __obj.asInstanceOf[ISimpleText]
  }
}

