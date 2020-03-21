package typingsJapgolly.eslint.mod.Scope

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.estree.mod.Identifier
import typingsJapgolly.estree.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reference extends js.Object {
  var from: typingsJapgolly.eslint.mod.Scope.Scope
  var identifier: Identifier
  var init: Boolean
  var resolved: Variable | Null
  var writeExpr: Node | Null
  def isRead(): Boolean
  def isReadOnly(): Boolean
  def isReadWrite(): Boolean
  def isWrite(): Boolean
  def isWriteOnly(): Boolean
}

object Reference {
  @scala.inline
  def apply(
    from: typingsJapgolly.eslint.mod.Scope.Scope,
    identifier: Identifier,
    init: Boolean,
    isRead: CallbackTo[Boolean],
    isReadOnly: CallbackTo[Boolean],
    isReadWrite: CallbackTo[Boolean],
    isWrite: CallbackTo[Boolean],
    isWriteOnly: CallbackTo[Boolean],
    resolved: Variable = null,
    writeExpr: Node = null
  ): Reference = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any])
    __obj.updateDynamic("isRead")(isRead.toJsFn)
    __obj.updateDynamic("isReadOnly")(isReadOnly.toJsFn)
    __obj.updateDynamic("isReadWrite")(isReadWrite.toJsFn)
    __obj.updateDynamic("isWrite")(isWrite.toJsFn)
    __obj.updateDynamic("isWriteOnly")(isWriteOnly.toJsFn)
    if (resolved != null) __obj.updateDynamic("resolved")(resolved.asInstanceOf[js.Any])
    if (writeExpr != null) __obj.updateDynamic("writeExpr")(writeExpr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reference]
  }
}

