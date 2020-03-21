package typingsJapgolly.sigmajs.SigmaJs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Renderer extends js.Object {
  var container: HTMLElement
  def refresh(): Sigma
  def render(): Sigma
  def resize(): Sigma
  def settings(settings: Settings): Unit
}

object Renderer {
  @scala.inline
  def apply(
    container: HTMLElement,
    refresh: CallbackTo[Sigma],
    render: CallbackTo[Sigma],
    resize: CallbackTo[Sigma],
    settings: Settings => Callback
  ): Renderer = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    __obj.updateDynamic("refresh")(refresh.toJsFn)
    __obj.updateDynamic("render")(render.toJsFn)
    __obj.updateDynamic("resize")(resize.toJsFn)
    __obj.updateDynamic("settings")(js.Any.fromFunction1((t0: typingsJapgolly.sigmajs.SigmaJs.Settings) => settings(t0).runNow()))
    __obj.asInstanceOf[Renderer]
  }
}

