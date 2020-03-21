package typingsJapgolly.astTypes.pathVisitorMod

import typingsJapgolly.astTypes.typesMod.ASTNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PathVisitorStatics extends js.Object {
  def fromMethodsObject(): Visitor = js.native
  def fromMethodsObject(methods: js.Any): Visitor = js.native
  def visit[M](node: ASTNode): js.Any = js.native
  def visit[M](node: ASTNode, methods: typingsJapgolly.astTypes.visitorMod.Visitor[M]): js.Any = js.native
}

