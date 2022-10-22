package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryOrderPagePerpageQSort extends StObject {
  
  /**
    * Find repositories via various criteria. This method returns up to 100 results [per page](https://docs.github.com/rest/overview/resources-in-the-rest-api#pagination).
    *
    * When searching for repositories, you can get text match metadata for the **name** and **description** fields when you pass the `text-match` media type. For more details about how to receive highlighted search results, see [Text match metadata](https://docs.github.com/rest/reference/search#text-match-metadata).
    *
    * For example, if you want to search for popular Tetris repositories written in assembly code, your query might look like this:
    *
    * `q=tetris+language:assembly&sort=stars&order=desc`
    *
    * This query searches for repositories with the word `tetris` in the name, the description, or the README. The results are limited to repositories where the primary language is assembly. The results are sorted by stars in descending order, so that the most popular repositories appear first in the search results.
    */
  var get: ParametersQueryOrderPagePerpageQSort
}
object GetParametersQueryOrderPagePerpageQSort {
  
  inline def apply(get: ParametersQueryOrderPagePerpageQSort): GetParametersQueryOrderPagePerpageQSort = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryOrderPagePerpageQSort]
  }
  
  extension [Self <: GetParametersQueryOrderPagePerpageQSort](x: Self) {
    
    inline def setGet(value: ParametersQueryOrderPagePerpageQSort): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
