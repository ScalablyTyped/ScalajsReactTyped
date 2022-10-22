package typingsJapgolly.antvPathUtil

import typingsJapgolly.antvPathUtil.libTypesMod.PathCommand
import typingsJapgolly.antvPathUtil.libTypesMod.ProcessParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProcessSegment2CubicMod {
  
  @JSImport("@antv/path-util/lib/process/segment-2-cubic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def segmentToCubic(segment: PathCommand, params: ProcessParams): PathCommand = (^.asInstanceOf[js.Dynamic].applyDynamic("segmentToCubic")(segment.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[PathCommand]
}
