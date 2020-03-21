package typingsJapgolly.snabbdom

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

@JSImport("snabbdom/modules/module", JSImport.Namespace)
@js.native
object moduleMod extends js.Object {
  @js.native
  trait Module extends js.Object {
    @JSName("create")
    var create_Original: CreateHook = js.native
    @JSName("destroy")
    var destroy_Original: DestroyHook = js.native
    @JSName("post")
    var post_Original: PostHook = js.native
    @JSName("pre")
    var pre_Original: PreHook = js.native
    @JSName("remove")
    var remove_Original: RemoveHook = js.native
    @JSName("update")
    var update_Original: UpdateHook = js.native
    def create(emptyVNode: VNode_, vNode: VNode_): js.Any = js.native
    def destroy(vNode: VNode_): js.Any = js.native
    def post(): js.Any = js.native
    def pre(): js.Any = js.native
    def remove(vNode: VNode_, removeCallback: js.Function0[Unit]): js.Any = js.native
    def update(oldVNode: VNode_, vNode: VNode_): js.Any = js.native
  }
  
}

