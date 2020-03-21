package typingsJapgolly.gapiClientDataproc.gapi.client.dataproc

import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparkSqlJob extends js.Object {
  /** Optional. HCFS URIs of jar files to be added to the Spark CLASSPATH. */
  var jarFileUris: js.UndefOr[js.Array[String]] = js.undefined
  /** Optional. The runtime log config for job execution. */
  var loggingConfig: js.UndefOr[LoggingConfig] = js.undefined
  /**
    * Optional. A mapping of property names to values, used to configure Spark SQL's SparkConf. Properties that conflict with values set by the Cloud
    * Dataproc API may be overwritten.
    */
  var properties: js.UndefOr[Record[String, String]] = js.undefined
  /** The HCFS URI of the script that contains SQL queries. */
  var queryFileUri: js.UndefOr[String] = js.undefined
  /** A list of queries. */
  var queryList: js.UndefOr[QueryList] = js.undefined
  /** Optional. Mapping of query variable names to values (equivalent to the Spark SQL command: SET name="value";). */
  var scriptVariables: js.UndefOr[Record[String, String]] = js.undefined
}

object SparkSqlJob {
  @scala.inline
  def apply(
    jarFileUris: js.Array[String] = null,
    loggingConfig: LoggingConfig = null,
    properties: Record[String, String] = null,
    queryFileUri: String = null,
    queryList: QueryList = null,
    scriptVariables: Record[String, String] = null
  ): SparkSqlJob = {
    val __obj = js.Dynamic.literal()
    if (jarFileUris != null) __obj.updateDynamic("jarFileUris")(jarFileUris.asInstanceOf[js.Any])
    if (loggingConfig != null) __obj.updateDynamic("loggingConfig")(loggingConfig.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (queryFileUri != null) __obj.updateDynamic("queryFileUri")(queryFileUri.asInstanceOf[js.Any])
    if (queryList != null) __obj.updateDynamic("queryList")(queryList.asInstanceOf[js.Any])
    if (scriptVariables != null) __obj.updateDynamic("scriptVariables")(scriptVariables.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparkSqlJob]
  }
}

