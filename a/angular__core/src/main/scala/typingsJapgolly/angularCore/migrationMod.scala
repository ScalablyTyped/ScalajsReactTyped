package typingsJapgolly.angularCore

import typingsJapgolly.typescript.mod.CallExpression
import typingsJapgolly.typescript.mod.NamedImports
import typingsJapgolly.typescript.mod.TypeChecker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/schematics/migrations/renderer-to-renderer2/migration", JSImport.Namespace)
@js.native
object migrationMod extends js.Object {
  def migrateExpression(node: CallExpression, typeChecker: TypeChecker): AnonNode = js.native
  def replaceImport(node: NamedImports, oldImport: String, newImport: String): NamedImports = js.native
}

