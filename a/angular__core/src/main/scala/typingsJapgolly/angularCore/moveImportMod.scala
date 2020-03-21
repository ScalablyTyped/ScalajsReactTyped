package typingsJapgolly.angularCore

import typingsJapgolly.typescript.mod.Identifier
import typingsJapgolly.typescript.mod.NamedImports
import typingsJapgolly.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/schematics/migrations/move-document/move-import", JSImport.Namespace)
@js.native
object moveImportMod extends js.Object {
  def addToImport(importNode: NamedImports, sourceFile: SourceFile, name: Identifier): String = js.native
  def addToImport(importNode: NamedImports, sourceFile: SourceFile, name: Identifier, propertyName: Identifier): String = js.native
  def createImport(importSource: String, sourceFile: SourceFile, name: Identifier): String = js.native
  def createImport(importSource: String, sourceFile: SourceFile, name: Identifier, propertyName: Identifier): String = js.native
  def removeFromImport(importNode: NamedImports, sourceFile: SourceFile, importName: String): String = js.native
}

