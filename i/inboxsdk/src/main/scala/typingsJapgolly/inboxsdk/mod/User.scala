package typingsJapgolly.inboxsdk.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.inboxsdk.mod.Common.Contact
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object User {
  
  trait UserInstance extends StObject {
    
    def getAccountSwitcherContactList(): js.Array[Contact]
    
    def getEmailAddress(): String
    
    def getLanguage(): String
    
    def isConversationViewDisabled(): Boolean
    
    def isUsingGmailMaterialUI(): Boolean
  }
  object UserInstance {
    
    inline def apply(
      getAccountSwitcherContactList: CallbackTo[js.Array[Contact]],
      getEmailAddress: CallbackTo[String],
      getLanguage: CallbackTo[String],
      isConversationViewDisabled: CallbackTo[Boolean],
      isUsingGmailMaterialUI: CallbackTo[Boolean]
    ): UserInstance = {
      val __obj = js.Dynamic.literal(getAccountSwitcherContactList = getAccountSwitcherContactList.toJsFn, getEmailAddress = getEmailAddress.toJsFn, getLanguage = getLanguage.toJsFn, isConversationViewDisabled = isConversationViewDisabled.toJsFn, isUsingGmailMaterialUI = isUsingGmailMaterialUI.toJsFn)
      __obj.asInstanceOf[UserInstance]
    }
    
    extension [Self <: UserInstance](x: Self) {
      
      inline def setGetAccountSwitcherContactList(value: CallbackTo[js.Array[Contact]]): Self = StObject.set(x, "getAccountSwitcherContactList", value.toJsFn)
      
      inline def setGetEmailAddress(value: CallbackTo[String]): Self = StObject.set(x, "getEmailAddress", value.toJsFn)
      
      inline def setGetLanguage(value: CallbackTo[String]): Self = StObject.set(x, "getLanguage", value.toJsFn)
      
      inline def setIsConversationViewDisabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "isConversationViewDisabled", value.toJsFn)
      
      inline def setIsUsingGmailMaterialUI(value: CallbackTo[Boolean]): Self = StObject.set(x, "isUsingGmailMaterialUI", value.toJsFn)
    }
  }
}
