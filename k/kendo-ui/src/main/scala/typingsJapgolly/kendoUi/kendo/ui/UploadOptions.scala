package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadOptions extends js.Object {
  var async: js.UndefOr[UploadAsync] = js.undefined
  var cancel: js.UndefOr[js.Function1[/* e */ UploadCancelEvent, Unit]] = js.undefined
  var clear: js.UndefOr[js.Function1[/* e */ UploadClearEvent, Unit]] = js.undefined
  var complete: js.UndefOr[js.Function1[/* e */ UploadEvent, Unit]] = js.undefined
  var directory: js.UndefOr[Boolean] = js.undefined
  var directoryDrop: js.UndefOr[Boolean] = js.undefined
  var dropZone: js.UndefOr[String] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var error: js.UndefOr[js.Function1[/* e */ UploadErrorEvent, Unit]] = js.undefined
  var files: js.UndefOr[js.Array[UploadFile]] = js.undefined
  var localization: js.UndefOr[UploadLocalization] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var pause: js.UndefOr[js.Function1[/* e */ UploadPauseEvent, Unit]] = js.undefined
  var progress: js.UndefOr[js.Function1[/* e */ UploadProgressEvent, Unit]] = js.undefined
  var remove: js.UndefOr[js.Function1[/* e */ UploadRemoveEvent, Unit]] = js.undefined
  var resume: js.UndefOr[js.Function1[/* e */ UploadEvent, Unit]] = js.undefined
  var select: js.UndefOr[js.Function1[/* e */ UploadSelectEvent, Unit]] = js.undefined
  var showFileList: js.UndefOr[Boolean] = js.undefined
  var success: js.UndefOr[js.Function1[/* e */ UploadSuccessEvent, Unit]] = js.undefined
  var template: js.UndefOr[String | js.Function] = js.undefined
  var upload: js.UndefOr[js.Function1[/* e */ UploadUploadEvent, Unit]] = js.undefined
  var validation: js.UndefOr[UploadValidation] = js.undefined
}

object UploadOptions {
  @scala.inline
  def apply(
    async: UploadAsync = null,
    cancel: /* e */ UploadCancelEvent => Callback = null,
    clear: /* e */ UploadClearEvent => Callback = null,
    complete: /* e */ UploadEvent => Callback = null,
    directory: js.UndefOr[Boolean] = js.undefined,
    directoryDrop: js.UndefOr[Boolean] = js.undefined,
    dropZone: String = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    error: /* e */ UploadErrorEvent => Callback = null,
    files: js.Array[UploadFile] = null,
    localization: UploadLocalization = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    pause: /* e */ UploadPauseEvent => Callback = null,
    progress: /* e */ UploadProgressEvent => Callback = null,
    remove: /* e */ UploadRemoveEvent => Callback = null,
    resume: /* e */ UploadEvent => Callback = null,
    select: /* e */ UploadSelectEvent => Callback = null,
    showFileList: js.UndefOr[Boolean] = js.undefined,
    success: /* e */ UploadSuccessEvent => Callback = null,
    template: String | js.Function = null,
    upload: /* e */ UploadUploadEvent => Callback = null,
    validation: UploadValidation = null
  ): UploadOptions = {
    val __obj = js.Dynamic.literal()
    if (async != null) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.UploadCancelEvent) => cancel(t0).runNow()))
    if (clear != null) __obj.updateDynamic("clear")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.UploadClearEvent) => clear(t0).runNow()))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.UploadEvent) => complete(t0).runNow()))
    if (!js.isUndefined(directory)) __obj.updateDynamic("directory")(directory.asInstanceOf[js.Any])
    if (!js.isUndefined(directoryDrop)) __obj.updateDynamic("directoryDrop")(directoryDrop.asInstanceOf[js.Any])
    if (dropZone != null) __obj.updateDynamic("dropZone")(dropZone.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.UploadErrorEvent) => error(t0).runNow()))
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (localization != null) __obj.updateDynamic("localization")(localization.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (pause != null) __obj.updateDynamic("pause")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.UploadPauseEvent) => pause(t0).runNow()))
    if (progress != null) __obj.updateDynamic("progress")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.UploadProgressEvent) => progress(t0).runNow()))
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.UploadRemoveEvent) => remove(t0).runNow()))
    if (resume != null) __obj.updateDynamic("resume")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.UploadEvent) => resume(t0).runNow()))
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.UploadSelectEvent) => select(t0).runNow()))
    if (!js.isUndefined(showFileList)) __obj.updateDynamic("showFileList")(showFileList.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.UploadSuccessEvent) => success(t0).runNow()))
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (upload != null) __obj.updateDynamic("upload")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.UploadUploadEvent) => upload(t0).runNow()))
    if (validation != null) __obj.updateDynamic("validation")(validation.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadOptions]
  }
}

