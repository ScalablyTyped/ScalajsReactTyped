package typingsJapgolly.wordpressCustomizeBrowser

import typingsJapgolly.jquery.JQuery.Event
import typingsJapgolly.jquery.JQuery.Promise
import typingsJapgolly.wordpressCustomizeBrowser.panelMod.Panel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themesPanelMod {
  
  @JSImport("@wordpress/customize-browser/ThemesPanel", "ThemesPanel")
  @js.native
  open class ThemesPanel protected () extends Panel {
    def this(applicator: js.Object, argsArray: js.Object) = this()
    def this(applicator: js.Object, argsArray: js.Object, options: js.Object) = this()
    
    def canSwitchTheme(): Boolean = js.native
    def canSwitchTheme(slug: String): Boolean = js.native
    
    def deleteTheme(event: Event): Unit = js.native
    
    def installTheme(event: Event): Promise[Any, Any, Any] = js.native
    
    var installingThemes: js.Array[String] = js.native
    
    def loadThemePreview(themeId: String): Promise[Any, Any, Any] = js.native
    
    def updateTheme(event: Event): Unit = js.native
  }
}
