package typingsJapgolly.reactNativeNavigation.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesNavigationComponentPropsMod.NavigationComponentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for Props & typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesNavigationComponentPropsMod.NavigationComponentProps because: IArray(Could't extract props from Props because couldn't resolve ClassTree.) */
object NavigationComponent {
  
  def apply[Props, State, Snapshot](p: Props & NavigationComponentProps): Builder[Props, State, Snapshot] = new Builder[Props, State, Snapshot](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("react-native-navigation", "NavigationComponent")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[Props, State, Snapshot] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[
          typingsJapgolly.reactNativeNavigation.mod.NavigationComponent[Props, State, Snapshot]
        ]
  
  implicit def make[Props, State, Snapshot](companion: NavigationComponent.type): Builder[Props, State, Snapshot] = new Builder[Props, State, Snapshot](js.Array(this.component, js.Dictionary.empty))()
}
