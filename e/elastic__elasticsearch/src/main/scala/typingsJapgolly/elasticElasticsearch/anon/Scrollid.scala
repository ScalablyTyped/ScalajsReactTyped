package typingsJapgolly.elasticElasticsearch.anon

import typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.ScrollId
import typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.ScrollIds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scrollid extends StObject {
  
  var scroll_id: js.UndefOr[ScrollIds] = js.undefined
}
object Scrollid {
  
  inline def apply(): Scrollid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Scrollid]
  }
  
  extension [Self <: Scrollid](x: Self) {
    
    inline def setScroll_id(value: ScrollIds): Self = StObject.set(x, "scroll_id", value.asInstanceOf[js.Any])
    
    inline def setScroll_idUndefined: Self = StObject.set(x, "scroll_id", js.undefined)
    
    inline def setScroll_idVarargs(value: ScrollId*): Self = StObject.set(x, "scroll_id", js.Array(value*))
  }
}
