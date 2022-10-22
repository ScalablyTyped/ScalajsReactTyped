package typingsJapgolly.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Environment extends StObject {
  
  /** Output only. The time when the Environment status was set to complete. This value will be set automatically when state transitions to COMPLETE. */
  var completionTime: js.UndefOr[Timestamp] = js.undefined
  
  /** Output only. The time when the Environment was created. */
  var creationTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * Dimension values describing the environment. Dimension values always consist of "Model", "Version", "Locale", and "Orientation". - In response: always set - In create request:
    * always set - In update request: never set
    */
  var dimensionValue: js.UndefOr[js.Array[EnvironmentDimensionValueEntry]] = js.undefined
  
  /** A short human-readable name to display in the UI. Maximum of 100 characters. For example: Nexus 5, API 27. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Output only. An Environment id. */
  var environmentId: js.UndefOr[String] = js.undefined
  
  /** Merged result of the environment. */
  var environmentResult: js.UndefOr[MergedResult] = js.undefined
  
  /** Output only. An Execution id. */
  var executionId: js.UndefOr[String] = js.undefined
  
  /** Output only. A History id. */
  var historyId: js.UndefOr[String] = js.undefined
  
  /** Output only. A Project id. */
  var projectId: js.UndefOr[String] = js.undefined
  
  /** The location where output files are stored in the user bucket. */
  var resultsStorage: js.UndefOr[ResultsStorage] = js.undefined
  
  /** Output only. Summaries of shards. Only one shard will present unless sharding feature is enabled in TestExecutionService. */
  var shardSummaries: js.UndefOr[js.Array[ShardSummary]] = js.undefined
}
object Environment {
  
  inline def apply(): Environment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Environment]
  }
  
  extension [Self <: Environment](x: Self) {
    
    inline def setCompletionTime(value: Timestamp): Self = StObject.set(x, "completionTime", value.asInstanceOf[js.Any])
    
    inline def setCompletionTimeUndefined: Self = StObject.set(x, "completionTime", js.undefined)
    
    inline def setCreationTime(value: Timestamp): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setDimensionValue(value: js.Array[EnvironmentDimensionValueEntry]): Self = StObject.set(x, "dimensionValue", value.asInstanceOf[js.Any])
    
    inline def setDimensionValueUndefined: Self = StObject.set(x, "dimensionValue", js.undefined)
    
    inline def setDimensionValueVarargs(value: EnvironmentDimensionValueEntry*): Self = StObject.set(x, "dimensionValue", js.Array(value*))
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEnvironmentId(value: String): Self = StObject.set(x, "environmentId", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentIdUndefined: Self = StObject.set(x, "environmentId", js.undefined)
    
    inline def setEnvironmentResult(value: MergedResult): Self = StObject.set(x, "environmentResult", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentResultUndefined: Self = StObject.set(x, "environmentResult", js.undefined)
    
    inline def setExecutionId(value: String): Self = StObject.set(x, "executionId", value.asInstanceOf[js.Any])
    
    inline def setExecutionIdUndefined: Self = StObject.set(x, "executionId", js.undefined)
    
    inline def setHistoryId(value: String): Self = StObject.set(x, "historyId", value.asInstanceOf[js.Any])
    
    inline def setHistoryIdUndefined: Self = StObject.set(x, "historyId", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setResultsStorage(value: ResultsStorage): Self = StObject.set(x, "resultsStorage", value.asInstanceOf[js.Any])
    
    inline def setResultsStorageUndefined: Self = StObject.set(x, "resultsStorage", js.undefined)
    
    inline def setShardSummaries(value: js.Array[ShardSummary]): Self = StObject.set(x, "shardSummaries", value.asInstanceOf[js.Any])
    
    inline def setShardSummariesUndefined: Self = StObject.set(x, "shardSummaries", js.undefined)
    
    inline def setShardSummariesVarargs(value: ShardSummary*): Self = StObject.set(x, "shardSummaries", js.Array(value*))
  }
}
