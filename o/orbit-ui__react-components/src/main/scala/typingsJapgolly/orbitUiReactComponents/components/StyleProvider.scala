package typingsJapgolly.orbitUiReactComponents.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.orbitUiReactComponents.distSharedSrcStyleContextMod.StyleContextType
import typingsJapgolly.react.mod.ProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StyleProvider {
  
  inline def apply(value: StyleContextType): Default[js.Object] = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ProviderProps[StyleContextType]]))
  }
  
  @JSImport("@orbit-ui/react-components", "StyleProvider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ProviderProps[StyleContextType]): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
