package typingsJapgolly.rcSteps

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.rcSteps.anon.Current
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rc-steps", JSImport.Default)
  @js.native
  open class default ()
    extends typingsJapgolly.rcSteps.libStepsMod.default
  /* static members */
  object default {
    
    @JSImport("rc-steps", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rc-steps", "default.Step")
    @js.native
    def Step: Instantiable0[typingsJapgolly.rcSteps.libStepMod.default] = js.native
    inline def Step_=(x: Instantiable0[typingsJapgolly.rcSteps.libStepMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Step")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-steps", "default.defaultProps")
    @js.native
    def defaultProps: Current = js.native
    inline def defaultProps_=(x: Current): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rc-steps", "Step")
  @js.native
  open class Step ()
    extends typingsJapgolly.rcSteps.libStepMod.default
}
