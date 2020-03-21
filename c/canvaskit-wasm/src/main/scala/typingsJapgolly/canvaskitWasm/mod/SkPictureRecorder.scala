package typingsJapgolly.canvaskitWasm.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkPictureRecorder extends SkObject[SkPictureRecorder] {
  def beginRecording(rect: SkRect): SkCanvas
  def finishRecordingAsPicture(): SkPicture
}

object SkPictureRecorder {
  @scala.inline
  def apply(
    beginRecording: SkRect => CallbackTo[SkCanvas],
    delete: Callback,
    deleteAfter: Callback,
    finishRecordingAsPicture: CallbackTo[SkPicture],
    isAliasOf: js.Any => CallbackTo[Boolean],
    isDeleted: CallbackTo[Boolean]
  ): SkPictureRecorder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("beginRecording")(js.Any.fromFunction1((t0: typingsJapgolly.canvaskitWasm.mod.SkRect) => beginRecording(t0).runNow()))
    __obj.updateDynamic("delete")(delete.toJsFn)
    __obj.updateDynamic("deleteAfter")(deleteAfter.toJsFn)
    __obj.updateDynamic("finishRecordingAsPicture")(finishRecordingAsPicture.toJsFn)
    __obj.updateDynamic("isAliasOf")(js.Any.fromFunction1((t0: js.Any) => isAliasOf(t0).runNow()))
    __obj.updateDynamic("isDeleted")(isDeleted.toJsFn)
    __obj.asInstanceOf[SkPictureRecorder]
  }
}

