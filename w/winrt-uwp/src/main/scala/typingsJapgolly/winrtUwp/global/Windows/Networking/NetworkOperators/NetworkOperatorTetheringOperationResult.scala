package typingsJapgolly.winrtUwp.global.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the results of a StartTetheringAsync or StopTetheringAsync operation. In addition to the TetheringOperationStatus value, it can include an optional error message string that provides mobile operator specific context to the error. */
/* note: abstract class */ @JSGlobal("Windows.Networking.NetworkOperators.NetworkOperatorTetheringOperationResult")
@js.native
open class NetworkOperatorTetheringOperationResult ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators.NetworkOperatorTetheringOperationResult {
  
  /** An optional error message string that provides mobile operator specific context to the error. */
  /* CompleteClass */
  var additionalErrorMessage: String = js.native
  
  /** Indicates the result of a tethering operation. Possible values are defined by TetheringOperationStatus . */
  /* CompleteClass */
  var status: typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators.TetheringOperationStatus = js.native
}
