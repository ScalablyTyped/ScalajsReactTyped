package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerpageSince extends StObject {
  
  /** The number of results per page (max 100). */
  var per_page: js.UndefOr[Double] = js.undefined
  
  /** A user ID. Only return users with an ID greater than this ID. */
  var since: js.UndefOr[Double] = js.undefined
}
object PerpageSince {
  
  inline def apply(): PerpageSince = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerpageSince]
  }
  
  extension [Self <: PerpageSince](x: Self) {
    
    inline def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    inline def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    
    inline def setSince(value: Double): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
    
    inline def setSinceUndefined: Self = StObject.set(x, "since", js.undefined)
  }
}
