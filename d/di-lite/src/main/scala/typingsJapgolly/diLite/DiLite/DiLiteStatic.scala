package typingsJapgolly.diLite.DiLite

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiLiteStatic extends js.Object {
  var factory: FactoryEnum
  var strategy: StrategyEnum
  var utils: Utils
  var version: String
  def createContext(): CreateContext
  def dependencyExpression(depExp: String): String
  def entry(name: String, ctx: CreateContext): js.Any
}

object DiLiteStatic {
  @scala.inline
  def apply(
    createContext: CallbackTo[CreateContext],
    dependencyExpression: String => CallbackTo[String],
    entry: (String, CreateContext) => CallbackTo[js.Any],
    factory: FactoryEnum,
    strategy: StrategyEnum,
    utils: Utils,
    version: String
  ): DiLiteStatic = {
    val __obj = js.Dynamic.literal(factory = factory.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any], utils = utils.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("createContext")(createContext.toJsFn)
    __obj.updateDynamic("dependencyExpression")(js.Any.fromFunction1((t0: java.lang.String) => dependencyExpression(t0).runNow()))
    __obj.updateDynamic("entry")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.diLite.DiLite.CreateContext) => entry(t0, t1).runNow()))
    __obj.asInstanceOf[DiLiteStatic]
  }
}

