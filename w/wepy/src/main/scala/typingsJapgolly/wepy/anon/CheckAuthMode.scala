package typingsJapgolly.wepy.anon

import typingsJapgolly.wepy.wepyStrings.facial
import typingsJapgolly.wepy.wepyStrings.fingerPrint
import typingsJapgolly.wepy.wepyStrings.speech
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckAuthMode extends StObject {
  
  var checkAuthMode: fingerPrint | facial | speech
}
object CheckAuthMode {
  
  inline def apply(checkAuthMode: fingerPrint | facial | speech): CheckAuthMode = {
    val __obj = js.Dynamic.literal(checkAuthMode = checkAuthMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckAuthMode]
  }
  
  extension [Self <: CheckAuthMode](x: Self) {
    
    inline def setCheckAuthMode(value: fingerPrint | facial | speech): Self = StObject.set(x, "checkAuthMode", value.asInstanceOf[js.Any])
  }
}
