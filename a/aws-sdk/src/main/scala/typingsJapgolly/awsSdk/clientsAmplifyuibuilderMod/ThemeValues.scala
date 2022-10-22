package typingsJapgolly.awsSdk.clientsAmplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeValues extends StObject {
  
  /**
    * The name of the property.
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * The value of the property.
    */
  var value: js.UndefOr[ThemeValue] = js.undefined
}
object ThemeValues {
  
  inline def apply(): ThemeValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeValues]
  }
  
  extension [Self <: ThemeValues](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setValue(value: ThemeValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
