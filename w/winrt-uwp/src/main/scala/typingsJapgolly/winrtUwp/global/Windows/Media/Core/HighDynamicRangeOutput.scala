package typingsJapgolly.winrtUwp.global.Windows.Media.Core

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrtUwp.Windows.Media.Devices.Core.FrameController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the results of a High Dynamic Range (HDR) analysis operation from the SceneAnalysisEffect . */
/* note: abstract class */ @JSGlobal("Windows.Media.Core.HighDynamicRangeOutput")
@js.native
open class HighDynamicRangeOutput ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Media.Core.HighDynamicRangeOutput {
  
  /** Gets a value indicating the certainty of the results of the HDR analysis. */
  /* CompleteClass */
  var certainty: Double = js.native
  
  /** Gets a set of FrameController objects representing the suggested frame controllers settings for capturing a variable photo sequence with the High Dynamic Range (HDR) technique. */
  /* CompleteClass */
  var frameControllers: IVectorView[FrameController] = js.native
}
