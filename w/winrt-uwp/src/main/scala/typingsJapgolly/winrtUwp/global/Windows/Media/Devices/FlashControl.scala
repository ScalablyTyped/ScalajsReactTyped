package typingsJapgolly.winrtUwp.global.Windows.Media.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides functionality for controlling the flash settings on a capture device. */
/* note: abstract class */ @JSGlobal("Windows.Media.Devices.FlashControl")
@js.native
open class FlashControl ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Media.Devices.FlashControl {
  
  /** Gets or sets a value indicating whether focus assist light is enabled on the capture device. */
  /* CompleteClass */
  var assistantLightEnabled: Boolean = js.native
  
  /** Gets a value indicating whether focus assist light is supported by the capture device. */
  /* CompleteClass */
  var assistantLightSupported: Boolean = js.native
  
  /** Gets or sets a value that specifies if flash is automatically set. */
  /* CompleteClass */
  var auto: Boolean = js.native
  
  /** Gets a value that specifies if the flash on the capture device is enabled or disabled. */
  /* CompleteClass */
  var enabled: Boolean = js.native
  
  /** Gets or sets the intensity of the flash. */
  /* CompleteClass */
  var powerPercent: Double = js.native
  
  /** Gets a value that specifics if the device allows the torch LED power settings to be changed. */
  /* CompleteClass */
  var powerSupported: Boolean = js.native
  
  /** Gets a value that specifies if the red eye reduction is enabled or disabled. */
  /* CompleteClass */
  var redEyeReduction: Boolean = js.native
  
  /** Gets a value that specifies if the capture device supports red eye reduction. */
  /* CompleteClass */
  var redEyeReductionSupported: Boolean = js.native
  
  /** Gets a value that specifies if the capture device supports the flash control. */
  /* CompleteClass */
  var supported: Boolean = js.native
}
