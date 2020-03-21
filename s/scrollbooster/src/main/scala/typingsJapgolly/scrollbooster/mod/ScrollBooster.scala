package typingsJapgolly.scrollbooster.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.scrollbooster.PartialScrollBoosterOptio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollBooster extends js.Object {
  def destroy(): Unit
  def getState(): ScrollingState
  def scrollTo(position: Position): Unit
  def setPosition(position: Position): Unit
  def updateMetrics(): Unit
  def updateOptions(options: PartialScrollBoosterOptio): Unit
}

object ScrollBooster {
  @scala.inline
  def apply(
    destroy: Callback,
    getState: CallbackTo[ScrollingState],
    scrollTo: Position => Callback,
    setPosition: Position => Callback,
    updateMetrics: Callback,
    updateOptions: PartialScrollBoosterOptio => Callback
  ): ScrollBooster = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("getState")(getState.toJsFn)
    __obj.updateDynamic("scrollTo")(js.Any.fromFunction1((t0: typingsJapgolly.scrollbooster.mod.Position) => scrollTo(t0).runNow()))
    __obj.updateDynamic("setPosition")(js.Any.fromFunction1((t0: typingsJapgolly.scrollbooster.mod.Position) => setPosition(t0).runNow()))
    __obj.updateDynamic("updateMetrics")(updateMetrics.toJsFn)
    __obj.updateDynamic("updateOptions")(js.Any.fromFunction1((t0: typingsJapgolly.scrollbooster.PartialScrollBoosterOptio) => updateOptions(t0).runNow()))
    __obj.asInstanceOf[ScrollBooster]
  }
}

