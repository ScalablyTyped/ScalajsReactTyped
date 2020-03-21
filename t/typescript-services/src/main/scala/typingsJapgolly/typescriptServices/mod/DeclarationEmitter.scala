package typingsJapgolly.typescriptServices.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "DeclarationEmitter")
@js.native
class DeclarationEmitter protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.DeclarationEmitter {
  def this(
    emittingFileName: String,
    document: typingsJapgolly.typescriptServices.TypeScript.Document,
    compiler: typingsJapgolly.typescriptServices.TypeScript.TypeScriptCompiler,
    emitOptions: typingsJapgolly.typescriptServices.TypeScript.EmitOptions,
    semanticInfoChain: typingsJapgolly.typescriptServices.TypeScript.SemanticInfoChain
  ) = this()
}

/* static members */
@JSImport("typescript-services", "DeclarationEmitter")
@js.native
object DeclarationEmitter extends js.Object {
  def getEnclosingContainer(ast: typingsJapgolly.typescriptServices.TypeScript.AST): typingsJapgolly.typescriptServices.TypeScript.AST = js.native
}

