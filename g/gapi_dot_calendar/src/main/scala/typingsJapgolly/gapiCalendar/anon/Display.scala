package typingsJapgolly.gapiCalendar.anon

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.gapiCalendar.gapi.client.calendar.GadgetDisplayMode
import typingsJapgolly.gapiCalendar.gapi.client.calendar.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Display extends StObject {
  
  var display: js.UndefOr[GadgetDisplayMode] = js.undefined
  
  var height: integer
  
  var iconLink: String
  
  var link: String
  
  var preferences: StringDictionary[String]
  
  var title: String
  
  var `type`: String
  
  var width: integer
}
object Display {
  
  inline def apply(
    height: integer,
    iconLink: String,
    link: String,
    preferences: StringDictionary[String],
    title: String,
    `type`: String,
    width: integer
  ): Display = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], iconLink = iconLink.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], preferences = preferences.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Display]
  }
  
  extension [Self <: Display](x: Self) {
    
    inline def setDisplay(value: GadgetDisplayMode): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setHeight(value: integer): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setIconLink(value: String): Self = StObject.set(x, "iconLink", value.asInstanceOf[js.Any])
    
    inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setPreferences(value: StringDictionary[String]): Self = StObject.set(x, "preferences", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: integer): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
