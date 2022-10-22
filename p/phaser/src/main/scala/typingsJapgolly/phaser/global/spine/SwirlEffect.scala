package typingsJapgolly.phaser.global.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.SwirlEffect")
@js.native
open class SwirlEffect protected ()
  extends StObject
     with typingsJapgolly.phaser.spine.SwirlEffect {
  def this(radius: Double) = this()
  
  /* CompleteClass */
  var angle: Double = js.native
  
  /* CompleteClass */
  override def begin(skeleton: typingsJapgolly.phaser.spine.Skeleton): Unit = js.native
  
  /* CompleteClass */
  var centerX: Double = js.native
  
  /* CompleteClass */
  var centerY: Double = js.native
  
  /* CompleteClass */
  override def end(): Unit = js.native
  
  /* CompleteClass */
  var radius: Double = js.native
  
  /* CompleteClass */
  override def transform(
    position: typingsJapgolly.phaser.spine.Vector2,
    uv: typingsJapgolly.phaser.spine.Vector2,
    light: typingsJapgolly.phaser.spine.Color,
    dark: typingsJapgolly.phaser.spine.Color
  ): Unit = js.native
  
  /* private */ /* CompleteClass */
  var worldX: Any = js.native
  
  /* private */ /* CompleteClass */
  var worldY: Any = js.native
}
object SwirlEffect {
  
  @JSGlobal("spine.SwirlEffect")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("spine.SwirlEffect.interpolation")
  @js.native
  def interpolation: typingsJapgolly.phaser.spine.PowOut = js.native
  inline def interpolation_=(x: typingsJapgolly.phaser.spine.PowOut): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("interpolation")(x.asInstanceOf[js.Any])
}
