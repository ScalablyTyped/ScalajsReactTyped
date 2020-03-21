package typingsJapgolly.snabbdom.hooksMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.snabbdom.vnodeMod.VNode_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hooks extends js.Object {
  var create: js.UndefOr[CreateHook] = js.undefined
  var destroy: js.UndefOr[DestroyHook] = js.undefined
  var init: js.UndefOr[InitHook] = js.undefined
  var insert: js.UndefOr[InsertHook] = js.undefined
  var post: js.UndefOr[PostHook] = js.undefined
  var postpatch: js.UndefOr[PostPatchHook] = js.undefined
  var pre: js.UndefOr[PreHook] = js.undefined
  var prepatch: js.UndefOr[PrePatchHook] = js.undefined
  var remove: js.UndefOr[RemoveHook] = js.undefined
  var update: js.UndefOr[UpdateHook] = js.undefined
}

object Hooks {
  @scala.inline
  def apply(
    create: (/* emptyVNode */ VNode_, /* vNode */ VNode_) => CallbackTo[js.Any] = null,
    destroy: /* vNode */ VNode_ => CallbackTo[js.Any] = null,
    init: /* vNode */ VNode_ => CallbackTo[js.Any] = null,
    insert: /* vNode */ VNode_ => CallbackTo[js.Any] = null,
    post: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    postpatch: (/* oldVNode */ VNode_, /* vNode */ VNode_) => CallbackTo[js.Any] = null,
    pre: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    prepatch: (/* oldVNode */ VNode_, /* vNode */ VNode_) => CallbackTo[js.Any] = null,
    remove: (/* vNode */ VNode_, /* removeCallback */ js.Function0[Unit]) => CallbackTo[js.Any] = null,
    update: (/* oldVNode */ VNode_, /* vNode */ VNode_) => CallbackTo[js.Any] = null
  ): Hooks = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2((t0: /* emptyVNode */ typingsJapgolly.snabbdom.vnodeMod.VNode_, t1: /* vNode */ typingsJapgolly.snabbdom.vnodeMod.VNode_) => create(t0, t1).runNow()))
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1((t0: /* vNode */ typingsJapgolly.snabbdom.vnodeMod.VNode_) => destroy(t0).runNow()))
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction1((t0: /* vNode */ typingsJapgolly.snabbdom.vnodeMod.VNode_) => init(t0).runNow()))
    if (insert != null) __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: /* vNode */ typingsJapgolly.snabbdom.vnodeMod.VNode_) => insert(t0).runNow()))
    post.foreach(p => __obj.updateDynamic("post")(p.toJsFn))
    if (postpatch != null) __obj.updateDynamic("postpatch")(js.Any.fromFunction2((t0: /* oldVNode */ typingsJapgolly.snabbdom.vnodeMod.VNode_, t1: /* vNode */ typingsJapgolly.snabbdom.vnodeMod.VNode_) => postpatch(t0, t1).runNow()))
    pre.foreach(p => __obj.updateDynamic("pre")(p.toJsFn))
    if (prepatch != null) __obj.updateDynamic("prepatch")(js.Any.fromFunction2((t0: /* oldVNode */ typingsJapgolly.snabbdom.vnodeMod.VNode_, t1: /* vNode */ typingsJapgolly.snabbdom.vnodeMod.VNode_) => prepatch(t0, t1).runNow()))
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction2((t0: /* vNode */ typingsJapgolly.snabbdom.vnodeMod.VNode_, t1: /* removeCallback */ js.Function0[scala.Unit]) => remove(t0, t1).runNow()))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction2((t0: /* oldVNode */ typingsJapgolly.snabbdom.vnodeMod.VNode_, t1: /* vNode */ typingsJapgolly.snabbdom.vnodeMod.VNode_) => update(t0, t1).runNow()))
    __obj.asInstanceOf[Hooks]
  }
}

