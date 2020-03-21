package typingsJapgolly.luaparse.astMod

import typingsJapgolly.luaparse.AnonEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForGenericStatement
  extends _Statement
     with Base[typingsJapgolly.luaparse.luaparseStrings.ForGenericStatement] {
  var body: js.Array[Statement]
  var iterators: js.Array[Expression]
  var variables: js.Array[Identifier]
}

object ForGenericStatement {
  @scala.inline
  def apply(
    body: js.Array[Statement],
    iterators: js.Array[Expression],
    `type`: typingsJapgolly.luaparse.luaparseStrings.ForGenericStatement,
    variables: js.Array[Identifier],
    loc: AnonEnd = null
  ): ForGenericStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], iterators = iterators.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForGenericStatement]
  }
}

