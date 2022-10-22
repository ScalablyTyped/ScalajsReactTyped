package typingsJapgolly.winrtUwp.global.Windows.Media.Protection.PlayReady

import typingsJapgolly.winrtUwp.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to metadata about a domain to which the current system is a member. */
/* note: abstract class */ @JSGlobal("Windows.Media.Protection.PlayReady.PlayReadyDomain")
@js.native
open class PlayReadyDomain ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Media.Protection.PlayReady.PlayReadyDomain {
  
  /** Gets the current domain account identifier property. */
  /* CompleteClass */
  var accountId: String = js.native
  
  /** Gets the URL used to join the domain. */
  /* CompleteClass */
  var domainJoinUrl: Uri = js.native
  
  /** Gets the current domain friendly name. */
  /* CompleteClass */
  var friendlyName: String = js.native
  
  /** Gets the current domain revision number. */
  /* CompleteClass */
  var revision: Double = js.native
  
  /** Gets the current domain service identifier property. */
  /* CompleteClass */
  var serviceId: String = js.native
}
