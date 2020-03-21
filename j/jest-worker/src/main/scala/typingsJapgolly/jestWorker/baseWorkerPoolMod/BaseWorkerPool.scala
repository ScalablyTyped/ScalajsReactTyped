package typingsJapgolly.jestWorker.baseWorkerPoolMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jestWorker.typesMod.WorkerInterface
import typingsJapgolly.jestWorker.typesMod.WorkerOptions
import typingsJapgolly.jestWorker.typesMod.WorkerPoolOptions
import typingsJapgolly.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseWorkerPool extends js.Object {
  val _options: WorkerPoolOptions
  val _stderr: js.Any
  val _stdout: js.Any
  val _workers: js.Any
  def createWorker(_workerOptions: WorkerOptions): WorkerInterface
  def end(): Unit
  def getStderr(): ReadableStream
  def getStdout(): ReadableStream
  def getWorkerById(workerId: Double): WorkerInterface
  def getWorkers(): js.Array[WorkerInterface]
}

object BaseWorkerPool {
  @scala.inline
  def apply(
    _options: WorkerPoolOptions,
    _stderr: js.Any,
    _stdout: js.Any,
    _workers: js.Any,
    createWorker: WorkerOptions => CallbackTo[WorkerInterface],
    end: Callback,
    getStderr: CallbackTo[ReadableStream],
    getStdout: CallbackTo[ReadableStream],
    getWorkerById: Double => CallbackTo[WorkerInterface],
    getWorkers: CallbackTo[js.Array[WorkerInterface]]
  ): BaseWorkerPool = {
    val __obj = js.Dynamic.literal(_options = _options.asInstanceOf[js.Any], _stderr = _stderr.asInstanceOf[js.Any], _stdout = _stdout.asInstanceOf[js.Any], _workers = _workers.asInstanceOf[js.Any])
    __obj.updateDynamic("createWorker")(js.Any.fromFunction1((t0: typingsJapgolly.jestWorker.typesMod.WorkerOptions) => createWorker(t0).runNow()))
    __obj.updateDynamic("end")(end.toJsFn)
    __obj.updateDynamic("getStderr")(getStderr.toJsFn)
    __obj.updateDynamic("getStdout")(getStdout.toJsFn)
    __obj.updateDynamic("getWorkerById")(js.Any.fromFunction1((t0: scala.Double) => getWorkerById(t0).runNow()))
    __obj.updateDynamic("getWorkers")(getWorkers.toJsFn)
    __obj.asInstanceOf[BaseWorkerPool]
  }
}

