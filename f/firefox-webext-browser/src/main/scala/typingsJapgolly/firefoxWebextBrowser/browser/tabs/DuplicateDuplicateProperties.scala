package typingsJapgolly.firefoxWebextBrowser.browser.tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DuplicateDuplicateProperties extends StObject {
  
  /**
    * Whether the tab should become the active tab in the window. Does not affect whether the window is focused (see `windows.update`). Defaults to `true`.
    */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The position the new tab should take in the window. The provided value will be clamped to between zero and the number of tabs in the window.
    */
  var index: js.UndefOr[Double] = js.undefined
}
object DuplicateDuplicateProperties {
  
  inline def apply(): DuplicateDuplicateProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DuplicateDuplicateProperties]
  }
  
  extension [Self <: DuplicateDuplicateProperties](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
  }
}
