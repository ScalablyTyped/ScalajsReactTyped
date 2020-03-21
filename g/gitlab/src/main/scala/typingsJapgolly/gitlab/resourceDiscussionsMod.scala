package typingsJapgolly.gitlab

import typingsJapgolly.gitlab.baseServiceMod.BaseServiceOptions
import typingsJapgolly.gitlab.infrastructureMod.BaseService
import typingsJapgolly.gitlab.requestHelperMod.BaseRequestOptions
import typingsJapgolly.gitlab.requestHelperMod.GetResponse
import typingsJapgolly.gitlab.requestHelperMod.PaginatedRequestOptions
import typingsJapgolly.gitlab.requestHelperMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/templates/ResourceDiscussions", JSImport.Namespace)
@js.native
object resourceDiscussionsMod extends js.Object {
  @js.native
  class ResourceDiscussions protected () extends BaseService {
    def this(resourceType: String, resource2Type: String, options: BaseServiceOptions) = this()
    var resource2Type: String = js.native
    def addNote(resourceId: String, resource2Id: String, discussionId: Double, noteId: Double, content: String): js.Promise[js.Object] = js.native
    def addNote(
      resourceId: String,
      resource2Id: String,
      discussionId: Double,
      noteId: Double,
      content: String,
      options: BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    def addNote(resourceId: String, resource2Id: Double, discussionId: Double, noteId: Double, content: String): js.Promise[js.Object] = js.native
    def addNote(
      resourceId: String,
      resource2Id: Double,
      discussionId: Double,
      noteId: Double,
      content: String,
      options: BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    def addNote(resourceId: Double, resource2Id: String, discussionId: Double, noteId: Double, content: String): js.Promise[js.Object] = js.native
    def addNote(
      resourceId: Double,
      resource2Id: String,
      discussionId: Double,
      noteId: Double,
      content: String,
      options: BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    def addNote(resourceId: Double, resource2Id: Double, discussionId: Double, noteId: Double, content: String): js.Promise[js.Object] = js.native
    def addNote(
      resourceId: Double,
      resource2Id: Double,
      discussionId: Double,
      noteId: Double,
      content: String,
      options: BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    def all(resourceId: String, resource2Id: String): js.Promise[GetResponse] = js.native
    def all(resourceId: String, resource2Id: String, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def all(resourceId: String, resource2Id: Double): js.Promise[GetResponse] = js.native
    def all(resourceId: String, resource2Id: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def all(resourceId: Double, resource2Id: String): js.Promise[GetResponse] = js.native
    def all(resourceId: Double, resource2Id: String, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def all(resourceId: Double, resource2Id: Double): js.Promise[GetResponse] = js.native
    def all(resourceId: Double, resource2Id: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def create(resourceId: String, resource2Id: String, content: String): js.Promise[js.Object] = js.native
    def create(resourceId: String, resource2Id: String, content: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def create(resourceId: String, resource2Id: Double, content: String): js.Promise[js.Object] = js.native
    def create(resourceId: String, resource2Id: Double, content: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def create(resourceId: Double, resource2Id: String, content: String): js.Promise[js.Object] = js.native
    def create(resourceId: Double, resource2Id: String, content: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def create(resourceId: Double, resource2Id: Double, content: String): js.Promise[js.Object] = js.native
    def create(resourceId: Double, resource2Id: Double, content: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def editNote(resourceId: String, resource2Id: String, discussionId: Double, noteId: Double): js.Promise[js.Object] = js.native
    def editNote(
      resourceId: String,
      resource2Id: String,
      discussionId: Double,
      noteId: Double,
      options: BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    def editNote(resourceId: String, resource2Id: Double, discussionId: Double, noteId: Double): js.Promise[js.Object] = js.native
    def editNote(
      resourceId: String,
      resource2Id: Double,
      discussionId: Double,
      noteId: Double,
      options: BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    def editNote(resourceId: Double, resource2Id: String, discussionId: Double, noteId: Double): js.Promise[js.Object] = js.native
    def editNote(
      resourceId: Double,
      resource2Id: String,
      discussionId: Double,
      noteId: Double,
      options: BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    def editNote(resourceId: Double, resource2Id: Double, discussionId: Double, noteId: Double): js.Promise[js.Object] = js.native
    def editNote(
      resourceId: Double,
      resource2Id: Double,
      discussionId: Double,
      noteId: Double,
      options: BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    def removeNote(resourceId: String, resource2Id: String, discussionId: Double, noteId: Double): js.Promise[js.Object] = js.native
    def removeNote(resourceId: String, resource2Id: String, discussionId: Double, noteId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def removeNote(resourceId: String, resource2Id: Double, discussionId: Double, noteId: Double): js.Promise[js.Object] = js.native
    def removeNote(resourceId: String, resource2Id: Double, discussionId: Double, noteId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def removeNote(resourceId: Double, resource2Id: String, discussionId: Double, noteId: Double): js.Promise[js.Object] = js.native
    def removeNote(resourceId: Double, resource2Id: String, discussionId: Double, noteId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def removeNote(resourceId: Double, resource2Id: Double, discussionId: Double, noteId: Double): js.Promise[js.Object] = js.native
    def removeNote(resourceId: Double, resource2Id: Double, discussionId: Double, noteId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def show(resourceId: String, resource2Id: String, discussionId: Double): js.Promise[GetResponse] = js.native
    def show(resourceId: String, resource2Id: String, discussionId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def show(resourceId: String, resource2Id: Double, discussionId: Double): js.Promise[GetResponse] = js.native
    def show(resourceId: String, resource2Id: Double, discussionId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def show(resourceId: Double, resource2Id: String, discussionId: Double): js.Promise[GetResponse] = js.native
    def show(resourceId: Double, resource2Id: String, discussionId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def show(resourceId: Double, resource2Id: Double, discussionId: Double): js.Promise[GetResponse] = js.native
    def show(resourceId: Double, resource2Id: Double, discussionId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  }
  
}

