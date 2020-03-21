package typingsJapgolly.resumablejs.Resumable

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResumableFile extends js.Object {
  /**
    * An array of ResumableChunk items. You shouldn't need to dig into these.
    **/
  var chunks: js.Array[ResumableChunk]
  /**
    * The correlating HTML5 File object.
    **/
  var file: File
  /**
    * The name of the file.
    **/
  var fileName: String
  /**
    * The relative path to the file (defaults to file name if relative path doesn't exist)
    **/
  var relativePath: String
  /**
    * A back-reference to the parent Resumable object.
    **/
  var resumableObj: typingsJapgolly.resumablejs.Resumable.Resumable
  /**
    * Size in bytes of the file.
    **/
  var size: Double
  /**
    * A unique identifier assigned to this file object. This value is included in uploads to the server for reference, but can also be used in CSS classes etc when building your upload UI.
    **/
  var uniqueIdentifier: String
  /**
    * Abort uploading the file.
    **/
  def abort(): Unit
  /**
    * Rebuild the state of a ResumableFile object, including reassigning chunks and XMLHttpRequest instances.
    **/
  def bootstrap(): Unit
  /**
    * Abort uploading the file and delete it from the list of files to upload.
    **/
  def cancel(): Unit
  /**
    * Returns a boolean indicating whether the file has completed uploading and received a server response.
    **/
  def isComplete(): Boolean
  /**
    * Returns a boolean indicating whether file chunks is uploading.
    **/
  def isUploading(): Boolean
  /**
    * Returns a float between 0 and 1 indicating the current upload progress of the file. If relative is true, the value is returned relative to all files in the Resumable.js instance.
    **/
  def progress(relative: Boolean): Double
  /**
    * Retry uploading the file.
    **/
  def retry(): Unit
}

object ResumableFile {
  @scala.inline
  def apply(
    abort: Callback,
    bootstrap: Callback,
    cancel: Callback,
    chunks: js.Array[ResumableChunk],
    file: File,
    fileName: String,
    isComplete: CallbackTo[Boolean],
    isUploading: CallbackTo[Boolean],
    progress: Boolean => CallbackTo[Double],
    relativePath: String,
    resumableObj: typingsJapgolly.resumablejs.Resumable.Resumable,
    retry: Callback,
    size: Double,
    uniqueIdentifier: String
  ): ResumableFile = {
    val __obj = js.Dynamic.literal(chunks = chunks.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], relativePath = relativePath.asInstanceOf[js.Any], resumableObj = resumableObj.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uniqueIdentifier = uniqueIdentifier.asInstanceOf[js.Any])
    __obj.updateDynamic("abort")(abort.toJsFn)
    __obj.updateDynamic("bootstrap")(bootstrap.toJsFn)
    __obj.updateDynamic("cancel")(cancel.toJsFn)
    __obj.updateDynamic("isComplete")(isComplete.toJsFn)
    __obj.updateDynamic("isUploading")(isUploading.toJsFn)
    __obj.updateDynamic("progress")(js.Any.fromFunction1((t0: scala.Boolean) => progress(t0).runNow()))
    __obj.updateDynamic("retry")(retry.toJsFn)
    __obj.asInstanceOf[ResumableFile]
  }
}

