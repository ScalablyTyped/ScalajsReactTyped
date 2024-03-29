package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContactCardTabKind extends StObject
/** Specifies which tab to display on a mini contact card. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactCardTabKind")
@js.native
object ContactCardTabKind extends StObject {
  
  /** The default tab. */
  @js.native
  sealed trait default
    extends StObject
       with ContactCardTabKind
  
  /** The email tab. */
  @js.native
  sealed trait email
    extends StObject
       with ContactCardTabKind
  
  /** The messaging tab. */
  @js.native
  sealed trait messaging
    extends StObject
       with ContactCardTabKind
  
  /** The phone tab. */
  @js.native
  sealed trait phone
    extends StObject
       with ContactCardTabKind
  
  /** The video tab. */
  @js.native
  sealed trait video
    extends StObject
       with ContactCardTabKind
}
