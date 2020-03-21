package typingsJapgolly.octokitPluginRestEndpointMethods

import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.EmptyParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.GitignoreGetTemplateParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonListTemplates extends js.Object {
  /**
    * The API also allows fetching the source of a single template.
    *
    * Use the raw [media type](https://developer.github.com/v3/media/) to get the raw contents.
    */
  @JSName("getTemplate")
  var getTemplate_Original: Anon136 = js.native
  /**
    * List all templates available to pass as an option when [creating a repository](https://developer.github.com/v3/repos/#create).
    */
  @JSName("listTemplates")
  var listTemplates_Original: Anon29 = js.native
  /**
    * The API also allows fetching the source of a single template.
    *
    * Use the raw [media type](https://developer.github.com/v3/media/) to get the raw contents.
    */
  def getTemplate(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<GitignoreGetTemplateResponse> */ _
  ] = js.native
  def getTemplate(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with GitignoreGetTemplateParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<GitignoreGetTemplateResponse> */ _
  ] = js.native
  /**
    * List all templates available to pass as an option when [creating a repository](https://developer.github.com/v3/repos/#create).
    */
  def listTemplates(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<UsersListBlockedResponse> */ _
  ] = js.native
  def listTemplates(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with EmptyParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<UsersListBlockedResponse> */ _
  ] = js.native
}

