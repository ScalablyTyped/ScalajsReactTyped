package typingsJapgolly.openui5.anon

import typingsJapgolly.openui5.sapUiCoreControlMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait From extends StObject {
  
  /**
    * Determines how the navigation was triggered, possible values are "to", "back", "backToPage", and "backToTop".
    */
  var direction: js.UndefOr[String] = js.undefined
  
  /**
    * Determines whether the "to" page (a control with the ID of the page which is currently navigated to)
    * has not been displayed/navigated to before.
    */
  var firstTime: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The page which was displayed before the current navigation.
    */
  var from: js.UndefOr[default] = js.undefined
  
  /**
    * The ID of the page which was displayed before the current navigation.
    */
  var fromId: js.UndefOr[String] = js.undefined
  
  /**
    * Determines whether this is a back navigation.
    */
  var isBack: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Determines whether this was a navigation to a specific page.
    */
  var isBackToPage: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Determines whether this is a navigation to the root page.
    */
  var isBackToTop: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Determines whether this is a forward navigation.
    */
  var isTo: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Determines which link initiated the navigation.
    */
  var navOrigin: js.UndefOr[default] = js.undefined
  
  /**
    * The page which will be displayed after the current navigation.
    */
  var to: js.UndefOr[default] = js.undefined
  
  /**
    * The ID of the page which will be displayed after the current navigation.
    */
  var toId: js.UndefOr[String] = js.undefined
}
object From {
  
  inline def apply(): From = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[From]
  }
  
  extension [Self <: From](x: Self) {
    
    inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setFirstTime(value: Boolean): Self = StObject.set(x, "firstTime", value.asInstanceOf[js.Any])
    
    inline def setFirstTimeUndefined: Self = StObject.set(x, "firstTime", js.undefined)
    
    inline def setFrom(value: default): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromId(value: String): Self = StObject.set(x, "fromId", value.asInstanceOf[js.Any])
    
    inline def setFromIdUndefined: Self = StObject.set(x, "fromId", js.undefined)
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setIsBack(value: Boolean): Self = StObject.set(x, "isBack", value.asInstanceOf[js.Any])
    
    inline def setIsBackToPage(value: Boolean): Self = StObject.set(x, "isBackToPage", value.asInstanceOf[js.Any])
    
    inline def setIsBackToPageUndefined: Self = StObject.set(x, "isBackToPage", js.undefined)
    
    inline def setIsBackToTop(value: Boolean): Self = StObject.set(x, "isBackToTop", value.asInstanceOf[js.Any])
    
    inline def setIsBackToTopUndefined: Self = StObject.set(x, "isBackToTop", js.undefined)
    
    inline def setIsBackUndefined: Self = StObject.set(x, "isBack", js.undefined)
    
    inline def setIsTo(value: Boolean): Self = StObject.set(x, "isTo", value.asInstanceOf[js.Any])
    
    inline def setIsToUndefined: Self = StObject.set(x, "isTo", js.undefined)
    
    inline def setNavOrigin(value: default): Self = StObject.set(x, "navOrigin", value.asInstanceOf[js.Any])
    
    inline def setNavOriginUndefined: Self = StObject.set(x, "navOrigin", js.undefined)
    
    inline def setTo(value: default): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToId(value: String): Self = StObject.set(x, "toId", value.asInstanceOf[js.Any])
    
    inline def setToIdUndefined: Self = StObject.set(x, "toId", js.undefined)
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
