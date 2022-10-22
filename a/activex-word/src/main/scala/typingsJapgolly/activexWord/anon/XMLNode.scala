package typingsJapgolly.activexWord.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XMLNode extends StObject {
  
  val XMLNode: typingsJapgolly.activexWord.Word.XMLNode
}
object XMLNode {
  
  inline def apply(XMLNode: typingsJapgolly.activexWord.Word.XMLNode): XMLNode = {
    val __obj = js.Dynamic.literal(XMLNode = XMLNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[XMLNode]
  }
  
  extension [Self <: XMLNode](x: Self) {
    
    inline def setXMLNode(value: typingsJapgolly.activexWord.Word.XMLNode): Self = StObject.set(x, "XMLNode", value.asInstanceOf[js.Any])
  }
}
