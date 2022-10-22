package typingsJapgolly.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSNamespaceExportDeclaration
  extends StObject
     with Node
     with Statement {
  
  var id: Identifier_
  
  @JSName("type")
  var type_TSNamespaceExportDeclaration: typingsJapgolly.babelTypes.babelTypesStrings.TSNamespaceExportDeclaration
}
object TSNamespaceExportDeclaration {
  
  @JSImport("babel-types", "TSNamespaceExportDeclaration")
  @js.native
  def apply(id: Identifier_): TSNamespaceExportDeclaration = js.native
  
  extension [Self <: TSNamespaceExportDeclaration](x: Self) {
    
    inline def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: typingsJapgolly.babelTypes.babelTypesStrings.TSNamespaceExportDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
