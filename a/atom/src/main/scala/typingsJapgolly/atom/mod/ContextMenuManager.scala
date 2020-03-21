package typingsJapgolly.atom.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextMenuManager extends js.Object {
  /** Add context menu items scoped by CSS selectors. */
  def add(itemsBySelector: StringDictionary[js.Array[ContextMenuOptions]]): Disposable
}

object ContextMenuManager {
  @scala.inline
  def apply(add: StringDictionary[js.Array[ContextMenuOptions]] => CallbackTo[Disposable]): ContextMenuManager = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(js.Any.fromFunction1((t0: org.scalablytyped.runtime.StringDictionary[js.Array[typingsJapgolly.atom.mod.ContextMenuOptions]]) => add(t0).runNow()))
    __obj.asInstanceOf[ContextMenuManager]
  }
}

