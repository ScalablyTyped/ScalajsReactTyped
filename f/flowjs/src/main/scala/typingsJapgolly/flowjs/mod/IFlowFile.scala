package typingsJapgolly.flowjs.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFlowFile extends js.Object {
  var averageSpeed: Double
  var chunks: js.Array[_]
  var currentSpeed: Double
  var error: Boolean
  var file: File
  var flowObj: IFlow
  var name: String
  var paused: Boolean
  var relativePath: String
  var size: Double
  var uniqueIdentifier: String
  def bootstrap(): Unit
  def cancel(): Unit
  def getExtension(): String
  def getType(): String
  def isComplete(): Boolean
  def isUploading(): Boolean
  def pause(): Unit
  def progress(relative: Boolean): Double
  def resume(): Unit
  def retry(): Unit
  def sizeUploaded(): Double
  def timeRemaining(): Double
}

object IFlowFile {
  @scala.inline
  def apply(
    averageSpeed: Double,
    bootstrap: Callback,
    cancel: Callback,
    chunks: js.Array[_],
    currentSpeed: Double,
    error: Boolean,
    file: File,
    flowObj: IFlow,
    getExtension: CallbackTo[String],
    getType: CallbackTo[String],
    isComplete: CallbackTo[Boolean],
    isUploading: CallbackTo[Boolean],
    name: String,
    pause: Callback,
    paused: Boolean,
    progress: Boolean => CallbackTo[Double],
    relativePath: String,
    resume: Callback,
    retry: Callback,
    size: Double,
    sizeUploaded: CallbackTo[Double],
    timeRemaining: CallbackTo[Double],
    uniqueIdentifier: String
  ): IFlowFile = {
    val __obj = js.Dynamic.literal(averageSpeed = averageSpeed.asInstanceOf[js.Any], chunks = chunks.asInstanceOf[js.Any], currentSpeed = currentSpeed.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], flowObj = flowObj.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], relativePath = relativePath.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uniqueIdentifier = uniqueIdentifier.asInstanceOf[js.Any])
    __obj.updateDynamic("bootstrap")(bootstrap.toJsFn)
    __obj.updateDynamic("cancel")(cancel.toJsFn)
    __obj.updateDynamic("getExtension")(getExtension.toJsFn)
    __obj.updateDynamic("getType")(getType.toJsFn)
    __obj.updateDynamic("isComplete")(isComplete.toJsFn)
    __obj.updateDynamic("isUploading")(isUploading.toJsFn)
    __obj.updateDynamic("pause")(pause.toJsFn)
    __obj.updateDynamic("progress")(js.Any.fromFunction1((t0: scala.Boolean) => progress(t0).runNow()))
    __obj.updateDynamic("resume")(resume.toJsFn)
    __obj.updateDynamic("retry")(retry.toJsFn)
    __obj.updateDynamic("sizeUploaded")(sizeUploaded.toJsFn)
    __obj.updateDynamic("timeRemaining")(timeRemaining.toJsFn)
    __obj.asInstanceOf[IFlowFile]
  }
}

