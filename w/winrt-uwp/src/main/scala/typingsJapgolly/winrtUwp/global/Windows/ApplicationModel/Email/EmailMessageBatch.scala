package typingsJapgolly.winrtUwp.global.Windows.ApplicationModel.Email

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a collection of email messages. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Email.EmailMessageBatch")
@js.native
open class EmailMessageBatch ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.ApplicationModel.Email.EmailMessageBatch {
  
  /** Gets a batch of email messages. */
  /* CompleteClass */
  var messages: IVectorView[typingsJapgolly.winrtUwp.Windows.ApplicationModel.Email.EmailMessage] = js.native
  
  /** Gets the status of the email batch read. */
  /* CompleteClass */
  var status: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Email.EmailBatchStatus = js.native
}
