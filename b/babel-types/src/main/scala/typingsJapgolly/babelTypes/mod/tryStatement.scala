package typingsJapgolly.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babel-types", "tryStatement")
@js.native
object tryStatement extends js.Object {
  def apply(): TryStatement_ = js.native
  def apply(block: BlockStatement_): TryStatement_ = js.native
  def apply(block: BlockStatement_, handler: CatchClause_): TryStatement_ = js.native
  def apply(block: BlockStatement_, handler: CatchClause_, finalizer: BlockStatement_): TryStatement_ = js.native
}

