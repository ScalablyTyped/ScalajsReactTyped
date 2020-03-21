package typingsJapgolly.phenomnomnominalTsquery

import typingsJapgolly.typescript.mod.ScriptKind
import typingsJapgolly.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phenomnomnominal/tsquery/dist/src/ast", JSImport.Namespace)
@js.native
object astMod extends js.Object {
  def createAST(source: String): SourceFile = js.native
  def createAST(source: String, fileName: String): SourceFile = js.native
  def createAST(source: String, fileName: String, scriptKind: ScriptKind): SourceFile = js.native
}

