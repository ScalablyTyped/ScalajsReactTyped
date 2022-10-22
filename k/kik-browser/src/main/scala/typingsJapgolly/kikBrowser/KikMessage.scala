package typingsJapgolly.kikBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KikMessage extends StObject {
  
  var big: js.UndefOr[Boolean] = js.undefined
  
  var data: js.UndefOr[Any] = js.undefined
  
  var noForward: js.UndefOr[Boolean] = js.undefined
  
  var pic: js.UndefOr[String] = js.undefined
  
  var text: String
  
  var title: String
}
object KikMessage {
  
  inline def apply(text: String, title: String): KikMessage = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[KikMessage]
  }
  
  extension [Self <: KikMessage](x: Self) {
    
    inline def setBig(value: Boolean): Self = StObject.set(x, "big", value.asInstanceOf[js.Any])
    
    inline def setBigUndefined: Self = StObject.set(x, "big", js.undefined)
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setNoForward(value: Boolean): Self = StObject.set(x, "noForward", value.asInstanceOf[js.Any])
    
    inline def setNoForwardUndefined: Self = StObject.set(x, "noForward", js.undefined)
    
    inline def setPic(value: String): Self = StObject.set(x, "pic", value.asInstanceOf[js.Any])
    
    inline def setPicUndefined: Self = StObject.set(x, "pic", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
