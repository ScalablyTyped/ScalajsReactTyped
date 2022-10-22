package typingsJapgolly.jsrsasign.jsrsasign

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserNotice extends StObject {
  
  var exptext: js.UndefOr[DisplayText] = js.undefined
}
object UserNotice {
  
  inline def apply(): UserNotice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserNotice]
  }
  
  extension [Self <: UserNotice](x: Self) {
    
    inline def setExptext(value: DisplayText): Self = StObject.set(x, "exptext", value.asInstanceOf[js.Any])
    
    inline def setExptextUndefined: Self = StObject.set(x, "exptext", js.undefined)
  }
}
