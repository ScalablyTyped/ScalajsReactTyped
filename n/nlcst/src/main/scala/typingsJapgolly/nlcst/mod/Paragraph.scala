package typingsJapgolly.nlcst.mod

import typingsJapgolly.nlcst.nlcstStrings.ParagraphNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Paragraph
  extends StObject
     with Parent {
  
  @JSName("children")
  var children_Paragraph: js.Array[ParagraphContent]
  
  @JSName("type")
  var type_Paragraph: ParagraphNode
}
object Paragraph {
  
  inline def apply(children: js.Array[ParagraphContent]): Paragraph = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ParagraphNode")
    __obj.asInstanceOf[Paragraph]
  }
  
  extension [Self <: Paragraph](x: Self) {
    
    inline def setChildren(value: js.Array[ParagraphContent]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: ParagraphContent*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setType(value: ParagraphNode): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
