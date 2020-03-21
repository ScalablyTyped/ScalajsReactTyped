package typingsJapgolly.riotjsDomBindings.mod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.DocumentFragment
import org.scalajs.dom.raw.HTMLCollection
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateChunk[Scope, ParentScope] extends js.Object {
  var bindings: js.UndefOr[js.Array[Binding[Scope, ParentScope]]] = js.undefined
  var bindingsData: js.UndefOr[js.Array[BindingData]] = js.undefined
  var children: js.UndefOr[HTMLCollection] = js.undefined
  var dom: js.UndefOr[HTMLElement] = js.undefined
  var el: js.UndefOr[HTMLElement] = js.undefined
  var fragment: js.UndefOr[DocumentFragment] = js.undefined
  var html: js.UndefOr[String | Null] = js.undefined
  var isTemplateTag: js.UndefOr[Boolean] = js.undefined
  def createDOM(el: HTMLElement): TemplateChunk[_, _]
  def mount(el: HTMLElement, scope: Scope, parentScope: ParentScope, meta: TemplateChunkMeta): TemplateChunk[_, _]
  def unmount(scope: Scope, parentScope: ParentScope, mustRemoveRoot: Boolean): TemplateChunk[_, _]
  def update(scope: Scope, parentScope: ParentScope): TemplateChunk[_, _]
}

object TemplateChunk {
  @scala.inline
  def apply[Scope, ParentScope](
    createDOM: HTMLElement => CallbackTo[TemplateChunk[js.Any, js.Any]],
    mount: (HTMLElement, Scope, ParentScope, TemplateChunkMeta) => CallbackTo[TemplateChunk[js.Any, js.Any]],
    unmount: (Scope, ParentScope, Boolean) => CallbackTo[TemplateChunk[js.Any, js.Any]],
    update: (Scope, ParentScope) => CallbackTo[TemplateChunk[js.Any, js.Any]],
    bindings: js.Array[Binding[Scope, ParentScope]] = null,
    bindingsData: js.Array[BindingData] = null,
    children: HTMLCollection = null,
    dom: HTMLElement = null,
    el: HTMLElement = null,
    fragment: DocumentFragment = null,
    html: String = null,
    isTemplateTag: js.UndefOr[Boolean] = js.undefined
  ): TemplateChunk[Scope, ParentScope] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createDOM")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.HTMLElement) => createDOM(t0).runNow()))
    __obj.updateDynamic("mount")(js.Any.fromFunction4((t0: org.scalajs.dom.raw.HTMLElement, t1: Scope, t2: ParentScope, t3: typingsJapgolly.riotjsDomBindings.mod.TemplateChunkMeta) => mount(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("unmount")(js.Any.fromFunction3((t0: Scope, t1: ParentScope, t2: scala.Boolean) => unmount(t0, t1, t2).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction2((t0: Scope, t1: ParentScope) => update(t0, t1).runNow()))
    if (bindings != null) __obj.updateDynamic("bindings")(bindings.asInstanceOf[js.Any])
    if (bindingsData != null) __obj.updateDynamic("bindingsData")(bindingsData.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (dom != null) __obj.updateDynamic("dom")(dom.asInstanceOf[js.Any])
    if (el != null) __obj.updateDynamic("el")(el.asInstanceOf[js.Any])
    if (fragment != null) __obj.updateDynamic("fragment")(fragment.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (!js.isUndefined(isTemplateTag)) __obj.updateDynamic("isTemplateTag")(isTemplateTag.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateChunk[Scope, ParentScope]]
  }
}

