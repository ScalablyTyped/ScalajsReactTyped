package typingsJapgolly.atAngularCore

import typingsJapgolly.typescript.typescriptMod.ImportSpecifier
import typingsJapgolly.typescript.typescriptMod.NamedImports
import typingsJapgolly.typescript.typescriptMod.NodeArray
import typingsJapgolly.typescript.typescriptMod.SourceFile
import typingsJapgolly.typescript.typescriptMod.TypeChecker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/schematics/migrations/renderer-to-renderer2/util", JSImport.Namespace)
@js.native
object schematicsMigrationsRendererDashToDashRenderer2UtilMod extends js.Object {
  def findCoreImport(sourceFile: SourceFile, symbolName: String): NamedImports | Null = js.native
  def findImportSpecifier(elements: NodeArray[ImportSpecifier], importName: String): ImportSpecifier | Null = js.native
  def findRendererReferences(sourceFile: SourceFile, typeChecker: TypeChecker, rendererImport: NamedImports): Anon_ForwardRefs = js.native
}

