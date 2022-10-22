package typingsJapgolly.reactFrameComponent.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.ProviderProps
import typingsJapgolly.reactFrameComponent.mod.FrameContextProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FrameContextProvider {
  
  inline def apply(value: FrameContextProps): Default[js.Object] = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ProviderProps[FrameContextProps]]))
  }
  
  @JSImport("react-frame-component", "FrameContextProvider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ProviderProps[FrameContextProps]): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
