package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryPerpageQString extends StObject {
  
  /**
    * Find users via various criteria. This method returns up to 100 results [per page](https://docs.github.com/rest/overview/resources-in-the-rest-api#pagination).
    *
    * When searching for users, you can get text match metadata for the issue **login**, public **email**, and **name** fields when you pass the `text-match` media type. For more details about highlighting search results, see [Text match metadata](https://docs.github.com/rest/reference/search#text-match-metadata). For more details about how to receive highlighted search results, see [Text match metadata](https://docs.github.com/rest/reference/search#text-match-metadata).
    *
    * For example, if you're looking for a list of popular users, you might try this query:
    *
    * `q=tom+repos:%3E42+followers:%3E1000`
    *
    * This query searches for users with the name `tom`. The results are restricted to users with more than 42 repositories and over 1,000 followers.
    */
  var get: ParametersQueryPerpageQString
}
object GetParametersQueryPerpageQString {
  
  inline def apply(get: ParametersQueryPerpageQString): GetParametersQueryPerpageQString = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryPerpageQString]
  }
  
  extension [Self <: GetParametersQueryPerpageQString](x: Self) {
    
    inline def setGet(value: ParametersQueryPerpageQString): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
