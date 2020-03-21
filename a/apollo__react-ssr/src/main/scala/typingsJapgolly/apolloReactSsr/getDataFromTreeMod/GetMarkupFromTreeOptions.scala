package typingsJapgolly.apolloReactSsr.getDataFromTreeMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMarkupFromTreeOptions extends js.Object {
  var context: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var renderFunction: js.UndefOr[js.Function1[/* tree */ Element, String]] = js.undefined
  var tree: Node
}

object GetMarkupFromTreeOptions {
  @scala.inline
  def apply(
    context: StringDictionary[js.Any] = null,
    renderFunction: /* tree */ Element => CallbackTo[String] = null,
    tree: VdomNode = null
  ): GetMarkupFromTreeOptions = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (renderFunction != null) __obj.updateDynamic("renderFunction")(js.Any.fromFunction1((t0: /* tree */ japgolly.scalajs.react.raw.React.Element) => renderFunction(t0).runNow()))
    if (tree != null) __obj.updateDynamic("tree")(tree.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMarkupFromTreeOptions]
  }
}

