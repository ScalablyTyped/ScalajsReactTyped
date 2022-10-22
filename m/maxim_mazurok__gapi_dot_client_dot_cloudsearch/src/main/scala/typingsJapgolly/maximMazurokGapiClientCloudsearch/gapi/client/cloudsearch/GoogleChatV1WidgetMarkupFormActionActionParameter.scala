package typingsJapgolly.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleChatV1WidgetMarkupFormActionActionParameter extends StObject {
  
  /** The name of the parameter for the action script. */
  var key: js.UndefOr[String] = js.undefined
  
  /** The value of the parameter. */
  var value: js.UndefOr[String] = js.undefined
}
object GoogleChatV1WidgetMarkupFormActionActionParameter {
  
  inline def apply(): GoogleChatV1WidgetMarkupFormActionActionParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleChatV1WidgetMarkupFormActionActionParameter]
  }
  
  extension [Self <: GoogleChatV1WidgetMarkupFormActionActionParameter](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
