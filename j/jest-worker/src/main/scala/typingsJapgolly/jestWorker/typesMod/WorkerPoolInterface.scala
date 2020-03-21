package typingsJapgolly.jestWorker.typesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkerPoolInterface extends js.Object {
  def createWorker(options: WorkerOptions): WorkerInterface
  def end(): Unit
  def getStderr(): ReadableStream
  def getStdout(): ReadableStream
  def getWorkers(): js.Array[WorkerInterface]
  def send(workerId: Double, request: ChildMessage, onStart: OnStart, onEnd: OnEnd): Unit
}

object WorkerPoolInterface {
  @scala.inline
  def apply(
    createWorker: WorkerOptions => CallbackTo[WorkerInterface],
    end: Callback,
    getStderr: CallbackTo[ReadableStream],
    getStdout: CallbackTo[ReadableStream],
    getWorkers: CallbackTo[js.Array[WorkerInterface]],
    send: (Double, ChildMessage, OnStart, OnEnd) => Callback
  ): WorkerPoolInterface = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createWorker")(js.Any.fromFunction1((t0: typingsJapgolly.jestWorker.typesMod.WorkerOptions) => createWorker(t0).runNow()))
    __obj.updateDynamic("end")(end.toJsFn)
    __obj.updateDynamic("getStderr")(getStderr.toJsFn)
    __obj.updateDynamic("getStdout")(getStdout.toJsFn)
    __obj.updateDynamic("getWorkers")(getWorkers.toJsFn)
    __obj.updateDynamic("send")(js.Any.fromFunction4((t0: scala.Double, t1: typingsJapgolly.jestWorker.typesMod.ChildMessage, t2: typingsJapgolly.jestWorker.typesMod.OnStart, t3: typingsJapgolly.jestWorker.typesMod.OnEnd) => send(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[WorkerPoolInterface]
  }
}

