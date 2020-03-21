package typingsJapgolly.angularCompiler.publicApiMod

import typingsJapgolly.angularCompiler.outputAstMod.JSDocTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "JSDocCommentStmt")
@js.native
class JSDocCommentStmt ()
  extends typingsJapgolly.angularCompiler.srcCompilerMod.JSDocCommentStmt {
  def this(tags: js.Array[JSDocTag]) = this()
  def this(
    tags: js.Array[JSDocTag],
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

