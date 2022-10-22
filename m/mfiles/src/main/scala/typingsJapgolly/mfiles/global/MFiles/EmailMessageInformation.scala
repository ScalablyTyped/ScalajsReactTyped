package typingsJapgolly.mfiles.global.MFiles

import typingsJapgolly.mfiles.IEmailMessageInformation
import typingsJapgolly.mfiles.IStrings
import typingsJapgolly.mfiles.ITimestamp
import typingsJapgolly.mfiles.MFiles.MFEmailImportance
import typingsJapgolly.mfiles.MFiles.MFEmailSensitivity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.EmailMessageInformation")
@js.native
open class EmailMessageInformation ()
  extends StObject
     with IEmailMessageInformation {
  
  /* CompleteClass */
  var Cc: IStrings = js.native
  
  /* CompleteClass */
  override def Clone(): IEmailMessageInformation = js.native
  
  /* CompleteClass */
  override def CloneFrom(EmailMessageInformation: IEmailMessageInformation): Unit = js.native
  
  /* CompleteClass */
  var From: String = js.native
  
  /* CompleteClass */
  var Importance: MFEmailImportance = js.native
  
  /* CompleteClass */
  var InReplyTo: String = js.native
  
  /* CompleteClass */
  var MessageID: String = js.native
  
  /* CompleteClass */
  var Received: ITimestamp = js.native
  
  /* CompleteClass */
  var Sensitivity: MFEmailSensitivity = js.native
  
  /* CompleteClass */
  var Sent: ITimestamp = js.native
  
  /* CompleteClass */
  var Subject: String = js.native
  
  /* CompleteClass */
  var To: IStrings = js.native
}
