package typingsJapgolly.angularCompiler.mod

import typingsJapgolly.angularCompiler.templateAstMod.TemplateAst
import typingsJapgolly.angularCompiler.viewCompilerViewCompilerMod.StaticAndDynamicQueryIds
import typingsJapgolly.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "findStaticQueryIds")
@js.native
object findStaticQueryIds extends js.Object {
  def apply(nodes: js.Array[TemplateAst]): Map[TemplateAst, StaticAndDynamicQueryIds] = js.native
  def apply(nodes: js.Array[TemplateAst], result: Map[TemplateAst, StaticAndDynamicQueryIds]): Map[TemplateAst, StaticAndDynamicQueryIds] = js.native
}

