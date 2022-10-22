package typingsJapgolly.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListManagementOptions extends StObject {
  
  /**
    * The name of the contact list.
    */
  var ContactListName: typingsJapgolly.awsSdk.clientsSesv2Mod.ContactListName
  
  /**
    * The name of the topic.
    */
  var TopicName: js.UndefOr[typingsJapgolly.awsSdk.clientsSesv2Mod.TopicName] = js.undefined
}
object ListManagementOptions {
  
  inline def apply(ContactListName: ContactListName): ListManagementOptions = {
    val __obj = js.Dynamic.literal(ContactListName = ContactListName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListManagementOptions]
  }
  
  extension [Self <: ListManagementOptions](x: Self) {
    
    inline def setContactListName(value: ContactListName): Self = StObject.set(x, "ContactListName", value.asInstanceOf[js.Any])
    
    inline def setTopicName(value: TopicName): Self = StObject.set(x, "TopicName", value.asInstanceOf[js.Any])
    
    inline def setTopicNameUndefined: Self = StObject.set(x, "TopicName", js.undefined)
  }
}
