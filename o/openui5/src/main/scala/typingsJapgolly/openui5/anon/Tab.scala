package typingsJapgolly.openui5.anon

import org.scalajs.dom.HTMLElement
import typingsJapgolly.openui5.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tab extends StObject {
  
  /**
    * The selected `tab`.
    */
  var tab: js.UndefOr[HTMLElement] = js.undefined
  
  /**
    * The selected `tab` index.
    */
  var tabIndex: js.UndefOr[int] = js.undefined
}
object Tab {
  
  inline def apply(): Tab = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tab]
  }
  
  extension [Self <: Tab](x: Self) {
    
    inline def setTab(value: HTMLElement): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
    
    inline def setTabIndex(value: int): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    inline def setTabUndefined: Self = StObject.set(x, "tab", js.undefined)
  }
}
