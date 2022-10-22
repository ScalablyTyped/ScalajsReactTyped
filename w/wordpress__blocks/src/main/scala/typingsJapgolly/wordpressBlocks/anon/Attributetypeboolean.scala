package typingsJapgolly.wordpressBlocks.anon

import typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.attribute
import typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.boolean
import typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @wordpress/blocks.@wordpress/blocks/api/parser.Schema.Attribute & {  type :'boolean'} */
trait Attributetypeboolean extends StObject {
  
  var attribute: String
  
  var selector: js.UndefOr[String] = js.undefined
  
  var source: attribute
  
  var `type`: (js.UndefOr[string | boolean]) & boolean
}
object Attributetypeboolean {
  
  inline def apply(attribute: String, `type`: (js.UndefOr[string | boolean]) & boolean): Attributetypeboolean = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], source = "attribute")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributetypeboolean]
  }
  
  extension [Self <: Attributetypeboolean](x: Self) {
    
    inline def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    inline def setSource(value: attribute): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setType(value: (js.UndefOr[string | boolean]) & boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
