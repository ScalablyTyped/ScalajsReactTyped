package typingsJapgolly.activexFaxcomexlib.global.FAXCOMEXLib

import typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.FAX_ACCOUNT_EVENTS_TYPE_ENUM
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxAccount Class */
@JSGlobal("FAXCOMEXLib.FaxAccount")
@js.native
/* private */ open class FaxAccount ()
  extends StObject
     with typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.FaxAccount {
  
  /** Name of the fax account */
  /* CompleteClass */
  override val AccountName: String = js.native
  
  /* private */ /* CompleteClass */
  @JSName("FAXCOMEXLib.FaxAccount_typekey")
  var FAXCOMEXLibDotFaxAccount_typekey: typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.FaxAccount = js.native
  
  /** Folders belonging to the account */
  /* CompleteClass */
  override val Folders: typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.FaxAccountFolders = js.native
  
  /** Set bit-wise combination of events the fax account listens to */
  /* CompleteClass */
  override def ListenToAccountEvents(EventTypes: FAX_ACCOUNT_EVENTS_TYPE_ENUM): Unit = js.native
  
  /** Events the fax account is listening to */
  /* CompleteClass */
  override val RegisteredEvents: FAX_ACCOUNT_EVENTS_TYPE_ENUM = js.native
}
