package typingsJapgolly.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Header
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var content: org.scalajs.dom.Element
  
  var header: org.scalajs.dom.Element
}
object Header {
  
  inline def apply(content: org.scalajs.dom.Element, header: org.scalajs.dom.Element): Header = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any])
    __obj.asInstanceOf[Header]
  }
  
  extension [Self <: Header](x: Self) {
    
    inline def setContent(value: org.scalajs.dom.Element): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeader(value: org.scalajs.dom.Element): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
  }
}
