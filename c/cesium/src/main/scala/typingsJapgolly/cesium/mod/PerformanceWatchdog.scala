package typingsJapgolly.cesium.mod

import org.scalajs.dom.Element
import typingsJapgolly.cesium.anon.LowFrameRateMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "PerformanceWatchdog")
@js.native
open class PerformanceWatchdog () extends StObject {
  def this(options: LowFrameRateMessage) = this()
  
  /**
    * Gets the parent container.
    */
  var container: Element = js.native
  
  /**
    * Destroys the widget.  Should be called if permanently
    * removing the widget from layout.
    */
  def destroy(): Unit = js.native
  
  /**
    * @returns true if the object has been destroyed, false otherwise.
    */
  def isDestroyed(): Boolean = js.native
  
  /**
    * Gets the view model.
    */
  var viewModel: PerformanceWatchdogViewModel = js.native
}
