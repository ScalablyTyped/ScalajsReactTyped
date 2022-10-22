package typingsJapgolly.popmotion

import typingsJapgolly.popmotion.anon.Stop
import typingsJapgolly.popmotion.libAnimationsTypesMod.InertiaOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAnimationsInertiaMod {
  
  @JSImport("popmotion/lib/animations/inertia", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def inertia(
    hasFromVelocityMinMaxPowerTimeConstantBounceStiffnessBounceDampingRestDeltaModifyTargetDriverOnUpdateOnCompleteOnStop: InertiaOptions
  ): Stop = ^.asInstanceOf[js.Dynamic].applyDynamic("inertia")(hasFromVelocityMinMaxPowerTimeConstantBounceStiffnessBounceDampingRestDeltaModifyTargetDriverOnUpdateOnCompleteOnStop.asInstanceOf[js.Any]).asInstanceOf[Stop]
}
