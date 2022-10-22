package typingsJapgolly.babelTypes.libMod

import typingsJapgolly.babelTypes.babelTypesStrings.ImportSpecifier
import typingsJapgolly.babelTypes.babelTypesStrings.`type`
import typingsJapgolly.babelTypes.babelTypesStrings.typeof
import typingsJapgolly.babelTypes.babelTypesStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportSpecifier_
  extends StObject
     with BaseNode
     with ModuleSpecifier
     with Node
     with Standardized {
  
  var importKind: js.UndefOr[`type` | typeof | value | Null] = js.undefined
  
  var imported: Identifier_ | StringLiteral_
  
  var local: Identifier_
  
  @JSName("type")
  var type_ImportSpecifier_ : ImportSpecifier
}
object ImportSpecifier_ {
  
  inline def apply(imported: Identifier_ | StringLiteral_, local: Identifier_): ImportSpecifier_ = {
    val __obj = js.Dynamic.literal(imported = imported.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportSpecifier")
    __obj.asInstanceOf[ImportSpecifier_]
  }
  
  extension [Self <: ImportSpecifier_](x: Self) {
    
    inline def setImportKind(value: `type` | typeof | value): Self = StObject.set(x, "importKind", value.asInstanceOf[js.Any])
    
    inline def setImportKindNull: Self = StObject.set(x, "importKind", null)
    
    inline def setImportKindUndefined: Self = StObject.set(x, "importKind", js.undefined)
    
    inline def setImported(value: Identifier_ | StringLiteral_): Self = StObject.set(x, "imported", value.asInstanceOf[js.Any])
    
    inline def setLocal(value: Identifier_): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    inline def setType(value: ImportSpecifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
