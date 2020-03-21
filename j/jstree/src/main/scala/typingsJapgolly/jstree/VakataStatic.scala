package typingsJapgolly.jstree

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VakataStatic extends js.Object {
  var context: js.Any
  var dnd: js.Any
  var html: js.Any
  var search: js.Any
  var storage: js.Any
  /**
    * filter array
    */
  def array_filter(c: js.Any, a: js.Any, b: js.Any, d: js.Array[_], e: js.Any): js.Array[_]
  /**
    * remove item from array
    */
  def array_remove(array: js.Array[_], from: Double): js.Array[_]
  /**
    * remove item from array
    */
  def array_remove_item(array: js.Array[_], item: js.Any): js.Array[_]
  /**
    * returns array with unique elements
    */
  def array_unique(array: js.Array[_]): js.Array[_]
  /**
    * collect attributes
    */
  def attributes(node: js.Any, with_values: js.Any): js.Any
}

object VakataStatic {
  @scala.inline
  def apply(
    array_filter: (js.Any, js.Any, js.Any, js.Array[js.Any], js.Any) => CallbackTo[js.Array[js.Any]],
    array_remove: (js.Array[js.Any], Double) => CallbackTo[js.Array[js.Any]],
    array_remove_item: (js.Array[js.Any], js.Any) => CallbackTo[js.Array[js.Any]],
    array_unique: js.Array[js.Any] => CallbackTo[js.Array[js.Any]],
    attributes: (js.Any, js.Any) => CallbackTo[js.Any],
    context: js.Any,
    dnd: js.Any,
    html: js.Any,
    search: js.Any,
    storage: js.Any
  ): VakataStatic = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], dnd = dnd.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any])
    __obj.updateDynamic("array_filter")(js.Any.fromFunction5((t0: js.Any, t1: js.Any, t2: js.Any, t3: js.Array[js.Any], t4: js.Any) => array_filter(t0, t1, t2, t3, t4).runNow()))
    __obj.updateDynamic("array_remove")(js.Any.fromFunction2((t0: js.Array[js.Any], t1: scala.Double) => array_remove(t0, t1).runNow()))
    __obj.updateDynamic("array_remove_item")(js.Any.fromFunction2((t0: js.Array[js.Any], t1: js.Any) => array_remove_item(t0, t1).runNow()))
    __obj.updateDynamic("array_unique")(js.Any.fromFunction1((t0: js.Array[js.Any]) => array_unique(t0).runNow()))
    __obj.updateDynamic("attributes")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => attributes(t0, t1).runNow()))
    __obj.asInstanceOf[VakataStatic]
  }
}

