package typingsJapgolly.dojo.dojox.treemap

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/treemap/_utils.html
  *
  *
  */
trait utils extends js.Object {
  /**
    *
    * @param array
    * @param callback
    */
  def find(array: js.Array[_], callback: js.Function): js.Any
  /**
    *
    * @param items
    * @param groupingFunctions
    * @param measureFunction
    */
  def group(items: js.Array[_], groupingFunctions: js.Array[_], measureFunction: js.Function): js.Object
  /**
    *
    * @param items
    * @param areaFunc
    */
  def initElements(items: js.Any, areaFunc: js.Any): js.Object
  /**
    *
    * @param items
    * @param width
    * @param height
    * @param areaFunc
    * @param rtl
    */
  def solve(items: js.Any, width: js.Any, height: js.Any, areaFunc: js.Any, rtl: js.Any): js.Object
}

object utils {
  @scala.inline
  def apply(
    find: (js.Array[js.Any], js.Function) => CallbackTo[js.Any],
    group: (js.Array[js.Any], js.Array[js.Any], js.Function) => CallbackTo[js.Object],
    initElements: (js.Any, js.Any) => CallbackTo[js.Object],
    solve: (js.Any, js.Any, js.Any, js.Any, js.Any) => CallbackTo[js.Object]
  ): utils = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("find")(js.Any.fromFunction2((t0: js.Array[js.Any], t1: js.Function) => find(t0, t1).runNow()))
    __obj.updateDynamic("group")(js.Any.fromFunction3((t0: js.Array[js.Any], t1: js.Array[js.Any], t2: js.Function) => group(t0, t1, t2).runNow()))
    __obj.updateDynamic("initElements")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => initElements(t0, t1).runNow()))
    __obj.updateDynamic("solve")(js.Any.fromFunction5((t0: js.Any, t1: js.Any, t2: js.Any, t3: js.Any, t4: js.Any) => solve(t0, t1, t2, t3, t4).runNow()))
    __obj.asInstanceOf[utils]
  }
}

