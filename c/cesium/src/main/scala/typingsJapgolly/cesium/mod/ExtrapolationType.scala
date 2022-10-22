package typingsJapgolly.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExtrapolationType extends StObject
@JSImport("cesium", "ExtrapolationType")
@js.native
object ExtrapolationType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtrapolationType & Double] = js.native
  
  /**
    * The value is extrapolated.
    */
  @js.native
  sealed trait EXTRAPOLATE
    extends StObject
       with ExtrapolationType
  /* 2 */ val EXTRAPOLATE: typingsJapgolly.cesium.mod.ExtrapolationType.EXTRAPOLATE & Double = js.native
  
  /**
    * The first or last value is used when outside the range of sample data.
    */
  @js.native
  sealed trait HOLD
    extends StObject
       with ExtrapolationType
  /* 1 */ val HOLD: typingsJapgolly.cesium.mod.ExtrapolationType.HOLD & Double = js.native
  
  /**
    * No extrapolation occurs.
    */
  @js.native
  sealed trait NONE
    extends StObject
       with ExtrapolationType
  /* 0 */ val NONE: typingsJapgolly.cesium.mod.ExtrapolationType.NONE & Double = js.native
}
