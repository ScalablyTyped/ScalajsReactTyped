package typingsJapgolly.atAngularCompiler.srcI18nSerializersXmlUnderscoreHelperMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  def visit(visitor: IVisitor): js.Any
}

object Node {
  @scala.inline
  def apply(visit: IVisitor => CallbackTo[js.Any]): Node = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("visit")(js.Any.fromFunction1((t0: typingsJapgolly.atAngularCompiler.srcI18nSerializersXmlUnderscoreHelperMod.IVisitor) => visit(t0).runNow()))
    __obj.asInstanceOf[Node]
  }
}

