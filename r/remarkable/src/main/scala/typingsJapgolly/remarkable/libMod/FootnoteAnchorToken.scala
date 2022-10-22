package typingsJapgolly.remarkable.libMod

import typingsJapgolly.remarkable.remarkableStrings.footnote_anchor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.remarkable.libMod._Token because Already inherited */ trait FootnoteAnchorToken
  extends StObject
     with FootnoteGenericToken {
  
  @JSName("type")
  var type_FootnoteAnchorToken: footnote_anchor
}
object FootnoteAnchorToken {
  
  inline def apply(id: Double, level: Double): FootnoteAnchorToken = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("footnote_anchor")
    __obj.asInstanceOf[FootnoteAnchorToken]
  }
  
  extension [Self <: FootnoteAnchorToken](x: Self) {
    
    inline def setType(value: footnote_anchor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
