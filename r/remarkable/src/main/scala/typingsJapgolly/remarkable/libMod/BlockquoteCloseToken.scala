package typingsJapgolly.remarkable.libMod

import typingsJapgolly.remarkable.remarkableStrings.blockquote_close
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.remarkable.libMod._Token because Already inherited */ trait BlockquoteCloseToken
  extends StObject
     with TagToken {
  
  @JSName("type")
  var type_BlockquoteCloseToken: blockquote_close
}
object BlockquoteCloseToken {
  
  inline def apply(level: Double): BlockquoteCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("blockquote_close")
    __obj.asInstanceOf[BlockquoteCloseToken]
  }
  
  extension [Self <: BlockquoteCloseToken](x: Self) {
    
    inline def setType(value: blockquote_close): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
