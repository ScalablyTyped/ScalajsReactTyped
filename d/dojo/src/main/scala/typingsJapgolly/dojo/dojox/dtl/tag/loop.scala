package typingsJapgolly.dojo.dojox.dtl.tag

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/tag/loop.html
  *
  *
  */
trait loop extends js.Object {
  /**
    *
    * @param cyclevars
    * @param name
    * @param text
    * @param shared
    */
  def CycleNode(cyclevars: js.Any, name: js.Any, text: js.Any, shared: js.Any): Unit
  /**
    *
    * @param nodes
    * @param vars
    * @param shared
    */
  def IfChangedNode(nodes: js.Any, vars: js.Any, shared: js.Any): Unit
  /**
    *
    * @param expression
    * @param key
    * @param alias
    */
  def RegroupNode(expression: js.Any, key: js.Any, alias: js.Any): Unit
  /**
    * Cycle among the given strings each time this tag is encountered
    *
    * @param parser
    * @param token
    */
  def cycle(parser: js.Any, token: js.Any): js.Any
  /**
    *
    * @param parser
    * @param token
    */
  def ifchanged(parser: js.Any, token: js.Any): js.Any
  /**
    *
    * @param parser
    * @param token
    */
  def regroup(parser: js.Any, token: js.Any): js.Any
}

object loop {
  @scala.inline
  def apply(
    CycleNode: (js.Any, js.Any, js.Any, js.Any) => Callback,
    IfChangedNode: (js.Any, js.Any, js.Any) => Callback,
    RegroupNode: (js.Any, js.Any, js.Any) => Callback,
    cycle: (js.Any, js.Any) => CallbackTo[js.Any],
    ifchanged: (js.Any, js.Any) => CallbackTo[js.Any],
    regroup: (js.Any, js.Any) => CallbackTo[js.Any]
  ): loop = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CycleNode")(js.Any.fromFunction4((t0: js.Any, t1: js.Any, t2: js.Any, t3: js.Any) => CycleNode(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("IfChangedNode")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => IfChangedNode(t0, t1, t2).runNow()))
    __obj.updateDynamic("RegroupNode")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => RegroupNode(t0, t1, t2).runNow()))
    __obj.updateDynamic("cycle")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => cycle(t0, t1).runNow()))
    __obj.updateDynamic("ifchanged")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => ifchanged(t0, t1).runNow()))
    __obj.updateDynamic("regroup")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => regroup(t0, t1).runNow()))
    __obj.asInstanceOf[loop]
  }
}

