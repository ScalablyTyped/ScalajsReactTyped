package typingsJapgolly.tengitsui.mod

import typingsJapgolly.tengitsui.tengitsuiStrings.dark
import typingsJapgolly.tengitsui.tengitsuiStrings.light
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartProps extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var id: Double | String
  
  var style: js.UndefOr[String] = js.undefined
  
  var theme: js.UndefOr[light | dark] = js.undefined
}
object ChartProps {
  
  inline def apply(id: Double | String): ChartProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartProps]
  }
  
  extension [Self <: ChartProps](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTheme(value: light | dark): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
