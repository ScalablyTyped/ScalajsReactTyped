package typingsJapgolly.tsutils.usageMod

import typingsJapgolly.std.Map
import typingsJapgolly.typescript.mod.Identifier
import typingsJapgolly.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tsutils/util/usage", "collectVariableUsage")
@js.native
object collectVariableUsage extends js.Object {
  def apply(sourceFile: SourceFile): Map[Identifier, VariableInfo] = js.native
}

