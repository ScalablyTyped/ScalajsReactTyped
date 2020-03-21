package typingsJapgolly.cassandraDriver.metadataMod.metadata

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Index extends js.Object {
  var kind: IndexKind
  var name: String
  var options: js.Object
  var target: String
  def isCompositesKind(): Boolean
  def isCustomKind(): Boolean
  def isKeysKind(): Boolean
}

object Index {
  @scala.inline
  def apply(
    isCompositesKind: CallbackTo[Boolean],
    isCustomKind: CallbackTo[Boolean],
    isKeysKind: CallbackTo[Boolean],
    kind: IndexKind,
    name: String,
    options: js.Object,
    target: String
  ): Index = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("isCompositesKind")(isCompositesKind.toJsFn)
    __obj.updateDynamic("isCustomKind")(isCustomKind.toJsFn)
    __obj.updateDynamic("isKeysKind")(isKeysKind.toJsFn)
    __obj.asInstanceOf[Index]
  }
}

