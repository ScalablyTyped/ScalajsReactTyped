package typingsJapgolly.gitlab.jobsMod

import typingsJapgolly.gitlab.infrastructureMod.BaseService
import typingsJapgolly.gitlab.requestHelperMod.GetResponse
import typingsJapgolly.gitlab.requestHelperMod.PaginatedRequestOptions
import typingsJapgolly.gitlab.requestHelperMod.Sudo
import typingsJapgolly.gitlab.scopeJobScopeSudo
import typingsJapgolly.gitlab.streambooleanBaseRequestO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/Jobs", "Jobs")
@js.native
class Jobs () extends BaseService {
  def all(projectId: String): js.Promise[GetResponse] = js.native
  def all(projectId: String, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
  def all(projectId: Double): js.Promise[GetResponse] = js.native
  def all(projectId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
  def cancel(projectId: String, jobId: Double): js.Promise[js.Object] = js.native
  def cancel(projectId: String, jobId: Double, options: Sudo): js.Promise[js.Object] = js.native
  def cancel(projectId: Double, jobId: Double): js.Promise[js.Object] = js.native
  def cancel(projectId: Double, jobId: Double, options: Sudo): js.Promise[js.Object] = js.native
  def downloadLatestArtifactFile(projectId: String, ref: String, name: String, hasStreamOptions: streambooleanBaseRequestO): js.Any = js.native
  def downloadLatestArtifactFile(projectId: Double, ref: String, name: String, hasStreamOptions: streambooleanBaseRequestO): js.Any = js.native
  def downloadSingleArtifactFile(
    projectId: String,
    jobId: Double,
    artifactPath: String,
    hasStreamOptions: streambooleanBaseRequestO
  ): js.Any = js.native
  def downloadSingleArtifactFile(
    projectId: Double,
    jobId: Double,
    artifactPath: String,
    hasStreamOptions: streambooleanBaseRequestO
  ): js.Any = js.native
  def downloadSingleArtifactFileFromRef(
    projectId: String,
    ref: String,
    artifactPath: String,
    name: String,
    hasStreamOptions: streambooleanBaseRequestO
  ): js.Any = js.native
  def downloadSingleArtifactFileFromRef(
    projectId: Double,
    ref: String,
    artifactPath: String,
    name: String,
    hasStreamOptions: streambooleanBaseRequestO
  ): js.Any = js.native
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
  def showPipelineJobs(projectId: String, pipelineId: Double, options: scopeJobScopeSudo): js.Promise[GetResponse] = js.native
  def showPipelineJobs(projectId: Double, pipelineId: Double, options: scopeJobScopeSudo): js.Promise[GetResponse] = js.native
}

