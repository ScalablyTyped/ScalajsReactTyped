package typingsJapgolly.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDecorationOptions extends StObject {
  
  /**
    * CSS color to render.
    * e.g.: rgba(100, 100, 100, 0.5) or a color from the color registry
    */
  var color: js.UndefOr[String | ThemeColor] = js.undefined
  
  /**
    * CSS color to render.
    * e.g.: rgba(100, 100, 100, 0.5) or a color from the color registry
    */
  var darkColor: js.UndefOr[String | ThemeColor] = js.undefined
}
object IDecorationOptions {
  
  inline def apply(): IDecorationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDecorationOptions]
  }
  
  extension [Self <: IDecorationOptions](x: Self) {
    
    inline def setColor(value: String | ThemeColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDarkColor(value: String | ThemeColor): Self = StObject.set(x, "darkColor", value.asInstanceOf[js.Any])
    
    inline def setDarkColorUndefined: Self = StObject.set(x, "darkColor", js.undefined)
  }
}
