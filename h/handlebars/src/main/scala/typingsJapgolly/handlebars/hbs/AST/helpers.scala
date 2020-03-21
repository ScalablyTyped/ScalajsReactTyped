package typingsJapgolly.handlebars.hbs.AST

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait helpers extends js.Object {
  def helperExpression(node: Node): Boolean
  def scopeId(path: PathExpression): Boolean
  def simpleId(path: PathExpression): Boolean
}

object helpers {
  @scala.inline
  def apply(
    helperExpression: Node => CallbackTo[Boolean],
    scopeId: PathExpression => CallbackTo[Boolean],
    simpleId: PathExpression => CallbackTo[Boolean]
  ): helpers = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("helperExpression")(js.Any.fromFunction1((t0: typingsJapgolly.handlebars.hbs.AST.Node) => helperExpression(t0).runNow()))
    __obj.updateDynamic("scopeId")(js.Any.fromFunction1((t0: typingsJapgolly.handlebars.hbs.AST.PathExpression) => scopeId(t0).runNow()))
    __obj.updateDynamic("simpleId")(js.Any.fromFunction1((t0: typingsJapgolly.handlebars.hbs.AST.PathExpression) => simpleId(t0).runNow()))
    __obj.asInstanceOf[helpers]
  }
}

