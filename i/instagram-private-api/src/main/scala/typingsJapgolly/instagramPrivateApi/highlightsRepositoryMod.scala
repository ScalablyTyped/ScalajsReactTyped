package typingsJapgolly.instagramPrivateApi

import typingsJapgolly.instagramPrivateApi.createHighlightsReelOptionsMod.CreateHighlightsReelOptions
import typingsJapgolly.instagramPrivateApi.editHighlightsReelOptionsMod.EditHighlightsReelOptions
import typingsJapgolly.instagramPrivateApi.highlightsRepositoryCreateReelResponseMod.HighlightsRepositoryCreateReelResponseRootObject
import typingsJapgolly.instagramPrivateApi.highlightsRepositoryEditReelResponseMod.HighlightsRepositoryEditReelResponseRootObject
import typingsJapgolly.instagramPrivateApi.highlightsRepositoryHighlightsTrayResponseMod.HighlightsRepositoryHighlightsTrayResponseRootObject
import typingsJapgolly.instagramPrivateApi.repositoryMod.Repository
import typingsJapgolly.instagramPrivateApi.statusResponseMod.StatusResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/repositories/highlights.repository", JSImport.Namespace)
@js.native
object highlightsRepositoryMod extends js.Object {
  @js.native
  class HighlightsRepository () extends Repository {
    def createReel(options: CreateHighlightsReelOptions): js.Promise[HighlightsRepositoryCreateReelResponseRootObject] = js.native
    def deleteReel(highlightId: String): js.Promise[StatusResponse] = js.native
    def editReel(options: EditHighlightsReelOptions): js.Promise[HighlightsRepositoryEditReelResponseRootObject] = js.native
    def highlightsTray(userId: String): js.Promise[HighlightsRepositoryHighlightsTrayResponseRootObject] = js.native
    def highlightsTray(userId: Double): js.Promise[HighlightsRepositoryHighlightsTrayResponseRootObject] = js.native
  }
  
}

