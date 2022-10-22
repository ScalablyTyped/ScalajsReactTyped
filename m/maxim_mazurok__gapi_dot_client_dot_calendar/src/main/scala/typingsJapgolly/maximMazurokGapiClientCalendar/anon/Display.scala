package typingsJapgolly.maximMazurokGapiClientCalendar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Display extends StObject {
  
  /**
    * The gadget's display mode. Deprecated. Possible values are:
    * - "icon" - The gadget displays next to the event's title in the calendar view.
    * - "chip" - The gadget displays when the event is clicked.
    */
  var display: js.UndefOr[String] = js.undefined
  
  /** The gadget's height in pixels. The height must be an integer greater than 0. Optional. Deprecated. */
  var height: js.UndefOr[Double] = js.undefined
  
  /** The gadget's icon URL. The URL scheme must be HTTPS. Deprecated. */
  var iconLink: js.UndefOr[String] = js.undefined
  
  /** The gadget's URL. The URL scheme must be HTTPS. Deprecated. */
  var link: js.UndefOr[String] = js.undefined
  
  /** Preferences. */
  var preferences: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** The gadget's title. Deprecated. */
  var title: js.UndefOr[String] = js.undefined
  
  /** The gadget's type. Deprecated. */
  var `type`: js.UndefOr[String] = js.undefined
  
  /** The gadget's width in pixels. The width must be an integer greater than 0. Optional. Deprecated. */
  var width: js.UndefOr[Double] = js.undefined
}
object Display {
  
  inline def apply(): Display = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Display]
  }
  
  extension [Self <: Display](x: Self) {
    
    inline def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setIconLink(value: String): Self = StObject.set(x, "iconLink", value.asInstanceOf[js.Any])
    
    inline def setIconLinkUndefined: Self = StObject.set(x, "iconLink", js.undefined)
    
    inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setPreferences(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "preferences", value.asInstanceOf[js.Any])
    
    inline def setPreferencesUndefined: Self = StObject.set(x, "preferences", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
