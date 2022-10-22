package typingsJapgolly.ionicCore

import org.scalajs.dom.HTMLElement
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.ComponentInterface
import typingsJapgolly.ionicCore.ionicCoreStrings.bounded
import typingsJapgolly.ionicCore.ionicCoreStrings.unbounded
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsRippleEffectRippleEffectMod {
  
  @JSImport("@ionic/core/dist/types/components/ripple-effect/ripple-effect", "RippleEffect")
  @js.native
  open class RippleEffect ()
    extends StObject
       with ComponentInterface {
    
    /**
      * Adds the ripple effect to the parent element.
      *
      * @param x The horizontal coordinate of where the ripple should start.
      * @param y The vertical coordinate of where the ripple should start.
      */
    def addRipple(x: Double, y: Double): js.Promise[js.Function0[Unit]] = js.native
    
    var el: HTMLElement = js.native
    
    @JSName("render")
    def render_MRippleEffect(): Any = js.native
    
    /**
      * Sets the type of ripple-effect:
      *
      * - `bounded`: the ripple effect expands from the user's click position
      * - `unbounded`: the ripple effect expands from the center of the button and overflows the container.
      *
      * NOTE: Surfaces for bounded ripples should have the overflow property set to hidden,
      * while surfaces for unbounded ripples should have it set to visible.
      */
    var `type`: bounded | unbounded = js.native
    
    /* private */ def unbounded: Any = js.native
  }
}
