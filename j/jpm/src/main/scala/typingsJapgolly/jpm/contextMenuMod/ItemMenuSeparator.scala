package typingsJapgolly.jpm.contextMenuMod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.experimental.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jpm.contextMenuMod.Item
  - typingsJapgolly.jpm.contextMenuMod.Menu
  - typingsJapgolly.jpm.contextMenuMod.Separator
*/
trait ItemMenuSeparator extends js.Object

object ItemMenuSeparator {
  @scala.inline
  def Item(
    context: ItemContext,
    data: js.Any,
    destroy: Callback,
    image: String | URL,
    label: String,
    contentScript: String | js.Array[String] = null,
    contentScriptFile: String | js.Array[String] = null,
    parentMenu: Menu = null
  ): ItemMenuSeparator = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    if (contentScript != null) __obj.updateDynamic("contentScript")(contentScript.asInstanceOf[js.Any])
    if (contentScriptFile != null) __obj.updateDynamic("contentScriptFile")(contentScriptFile.asInstanceOf[js.Any])
    if (parentMenu != null) __obj.updateDynamic("parentMenu")(parentMenu.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemMenuSeparator]
  }
  @scala.inline
  def Menu(
    addItem: ItemMenuSeparator => Callback,
    contentScript: String | js.Array[String],
    contentScriptFile: String | js.Array[String],
    context: ItemContext,
    destroy: Callback,
    image: String | URL,
    items: js.Array[ItemMenuSeparator],
    label: String,
    removeItem: ItemMenuSeparator => Callback,
    parentMenu: typingsJapgolly.jpm.contextMenuMod.Menu = null
  ): ItemMenuSeparator = {
    val __obj = js.Dynamic.literal(contentScript = contentScript.asInstanceOf[js.Any], contentScriptFile = contentScriptFile.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("addItem")(js.Any.fromFunction1((t0: typingsJapgolly.jpm.contextMenuMod.ItemMenuSeparator) => addItem(t0).runNow()))
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("removeItem")(js.Any.fromFunction1((t0: typingsJapgolly.jpm.contextMenuMod.ItemMenuSeparator) => removeItem(t0).runNow()))
    if (parentMenu != null) __obj.updateDynamic("parentMenu")(parentMenu.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemMenuSeparator]
  }
  @scala.inline
  def Separator(destroy: Callback, parentMenu: Menu): ItemMenuSeparator = {
    val __obj = js.Dynamic.literal(parentMenu = parentMenu.asInstanceOf[js.Any])
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.asInstanceOf[ItemMenuSeparator]
  }
}

