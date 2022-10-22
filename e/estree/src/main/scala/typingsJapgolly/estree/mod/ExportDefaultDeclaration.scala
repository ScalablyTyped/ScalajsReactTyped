package typingsJapgolly.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportDefaultDeclaration
  extends StObject
     with BaseNode
     with ModuleDeclaration {
  
  var declaration: Declaration | Expression
  
  @JSName("type")
  var type_ExportDefaultDeclaration: typingsJapgolly.estree.estreeStrings.ExportDefaultDeclaration
}
object ExportDefaultDeclaration {
  
  inline def apply(declaration: Declaration | Expression): ExportDefaultDeclaration = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportDefaultDeclaration")
    __obj.asInstanceOf[ExportDefaultDeclaration]
  }
  
  extension [Self <: ExportDefaultDeclaration](x: Self) {
    
    inline def setDeclaration(value: Declaration | Expression): Self = StObject.set(x, "declaration", value.asInstanceOf[js.Any])
    
    inline def setType(value: typingsJapgolly.estree.estreeStrings.ExportDefaultDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
