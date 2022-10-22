package typingsJapgolly.tailwindcss.anon

import typingsJapgolly.std.Record
import typingsJapgolly.tailwindcss.typesConfigMod.ScreensConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  screens :tailwindcss.tailwindcss/types/config.ScreensConfig,   center :boolean,   padding :string | std.Record<string, string>}> */
trait PartialscreensScreensConf extends StObject {
  
  var center: js.UndefOr[Boolean] = js.undefined
  
  var padding: js.UndefOr[String | (Record[String, String])] = js.undefined
  
  var screens: js.UndefOr[ScreensConfig] = js.undefined
}
object PartialscreensScreensConf {
  
  inline def apply(): PartialscreensScreensConf = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialscreensScreensConf]
  }
  
  extension [Self <: PartialscreensScreensConf](x: Self) {
    
    inline def setCenter(value: Boolean): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setPadding(value: String | (Record[String, String])): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setScreens(value: ScreensConfig): Self = StObject.set(x, "screens", value.asInstanceOf[js.Any])
    
    inline def setScreensUndefined: Self = StObject.set(x, "screens", js.undefined)
    
    inline def setScreensVarargs(value: String*): Self = StObject.set(x, "screens", js.Array(value*))
  }
}
