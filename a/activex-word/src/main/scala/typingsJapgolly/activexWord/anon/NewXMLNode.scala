package typingsJapgolly.activexWord.anon

import typingsJapgolly.activexWord.Word.Selection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewXMLNode extends StObject {
  
  val NewXMLNode: typingsJapgolly.activexWord.Word.XMLNode
  
  val OldXMLNode: typingsJapgolly.activexWord.Word.XMLNode
  
  val Reason: Double
  
  val Sel: Selection
}
object NewXMLNode {
  
  inline def apply(
    NewXMLNode: typingsJapgolly.activexWord.Word.XMLNode,
    OldXMLNode: typingsJapgolly.activexWord.Word.XMLNode,
    Reason: Double,
    Sel: Selection
  ): NewXMLNode = {
    val __obj = js.Dynamic.literal(NewXMLNode = NewXMLNode.asInstanceOf[js.Any], OldXMLNode = OldXMLNode.asInstanceOf[js.Any], Reason = Reason.asInstanceOf[js.Any], Sel = Sel.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewXMLNode]
  }
  
  extension [Self <: NewXMLNode](x: Self) {
    
    inline def setNewXMLNode(value: typingsJapgolly.activexWord.Word.XMLNode): Self = StObject.set(x, "NewXMLNode", value.asInstanceOf[js.Any])
    
    inline def setOldXMLNode(value: typingsJapgolly.activexWord.Word.XMLNode): Self = StObject.set(x, "OldXMLNode", value.asInstanceOf[js.Any])
    
    inline def setReason(value: Double): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
    
    inline def setSel(value: Selection): Self = StObject.set(x, "Sel", value.asInstanceOf[js.Any])
  }
}
