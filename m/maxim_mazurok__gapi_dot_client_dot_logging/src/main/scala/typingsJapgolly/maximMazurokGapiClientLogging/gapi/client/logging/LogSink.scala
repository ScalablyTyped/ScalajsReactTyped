package typingsJapgolly.maximMazurokGapiClientLogging.gapi.client.logging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogSink extends StObject {
  
  /** Optional. Options that affect sinks exporting data to BigQuery. */
  var bigqueryOptions: js.UndefOr[BigQueryOptions] = js.undefined
  
  /** Output only. The creation timestamp of the sink.This field may not be present for older sinks. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Optional. A description of this sink.The maximum length of the description is 8000 characters. */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The export destination: "storage.googleapis.com/[GCS_BUCKET]" "bigquery.googleapis.com/projects/[PROJECT_ID]/datasets/[DATASET]"
    * "pubsub.googleapis.com/projects/[PROJECT_ID]/topics/[TOPIC_ID]" The sink's writer_identity, set when the sink is created, must have permission to write to the destination or else
    * the log entries are not exported. For more information, see Exporting Logs with Sinks (https://cloud.google.com/logging/docs/api/tasks/exporting-logs).
    */
  var destination: js.UndefOr[String] = js.undefined
  
  /** Optional. If set to true, then this sink is disabled and it does not export any log entries. */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /** Optional. Log entries that match any of these exclusion filters will not be exported.If a log entry is matched by both filter and one of exclusion_filters it will not be exported. */
  var exclusions: js.UndefOr[js.Array[LogExclusion]] = js.undefined
  
  /**
    * Optional. An advanced logs filter (https://cloud.google.com/logging/docs/view/advanced-queries). The only exported log entries are those that are in the resource owning the sink and
    * that match the filter.For example:logName="projects/[PROJECT_ID]/logs/[LOG_ID]" AND severity>=ERROR
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. This field applies only to sinks owned by organizations and folders. If the field is false, the default, only the logs owned by the sink's parent resource are available
    * for export. If the field is true, then log entries from all the projects, folders, and billing accounts contained in the sink's parent resource are also available for export.
    * Whether a particular log entry from the children is exported depends on the sink's filter expression.For example, if this field is true, then the filter resource.type=gce_instance
    * would export all Compute Engine VM instance log entries from all projects in the sink's parent.To only export entries from certain child projects, filter on the project part of the
    * log name:logName:("projects/test-project1/" OR "projects/test-project2/") AND resource.type=gce_instance
    */
  var includeChildren: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Required. The client-assigned sink identifier, unique within the project.For example: "my-syslog-errors-to-pubsub". Sink identifiers are limited to 100 characters and can include
    * only the following characters: upper and lower-case alphanumeric characters, underscores, hyphens, and periods. First character has to be alphanumeric.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** Deprecated. This field is unused. */
  var outputVersionFormat: js.UndefOr[String] = js.undefined
  
  /** Output only. The last update timestamp of the sink.This field may not be present for older sinks. */
  var updateTime: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. An IAM identity—a service account or group—under which Cloud Logging writes the exported log entries to the sink's destination. This field is either set by specifying
    * custom_writer_identity or set automatically by sinks.create and sinks.update based on the value of unique_writer_identity in those methods.Until you grant this identity write-access
    * to the destination, log entry exports from this sink will fail. For more information, see Granting Access for a Resource
    * (https://cloud.google.com/iam/docs/granting-roles-to-service-accounts#granting_access_to_a_service_account_for_a_resource). Consult the destination service's documentation to
    * determine the appropriate IAM roles to assign to the identity.Sinks that have a destination that is a log bucket in the same project as the sink cannot have a writer_identity and no
    * additional permissions are required.
    */
  var writerIdentity: js.UndefOr[String] = js.undefined
}
object LogSink {
  
  inline def apply(): LogSink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogSink]
  }
  
  extension [Self <: LogSink](x: Self) {
    
    inline def setBigqueryOptions(value: BigQueryOptions): Self = StObject.set(x, "bigqueryOptions", value.asInstanceOf[js.Any])
    
    inline def setBigqueryOptionsUndefined: Self = StObject.set(x, "bigqueryOptions", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setExclusions(value: js.Array[LogExclusion]): Self = StObject.set(x, "exclusions", value.asInstanceOf[js.Any])
    
    inline def setExclusionsUndefined: Self = StObject.set(x, "exclusions", js.undefined)
    
    inline def setExclusionsVarargs(value: LogExclusion*): Self = StObject.set(x, "exclusions", js.Array(value*))
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setIncludeChildren(value: Boolean): Self = StObject.set(x, "includeChildren", value.asInstanceOf[js.Any])
    
    inline def setIncludeChildrenUndefined: Self = StObject.set(x, "includeChildren", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOutputVersionFormat(value: String): Self = StObject.set(x, "outputVersionFormat", value.asInstanceOf[js.Any])
    
    inline def setOutputVersionFormatUndefined: Self = StObject.set(x, "outputVersionFormat", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setWriterIdentity(value: String): Self = StObject.set(x, "writerIdentity", value.asInstanceOf[js.Any])
    
    inline def setWriterIdentityUndefined: Self = StObject.set(x, "writerIdentity", js.undefined)
  }
}
