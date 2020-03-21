package typingsJapgolly.jupyterlabDocregistry.defaultMod.DocumentWidget

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.jupyterlabApputils.toolbarMod.Toolbar
import typingsJapgolly.jupyterlabDocregistry.registryMod.DocumentRegistry.IContext
import typingsJapgolly.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typingsJapgolly.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions[T /* <: Widget */, U /* <: IModel */]
  extends typingsJapgolly.jupyterlabApputils.mainareawidgetMod.MainAreaWidget.IOptions[T] {
  var context: IContext[U]
}

object IOptions {
  @scala.inline
  def apply[T /* <: Widget */, U /* <: IModel */](
    content: T,
    context: IContext[U],
    node: HTMLElement = null,
    reveal: js.Promise[_] = null,
    toolbar: Toolbar[Widget] = null
  ): IOptions[T, U] = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    if (reveal != null) __obj.updateDynamic("reveal")(reveal.asInstanceOf[js.Any])
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions[T, U]]
  }
}

