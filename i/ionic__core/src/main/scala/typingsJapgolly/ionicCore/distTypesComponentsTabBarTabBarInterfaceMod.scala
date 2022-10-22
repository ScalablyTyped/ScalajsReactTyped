package typingsJapgolly.ionicCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsTabBarTabBarInterfaceMod {
  
  trait TabBarChangedEventDetail extends StObject {
    
    var tab: js.UndefOr[String] = js.undefined
  }
  object TabBarChangedEventDetail {
    
    inline def apply(): TabBarChangedEventDetail = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabBarChangedEventDetail]
    }
    
    extension [Self <: TabBarChangedEventDetail](x: Self) {
      
      inline def setTab(value: String): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
      
      inline def setTabUndefined: Self = StObject.set(x, "tab", js.undefined)
    }
  }
  
  trait TabButtonClickEventDetail extends StObject {
    
    var href: js.UndefOr[String] = js.undefined
    
    var selected: Boolean
    
    var tab: String
  }
  object TabButtonClickEventDetail {
    
    inline def apply(selected: Boolean, tab: String): TabButtonClickEventDetail = {
      val __obj = js.Dynamic.literal(selected = selected.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabButtonClickEventDetail]
    }
    
    extension [Self <: TabButtonClickEventDetail](x: Self) {
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setTab(value: String): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ionicCore.ionicCoreStrings.`icon-top`
    - typingsJapgolly.ionicCore.ionicCoreStrings.`icon-start`
    - typingsJapgolly.ionicCore.ionicCoreStrings.`icon-end`
    - typingsJapgolly.ionicCore.ionicCoreStrings.`icon-bottom`
    - typingsJapgolly.ionicCore.ionicCoreStrings.`icon-hide`
    - typingsJapgolly.ionicCore.ionicCoreStrings.`label-hide`
  */
  trait TabButtonLayout extends StObject
  object TabButtonLayout {
    
    inline def `icon-bottom`: typingsJapgolly.ionicCore.ionicCoreStrings.`icon-bottom` = "icon-bottom".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.`icon-bottom`]
    
    inline def `icon-end`: typingsJapgolly.ionicCore.ionicCoreStrings.`icon-end` = "icon-end".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.`icon-end`]
    
    inline def `icon-hide`: typingsJapgolly.ionicCore.ionicCoreStrings.`icon-hide` = "icon-hide".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.`icon-hide`]
    
    inline def `icon-start`: typingsJapgolly.ionicCore.ionicCoreStrings.`icon-start` = "icon-start".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.`icon-start`]
    
    inline def `icon-top`: typingsJapgolly.ionicCore.ionicCoreStrings.`icon-top` = "icon-top".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.`icon-top`]
    
    inline def `label-hide`: typingsJapgolly.ionicCore.ionicCoreStrings.`label-hide` = "label-hide".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.`label-hide`]
  }
}
