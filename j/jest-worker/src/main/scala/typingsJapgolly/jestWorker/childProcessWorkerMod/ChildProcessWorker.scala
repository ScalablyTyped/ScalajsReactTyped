package typingsJapgolly.jestWorker.childProcessWorkerMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jestWorker.typesMod.ChildMessage
import typingsJapgolly.jestWorker.typesMod.OnEnd
import typingsJapgolly.jestWorker.typesMod.OnStart
import typingsJapgolly.jestWorker.typesMod.ParentMessage
import typingsJapgolly.jestWorker.typesMod.WorkerInterface
import typingsJapgolly.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChildProcessWorker extends WorkerInterface {
  var _child: js.Any
  var _fakeStream: js.Any
  var _getFakeStream: js.Any
  var _onProcessEnd: js.Any
  var _options: js.Any
  var _request: js.Any
  var _retries: js.Any
  var _shutdown: js.Any
  var _stderr: js.Any
  var _stdout: js.Any
  def initialize(): Unit
}

object ChildProcessWorker {
  @scala.inline
  def apply(
    _child: js.Any,
    _fakeStream: js.Any,
    _getFakeStream: js.Any,
    _onProcessEnd: js.Any,
    _options: js.Any,
    _request: js.Any,
    _retries: js.Any,
    _shutdown: js.Any,
    _stderr: js.Any,
    _stdout: js.Any,
    getStderr: CallbackTo[ReadableStream | Null],
    getStdout: CallbackTo[ReadableStream | Null],
    getWorkerId: CallbackTo[Double],
    initialize: Callback,
    onExit: Double => Callback,
    onMessage: ParentMessage => Callback,
    send: (ChildMessage, OnStart, OnEnd) => Callback
  ): ChildProcessWorker = {
    val __obj = js.Dynamic.literal(_child = _child.asInstanceOf[js.Any], _fakeStream = _fakeStream.asInstanceOf[js.Any], _getFakeStream = _getFakeStream.asInstanceOf[js.Any], _onProcessEnd = _onProcessEnd.asInstanceOf[js.Any], _options = _options.asInstanceOf[js.Any], _request = _request.asInstanceOf[js.Any], _retries = _retries.asInstanceOf[js.Any], _shutdown = _shutdown.asInstanceOf[js.Any], _stderr = _stderr.asInstanceOf[js.Any], _stdout = _stdout.asInstanceOf[js.Any])
    __obj.updateDynamic("getStderr")(getStderr.toJsFn)
    __obj.updateDynamic("getStdout")(getStdout.toJsFn)
    __obj.updateDynamic("getWorkerId")(getWorkerId.toJsFn)
    __obj.updateDynamic("initialize")(initialize.toJsFn)
    __obj.updateDynamic("onExit")(js.Any.fromFunction1((t0: scala.Double) => onExit(t0).runNow()))
    __obj.updateDynamic("onMessage")(js.Any.fromFunction1((t0: typingsJapgolly.jestWorker.typesMod.ParentMessage) => onMessage(t0).runNow()))
    __obj.updateDynamic("send")(js.Any.fromFunction3((t0: typingsJapgolly.jestWorker.typesMod.ChildMessage, t1: typingsJapgolly.jestWorker.typesMod.OnStart, t2: typingsJapgolly.jestWorker.typesMod.OnEnd) => send(t0, t1, t2).runNow()))
    __obj.asInstanceOf[ChildProcessWorker]
  }
}

