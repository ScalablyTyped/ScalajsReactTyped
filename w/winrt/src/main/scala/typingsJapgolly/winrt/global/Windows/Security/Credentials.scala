package typingsJapgolly.winrt.global.Windows.Security

import typingsJapgolly.winrt.Windows.Foundation.Collections.IIterator
import typingsJapgolly.winrt.Windows.Foundation.Collections.IKeyValuePair
import typingsJapgolly.winrt.Windows.Foundation.Collections.IMapView
import typingsJapgolly.winrt.Windows.Foundation.Collections.IPropertySet
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Security.Credentials.UI.AuthenticationProtocol
import typingsJapgolly.winrt.Windows.Security.Credentials.UI.CredentialSaveOption
import typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Credentials {
  
  @JSGlobal("Windows.Security.Credentials.PasswordCredential")
  @js.native
  open class PasswordCredential ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Security.Credentials.PasswordCredential {
    def this(resource: String, userName: String, password: String) = this()
    
    /* CompleteClass */
    var password: String = js.native
    
    /* CompleteClass */
    var properties: IPropertySet = js.native
    
    /* CompleteClass */
    var resource: String = js.native
    
    /* CompleteClass */
    override def retrievePassword(): Unit = js.native
    
    /* CompleteClass */
    var userName: String = js.native
  }
  
  @JSGlobal("Windows.Security.Credentials.PasswordCredentialPropertyStore")
  @js.native
  open class PasswordCredentialPropertyStore ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Security.Credentials.PasswordCredentialPropertyStore {
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    override def first(): IIterator[IKeyValuePair[String, Any]] = js.native
    
    /* CompleteClass */
    override def getView(): IMapView[String, Any] = js.native
    
    /* CompleteClass */
    override def hasKey(key: String): Boolean = js.native
    
    /* CompleteClass */
    override def insert(key: String, value: Any): Boolean = js.native
    
    /* CompleteClass */
    override def lookup(key: String): Any = js.native
    
    /* CompleteClass */
    var onmapchanged: Any = js.native
    
    /* CompleteClass */
    override def remove(key: String): Unit = js.native
    
    /* CompleteClass */
    var size: Double = js.native
  }
  
  @JSGlobal("Windows.Security.Credentials.PasswordVault")
  @js.native
  open class PasswordVault ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Security.Credentials.PasswordVault {
    
    /* CompleteClass */
    override def add(credential: typingsJapgolly.winrt.Windows.Security.Credentials.PasswordCredential): Unit = js.native
    
    /* CompleteClass */
    override def findAllByResource(resource: String): IVectorView[typingsJapgolly.winrt.Windows.Security.Credentials.PasswordCredential] = js.native
    
    /* CompleteClass */
    override def findAllByUserName(userName: String): IVectorView[typingsJapgolly.winrt.Windows.Security.Credentials.PasswordCredential] = js.native
    
    /* CompleteClass */
    override def remove(credential: typingsJapgolly.winrt.Windows.Security.Credentials.PasswordCredential): Unit = js.native
    
    /* CompleteClass */
    override def retrieve(resource: String, userName: String): typingsJapgolly.winrt.Windows.Security.Credentials.PasswordCredential = js.native
    
    /* CompleteClass */
    override def retrieveAll(): IVectorView[typingsJapgolly.winrt.Windows.Security.Credentials.PasswordCredential] = js.native
  }
  
  object UI {
    
    @JSGlobal("Windows.Security.Credentials.UI.AuthenticationProtocol")
    @js.native
    object AuthenticationProtocol extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsJapgolly.winrt.Windows.Security.Credentials.UI.AuthenticationProtocol & Double
          ] = js.native
      
      /* 0 */ val basic: typingsJapgolly.winrt.Windows.Security.Credentials.UI.AuthenticationProtocol.basic & Double = js.native
      
      /* 5 */ val credSsp: typingsJapgolly.winrt.Windows.Security.Credentials.UI.AuthenticationProtocol.credSsp & Double = js.native
      
      /* 6 */ val custom: typingsJapgolly.winrt.Windows.Security.Credentials.UI.AuthenticationProtocol.custom & Double = js.native
      
      /* 1 */ val digest: typingsJapgolly.winrt.Windows.Security.Credentials.UI.AuthenticationProtocol.digest & Double = js.native
      
      /* 3 */ val kerberos: typingsJapgolly.winrt.Windows.Security.Credentials.UI.AuthenticationProtocol.kerberos & Double = js.native
      
      /* 4 */ val negotiate: typingsJapgolly.winrt.Windows.Security.Credentials.UI.AuthenticationProtocol.negotiate & Double = js.native
      
      /* 2 */ val ntlm: typingsJapgolly.winrt.Windows.Security.Credentials.UI.AuthenticationProtocol.ntlm & Double = js.native
    }
    
    @JSGlobal("Windows.Security.Credentials.UI.CredentialPicker")
    @js.native
    open class CredentialPicker ()
      extends StObject
         with typingsJapgolly.winrt.Windows.Security.Credentials.UI.CredentialPicker
    /* static members */
    object CredentialPicker {
      
      @JSGlobal("Windows.Security.Credentials.UI.CredentialPicker")
      @js.native
      val ^ : js.Any = js.native
      
      inline def pickAsync(options: typingsJapgolly.winrt.Windows.Security.Credentials.UI.CredentialPickerOptions): IAsyncOperation[typingsJapgolly.winrt.Windows.Security.Credentials.UI.CredentialPickerResults] = ^.asInstanceOf[js.Dynamic].applyDynamic("pickAsync")(options.asInstanceOf[js.Any]).asInstanceOf[IAsyncOperation[typingsJapgolly.winrt.Windows.Security.Credentials.UI.CredentialPickerResults]]
      inline def pickAsync(targetName: String, message: String): IAsyncOperation[typingsJapgolly.winrt.Windows.Security.Credentials.UI.CredentialPickerResults] = (^.asInstanceOf[js.Dynamic].applyDynamic("pickAsync")(targetName.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[IAsyncOperation[typingsJapgolly.winrt.Windows.Security.Credentials.UI.CredentialPickerResults]]
      inline def pickAsync(targetName: String, message: String, caption: String): IAsyncOperation[typingsJapgolly.winrt.Windows.Security.Credentials.UI.CredentialPickerResults] = (^.asInstanceOf[js.Dynamic].applyDynamic("pickAsync")(targetName.asInstanceOf[js.Any], message.asInstanceOf[js.Any], caption.asInstanceOf[js.Any])).asInstanceOf[IAsyncOperation[typingsJapgolly.winrt.Windows.Security.Credentials.UI.CredentialPickerResults]]
    }
    
    @JSGlobal("Windows.Security.Credentials.UI.CredentialPickerOptions")
    @js.native
    open class CredentialPickerOptions ()
      extends StObject
         with typingsJapgolly.winrt.Windows.Security.Credentials.UI.CredentialPickerOptions {
      
      /* CompleteClass */
      var alwaysDisplayDialog: Boolean = js.native
      
      /* CompleteClass */
      var authenticationProtocol: AuthenticationProtocol = js.native
      
      /* CompleteClass */
      var callerSavesCredential: Boolean = js.native
      
      /* CompleteClass */
      var caption: String = js.native
      
      /* CompleteClass */
      var credentialSaveOption: CredentialSaveOption = js.native
      
      /* CompleteClass */
      var customAuthenticationProtocol: String = js.native
      
      /* CompleteClass */
      var errorCode: Double = js.native
      
      /* CompleteClass */
      var message: String = js.native
      
      /* CompleteClass */
      var previousCredential: IBuffer = js.native
      
      /* CompleteClass */
      var targetName: String = js.native
    }
    
    @JSGlobal("Windows.Security.Credentials.UI.CredentialPickerResults")
    @js.native
    open class CredentialPickerResults ()
      extends StObject
         with typingsJapgolly.winrt.Windows.Security.Credentials.UI.CredentialPickerResults {
      
      /* CompleteClass */
      var credential: IBuffer = js.native
      
      /* CompleteClass */
      var credentialDomainName: String = js.native
      
      /* CompleteClass */
      var credentialPassword: String = js.native
      
      /* CompleteClass */
      var credentialSaveOption: CredentialSaveOption = js.native
      
      /* CompleteClass */
      var credentialSaved: Boolean = js.native
      
      /* CompleteClass */
      var credentialUserName: String = js.native
      
      /* CompleteClass */
      var errorCode: Double = js.native
    }
    
    @JSGlobal("Windows.Security.Credentials.UI.CredentialSaveOption")
    @js.native
    object CredentialSaveOption extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsJapgolly.winrt.Windows.Security.Credentials.UI.CredentialSaveOption & Double
          ] = js.native
      
      /* 2 */ val hidden: typingsJapgolly.winrt.Windows.Security.Credentials.UI.CredentialSaveOption.hidden & Double = js.native
      
      /* 1 */ val selected: typingsJapgolly.winrt.Windows.Security.Credentials.UI.CredentialSaveOption.selected & Double = js.native
      
      /* 0 */ val unselected: typingsJapgolly.winrt.Windows.Security.Credentials.UI.CredentialSaveOption.unselected & Double = js.native
    }
  }
}
