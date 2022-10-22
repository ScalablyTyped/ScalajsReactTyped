package typingsJapgolly.angularCore

import typingsJapgolly.angularCore.schematicsUtilsImportManagerMod.ImportManager
import typingsJapgolly.std.Map
import typingsJapgolly.typescript.mod.SourceFile
import typingsJapgolly.typescript.mod.VariableDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schematicsMigrationsPathMatchTypeUtilMod {
  
  @JSImport("@angular/core/schematics/migrations/path-match-type/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findExpressionsToMigrate(sourceFile: SourceFile, importManager: ImportManager): Map[VariableDeclaration, VariableDeclaration] = (^.asInstanceOf[js.Dynamic].applyDynamic("findExpressionsToMigrate")(sourceFile.asInstanceOf[js.Any], importManager.asInstanceOf[js.Any])).asInstanceOf[Map[VariableDeclaration, VariableDeclaration]]
}
