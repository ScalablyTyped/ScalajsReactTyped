package typingsJapgolly.autolinker

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnCloseTag extends js.Object {
  def onCloseTag(tagName: String, offset: Double): Unit
  def onComment(offset: Double): Unit
  def onDoctype(offset: Double): Unit
  def onOpenTag(tagName: String, offset: Double): Unit
  def onText(text: String, offset: Double): Unit
}

object AnonOnCloseTag {
  @scala.inline
  def apply(
    onCloseTag: (String, Double) => Callback,
    onComment: Double => Callback,
    onDoctype: Double => Callback,
    onOpenTag: (String, Double) => Callback,
    onText: (String, Double) => Callback
  ): AnonOnCloseTag = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onCloseTag")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => onCloseTag(t0, t1).runNow()))
    __obj.updateDynamic("onComment")(js.Any.fromFunction1((t0: scala.Double) => onComment(t0).runNow()))
    __obj.updateDynamic("onDoctype")(js.Any.fromFunction1((t0: scala.Double) => onDoctype(t0).runNow()))
    __obj.updateDynamic("onOpenTag")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => onOpenTag(t0, t1).runNow()))
    __obj.updateDynamic("onText")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => onText(t0, t1).runNow()))
    __obj.asInstanceOf[AnonOnCloseTag]
  }
}

