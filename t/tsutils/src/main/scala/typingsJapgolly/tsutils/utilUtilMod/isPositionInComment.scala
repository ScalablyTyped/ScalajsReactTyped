package typingsJapgolly.tsutils.utilUtilMod

import typingsJapgolly.typescript.mod.Node
import typingsJapgolly.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tsutils/util/util", "isPositionInComment")
@js.native
object isPositionInComment extends js.Object {
  def apply(sourceFile: SourceFile, pos: Double): Boolean = js.native
  def apply(sourceFile: SourceFile, pos: Double, parent: Node): Boolean = js.native
}

