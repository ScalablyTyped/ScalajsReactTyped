package typingsJapgolly.gitlab.snippetsMod

import typingsJapgolly.gitlab.infrastructureMod.BaseService
import typingsJapgolly.gitlab.publicbooleanPaginatedReq
import typingsJapgolly.gitlab.requestHelperMod.BaseRequestOptions
import typingsJapgolly.gitlab.requestHelperMod.GetResponse
import typingsJapgolly.gitlab.requestHelperMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/Snippets", "Snippets")
@js.native
class Snippets () extends BaseService {
  def all(hasPublicOptions: publicbooleanPaginatedReq): js.Promise[GetResponse] = js.native
  def content(snippetId: Double): js.Promise[GetResponse] = js.native
  def content(snippetId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  def create(title: String, fileName: String, content: String, visibility: SnippetVisibility): js.Promise[js.Object] = js.native
  def create(
    title: String,
    fileName: String,
    content: String,
    visibility: SnippetVisibility,
    options: BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def edit(snippetId: Double): js.Promise[js.Object] = js.native
  def edit(snippetId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def remove(snippetId: Double): js.Promise[js.Object] = js.native
  def remove(snippetId: Double, options: Sudo): js.Promise[js.Object] = js.native
  def show(snippetId: Double): js.Promise[GetResponse] = js.native
  def show(snippetId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  def userAgentDetails(snippetId: Double): js.Promise[GetResponse] = js.native
  def userAgentDetails(snippetId: Double, options: Sudo): js.Promise[GetResponse] = js.native
}

