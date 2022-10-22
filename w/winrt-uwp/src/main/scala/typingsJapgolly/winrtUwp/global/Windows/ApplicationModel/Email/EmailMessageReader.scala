package typingsJapgolly.winrtUwp.global.Windows.ApplicationModel.Email

import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Gets a batch of email messages. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Email.EmailMessageReader")
@js.native
open class EmailMessageReader ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.ApplicationModel.Email.EmailMessageReader {
  
  /**
    * Reads a collection of email messages.
    * @return A batch of email messages.
    */
  /* CompleteClass */
  override def readBatchAsync(): IPromiseWithIAsyncOperation[typingsJapgolly.winrtUwp.Windows.ApplicationModel.Email.EmailMessageBatch] = js.native
}
