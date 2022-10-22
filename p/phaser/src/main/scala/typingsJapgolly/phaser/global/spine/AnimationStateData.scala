package typingsJapgolly.phaser.global.spine

import typingsJapgolly.phaser.spine.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.AnimationStateData")
@js.native
open class AnimationStateData protected ()
  extends StObject
     with typingsJapgolly.phaser.spine.AnimationStateData {
  def this(skeletonData: typingsJapgolly.phaser.spine.SkeletonData) = this()
  
  /* CompleteClass */
  var animationToMixTime: Map[Double] = js.native
  
  /* CompleteClass */
  var defaultMix: Double = js.native
  
  /* CompleteClass */
  override def getMix(from: typingsJapgolly.phaser.spine.Animation, to: typingsJapgolly.phaser.spine.Animation): Double = js.native
  
  /* CompleteClass */
  override def setMix(fromName: String, toName: String, duration: Double): Unit = js.native
  
  /* CompleteClass */
  override def setMixWith(
    from: typingsJapgolly.phaser.spine.Animation,
    to: typingsJapgolly.phaser.spine.Animation,
    duration: Double
  ): Unit = js.native
  
  /* CompleteClass */
  var skeletonData: typingsJapgolly.phaser.spine.SkeletonData = js.native
}
