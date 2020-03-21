package typingsJapgolly.angularCompiler.mod

import typingsJapgolly.angularCompiler.outputAstMod.JSDocTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "JSDocCommentStmt")
@js.native
class JSDocCommentStmt ()
  extends typingsJapgolly.angularCompiler.publicApiMod.JSDocCommentStmt {
  def this(tags: js.Array[JSDocTag]) = this()
  def this(
    tags: js.Array[JSDocTag],
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

