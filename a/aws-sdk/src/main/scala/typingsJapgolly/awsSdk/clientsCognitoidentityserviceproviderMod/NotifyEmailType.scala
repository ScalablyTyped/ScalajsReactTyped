package typingsJapgolly.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotifyEmailType extends StObject {
  
  /**
    * The email HTML body.
    */
  var HtmlBody: js.UndefOr[EmailNotificationBodyType] = js.undefined
  
  /**
    * The email subject.
    */
  var Subject: EmailNotificationSubjectType
  
  /**
    * The email text body.
    */
  var TextBody: js.UndefOr[EmailNotificationBodyType] = js.undefined
}
object NotifyEmailType {
  
  inline def apply(Subject: EmailNotificationSubjectType): NotifyEmailType = {
    val __obj = js.Dynamic.literal(Subject = Subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyEmailType]
  }
  
  extension [Self <: NotifyEmailType](x: Self) {
    
    inline def setHtmlBody(value: EmailNotificationBodyType): Self = StObject.set(x, "HtmlBody", value.asInstanceOf[js.Any])
    
    inline def setHtmlBodyUndefined: Self = StObject.set(x, "HtmlBody", js.undefined)
    
    inline def setSubject(value: EmailNotificationSubjectType): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
    
    inline def setTextBody(value: EmailNotificationBodyType): Self = StObject.set(x, "TextBody", value.asInstanceOf[js.Any])
    
    inline def setTextBodyUndefined: Self = StObject.set(x, "TextBody", js.undefined)
  }
}
