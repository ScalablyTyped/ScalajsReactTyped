package typingsJapgolly.chrome.chrome

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Search
////////////////////
/**
  * Use the chrome.search API to search via the default provider.
  * Permissions:  "search"
  */
object search {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.chrome.chromeStrings.CURRENT_TAB
    - typingsJapgolly.chrome.chromeStrings.NEW_TAB
    - typingsJapgolly.chrome.chromeStrings.NEW_WINDOW
  */
  trait Disposition extends StObject
  object Disposition {
    
    inline def CURRENT_TAB: typingsJapgolly.chrome.chromeStrings.CURRENT_TAB = "CURRENT_TAB".asInstanceOf[typingsJapgolly.chrome.chromeStrings.CURRENT_TAB]
    
    inline def NEW_TAB: typingsJapgolly.chrome.chromeStrings.NEW_TAB = "NEW_TAB".asInstanceOf[typingsJapgolly.chrome.chromeStrings.NEW_TAB]
    
    inline def NEW_WINDOW: typingsJapgolly.chrome.chromeStrings.NEW_WINDOW = "NEW_WINDOW".asInstanceOf[typingsJapgolly.chrome.chromeStrings.NEW_WINDOW]
  }
  
  trait QueryInfo extends StObject {
    
    /** Location where search results should be displayed. CURRENT_TAB is the default.  */
    var disposition: js.UndefOr[Disposition] = js.undefined
    
    /** Location where search results should be displayed. tabIdcannot be used with disposition. */
    var tabId: js.UndefOr[Double] = js.undefined
    
    /** String to query with the default search provider. */
    var text: js.UndefOr[String] = js.undefined
  }
  object QueryInfo {
    
    inline def apply(): QueryInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueryInfo]
    }
    
    extension [Self <: QueryInfo](x: Self) {
      
      inline def setDisposition(value: Disposition): Self = StObject.set(x, "disposition", value.asInstanceOf[js.Any])
      
      inline def setDispositionUndefined: Self = StObject.set(x, "disposition", js.undefined)
      
      inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
      
      inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
