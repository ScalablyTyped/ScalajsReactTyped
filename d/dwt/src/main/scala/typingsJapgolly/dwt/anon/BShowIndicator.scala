package typingsJapgolly.dwt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BShowIndicator extends StObject {
  
  /**
    * Whether to show the indicator of the device.
    */
  var bShowIndicator: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to show the UI of the device.
    */
  var bShowUI: js.UndefOr[Boolean] = js.undefined
}
object BShowIndicator {
  
  inline def apply(): BShowIndicator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BShowIndicator]
  }
  
  extension [Self <: BShowIndicator](x: Self) {
    
    inline def setBShowIndicator(value: Boolean): Self = StObject.set(x, "bShowIndicator", value.asInstanceOf[js.Any])
    
    inline def setBShowIndicatorUndefined: Self = StObject.set(x, "bShowIndicator", js.undefined)
    
    inline def setBShowUI(value: Boolean): Self = StObject.set(x, "bShowUI", value.asInstanceOf[js.Any])
    
    inline def setBShowUIUndefined: Self = StObject.set(x, "bShowUI", js.undefined)
  }
}
