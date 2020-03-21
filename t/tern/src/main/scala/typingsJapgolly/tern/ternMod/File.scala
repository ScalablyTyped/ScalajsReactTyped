package typingsJapgolly.tern.ternMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.estree.mod.Program
import typingsJapgolly.tern.inferMod.Scope
import typingsJapgolly.tern.ternStrings.delete
import typingsJapgolly.tern.ternStrings.full
import typingsJapgolly.tern.ternStrings.part
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends js.Object {
  var asLineChar: js.UndefOr[js.Function1[/* nodePosition */ Double, Position]] = js.undefined
  var ast: Program
  var name: String
  var scope: Scope
  var text: String
  var `type`: js.UndefOr[full | part | delete] = js.undefined
}

object File {
  @scala.inline
  def apply(
    ast: Program,
    name: String,
    scope: Scope,
    text: String,
    asLineChar: /* nodePosition */ Double => CallbackTo[Position] = null,
    `type`: full | part | delete = null
  ): File = {
    val __obj = js.Dynamic.literal(ast = ast.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (asLineChar != null) __obj.updateDynamic("asLineChar")(js.Any.fromFunction1((t0: /* nodePosition */ scala.Double) => asLineChar(t0).runNow()))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
}

