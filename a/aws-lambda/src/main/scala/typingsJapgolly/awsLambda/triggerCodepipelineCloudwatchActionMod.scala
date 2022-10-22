package typingsJapgolly.awsLambda

import typingsJapgolly.awsLambda.anon.Executionid
import typingsJapgolly.awsLambda.awsLambdaStrings.Build_
import typingsJapgolly.awsLambda.awsLambdaStrings.`CodePipeline Action Execution State Change`
import typingsJapgolly.awsLambda.awsLambdaStrings.awsDotcodepipeline
import typingsJapgolly.awsLambda.handlerMod.Handler
import typingsJapgolly.awsLambda.triggerCodepipelineCloudwatchMod.CodePipelineCloudWatchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object triggerCodepipelineCloudwatchActionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsLambda.awsLambdaStrings.Approval
    - typingsJapgolly.awsLambda.awsLambdaStrings.Build_
    - typingsJapgolly.awsLambda.awsLambdaStrings.Deploy
    - typingsJapgolly.awsLambda.awsLambdaStrings.Invoke
    - typingsJapgolly.awsLambda.awsLambdaStrings.Source
    - typingsJapgolly.awsLambda.awsLambdaStrings.Test
  */
  trait CodePipelineActionCategory extends StObject
  object CodePipelineActionCategory {
    
    inline def Approval: typingsJapgolly.awsLambda.awsLambdaStrings.Approval = "Approval".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.Approval]
    
    inline def Build: Build_ = "Build".asInstanceOf[Build_]
    
    inline def Deploy: typingsJapgolly.awsLambda.awsLambdaStrings.Deploy = "Deploy".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.Deploy]
    
    inline def Invoke: typingsJapgolly.awsLambda.awsLambdaStrings.Invoke = "Invoke".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.Invoke]
    
    inline def Source: typingsJapgolly.awsLambda.awsLambdaStrings.Source = "Source".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.Source]
    
    inline def Test: typingsJapgolly.awsLambda.awsLambdaStrings.Test = "Test".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.Test]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsLambda.awsLambdaStrings.STARTED
    - typingsJapgolly.awsLambda.awsLambdaStrings.SUCCEEDED
    - typingsJapgolly.awsLambda.awsLambdaStrings.FAILED
    - typingsJapgolly.awsLambda.awsLambdaStrings.CANCELED
  */
  trait CodePipelineActionState extends StObject
  object CodePipelineActionState {
    
    inline def CANCELED: typingsJapgolly.awsLambda.awsLambdaStrings.CANCELED = "CANCELED".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.CANCELED]
    
    inline def FAILED: typingsJapgolly.awsLambda.awsLambdaStrings.FAILED = "FAILED".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.FAILED]
    
    inline def STARTED: typingsJapgolly.awsLambda.awsLambdaStrings.STARTED = "STARTED".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.STARTED]
    
    inline def SUCCEEDED: typingsJapgolly.awsLambda.awsLambdaStrings.SUCCEEDED = "SUCCEEDED".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.SUCCEEDED]
  }
  
  trait CodePipelineCloudWatchActionEvent
    extends StObject
       with CodePipelineCloudWatchEvent {
    
    var account: String
    
    var detail: Executionid
    
    var `detail-type`: `CodePipeline Action Execution State Change`
    
    var id: String
    
    var region: String
    
    var resources: js.Array[String]
    
    var source: awsDotcodepipeline
    
    var time: String
    
    var version: String
  }
  object CodePipelineCloudWatchActionEvent {
    
    inline def apply(
      account: String,
      detail: Executionid,
      id: String,
      region: String,
      resources: js.Array[String],
      time: String,
      version: String
    ): CodePipelineCloudWatchActionEvent = {
      val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], source = "aws.codepipeline", time = time.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("detail-type")("CodePipeline Action Execution State Change")
      __obj.asInstanceOf[CodePipelineCloudWatchActionEvent]
    }
    
    extension [Self <: CodePipelineCloudWatchActionEvent](x: Self) {
      
      inline def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
      
      inline def setDetail(value: Executionid): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      inline def `setDetail-type`(value: `CodePipeline Action Execution State Change`): Self = StObject.set(x, "detail-type", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setResources(value: js.Array[String]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      inline def setResourcesVarargs(value: String*): Self = StObject.set(x, "resources", js.Array(value*))
      
      inline def setSource(value: awsDotcodepipeline): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  type CodePipelineCloudWatchActionHandler = Handler[CodePipelineCloudWatchActionEvent, Unit]
}
