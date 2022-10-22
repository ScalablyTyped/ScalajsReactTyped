package typingsJapgolly.firebaseAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OriginalMessage extends StObject {
  
  var appName: js.UndefOr[typingsJapgolly.firebaseAuth.distAuthMod.AppName] = js.undefined
  
  var originalMessage: js.UndefOr[String] = js.undefined
}
object OriginalMessage {
  
  inline def apply(): OriginalMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OriginalMessage]
  }
  
  extension [Self <: OriginalMessage](x: Self) {
    
    inline def setAppName(value: typingsJapgolly.firebaseAuth.distAuthMod.AppName): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
    
    inline def setAppNameUndefined: Self = StObject.set(x, "appName", js.undefined)
    
    inline def setOriginalMessage(value: String): Self = StObject.set(x, "originalMessage", value.asInstanceOf[js.Any])
    
    inline def setOriginalMessageUndefined: Self = StObject.set(x, "originalMessage", js.undefined)
  }
}
