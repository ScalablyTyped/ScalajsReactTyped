package typingsJapgolly.vueRouter.mod

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.vueRouter.anon.Default
import typingsJapgolly.vueRouter.anon.Props
import typingsJapgolly.vueRouter.mod.^
import typingsJapgolly.vueRuntimeCore.mod.AllowedComponentProps
import typingsJapgolly.vueRuntimeCore.mod.ComponentCustomProps
import typingsJapgolly.vueRuntimeCore.mod.VNodeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("vue-router", "RouterView")
@js.native
open class RouterView ()
  extends StObject
     with Props {
  
  /* CompleteClass */
  @JSName("$props")
  var $props: AllowedComponentProps & ComponentCustomProps & VNodeProps & RouterViewProps = js.native
  
  /* CompleteClass */
  @JSName("$slots")
  var $slots: Default = js.native
}
object RouterView {
  
  inline def apply: Instantiable0[Props] = ^.asInstanceOf[js.Dynamic].selectDynamic("RouterView").asInstanceOf[Instantiable0[Props]]
}
