package typingsJapgolly.phaser.global.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.JitterEffect")
@js.native
open class JitterEffect protected ()
  extends StObject
     with typingsJapgolly.phaser.spine.JitterEffect {
  def this(jitterX: Double, jitterY: Double) = this()
  
  /* CompleteClass */
  override def begin(skeleton: typingsJapgolly.phaser.spine.Skeleton): Unit = js.native
  
  /* CompleteClass */
  override def end(): Unit = js.native
  
  /* CompleteClass */
  var jitterX: Double = js.native
  
  /* CompleteClass */
  var jitterY: Double = js.native
  
  /* CompleteClass */
  override def transform(
    position: typingsJapgolly.phaser.spine.Vector2,
    uv: typingsJapgolly.phaser.spine.Vector2,
    light: typingsJapgolly.phaser.spine.Color,
    dark: typingsJapgolly.phaser.spine.Color
  ): Unit = js.native
}
