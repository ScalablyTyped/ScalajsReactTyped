package typingsJapgolly.rollupPluginutils.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.estreeWalker.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachedScope extends js.Object {
  var declarations: StringDictionary[Boolean]
  var isBlockScope: Boolean
  var parent: js.UndefOr[AttachedScope] = js.undefined
  def addDeclaration(node: Node, isBlockDeclaration: Boolean, isVar: Boolean): Unit
  def contains(name: String): Boolean
}

object AttachedScope {
  @scala.inline
  def apply(
    addDeclaration: (Node, Boolean, Boolean) => Callback,
    contains: String => CallbackTo[Boolean],
    declarations: StringDictionary[Boolean],
    isBlockScope: Boolean,
    parent: AttachedScope = null
  ): AttachedScope = {
    val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any], isBlockScope = isBlockScope.asInstanceOf[js.Any])
    __obj.updateDynamic("addDeclaration")(js.Any.fromFunction3((t0: typingsJapgolly.estreeWalker.mod.Node, t1: scala.Boolean, t2: scala.Boolean) => addDeclaration(t0, t1, t2).runNow()))
    __obj.updateDynamic("contains")(js.Any.fromFunction1((t0: java.lang.String) => contains(t0).runNow()))
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachedScope]
  }
}

