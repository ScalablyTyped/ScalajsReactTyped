package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.horizontal
import typingsJapgolly.baseui.baseuiStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Desktop extends StObject {
  
  var desktop: js.UndefOr[horizontal | vertical] = js.undefined
  
  var mobile: js.UndefOr[horizontal | vertical] = js.undefined
}
object Desktop {
  
  inline def apply(): Desktop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Desktop]
  }
  
  extension [Self <: Desktop](x: Self) {
    
    inline def setDesktop(value: horizontal | vertical): Self = StObject.set(x, "desktop", value.asInstanceOf[js.Any])
    
    inline def setDesktopUndefined: Self = StObject.set(x, "desktop", js.undefined)
    
    inline def setMobile(value: horizontal | vertical): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
    
    inline def setMobileUndefined: Self = StObject.set(x, "mobile", js.undefined)
  }
}
