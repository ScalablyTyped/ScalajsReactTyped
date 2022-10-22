package typingsJapgolly.reactNative.components

import typingsJapgolly.reactNative.mod.ViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SafeAreaView {
  
  @JSImport("react-native", "SafeAreaView")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: SafeAreaView.type): SharedBuilder_ViewProps1324401505[typingsJapgolly.reactNative.mod.SafeAreaView] = new SharedBuilder_ViewProps1324401505[typingsJapgolly.reactNative.mod.SafeAreaView](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ViewProps): SharedBuilder_ViewProps1324401505[typingsJapgolly.reactNative.mod.SafeAreaView] = new SharedBuilder_ViewProps1324401505[typingsJapgolly.reactNative.mod.SafeAreaView](js.Array(this.component, p.asInstanceOf[js.Any]))
}
