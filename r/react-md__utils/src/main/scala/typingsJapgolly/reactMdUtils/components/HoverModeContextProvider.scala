package typingsJapgolly.reactMdUtils.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.ProviderProps
import typingsJapgolly.reactMdUtils.typesHoverUseHoverModeContextMod.HoverModeContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HoverModeContextProvider {
  
  inline def apply(value: HoverModeContext): Default[js.Object] = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ProviderProps[HoverModeContext]]))
  }
  
  @JSImport("@react-md/utils", "HoverModeContextProvider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ProviderProps[HoverModeContext]): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
