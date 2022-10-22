package typingsJapgolly.popmotion

import typingsJapgolly.popmotion.libAnimationsTypesMod.Animation
import typingsJapgolly.popmotion.libAnimationsTypesMod.SpringOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAnimationsGeneratorsSpringMod {
  
  object spring {
    
    inline def apply(hasFromToRestSpeedRestDeltaOptions: SpringOptions): Animation[Double] = ^.asInstanceOf[js.Dynamic].apply(hasFromToRestSpeedRestDeltaOptions.asInstanceOf[js.Any]).asInstanceOf[Animation[Double]]
    
    @JSImport("popmotion/lib/animations/generators/spring", "spring")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("popmotion/lib/animations/generators/spring", "spring.needsInterpolation")
    @js.native
    def needsInterpolation: js.Function2[/* a */ Any, /* b */ Any, Boolean] = js.native
    inline def needsInterpolation_=(x: js.Function2[/* a */ Any, /* b */ Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("needsInterpolation")(x.asInstanceOf[js.Any])
  }
}
