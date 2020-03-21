package typingsJapgolly.jupyterlabCsvviewer.widgetMod.CSVDocumentWidget

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.jupyterlabApputils.toolbarMod.Toolbar
import typingsJapgolly.jupyterlabCsvviewer.widgetMod.CSVViewer
import typingsJapgolly.jupyterlabDocregistry.defaultMod.DocumentWidget.IOptionsOptionalContent
import typingsJapgolly.jupyterlabDocregistry.registryMod.DocumentRegistry.IContext
import typingsJapgolly.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typingsJapgolly.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions extends IOptionsOptionalContent[CSVViewer, IModel] {
  var delimiter: js.UndefOr[String] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    context: IContext[IModel],
    content: CSVViewer = null,
    delimiter: String = null,
    node: HTMLElement = null,
    reveal: js.Promise[_] = null,
    toolbar: Toolbar[Widget] = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    if (reveal != null) __obj.updateDynamic("reveal")(reveal.asInstanceOf[js.Any])
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

