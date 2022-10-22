package typingsJapgolly.marked.mod.marked.Tokens

import typingsJapgolly.marked.markedStrings.html
import typingsJapgolly.marked.markedStrings.text
import typingsJapgolly.marked.mod.marked.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tag
  extends StObject
     with Token {
  
  var inLink: Boolean
  
  var inRawBlock: Boolean
  
  var raw: String
  
  var text: String
  
  var `type`: text | html
}
object Tag {
  
  inline def apply(inLink: Boolean, inRawBlock: Boolean, raw: String, text: String, `type`: text | html): Tag = {
    val __obj = js.Dynamic.literal(inLink = inLink.asInstanceOf[js.Any], inRawBlock = inRawBlock.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
  
  extension [Self <: Tag](x: Self) {
    
    inline def setInLink(value: Boolean): Self = StObject.set(x, "inLink", value.asInstanceOf[js.Any])
    
    inline def setInRawBlock(value: Boolean): Self = StObject.set(x, "inRawBlock", value.asInstanceOf[js.Any])
    
    inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setType(value: text | html): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
