package typingsJapgolly.gitlab

import typingsJapgolly.gitlab.anon.scopeJobScopeundefinedSud
import typingsJapgolly.gitlab.anon.streambooleanundefinedBas
import typingsJapgolly.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseServiceOptions
import typingsJapgolly.gitlab.distTypesCoreInfrastructureMod.BaseService
import typingsJapgolly.gitlab.distTypesCoreInfrastructureRequestHelperMod.GetResponse
import typingsJapgolly.gitlab.distTypesCoreInfrastructureRequestHelperMod.PaginatedRequestOptions
import typingsJapgolly.gitlab.distTypesCoreInfrastructureRequestHelperMod.Sudo
import typingsJapgolly.gitlab.distTypesCoreServicesCommitsMod.CommitSchema
import typingsJapgolly.gitlab.distTypesCoreServicesPipelinesMod.PipelineSchema
import typingsJapgolly.gitlab.distTypesCoreServicesRunnersMod.RunnerSchema
import typingsJapgolly.gitlab.distTypesCoreServicesUsersMod.UserSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCoreServicesJobsMod {
  
  @JSImport("gitlab/dist/types/core/services/Jobs", "Jobs")
  @js.native
  open class Jobs () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def all(projectId: String): js.Promise[GetResponse] = js.native
    def all(projectId: String, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def all(projectId: Double): js.Promise[GetResponse] = js.native
    def all(projectId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    
    def cancel(projectId: String, jobId: Double): js.Promise[js.Object] = js.native
    def cancel(projectId: String, jobId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def cancel(projectId: Double, jobId: Double): js.Promise[js.Object] = js.native
    def cancel(projectId: Double, jobId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def downloadLatestArtifactFile(projectId: String, ref: String, name: String, hasStreamOptions: streambooleanundefinedBas): Any = js.native
    def downloadLatestArtifactFile(projectId: Double, ref: String, name: String, hasStreamOptions: streambooleanundefinedBas): Any = js.native
    
    def downloadSingleArtifactFile(
      projectId: String,
      jobId: Double,
      artifactPath: String,
      hasStreamOptions: streambooleanundefinedBas
    ): Any = js.native
    def downloadSingleArtifactFile(
      projectId: Double,
      jobId: Double,
      artifactPath: String,
      hasStreamOptions: streambooleanundefinedBas
    ): Any = js.native
    
    def downloadSingleArtifactFileFromRef(
      projectId: String,
      ref: String,
      artifactPath: String,
      name: String,
      hasStreamOptions: streambooleanundefinedBas
    ): Any = js.native
    def downloadSingleArtifactFileFromRef(
      projectId: Double,
      ref: String,
      artifactPath: String,
      name: String,
      hasStreamOptions: streambooleanundefinedBas
    ): Any = js.native
    
    def downloadTraceFile(projectId: String, jobId: Double): js.Promise[GetResponse] = js.native
    def downloadTraceFile(projectId: String, jobId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def downloadTraceFile(projectId: Double, jobId: Double): js.Promise[GetResponse] = js.native
    def downloadTraceFile(projectId: Double, jobId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    
    def erase(projectId: String, jobId: Double): js.Promise[js.Object] = js.native
    def erase(projectId: String, jobId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def erase(projectId: Double, jobId: Double): js.Promise[js.Object] = js.native
    def erase(projectId: Double, jobId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def eraseArtifacts(projectId: String, jobId: Double): js.Promise[js.Object] = js.native
    def eraseArtifacts(projectId: String, jobId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def eraseArtifacts(projectId: Double, jobId: Double): js.Promise[js.Object] = js.native
    def eraseArtifacts(projectId: Double, jobId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def keepArtifacts(projectId: String, jobId: Double): js.Promise[js.Object] = js.native
    def keepArtifacts(projectId: String, jobId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def keepArtifacts(projectId: Double, jobId: Double): js.Promise[js.Object] = js.native
    def keepArtifacts(projectId: Double, jobId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def play(projectId: String, jobId: Double): js.Promise[js.Object] = js.native
    def play(projectId: String, jobId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def play(projectId: Double, jobId: Double): js.Promise[js.Object] = js.native
    def play(projectId: Double, jobId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def retry(projectId: String, jobId: Double): js.Promise[js.Object] = js.native
    def retry(projectId: String, jobId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def retry(projectId: Double, jobId: Double): js.Promise[js.Object] = js.native
    def retry(projectId: Double, jobId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def show(projectId: String, jobId: Double): js.Promise[GetResponse] = js.native
    def show(projectId: String, jobId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def show(projectId: Double, jobId: Double): js.Promise[GetResponse] = js.native
    def show(projectId: Double, jobId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    
    def showPipelineJobs(projectId: String, pipelineId: Double): js.Promise[GetResponse] = js.native
    def showPipelineJobs(projectId: String, pipelineId: Double, options: scopeJobScopeundefinedSud): js.Promise[GetResponse] = js.native
    def showPipelineJobs(projectId: Double, pipelineId: Double): js.Promise[GetResponse] = js.native
    def showPipelineJobs(projectId: Double, pipelineId: Double, options: scopeJobScopeundefinedSud): js.Promise[GetResponse] = js.native
  }
  
  trait ArtifactSchema extends StObject {
    
    var file_format: js.UndefOr[String] = js.undefined
    
    var file_type: String
    
    var filename: String
    
    var size: Double
  }
  object ArtifactSchema {
    
    inline def apply(file_type: String, filename: String, size: Double): ArtifactSchema = {
      val __obj = js.Dynamic.literal(file_type = file_type.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArtifactSchema]
    }
    
    extension [Self <: ArtifactSchema](x: Self) {
      
      inline def setFile_format(value: String): Self = StObject.set(x, "file_format", value.asInstanceOf[js.Any])
      
      inline def setFile_formatUndefined: Self = StObject.set(x, "file_format", js.undefined)
      
      inline def setFile_type(value: String): Self = StObject.set(x, "file_type", value.asInstanceOf[js.Any])
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  trait JobSchema extends StObject {
    
    var allow_failure: Boolean
    
    var artifacts: js.Array[ArtifactSchema]
    
    var artifacts_expire_at: js.UndefOr[js.Date] = js.undefined
    
    var commit: CommitSchema
    
    var coverage: js.UndefOr[String] = js.undefined
    
    var created_at: js.Date
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var finished_at: js.UndefOr[js.Date] = js.undefined
    
    var id: Double
    
    var name: String
    
    var pipeline: PipelineSchema
    
    var ref: String
    
    var runner: RunnerSchema
    
    var stage: String
    
    var started_at: js.UndefOr[js.Date] = js.undefined
    
    var status: String
    
    var tag: Boolean
    
    var user: UserSchema
    
    var web_url: String
  }
  object JobSchema {
    
    inline def apply(
      allow_failure: Boolean,
      artifacts: js.Array[ArtifactSchema],
      commit: CommitSchema,
      created_at: js.Date,
      id: Double,
      name: String,
      pipeline: PipelineSchema,
      ref: String,
      runner: RunnerSchema,
      stage: String,
      status: String,
      tag: Boolean,
      user: UserSchema,
      web_url: String
    ): JobSchema = {
      val __obj = js.Dynamic.literal(allow_failure = allow_failure.asInstanceOf[js.Any], artifacts = artifacts.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pipeline = pipeline.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], runner = runner.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], web_url = web_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[JobSchema]
    }
    
    extension [Self <: JobSchema](x: Self) {
      
      inline def setAllow_failure(value: Boolean): Self = StObject.set(x, "allow_failure", value.asInstanceOf[js.Any])
      
      inline def setArtifacts(value: js.Array[ArtifactSchema]): Self = StObject.set(x, "artifacts", value.asInstanceOf[js.Any])
      
      inline def setArtifactsVarargs(value: ArtifactSchema*): Self = StObject.set(x, "artifacts", js.Array(value*))
      
      inline def setArtifacts_expire_at(value: js.Date): Self = StObject.set(x, "artifacts_expire_at", value.asInstanceOf[js.Any])
      
      inline def setArtifacts_expire_atUndefined: Self = StObject.set(x, "artifacts_expire_at", js.undefined)
      
      inline def setCommit(value: CommitSchema): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
      
      inline def setCoverage(value: String): Self = StObject.set(x, "coverage", value.asInstanceOf[js.Any])
      
      inline def setCoverageUndefined: Self = StObject.set(x, "coverage", js.undefined)
      
      inline def setCreated_at(value: js.Date): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setFinished_at(value: js.Date): Self = StObject.set(x, "finished_at", value.asInstanceOf[js.Any])
      
      inline def setFinished_atUndefined: Self = StObject.set(x, "finished_at", js.undefined)
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPipeline(value: PipelineSchema): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
      
      inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRunner(value: RunnerSchema): Self = StObject.set(x, "runner", value.asInstanceOf[js.Any])
      
      inline def setStage(value: String): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
      
      inline def setStarted_at(value: js.Date): Self = StObject.set(x, "started_at", value.asInstanceOf[js.Any])
      
      inline def setStarted_atUndefined: Self = StObject.set(x, "started_at", js.undefined)
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setTag(value: Boolean): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setUser(value: UserSchema): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setWeb_url(value: String): Self = StObject.set(x, "web_url", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.gitlab.gitlabStrings.created
    - typingsJapgolly.gitlab.gitlabStrings.pending
    - typingsJapgolly.gitlab.gitlabStrings.running
    - typingsJapgolly.gitlab.gitlabStrings.failed
    - typingsJapgolly.gitlab.gitlabStrings.success
    - typingsJapgolly.gitlab.gitlabStrings.canceled
    - typingsJapgolly.gitlab.gitlabStrings.skipped
    - typingsJapgolly.gitlab.gitlabStrings.manual
  */
  trait JobScope extends StObject
  object JobScope {
    
    inline def canceled: typingsJapgolly.gitlab.gitlabStrings.canceled = "canceled".asInstanceOf[typingsJapgolly.gitlab.gitlabStrings.canceled]
    
    inline def created: typingsJapgolly.gitlab.gitlabStrings.created = "created".asInstanceOf[typingsJapgolly.gitlab.gitlabStrings.created]
    
    inline def failed: typingsJapgolly.gitlab.gitlabStrings.failed = "failed".asInstanceOf[typingsJapgolly.gitlab.gitlabStrings.failed]
    
    inline def manual: typingsJapgolly.gitlab.gitlabStrings.manual = "manual".asInstanceOf[typingsJapgolly.gitlab.gitlabStrings.manual]
    
    inline def pending: typingsJapgolly.gitlab.gitlabStrings.pending = "pending".asInstanceOf[typingsJapgolly.gitlab.gitlabStrings.pending]
    
    inline def running: typingsJapgolly.gitlab.gitlabStrings.running = "running".asInstanceOf[typingsJapgolly.gitlab.gitlabStrings.running]
    
    inline def skipped: typingsJapgolly.gitlab.gitlabStrings.skipped = "skipped".asInstanceOf[typingsJapgolly.gitlab.gitlabStrings.skipped]
    
    inline def success: typingsJapgolly.gitlab.gitlabStrings.success = "success".asInstanceOf[typingsJapgolly.gitlab.gitlabStrings.success]
  }
}
