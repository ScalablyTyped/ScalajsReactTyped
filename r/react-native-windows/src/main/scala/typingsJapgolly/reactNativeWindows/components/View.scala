package typingsJapgolly.reactNativeWindows.components

import typingsJapgolly.reactNativeWindows.rntypesMod.ViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object View {
  
  @JSImport("react-native-windows", "View")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: View.type): SharedBuilder_ViewProps1270425008[typingsJapgolly.reactNativeWindows.mod.View] = new SharedBuilder_ViewProps1270425008[typingsJapgolly.reactNativeWindows.mod.View](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ViewProps): SharedBuilder_ViewProps1270425008[typingsJapgolly.reactNativeWindows.mod.View] = new SharedBuilder_ViewProps1270425008[typingsJapgolly.reactNativeWindows.mod.View](js.Array(this.component, p.asInstanceOf[js.Any]))
}
