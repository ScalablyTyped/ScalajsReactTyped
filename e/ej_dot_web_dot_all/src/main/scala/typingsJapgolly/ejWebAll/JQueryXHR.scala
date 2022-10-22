package typingsJapgolly.ejWebAll

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryXHR extends StObject {
  
  /**
    * Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
}
object JQueryXHR {
  
  inline def apply(): JQueryXHR = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryXHR]
  }
  
  extension [Self <: JQueryXHR](x: Self) {
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
  }
}
