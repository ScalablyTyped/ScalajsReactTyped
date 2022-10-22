package typingsJapgolly.reactSpringAnimated

import typingsJapgolly.reactSpringAnimated.distDeclarationsSrcAnimatedMod.Animated
import typingsJapgolly.reactSpringAnimated.distDeclarationsSrcAnimatedValueMod.AnimatedValue
import typingsJapgolly.reactSpringTypes.utilMod.Lookup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcAnimatedObjectMod {
  
  @JSImport("@react-spring/animated/dist/declarations/src/AnimatedObject", "AnimatedObject")
  @js.native
  open class AnimatedObject protected () extends Animated[Any] {
    def this(source: Lookup[Any]) = this()
    
    /** Add to a payload set. */
    /* protected */ def _addToPayload(source: Any): Unit = js.native
    
    /** Create a payload set. */
    /* protected */ def _makePayload(source: Lookup[Any]): js.UndefOr[js.Array[AnimatedValue[Any]]] = js.native
    
    /** Replace the raw object data */
    def setValue(source: Lookup[Any]): Unit = js.native
    
    /* protected */ var source: Lookup[Any] = js.native
  }
}
