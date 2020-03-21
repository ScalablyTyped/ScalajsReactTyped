package typingsJapgolly.jupyterlabDocmanager.managerMod.DocumentManager

import typingsJapgolly.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typingsJapgolly.jupyterlabDocregistry.registryMod.DocumentRegistry.IOpenOptions
import typingsJapgolly.jupyterlabDocregistry.registryMod.IDocumentWidget
import typingsJapgolly.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface for a widget opener.
  */
@js.native
trait IWidgetOpener extends js.Object {
  /**
    * Open the given widget.
    */
  def open(widget: IDocumentWidget[Widget, IModel]): Unit = js.native
  def open(widget: IDocumentWidget[Widget, IModel], options: IOpenOptions): Unit = js.native
}

