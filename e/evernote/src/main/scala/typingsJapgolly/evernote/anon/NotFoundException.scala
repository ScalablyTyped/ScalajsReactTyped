package typingsJapgolly.evernote.anon

import typingsJapgolly.evernote.mod.Errors.EDAMNotFoundException
import typingsJapgolly.evernote.mod.Errors.EDAMUserException
import typingsJapgolly.evernote.mod.Types.UserIdentity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotFoundException extends StObject {
  
  var notFoundException: js.UndefOr[EDAMNotFoundException] = js.undefined
  
  var userException: js.UndefOr[EDAMUserException] = js.undefined
  
  var userIdentity: js.UndefOr[UserIdentity] = js.undefined
}
object NotFoundException {
  
  inline def apply(): NotFoundException = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotFoundException]
  }
  
  extension [Self <: NotFoundException](x: Self) {
    
    inline def setNotFoundException(value: EDAMNotFoundException): Self = StObject.set(x, "notFoundException", value.asInstanceOf[js.Any])
    
    inline def setNotFoundExceptionUndefined: Self = StObject.set(x, "notFoundException", js.undefined)
    
    inline def setUserException(value: EDAMUserException): Self = StObject.set(x, "userException", value.asInstanceOf[js.Any])
    
    inline def setUserExceptionUndefined: Self = StObject.set(x, "userException", js.undefined)
    
    inline def setUserIdentity(value: UserIdentity): Self = StObject.set(x, "userIdentity", value.asInstanceOf[js.Any])
    
    inline def setUserIdentityUndefined: Self = StObject.set(x, "userIdentity", js.undefined)
  }
}
