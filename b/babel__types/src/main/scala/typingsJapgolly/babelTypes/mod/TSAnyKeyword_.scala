package typingsJapgolly.babelTypes.mod

import typingsJapgolly.babelTypes.babelTypesStrings.TSAnyKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.babelTypes.mod._Node because Already inherited */ trait TSAnyKeyword_
  extends StObject
     with BaseNode
     with TSBaseType
     with TSType
     with TypeScript {
  
  @JSName("type")
  var type_TSAnyKeyword_ : TSAnyKeyword
}
object TSAnyKeyword_ {
  
  inline def apply(): TSAnyKeyword_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSAnyKeyword")
    __obj.asInstanceOf[TSAnyKeyword_]
  }
  
  extension [Self <: TSAnyKeyword_](x: Self) {
    
    inline def setType(value: TSAnyKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
