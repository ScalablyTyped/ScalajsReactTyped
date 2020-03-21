package typingsJapgolly.angularCompiler.srcCompilerMod

import typingsJapgolly.angularCompiler.outputAstMod.JSDocTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "JSDocCommentStmt")
@js.native
class JSDocCommentStmt ()
  extends typingsJapgolly.angularCompiler.outputAstMod.JSDocCommentStmt {
  def this(tags: js.Array[JSDocTag]) = this()
  def this(
    tags: js.Array[JSDocTag],
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

