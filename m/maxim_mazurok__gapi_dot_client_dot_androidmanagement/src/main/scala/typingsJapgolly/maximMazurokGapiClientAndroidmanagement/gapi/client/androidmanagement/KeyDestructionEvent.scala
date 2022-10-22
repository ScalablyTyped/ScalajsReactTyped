package typingsJapgolly.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyDestructionEvent extends StObject {
  
  /** UID of the application which owns the key. */
  var applicationUid: js.UndefOr[Double] = js.undefined
  
  /** Alias of the key. */
  var keyAlias: js.UndefOr[String] = js.undefined
  
  /** Whether the operation was successful. */
  var success: js.UndefOr[Boolean] = js.undefined
}
object KeyDestructionEvent {
  
  inline def apply(): KeyDestructionEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyDestructionEvent]
  }
  
  extension [Self <: KeyDestructionEvent](x: Self) {
    
    inline def setApplicationUid(value: Double): Self = StObject.set(x, "applicationUid", value.asInstanceOf[js.Any])
    
    inline def setApplicationUidUndefined: Self = StObject.set(x, "applicationUid", js.undefined)
    
    inline def setKeyAlias(value: String): Self = StObject.set(x, "keyAlias", value.asInstanceOf[js.Any])
    
    inline def setKeyAliasUndefined: Self = StObject.set(x, "keyAlias", js.undefined)
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
