package typingsJapgolly.reactNativeScreens.components

import typingsJapgolly.reactNativeScreens.libTypescriptTypesMod.ScreenContainerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NativeScreenContainer {
  
  @JSImport("react-native-screens", "NativeScreenContainer")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: NativeScreenContainer.type): SharedBuilder_ScreenContainerProps_317624423 = new SharedBuilder_ScreenContainerProps_317624423(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ScreenContainerProps): SharedBuilder_ScreenContainerProps_317624423 = new SharedBuilder_ScreenContainerProps_317624423(js.Array(this.component, p.asInstanceOf[js.Any]))
}
