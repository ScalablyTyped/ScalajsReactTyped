package typingsJapgolly.dojo.dojox.dtl.tag

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/tag/logic.html
  *
  *
  */
trait logic extends js.Object {
  /**
    *
    * @param assign
    * @param loop
    * @param reversed
    * @param nodelist
    */
  def ForNode(assign: js.Any, loop: js.Any, reversed: js.Any, nodelist: js.Any): Unit
  /**
    *
    * @param var1
    * @param var2
    * @param trues
    * @param falses
    * @param negate
    */
  def IfEqualNode(var1: js.Any, var2: js.Any, trues: js.Any, falses: js.Any, negate: js.Any): Unit
  /**
    *
    * @param bools
    * @param trues
    * @param falses
    * @param type
    */
  def IfNode(bools: js.Any, trues: js.Any, falses: js.Any, `type`: js.Any): Unit
  /**
    *
    * @param parser
    * @param token
    */
  def for_(parser: js.Any, token: js.Any): js.Any
  /**
    *
    * @param parser
    * @param token
    */
  def if_(parser: js.Any, token: js.Any): js.Any
  /**
    *
    * @param parser
    * @param token
    */
  def ifequal(parser: js.Any, token: js.Any): js.Any
  /**
    *
    * @param parser
    * @param token
    */
  def ifnotequal(parser: js.Any, token: js.Any): js.Any
}

object logic {
  @scala.inline
  def apply(
    ForNode: (js.Any, js.Any, js.Any, js.Any) => Callback,
    IfEqualNode: (js.Any, js.Any, js.Any, js.Any, js.Any) => Callback,
    IfNode: (js.Any, js.Any, js.Any, js.Any) => Callback,
    for_ : (js.Any, js.Any) => CallbackTo[js.Any],
    if_ : (js.Any, js.Any) => CallbackTo[js.Any],
    ifequal: (js.Any, js.Any) => CallbackTo[js.Any],
    ifnotequal: (js.Any, js.Any) => CallbackTo[js.Any]
  ): logic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ForNode")(js.Any.fromFunction4((t0: js.Any, t1: js.Any, t2: js.Any, t3: js.Any) => ForNode(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("IfEqualNode")(js.Any.fromFunction5((t0: js.Any, t1: js.Any, t2: js.Any, t3: js.Any, t4: js.Any) => IfEqualNode(t0, t1, t2, t3, t4).runNow()))
    __obj.updateDynamic("IfNode")(js.Any.fromFunction4((t0: js.Any, t1: js.Any, t2: js.Any, t3: js.Any) => IfNode(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("for_")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => for_(t0, t1).runNow()))
    __obj.updateDynamic("if_")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => if_(t0, t1).runNow()))
    __obj.updateDynamic("ifequal")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => ifequal(t0, t1).runNow()))
    __obj.updateDynamic("ifnotequal")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => ifnotequal(t0, t1).runNow()))
    __obj.asInstanceOf[logic]
  }
}

