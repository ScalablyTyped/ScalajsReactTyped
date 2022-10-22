package typingsJapgolly.elasticElasticsearch.anon

import typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.ScrollId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scroll extends StObject {
  
  var scroll: js.UndefOr[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.Duration] = js.undefined
  
  var scroll_id: ScrollId
}
object Scroll {
  
  inline def apply(scroll_id: ScrollId): Scroll = {
    val __obj = js.Dynamic.literal(scroll_id = scroll_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scroll]
  }
  
  extension [Self <: Scroll](x: Self) {
    
    inline def setScroll(value: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.Duration): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
    
    inline def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
    
    inline def setScroll_id(value: ScrollId): Self = StObject.set(x, "scroll_id", value.asInstanceOf[js.Any])
  }
}
