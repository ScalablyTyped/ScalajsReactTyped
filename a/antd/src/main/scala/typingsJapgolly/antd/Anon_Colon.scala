package typingsJapgolly.antd

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.raw.HTMLFormElement
import typingsJapgolly.antd.antdStrings.`inline`
import typingsJapgolly.antd.antdStrings.horizontal
import typingsJapgolly.antd.antdStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Colon extends js.Object {
  var colon: Boolean
  var hideRequiredMark: Boolean
  var layout: `inline` | horizontal | vertical
  def onSubmit(e: ReactEventFrom[HTMLFormElement]): Unit
}

object Anon_Colon {
  @scala.inline
  def apply(
    colon: Boolean,
    hideRequiredMark: Boolean,
    layout: `inline` | horizontal | vertical,
    onSubmit: ReactEventFrom[HTMLFormElement] => Callback
  ): Anon_Colon = {
    val __obj = js.Dynamic.literal(colon = colon.asInstanceOf[js.Any], hideRequiredMark = hideRequiredMark.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any])
    __obj.updateDynamic("onSubmit")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLFormElement]) => onSubmit(t0).runNow()))
    __obj.asInstanceOf[Anon_Colon]
  }
}

