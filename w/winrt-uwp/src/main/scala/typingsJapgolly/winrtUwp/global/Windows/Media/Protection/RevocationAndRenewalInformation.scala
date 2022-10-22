package typingsJapgolly.winrtUwp.global.Windows.Media.Protection

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information about components that need to be revoked and renewed. */
/* note: abstract class */ @JSGlobal("Windows.Media.Protection.RevocationAndRenewalInformation")
@js.native
open class RevocationAndRenewalInformation ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Media.Protection.RevocationAndRenewalInformation {
  
  /** Returns a list of components that need to be revoked and renewed with updated components. */
  /* CompleteClass */
  var items: IVector[typingsJapgolly.winrtUwp.Windows.Media.Protection.RevocationAndRenewalItem] = js.native
}
