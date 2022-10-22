package typingsJapgolly.babelTypes.mod

import typingsJapgolly.babelTypes.babelTypesStrings.TSOptionalType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.babelTypes.mod._Node because Already inherited */ trait TSOptionalType_
  extends StObject
     with BaseNode
     with TSType
     with TypeScript {
  
  var typeAnnotation: TSType
  
  @JSName("type")
  var type_TSOptionalType_ : TSOptionalType
}
object TSOptionalType_ {
  
  inline def apply(typeAnnotation: TSType): TSOptionalType_ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSOptionalType")
    __obj.asInstanceOf[TSOptionalType_]
  }
  
  extension [Self <: TSOptionalType_](x: Self) {
    
    inline def setType(value: TSOptionalType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TSType): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
