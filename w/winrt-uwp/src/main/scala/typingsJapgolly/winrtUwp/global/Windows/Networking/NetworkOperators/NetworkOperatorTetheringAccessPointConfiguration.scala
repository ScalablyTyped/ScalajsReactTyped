package typingsJapgolly.winrtUwp.global.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the ability to configure and create a NetworkOperatorTetheringAccessPointConfiguration object that contains a specific network account ID (SSID) and specifies the passphrase used to authenticate clients trying to establish a network connection to the tethering network. */
@JSGlobal("Windows.Networking.NetworkOperators.NetworkOperatorTetheringAccessPointConfiguration")
@js.native
/** Creates an instance of the NetworkOperatorTetheringAccessPointConfiguration . */
open class NetworkOperatorTetheringAccessPointConfiguration ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators.NetworkOperatorTetheringAccessPointConfiguration {
  
  /** Gets or sets the passphrase used to authenticate the connection. */
  /* CompleteClass */
  var passphrase: String = js.native
  
  /** Gets or sets the network account ID. */
  /* CompleteClass */
  var ssid: String = js.native
}
