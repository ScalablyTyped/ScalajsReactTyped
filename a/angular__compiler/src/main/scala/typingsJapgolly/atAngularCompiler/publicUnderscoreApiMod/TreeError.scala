package typingsJapgolly.atAngularCompiler.publicUnderscoreApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "TreeError")
@js.native
class TreeError protected ()
  extends typingsJapgolly.atAngularCompiler.srcCompilerMod.TreeError {
  def this(
    elementName: String,
    span: typingsJapgolly.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    msg: String
  ) = this()
  def this(
    elementName: Null,
    span: typingsJapgolly.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    msg: String
  ) = this()
}

/* static members */
@JSImport("@angular/compiler/public_api", "TreeError")
@js.native
object TreeError extends js.Object {
  def create(
    elementName: String,
    span: typingsJapgolly.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    msg: String
  ): typingsJapgolly.atAngularCompiler.srcMlUnderscoreParserParserMod.TreeError = js.native
  def create(
    elementName: Null,
    span: typingsJapgolly.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    msg: String
  ): typingsJapgolly.atAngularCompiler.srcMlUnderscoreParserParserMod.TreeError = js.native
}

