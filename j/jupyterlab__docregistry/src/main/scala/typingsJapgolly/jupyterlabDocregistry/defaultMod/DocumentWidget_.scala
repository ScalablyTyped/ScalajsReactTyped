package typingsJapgolly.jupyterlabDocregistry.defaultMod

import typingsJapgolly.jupyterlabApputils.mod.MainAreaWidget
import typingsJapgolly.jupyterlabDocregistry.defaultMod.DocumentWidget.IOptions
import typingsJapgolly.jupyterlabDocregistry.registryMod.DocumentRegistry.IContext
import typingsJapgolly.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typingsJapgolly.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.phosphorDisposable.mod.IDisposable because Already inherited
- typingsJapgolly.phosphorMessaging.mod.IMessageHandler because Already inherited
- typingsJapgolly.phosphorDisposable.mod.IObservableDisposable because Already inherited
- typingsJapgolly.phosphorWidgets.widgetMod.Widget because Already inherited
- typingsJapgolly.phosphorWidgets.mod.Widget because Already inherited
- typingsJapgolly.jupyterlabDocregistry.registryMod.IDocumentWidget because var conflicts: _disposed, _flags, _layout, _parent, id, layout, parent. Inlined context, setFragment */ @JSImport("@jupyterlab/docregistry/lib/default", "DocumentWidget")
@js.native
class DocumentWidget_[T /* <: Widget */, U /* <: IModel */] protected () extends MainAreaWidget[T] {
  def this(options: IOptions[T, U]) = this()
  /**
    * Handle the dirty state of the context model.
    */
  var _handleDirtyState: js.Any = js.native
  /**
    * Handle a change to the context model state.
    */
  var _onModelStateChanged: js.Any = js.native
  /**
    * Handle a path change.
    */
  var _onPathChanged: js.Any = js.native
  val context: IContext[U] = js.native
  /**
    * Set URI fragment identifier.
    */
  def setFragment(fragment: String): Unit = js.native
}

