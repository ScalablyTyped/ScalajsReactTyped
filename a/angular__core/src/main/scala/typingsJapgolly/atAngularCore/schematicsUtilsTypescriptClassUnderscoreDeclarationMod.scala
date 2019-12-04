package typingsJapgolly.atAngularCore

import typingsJapgolly.typescript.typescriptMod.ClassDeclaration
import typingsJapgolly.typescript.typescriptMod.Identifier
import typingsJapgolly.typescript.typescriptMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/schematics/utils/typescript/class_declaration", JSImport.Namespace)
@js.native
object schematicsUtilsTypescriptClassUnderscoreDeclarationMod extends js.Object {
  def findParentClassDeclaration(node: Node): ClassDeclaration | Null = js.native
  def getBaseTypeIdentifiers(node: ClassDeclaration): js.Array[Identifier] | Null = js.native
}

