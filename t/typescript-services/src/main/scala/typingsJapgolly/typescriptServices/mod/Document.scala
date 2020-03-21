package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.IScriptSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Document")
@js.native
class Document protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.Document {
  def this(
    _compiler: typingsJapgolly.typescriptServices.TypeScript.TypeScriptCompiler,
    _semanticInfoChain: typingsJapgolly.typescriptServices.TypeScript.SemanticInfoChain,
    fileName: String,
    referencedFiles: js.Array[String],
    _scriptSnapshot: IScriptSnapshot,
    byteOrderMark: typingsJapgolly.typescriptServices.TypeScript.ByteOrderMark,
    version: Double,
    isOpen: Boolean,
    _syntaxTree: typingsJapgolly.typescriptServices.TypeScript.SyntaxTree,
    _topLevelDecl: typingsJapgolly.typescriptServices.TypeScript.PullDecl
  ) = this()
}

/* static members */
@JSImport("typescript-services", "Document")
@js.native
object Document extends js.Object {
  def create(
    compiler: typingsJapgolly.typescriptServices.TypeScript.TypeScriptCompiler,
    semanticInfoChain: typingsJapgolly.typescriptServices.TypeScript.SemanticInfoChain,
    fileName: String,
    scriptSnapshot: IScriptSnapshot,
    byteOrderMark: typingsJapgolly.typescriptServices.TypeScript.ByteOrderMark,
    version: Double,
    isOpen: Boolean,
    referencedFiles: js.Array[String]
  ): typingsJapgolly.typescriptServices.TypeScript.Document = js.native
}

