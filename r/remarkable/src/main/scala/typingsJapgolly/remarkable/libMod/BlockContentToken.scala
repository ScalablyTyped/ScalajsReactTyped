package typingsJapgolly.remarkable.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.remarkable.libMod._Token because Already inherited */ trait BlockContentToken
  extends StObject
     with TagToken {
  
  /**
    * This is initialized with an empty array (`[]`) and will be filled
    * with the inline parser tokens as the inline parsing rules are applied.
    */
  var children: js.UndefOr[js.Array[Token]] = js.undefined
  
  /**
    * The content of the block. This might include inline mardown syntax
    * which may need further processing by the inline rules.
    */
  var content: js.UndefOr[String] = js.undefined
}
object BlockContentToken {
  
  inline def apply(level: Double, `type`: String): BlockContentToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockContentToken]
  }
  
  extension [Self <: BlockContentToken](x: Self) {
    
    inline def setChildren(value: js.Array[Token]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: Token*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
  }
}
