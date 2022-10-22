package typingsJapgolly.winrtUwp.global.Windows.Devices.Perception

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides static properties of depth frame sources. */
/* note: abstract class */ @JSGlobal("Windows.Devices.Perception.KnownPerceptionDepthFrameSourceProperties")
@js.native
open class KnownPerceptionDepthFrameSourceProperties ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Devices.Perception.KnownPerceptionDepthFrameSourceProperties
object KnownPerceptionDepthFrameSourceProperties {
  
  @JSGlobal("Windows.Devices.Perception.KnownPerceptionDepthFrameSourceProperties")
  @js.native
  val ^ : js.Any = js.native
  
  /** Gets a string key used to retrieve a 16-bit unsigned integer property indicating the maximum depth of the depth frame source. */
  /* static member */
  @JSGlobal("Windows.Devices.Perception.KnownPerceptionDepthFrameSourceProperties.maxDepth")
  @js.native
  def maxDepth: String = js.native
  inline def maxDepth_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxDepth")(x.asInstanceOf[js.Any])
  
  /** Gets a string key used to retrieve a 16-bit unsigned integer property indicating the minimum depth of the depth frame source. */
  /* static member */
  @JSGlobal("Windows.Devices.Perception.KnownPerceptionDepthFrameSourceProperties.minDepth")
  @js.native
  def minDepth: String = js.native
  inline def minDepth_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minDepth")(x.asInstanceOf[js.Any])
}
