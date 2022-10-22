package typingsJapgolly.reactNativeWindows.anon

import typingsJapgolly.reactNativeWindows.rntypesMod.LayoutRectangle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Layout extends StObject {
  
  var layout: LayoutRectangle
}
object Layout {
  
  inline def apply(layout: LayoutRectangle): Layout = {
    val __obj = js.Dynamic.literal(layout = layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layout]
  }
  
  extension [Self <: Layout](x: Self) {
    
    inline def setLayout(value: LayoutRectangle): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
  }
}
