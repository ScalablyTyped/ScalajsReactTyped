package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryQRepositoryid extends StObject {
  
  /**
    * Find labels in a repository with names or descriptions that match search keywords. Returns up to 100 results [per page](https://docs.github.com/rest/overview/resources-in-the-rest-api#pagination).
    *
    * When searching for labels, you can get text match metadata for the label **name** and **description** fields when you pass the `text-match` media type. For more details about how to receive highlighted search results, see [Text match metadata](https://docs.github.com/rest/reference/search#text-match-metadata).
    *
    * For example, if you want to find labels in the `linguist` repository that match `bug`, `defect`, or `enhancement`. Your query might look like this:
    *
    * `q=bug+defect+enhancement&repository_id=64778136`
    *
    * The labels that best match the query appear first in the search results.
    */
  var get: ParametersQueryQRepositoryid
}
object GetParametersQueryQRepositoryid {
  
  inline def apply(get: ParametersQueryQRepositoryid): GetParametersQueryQRepositoryid = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryQRepositoryid]
  }
  
  extension [Self <: GetParametersQueryQRepositoryid](x: Self) {
    
    inline def setGet(value: ParametersQueryQRepositoryid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
