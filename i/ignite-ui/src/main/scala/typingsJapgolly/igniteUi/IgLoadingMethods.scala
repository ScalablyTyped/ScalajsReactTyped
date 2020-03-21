package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgLoadingMethods extends js.Object {
  def destroy(): Unit
  def hide(): Unit
  def indicator(): Unit
  def indicatorElement(): Unit
  def refreshPos(): Unit
  def show(refresh: js.Object): Unit
}

object IgLoadingMethods {
  @scala.inline
  def apply(
    destroy: Callback,
    hide: Callback,
    indicator: Callback,
    indicatorElement: Callback,
    refreshPos: Callback,
    show: js.Object => Callback
  ): IgLoadingMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("hide")(hide.toJsFn)
    __obj.updateDynamic("indicator")(indicator.toJsFn)
    __obj.updateDynamic("indicatorElement")(indicatorElement.toJsFn)
    __obj.updateDynamic("refreshPos")(refreshPos.toJsFn)
    __obj.updateDynamic("show")(js.Any.fromFunction1((t0: js.Object) => show(t0).runNow()))
    __obj.asInstanceOf[IgLoadingMethods]
  }
}

