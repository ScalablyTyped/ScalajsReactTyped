package typingsJapgolly.snabbdom

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.snabbdom.hooksMod.CreateHook
import typingsJapgolly.snabbdom.hooksMod.DestroyHook
import typingsJapgolly.snabbdom.hooksMod.PostHook
import typingsJapgolly.snabbdom.hooksMod.PreHook
import typingsJapgolly.snabbdom.hooksMod.RemoveHook
import typingsJapgolly.snabbdom.hooksMod.UpdateHook
import typingsJapgolly.snabbdom.vnodeMod.VNode_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<snabbdom.snabbdom/modules/module.Module> */
trait PartialModule extends js.Object {
  var create: js.UndefOr[CreateHook] = js.undefined
  var destroy: js.UndefOr[DestroyHook] = js.undefined
  var post: js.UndefOr[PostHook] = js.undefined
  var pre: js.UndefOr[PreHook] = js.undefined
  var remove: js.UndefOr[RemoveHook] = js.undefined
  var update: js.UndefOr[UpdateHook] = js.undefined
}

object PartialModule {
  @scala.inline
  def apply(
    create: (/* emptyVNode */ VNode_, /* vNode */ VNode_) => CallbackTo[js.Any] = null,
    destroy: /* vNode */ VNode_ => CallbackTo[js.Any] = null,
    post: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    pre: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    remove: (/* vNode */ VNode_, /* removeCallback */ js.Function0[Unit]) => CallbackTo[js.Any] = null,
    update: (/* oldVNode */ VNode_, /* vNode */ VNode_) => CallbackTo[js.Any] = null
  ): PartialModule = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2((t0: /* emptyVNode */ typingsJapgolly.snabbdom.vnodeMod.VNode_, t1: /* vNode */ typingsJapgolly.snabbdom.vnodeMod.VNode_) => create(t0, t1).runNow()))
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1((t0: /* vNode */ typingsJapgolly.snabbdom.vnodeMod.VNode_) => destroy(t0).runNow()))
    post.foreach(p => __obj.updateDynamic("post")(p.toJsFn))
    pre.foreach(p => __obj.updateDynamic("pre")(p.toJsFn))
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction2((t0: /* vNode */ typingsJapgolly.snabbdom.vnodeMod.VNode_, t1: /* removeCallback */ js.Function0[scala.Unit]) => remove(t0, t1).runNow()))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction2((t0: /* oldVNode */ typingsJapgolly.snabbdom.vnodeMod.VNode_, t1: /* vNode */ typingsJapgolly.snabbdom.vnodeMod.VNode_) => update(t0, t1).runNow()))
    __obj.asInstanceOf[PartialModule]
  }
}

