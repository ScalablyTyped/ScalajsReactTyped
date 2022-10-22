package typingsJapgolly.antdMobile.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.antdMobile.anon.Children
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Wrapper {
  
  @JSImport("antd-mobile/es/components/popover/wrapper", "Wrapper")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Wrapper.type): Default[typingsJapgolly.antdMobile.esComponentsPopoverWrapperMod.Wrapper] = new Default[typingsJapgolly.antdMobile.esComponentsPopoverWrapperMod.Wrapper](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Children): Default[typingsJapgolly.antdMobile.esComponentsPopoverWrapperMod.Wrapper] = new Default[typingsJapgolly.antdMobile.esComponentsPopoverWrapperMod.Wrapper](js.Array(this.component, p.asInstanceOf[js.Any]))
}
