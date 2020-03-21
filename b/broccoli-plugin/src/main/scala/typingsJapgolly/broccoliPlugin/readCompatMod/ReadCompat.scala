package typingsJapgolly.broccoliPlugin.readCompatMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.broccoliNodeApi.mod.CallbackObject
import typingsJapgolly.broccoliNodeApi.mod.InputNode
import typingsJapgolly.broccoliNodeApi.mod.TransformNodeInfo
import typingsJapgolly.broccoliPlugin.interfacesMod.MapSeriesIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadCompat extends js.Object {
  var _priorBuildInputNodeOutputPaths: js.Any
  var cachePath: js.UndefOr[String] = js.undefined
  var callbackObject: CallbackObject
  var inputBasePath: String
  var inputPaths: js.Array[String]
  var outputPath: String
  var pluginInterface: TransformNodeInfo
  def cleanup(): Unit
  def read(readTree: MapSeriesIterator[InputNode]): js.Promise[String]
}

object ReadCompat {
  @scala.inline
  def apply(
    _priorBuildInputNodeOutputPaths: js.Any,
    callbackObject: CallbackObject,
    cleanup: Callback,
    inputBasePath: String,
    inputPaths: js.Array[String],
    outputPath: String,
    pluginInterface: TransformNodeInfo,
    read: MapSeriesIterator[InputNode] => CallbackTo[js.Promise[String]],
    cachePath: String = null
  ): ReadCompat = {
    val __obj = js.Dynamic.literal(_priorBuildInputNodeOutputPaths = _priorBuildInputNodeOutputPaths.asInstanceOf[js.Any], callbackObject = callbackObject.asInstanceOf[js.Any], inputBasePath = inputBasePath.asInstanceOf[js.Any], inputPaths = inputPaths.asInstanceOf[js.Any], outputPath = outputPath.asInstanceOf[js.Any], pluginInterface = pluginInterface.asInstanceOf[js.Any])
    __obj.updateDynamic("cleanup")(cleanup.toJsFn)
    __obj.updateDynamic("read")(js.Any.fromFunction1((t0: typingsJapgolly.broccoliPlugin.interfacesMod.MapSeriesIterator[typingsJapgolly.broccoliNodeApi.mod.InputNode]) => read(t0).runNow()))
    if (cachePath != null) __obj.updateDynamic("cachePath")(cachePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadCompat]
  }
}

