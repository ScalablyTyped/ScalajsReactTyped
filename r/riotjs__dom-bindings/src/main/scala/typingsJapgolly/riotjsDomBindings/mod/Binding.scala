package typingsJapgolly.riotjsDomBindings.mod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Binding[Scope, ParentScope] extends js.Object {
  def mount(el: HTMLElement, scope: Scope, parentScope: ParentScope, meta: TemplateChunkMeta): Binding[_, _]
  def unmount(scope: Scope, parentScope: ParentScope, mustRemoveRoot: Boolean): Binding[_, _]
  def update(scope: Scope, parentScope: ParentScope): Binding[_, _]
}

object Binding {
  @scala.inline
  def apply[Scope, ParentScope](
    mount: (HTMLElement, Scope, ParentScope, TemplateChunkMeta) => CallbackTo[Binding[js.Any, js.Any]],
    unmount: (Scope, ParentScope, Boolean) => CallbackTo[Binding[js.Any, js.Any]],
    update: (Scope, ParentScope) => CallbackTo[Binding[js.Any, js.Any]]
  ): Binding[Scope, ParentScope] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mount")(js.Any.fromFunction4((t0: org.scalajs.dom.raw.HTMLElement, t1: Scope, t2: ParentScope, t3: typingsJapgolly.riotjsDomBindings.mod.TemplateChunkMeta) => mount(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("unmount")(js.Any.fromFunction3((t0: Scope, t1: ParentScope, t2: scala.Boolean) => unmount(t0, t1, t2).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction2((t0: Scope, t1: ParentScope) => update(t0, t1).runNow()))
    __obj.asInstanceOf[Binding[Scope, ParentScope]]
  }
}

