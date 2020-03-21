package typingsJapgolly.serverlessJestPlugin.mod

import typingsJapgolly.awsLambda.handlerMod.Callback
import typingsJapgolly.lambdaWrapper.AnonHandler
import typingsJapgolly.lambdaWrapper.AnonLambdaFunction
import typingsJapgolly.lambdaWrapper.PartialContext
import typingsJapgolly.lambdaWrapper.mod.Wrapped
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("serverless-jest-plugin", "lambdaWrapper")
@js.native
object lambdaWrapper extends js.Object {
  def init(mod: js.Any, options: js.Any): Unit = js.native
  def run(event: js.Any, callback: Callback[_]): js.Promise[_] = js.native
  def run(event: js.Any, context: PartialContext, callback: Callback[_]): js.Promise[_] = js.native
  def wrap(mod: AnonLambdaFunction): Wrapped[_, _] = js.native
  def wrap(mod: AnonLambdaFunction, options: js.Object): Wrapped[_, _] = js.native
  def wrap[TEvent, TResult, THandlerName /* <: String */](
    mod: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ name in THandlerName ]: aws-lambda.aws-lambda/handler.Handler<TEvent, TResult>}
    */ typingsJapgolly.serverlessJestPlugin.serverlessJestPluginStrings.lambdaWrapper with js.Any
  ): Wrapped[TEvent, TResult] = js.native
  def wrap[TEvent, TResult, THandlerName /* <: String */](
    mod: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ name in THandlerName ]: aws-lambda.aws-lambda/handler.Handler<TEvent, TResult>}
    */ typingsJapgolly.serverlessJestPlugin.serverlessJestPluginStrings.lambdaWrapper with js.Any,
    options: AnonHandler[THandlerName]
  ): Wrapped[TEvent, TResult] = js.native
}

