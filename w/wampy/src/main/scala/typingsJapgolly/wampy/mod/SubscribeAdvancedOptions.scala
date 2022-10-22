package typingsJapgolly.wampy.mod

import typingsJapgolly.wampy.wampyStrings.prefix
import typingsJapgolly.wampy.wampyStrings.wildcard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscribeAdvancedOptions extends StObject {
  
  var `match`: js.UndefOr[prefix | wildcard] = js.undefined
}
object SubscribeAdvancedOptions {
  
  inline def apply(): SubscribeAdvancedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscribeAdvancedOptions]
  }
  
  extension [Self <: SubscribeAdvancedOptions](x: Self) {
    
    inline def setMatch(value: prefix | wildcard): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
  }
}
