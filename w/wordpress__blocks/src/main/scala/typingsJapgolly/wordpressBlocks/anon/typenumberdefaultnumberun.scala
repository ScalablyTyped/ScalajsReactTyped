package typingsJapgolly.wordpressBlocks.anon

import typingsJapgolly.wordpressBlocks.mod.AttributeSource.Attribute
import typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.attribute
import typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  type :'number',   default :number | undefined} & {  source :'attribute',   attribute :string,   selector :string | undefined} */
trait typenumberdefaultnumberun
  extends StObject
     with Attribute {
  
  var default: js.UndefOr[Double] = js.undefined
  
  var attribute: String
  
  var selector: js.UndefOr[String] = js.undefined
  
  var source: attribute
  
  var `type`: number
}
object typenumberdefaultnumberun {
  
  inline def apply(attribute: String): typenumberdefaultnumberun = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], source = "attribute")
    __obj.updateDynamic("type")("number")
    __obj.asInstanceOf[typenumberdefaultnumberun]
  }
  
  extension [Self <: typenumberdefaultnumberun](x: Self) {
    
    inline def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setDefault(value: Double): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    inline def setSource(value: attribute): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setType(value: number): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
