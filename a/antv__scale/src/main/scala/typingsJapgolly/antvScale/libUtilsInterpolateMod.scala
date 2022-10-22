package typingsJapgolly.antvScale

import typingsJapgolly.antvScale.libTypesMod.Interpolate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsInterpolateMod {
  
  @JSImport("@antv/scale/lib/utils/interpolate", "createInterpolateColor")
  @js.native
  val createInterpolateColor: Interpolate[String] = js.native
  
  @JSImport("@antv/scale/lib/utils/interpolate", "createInterpolateNumber")
  @js.native
  val createInterpolateNumber: Interpolate[Double] = js.native
  
  @JSImport("@antv/scale/lib/utils/interpolate", "createInterpolateRound")
  @js.native
  val createInterpolateRound: Interpolate[Double] = js.native
  
  @JSImport("@antv/scale/lib/utils/interpolate", "createInterpolateValue")
  @js.native
  val createInterpolateValue: Interpolate[Double | String] = js.native
}
