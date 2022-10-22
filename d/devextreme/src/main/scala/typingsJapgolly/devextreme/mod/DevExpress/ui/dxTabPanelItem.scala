package typingsJapgolly.devextreme.mod.DevExpress.ui

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Element
import typingsJapgolly.devextreme.mod.DevExpress.core.UserDefinedElement
import typingsJapgolly.devextreme.mod.DevExpress.core.template
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxTabPanelItem
  extends StObject
     with CollectionWidgetItem {
  
  /**
    * Specifies a badge text for the tab.
    */
  var badge: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the icon to be displayed in the tab&apos;s title.
    */
  var icon: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a template that should be used to render the tab for this item only.
    */
  var tabTemplate: js.UndefOr[template | (js.Function0[String | UserDefinedElement[Element]])] = js.undefined
  
  /**
    * Specifies the item title text displayed on a corresponding tab.
    */
  var title: js.UndefOr[String] = js.undefined
}
object dxTabPanelItem {
  
  inline def apply(): dxTabPanelItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxTabPanelItem]
  }
  
  extension [Self <: dxTabPanelItem](x: Self) {
    
    inline def setBadge(value: String): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
    
    inline def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setTabTemplate(value: template | (js.Function0[String | UserDefinedElement[Element]])): Self = StObject.set(x, "tabTemplate", value.asInstanceOf[js.Any])
    
    inline def setTabTemplateCallbackTo(value: CallbackTo[String | UserDefinedElement[Element]]): Self = StObject.set(x, "tabTemplate", value.toJsFn)
    
    inline def setTabTemplateUndefined: Self = StObject.set(x, "tabTemplate", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
