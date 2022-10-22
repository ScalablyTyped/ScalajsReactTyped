package typingsJapgolly.googleAppsScript.GoogleAppsScript.DataStudio

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait CommunityConnector extends StObject {
  
  var AggregationType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AggregationType */ Any
  
  var AuthType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AuthType */ Any
  
  var BigQueryParameterType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BigQueryParameterType */ Any
  
  var FieldType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FieldType */ Any
  
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
  
  inline def apply(
    AggregationType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AggregationType */ Any,
    AuthType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AuthType */ Any,
    BigQueryParameterType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BigQueryParameterType */ Any,
    FieldType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FieldType */ Any,
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
    val __obj = js.Dynamic.literal(AggregationType = AggregationType.asInstanceOf[js.Any], AuthType = AuthType.asInstanceOf[js.Any], BigQueryParameterType = BigQueryParameterType.asInstanceOf[js.Any], FieldType = FieldType.asInstanceOf[js.Any], getConfig = getConfig.toJsFn, getFields = getFields.toJsFn, newAuthTypeResponse = newAuthTypeResponse.toJsFn, newBigQueryConfig = newBigQueryConfig.toJsFn, newDebugError = newDebugError.toJsFn, newGetDataResponse = newGetDataResponse.toJsFn, newGetSchemaResponse = newGetSchemaResponse.toJsFn, newSetCredentialsResponse = newSetCredentialsResponse.toJsFn, newUserError = newUserError.toJsFn)
    __obj.asInstanceOf[CommunityConnector]
  }
  
  extension [Self <: CommunityConnector](x: Self) {
    
    inline def setAggregationType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AggregationType */ Any
    ): Self = StObject.set(x, "AggregationType", value.asInstanceOf[js.Any])
    
    inline def setAuthType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AuthType */ Any): Self = StObject.set(x, "AuthType", value.asInstanceOf[js.Any])
    
    inline def setBigQueryParameterType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BigQueryParameterType */ Any
    ): Self = StObject.set(x, "BigQueryParameterType", value.asInstanceOf[js.Any])
    
    inline def setFieldType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FieldType */ Any): Self = StObject.set(x, "FieldType", value.asInstanceOf[js.Any])
    
    inline def setGetConfig(value: CallbackTo[Config]): Self = StObject.set(x, "getConfig", value.toJsFn)
    
    inline def setGetFields(value: CallbackTo[Fields]): Self = StObject.set(x, "getFields", value.toJsFn)
    
    inline def setNewAuthTypeResponse(value: CallbackTo[GetAuthTypeResponse]): Self = StObject.set(x, "newAuthTypeResponse", value.toJsFn)
    
    inline def setNewBigQueryConfig(value: CallbackTo[BigQueryConfig]): Self = StObject.set(x, "newBigQueryConfig", value.toJsFn)
    
    inline def setNewDebugError(value: CallbackTo[DebugError]): Self = StObject.set(x, "newDebugError", value.toJsFn)
    
    inline def setNewGetDataResponse(value: CallbackTo[GetDataResponse]): Self = StObject.set(x, "newGetDataResponse", value.toJsFn)
    
    inline def setNewGetSchemaResponse(value: CallbackTo[GetSchemaResponse]): Self = StObject.set(x, "newGetSchemaResponse", value.toJsFn)
    
    inline def setNewSetCredentialsResponse(value: CallbackTo[SetCredentialsResponse]): Self = StObject.set(x, "newSetCredentialsResponse", value.toJsFn)
    
    inline def setNewUserError(value: CallbackTo[UserError]): Self = StObject.set(x, "newUserError", value.toJsFn)
  }
}
