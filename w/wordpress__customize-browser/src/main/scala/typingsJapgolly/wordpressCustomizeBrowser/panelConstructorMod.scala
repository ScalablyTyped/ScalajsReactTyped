package typingsJapgolly.wordpressCustomizeBrowser

import typingsJapgolly.wordpressCustomizeBrowser.themesPanelMod.ThemesPanel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object panelConstructorMod {
  
  trait PanelConstructor extends StObject {
    
    var themes: ThemesPanel
  }
  object PanelConstructor {
    
    inline def apply(themes: ThemesPanel): PanelConstructor = {
      val __obj = js.Dynamic.literal(themes = themes.asInstanceOf[js.Any])
      __obj.asInstanceOf[PanelConstructor]
    }
    
    extension [Self <: PanelConstructor](x: Self) {
      
      inline def setThemes(value: ThemesPanel): Self = StObject.set(x, "themes", value.asInstanceOf[js.Any])
    }
  }
}
