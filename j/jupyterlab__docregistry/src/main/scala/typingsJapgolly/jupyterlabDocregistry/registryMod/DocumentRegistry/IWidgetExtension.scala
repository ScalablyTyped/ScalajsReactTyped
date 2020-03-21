package typingsJapgolly.jupyterlabDocregistry.registryMod.DocumentRegistry

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.phosphorDisposable.mod.IDisposable
import typingsJapgolly.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface for a widget extension.
  */
trait IWidgetExtension[T /* <: Widget */, U /* <: IModel */] extends js.Object {
  /**
    * Create a new extension for a given widget.
    */
  def createNew(widget: T, context: IContext[U]): IDisposable
}

object IWidgetExtension {
  @scala.inline
  def apply[T /* <: Widget */, U /* <: IModel */](createNew: (T, IContext[U]) => CallbackTo[IDisposable]): IWidgetExtension[T, U] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createNew")(js.Any.fromFunction2((t0: T, t1: typingsJapgolly.jupyterlabDocregistry.registryMod.DocumentRegistry.IContext[U]) => createNew(t0, t1).runNow()))
    __obj.asInstanceOf[IWidgetExtension[T, U]]
  }
}

