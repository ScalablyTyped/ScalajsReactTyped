package typingsJapgolly.googleAppsScript.GoogleAppsScript.DataStudio

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A configuration object for a native BigQuery connector. Return this object from getData()
  * for Data Studio to query BigQuery for the connector.
  *
  *     var cc = DataStudioApp.createCommunityConnector();
  *     var types = cc.BigQueryParameterType;
  *
  *     var bqConfig = cc.newBigQueryConfig()
  *       .setBillingProjectId('billingProjectId')
  *       .setQuery('queryString')
  *       .setUseStandardSql(true)
  *       .setAccessToken('accessToken')
  *       .addQueryParameter('dob', types.STRING, '01011990')
  *       .build();
  */
trait BigQueryConfig extends js.Object {
  def addQueryParameter(name: String, `type`: BigQueryParameterType, value: String): BigQueryConfig
  def build(): Config
  def printJson(): String
  def setAccessToken(accessToken: String): BigQueryConfig
  def setBillingProjectId(billingProjectId: String): BigQueryConfig
  def setQuery(query: String): BigQueryConfig
  def setUseStandardSql(useStandardSql: Boolean): BigQueryConfig
}

object BigQueryConfig {
  @scala.inline
  def apply(
    addQueryParameter: (String, BigQueryParameterType, String) => CallbackTo[BigQueryConfig],
    build: CallbackTo[Config],
    printJson: CallbackTo[String],
    setAccessToken: String => CallbackTo[BigQueryConfig],
    setBillingProjectId: String => CallbackTo[BigQueryConfig],
    setQuery: String => CallbackTo[BigQueryConfig],
    setUseStandardSql: Boolean => CallbackTo[BigQueryConfig]
  ): BigQueryConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addQueryParameter")(js.Any.fromFunction3((t0: java.lang.String, t1: typingsJapgolly.googleAppsScript.GoogleAppsScript.DataStudio.BigQueryParameterType, t2: java.lang.String) => addQueryParameter(t0, t1, t2).runNow()))
    __obj.updateDynamic("build")(build.toJsFn)
    __obj.updateDynamic("printJson")(printJson.toJsFn)
    __obj.updateDynamic("setAccessToken")(js.Any.fromFunction1((t0: java.lang.String) => setAccessToken(t0).runNow()))
    __obj.updateDynamic("setBillingProjectId")(js.Any.fromFunction1((t0: java.lang.String) => setBillingProjectId(t0).runNow()))
    __obj.updateDynamic("setQuery")(js.Any.fromFunction1((t0: java.lang.String) => setQuery(t0).runNow()))
    __obj.updateDynamic("setUseStandardSql")(js.Any.fromFunction1((t0: scala.Boolean) => setUseStandardSql(t0).runNow()))
    __obj.asInstanceOf[BigQueryConfig]
  }
}

