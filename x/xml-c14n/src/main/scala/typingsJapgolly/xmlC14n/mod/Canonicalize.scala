package typingsJapgolly.xmlC14n.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Canonicalize extends js.Object {
  def _processInner(node: Node): String
  def canonicalise(node: Node, cb: canonicaliseCb): Unit
  def name(): String
}

object Canonicalize {
  @scala.inline
  def apply(
    _processInner: Node => CallbackTo[String],
    canonicalise: (Node, canonicaliseCb) => Callback,
    name: CallbackTo[String]
  ): Canonicalize = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_processInner")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.Node) => _processInner(t0).runNow()))
    __obj.updateDynamic("canonicalise")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.Node, t1: typingsJapgolly.xmlC14n.mod.canonicaliseCb) => canonicalise(t0, t1).runNow()))
    __obj.updateDynamic("name")(name.toJsFn)
    __obj.asInstanceOf[Canonicalize]
  }
}

