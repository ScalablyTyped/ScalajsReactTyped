package typingsJapgolly.morphdom.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MorphDomOptions extends js.Object {
  var childrenOnly: js.UndefOr[Boolean] = js.undefined
  var getNodeKey: js.UndefOr[js.Function1[/* node */ Node, _]] = js.undefined
  var onBeforeElChildrenUpdated: js.UndefOr[js.Function2[/* fromEl */ HTMLElement, /* toEl */ HTMLElement, Boolean]] = js.undefined
  var onBeforeElUpdated: js.UndefOr[js.Function2[/* fromEl */ HTMLElement, /* toEl */ HTMLElement, Boolean]] = js.undefined
  var onBeforeNodeAdded: js.UndefOr[js.Function1[/* node */ Node, Node]] = js.undefined
  var onBeforeNodeDiscarded: js.UndefOr[js.Function1[/* node */ Node, Boolean]] = js.undefined
  var onElUpdated: js.UndefOr[js.Function1[/* el */ HTMLElement, Unit]] = js.undefined
  var onNodeAdded: js.UndefOr[js.Function1[/* node */ Node, Node]] = js.undefined
  var onNodeDiscarded: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
}

object MorphDomOptions {
  @scala.inline
  def apply(
    childrenOnly: js.UndefOr[Boolean] = js.undefined,
    getNodeKey: /* node */ Node => CallbackTo[js.Any] = null,
    onBeforeElChildrenUpdated: (/* fromEl */ HTMLElement, /* toEl */ HTMLElement) => CallbackTo[Boolean] = null,
    onBeforeElUpdated: (/* fromEl */ HTMLElement, /* toEl */ HTMLElement) => CallbackTo[Boolean] = null,
    onBeforeNodeAdded: /* node */ Node => CallbackTo[Node] = null,
    onBeforeNodeDiscarded: /* node */ Node => CallbackTo[Boolean] = null,
    onElUpdated: /* el */ HTMLElement => Callback = null,
    onNodeAdded: /* node */ Node => CallbackTo[Node] = null,
    onNodeDiscarded: /* node */ Node => Callback = null
  ): MorphDomOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(childrenOnly)) __obj.updateDynamic("childrenOnly")(childrenOnly.asInstanceOf[js.Any])
    if (getNodeKey != null) __obj.updateDynamic("getNodeKey")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.Node) => getNodeKey(t0).runNow()))
    if (onBeforeElChildrenUpdated != null) __obj.updateDynamic("onBeforeElChildrenUpdated")(js.Any.fromFunction2((t0: /* fromEl */ org.scalajs.dom.raw.HTMLElement, t1: /* toEl */ org.scalajs.dom.raw.HTMLElement) => onBeforeElChildrenUpdated(t0, t1).runNow()))
    if (onBeforeElUpdated != null) __obj.updateDynamic("onBeforeElUpdated")(js.Any.fromFunction2((t0: /* fromEl */ org.scalajs.dom.raw.HTMLElement, t1: /* toEl */ org.scalajs.dom.raw.HTMLElement) => onBeforeElUpdated(t0, t1).runNow()))
    if (onBeforeNodeAdded != null) __obj.updateDynamic("onBeforeNodeAdded")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.Node) => onBeforeNodeAdded(t0).runNow()))
    if (onBeforeNodeDiscarded != null) __obj.updateDynamic("onBeforeNodeDiscarded")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.Node) => onBeforeNodeDiscarded(t0).runNow()))
    if (onElUpdated != null) __obj.updateDynamic("onElUpdated")(js.Any.fromFunction1((t0: /* el */ org.scalajs.dom.raw.HTMLElement) => onElUpdated(t0).runNow()))
    if (onNodeAdded != null) __obj.updateDynamic("onNodeAdded")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.Node) => onNodeAdded(t0).runNow()))
    if (onNodeDiscarded != null) __obj.updateDynamic("onNodeDiscarded")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.Node) => onNodeDiscarded(t0).runNow()))
    __obj.asInstanceOf[MorphDomOptions]
  }
}

