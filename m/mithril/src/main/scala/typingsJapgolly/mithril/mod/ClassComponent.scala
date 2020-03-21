package typingsJapgolly.mithril.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Components are a mechanism to encapsulate parts of a view to make code easier to organize and/or reuse.
	 * Any class that implements a view method can be used as a Mithril component.
	 * Components can be consumed via the m() utility.
	 */
trait ClassComponent[A] extends Lifecycle[A, ClassComponent[A]] {
  /** The onbeforeremove hook is called before a DOM element is detached from the document. If a Promise is returned, Mithril only detaches the DOM element after the promise completes. */
  @JSName("onbeforeremove")
  var onbeforeremove_ClassComponent: js.UndefOr[js.Function1[/* vnode */ VnodeDOM[A, this.type], js.Promise[_] | Unit]] = js.undefined
  /** The onbeforeupdate hook is called before a vnode is diffed in a update. */
  @JSName("onbeforeupdate")
  var onbeforeupdate_ClassComponent: js.UndefOr[
    js.Function2[/* vnode */ Vnode[A, this.type], /* old */ VnodeDOM[A, this.type], Boolean | Unit]
  ] = js.undefined
  /** The oncreate hook is called after a DOM element is created and attached to the document. */
  @JSName("oncreate")
  var oncreate_ClassComponent: js.UndefOr[js.Function1[/* vnode */ VnodeDOM[A, this.type], _]] = js.undefined
  /** The oninit hook is called before a vnode is touched by the virtual DOM engine. */
  @JSName("oninit")
  var oninit_ClassComponent: js.UndefOr[js.Function1[/* vnode */ Vnode[A, this.type], _]] = js.undefined
  /** The onremove hook is called before a DOM element is removed from the document. */
  @JSName("onremove")
  var onremove_ClassComponent: js.UndefOr[js.Function1[/* vnode */ VnodeDOM[A, this.type], _]] = js.undefined
  /** The onupdate hook is called after a DOM element is updated, while attached to the document. */
  @JSName("onupdate")
  var onupdate_ClassComponent: js.UndefOr[js.Function1[/* vnode */ VnodeDOM[A, this.type], _]] = js.undefined
  /** Creates a view out of virtual elements. */
  def view(vnode: Vnode[A, this.type]): Children | Null | Unit
}

object ClassComponent {
  @scala.inline
  def apply[A](
    view: Vnode[A, ClassComponent[A]] => CallbackTo[Children | Null | Unit],
    onbeforeremove: /* vnode */ VnodeDOM[A, ClassComponent[A]] => CallbackTo[js.Promise[js.Any] | Unit] = null,
    onbeforeupdate: (/* vnode */ Vnode[A, ClassComponent[A]], /* old */ VnodeDOM[A, ClassComponent[A]]) => CallbackTo[Boolean | Unit] = null,
    oncreate: /* vnode */ VnodeDOM[A, ClassComponent[A]] => CallbackTo[js.Any] = null,
    oninit: /* vnode */ Vnode[A, ClassComponent[A]] => CallbackTo[js.Any] = null,
    onremove: /* vnode */ VnodeDOM[A, ClassComponent[A]] => CallbackTo[js.Any] = null,
    onupdate: /* vnode */ VnodeDOM[A, ClassComponent[A]] => CallbackTo[js.Any] = null
  ): ClassComponent[A] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("view")(js.Any.fromFunction1((t0: typingsJapgolly.mithril.mod.Vnode[A, typingsJapgolly.mithril.mod.ClassComponent[A]]) => view(t0).runNow()))
    if (onbeforeremove != null) __obj.updateDynamic("onbeforeremove")(js.Any.fromFunction1((t0: /* vnode */ typingsJapgolly.mithril.mod.VnodeDOM[A, typingsJapgolly.mithril.mod.ClassComponent[A]]) => onbeforeremove(t0).runNow()))
    if (onbeforeupdate != null) __obj.updateDynamic("onbeforeupdate")(js.Any.fromFunction2((t0: /* vnode */ typingsJapgolly.mithril.mod.Vnode[A, typingsJapgolly.mithril.mod.ClassComponent[A]], t1: /* old */ typingsJapgolly.mithril.mod.VnodeDOM[A, typingsJapgolly.mithril.mod.ClassComponent[A]]) => onbeforeupdate(t0, t1).runNow()))
    if (oncreate != null) __obj.updateDynamic("oncreate")(js.Any.fromFunction1((t0: /* vnode */ typingsJapgolly.mithril.mod.VnodeDOM[A, typingsJapgolly.mithril.mod.ClassComponent[A]]) => oncreate(t0).runNow()))
    if (oninit != null) __obj.updateDynamic("oninit")(js.Any.fromFunction1((t0: /* vnode */ typingsJapgolly.mithril.mod.Vnode[A, typingsJapgolly.mithril.mod.ClassComponent[A]]) => oninit(t0).runNow()))
    if (onremove != null) __obj.updateDynamic("onremove")(js.Any.fromFunction1((t0: /* vnode */ typingsJapgolly.mithril.mod.VnodeDOM[A, typingsJapgolly.mithril.mod.ClassComponent[A]]) => onremove(t0).runNow()))
    if (onupdate != null) __obj.updateDynamic("onupdate")(js.Any.fromFunction1((t0: /* vnode */ typingsJapgolly.mithril.mod.VnodeDOM[A, typingsJapgolly.mithril.mod.ClassComponent[A]]) => onupdate(t0).runNow()))
    __obj.asInstanceOf[ClassComponent[A]]
  }
}

