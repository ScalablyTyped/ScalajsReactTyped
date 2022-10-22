package typingsJapgolly.reactNavigation.components

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.ComponentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Text {
  
  @JSImport("react-navigation", "Themed.Text")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Text.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ComponentProps[Instantiable0[typingsJapgolly.reactNative.mod.Text]]): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
