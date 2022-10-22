package typingsJapgolly.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportNamedDeclaration
  extends StObject
     with BaseNode
     with ModuleDeclaration {
  
  var declaration: js.UndefOr[Declaration | Null] = js.undefined
  
  var source: js.UndefOr[Literal | Null] = js.undefined
  
  var specifiers: js.Array[ExportSpecifier]
  
  @JSName("type")
  var type_ExportNamedDeclaration: typingsJapgolly.estree.estreeStrings.ExportNamedDeclaration
}
object ExportNamedDeclaration {
  
  inline def apply(specifiers: js.Array[ExportSpecifier]): ExportNamedDeclaration = {
    val __obj = js.Dynamic.literal(specifiers = specifiers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportNamedDeclaration")
    __obj.asInstanceOf[ExportNamedDeclaration]
  }
  
  extension [Self <: ExportNamedDeclaration](x: Self) {
    
    inline def setDeclaration(value: Declaration): Self = StObject.set(x, "declaration", value.asInstanceOf[js.Any])
    
    inline def setDeclarationNull: Self = StObject.set(x, "declaration", null)
    
    inline def setDeclarationUndefined: Self = StObject.set(x, "declaration", js.undefined)
    
    inline def setSource(value: Literal): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceNull: Self = StObject.set(x, "source", null)
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setSpecifiers(value: js.Array[ExportSpecifier]): Self = StObject.set(x, "specifiers", value.asInstanceOf[js.Any])
    
    inline def setSpecifiersVarargs(value: ExportSpecifier*): Self = StObject.set(x, "specifiers", js.Array(value*))
    
    inline def setType(value: typingsJapgolly.estree.estreeStrings.ExportNamedDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
