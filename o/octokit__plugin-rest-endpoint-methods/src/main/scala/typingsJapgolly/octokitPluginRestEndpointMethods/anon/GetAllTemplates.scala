package typingsJapgolly.octokitPluginRestEndpointMethods.anon

import typingsJapgolly.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsJapgolly.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsJapgolly.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsJapgolly.octokitTypes.distTypesRequestParametersMod.RequestParameters
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAllTemplates extends StObject {
  
  /**
    * List all templates available to pass as an option when [creating a repository](https://docs.github.com/rest/reference/repos#create-a-repository-for-the-authenticated-user).
    */
  def getAllTemplates(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /gitignore/templates']['response'] */ js.Any
  ]
  def getAllTemplates(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /gitignore/templates']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /gitignore/templates']['response'] */ js.Any
  ]
  /**
    * List all templates available to pass as an option when [creating a repository](https://docs.github.com/rest/reference/repos#create-a-repository-for-the-authenticated-user).
    */
  @JSName("getAllTemplates")
  var getAllTemplates_Original: `300`
  
  /**
    * The API also allows fetching the source of a single template.
    * Use the raw [media type](https://docs.github.com/rest/overview/media-types/) to get the raw contents.
    */
  def getTemplate(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /gitignore/templates/{name}']['response'] */ js.Any
  ]
  def getTemplate(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /gitignore/templates/{name}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /gitignore/templates/{name}']['response'] */ js.Any
  ]
  /**
    * The API also allows fetching the source of a single template.
    * Use the raw [media type](https://docs.github.com/rest/overview/media-types/) to get the raw contents.
    */
  @JSName("getTemplate")
  var getTemplate_Original: `301`
}
object GetAllTemplates {
  
  inline def apply(getAllTemplates: `300`, getTemplate: `301`): GetAllTemplates = {
    val __obj = js.Dynamic.literal(getAllTemplates = getAllTemplates.asInstanceOf[js.Any], getTemplate = getTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAllTemplates]
  }
  
  extension [Self <: GetAllTemplates](x: Self) {
    
    inline def setGetAllTemplates(value: `300`): Self = StObject.set(x, "getAllTemplates", value.asInstanceOf[js.Any])
    
    inline def setGetTemplate(value: `301`): Self = StObject.set(x, "getTemplate", value.asInstanceOf[js.Any])
  }
}
