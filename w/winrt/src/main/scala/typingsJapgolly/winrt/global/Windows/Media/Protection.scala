package typingsJapgolly.winrt.global.Windows.Media

import typingsJapgolly.winrt.Windows.Foundation.Collections.IPropertySet
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typingsJapgolly.winrt.Windows.Media.Protection.IMediaProtectionServiceRequest
import typingsJapgolly.winrt.Windows.Media.Protection.RenewalStatus
import typingsJapgolly.winrt.Windows.Media.Protection.RevocationAndRenewalReasons
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Protection {
  
  @JSGlobal("Windows.Media.Protection.ComponentLoadFailedEventArgs")
  @js.native
  open class ComponentLoadFailedEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Media.Protection.ComponentLoadFailedEventArgs {
    
    /* CompleteClass */
    var completion: typingsJapgolly.winrt.Windows.Media.Protection.MediaProtectionServiceCompletion = js.native
    
    /* CompleteClass */
    var information: typingsJapgolly.winrt.Windows.Media.Protection.RevocationAndRenewalInformation = js.native
  }
  
  @JSGlobal("Windows.Media.Protection.ComponentRenewal")
  @js.native
  open class ComponentRenewal ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Media.Protection.ComponentRenewal
  /* static members */
  object ComponentRenewal {
    
    @JSGlobal("Windows.Media.Protection.ComponentRenewal")
    @js.native
    val ^ : js.Any = js.native
    
    inline def renewSystemComponentsAsync(information: typingsJapgolly.winrt.Windows.Media.Protection.RevocationAndRenewalInformation): IAsyncOperationWithProgress[RenewalStatus, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("renewSystemComponentsAsync")(information.asInstanceOf[js.Any]).asInstanceOf[IAsyncOperationWithProgress[RenewalStatus, Double]]
  }
  
  @JSGlobal("Windows.Media.Protection.MediaProtectionManager")
  @js.native
  open class MediaProtectionManager ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Media.Protection.MediaProtectionManager {
    
    /* CompleteClass */
    var oncomponentloadfailed: Any = js.native
    
    /* CompleteClass */
    var onrebootneeded: Any = js.native
    
    /* CompleteClass */
    var onservicerequested: Any = js.native
    
    /* CompleteClass */
    var properties: IPropertySet = js.native
  }
  
  @JSGlobal("Windows.Media.Protection.MediaProtectionServiceCompletion")
  @js.native
  open class MediaProtectionServiceCompletion ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Media.Protection.MediaProtectionServiceCompletion {
    
    /* CompleteClass */
    override def complete(success: Boolean): Unit = js.native
  }
  
  @JSGlobal("Windows.Media.Protection.RenewalStatus")
  @js.native
  object RenewalStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Media.Protection.RenewalStatus & Double] = js.native
    
    /* 3 */ val appComponentsMayNeedUpdating: typingsJapgolly.winrt.Windows.Media.Protection.RenewalStatus.appComponentsMayNeedUpdating & Double = js.native
    
    /* 4 */ val noComponentsFound: typingsJapgolly.winrt.Windows.Media.Protection.RenewalStatus.noComponentsFound & Double = js.native
    
    /* 0 */ val notStarted: typingsJapgolly.winrt.Windows.Media.Protection.RenewalStatus.notStarted & Double = js.native
    
    /* 1 */ val updatesInProgress: typingsJapgolly.winrt.Windows.Media.Protection.RenewalStatus.updatesInProgress & Double = js.native
    
    /* 2 */ val userCancelled: typingsJapgolly.winrt.Windows.Media.Protection.RenewalStatus.userCancelled & Double = js.native
  }
  
  @JSGlobal("Windows.Media.Protection.RevocationAndRenewalInformation")
  @js.native
  open class RevocationAndRenewalInformation ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Media.Protection.RevocationAndRenewalInformation {
    
    /* CompleteClass */
    var items: IVector[typingsJapgolly.winrt.Windows.Media.Protection.RevocationAndRenewalItem] = js.native
  }
  
  @JSGlobal("Windows.Media.Protection.RevocationAndRenewalItem")
  @js.native
  open class RevocationAndRenewalItem ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Media.Protection.RevocationAndRenewalItem {
    
    /* CompleteClass */
    var headerHash: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var publicKeyHash: String = js.native
    
    /* CompleteClass */
    var reasons: RevocationAndRenewalReasons = js.native
    
    /* CompleteClass */
    var renewalId: String = js.native
  }
  
  @JSGlobal("Windows.Media.Protection.RevocationAndRenewalReasons")
  @js.native
  object RevocationAndRenewalReasons extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.winrt.Windows.Media.Protection.RevocationAndRenewalReasons & Double
      ] = js.native
    
    /* 2 */ val appComponent: typingsJapgolly.winrt.Windows.Media.Protection.RevocationAndRenewalReasons.appComponent & Double = js.native
    
    /* 12 */ val bootDriverVerificationFailed: typingsJapgolly.winrt.Windows.Media.Protection.RevocationAndRenewalReasons.bootDriverVerificationFailed & Double = js.native
    
    /* 8 */ val componentCertificateRevoked: typingsJapgolly.winrt.Windows.Media.Protection.RevocationAndRenewalReasons.componentCertificateRevoked & Double = js.native
    
    /* 10 */ val componentHighSecurityCertificateRevoked: typingsJapgolly.winrt.Windows.Media.Protection.RevocationAndRenewalReasons.componentHighSecurityCertificateRevoked & Double = js.native
    
    /* 11 */ val componentLowSecurityCertificateRevoked: typingsJapgolly.winrt.Windows.Media.Protection.RevocationAndRenewalReasons.componentLowSecurityCertificateRevoked & Double = js.native
    
    /* 6 */ val componentRevoked: typingsJapgolly.winrt.Windows.Media.Protection.RevocationAndRenewalReasons.componentRevoked & Double = js.native
    
    /* 13 */ val componentSignedWithTestCertificate: typingsJapgolly.winrt.Windows.Media.Protection.RevocationAndRenewalReasons.componentSignedWithTestCertificate & Double = js.native
    
    /* 14 */ val encryptionFailure: typingsJapgolly.winrt.Windows.Media.Protection.RevocationAndRenewalReasons.encryptionFailure & Double = js.native
    
    /* 5 */ val globalRevocationListAbsent: typingsJapgolly.winrt.Windows.Media.Protection.RevocationAndRenewalReasons.globalRevocationListAbsent & Double = js.native
    
    /* 3 */ val globalRevocationListLoadFailed: typingsJapgolly.winrt.Windows.Media.Protection.RevocationAndRenewalReasons.globalRevocationListLoadFailed & Double = js.native
    
    /* 7 */ val invalidComponentCertificateExtendedKeyUse: typingsJapgolly.winrt.Windows.Media.Protection.RevocationAndRenewalReasons.invalidComponentCertificateExtendedKeyUse & Double = js.native
    
    /* 9 */ val invalidComponentCertificateRoot: typingsJapgolly.winrt.Windows.Media.Protection.RevocationAndRenewalReasons.invalidComponentCertificateRoot & Double = js.native
    
    /* 4 */ val invalidGlobalRevocationListSignature: typingsJapgolly.winrt.Windows.Media.Protection.RevocationAndRenewalReasons.invalidGlobalRevocationListSignature & Double = js.native
    
    /* 1 */ val kernelModeComponentLoad: typingsJapgolly.winrt.Windows.Media.Protection.RevocationAndRenewalReasons.kernelModeComponentLoad & Double = js.native
    
    /* 0 */ val userModeComponentLoad: typingsJapgolly.winrt.Windows.Media.Protection.RevocationAndRenewalReasons.userModeComponentLoad & Double = js.native
  }
  
  @JSGlobal("Windows.Media.Protection.ServiceRequestedEventArgs")
  @js.native
  open class ServiceRequestedEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Media.Protection.ServiceRequestedEventArgs {
    
    /* CompleteClass */
    var completion: typingsJapgolly.winrt.Windows.Media.Protection.MediaProtectionServiceCompletion = js.native
    
    /* CompleteClass */
    var request: IMediaProtectionServiceRequest = js.native
  }
}
