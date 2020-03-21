package typingsJapgolly.gitlab.projectImportExportMod

import typingsJapgolly.gitlab.infrastructureMod.BaseService
import typingsJapgolly.gitlab.requestHelperMod.BaseRequestOptions
import typingsJapgolly.gitlab.requestHelperMod.GetResponse
import typingsJapgolly.gitlab.requestHelperMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/ProjectImportExport", "ProjectImportExport")
@js.native
class ProjectImportExport () extends BaseService {
  def download(projectId: String): js.Promise[GetResponse] = js.native
  def download(projectId: String, options: Sudo): js.Promise[GetResponse] = js.native
  def download(projectId: Double): js.Promise[GetResponse] = js.native
  def download(projectId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  def exportStatus(projectId: String): js.Promise[GetResponse] = js.native
  def exportStatus(projectId: String, options: Sudo): js.Promise[GetResponse] = js.native
  def exportStatus(projectId: Double): js.Promise[GetResponse] = js.native
  def exportStatus(projectId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  def `import`(content: String, path: String): js.Promise[js.Object] = js.native
  def `import`(content: String, path: String, options: Sudo): js.Promise[js.Object] = js.native
  def importStatus(projectId: String): js.Promise[GetResponse] = js.native
  def importStatus(projectId: String, options: Sudo): js.Promise[GetResponse] = js.native
  def importStatus(projectId: Double): js.Promise[GetResponse] = js.native
  def importStatus(projectId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  def schedule(projectId: String): js.Promise[js.Object] = js.native
  def schedule(projectId: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def schedule(projectId: Double): js.Promise[js.Object] = js.native
  def schedule(projectId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
}

