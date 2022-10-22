package typingsJapgolly.devextreme.mod.DevExpress.ui

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Element
import typingsJapgolly.devextreme.mod.DevExpress.core.UserDefinedElement
import typingsJapgolly.devextreme.mod.DevExpress.core.template
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxSlideOutItem
  extends StObject
     with CollectionWidgetItem {
  
  /**
    * Specifies a template that should be used to render a menu item.
    */
  var menuTemplate: js.UndefOr[template | (js.Function0[String | UserDefinedElement[Element]])] = js.undefined
}
object dxSlideOutItem {
  
  inline def apply(): dxSlideOutItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxSlideOutItem]
  }
  
  extension [Self <: dxSlideOutItem](x: Self) {
    
    inline def setMenuTemplate(value: template | (js.Function0[String | UserDefinedElement[Element]])): Self = StObject.set(x, "menuTemplate", value.asInstanceOf[js.Any])
    
    inline def setMenuTemplateCallbackTo(value: CallbackTo[String | UserDefinedElement[Element]]): Self = StObject.set(x, "menuTemplate", value.toJsFn)
    
    inline def setMenuTemplateUndefined: Self = StObject.set(x, "menuTemplate", js.undefined)
  }
}
