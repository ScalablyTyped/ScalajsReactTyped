package typingsJapgolly.angularCompiler

import typingsJapgolly.angularCompiler.i18nAstMod.Message
import typingsJapgolly.angularCompiler.interpolationConfigMod.InterpolationConfig
import typingsJapgolly.angularCompiler.mlParserAstMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/i18n/i18n_parser", JSImport.Namespace)
@js.native
object i18nParserMod extends js.Object {
  def createI18nMessageFactory(interpolationConfig: InterpolationConfig): js.Function5[
    /* nodes */ js.Array[Node], 
    /* meaning */ String, 
    /* description */ String, 
    /* id */ String, 
    /* visitNodeFn */ js.UndefOr[VisitNodeFn], 
    Message
  ] = js.native
  type VisitNodeFn = js.Function2[/* html */ Node, /* i18n */ typingsJapgolly.angularCompiler.i18nAstMod.Node, Unit]
}

