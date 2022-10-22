package typingsJapgolly.reactNativeScreens.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.PropsWithChildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsJapgolly.react.mod.PropsWithChildren[scala.Any] because: IArray(Could't extract props from scala.Any because couldn't resolve ClassTree.) */
object ReanimatedScreenProvider {
  
  def apply(p: PropsWithChildren[Any]): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("react-native-screens/lib/typescript/reanimated", "ReanimatedScreenProvider")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ReanimatedScreenProvider.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
}
