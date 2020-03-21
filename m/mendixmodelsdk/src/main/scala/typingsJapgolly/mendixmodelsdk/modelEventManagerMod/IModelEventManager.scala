package typingsJapgolly.mendixmodelsdk.modelEventManagerMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.mendixmodelsdk.commonMod.common.IErrorCallback
import typingsJapgolly.mendixmodelsdk.commonMod.common.IVoidCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IModelEventManager extends js.Object {
  def loadUnitCompleted(eventId: Double, callback: IVoidCallback, errorCallback: IErrorCallback): Unit
  def loadUnitStarted(): Unit
  def onEventProcessed(callback: IVoidCallback): Unit
  def onFileChangesReceived(callback: js.Function1[/* files */ js.Array[String], Unit]): Unit
  def start(): Unit
  def stop(): Unit
}

object IModelEventManager {
  @scala.inline
  def apply(
    loadUnitCompleted: (Double, IVoidCallback, IErrorCallback) => Callback,
    loadUnitStarted: Callback,
    onEventProcessed: IVoidCallback => Callback,
    onFileChangesReceived: js.Function1[/* files */ js.Array[String], Unit] => Callback,
    start: Callback,
    stop: Callback
  ): IModelEventManager = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("loadUnitCompleted")(js.Any.fromFunction3((t0: scala.Double, t1: typingsJapgolly.mendixmodelsdk.commonMod.common.IVoidCallback, t2: typingsJapgolly.mendixmodelsdk.commonMod.common.IErrorCallback) => loadUnitCompleted(t0, t1, t2).runNow()))
    __obj.updateDynamic("loadUnitStarted")(loadUnitStarted.toJsFn)
    __obj.updateDynamic("onEventProcessed")(js.Any.fromFunction1((t0: typingsJapgolly.mendixmodelsdk.commonMod.common.IVoidCallback) => onEventProcessed(t0).runNow()))
    __obj.updateDynamic("onFileChangesReceived")(js.Any.fromFunction1((t0: js.Function1[/* files */ js.Array[java.lang.String], scala.Unit]) => onFileChangesReceived(t0).runNow()))
    __obj.updateDynamic("start")(start.toJsFn)
    __obj.updateDynamic("stop")(stop.toJsFn)
    __obj.asInstanceOf[IModelEventManager]
  }
}

