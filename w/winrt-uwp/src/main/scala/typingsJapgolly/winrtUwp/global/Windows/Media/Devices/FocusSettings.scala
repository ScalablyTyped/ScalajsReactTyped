package typingsJapgolly.winrtUwp.global.Windows.Media.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents settings for a FocusControl object. */
@JSGlobal("Windows.Media.Devices.FocusSettings")
@js.native
/** Initializes a new instance of the FocusSettings class. */
open class FocusSettings ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Media.Devices.FocusSettings {
  
  /** Gets or sets a value indicating the auto focus range setting. */
  /* CompleteClass */
  var autoFocusRange: typingsJapgolly.winrtUwp.Windows.Media.Devices.AutoFocusRange = js.native
  
  /** Gets or sets a value that indicates to the driver if it should disable determining a focus position when the focus search fails. */
  /* CompleteClass */
  var disableDriverFallback: Boolean = js.native
  
  /** Gets or sets a value indicating the manual focus distance setting. */
  /* CompleteClass */
  var distance: typingsJapgolly.winrtUwp.Windows.Media.Devices.ManualFocusDistance = js.native
  
  /** Gets or sets a value indicating the focus mode setting. */
  /* CompleteClass */
  var mode: typingsJapgolly.winrtUwp.Windows.Media.Devices.FocusMode = js.native
  
  /** Gets or sets the focus value setting. */
  /* CompleteClass */
  var value: Double = js.native
  
  /** Gets or sets a value indicating whether the capture device should wait for focus before capturing. */
  /* CompleteClass */
  var waitForFocus: Boolean = js.native
}
