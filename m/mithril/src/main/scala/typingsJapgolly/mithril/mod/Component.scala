package typingsJapgolly.mithril.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Components are a mechanism to encapsulate parts of a view to make code easier to organize and/or reuse.
	 * Any Javascript object that has a view method can be used as a Mithril component.
	 * Components can be consumed via the m() utility.
	 */
trait Component[Attrs, State /* <: Lifecycle[Attrs, State] */]
  extends Lifecycle[Attrs, State]
     with _ComponentTypes[Attrs, State] {
  /** Creates a view out of virtual elements. */
  def view(vnode: Vnode[Attrs, State]): Children | Null | Unit
}

object Component {
  @scala.inline
  def apply[Attrs, State /* <: Lifecycle[Attrs, State] */](
    view: Vnode[Attrs, State] => CallbackTo[Children | Null | Unit],
    onbeforeremove: js.ThisFunction1[State, /* vnode */ VnodeDOM[Attrs, State], js.Promise[_] | Unit] = null,
    onbeforeupdate: js.ThisFunction2[
      State, 
      /* vnode */ Vnode[Attrs, State], 
      /* old */ VnodeDOM[Attrs, State], 
      Boolean | Unit
    ] = null,
    oncreate: js.ThisFunction1[State, /* vnode */ VnodeDOM[Attrs, State], _] = null,
    oninit: js.ThisFunction1[State, /* vnode */ Vnode[Attrs, State], _] = null,
    onremove: js.ThisFunction1[State, /* vnode */ VnodeDOM[Attrs, State], _] = null,
    onupdate: js.ThisFunction1[State, /* vnode */ VnodeDOM[Attrs, State], _] = null
  ): Component[Attrs, State] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("view")(js.Any.fromFunction1((t0: typingsJapgolly.mithril.mod.Vnode[Attrs, State]) => view(t0).runNow()))
    if (onbeforeremove != null) __obj.updateDynamic("onbeforeremove")(onbeforeremove.asInstanceOf[js.Any])
    if (onbeforeupdate != null) __obj.updateDynamic("onbeforeupdate")(onbeforeupdate.asInstanceOf[js.Any])
    if (oncreate != null) __obj.updateDynamic("oncreate")(oncreate.asInstanceOf[js.Any])
    if (oninit != null) __obj.updateDynamic("oninit")(oninit.asInstanceOf[js.Any])
    if (onremove != null) __obj.updateDynamic("onremove")(onremove.asInstanceOf[js.Any])
    if (onupdate != null) __obj.updateDynamic("onupdate")(onupdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Component[Attrs, State]]
  }
}

