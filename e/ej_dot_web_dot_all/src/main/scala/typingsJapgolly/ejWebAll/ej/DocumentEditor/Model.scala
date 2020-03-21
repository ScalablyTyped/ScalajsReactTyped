package typingsJapgolly.ejWebAll.ej.DocumentEditor

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Gets or sets an object that indicates initialization of importing and exporting documents in document editor.
    */
  var importExportSettings: js.UndefOr[ImportExportSettings] = js.undefined
  /** Triggers when the document changes.
    */
  var onDocumentChange: js.UndefOr[js.Function1[/* e */ OnDocumentChangeEventArgs, Unit]] = js.undefined
  /** Triggers when the hyperlink is clicked.
    */
  var onRequestNavigate: js.UndefOr[js.Function1[/* e */ OnRequestNavigateEventArgs, Unit]] = js.undefined
  /** Triggers when the selection changes.
    */
  var onSelectionChange: js.UndefOr[js.Function1[/* e */ OnSelectionChangeEventArgs, Unit]] = js.undefined
  /** Triggers when the zoom factor changes.
    */
  var onZoomFactorChange: js.UndefOr[js.Function1[/* e */ OnZoomFactorChangeEventArgs, Unit]] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    importExportSettings: ImportExportSettings = null,
    onDocumentChange: /* e */ OnDocumentChangeEventArgs => Callback = null,
    onRequestNavigate: /* e */ OnRequestNavigateEventArgs => Callback = null,
    onSelectionChange: /* e */ OnSelectionChangeEventArgs => Callback = null,
    onZoomFactorChange: /* e */ OnZoomFactorChangeEventArgs => Callback = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (importExportSettings != null) __obj.updateDynamic("importExportSettings")(importExportSettings.asInstanceOf[js.Any])
    if (onDocumentChange != null) __obj.updateDynamic("onDocumentChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.DocumentEditor.OnDocumentChangeEventArgs) => onDocumentChange(t0).runNow()))
    if (onRequestNavigate != null) __obj.updateDynamic("onRequestNavigate")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.DocumentEditor.OnRequestNavigateEventArgs) => onRequestNavigate(t0).runNow()))
    if (onSelectionChange != null) __obj.updateDynamic("onSelectionChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.DocumentEditor.OnSelectionChangeEventArgs) => onSelectionChange(t0).runNow()))
    if (onZoomFactorChange != null) __obj.updateDynamic("onZoomFactorChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.DocumentEditor.OnZoomFactorChangeEventArgs) => onZoomFactorChange(t0).runNow()))
    __obj.asInstanceOf[Model]
  }
}

