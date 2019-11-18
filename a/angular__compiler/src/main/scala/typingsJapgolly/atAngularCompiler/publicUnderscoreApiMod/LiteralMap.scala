package typingsJapgolly.atAngularCompiler.publicUnderscoreApiMod

import typingsJapgolly.atAngularCompiler.Anon_Key
import typingsJapgolly.atAngularCompiler.srcExpressionUnderscoreParserAstMod.LiteralMapKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "LiteralMap")
@js.native
class LiteralMap protected ()
  extends typingsJapgolly.atAngularCompiler.srcCompilerMod.LiteralMap {
  def this(
    span: typingsJapgolly.atAngularCompiler.srcExpressionUnderscoreParserAstMod.ParseSpan,
    keys: js.Array[LiteralMapKey],
    values: js.Array[_]
  ) = this()
}

@JSImport("@angular/compiler/public_api", "literalMap")
@js.native
object literalMap extends js.Object {
  def apply(values: js.Array[Anon_Key]): typingsJapgolly.atAngularCompiler.srcOutputOutputUnderscoreAstMod.LiteralMapExpr = js.native
  def apply(
    values: js.Array[Anon_Key],
    `type`: typingsJapgolly.atAngularCompiler.srcOutputOutputUnderscoreAstMod.MapType
  ): typingsJapgolly.atAngularCompiler.srcOutputOutputUnderscoreAstMod.LiteralMapExpr = js.native
}

