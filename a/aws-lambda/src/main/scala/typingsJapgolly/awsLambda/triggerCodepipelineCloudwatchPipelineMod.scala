package typingsJapgolly.awsLambda

import typingsJapgolly.awsLambda.anon.Pipeline
import typingsJapgolly.awsLambda.awsLambdaStrings.`CodePipeline Pipeline Execution State Change`
import typingsJapgolly.awsLambda.awsLambdaStrings.awsDotcodepipeline
import typingsJapgolly.awsLambda.handlerMod.Handler
import typingsJapgolly.awsLambda.triggerCodepipelineCloudwatchMod.CodePipelineCloudWatchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object triggerCodepipelineCloudwatchPipelineMod {
  
  trait CodePipelineCloudWatchPipelineEvent
    extends StObject
       with CodePipelineCloudWatchEvent {
    
    var account: String
    
    var detail: Pipeline
    
    var `detail-type`: `CodePipeline Pipeline Execution State Change`
    
    var id: String
    
    var region: String
    
    var resources: js.Array[String]
    
    var source: awsDotcodepipeline
    
    var time: String
    
    var version: String
  }
  object CodePipelineCloudWatchPipelineEvent {
    
    inline def apply(
      account: String,
      detail: Pipeline,
      id: String,
      region: String,
      resources: js.Array[String],
      time: String,
      version: String
    ): CodePipelineCloudWatchPipelineEvent = {
      val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], source = "aws.codepipeline", time = time.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("detail-type")("CodePipeline Pipeline Execution State Change")
      __obj.asInstanceOf[CodePipelineCloudWatchPipelineEvent]
    }
    
    extension [Self <: CodePipelineCloudWatchPipelineEvent](x: Self) {
      
      inline def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
      
      inline def setDetail(value: Pipeline): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      inline def `setDetail-type`(value: `CodePipeline Pipeline Execution State Change`): Self = StObject.set(x, "detail-type", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setResources(value: js.Array[String]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      inline def setResourcesVarargs(value: String*): Self = StObject.set(x, "resources", js.Array(value*))
      
      inline def setSource(value: awsDotcodepipeline): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  type CodePipelineCloudWatchPipelineHandler = Handler[CodePipelineCloudWatchPipelineEvent, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsLambda.awsLambdaStrings.STARTED
    - typingsJapgolly.awsLambda.awsLambdaStrings.SUCCEEDED
    - typingsJapgolly.awsLambda.awsLambdaStrings.RESUMED
    - typingsJapgolly.awsLambda.awsLambdaStrings.FAILED
    - typingsJapgolly.awsLambda.awsLambdaStrings.CANCELED
    - typingsJapgolly.awsLambda.awsLambdaStrings.SUPERSEDED
  */
  trait CodePipelineState extends StObject
  object CodePipelineState {
    
    inline def CANCELED: typingsJapgolly.awsLambda.awsLambdaStrings.CANCELED = "CANCELED".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.CANCELED]
    
    inline def FAILED: typingsJapgolly.awsLambda.awsLambdaStrings.FAILED = "FAILED".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.FAILED]
    
    inline def RESUMED: typingsJapgolly.awsLambda.awsLambdaStrings.RESUMED = "RESUMED".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.RESUMED]
    
    inline def STARTED: typingsJapgolly.awsLambda.awsLambdaStrings.STARTED = "STARTED".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.STARTED]
    
    inline def SUCCEEDED: typingsJapgolly.awsLambda.awsLambdaStrings.SUCCEEDED = "SUCCEEDED".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.SUCCEEDED]
    
    inline def SUPERSEDED: typingsJapgolly.awsLambda.awsLambdaStrings.SUPERSEDED = "SUPERSEDED".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.SUPERSEDED]
  }
}
