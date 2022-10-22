package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.wixStyleReact.distTypesWixStyleReactMaskingProviderWixStyleReactMaskingProviderDottypesMod.WixStyleReactMaskingProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WixStyleReactMaskingProvider {
  
  @JSImport("wix-style-react", "WixStyleReactMaskingProvider")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: WixStyleReactMaskingProvider.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: WixStyleReactMaskingProviderProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
