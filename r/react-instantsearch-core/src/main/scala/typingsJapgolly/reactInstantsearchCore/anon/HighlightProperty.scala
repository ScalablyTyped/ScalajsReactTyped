package typingsJapgolly.reactInstantsearchCore.anon

import typingsJapgolly.reactInstantsearchCore.mod.Hit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HighlightProperty[TDoc] extends StObject {
  
  var attribute: String
  
  var highlightProperty: String
  
  var hit: Hit[TDoc]
  
  var postTag: js.UndefOr[String] = js.undefined
  
  var preTag: js.UndefOr[String] = js.undefined
}
object HighlightProperty {
  
  inline def apply[TDoc](attribute: String, highlightProperty: String, hit: Hit[TDoc]): HighlightProperty[TDoc] = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], highlightProperty = highlightProperty.asInstanceOf[js.Any], hit = hit.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightProperty[TDoc]]
  }
  
  extension [Self <: HighlightProperty[?], TDoc](x: Self & HighlightProperty[TDoc]) {
    
    inline def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setHighlightProperty(value: String): Self = StObject.set(x, "highlightProperty", value.asInstanceOf[js.Any])
    
    inline def setHit(value: Hit[TDoc]): Self = StObject.set(x, "hit", value.asInstanceOf[js.Any])
    
    inline def setPostTag(value: String): Self = StObject.set(x, "postTag", value.asInstanceOf[js.Any])
    
    inline def setPostTagUndefined: Self = StObject.set(x, "postTag", js.undefined)
    
    inline def setPreTag(value: String): Self = StObject.set(x, "preTag", value.asInstanceOf[js.Any])
    
    inline def setPreTagUndefined: Self = StObject.set(x, "preTag", js.undefined)
  }
}
