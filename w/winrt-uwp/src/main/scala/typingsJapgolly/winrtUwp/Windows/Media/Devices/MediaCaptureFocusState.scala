package typingsJapgolly.winrtUwp.Windows.Media.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MediaCaptureFocusState extends StObject
/** Defines the different focus states the capture device can be in. */
@JSGlobal("Windows.Media.Devices.MediaCaptureFocusState")
@js.native
object MediaCaptureFocusState extends StObject {
  
  /** The attempt to focus has failed. */
  @js.native
  sealed trait failed
    extends StObject
       with MediaCaptureFocusState
  
  /** Focused. */
  @js.native
  sealed trait focused
    extends StObject
       with MediaCaptureFocusState
  
  /** The focus has been lost. */
  @js.native
  sealed trait lost
    extends StObject
       with MediaCaptureFocusState
  
  /** Searching for focus. */
  @js.native
  sealed trait searching
    extends StObject
       with MediaCaptureFocusState
  
  /** The focus state is uninitialized. */
  @js.native
  sealed trait uninitialized
    extends StObject
       with MediaCaptureFocusState
}
