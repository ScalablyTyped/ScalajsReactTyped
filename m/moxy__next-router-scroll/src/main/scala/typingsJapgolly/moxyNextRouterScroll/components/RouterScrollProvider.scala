package typingsJapgolly.moxyNextRouterScroll.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.moxyNextRouterScroll.anon.Children
import typingsJapgolly.moxyNextRouterScroll.scrollBehaviorMod.NextScrollBehaviorContext
import typingsJapgolly.scrollBehavior.mod.ScrollTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RouterScrollProvider {
  
  @JSImport("@moxy/next-router-scroll", "RouterScrollProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def disableNextLinkScroll(value: Boolean): this.type = set("disableNextLinkScroll", value.asInstanceOf[js.Any])
    
    inline def shouldUpdateScroll(
      value: (/* prevContext */ NextScrollBehaviorContext | Null, NextScrollBehaviorContext) => ScrollTarget
    ): this.type = set("shouldUpdateScroll", js.Any.fromFunction2(value))
  }
  
  implicit def make(companion: RouterScrollProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Children): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
