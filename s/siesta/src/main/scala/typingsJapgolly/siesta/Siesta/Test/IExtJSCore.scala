package typingsJapgolly.siesta.Siesta.Test

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @mixin
  */
trait IExtJSCore extends js.Object {
  def Ext(): js.Any
  def clickCQ(selector: String, root: js.Any, callback: js.Function): js.Any
  def clickComponentQuery(selector: String, root: js.Any, callback: js.Function): js.Any
  def compositeQuery(selector: String, root: js.Any, allowEmpty: Boolean): js.Array[HTMLElement]
  def cq(selector: String): js.Any
  def cq1(selector: String): js.Any
  def getExt(): js.Any
  def knownBugIn(frameworkVersion: String, fn: js.Function, reason: String): js.Any
  def requireOk(args: js.Any*): Unit
}

object IExtJSCore {
  @scala.inline
  def apply(
    Ext: CallbackTo[js.Any],
    clickCQ: (String, js.Any, js.Function) => CallbackTo[js.Any],
    clickComponentQuery: (String, js.Any, js.Function) => CallbackTo[js.Any],
    compositeQuery: (String, js.Any, Boolean) => CallbackTo[js.Array[HTMLElement]],
    cq: String => CallbackTo[js.Any],
    cq1: String => CallbackTo[js.Any],
    getExt: CallbackTo[js.Any],
    knownBugIn: (String, js.Function, String) => CallbackTo[js.Any],
    requireOk: /* repeated */ js.Any => Callback
  ): IExtJSCore = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Ext")(Ext.toJsFn)
    __obj.updateDynamic("clickCQ")(js.Any.fromFunction3((t0: java.lang.String, t1: js.Any, t2: js.Function) => clickCQ(t0, t1, t2).runNow()))
    __obj.updateDynamic("clickComponentQuery")(js.Any.fromFunction3((t0: java.lang.String, t1: js.Any, t2: js.Function) => clickComponentQuery(t0, t1, t2).runNow()))
    __obj.updateDynamic("compositeQuery")(js.Any.fromFunction3((t0: java.lang.String, t1: js.Any, t2: scala.Boolean) => compositeQuery(t0, t1, t2).runNow()))
    __obj.updateDynamic("cq")(js.Any.fromFunction1((t0: java.lang.String) => cq(t0).runNow()))
    __obj.updateDynamic("cq1")(js.Any.fromFunction1((t0: java.lang.String) => cq1(t0).runNow()))
    __obj.updateDynamic("getExt")(getExt.toJsFn)
    __obj.updateDynamic("knownBugIn")(js.Any.fromFunction3((t0: java.lang.String, t1: js.Function, t2: java.lang.String) => knownBugIn(t0, t1, t2).runNow()))
    __obj.updateDynamic("requireOk")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => requireOk(t0).runNow()))
    __obj.asInstanceOf[IExtJSCore]
  }
}

