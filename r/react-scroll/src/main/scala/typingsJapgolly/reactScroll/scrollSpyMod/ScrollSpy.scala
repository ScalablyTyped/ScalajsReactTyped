package typingsJapgolly.reactScroll.scrollSpyMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollSpy extends js.Object {
  var scrollSpyContainers: js.Array[_]
  var spyCallbacks: js.Array[_]
  var spySetState: js.Array[_]
  def addSpyHandler(handler: js.Any, scrollSpyContainer: js.Any): Unit
  def addStateHandler(handler: js.Any): Unit
  def currentPositionY(scrollSpyContainer: js.Any): Double
  def isMounted(scrollSpyContainer: js.Any): Boolean
  def mount(scrollSpyContainer: js.Any): Unit
  def scrollHandler(scrollSpyContainer: js.Any): Unit
  def unmount(stateHandler: js.Any, spyHandler: js.Any): Unit
  def update(): Unit
  def updateStates(): Unit
}

object ScrollSpy {
  @scala.inline
  def apply(
    addSpyHandler: (js.Any, js.Any) => Callback,
    addStateHandler: js.Any => Callback,
    currentPositionY: js.Any => CallbackTo[Double],
    isMounted: js.Any => CallbackTo[Boolean],
    mount: js.Any => Callback,
    scrollHandler: js.Any => Callback,
    scrollSpyContainers: js.Array[_],
    spyCallbacks: js.Array[_],
    spySetState: js.Array[_],
    unmount: (js.Any, js.Any) => Callback,
    update: Callback,
    updateStates: Callback
  ): ScrollSpy = {
    val __obj = js.Dynamic.literal(scrollSpyContainers = scrollSpyContainers.asInstanceOf[js.Any], spyCallbacks = spyCallbacks.asInstanceOf[js.Any], spySetState = spySetState.asInstanceOf[js.Any])
    __obj.updateDynamic("addSpyHandler")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => addSpyHandler(t0, t1).runNow()))
    __obj.updateDynamic("addStateHandler")(js.Any.fromFunction1((t0: js.Any) => addStateHandler(t0).runNow()))
    __obj.updateDynamic("currentPositionY")(js.Any.fromFunction1((t0: js.Any) => currentPositionY(t0).runNow()))
    __obj.updateDynamic("isMounted")(js.Any.fromFunction1((t0: js.Any) => isMounted(t0).runNow()))
    __obj.updateDynamic("mount")(js.Any.fromFunction1((t0: js.Any) => mount(t0).runNow()))
    __obj.updateDynamic("scrollHandler")(js.Any.fromFunction1((t0: js.Any) => scrollHandler(t0).runNow()))
    __obj.updateDynamic("unmount")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => unmount(t0, t1).runNow()))
    __obj.updateDynamic("update")(update.toJsFn)
    __obj.updateDynamic("updateStates")(updateStates.toJsFn)
    __obj.asInstanceOf[ScrollSpy]
  }
}

