package typingsJapgolly.jupyterlabCompleter.widgetMod.Completer

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLLIElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A renderer for completer widget nodes.
  */
trait IRenderer extends js.Object {
  /**
    * Create an item node (an `li` element) for a text completer menu.
    */
  def createItemNode(item: IItem, typeMap: TypeMap, orderedTypes: js.Array[String]): HTMLLIElement
}

object IRenderer {
  @scala.inline
  def apply(createItemNode: (IItem, TypeMap, js.Array[String]) => CallbackTo[HTMLLIElement]): IRenderer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createItemNode")(js.Any.fromFunction3((t0: typingsJapgolly.jupyterlabCompleter.widgetMod.Completer.IItem, t1: typingsJapgolly.jupyterlabCompleter.widgetMod.Completer.TypeMap, t2: js.Array[java.lang.String]) => createItemNode(t0, t1, t2).runNow()))
    __obj.asInstanceOf[IRenderer]
  }
}

