package typingsJapgolly.angularCore

import typingsJapgolly.typescript.mod.ImportSpecifier
import typingsJapgolly.typescript.mod.NamedImports
import typingsJapgolly.typescript.mod.NodeArray
import typingsJapgolly.typescript.mod.SourceFile
import typingsJapgolly.typescript.mod.TypeChecker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/schematics/migrations/renderer-to-renderer2/util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  def findCoreImport(sourceFile: SourceFile, symbolName: String): NamedImports | Null = js.native
  def findImportSpecifier(elements: NodeArray[ImportSpecifier], importName: String): ImportSpecifier | Null = js.native
  def findRendererReferences(sourceFile: SourceFile, typeChecker: TypeChecker, rendererImport: NamedImports): AnonForwardRefs = js.native
}

