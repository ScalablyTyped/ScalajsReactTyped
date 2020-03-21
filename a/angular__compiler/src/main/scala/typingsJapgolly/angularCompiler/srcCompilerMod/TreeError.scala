package typingsJapgolly.angularCompiler.srcCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "TreeError")
@js.native
class TreeError protected ()
  extends typingsJapgolly.angularCompiler.htmlParserMod.TreeError {
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
@JSImport("@angular/compiler/src/compiler", "TreeError")
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

