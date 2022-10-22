package typingsJapgolly.mdast.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockContentMap extends StObject {
  
  var blockquote: Blockquote
  
  var code: Code
  
  var heading: Heading
  
  var html: HTML
  
  var list: typingsJapgolly.mdast.mod.List
  
  var paragraph: Paragraph
  
  var table: Table
  
  var thematicbreak: ThematicBreak
}
object BlockContentMap {
  
  inline def apply(
    blockquote: Blockquote,
    code: Code,
    heading: Heading,
    html: HTML,
    list: typingsJapgolly.mdast.mod.List,
    paragraph: Paragraph,
    table: Table,
    thematicbreak: ThematicBreak
  ): BlockContentMap = {
    val __obj = js.Dynamic.literal(blockquote = blockquote.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], heading = heading.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], paragraph = paragraph.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any], thematicbreak = thematicbreak.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockContentMap]
  }
  
  extension [Self <: BlockContentMap](x: Self) {
    
    inline def setBlockquote(value: Blockquote): Self = StObject.set(x, "blockquote", value.asInstanceOf[js.Any])
    
    inline def setCode(value: Code): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setHeading(value: Heading): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    inline def setHtml(value: HTML): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setList(value: typingsJapgolly.mdast.mod.List): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    inline def setParagraph(value: Paragraph): Self = StObject.set(x, "paragraph", value.asInstanceOf[js.Any])
    
    inline def setTable(value: Table): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    inline def setThematicbreak(value: ThematicBreak): Self = StObject.set(x, "thematicbreak", value.asInstanceOf[js.Any])
  }
}
