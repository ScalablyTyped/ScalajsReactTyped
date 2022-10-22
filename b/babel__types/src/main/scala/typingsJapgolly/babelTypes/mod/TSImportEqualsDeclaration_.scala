package typingsJapgolly.babelTypes.mod

import typingsJapgolly.babelTypes.babelTypesStrings.TSImportEqualsDeclaration
import typingsJapgolly.babelTypes.babelTypesStrings.`type`
import typingsJapgolly.babelTypes.babelTypesStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.babelTypes.mod._Node because Already inherited */ trait TSImportEqualsDeclaration_
  extends StObject
     with BaseNode
     with Statement
     with TypeScript {
  
  var id: Identifier_
  
  var importKind: `type` | value | Null
  
  var isExport: Boolean
  
  var moduleReference: TSEntityName | TSExternalModuleReference_
  
  @JSName("type")
  var type_TSImportEqualsDeclaration_ : TSImportEqualsDeclaration
}
object TSImportEqualsDeclaration_ {
  
  inline def apply(id: Identifier_, isExport: Boolean, moduleReference: TSEntityName | TSExternalModuleReference_): TSImportEqualsDeclaration_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isExport = isExport.asInstanceOf[js.Any], moduleReference = moduleReference.asInstanceOf[js.Any], end = null, importKind = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSImportEqualsDeclaration")
    __obj.asInstanceOf[TSImportEqualsDeclaration_]
  }
  
  extension [Self <: TSImportEqualsDeclaration_](x: Self) {
    
    inline def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setImportKind(value: `type` | value): Self = StObject.set(x, "importKind", value.asInstanceOf[js.Any])
    
    inline def setImportKindNull: Self = StObject.set(x, "importKind", null)
    
    inline def setIsExport(value: Boolean): Self = StObject.set(x, "isExport", value.asInstanceOf[js.Any])
    
    inline def setModuleReference(value: TSEntityName | TSExternalModuleReference_): Self = StObject.set(x, "moduleReference", value.asInstanceOf[js.Any])
    
    inline def setType(value: TSImportEqualsDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
