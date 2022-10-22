package typingsJapgolly.winrtUwp.global.Windows.ApplicationModel.Email

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a group of EmailConversation objects for batch processing. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Email.EmailConversationBatch")
@js.native
open class EmailConversationBatch ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.ApplicationModel.Email.EmailConversationBatch {
  
  /** Gets a list of EmailConversation objects to use for batch processing. */
  /* CompleteClass */
  var conversations: IVectorView[typingsJapgolly.winrtUwp.Windows.ApplicationModel.Email.EmailConversation] = js.native
  
  /** Gets the status of the last batch processing operation. */
  /* CompleteClass */
  var status: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Email.EmailBatchStatus = js.native
}
