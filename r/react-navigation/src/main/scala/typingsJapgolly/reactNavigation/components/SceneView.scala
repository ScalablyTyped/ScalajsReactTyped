package typingsJapgolly.reactNavigation.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactNavigation.mod.NavigationProp
import typingsJapgolly.reactNavigation.mod.SceneViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SceneView {
  
  inline def apply(component: ComponentType[js.Object], navigation: NavigationProp[Any], screenProps: Any): Default[js.Object] = {
    val __props = js.Dynamic.literal(component = component.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], screenProps = screenProps.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[SceneViewProps]))
  }
  
  @JSImport("react-navigation", "SceneView")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: SceneViewProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
