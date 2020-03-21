package typingsJapgolly.preact.internalMod

import org.scalajs.dom.raw.DocumentFragment
import org.scalajs.dom.raw.Element
import typingsJapgolly.preact.mod.ComponentChild
import typingsJapgolly.preact.mod.Options_
import typingsJapgolly.std.Document_
import typingsJapgolly.std.ShadowRoot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends Options_ {
  /** Attach a hook that is invoked after a tree was mounted or was updated. */
  var _commit: js.UndefOr[
    js.Function2[
      /* vnode */ VNode[js.Object], 
      /* commitQueue */ js.Array[Component[js.Object, js.Object]], 
      Unit
    ]
  ] = js.native
  /** Attach a hook that is invoked before a vnode is diffed. */
  var _diff: js.UndefOr[js.Function1[/* vnode */ VNode[js.Object], Unit]] = js.native
  /** Attach a hook that is invoked before a hook's state is queried. */
  var _hook: js.UndefOr[js.Function1[/* component */ Component[js.Object, js.Object], Unit]] = js.native
  /** Attach a hook that is invoked before a vnode has rendered. */
  var _render: js.UndefOr[js.Function1[/* vnode */ VNode[js.Object], Unit]] = js.native
  /** Attach a hook that is invoked before render, mainly to check the arguments. */
  var _root: js.UndefOr[
    js.Function2[
      /* vnode */ ComponentChild, 
      /* parent */ Element | Document_ | ShadowRoot | DocumentFragment, 
      Unit
    ]
  ] = js.native
  def _catchError(error: js.Any, vnode: VNode[js.Object]): Unit = js.native
  /** Attach a hook that is invoked after an error is caught in a component but before calling lifecycle hooks */
  def _catchError(error: js.Any, vnode: VNode[js.Object], oldVNode: VNode[js.Object]): Unit = js.native
}

