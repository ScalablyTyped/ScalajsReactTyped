package typingsJapgolly.edtrIoMathquill.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MathField extends js.Object {
  def blur(): MQ
  def clearSelection(): MQ
  def cmd(latex: String): MQ
  def config(config: Config): MQ
  def focus(): MQ
  def keystroke(keys: String): MQ
  def moveToDirEnd(direction: Double): MQ
  def moveToLeftEnd(): MQ
  def moveToRightEnd(): MQ
  def select(): MQ
  def typedText(text: String): MQ
  def write(latex: String): MQ
}

object MathField {
  @scala.inline
  def apply(
    blur: CallbackTo[MQ],
    clearSelection: CallbackTo[MQ],
    cmd: String => CallbackTo[MQ],
    config: Config => CallbackTo[MQ],
    focus: CallbackTo[MQ],
    keystroke: String => CallbackTo[MQ],
    moveToDirEnd: Double => CallbackTo[MQ],
    moveToLeftEnd: CallbackTo[MQ],
    moveToRightEnd: CallbackTo[MQ],
    select: CallbackTo[MQ],
    typedText: String => CallbackTo[MQ],
    write: String => CallbackTo[MQ]
  ): MathField = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("blur")(blur.toJsFn)
    __obj.updateDynamic("clearSelection")(clearSelection.toJsFn)
    __obj.updateDynamic("cmd")(js.Any.fromFunction1((t0: java.lang.String) => cmd(t0).runNow()))
    __obj.updateDynamic("config")(js.Any.fromFunction1((t0: typingsJapgolly.edtrIoMathquill.mod.Config) => config(t0).runNow()))
    __obj.updateDynamic("focus")(focus.toJsFn)
    __obj.updateDynamic("keystroke")(js.Any.fromFunction1((t0: java.lang.String) => keystroke(t0).runNow()))
    __obj.updateDynamic("moveToDirEnd")(js.Any.fromFunction1((t0: scala.Double) => moveToDirEnd(t0).runNow()))
    __obj.updateDynamic("moveToLeftEnd")(moveToLeftEnd.toJsFn)
    __obj.updateDynamic("moveToRightEnd")(moveToRightEnd.toJsFn)
    __obj.updateDynamic("select")(select.toJsFn)
    __obj.updateDynamic("typedText")(js.Any.fromFunction1((t0: java.lang.String) => typedText(t0).runNow()))
    __obj.updateDynamic("write")(js.Any.fromFunction1((t0: java.lang.String) => write(t0).runNow()))
    __obj.asInstanceOf[MathField]
  }
}

