package typingsJapgolly.fortawesomeFontawesomeSvgCore.mod

import org.scalajs.dom.HTMLCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontawesomeObject extends StObject {
  
  val `abstract`: js.Array[AbstractElement]
  
  val html: js.Array[String]
  
  val node: HTMLCollection[Any]
}
object FontawesomeObject {
  
  inline def apply(`abstract`: js.Array[AbstractElement], html: js.Array[String], node: HTMLCollection[Any]): FontawesomeObject = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.updateDynamic("abstract")(`abstract`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontawesomeObject]
  }
  
  extension [Self <: FontawesomeObject](x: Self) {
    
    inline def setAbstract(value: js.Array[AbstractElement]): Self = StObject.set(x, "abstract", value.asInstanceOf[js.Any])
    
    inline def setAbstractVarargs(value: AbstractElement*): Self = StObject.set(x, "abstract", js.Array(value*))
    
    inline def setHtml(value: js.Array[String]): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setHtmlVarargs(value: String*): Self = StObject.set(x, "html", js.Array(value*))
    
    inline def setNode(value: HTMLCollection[Any]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
