package typingsJapgolly.atAngularCompiler

import typingsJapgolly.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompilePipeSummary
import typingsJapgolly.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.TemplateAst
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Pipes extends js.Object {
  var pipes: js.Array[CompilePipeSummary]
  var template: js.Array[TemplateAst]
}

object Anon_Pipes {
  @scala.inline
  def apply(pipes: js.Array[CompilePipeSummary], template: js.Array[TemplateAst]): Anon_Pipes = {
    val __obj = js.Dynamic.literal(pipes = pipes.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Pipes]
  }
}

