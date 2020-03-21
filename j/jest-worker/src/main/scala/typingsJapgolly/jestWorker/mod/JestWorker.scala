package typingsJapgolly.jestWorker.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JestWorker extends js.Object {
  var _bindExposedWorkerMethods: js.Any
  var _callFunctionWithArgs: js.Any
  var _ending: js.Any
  var _farm: js.Any
  var _options: js.Any
  var _workerPool: js.Any
  def end(): Unit
  def getStderr(): ReadableStream
  def getStdout(): ReadableStream
}

object JestWorker {
  @scala.inline
  def apply(
    _bindExposedWorkerMethods: js.Any,
    _callFunctionWithArgs: js.Any,
    _ending: js.Any,
    _farm: js.Any,
    _options: js.Any,
    _workerPool: js.Any,
    end: Callback,
    getStderr: CallbackTo[ReadableStream],
    getStdout: CallbackTo[ReadableStream]
  ): JestWorker = {
    val __obj = js.Dynamic.literal(_bindExposedWorkerMethods = _bindExposedWorkerMethods.asInstanceOf[js.Any], _callFunctionWithArgs = _callFunctionWithArgs.asInstanceOf[js.Any], _ending = _ending.asInstanceOf[js.Any], _farm = _farm.asInstanceOf[js.Any], _options = _options.asInstanceOf[js.Any], _workerPool = _workerPool.asInstanceOf[js.Any])
    __obj.updateDynamic("end")(end.toJsFn)
    __obj.updateDynamic("getStderr")(getStderr.toJsFn)
    __obj.updateDynamic("getStdout")(getStdout.toJsFn)
    __obj.asInstanceOf[JestWorker]
  }
}

