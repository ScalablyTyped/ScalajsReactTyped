package typingsJapgolly.babelTypes.mod

import typingsJapgolly.babelTypes.babelTypesStrings.TSSymbolKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.babelTypes.mod._Node because Already inherited */ trait TSSymbolKeyword_
  extends StObject
     with BaseNode
     with TSBaseType
     with TSType
     with TypeScript {
  
  @JSName("type")
  var type_TSSymbolKeyword_ : TSSymbolKeyword
}
object TSSymbolKeyword_ {
  
  inline def apply(): TSSymbolKeyword_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSSymbolKeyword")
    __obj.asInstanceOf[TSSymbolKeyword_]
  }
  
  extension [Self <: TSSymbolKeyword_](x: Self) {
    
    inline def setType(value: TSSymbolKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
