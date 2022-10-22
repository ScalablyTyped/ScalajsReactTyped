package typingsJapgolly.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "BouncingBehavior")
@js.native
open class BouncingBehavior ()
  extends typingsJapgolly.babylonjs.legacyLegacyMod.BouncingBehavior
/* static members */
object BouncingBehavior {
  
  @JSImport("babylonjs", "BouncingBehavior")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The easing function used by animations
    */
  @JSImport("babylonjs", "BouncingBehavior.EasingFunction")
  @js.native
  def EasingFunction: typingsJapgolly.babylonjs.animationsEasingMod.BackEase = js.native
  inline def EasingFunction_=(x: typingsJapgolly.babylonjs.animationsEasingMod.BackEase): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EasingFunction")(x.asInstanceOf[js.Any])
  
  /**
    * The easing mode used by animations
    */
  @JSImport("babylonjs", "BouncingBehavior.EasingMode")
  @js.native
  def EasingMode: Double = js.native
  inline def EasingMode_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EasingMode")(x.asInstanceOf[js.Any])
}
