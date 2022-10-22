package typingsJapgolly.jsrsasign.anon

import typingsJapgolly.jsrsasign.jsrsasign._ASN1HEXParseResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tag
  extends StObject
     with _ASN1HEXParseResult {
  
  var tag: Explicit
}
object Tag {
  
  inline def apply(tag: Explicit): Tag = {
    val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
  
  extension [Self <: Tag](x: Self) {
    
    inline def setTag(value: Explicit): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
