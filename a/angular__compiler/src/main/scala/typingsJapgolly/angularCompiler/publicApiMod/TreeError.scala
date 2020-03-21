package typingsJapgolly.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "TreeError")
@js.native
class TreeError protected ()
  extends typingsJapgolly.angularCompiler.srcCompilerMod.TreeError {
  def this(
    elementName: String,
    span: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    msg: String
  ) = this()
  def this(
    elementName: Null,
    span: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    msg: String
  ) = this()
}

/* static members */
@JSImport("@angular/compiler/public_api", "TreeError")
@js.native
object TreeError extends js.Object {
  def create(
    elementName: String,
    span: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    msg: String
  ): typingsJapgolly.angularCompiler.mlParserParserMod.TreeError = js.native
  def create(
    elementName: Null,
    span: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    msg: String
  ): typingsJapgolly.angularCompiler.mlParserParserMod.TreeError = js.native
}

