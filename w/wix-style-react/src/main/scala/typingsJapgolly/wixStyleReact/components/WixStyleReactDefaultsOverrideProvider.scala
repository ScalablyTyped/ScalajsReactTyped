package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.ProviderProps
import typingsJapgolly.wixStyleReact.distTypesWixStyleReactDefaultsOverrideProviderWixStyleReactDefaultsOverrideProviderMod.WixStyleReactDefaultsOverride
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WixStyleReactDefaultsOverrideProvider {
  
  inline def apply(value: WixStyleReactDefaultsOverride): Default[js.Object] = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ProviderProps[WixStyleReactDefaultsOverride]]))
  }
  
  @JSImport("wix-style-react", "WixStyleReactDefaultsOverrideProvider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ProviderProps[WixStyleReactDefaultsOverride]): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
