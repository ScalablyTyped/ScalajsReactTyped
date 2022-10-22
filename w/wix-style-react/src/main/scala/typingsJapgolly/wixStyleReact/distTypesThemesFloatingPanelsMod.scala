package typingsJapgolly.wixStyleReact

import typingsJapgolly.wixStyleReact.distTypesThemeProviderMod.ThemeInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesThemesFloatingPanelsMod {
  
  @JSImport("wix-style-react/dist/types/Themes/floatingPanels", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def theme(FloatingPanelsProps: FloatingPanelsProps): ThemeInterface = ^.asInstanceOf[js.Dynamic].applyDynamic("theme")(FloatingPanelsProps.asInstanceOf[js.Any]).asInstanceOf[ThemeInterface]
  
  trait FloatingPanelsProps
    extends StObject
       with ThemeInterface {
    
    var mainColor: js.UndefOr[String] = js.undefined
  }
  object FloatingPanelsProps {
    
    inline def apply(): FloatingPanelsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FloatingPanelsProps]
    }
    
    extension [Self <: FloatingPanelsProps](x: Self) {
      
      inline def setMainColor(value: String): Self = StObject.set(x, "mainColor", value.asInstanceOf[js.Any])
      
      inline def setMainColorUndefined: Self = StObject.set(x, "mainColor", js.undefined)
    }
  }
}
