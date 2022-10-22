package typingsJapgolly.nwJs.mod.global.NWJSHelpers

import typingsJapgolly.nwJs.mod.global.nw.Menu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *  Option for tray that contains initial settings for the Tray.
  */
trait TrayOption extends StObject {
  
  /**
    * {string} alternate
    */
  var alticon: js.UndefOr[String] = js.undefined
  
  /**
    * {string} icon
    */
  var icon: js.UndefOr[String] = js.undefined
  
  /**
    * {boolean} whether icons are templates
    */
  var iconsAreTemplates: js.UndefOr[Boolean] = js.undefined
  
  /**
    * {Menu} popup menu
    */
  var menu: js.UndefOr[Menu] = js.undefined
  
  /**
    * {string} title
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * {string} tooltip
    */
  var tooltip: js.UndefOr[String] = js.undefined
}
object TrayOption {
  
  inline def apply(): TrayOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrayOption]
  }
  
  extension [Self <: TrayOption](x: Self) {
    
    inline def setAlticon(value: String): Self = StObject.set(x, "alticon", value.asInstanceOf[js.Any])
    
    inline def setAlticonUndefined: Self = StObject.set(x, "alticon", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setIconsAreTemplates(value: Boolean): Self = StObject.set(x, "iconsAreTemplates", value.asInstanceOf[js.Any])
    
    inline def setIconsAreTemplatesUndefined: Self = StObject.set(x, "iconsAreTemplates", js.undefined)
    
    inline def setMenu(value: Menu): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    inline def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
  }
}
