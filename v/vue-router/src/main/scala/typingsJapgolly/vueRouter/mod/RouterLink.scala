package typingsJapgolly.vueRouter.mod

import typingsJapgolly.vueRouter.anon.Slots
import typingsJapgolly.vueRouter.anon.`0`
import typingsJapgolly.vueRouter.mod.^
import typingsJapgolly.vueRuntimeCore.mod.AllowedComponentProps
import typingsJapgolly.vueRuntimeCore.mod.ComponentCustomProps
import typingsJapgolly.vueRuntimeCore.mod.VNodeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("vue-router", "RouterLink")
@js.native
open class RouterLink ()
  extends StObject
     with Slots {
  
  /* CompleteClass */
  @JSName("$props")
  var $props: AllowedComponentProps & ComponentCustomProps & VNodeProps & RouterLinkProps = js.native
  
  /* CompleteClass */
  @JSName("$slots")
  var $slots: `0` = js.native
}
object RouterLink {
  
  inline def apply: RouterLinkI = ^.asInstanceOf[js.Dynamic].selectDynamic("RouterLink").asInstanceOf[RouterLinkI]
}
