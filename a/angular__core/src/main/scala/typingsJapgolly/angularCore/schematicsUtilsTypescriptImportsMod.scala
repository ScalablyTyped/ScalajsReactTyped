package typingsJapgolly.angularCore

import typingsJapgolly.typescript.mod.Identifier
import typingsJapgolly.typescript.mod.ImportDeclaration
import typingsJapgolly.typescript.mod.ImportSpecifier
import typingsJapgolly.typescript.mod.NamedImports
import typingsJapgolly.typescript.mod.NodeArray
import typingsJapgolly.typescript.mod.SourceFile
import typingsJapgolly.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schematicsUtilsTypescriptImportsMod {
  
  @JSImport("@angular/core/schematics/utils/typescript/imports", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findImportSpecifier(nodes: NodeArray[ImportSpecifier], specifierName: String): js.UndefOr[ImportSpecifier] = (^.asInstanceOf[js.Dynamic].applyDynamic("findImportSpecifier")(nodes.asInstanceOf[js.Any], specifierName.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ImportSpecifier]]
  
  inline def getImportOfIdentifier(typeChecker: TypeChecker, node: Identifier): Import | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getImportOfIdentifier")(typeChecker.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Import | Null]
  
  inline def getImportSpecifier(sourceFile: SourceFile, moduleName: String, specifierName: String): ImportSpecifier | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getImportSpecifier")(sourceFile.asInstanceOf[js.Any], moduleName.asInstanceOf[js.Any], specifierName.asInstanceOf[js.Any])).asInstanceOf[ImportSpecifier | Null]
  
  inline def replaceImport(node: NamedImports, existingImport: String, newImportName: String): NamedImports = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceImport")(node.asInstanceOf[js.Any], existingImport.asInstanceOf[js.Any], newImportName.asInstanceOf[js.Any])).asInstanceOf[NamedImports]
  
  trait Import extends StObject {
    
    var importModule: String
    
    var name: String
    
    var node: ImportDeclaration
  }
  object Import {
    
    inline def apply(importModule: String, name: String, node: ImportDeclaration): Import = {
      val __obj = js.Dynamic.literal(importModule = importModule.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[Import]
    }
    
    extension [Self <: Import](x: Self) {
      
      inline def setImportModule(value: String): Self = StObject.set(x, "importModule", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNode(value: ImportDeclaration): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
}
