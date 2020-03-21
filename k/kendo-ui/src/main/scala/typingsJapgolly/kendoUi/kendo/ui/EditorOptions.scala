package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorOptions extends js.Object {
  var change: js.UndefOr[js.Function1[/* e */ EditorEvent, Unit]] = js.undefined
  var deserialization: js.UndefOr[EditorDeserialization] = js.undefined
  var domain: js.UndefOr[String] = js.undefined
  var encoded: js.UndefOr[Boolean] = js.undefined
  var execute: js.UndefOr[js.Function1[/* e */ EditorExecuteEvent, Unit]] = js.undefined
  var fileBrowser: js.UndefOr[EditorFileBrowser] = js.undefined
  var imageBrowser: js.UndefOr[EditorImageBrowser] = js.undefined
  var immutables: js.UndefOr[Boolean | EditorImmutables] = js.undefined
  var keydown: js.UndefOr[js.Function1[/* e */ EditorEvent, Unit]] = js.undefined
  var keyup: js.UndefOr[js.Function1[/* e */ EditorEvent, Unit]] = js.undefined
  var messages: js.UndefOr[EditorMessages] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var paste: js.UndefOr[js.Function1[/* e */ EditorPasteEvent, Unit]] = js.undefined
  var pasteCleanup: js.UndefOr[EditorPasteCleanup] = js.undefined
  var pdf: js.UndefOr[EditorPdf] = js.undefined
  var pdfExport: js.UndefOr[js.Function1[/* e */ EditorPdfExportEvent, Unit]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var resizable: js.UndefOr[Boolean | EditorResizable] = js.undefined
  var select: js.UndefOr[js.Function1[/* e */ EditorEvent, Unit]] = js.undefined
  var serialization: js.UndefOr[EditorSerialization] = js.undefined
  var stylesheets: js.UndefOr[js.Any] = js.undefined
  var tools: js.UndefOr[js.Array[EditorTool | String]] = js.undefined
}

object EditorOptions {
  @scala.inline
  def apply(
    change: /* e */ EditorEvent => Callback = null,
    deserialization: EditorDeserialization = null,
    domain: String = null,
    encoded: js.UndefOr[Boolean] = js.undefined,
    execute: /* e */ EditorExecuteEvent => Callback = null,
    fileBrowser: EditorFileBrowser = null,
    imageBrowser: EditorImageBrowser = null,
    immutables: Boolean | EditorImmutables = null,
    keydown: /* e */ EditorEvent => Callback = null,
    keyup: /* e */ EditorEvent => Callback = null,
    messages: EditorMessages = null,
    name: String = null,
    paste: /* e */ EditorPasteEvent => Callback = null,
    pasteCleanup: EditorPasteCleanup = null,
    pdf: EditorPdf = null,
    pdfExport: /* e */ EditorPdfExportEvent => Callback = null,
    placeholder: String = null,
    resizable: Boolean | EditorResizable = null,
    select: /* e */ EditorEvent => Callback = null,
    serialization: EditorSerialization = null,
    stylesheets: js.Any = null,
    tools: js.Array[EditorTool | String] = null
  ): EditorOptions = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.EditorEvent) => change(t0).runNow()))
    if (deserialization != null) __obj.updateDynamic("deserialization")(deserialization.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (!js.isUndefined(encoded)) __obj.updateDynamic("encoded")(encoded.asInstanceOf[js.Any])
    if (execute != null) __obj.updateDynamic("execute")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.EditorExecuteEvent) => execute(t0).runNow()))
    if (fileBrowser != null) __obj.updateDynamic("fileBrowser")(fileBrowser.asInstanceOf[js.Any])
    if (imageBrowser != null) __obj.updateDynamic("imageBrowser")(imageBrowser.asInstanceOf[js.Any])
    if (immutables != null) __obj.updateDynamic("immutables")(immutables.asInstanceOf[js.Any])
    if (keydown != null) __obj.updateDynamic("keydown")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.EditorEvent) => keydown(t0).runNow()))
    if (keyup != null) __obj.updateDynamic("keyup")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.EditorEvent) => keyup(t0).runNow()))
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (paste != null) __obj.updateDynamic("paste")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.EditorPasteEvent) => paste(t0).runNow()))
    if (pasteCleanup != null) __obj.updateDynamic("pasteCleanup")(pasteCleanup.asInstanceOf[js.Any])
    if (pdf != null) __obj.updateDynamic("pdf")(pdf.asInstanceOf[js.Any])
    if (pdfExport != null) __obj.updateDynamic("pdfExport")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.EditorPdfExportEvent) => pdfExport(t0).runNow()))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (resizable != null) __obj.updateDynamic("resizable")(resizable.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.EditorEvent) => select(t0).runNow()))
    if (serialization != null) __obj.updateDynamic("serialization")(serialization.asInstanceOf[js.Any])
    if (stylesheets != null) __obj.updateDynamic("stylesheets")(stylesheets.asInstanceOf[js.Any])
    if (tools != null) __obj.updateDynamic("tools")(tools.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorOptions]
  }
}

