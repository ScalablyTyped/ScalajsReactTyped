package typingsJapgolly.winrtUwp.global.Windows.ApplicationModel.Email

import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Allows an application to launch the email application with a new message displayed. Use this to allow users to send email from your application. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Email.EmailManager")
@js.native
open class EmailManager ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.ApplicationModel.Email.EmailManager
object EmailManager {
  
  @JSGlobal("Windows.ApplicationModel.Email.EmailManager")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets an email store that is within the specified scope.
    * @param accessType The enumerator of scope.
    * @return The requested email store.
    */
  /* static member */
  inline def requestStoreAsync(accessType: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Email.EmailStoreAccessType): IPromiseWithIAsyncOperation[typingsJapgolly.winrtUwp.Windows.ApplicationModel.Email.EmailStore] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestStoreAsync")(accessType.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typingsJapgolly.winrtUwp.Windows.ApplicationModel.Email.EmailStore]]
  
  /**
    * Launches the email application with a new message displayed.
    * @param message The email message that is displayed when the email application is launched.
    * @return An asynchronous action.
    */
  /* static member */
  inline def showComposeNewEmailAsync(message: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Email.EmailMessage): IPromiseWithIAsyncAction = ^.asInstanceOf[js.Dynamic].applyDynamic("showComposeNewEmailAsync")(message.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncAction]
}
