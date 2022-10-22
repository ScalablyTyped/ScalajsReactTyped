package typingsJapgolly.wixDesignSystemsProviders.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.wixDesignSystemsProviders.distTypesWixDesignSystemsMaskingProviderWixDesignSystemsMaskingProviderDottypesMod.WixDesignSystemsMaskingProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WixDesignSystemsMaskingProvider {
  
  @JSImport("wix-design-systems-providers", "WixDesignSystemsMaskingProvider")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: WixDesignSystemsMaskingProvider.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: WixDesignSystemsMaskingProviderProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
