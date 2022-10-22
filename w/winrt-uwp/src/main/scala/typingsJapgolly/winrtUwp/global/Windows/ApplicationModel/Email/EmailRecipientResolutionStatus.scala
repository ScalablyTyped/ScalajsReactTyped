package typingsJapgolly.winrtUwp.global.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Describes the state of an attempt to resolve an email recipient. */
@JSGlobal("Windows.ApplicationModel.Email.EmailRecipientResolutionStatus")
@js.native
object EmailRecipientResolutionStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typingsJapgolly.winrtUwp.Windows.ApplicationModel.Email.EmailRecipientResolutionStatus & Double
  ] = js.native
  
  /* 2 */ val ambiguousRecipient: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Email.EmailRecipientResolutionStatus.ambiguousRecipient & Double = js.native
  
  /* 5 */ val cannotResolveDistributionList: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Email.EmailRecipientResolutionStatus.cannotResolveDistributionList & Double = js.native
  
  /* 4 */ val certificateRequestLimitReached: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Email.EmailRecipientResolutionStatus.certificateRequestLimitReached & Double = js.native
  
  /* 3 */ val noCertificate: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Email.EmailRecipientResolutionStatus.noCertificate & Double = js.native
  
  /* 1 */ val recipientNotFound: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Email.EmailRecipientResolutionStatus.recipientNotFound & Double = js.native
  
  /* 6 */ val serverError: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Email.EmailRecipientResolutionStatus.serverError & Double = js.native
  
  /* 0 */ val success: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Email.EmailRecipientResolutionStatus.success & Double = js.native
  
  /* 7 */ val unknownFailure: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Email.EmailRecipientResolutionStatus.unknownFailure & Double = js.native
}
