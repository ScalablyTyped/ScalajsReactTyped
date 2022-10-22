package typingsJapgolly.reactNativeKeepAwake.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactNativeKeepAwake.anon.Children
import typingsJapgolly.reactNativeKeepAwake.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeKeepAwake {
  
  @JSImport("react-native-keep-awake", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ReactNativeKeepAwake.type): Default[default] = new Default[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Children): Default[default] = new Default[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
