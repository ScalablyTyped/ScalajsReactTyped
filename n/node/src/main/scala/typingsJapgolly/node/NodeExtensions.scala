package typingsJapgolly.node

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeExtensions
  extends /* ext */ StringDictionary[js.Function2[/* m */ NodeModule, /* filename */ java.lang.String, _]] {
  def `.js`(m: NodeModule, filename: java.lang.String): js.Any
  def `.json`(m: NodeModule, filename: java.lang.String): js.Any
  def `.node`(m: NodeModule, filename: java.lang.String): js.Any
}

object NodeExtensions {
  @scala.inline
  def apply(
    `.js`: (NodeModule, java.lang.String) => CallbackTo[js.Any],
    `.json`: (NodeModule, java.lang.String) => CallbackTo[js.Any],
    `.node`: (NodeModule, java.lang.String) => CallbackTo[js.Any],
    StringDictionary: /* ext */ StringDictionary[js.Function2[/* m */ NodeModule, /* filename */ java.lang.String, _]] = null
  ): NodeExtensions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic(".js")(js.Any.fromFunction2((t0: typingsJapgolly.node.NodeModule, t1: java.lang.String) => `.js`(t0, t1).runNow()))
    __obj.updateDynamic(".json")(js.Any.fromFunction2((t0: typingsJapgolly.node.NodeModule, t1: java.lang.String) => `.json`(t0, t1).runNow()))
    __obj.updateDynamic(".node")(js.Any.fromFunction2((t0: typingsJapgolly.node.NodeModule, t1: java.lang.String) => `.node`(t0, t1).runNow()))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[NodeExtensions]
  }
}

