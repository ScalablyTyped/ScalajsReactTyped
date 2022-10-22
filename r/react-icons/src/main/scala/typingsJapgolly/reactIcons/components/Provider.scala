package typingsJapgolly.reactIcons.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.ProviderProps
import typingsJapgolly.reactIcons.libEsmIconContextMod.IconContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Provider {
  
  inline def apply(value: IconContext): Default[js.Object] = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ProviderProps[IconContext]]))
  }
  
  @JSImport("react-icons/lib/esm/iconContext", "IconContext.Provider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ProviderProps[IconContext]): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
