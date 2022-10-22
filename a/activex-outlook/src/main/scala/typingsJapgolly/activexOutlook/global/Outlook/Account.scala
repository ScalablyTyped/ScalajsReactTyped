package typingsJapgolly.activexOutlook.global.Outlook

import typingsJapgolly.activexOutlook.Outlook.OlAccountType
import typingsJapgolly.activexOutlook.Outlook.OlAutoDiscoverConnectionMode
import typingsJapgolly.activexOutlook.Outlook.OlExchangeConnectionMode
import typingsJapgolly.activexOutlook.Outlook.OlObjectClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.Account")
@js.native
/* private */ open class Account ()
  extends StObject
     with typingsJapgolly.activexOutlook.Outlook.Account {
  
  /* CompleteClass */
  override val AccountType: OlAccountType = js.native
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  override val AutoDiscoverConnectionMode: OlAutoDiscoverConnectionMode = js.native
  
  /* CompleteClass */
  override val AutoDiscoverXml: String = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  override val CurrentUser: typingsJapgolly.activexOutlook.Outlook.Recipient = js.native
  
  /* CompleteClass */
  override val DeliveryStore: typingsJapgolly.activexOutlook.Outlook.Store = js.native
  
  /* CompleteClass */
  override val DisplayName: String = js.native
  
  /* CompleteClass */
  override val ExchangeConnectionMode: OlExchangeConnectionMode = js.native
  
  /* CompleteClass */
  override val ExchangeMailboxServerName: String = js.native
  
  /* CompleteClass */
  override val ExchangeMailboxServerVersion: String = js.native
  
  /* CompleteClass */
  override def GetAddressEntryFromID(ID: String): typingsJapgolly.activexOutlook.Outlook.AddressEntry = js.native
  
  /* CompleteClass */
  override def GetRecipientFromID(EntryID: String): typingsJapgolly.activexOutlook.Outlook.Recipient = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Outlook.Account_typekey")
  var OutlookDotAccount_typekey: typingsJapgolly.activexOutlook.Outlook.Account = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override val Session: typingsJapgolly.activexOutlook.Outlook.NameSpace = js.native
  
  /* CompleteClass */
  override val SmtpAddress: String = js.native
  
  /* CompleteClass */
  override val UserName: String = js.native
}
