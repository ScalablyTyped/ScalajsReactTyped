package typingsJapgolly.three

import typingsJapgolly.three.animationActionMod.AnimationAction
import typingsJapgolly.three.animationClipMod.AnimationClip
import typingsJapgolly.three.eventDispatcherMod.EventDispatcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/animation/AnimationMixer", JSImport.Namespace)
@js.native
object animationMixerMod extends js.Object {
  @js.native
  class AnimationMixer protected () extends EventDispatcher {
    def this(root: js.Any) = this()
    var time: Double = js.native
    var timeScale: Double = js.native
    def clipAction(clip: AnimationClip): AnimationAction = js.native
    def clipAction(clip: AnimationClip, root: js.Any): AnimationAction = js.native
    def existingAction(clip: AnimationClip): AnimationAction = js.native
    def existingAction(clip: AnimationClip, root: js.Any): AnimationAction = js.native
    def getRoot(): js.Any = js.native
    def setTime(timeInSeconds: Double): AnimationMixer = js.native
    def stopAllAction(): AnimationMixer = js.native
    def uncacheAction(clip: AnimationClip): Unit = js.native
    def uncacheAction(clip: AnimationClip, root: js.Any): Unit = js.native
    def uncacheClip(clip: AnimationClip): Unit = js.native
    def uncacheRoot(root: js.Any): Unit = js.native
    def update(deltaTime: Double): AnimationMixer = js.native
  }
  
}

