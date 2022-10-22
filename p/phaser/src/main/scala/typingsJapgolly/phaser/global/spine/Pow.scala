package typingsJapgolly.phaser.global.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.Pow")
@js.native
open class Pow protected ()
  extends StObject
     with typingsJapgolly.phaser.spine.Pow {
  def this(power: Double) = this()
  
  /* CompleteClass */
  @JSName("apply")
  override def apply(start: Double, end: Double, a: Double): Double = js.native
  
  /* protected */ /* CompleteClass */
  override def applyInternal(a: Double): Double = js.native
  
  /* protected */ /* CompleteClass */
  var power: Double = js.native
}
