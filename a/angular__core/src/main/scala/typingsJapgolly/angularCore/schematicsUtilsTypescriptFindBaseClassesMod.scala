package typingsJapgolly.angularCore

import typingsJapgolly.angularCore.anon.Identifier
import typingsJapgolly.typescript.mod.ClassDeclaration
import typingsJapgolly.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schematicsUtilsTypescriptFindBaseClassesMod {
  
  @JSImport("@angular/core/schematics/utils/typescript/find_base_classes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findBaseClassDeclarations(node: ClassDeclaration, typeChecker: TypeChecker): js.Array[Identifier] = (^.asInstanceOf[js.Dynamic].applyDynamic("findBaseClassDeclarations")(node.asInstanceOf[js.Any], typeChecker.asInstanceOf[js.Any])).asInstanceOf[js.Array[Identifier]]
}
