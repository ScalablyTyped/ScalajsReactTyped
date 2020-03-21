package typingsJapgolly.jqueryAjaxfile

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutBindingProvider extends js.Object {
  var getBindingAccessors: js.UndefOr[
    js.Function2[
      /* node */ Node, 
      /* bindingContext */ KnockoutBindingContext, 
      StringDictionary[String]
    ]
  ] = js.undefined
  def getBindings(node: Node, bindingContext: KnockoutBindingContext): js.Object
  def nodeHasBindings(node: Node): Boolean
}

object KnockoutBindingProvider {
  @scala.inline
  def apply(
    getBindings: (Node, KnockoutBindingContext) => CallbackTo[js.Object],
    nodeHasBindings: Node => CallbackTo[Boolean],
    getBindingAccessors: (/* node */ Node, /* bindingContext */ KnockoutBindingContext) => CallbackTo[StringDictionary[String]] = null
  ): KnockoutBindingProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getBindings")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.Node, t1: typingsJapgolly.jqueryAjaxfile.KnockoutBindingContext) => getBindings(t0, t1).runNow()))
    __obj.updateDynamic("nodeHasBindings")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.Node) => nodeHasBindings(t0).runNow()))
    if (getBindingAccessors != null) __obj.updateDynamic("getBindingAccessors")(js.Any.fromFunction2((t0: /* node */ org.scalajs.dom.raw.Node, t1: /* bindingContext */ typingsJapgolly.jqueryAjaxfile.KnockoutBindingContext) => getBindingAccessors(t0, t1).runNow()))
    __obj.asInstanceOf[KnockoutBindingProvider]
  }
}

