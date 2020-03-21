package typingsJapgolly.googleAppsScript.GoogleAppsScript.DataStudio

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CommunityConnector enables scripts to access builders and utilities to help with development of
  * Community Connectors for Data Studio. Use this class to get a reference to the Fields
  * object and the FieldType and AggregationType enums so they can be used in the
  * construction of Fields.
  *
  *     var cc = DataStudioApp.createCommunityConnector();
  *     var fieldType = cc.FieldType;
  *     var aggregationType = cc.AggregationType;
  *
  *     var fields = cc.getFields();
  *
  *     fields.newMetric()
  *       .setAggregation(aggregationType.AVG)
  *       .setType(fieldType.CURRENCY_USD);
  */
trait CommunityConnector extends js.Object {
  var AggregationType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AggregationType */ js.Any
  var AuthType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AuthType */ js.Any
  var BigQueryParameterType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BigQueryParameterType */ js.Any
  var FieldType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FieldType */ js.Any
  def getConfig(): Config
  def getFields(): Fields
  def newAuthTypeResponse(): GetAuthTypeResponse
  def newBigQueryConfig(): BigQueryConfig
  def newDebugError(): DebugError
  def newGetDataResponse(): GetDataResponse
  def newGetSchemaResponse(): GetSchemaResponse
  def newSetCredentialsResponse(): SetCredentialsResponse
  def newUserError(): UserError
}

object CommunityConnector {
  @scala.inline
  def apply(
    AggregationType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AggregationType */ js.Any,
    AuthType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AuthType */ js.Any,
    BigQueryParameterType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BigQueryParameterType */ js.Any,
    FieldType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FieldType */ js.Any,
    getConfig: CallbackTo[Config],
    getFields: CallbackTo[Fields],
    newAuthTypeResponse: CallbackTo[GetAuthTypeResponse],
    newBigQueryConfig: CallbackTo[BigQueryConfig],
    newDebugError: CallbackTo[DebugError],
    newGetDataResponse: CallbackTo[GetDataResponse],
    newGetSchemaResponse: CallbackTo[GetSchemaResponse],
    newSetCredentialsResponse: CallbackTo[SetCredentialsResponse],
    newUserError: CallbackTo[UserError]
  ): CommunityConnector = {
    val __obj = js.Dynamic.literal(AggregationType = AggregationType.asInstanceOf[js.Any], AuthType = AuthType.asInstanceOf[js.Any], BigQueryParameterType = BigQueryParameterType.asInstanceOf[js.Any], FieldType = FieldType.asInstanceOf[js.Any])
    __obj.updateDynamic("getConfig")(getConfig.toJsFn)
    __obj.updateDynamic("getFields")(getFields.toJsFn)
    __obj.updateDynamic("newAuthTypeResponse")(newAuthTypeResponse.toJsFn)
    __obj.updateDynamic("newBigQueryConfig")(newBigQueryConfig.toJsFn)
    __obj.updateDynamic("newDebugError")(newDebugError.toJsFn)
    __obj.updateDynamic("newGetDataResponse")(newGetDataResponse.toJsFn)
    __obj.updateDynamic("newGetSchemaResponse")(newGetSchemaResponse.toJsFn)
    __obj.updateDynamic("newSetCredentialsResponse")(newSetCredentialsResponse.toJsFn)
    __obj.updateDynamic("newUserError")(newUserError.toJsFn)
    __obj.asInstanceOf[CommunityConnector]
  }
}

