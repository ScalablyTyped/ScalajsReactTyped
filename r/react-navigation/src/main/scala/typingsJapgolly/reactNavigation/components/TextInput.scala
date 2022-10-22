package typingsJapgolly.reactNavigation.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.reactNavigation.anon.TypeofTextInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TextInput {
  
  @JSImport("react-navigation", "Themed.TextInput")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: TextInput.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ComponentProps[TypeofTextInput]): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
