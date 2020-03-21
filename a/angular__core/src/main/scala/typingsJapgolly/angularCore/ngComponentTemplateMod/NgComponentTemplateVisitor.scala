package typingsJapgolly.angularCore.ngComponentTemplateMod

import typingsJapgolly.typescript.mod.Node
import typingsJapgolly.typescript.mod.TypeChecker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/schematics/utils/ng_component_template", "NgComponentTemplateVisitor")
@js.native
class NgComponentTemplateVisitor protected () extends js.Object {
  def this(typeChecker: TypeChecker) = this()
  var resolvedTemplates: js.Array[ResolvedTemplate] = js.native
  var typeChecker: TypeChecker = js.native
  var visitClassDeclaration: js.Any = js.native
  def visitNode(node: Node): Unit = js.native
}

