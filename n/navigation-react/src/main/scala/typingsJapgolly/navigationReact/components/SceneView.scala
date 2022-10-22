package typingsJapgolly.navigationReact.components

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.navigation.mod.StateContext
import typingsJapgolly.navigationReact.mod.SceneViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SceneView {
  
  inline def apply[NavigationInfo /* <: StringDictionary[Any] */](
    active: (/* keyof NavigationInfo */ String) | (js.Array[/* keyof NavigationInfo */ String]) | (js.Function1[/* stateContext */ StateContext[String, Any], Boolean])
  ): Builder[NavigationInfo] = {
    val __props = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
    new Builder[NavigationInfo](js.Array(this.component, __props.asInstanceOf[SceneViewProps[NavigationInfo]]))
  }
  
  @JSImport("navigation-react", "SceneView")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[NavigationInfo /* <: StringDictionary[Any] */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.navigationReact.mod.SceneView[NavigationInfo]]
  
  def withProps[NavigationInfo /* <: StringDictionary[Any] */](p: SceneViewProps[NavigationInfo]): Builder[NavigationInfo] = new Builder[NavigationInfo](js.Array(this.component, p.asInstanceOf[js.Any]))
}
