package typingsJapgolly.apolloEngineReporting.agentMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.apolloEngineReporting.apolloEngineReportingBooleans.`false`
import typingsJapgolly.apolloServerEnv.fetchMod.RequestAgent
import typingsJapgolly.apolloServerTypes.mod.GraphQLRequestContext
import typingsJapgolly.graphql.astMod.DocumentNode
import typingsJapgolly.graphql.mod.GraphQLError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EngineReportingOptions[TContext] extends js.Object {
  var apiKey: js.UndefOr[String] = js.undefined
  var calculateSignature: js.UndefOr[js.Function2[/* ast */ DocumentNode, /* operationName */ String, String]] = js.undefined
  var debugPrintReports: js.UndefOr[Boolean] = js.undefined
  var endpointUrl: js.UndefOr[String] = js.undefined
  var generateClientInfo: js.UndefOr[GenerateClientInfo[TContext]] = js.undefined
  var handleSignals: js.UndefOr[Boolean] = js.undefined
  var maskErrorDetails: js.UndefOr[Boolean] = js.undefined
  var maxAttempts: js.UndefOr[Double] = js.undefined
  var maxUncompressedReportSize: js.UndefOr[Double] = js.undefined
  var minimumRetryDelayMs: js.UndefOr[Double] = js.undefined
  var privateHeaders: js.UndefOr[js.Array[String] | Boolean] = js.undefined
  var privateVariables: js.UndefOr[js.Array[String] | Boolean] = js.undefined
  var reportErrorFunction: js.UndefOr[js.Function1[/* err */ js.Error, Unit]] = js.undefined
  var reportIntervalMs: js.UndefOr[Double] = js.undefined
  var requestAgent: js.UndefOr[RequestAgent | `false`] = js.undefined
  var rewriteError: js.UndefOr[js.Function1[/* err */ GraphQLError, GraphQLError | Null]] = js.undefined
  var schemaTag: js.UndefOr[String] = js.undefined
  var sendHeaders: js.UndefOr[SendValuesBaseOptions] = js.undefined
  var sendReportsImmediately: js.UndefOr[Boolean] = js.undefined
  var sendVariableValues: js.UndefOr[VariableValueOptions] = js.undefined
}

object EngineReportingOptions {
  @scala.inline
  def apply[TContext](
    apiKey: String = null,
    calculateSignature: (/* ast */ DocumentNode, /* operationName */ String) => CallbackTo[String] = null,
    debugPrintReports: js.UndefOr[Boolean] = js.undefined,
    endpointUrl: String = null,
    generateClientInfo: /* requestContext */ GraphQLRequestContext[TContext] => CallbackTo[ClientInfo] = null,
    handleSignals: js.UndefOr[Boolean] = js.undefined,
    maskErrorDetails: js.UndefOr[Boolean] = js.undefined,
    maxAttempts: Int | Double = null,
    maxUncompressedReportSize: Int | Double = null,
    minimumRetryDelayMs: Int | Double = null,
    privateHeaders: js.Array[String] | Boolean = null,
    privateVariables: js.Array[String] | Boolean = null,
    reportErrorFunction: /* err */ js.Error => Callback = null,
    reportIntervalMs: Int | Double = null,
    requestAgent: RequestAgent | `false` = null,
    rewriteError: /* err */ GraphQLError => CallbackTo[GraphQLError | Null] = null,
    schemaTag: String = null,
    sendHeaders: SendValuesBaseOptions = null,
    sendReportsImmediately: js.UndefOr[Boolean] = js.undefined,
    sendVariableValues: VariableValueOptions = null
  ): EngineReportingOptions[TContext] = {
    val __obj = js.Dynamic.literal()
    if (apiKey != null) __obj.updateDynamic("apiKey")(apiKey.asInstanceOf[js.Any])
    if (calculateSignature != null) __obj.updateDynamic("calculateSignature")(js.Any.fromFunction2((t0: /* ast */ typingsJapgolly.graphql.astMod.DocumentNode, t1: /* operationName */ java.lang.String) => calculateSignature(t0, t1).runNow()))
    if (!js.isUndefined(debugPrintReports)) __obj.updateDynamic("debugPrintReports")(debugPrintReports.asInstanceOf[js.Any])
    if (endpointUrl != null) __obj.updateDynamic("endpointUrl")(endpointUrl.asInstanceOf[js.Any])
    if (generateClientInfo != null) __obj.updateDynamic("generateClientInfo")(js.Any.fromFunction1((t0: /* requestContext */ typingsJapgolly.apolloServerTypes.mod.GraphQLRequestContext[TContext]) => generateClientInfo(t0).runNow()))
    if (!js.isUndefined(handleSignals)) __obj.updateDynamic("handleSignals")(handleSignals.asInstanceOf[js.Any])
    if (!js.isUndefined(maskErrorDetails)) __obj.updateDynamic("maskErrorDetails")(maskErrorDetails.asInstanceOf[js.Any])
    if (maxAttempts != null) __obj.updateDynamic("maxAttempts")(maxAttempts.asInstanceOf[js.Any])
    if (maxUncompressedReportSize != null) __obj.updateDynamic("maxUncompressedReportSize")(maxUncompressedReportSize.asInstanceOf[js.Any])
    if (minimumRetryDelayMs != null) __obj.updateDynamic("minimumRetryDelayMs")(minimumRetryDelayMs.asInstanceOf[js.Any])
    if (privateHeaders != null) __obj.updateDynamic("privateHeaders")(privateHeaders.asInstanceOf[js.Any])
    if (privateVariables != null) __obj.updateDynamic("privateVariables")(privateVariables.asInstanceOf[js.Any])
    if (reportErrorFunction != null) __obj.updateDynamic("reportErrorFunction")(js.Any.fromFunction1((t0: /* err */ js.Error) => reportErrorFunction(t0).runNow()))
    if (reportIntervalMs != null) __obj.updateDynamic("reportIntervalMs")(reportIntervalMs.asInstanceOf[js.Any])
    if (requestAgent != null) __obj.updateDynamic("requestAgent")(requestAgent.asInstanceOf[js.Any])
    if (rewriteError != null) __obj.updateDynamic("rewriteError")(js.Any.fromFunction1((t0: /* err */ typingsJapgolly.graphql.mod.GraphQLError) => rewriteError(t0).runNow()))
    if (schemaTag != null) __obj.updateDynamic("schemaTag")(schemaTag.asInstanceOf[js.Any])
    if (sendHeaders != null) __obj.updateDynamic("sendHeaders")(sendHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(sendReportsImmediately)) __obj.updateDynamic("sendReportsImmediately")(sendReportsImmediately.asInstanceOf[js.Any])
    if (sendVariableValues != null) __obj.updateDynamic("sendVariableValues")(sendVariableValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EngineReportingOptions[TContext]]
  }
}

