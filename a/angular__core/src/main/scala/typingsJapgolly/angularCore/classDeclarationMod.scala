package typingsJapgolly.angularCore

import typingsJapgolly.typescript.mod.ClassDeclaration
import typingsJapgolly.typescript.mod.Identifier
import typingsJapgolly.typescript.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/schematics/utils/typescript/class_declaration", JSImport.Namespace)
@js.native
object classDeclarationMod extends js.Object {
  def findParentClassDeclaration(node: Node): ClassDeclaration | Null = js.native
  def getBaseTypeIdentifiers(node: ClassDeclaration): js.Array[Identifier] | Null = js.native
}

