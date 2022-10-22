package typingsJapgolly.octokitOpenapiTypes.anon

import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.Plussign1
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.eyes
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.heart
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.hooray
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.laugh
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.rocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentPagePerpage extends StObject {
  
  /** Returns a single [reaction type](https://docs.github.com/rest/reference/reactions#reaction-types). Omit this parameter to list all reactions to a release. */
  var content: js.UndefOr[Plussign1 | laugh | heart | hooray | rocket | eyes] = js.undefined
  
  /** Page number of the results to fetch. */
  var page: js.UndefOr[Double] = js.undefined
  
  /** The number of results per page (max 100). */
  var per_page: js.UndefOr[Double] = js.undefined
}
object ContentPagePerpage {
  
  inline def apply(): ContentPagePerpage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentPagePerpage]
  }
  
  extension [Self <: ContentPagePerpage](x: Self) {
    
    inline def setContent(value: Plussign1 | laugh | heart | hooray | rocket | eyes): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    inline def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
  }
}
