package typingsJapgolly.jupyterlabDocregistry.registryMod.DocumentRegistry

import typingsJapgolly.jupyterlabDocregistry.registryMod.IDocumentWidget
import typingsJapgolly.phosphorDisposable.mod.IDisposable
import typingsJapgolly.phosphorSignaling.mod.ISignal
import typingsJapgolly.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface for a widget factory.
  */
@js.native
trait IWidgetFactory[T /* <: IDocumentWidget[Widget, IModel] */, U /* <: IModel */]
  extends IDisposable
     with IWidgetFactoryOptions[Widget] {
  /**
    * A signal emitted when a new widget is created.
    */
  var widgetCreated: ISignal[IWidgetFactory[T, U], T] = js.native
  /**
    * Create a new widget given a context.
    *
    * @param source - A widget to clone
    *
    * #### Notes
    * It should emit the [widgetCreated] signal with the new widget.
    */
  def createNew(context: IContext[U]): T = js.native
  def createNew(context: IContext[U], source: T): T = js.native
}

