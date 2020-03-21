package typingsJapgolly.angularCompiler

import typingsJapgolly.angularCompiler.abstractEmitterMod.OutputEmitter
import typingsJapgolly.angularCompiler.outputAstMod.Expression
import typingsJapgolly.angularCompiler.outputAstMod.ExternalReference
import typingsJapgolly.angularCompiler.outputAstMod.Statement
import typingsJapgolly.angularCompiler.outputAstMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/ts_emitter", JSImport.Namespace)
@js.native
object tsEmitterMod extends js.Object {
  @js.native
  class TypeScriptEmitter () extends OutputEmitter {
    def emitStatementsAndContext(genFilePath: String, stmts: js.Array[Statement]): AnonContext = js.native
    def emitStatementsAndContext(genFilePath: String, stmts: js.Array[Statement], preamble: String): AnonContext = js.native
    def emitStatementsAndContext(genFilePath: String, stmts: js.Array[Statement], preamble: String, emitSourceMaps: Boolean): AnonContext = js.native
    def emitStatementsAndContext(
      genFilePath: String,
      stmts: js.Array[Statement],
      preamble: String,
      emitSourceMaps: Boolean,
      referenceFilter: ReferenceFilter
    ): AnonContext = js.native
    def emitStatementsAndContext(
      genFilePath: String,
      stmts: js.Array[Statement],
      preamble: String,
      emitSourceMaps: Boolean,
      referenceFilter: ReferenceFilter,
      importFilter: ReferenceFilter
    ): AnonContext = js.native
  }
  
  def debugOutputAstAsTypeScript(ast: js.Array[_]): String = js.native
  def debugOutputAstAsTypeScript(ast: Expression): String = js.native
  def debugOutputAstAsTypeScript(ast: Statement): String = js.native
  def debugOutputAstAsTypeScript(ast: Type): String = js.native
  type ReferenceFilter = js.Function1[/* reference */ ExternalReference, Boolean]
}

