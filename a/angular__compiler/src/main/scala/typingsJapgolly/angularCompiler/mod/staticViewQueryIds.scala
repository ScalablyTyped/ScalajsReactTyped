package typingsJapgolly.angularCompiler.mod

import typingsJapgolly.angularCompiler.templateAstMod.TemplateAst
import typingsJapgolly.angularCompiler.viewCompilerViewCompilerMod.StaticAndDynamicQueryIds
import typingsJapgolly.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "staticViewQueryIds")
@js.native
object staticViewQueryIds extends js.Object {
  def apply(nodeStaticQueryIds: Map[TemplateAst, StaticAndDynamicQueryIds]): StaticAndDynamicQueryIds = js.native
}

