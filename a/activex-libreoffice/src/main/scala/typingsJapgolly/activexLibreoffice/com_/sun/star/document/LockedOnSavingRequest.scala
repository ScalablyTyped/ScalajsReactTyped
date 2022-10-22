package typingsJapgolly.activexLibreoffice.com_.sun.star.document

import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.Exception
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Is used for interaction handle to query user decision regarding locked document on saving.
  * @since OOo 3.1
  */
trait LockedOnSavingRequest
  extends StObject
     with Exception {
  
  /** The URL of the locked document. */
  var DocumentURL: String
  
  /** The user information of the locked document. */
  var UserInfo: String
}
object LockedOnSavingRequest {
  
  inline def apply(Context: XInterface, DocumentURL: String, Message: String, UserInfo: String): LockedOnSavingRequest = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], DocumentURL = DocumentURL.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], UserInfo = UserInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[LockedOnSavingRequest]
  }
  
  extension [Self <: LockedOnSavingRequest](x: Self) {
    
    inline def setDocumentURL(value: String): Self = StObject.set(x, "DocumentURL", value.asInstanceOf[js.Any])
    
    inline def setUserInfo(value: String): Self = StObject.set(x, "UserInfo", value.asInstanceOf[js.Any])
  }
}
