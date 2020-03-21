package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IParameters extends js.Object {
  var ast: AST
  var length: Double
  def astAt(index: Double): AST
  def identifierAt(index: Double): Identifier
  def initializerAt(index: Double): EqualsValueClause
  def isOptionalAt(index: Double): Boolean
  def lastParameterIsRest(): Boolean
  def typeAt(index: Double): AST
}

object IParameters {
  @scala.inline
  def apply(
    ast: AST,
    astAt: Double => CallbackTo[AST],
    identifierAt: Double => CallbackTo[Identifier],
    initializerAt: Double => CallbackTo[EqualsValueClause],
    isOptionalAt: Double => CallbackTo[Boolean],
    lastParameterIsRest: CallbackTo[Boolean],
    length: Double,
    typeAt: Double => CallbackTo[AST]
  ): IParameters = {
    val __obj = js.Dynamic.literal(ast = ast.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
    __obj.updateDynamic("astAt")(js.Any.fromFunction1((t0: scala.Double) => astAt(t0).runNow()))
    __obj.updateDynamic("identifierAt")(js.Any.fromFunction1((t0: scala.Double) => identifierAt(t0).runNow()))
    __obj.updateDynamic("initializerAt")(js.Any.fromFunction1((t0: scala.Double) => initializerAt(t0).runNow()))
    __obj.updateDynamic("isOptionalAt")(js.Any.fromFunction1((t0: scala.Double) => isOptionalAt(t0).runNow()))
    __obj.updateDynamic("lastParameterIsRest")(lastParameterIsRest.toJsFn)
    __obj.updateDynamic("typeAt")(js.Any.fromFunction1((t0: scala.Double) => typeAt(t0).runNow()))
    __obj.asInstanceOf[IParameters]
  }
}

