package typingsJapgolly.winrtUwp.global.Windows.Media.Protection

import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables applications to initiate renewal of components which need updating in order to play protected media content. */
/* note: abstract class */ @JSGlobal("Windows.Media.Protection.ComponentRenewal")
@js.native
open class ComponentRenewal ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Media.Protection.ComponentRenewal
object ComponentRenewal {
  
  @JSGlobal("Windows.Media.Protection.ComponentRenewal")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Initiates updating of critical content protection components after prompting the user.
    * @param information Revocation and renewal information.
    * @return An object that is used to control the asynchronous operation.
    */
  /* static member */
  inline def renewSystemComponentsAsync(information: typingsJapgolly.winrtUwp.Windows.Media.Protection.RevocationAndRenewalInformation): IPromiseWithIAsyncOperationWithProgress[typingsJapgolly.winrtUwp.Windows.Media.Protection.RenewalStatus, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("renewSystemComponentsAsync")(information.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperationWithProgress[typingsJapgolly.winrtUwp.Windows.Media.Protection.RenewalStatus, Double]]
}
