package typingsJapgolly.wixDesignSystemsProviders

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.react.mod.Context
import typingsJapgolly.wixDesignSystemsProviders.distTypesWixDesignSystemsMaskingProviderWixDesignSystemsMaskingProviderDottypesMod.WixDesignSystemsMaskingContextProps
import typingsJapgolly.wixDesignSystemsProviders.distTypesWixDesignSystemsMaskingProviderWixDesignSystemsMaskingProviderDottypesMod.WixDesignSystemsMaskingProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesWixDesignSystemsMaskingProviderMod {
  
  @JSImport("wix-design-systems-providers/dist/types/WixDesignSystemsMaskingProvider", "WixDesignSystemsMaskingContext")
  @js.native
  val WixDesignSystemsMaskingContext: Context[WixDesignSystemsMaskingContextProps] = js.native
  
  object WixDesignSystemsMaskingProvider {
    
    inline def apply(hasChildren: WixDesignSystemsMaskingProviderProps): Element = ^.asInstanceOf[js.Dynamic].apply(hasChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("wix-design-systems-providers/dist/types/WixDesignSystemsMaskingProvider", "WixDesignSystemsMaskingProvider")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-design-systems-providers/dist/types/WixDesignSystemsMaskingProvider", "WixDesignSystemsMaskingProvider.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
}
