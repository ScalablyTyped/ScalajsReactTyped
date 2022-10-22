package typingsJapgolly.winrt.global.Windows.Security

import typingsJapgolly.winrt.Windows.Foundation.AsyncStatus
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Foundation.Collections.ValueSet
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Foundation.Uri
import typingsJapgolly.winrt.Windows.Security.Authentication.Web.WebAuthenticationOptions
import typingsJapgolly.winrt.Windows.Security.Authentication.Web.WebAuthenticationStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Authentication {
  
  object OnlineId {
    
    @JSGlobal("Windows.Security.Authentication.OnlineId.CredentialPromptType")
    @js.native
    object CredentialPromptType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsJapgolly.winrt.Windows.Security.Authentication.OnlineId.CredentialPromptType & Double
          ] = js.native
      
      /* 2 */ val doNotPrompt: typingsJapgolly.winrt.Windows.Security.Authentication.OnlineId.CredentialPromptType.doNotPrompt & Double = js.native
      
      /* 0 */ val promptIfNeeded: typingsJapgolly.winrt.Windows.Security.Authentication.OnlineId.CredentialPromptType.promptIfNeeded & Double = js.native
      
      /* 1 */ val retypeCredentials: typingsJapgolly.winrt.Windows.Security.Authentication.OnlineId.CredentialPromptType.retypeCredentials & Double = js.native
    }
    
    @JSGlobal("Windows.Security.Authentication.OnlineId.OnlineIdAuthenticator")
    @js.native
    open class OnlineIdAuthenticator ()
      extends StObject
         with typingsJapgolly.winrt.Windows.Security.Authentication.OnlineId.OnlineIdAuthenticator
    
    @JSGlobal("Windows.Security.Authentication.OnlineId.OnlineIdServiceTicket")
    @js.native
    open class OnlineIdServiceTicket ()
      extends StObject
         with typingsJapgolly.winrt.Windows.Security.Authentication.OnlineId.OnlineIdServiceTicket {
      
      /* CompleteClass */
      var errorCode: Double = js.native
      
      /* CompleteClass */
      var request: typingsJapgolly.winrt.Windows.Security.Authentication.OnlineId.OnlineIdServiceTicketRequest = js.native
      
      /* CompleteClass */
      var value: String = js.native
    }
    
    @JSGlobal("Windows.Security.Authentication.OnlineId.OnlineIdServiceTicketRequest")
    @js.native
    open class OnlineIdServiceTicketRequest protected ()
      extends StObject
         with typingsJapgolly.winrt.Windows.Security.Authentication.OnlineId.OnlineIdServiceTicketRequest {
      def this(service: String) = this()
      def this(service: String, policy: String) = this()
      
      /* CompleteClass */
      var policy: String = js.native
      
      /* CompleteClass */
      var service: String = js.native
    }
    
    @JSGlobal("Windows.Security.Authentication.OnlineId.SignOutUserOperation")
    @js.native
    open class SignOutUserOperation ()
      extends StObject
         with typingsJapgolly.winrt.Windows.Security.Authentication.OnlineId.SignOutUserOperation {
      
      /* CompleteClass */
      override def cancel(): Unit = js.native
      
      /* CompleteClass */
      override def close(): Unit = js.native
      
      /* CompleteClass */
      var errorCode: Double = js.native
      
      /* CompleteClass */
      var id: Double = js.native
      
      /* CompleteClass */
      var status: AsyncStatus = js.native
    }
    
    @JSGlobal("Windows.Security.Authentication.OnlineId.UserAuthenticationOperation")
    @js.native
    open class UserAuthenticationOperation ()
      extends StObject
         with typingsJapgolly.winrt.Windows.Security.Authentication.OnlineId.UserAuthenticationOperation {
      
      /* InferMemberOverrides */
      override def cancel(): Unit = js.native
      
      /* CompleteClass */
      override def close(): Unit = js.native
      
      /* CompleteClass */
      var errorCode: Double = js.native
      
      /* CompleteClass */
      var id: Double = js.native
      
      /* CompleteClass */
      var status: AsyncStatus = js.native
    }
    
    @JSGlobal("Windows.Security.Authentication.OnlineId.UserIdentity")
    @js.native
    open class UserIdentity ()
      extends StObject
         with typingsJapgolly.winrt.Windows.Security.Authentication.OnlineId.UserIdentity {
      
      /* CompleteClass */
      var firstName: String = js.native
      
      /* CompleteClass */
      var id: String = js.native
      
      /* CompleteClass */
      var isBetaAccount: Boolean = js.native
      
      /* CompleteClass */
      var isConfirmedPC: Boolean = js.native
      
      /* CompleteClass */
      var lastName: String = js.native
      
      /* CompleteClass */
      var safeCustomerId: String = js.native
      
      /* CompleteClass */
      var signInName: String = js.native
      
      /* CompleteClass */
      var tickets: IVectorView[
            typingsJapgolly.winrt.Windows.Security.Authentication.OnlineId.OnlineIdServiceTicket
          ] = js.native
    }
  }
  
  object Web {
    
    @JSGlobal("Windows.Security.Authentication.Web.WebAuthenticationBroker")
    @js.native
    open class WebAuthenticationBroker ()
      extends StObject
         with typingsJapgolly.winrt.Windows.Security.Authentication.Web.WebAuthenticationBroker
    /* static members */
    object WebAuthenticationBroker {
      
      @JSGlobal("Windows.Security.Authentication.Web.WebAuthenticationBroker")
      @js.native
      val ^ : js.Any = js.native
      
      inline def authenticateAndContinue(requestUri: Uri): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("authenticateAndContinue")(requestUri.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def authenticateAndContinue(requestUri: Uri, callbackUri: Uri): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticateAndContinue")(requestUri.asInstanceOf[js.Any], callbackUri.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def authenticateAndContinue(requestUri: Uri, callbackUri: Uri, continuationData: ValueSet, options: WebAuthenticationOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticateAndContinue")(requestUri.asInstanceOf[js.Any], callbackUri.asInstanceOf[js.Any], continuationData.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def authenticateAsync(options: WebAuthenticationOptions, requestUri: Uri): IAsyncOperation[
            typingsJapgolly.winrt.Windows.Security.Authentication.Web.WebAuthenticationResult
          ] = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticateAsync")(options.asInstanceOf[js.Any], requestUri.asInstanceOf[js.Any])).asInstanceOf[IAsyncOperation[
            typingsJapgolly.winrt.Windows.Security.Authentication.Web.WebAuthenticationResult
          ]]
      inline def authenticateAsync(options: WebAuthenticationOptions, requestUri: Uri, callbackUri: Uri): IAsyncOperation[
            typingsJapgolly.winrt.Windows.Security.Authentication.Web.WebAuthenticationResult
          ] = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticateAsync")(options.asInstanceOf[js.Any], requestUri.asInstanceOf[js.Any], callbackUri.asInstanceOf[js.Any])).asInstanceOf[IAsyncOperation[
            typingsJapgolly.winrt.Windows.Security.Authentication.Web.WebAuthenticationResult
          ]]
      
      inline def getCurrentApplicationCallbackUri(): Uri = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentApplicationCallbackUri")().asInstanceOf[Uri]
    }
    
    @JSGlobal("Windows.Security.Authentication.Web.WebAuthenticationOptions")
    @js.native
    object WebAuthenticationOptions extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsJapgolly.winrt.Windows.Security.Authentication.Web.WebAuthenticationOptions & Double
          ] = js.native
      
      /* 0 */ val none: typingsJapgolly.winrt.Windows.Security.Authentication.Web.WebAuthenticationOptions.none & Double = js.native
      
      /* 1 */ val silentMode: typingsJapgolly.winrt.Windows.Security.Authentication.Web.WebAuthenticationOptions.silentMode & Double = js.native
      
      /* 4 */ val useCorporateNetwork: typingsJapgolly.winrt.Windows.Security.Authentication.Web.WebAuthenticationOptions.useCorporateNetwork & Double = js.native
      
      /* 3 */ val useHttpPost: typingsJapgolly.winrt.Windows.Security.Authentication.Web.WebAuthenticationOptions.useHttpPost & Double = js.native
      
      /* 2 */ val useTitle: typingsJapgolly.winrt.Windows.Security.Authentication.Web.WebAuthenticationOptions.useTitle & Double = js.native
    }
    
    @JSGlobal("Windows.Security.Authentication.Web.WebAuthenticationResult")
    @js.native
    open class WebAuthenticationResult ()
      extends StObject
         with typingsJapgolly.winrt.Windows.Security.Authentication.Web.WebAuthenticationResult {
      
      /* CompleteClass */
      var responseData: String = js.native
      
      /* CompleteClass */
      var responseErrorDetail: Double = js.native
      
      /* CompleteClass */
      var responseStatus: WebAuthenticationStatus = js.native
    }
    
    @JSGlobal("Windows.Security.Authentication.Web.WebAuthenticationStatus")
    @js.native
    object WebAuthenticationStatus extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsJapgolly.winrt.Windows.Security.Authentication.Web.WebAuthenticationStatus & Double
          ] = js.native
      
      /* 2 */ val errorHttp: typingsJapgolly.winrt.Windows.Security.Authentication.Web.WebAuthenticationStatus.errorHttp & Double = js.native
      
      /* 0 */ val success: typingsJapgolly.winrt.Windows.Security.Authentication.Web.WebAuthenticationStatus.success & Double = js.native
      
      /* 1 */ val userCancel: typingsJapgolly.winrt.Windows.Security.Authentication.Web.WebAuthenticationStatus.userCancel & Double = js.native
    }
  }
}
