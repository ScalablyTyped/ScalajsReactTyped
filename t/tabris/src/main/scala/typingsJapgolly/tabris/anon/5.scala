package typingsJapgolly.tabris.anon

import typingsJapgolly.tabris.mod.JSXChildren
import typingsJapgolly.tabris.mod.Widget
import typingsJapgolly.tabris.mod.WidgetCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `5`[WidgetType /* <: Widget[Any] */] extends StObject {
  
  var children: js.UndefOr[JSXChildren[WidgetType]] = js.undefined
}
object `5` {
  
  inline def apply[WidgetType /* <: Widget[Any] */](): `5`[WidgetType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`5`[WidgetType]]
  }
  
  extension [Self <: `5`[?], WidgetType /* <: Widget[Any] */](x: Self & `5`[WidgetType]) {
    
    inline def setChildren(value: JSXChildren[WidgetType]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (WidgetType | WidgetCollection[WidgetType])*): Self = StObject.set(x, "children", js.Array(value*))
  }
}
