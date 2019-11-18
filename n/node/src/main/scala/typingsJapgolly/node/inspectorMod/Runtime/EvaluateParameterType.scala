package typingsJapgolly.node.inspectorMod.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EvaluateParameterType extends js.Object {
  /**
    * Whether execution should <code>await</code> for resulting value and return once awaited promise is resolved.
    */
  var awaitPromise: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies in which execution context to perform evaluation. If the parameter is omitted the evaluation will be performed in the context of the inspected page.
    */
  var contextId: js.UndefOr[ExecutionContextId] = js.undefined
  /**
    * Expression to evaluate.
    */
  var expression: java.lang.String
  /**
    * Whether preview should be generated for the result.
    * @experimental
    */
  var generatePreview: js.UndefOr[Boolean] = js.undefined
  /**
    * Determines whether Command Line API should be available during the evaluation.
    */
  var includeCommandLineAPI: js.UndefOr[Boolean] = js.undefined
  /**
    * Symbolic group name that can be used to release multiple objects.
    */
  var objectGroup: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether the result is expected to be a JSON object that should be sent by value.
    */
  var returnByValue: js.UndefOr[Boolean] = js.undefined
  /**
    * In silent mode exceptions thrown during evaluation are not reported and do not pause execution. Overrides <code>setPauseOnException</code> state.
    */
  var silent: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether execution should be treated as initiated by user in the UI.
    */
  var userGesture: js.UndefOr[Boolean] = js.undefined
}

object EvaluateParameterType {
  @scala.inline
  def apply(
    expression: java.lang.String,
    awaitPromise: js.UndefOr[Boolean] = js.undefined,
    contextId: Int | Double = null,
    generatePreview: js.UndefOr[Boolean] = js.undefined,
    includeCommandLineAPI: js.UndefOr[Boolean] = js.undefined,
    objectGroup: java.lang.String = null,
    returnByValue: js.UndefOr[Boolean] = js.undefined,
    silent: js.UndefOr[Boolean] = js.undefined,
    userGesture: js.UndefOr[Boolean] = js.undefined
  ): EvaluateParameterType = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    if (!js.isUndefined(awaitPromise)) __obj.updateDynamic("awaitPromise")(awaitPromise.asInstanceOf[js.Any])
    if (contextId != null) __obj.updateDynamic("contextId")(contextId.asInstanceOf[js.Any])
    if (!js.isUndefined(generatePreview)) __obj.updateDynamic("generatePreview")(generatePreview.asInstanceOf[js.Any])
    if (!js.isUndefined(includeCommandLineAPI)) __obj.updateDynamic("includeCommandLineAPI")(includeCommandLineAPI.asInstanceOf[js.Any])
    if (objectGroup != null) __obj.updateDynamic("objectGroup")(objectGroup.asInstanceOf[js.Any])
    if (!js.isUndefined(returnByValue)) __obj.updateDynamic("returnByValue")(returnByValue.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (!js.isUndefined(userGesture)) __obj.updateDynamic("userGesture")(userGesture.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluateParameterType]
  }
}

