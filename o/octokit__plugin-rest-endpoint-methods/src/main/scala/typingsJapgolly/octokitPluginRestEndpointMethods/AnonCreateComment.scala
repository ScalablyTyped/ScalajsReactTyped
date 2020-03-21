package typingsJapgolly.octokitPluginRestEndpointMethods

import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.AnyResponse
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.GistsCheckIsStarredParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.GistsCreateCommentParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.GistsCreateParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.GistsDeleteCommentParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.GistsDeleteParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.GistsForkParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.GistsGetCommentParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.GistsGetParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.GistsGetRevisionParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.GistsListCommentsParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.GistsListCommitsParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.GistsListForksParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.GistsListParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.GistsListPublicForUserParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.GistsListPublicParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.GistsListStarredParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.GistsStarParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.GistsUnstarParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.GistsUpdateCommentParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.GistsUpdateParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCreateComment extends js.Object {
  @JSName("checkIsStarred")
  var checkIsStarred_Original: Anon102 = js.native
  @JSName("createComment")
  var createComment_Original: Anon104 = js.native
  /**
    * Allows you to add a new gist with one or more files.
    *
    * **Note:** Don't name your files "gistfile" with a numerical suffix. This is the format of the automatic naming scheme that Gist uses internally.
    */
  @JSName("create")
  var create_Original: Anon103 = js.native
  @JSName("deleteComment")
  var deleteComment_Original: Anon106 = js.native
  @JSName("delete")
  var delete_Original: Anon105 = js.native
  /**
    * **Note**: This was previously `/gists/:gist_id/fork`.
    */
  @JSName("fork")
  var fork_Original: Anon107 = js.native
  @JSName("getComment")
  var getComment_Original: Anon109 = js.native
  @JSName("getRevision")
  var getRevision_Original: Anon110 = js.native
  @JSName("get")
  var get_Original: Anon108 = js.native
  @JSName("listComments")
  var listComments_Original: Anon112 = js.native
  @JSName("listCommits")
  var listCommits_Original: Anon113 = js.native
  @JSName("listForks")
  var listForks_Original: Anon114 = js.native
  @JSName("listPublicForUser")
  var listPublicForUser_Original: Anon116 = js.native
  /**
    * List all public gists sorted by most recently updated to least recently updated.
    *
    * Note: With [pagination](https://developer.github.com/v3/#pagination), you can fetch up to 3000 gists. For example, you can fetch 100 pages with 30 gists per page or 30 pages with 100 gists per page.
    */
  @JSName("listPublic")
  var listPublic_Original: Anon115 = js.native
  /**
    * List the authenticated user's starred gists:
    */
  @JSName("listStarred")
  var listStarred_Original: Anon117 = js.native
  @JSName("list")
  var list_Original: Anon111 = js.native
  /**
    * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    */
  @JSName("star")
  var star_Original: Anon118 = js.native
  @JSName("unstar")
  var unstar_Original: Anon119 = js.native
  @JSName("updateComment")
  var updateComment_Original: Anon121 = js.native
  /**
    * Allows you to update or delete a gist file and rename gist files. Files from the previous version of the gist that aren't explicitly changed during an edit are unchanged.
    */
  @JSName("update")
  var update_Original: Anon120 = js.native
  def checkIsStarred(): js.Promise[AnyResponse] = js.native
  def checkIsStarred(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with GistsCheckIsStarredParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * Allows you to add a new gist with one or more files.
    *
    * **Note:** Don't name your files "gistfile" with a numerical suffix. This is the format of the automatic naming scheme that Gist uses internally.
    */
  def create(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<GistsCreateResponse> */ _
  ] = js.native
  def create(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with GistsCreateParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<GistsCreateResponse> */ _
  ] = js.native
  def createComment(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<GistsCreateCommentResponse> */ _
  ] = js.native
  def createComment(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with GistsCreateCommentParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<GistsCreateCommentResponse> */ _
  ] = js.native
  def delete(): js.Promise[AnyResponse] = js.native
  def delete(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with GistsDeleteParams
  ): js.Promise[AnyResponse] = js.native
  def deleteComment(): js.Promise[AnyResponse] = js.native
  def deleteComment(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with GistsDeleteCommentParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * **Note**: This was previously `/gists/:gist_id/fork`.
    */
  def fork(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<GistsForkResponse> */ _
  ] = js.native
  def fork(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with GistsForkParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<GistsForkResponse> */ _
  ] = js.native
  def get(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<GistsGetResponse> */ _
  ] = js.native
  def get(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with GistsGetParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<GistsGetResponse> */ _
  ] = js.native
  def getComment(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<GistsGetCommentResponse> */ _
  ] = js.native
  def getComment(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with GistsGetCommentParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<GistsGetCommentResponse> */ _
  ] = js.native
  def getRevision(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<GistsGetRevisionResponse> */ _
  ] = js.native
  def getRevision(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with GistsGetRevisionParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<GistsGetRevisionResponse> */ _
  ] = js.native
  def list(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<GistsListResponse> */ _
  ] = js.native
  def list(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with GistsListParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<GistsListResponse> */ _
  ] = js.native
  def listComments(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<GistsListCommentsResponse> */ _
  ] = js.native
  def listComments(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with GistsListCommentsParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<GistsListCommentsResponse> */ _
  ] = js.native
  def listCommits(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<GistsListCommitsResponse> */ _
  ] = js.native
  def listCommits(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with GistsListCommitsParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<GistsListCommitsResponse> */ _
  ] = js.native
  def listForks(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<GistsListForksResponse> */ _
  ] = js.native
  def listForks(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with GistsListForksParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<GistsListForksResponse> */ _
  ] = js.native
  /**
    * List all public gists sorted by most recently updated to least recently updated.
    *
    * Note: With [pagination](https://developer.github.com/v3/#pagination), you can fetch up to 3000 gists. For example, you can fetch 100 pages with 30 gists per page or 30 pages with 100 gists per page.
    */
  def listPublic(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<GistsListPublicResponse> */ _
  ] = js.native
  def listPublic(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with GistsListPublicParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<GistsListPublicResponse> */ _
  ] = js.native
  def listPublicForUser(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<GistsListPublicForUserResponse> */ _
  ] = js.native
  def listPublicForUser(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with GistsListPublicForUserParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<GistsListPublicForUserResponse> */ _
  ] = js.native
  /**
    * List the authenticated user's starred gists:
    */
  def listStarred(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<GistsListStarredResponse> */ _
  ] = js.native
  def listStarred(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with GistsListStarredParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<GistsListStarredResponse> */ _
  ] = js.native
  /**
    * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    */
  def star(): js.Promise[AnyResponse] = js.native
  def star(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with GistsStarParams
  ): js.Promise[AnyResponse] = js.native
  def unstar(): js.Promise[AnyResponse] = js.native
  def unstar(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with GistsUnstarParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * Allows you to update or delete a gist file and rename gist files. Files from the previous version of the gist that aren't explicitly changed during an edit are unchanged.
    */
  def update(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<GistsUpdateResponse> */ _
  ] = js.native
  def update(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with GistsUpdateParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<GistsUpdateResponse> */ _
  ] = js.native
  def updateComment(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<GistsUpdateCommentResponse> */ _
  ] = js.native
  def updateComment(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with GistsUpdateCommentParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<GistsUpdateCommentResponse> */ _
  ] = js.native
}

