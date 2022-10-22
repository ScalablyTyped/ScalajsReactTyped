package typingsJapgolly.baseui.components

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.baseui.anon.TypeofSelectComponent
import typingsJapgolly.baseui.selectSelectComponentMod.default
import typingsJapgolly.baseui.selectTypesMod.SelectProps
import typingsJapgolly.react.mod.ComponentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Select {
  
  @JSImport("baseui/select", "Select")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Select.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ComponentProps[(Instantiable1[/* props */ SelectProps, default]) & TypeofSelectComponent]): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
