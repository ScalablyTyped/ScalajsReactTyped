package typingsJapgolly.jestWorker.typesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkerInterface extends js.Object {
  def getStderr(): ReadableStream | Null
  def getStdout(): ReadableStream | Null
  def getWorkerId(): Double
  def onExit(exitCode: Double): Unit
  def onMessage(message: ParentMessage): Unit
  def send(request: ChildMessage, onProcessStart: OnStart, onProcessEnd: OnEnd): Unit
}

object WorkerInterface {
  @scala.inline
  def apply(
    getStderr: CallbackTo[ReadableStream | Null],
    getStdout: CallbackTo[ReadableStream | Null],
    getWorkerId: CallbackTo[Double],
    onExit: Double => Callback,
    onMessage: ParentMessage => Callback,
    send: (ChildMessage, OnStart, OnEnd) => Callback
  ): WorkerInterface = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getStderr")(getStderr.toJsFn)
    __obj.updateDynamic("getStdout")(getStdout.toJsFn)
    __obj.updateDynamic("getWorkerId")(getWorkerId.toJsFn)
    __obj.updateDynamic("onExit")(js.Any.fromFunction1((t0: scala.Double) => onExit(t0).runNow()))
    __obj.updateDynamic("onMessage")(js.Any.fromFunction1((t0: typingsJapgolly.jestWorker.typesMod.ParentMessage) => onMessage(t0).runNow()))
    __obj.updateDynamic("send")(js.Any.fromFunction3((t0: typingsJapgolly.jestWorker.typesMod.ChildMessage, t1: typingsJapgolly.jestWorker.typesMod.OnStart, t2: typingsJapgolly.jestWorker.typesMod.OnEnd) => send(t0, t1, t2).runNow()))
    __obj.asInstanceOf[WorkerInterface]
  }
}

