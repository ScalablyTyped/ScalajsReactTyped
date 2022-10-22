package typingsJapgolly.angularCore

import typingsJapgolly.typescript.mod.ClassDeclaration
import typingsJapgolly.typescript.mod.Identifier
import typingsJapgolly.typescript.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schematicsUtilsTypescriptClassDeclarationMod {
  
  @JSImport("@angular/core/schematics/utils/typescript/class_declaration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findParentClassDeclaration(node: Node): ClassDeclaration | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findParentClassDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[ClassDeclaration | Null]
  
  inline def getBaseTypeIdentifiers(node: ClassDeclaration): js.Array[Identifier] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getBaseTypeIdentifiers")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Identifier] | Null]
  
  inline def hasExplicitConstructor(node: ClassDeclaration): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasExplicitConstructor")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
