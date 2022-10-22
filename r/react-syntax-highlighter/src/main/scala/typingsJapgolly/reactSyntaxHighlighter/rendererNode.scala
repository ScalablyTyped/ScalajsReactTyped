package typingsJapgolly.reactSyntaxHighlighter

import typingsJapgolly.reactSyntaxHighlighter.anon.Dictkey
import typingsJapgolly.reactSyntaxHighlighter.reactSyntaxHighlighterStrings.element
import typingsJapgolly.reactSyntaxHighlighter.reactSyntaxHighlighterStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait rendererNode extends StObject {
  
  var children: js.UndefOr[js.Array[rendererNode]] = js.undefined
  
  var properties: js.UndefOr[Dictkey] = js.undefined
  
  var tagName: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177, starting with typingsJapgolly.reactSyntaxHighlighter.reactSyntaxHighlighterStrings.a, typingsJapgolly.reactSyntaxHighlighter.reactSyntaxHighlighterStrings.abbr, typingsJapgolly.reactSyntaxHighlighter.reactSyntaxHighlighterStrings.address */ Any
  ] = js.undefined
  
  var `type`: element | text
  
  var value: js.UndefOr[String | Double] = js.undefined
}
object rendererNode {
  
  inline def apply(`type`: element | text): rendererNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[rendererNode]
  }
  
  extension [Self <: rendererNode](x: Self) {
    
    inline def setChildren(value: js.Array[rendererNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: rendererNode*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setProperties(value: Dictkey): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setTagName(
      value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177, starting with typingsJapgolly.reactSyntaxHighlighter.reactSyntaxHighlighterStrings.a, typingsJapgolly.reactSyntaxHighlighter.reactSyntaxHighlighterStrings.abbr, typingsJapgolly.reactSyntaxHighlighter.reactSyntaxHighlighterStrings.address */ Any
    ): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    
    inline def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
    
    inline def setType(value: element | text): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
