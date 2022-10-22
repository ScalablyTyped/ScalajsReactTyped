package typingsJapgolly.ssUtils.ssutils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEventSourceInit extends StObject {
  
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}
object IEventSourceInit {
  
  inline def apply(): IEventSourceInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEventSourceInit]
  }
  
  extension [Self <: IEventSourceInit](x: Self) {
    
    inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    
    inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
  }
}
