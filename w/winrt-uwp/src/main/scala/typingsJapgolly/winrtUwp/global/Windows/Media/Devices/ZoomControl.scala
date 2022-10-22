package typingsJapgolly.winrtUwp.global.Windows.Media.Devices

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides functionality for controlling the zoom settings on a capture device. */
/* note: abstract class */ @JSGlobal("Windows.Media.Devices.ZoomControl")
@js.native
open class ZoomControl ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Media.Devices.ZoomControl {
  
  /**
    * Configures the zoom control with the provided zoom settings.
    * @param settings The zoom settings.
    */
  /* CompleteClass */
  override def configure(settings: typingsJapgolly.winrtUwp.Windows.Media.Devices.ZoomSettings): Unit = js.native
  
  /** Gets the maximum zoom value supported by the capture device. */
  /* CompleteClass */
  var max: Double = js.native
  
  /** Gets the minimum zoom value supported by the capture device. */
  /* CompleteClass */
  var min: Double = js.native
  
  /** Gets a value indicating the current zoom transition mode. */
  /* CompleteClass */
  var mode: typingsJapgolly.winrtUwp.Windows.Media.Devices.ZoomTransitionMode = js.native
  
  /** Gets the smallest zoom value increment supported by the capture device. */
  /* CompleteClass */
  var step: Double = js.native
  
  /** Gets a value indicating whether zoom control is supported by the capture device. */
  /* CompleteClass */
  var supported: Boolean = js.native
  
  /** Gets the list of ZoomTransitionMode values indicating the modes supported by the capture device. */
  /* CompleteClass */
  var supportedModes: IVectorView[typingsJapgolly.winrtUwp.Windows.Media.Devices.ZoomTransitionMode] = js.native
  
  /** Gets or sets the zoom value to be used by the capture device. */
  /* CompleteClass */
  var value: Double = js.native
}
