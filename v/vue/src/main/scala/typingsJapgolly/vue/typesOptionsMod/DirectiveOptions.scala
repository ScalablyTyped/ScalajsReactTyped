package typingsJapgolly.vue.typesOptionsMod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.vue.typesVnodeMod.VNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectiveOptions extends js.Object {
  var bind: js.UndefOr[DirectiveFunction] = js.undefined
  var componentUpdated: js.UndefOr[DirectiveFunction] = js.undefined
  var inserted: js.UndefOr[DirectiveFunction] = js.undefined
  var unbind: js.UndefOr[DirectiveFunction] = js.undefined
  var update: js.UndefOr[DirectiveFunction] = js.undefined
}

object DirectiveOptions {
  @scala.inline
  def apply(
    bind: (/* el */ HTMLElement, /* binding */ DirectiveBinding, /* vnode */ VNode, /* oldVnode */ VNode) => Callback = null,
    componentUpdated: (/* el */ HTMLElement, /* binding */ DirectiveBinding, /* vnode */ VNode, /* oldVnode */ VNode) => Callback = null,
    inserted: (/* el */ HTMLElement, /* binding */ DirectiveBinding, /* vnode */ VNode, /* oldVnode */ VNode) => Callback = null,
    unbind: (/* el */ HTMLElement, /* binding */ DirectiveBinding, /* vnode */ VNode, /* oldVnode */ VNode) => Callback = null,
    update: (/* el */ HTMLElement, /* binding */ DirectiveBinding, /* vnode */ VNode, /* oldVnode */ VNode) => Callback = null
  ): DirectiveOptions = {
    val __obj = js.Dynamic.literal()
    if (bind != null) __obj.updateDynamic("bind")(js.Any.fromFunction4((t0: /* el */ org.scalajs.dom.raw.HTMLElement, t1: /* binding */ typingsJapgolly.vue.typesOptionsMod.DirectiveBinding, t2: /* vnode */ typingsJapgolly.vue.typesVnodeMod.VNode, t3: /* oldVnode */ typingsJapgolly.vue.typesVnodeMod.VNode) => bind(t0, t1, t2, t3).runNow()))
    if (componentUpdated != null) __obj.updateDynamic("componentUpdated")(js.Any.fromFunction4((t0: /* el */ org.scalajs.dom.raw.HTMLElement, t1: /* binding */ typingsJapgolly.vue.typesOptionsMod.DirectiveBinding, t2: /* vnode */ typingsJapgolly.vue.typesVnodeMod.VNode, t3: /* oldVnode */ typingsJapgolly.vue.typesVnodeMod.VNode) => componentUpdated(t0, t1, t2, t3).runNow()))
    if (inserted != null) __obj.updateDynamic("inserted")(js.Any.fromFunction4((t0: /* el */ org.scalajs.dom.raw.HTMLElement, t1: /* binding */ typingsJapgolly.vue.typesOptionsMod.DirectiveBinding, t2: /* vnode */ typingsJapgolly.vue.typesVnodeMod.VNode, t3: /* oldVnode */ typingsJapgolly.vue.typesVnodeMod.VNode) => inserted(t0, t1, t2, t3).runNow()))
    if (unbind != null) __obj.updateDynamic("unbind")(js.Any.fromFunction4((t0: /* el */ org.scalajs.dom.raw.HTMLElement, t1: /* binding */ typingsJapgolly.vue.typesOptionsMod.DirectiveBinding, t2: /* vnode */ typingsJapgolly.vue.typesVnodeMod.VNode, t3: /* oldVnode */ typingsJapgolly.vue.typesVnodeMod.VNode) => unbind(t0, t1, t2, t3).runNow()))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction4((t0: /* el */ org.scalajs.dom.raw.HTMLElement, t1: /* binding */ typingsJapgolly.vue.typesOptionsMod.DirectiveBinding, t2: /* vnode */ typingsJapgolly.vue.typesVnodeMod.VNode, t3: /* oldVnode */ typingsJapgolly.vue.typesVnodeMod.VNode) => update(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[DirectiveOptions]
  }
}

