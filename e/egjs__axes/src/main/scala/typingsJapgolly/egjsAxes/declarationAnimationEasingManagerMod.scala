package typingsJapgolly.egjsAxes

import typingsJapgolly.egjsAxes.anon.AxisManager
import typingsJapgolly.egjsAxes.declarationAnimationAnimationManagerMod.AnimationManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object declarationAnimationEasingManagerMod {
  
  @JSImport("@egjs/axes/declaration/animation/EasingManager", "EasingManager")
  @js.native
  open class EasingManager protected () extends AnimationManager {
    def this(hasOptionsInterruptManagerEventManagerAxisManager: AxisManager) = this()
    
    /* private */ var _durationOffset: Any = js.native
    
    /* private */ var _easing: Any = js.native
    
    /* private */ var _initialEasingPer: Any = js.native
    
    /* private */ var _prevEasingPer: Any = js.native
    
    /* protected */ var _useDuration: Boolean = js.native
  }
}
