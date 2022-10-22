package typingsJapgolly.docxTemplates.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Link extends StObject {
  
  var url: String
}
object Link {
  
  inline def apply(url: String): Link = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Link]
  }
  
  extension [Self <: Link](x: Self) {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
