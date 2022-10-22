package typingsJapgolly.activexOutlook.global.Outlook

import typingsJapgolly.activexOutlook.Outlook.OlObjectClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.Recipients")
@js.native
/* private */ open class Recipients ()
  extends StObject
     with typingsJapgolly.activexOutlook.Outlook.Recipients {
  
  /* CompleteClass */
  override def Add(Name: String): typingsJapgolly.activexOutlook.Outlook.Recipient = js.native
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override def Item(Index: Any): typingsJapgolly.activexOutlook.Outlook.Recipient = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Outlook.Recipients_typekey")
  var OutlookDotRecipients_typekey: typingsJapgolly.activexOutlook.Outlook.Recipients = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override def Remove(Index: Double): Unit = js.native
  
  /* CompleteClass */
  override def ResolveAll(): Boolean = js.native
  
  /* CompleteClass */
  override val Session: typingsJapgolly.activexOutlook.Outlook.NameSpace = js.native
}
