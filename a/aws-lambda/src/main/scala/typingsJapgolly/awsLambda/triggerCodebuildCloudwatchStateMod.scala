package typingsJapgolly.awsLambda

import typingsJapgolly.awsLambda.anon.Artifact
import typingsJapgolly.awsLambda.awsLambdaStrings.`CodeBuild Build State Change`
import typingsJapgolly.awsLambda.awsLambdaStrings.awsDotcodebuild
import typingsJapgolly.awsLambda.triggerEventbridgeMod.EventBridgeEvent
import typingsJapgolly.awsLambda.triggerEventbridgeMod.EventBridgeHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object triggerCodebuildCloudwatchStateMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsLambda.awsLambdaStrings.NO_CACHE
    - typingsJapgolly.awsLambda.awsLambdaStrings.LOCAL
    - typingsJapgolly.awsLambda.awsLambdaStrings.S3
  */
  trait CodeBuildCacheType extends StObject
  object CodeBuildCacheType {
    
    inline def LOCAL: typingsJapgolly.awsLambda.awsLambdaStrings.LOCAL = "LOCAL".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.LOCAL]
    
    inline def NO_CACHE: typingsJapgolly.awsLambda.awsLambdaStrings.NO_CACHE = "NO_CACHE".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.NO_CACHE]
    
    inline def S3: typingsJapgolly.awsLambda.awsLambdaStrings.S3 = "S3".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.S3]
  }
  
  trait CodeBuildCloudWatchStateEvent
    extends StObject
       with EventBridgeEvent[`CodeBuild Build State Change`, CodeBuildStateEventDetail] {
    
    @JSName("source")
    var source_CodeBuildCloudWatchStateEvent: awsDotcodebuild
  }
  object CodeBuildCloudWatchStateEvent {
    
    inline def apply(
      account: String,
      detail: CodeBuildStateEventDetail,
      id: String,
      region: String,
      resources: js.Array[String],
      time: String,
      version: String
    ): CodeBuildCloudWatchStateEvent = {
      val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], source = "aws.codebuild", time = time.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("detail-type")("CodeBuild Build State Change")
      __obj.asInstanceOf[CodeBuildCloudWatchStateEvent]
    }
    
    extension [Self <: CodeBuildCloudWatchStateEvent](x: Self) {
      
      inline def setSource(value: awsDotcodebuild): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  type CodeBuildCloudWatchStateHandler = EventBridgeHandler[`CodeBuild Build State Change`, CodeBuildStateEventDetail, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsLambda.awsLambdaStrings.BUILD_GENERAL1_SMALL
    - typingsJapgolly.awsLambda.awsLambdaStrings.BUILD_GENERAL1_MEDIUM
    - typingsJapgolly.awsLambda.awsLambdaStrings.BUILD_GENERAL1_LARGE
    - typingsJapgolly.awsLambda.awsLambdaStrings.BUILD_GENERAL1_2XLARGE
  */
  trait CodeBuildEnvironmentComputeType extends StObject
  object CodeBuildEnvironmentComputeType {
    
    inline def BUILD_GENERAL1_2XLARGE: typingsJapgolly.awsLambda.awsLambdaStrings.BUILD_GENERAL1_2XLARGE = "BUILD_GENERAL1_2XLARGE".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.BUILD_GENERAL1_2XLARGE]
    
    inline def BUILD_GENERAL1_LARGE: typingsJapgolly.awsLambda.awsLambdaStrings.BUILD_GENERAL1_LARGE = "BUILD_GENERAL1_LARGE".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.BUILD_GENERAL1_LARGE]
    
    inline def BUILD_GENERAL1_MEDIUM: typingsJapgolly.awsLambda.awsLambdaStrings.BUILD_GENERAL1_MEDIUM = "BUILD_GENERAL1_MEDIUM".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.BUILD_GENERAL1_MEDIUM]
    
    inline def BUILD_GENERAL1_SMALL: typingsJapgolly.awsLambda.awsLambdaStrings.BUILD_GENERAL1_SMALL = "BUILD_GENERAL1_SMALL".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.BUILD_GENERAL1_SMALL]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsLambda.awsLambdaStrings.CODEBUILD
    - typingsJapgolly.awsLambda.awsLambdaStrings.SERVICE_ROLE
  */
  trait CodeBuildEnvironmentPullCredentialsType extends StObject
  object CodeBuildEnvironmentPullCredentialsType {
    
    inline def CODEBUILD: typingsJapgolly.awsLambda.awsLambdaStrings.CODEBUILD = "CODEBUILD".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.CODEBUILD]
    
    inline def SERVICE_ROLE: typingsJapgolly.awsLambda.awsLambdaStrings.SERVICE_ROLE = "SERVICE_ROLE".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.SERVICE_ROLE]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsLambda.awsLambdaStrings.LINUX_CONTAINER
    - typingsJapgolly.awsLambda.awsLambdaStrings.LINUX_GPU_CONTAINER
    - typingsJapgolly.awsLambda.awsLambdaStrings.WINDOWS_CONTAINER
    - typingsJapgolly.awsLambda.awsLambdaStrings.ARM_CONTAINER
  */
  trait CodeBuildEnvironmentType extends StObject
  object CodeBuildEnvironmentType {
    
    inline def ARM_CONTAINER: typingsJapgolly.awsLambda.awsLambdaStrings.ARM_CONTAINER = "ARM_CONTAINER".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.ARM_CONTAINER]
    
    inline def LINUX_CONTAINER: typingsJapgolly.awsLambda.awsLambdaStrings.LINUX_CONTAINER = "LINUX_CONTAINER".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.LINUX_CONTAINER]
    
    inline def LINUX_GPU_CONTAINER: typingsJapgolly.awsLambda.awsLambdaStrings.LINUX_GPU_CONTAINER = "LINUX_GPU_CONTAINER".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.LINUX_GPU_CONTAINER]
    
    inline def WINDOWS_CONTAINER: typingsJapgolly.awsLambda.awsLambdaStrings.WINDOWS_CONTAINER = "WINDOWS_CONTAINER".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.WINDOWS_CONTAINER]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsLambda.awsLambdaStrings.PARAMETER_STORE
    - typingsJapgolly.awsLambda.awsLambdaStrings.PLAINTEXT
    - typingsJapgolly.awsLambda.awsLambdaStrings.SECRETS_MANAGER
  */
  trait CodeBuildEnvironmentVariableType extends StObject
  object CodeBuildEnvironmentVariableType {
    
    inline def PARAMETER_STORE: typingsJapgolly.awsLambda.awsLambdaStrings.PARAMETER_STORE = "PARAMETER_STORE".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.PARAMETER_STORE]
    
    inline def PLAINTEXT: typingsJapgolly.awsLambda.awsLambdaStrings.PLAINTEXT = "PLAINTEXT".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.PLAINTEXT]
    
    inline def SECRETS_MANAGER: typingsJapgolly.awsLambda.awsLambdaStrings.SECRETS_MANAGER = "SECRETS_MANAGER".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.SECRETS_MANAGER]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsLambda.awsLambdaStrings.TIMED_OUT
    - typingsJapgolly.awsLambda.awsLambdaStrings.STOPPED
    - typingsJapgolly.awsLambda.awsLambdaStrings.FAILED
    - typingsJapgolly.awsLambda.awsLambdaStrings.SUCCEEDED
    - typingsJapgolly.awsLambda.awsLambdaStrings.FAULT
    - typingsJapgolly.awsLambda.awsLambdaStrings.CLIENT_ERROR
  */
  trait CodeBuildPhaseStatusType extends StObject
  object CodeBuildPhaseStatusType {
    
    inline def CLIENT_ERROR: typingsJapgolly.awsLambda.awsLambdaStrings.CLIENT_ERROR = "CLIENT_ERROR".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.CLIENT_ERROR]
    
    inline def FAILED: typingsJapgolly.awsLambda.awsLambdaStrings.FAILED = "FAILED".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.FAILED]
    
    inline def FAULT: typingsJapgolly.awsLambda.awsLambdaStrings.FAULT = "FAULT".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.FAULT]
    
    inline def STOPPED: typingsJapgolly.awsLambda.awsLambdaStrings.STOPPED = "STOPPED".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.STOPPED]
    
    inline def SUCCEEDED: typingsJapgolly.awsLambda.awsLambdaStrings.SUCCEEDED = "SUCCEEDED".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.SUCCEEDED]
    
    inline def TIMED_OUT: typingsJapgolly.awsLambda.awsLambdaStrings.TIMED_OUT = "TIMED_OUT".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.TIMED_OUT]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsLambda.awsLambdaStrings.COMPLETED
    - typingsJapgolly.awsLambda.awsLambdaStrings.FINALIZING
    - typingsJapgolly.awsLambda.awsLambdaStrings.UPLOAD_ARTIFACTS
    - typingsJapgolly.awsLambda.awsLambdaStrings.POST_BUILD
    - typingsJapgolly.awsLambda.awsLambdaStrings.BUILD
    - typingsJapgolly.awsLambda.awsLambdaStrings.PRE_BUILD
    - typingsJapgolly.awsLambda.awsLambdaStrings.INSTALL
    - typingsJapgolly.awsLambda.awsLambdaStrings.QUEUED
    - typingsJapgolly.awsLambda.awsLambdaStrings.DOWNLOAD_SOURCE
    - typingsJapgolly.awsLambda.awsLambdaStrings.PROVISIONING
    - typingsJapgolly.awsLambda.awsLambdaStrings.SUBMITTED
  */
  trait CodeBuildPhaseType extends StObject
  object CodeBuildPhaseType {
    
    inline def BUILD: typingsJapgolly.awsLambda.awsLambdaStrings.BUILD = "BUILD".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.BUILD]
    
    inline def COMPLETED: typingsJapgolly.awsLambda.awsLambdaStrings.COMPLETED = "COMPLETED".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.COMPLETED]
    
    inline def DOWNLOAD_SOURCE: typingsJapgolly.awsLambda.awsLambdaStrings.DOWNLOAD_SOURCE = "DOWNLOAD_SOURCE".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.DOWNLOAD_SOURCE]
    
    inline def FINALIZING: typingsJapgolly.awsLambda.awsLambdaStrings.FINALIZING = "FINALIZING".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.FINALIZING]
    
    inline def INSTALL: typingsJapgolly.awsLambda.awsLambdaStrings.INSTALL = "INSTALL".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.INSTALL]
    
    inline def POST_BUILD: typingsJapgolly.awsLambda.awsLambdaStrings.POST_BUILD = "POST_BUILD".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.POST_BUILD]
    
    inline def PRE_BUILD: typingsJapgolly.awsLambda.awsLambdaStrings.PRE_BUILD = "PRE_BUILD".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.PRE_BUILD]
    
    inline def PROVISIONING: typingsJapgolly.awsLambda.awsLambdaStrings.PROVISIONING = "PROVISIONING".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.PROVISIONING]
    
    inline def QUEUED: typingsJapgolly.awsLambda.awsLambdaStrings.QUEUED = "QUEUED".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.QUEUED]
    
    inline def SUBMITTED: typingsJapgolly.awsLambda.awsLambdaStrings.SUBMITTED = "SUBMITTED".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.SUBMITTED]
    
    inline def UPLOAD_ARTIFACTS: typingsJapgolly.awsLambda.awsLambdaStrings.UPLOAD_ARTIFACTS = "UPLOAD_ARTIFACTS".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.UPLOAD_ARTIFACTS]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsLambda.awsLambdaStrings.CODECOMMIT
    - typingsJapgolly.awsLambda.awsLambdaStrings.CODEPIPELINE
    - typingsJapgolly.awsLambda.awsLambdaStrings.GITHUB
    - typingsJapgolly.awsLambda.awsLambdaStrings.GITHUB_ENTERPRISE
    - typingsJapgolly.awsLambda.awsLambdaStrings.BITBUCKET
    - typingsJapgolly.awsLambda.awsLambdaStrings.S3
    - typingsJapgolly.awsLambda.awsLambdaStrings.NO_SOURCE
  */
  trait CodeBuildSourceLocationType extends StObject
  object CodeBuildSourceLocationType {
    
    inline def BITBUCKET: typingsJapgolly.awsLambda.awsLambdaStrings.BITBUCKET = "BITBUCKET".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.BITBUCKET]
    
    inline def CODECOMMIT: typingsJapgolly.awsLambda.awsLambdaStrings.CODECOMMIT = "CODECOMMIT".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.CODECOMMIT]
    
    inline def CODEPIPELINE: typingsJapgolly.awsLambda.awsLambdaStrings.CODEPIPELINE = "CODEPIPELINE".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.CODEPIPELINE]
    
    inline def GITHUB: typingsJapgolly.awsLambda.awsLambdaStrings.GITHUB = "GITHUB".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.GITHUB]
    
    inline def GITHUB_ENTERPRISE: typingsJapgolly.awsLambda.awsLambdaStrings.GITHUB_ENTERPRISE = "GITHUB_ENTERPRISE".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.GITHUB_ENTERPRISE]
    
    inline def NO_SOURCE: typingsJapgolly.awsLambda.awsLambdaStrings.NO_SOURCE = "NO_SOURCE".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.NO_SOURCE]
    
    inline def S3: typingsJapgolly.awsLambda.awsLambdaStrings.S3 = "S3".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.S3]
  }
  
  trait CodeBuildStateEventDetail extends StObject {
    
    var `additional-information`: Artifact
    
    var `build-id`: String
    
    var `build-status`: CodeBuildStateType
    
    var `current-phase`: CodeBuildPhaseType
    
    var `current-phase-context`: String
    
    var `project-name`: String
    
    var version: String
  }
  object CodeBuildStateEventDetail {
    
    inline def apply(
      `additional-information`: Artifact,
      `build-id`: String,
      `build-status`: CodeBuildStateType,
      `current-phase`: CodeBuildPhaseType,
      `current-phase-context`: String,
      `project-name`: String,
      version: String
    ): CodeBuildStateEventDetail = {
      val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("additional-information")(`additional-information`.asInstanceOf[js.Any])
      __obj.updateDynamic("build-id")(`build-id`.asInstanceOf[js.Any])
      __obj.updateDynamic("build-status")(`build-status`.asInstanceOf[js.Any])
      __obj.updateDynamic("current-phase")(`current-phase`.asInstanceOf[js.Any])
      __obj.updateDynamic("current-phase-context")(`current-phase-context`.asInstanceOf[js.Any])
      __obj.updateDynamic("project-name")(`project-name`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CodeBuildStateEventDetail]
    }
    
    extension [Self <: CodeBuildStateEventDetail](x: Self) {
      
      inline def `setAdditional-information`(value: Artifact): Self = StObject.set(x, "additional-information", value.asInstanceOf[js.Any])
      
      inline def `setBuild-id`(value: String): Self = StObject.set(x, "build-id", value.asInstanceOf[js.Any])
      
      inline def `setBuild-status`(value: CodeBuildStateType): Self = StObject.set(x, "build-status", value.asInstanceOf[js.Any])
      
      inline def `setCurrent-phase`(value: CodeBuildPhaseType): Self = StObject.set(x, "current-phase", value.asInstanceOf[js.Any])
      
      inline def `setCurrent-phase-context`(value: String): Self = StObject.set(x, "current-phase-context", value.asInstanceOf[js.Any])
      
      inline def `setProject-name`(value: String): Self = StObject.set(x, "project-name", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsLambda.awsLambdaStrings.IN_PROGRESS
    - typingsJapgolly.awsLambda.awsLambdaStrings.SUCCEEDED
    - typingsJapgolly.awsLambda.awsLambdaStrings.FAILED
    - typingsJapgolly.awsLambda.awsLambdaStrings.STOPPED
  */
  trait CodeBuildStateType extends StObject
  object CodeBuildStateType {
    
    inline def FAILED: typingsJapgolly.awsLambda.awsLambdaStrings.FAILED = "FAILED".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.FAILED]
    
    inline def IN_PROGRESS: typingsJapgolly.awsLambda.awsLambdaStrings.IN_PROGRESS = "IN_PROGRESS".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.IN_PROGRESS]
    
    inline def STOPPED: typingsJapgolly.awsLambda.awsLambdaStrings.STOPPED = "STOPPED".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.STOPPED]
    
    inline def SUCCEEDED: typingsJapgolly.awsLambda.awsLambdaStrings.SUCCEEDED = "SUCCEEDED".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.SUCCEEDED]
  }
}
