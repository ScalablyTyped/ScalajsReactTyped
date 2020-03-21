package typingsJapgolly.phosphorApplication.mod.Application

import typingsJapgolly.phosphorWidgets.menuMod.Menu.IRenderer
import typingsJapgolly.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for creating an application.
  */
trait IOptions[T /* <: Widget */] extends js.Object {
  /**
    * A custom renderer for the context menu.
    */
  var contextMenuRenderer: js.UndefOr[IRenderer] = js.undefined
  /**
    * The shell widget to use for the application.
    *
    * This should be a newly created and initialized widget.
    *
    * The application will attach the widget to the DOM.
    */
  var shell: T
}

object IOptions {
  @scala.inline
  def apply[T /* <: Widget */](shell: T, contextMenuRenderer: IRenderer = null): IOptions[T] = {
    val __obj = js.Dynamic.literal(shell = shell.asInstanceOf[js.Any])
    if (contextMenuRenderer != null) __obj.updateDynamic("contextMenuRenderer")(contextMenuRenderer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions[T]]
  }
}

