package typingsJapgolly.phaser.global.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.Vector2")
@js.native
open class Vector2 ()
  extends StObject
     with typingsJapgolly.phaser.spine.Vector2 {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Unit, y: Double) = this()
  
  /* CompleteClass */
  override def length(): Double = js.native
  
  /* CompleteClass */
  override def normalize(): this.type = js.native
  
  /* CompleteClass */
  override def set(x: Double, y: Double): typingsJapgolly.phaser.spine.Vector2 = js.native
  
  /* CompleteClass */
  var x: Double = js.native
  
  /* CompleteClass */
  var y: Double = js.native
}
