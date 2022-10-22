package typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextDocumentSyncClientCapabilities extends StObject {
  
  /**
    * The client supports did save notifications.
    */
  var didSave: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether text document synchronization supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The client supports sending will save notifications.
    */
  var willSave: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The client supports sending a will save request and
    * waits for a response providing text edits which will
    * be applied to the document before it is saved.
    */
  var willSaveWaitUntil: js.UndefOr[Boolean] = js.undefined
}
object TextDocumentSyncClientCapabilities {
  
  inline def apply(): TextDocumentSyncClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextDocumentSyncClientCapabilities]
  }
  
  extension [Self <: TextDocumentSyncClientCapabilities](x: Self) {
    
    inline def setDidSave(value: Boolean): Self = StObject.set(x, "didSave", value.asInstanceOf[js.Any])
    
    inline def setDidSaveUndefined: Self = StObject.set(x, "didSave", js.undefined)
    
    inline def setDynamicRegistration(value: Boolean): Self = StObject.set(x, "dynamicRegistration", value.asInstanceOf[js.Any])
    
    inline def setDynamicRegistrationUndefined: Self = StObject.set(x, "dynamicRegistration", js.undefined)
    
    inline def setWillSave(value: Boolean): Self = StObject.set(x, "willSave", value.asInstanceOf[js.Any])
    
    inline def setWillSaveUndefined: Self = StObject.set(x, "willSave", js.undefined)
    
    inline def setWillSaveWaitUntil(value: Boolean): Self = StObject.set(x, "willSaveWaitUntil", value.asInstanceOf[js.Any])
    
    inline def setWillSaveWaitUntilUndefined: Self = StObject.set(x, "willSaveWaitUntil", js.undefined)
  }
}
